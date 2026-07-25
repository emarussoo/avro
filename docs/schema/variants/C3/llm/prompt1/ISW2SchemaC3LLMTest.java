package org.apache.avro;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

import org.apache.avro.Schema.Field;
import org.apache.avro.Schema.Type;
import org.junit.Test;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.BooleanNode;
import com.fasterxml.jackson.databind.node.IntNode;
import com.fasterxml.jackson.databind.node.LongNode;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.TextNode;

public class ISW2SchemaC3LLMTest {

  @Test
  public void primitiveFactoriesExposeTypeNameAndNullability() {
    for (Type type : Arrays.asList(Type.STRING, Type.BYTES, Type.INT, Type.LONG,
        Type.FLOAT, Type.DOUBLE, Type.BOOLEAN, Type.NULL)) {
      Schema schema = Schema.create(type);
      assertEquals(type, schema.getType());
      assertEquals(type.getName(), schema.getName());
      assertEquals(type == Type.NULL, schema.isNullable());
      assertFalse(schema.isUnion());
    }
  }

  @Test
  public void primitiveFactoryRejectsNonPrimitiveType() {
    try {
      Schema.create(Type.RECORD);
      fail("A record cannot be created by the primitive factory");
    } catch (AvroRuntimeException expected) {
      assertTrue(expected.getMessage().contains("Can't create"));
    }
  }

  @Test
  public void arrayAndMapExposeTheirComponentSchemas() {
    Schema stringSchema = Schema.create(Type.STRING);
    Schema longSchema = Schema.create(Type.LONG);
    Schema array = Schema.createArray(stringSchema);
    Schema map = Schema.createMap(longSchema);

    assertEquals(Type.ARRAY, array.getType());
    assertSame(stringSchema, array.getElementType());
    assertEquals(Type.MAP, map.getType());
    assertSame(longSchema, map.getValueType());
  }

  @Test
  public void unionPreservesBranchOrderAndSupportsNameLookup() {
    Schema named = Schema.createFixed("Token", "token doc", "example.ns", 8);
    Schema union = Schema.createUnion(Schema.create(Type.NULL), named,
        Schema.create(Type.STRING));

    assertTrue(union.isUnion());
    assertTrue(union.isNullable());
    assertEquals(Arrays.asList(Type.NULL, Type.FIXED, Type.STRING),
        Arrays.asList(union.getTypes().get(0).getType(),
            union.getTypes().get(1).getType(), union.getTypes().get(2).getType()));
    assertEquals(Integer.valueOf(0), union.getIndexNamed("null"));
    assertEquals(Integer.valueOf(1), union.getIndexNamed("example.ns.Token"));
    assertEquals(Integer.valueOf(2), union.getIndexNamed("string"));
    assertNull(union.getIndexNamed("missing"));
  }

  @Test
  public void unionRejectsDuplicateAndNestedBranches() {
    try {
      Schema.createUnion(Schema.create(Type.STRING), Schema.create(Type.STRING));
      fail("Duplicate union branches must be rejected");
    } catch (AvroRuntimeException expected) {
      assertTrue(expected.getMessage().contains("Duplicate in union"));
    }

    Schema inner = Schema.createUnion(Schema.create(Type.NULL), Schema.create(Type.INT));
    try {
      Schema.createUnion(inner, Schema.create(Type.STRING));
      fail("Nested unions must be rejected");
    } catch (AvroRuntimeException expected) {
      assertTrue(expected.getMessage().contains("Nested union"));
    }
  }

  @Test
  public void namedFixedSchemaExposesIdentityDocumentationAliasesAndSize() {
    Schema fixed = Schema.createFixed("Digest", "binary digest", "example.crypto", 16);
    fixed.addAlias("OldDigest");
    fixed.addAlias("LegacyDigest", "legacy.ns");

    assertEquals(Type.FIXED, fixed.getType());
    assertEquals("Digest", fixed.getName());
    assertEquals("example.crypto", fixed.getNamespace());
    assertEquals("example.crypto.Digest", fixed.getFullName());
    assertEquals("binary digest", fixed.getDoc());
    assertEquals(16, fixed.getFixedSize());
    assertTrue(fixed.getAliases().contains("example.crypto.OldDigest"));
    assertTrue(fixed.getAliases().contains("legacy.ns.LegacyDigest"));
  }

  @Test
  public void enumExposesSymbolsOrdinalsMembershipAndDefault() {
    Schema schema = Schema.createEnum("Status", "state", "example",
        Arrays.asList("NEW", "DONE"), "NEW");

    assertEquals(Arrays.asList("NEW", "DONE"), schema.getEnumSymbols());
    assertEquals("NEW", schema.getEnumDefault());
    assertTrue(schema.hasEnumSymbol("DONE"));
    assertFalse(schema.hasEnumSymbol("UNKNOWN"));
    assertEquals(0, schema.getEnumOrdinal("NEW"));
    assertEquals(1, schema.getEnumOrdinal("DONE"));
  }

  @Test
  public void enumRejectsDuplicateSymbolsAndUnknownDefault() {
    try {
      Schema.createEnum("Duplicate", null, "example", Arrays.asList("A", "A"));
      fail("Duplicate symbols must be rejected");
    } catch (SchemaParseException expected) {
      assertTrue(expected.getMessage().contains("Duplicate enum symbol"));
    }

    try {
      Schema.createEnum("BadDefault", null, "example", Arrays.asList("A", "B"), "C");
      fail("An enum default must be one of its symbols");
    } catch (SchemaParseException expected) {
      assertTrue(expected.getMessage().contains("not in the enum symbol set"));
    }
  }

  @Test
  public void recordAssignsFieldPositionsAndSupportsLookup() {
    Field id = new Field("id", Schema.create(Type.LONG), "identifier");
    Field active = new Field("active", Schema.create(Type.BOOLEAN), null, true,
        Field.Order.DESCENDING);
    Schema record = Schema.createRecord("User", "user doc", "example", false,
        Arrays.asList(id, active));

    assertTrue(record.hasFields());
    assertEquals(2, record.getFields().size());
    assertSame(id, record.getField("id"));
    assertSame(active, record.getField("active"));
    assertNull(record.getField("missing"));
    assertEquals(0, id.pos());
    assertEquals(1, active.pos());
    assertFalse(record.isError());
    assertEquals(Boolean.TRUE, active.defaultVal());
    assertEquals(Field.Order.DESCENDING, active.order());
  }

  @Test
  public void unsetRecordFieldsFailUntilSetAndCanOnlyBeSetOnce() {
    Schema record = Schema.createRecord("Node", null, "example", false);
    assertFalse(record.hasFields());
    try {
      record.getFields();
      fail("Unset fields must not be readable");
    } catch (AvroRuntimeException expected) {
      assertTrue(expected.getMessage().contains("not set yet"));
    }

    record.setFields(Collections.singletonList(
        new Field("value", Schema.create(Type.INT))));
    assertTrue(record.hasFields());
    try {
      record.setFields(Collections.<Field>emptyList());
      fail("Fields may only be set once");
    } catch (AvroRuntimeException expected) {
      assertTrue(expected.getMessage().contains("already set"));
    }
  }

  @Test
  public void recordRejectsDuplicateFieldNames() {
    Schema record = Schema.createRecord("DuplicateFields", null, "example", false);
    try {
      record.setFields(Arrays.asList(
          new Field("value", Schema.create(Type.INT)),
          new Field("value", Schema.create(Type.STRING))));
      fail("Duplicate field names must be rejected");
    } catch (AvroRuntimeException expected) {
      assertTrue(expected.getMessage().contains("Duplicate field value"));
    }
  }

  @Test
  public void fieldExposesMetadataDefaultAndAliases() {
    Field field = new Field("count", Schema.create(Type.INT), "item count", 3,
        Field.Order.IGNORE);
    field.addAlias("legacyCount");

    assertEquals("count", field.name());
    assertEquals(Type.INT, field.schema().getType());
    assertEquals("item count", field.doc());
    assertTrue(field.hasDefaultValue());
    assertEquals(Integer.valueOf(3), field.defaultVal());
    assertEquals(Field.Order.IGNORE, field.order());
    assertEquals(Collections.singleton("legacyCount"), field.aliases());
  }

  @Test
  public void fieldDistinguishesAbsentDefaultFromExplicitNullDefault() {
    Schema nullable = Schema.createUnion(Schema.create(Type.NULL), Schema.create(Type.STRING));
    Field absent = new Field("absent", nullable);
    Field explicitNull = new Field("explicitNull", nullable, null,
        Field.NULL_DEFAULT_VALUE);

    assertFalse(absent.hasDefaultValue());
    assertNull(absent.defaultVal());
    assertTrue(explicitNull.hasDefaultValue());
    assertNull(explicitNull.defaultVal());
  }

  @Test
  public void invalidFieldDefaultIsRejectedWithAvroTypeException() {
    try {
      new Field("count", Schema.create(Type.INT), null, "not-an-integer");
      fail("A string is not a valid int default");
    } catch (AvroTypeException expected) {
      assertTrue(expected.getMessage().contains("Invalid default for field count"));
    }
  }

  @Test
  public void validDefaultChecksCoverPrimitiveAndContainerBoundaries() {
    Schema intSchema = Schema.create(Type.INT);
    assertTrue(intSchema.isValidDefault(IntNode.valueOf(Integer.MAX_VALUE)));
    assertFalse(intSchema.isValidDefault(LongNode.valueOf((long) Integer.MAX_VALUE + 1L)));
    assertFalse(intSchema.isValidDefault(TextNode.valueOf("1")));

    ArrayNode values = Schema.MAPPER.createArrayNode();
    values.add(1).add(2);
    Schema intArray = Schema.createArray(intSchema);
    assertTrue(intArray.isValidDefault(values));
    values.add("bad");
    assertFalse(intArray.isValidDefault(values));

    ObjectNode mapValue = Schema.MAPPER.createObjectNode();
    mapValue.put("enabled", true);
    assertTrue(Schema.createMap(Schema.create(Type.BOOLEAN)).isValidDefault(mapValue));
    assertTrue(Schema.create(Type.NULL).isValidDefault(NullNode.getInstance()));
    assertTrue(Schema.create(Type.BOOLEAN).isValidDefault(BooleanNode.TRUE));
  }

  @Test
  public void parserBuildsNamedRecordAndRetainsNamedTypes() {
    String json = "{\"type\":\"record\",\"name\":\"User\","
        + "\"namespace\":\"example\",\"fields\":["
        + "{\"name\":\"id\",\"type\":\"long\"}]}";
    Schema.Parser parser = new Schema.Parser();
    Schema record = parser.parse(json);
    Map<String, Schema> knownTypes = parser.getTypes();

    assertEquals("example.User", record.getFullName());
    assertEquals(Type.LONG, record.getField("id").schema().getType());
    assertSame(record, knownTypes.get("example.User"));
  }

  @Test
  public void parserConcatenatesFragmentsAndRejectsDanglingContent() {
    Schema parsed = new Schema.Parser().parse("{\"type\":", "\"array\",",
        "\"items\":\"string\"}");
    assertEquals(Type.STRING, parsed.getElementType().getType());

    try {
      new Schema.Parser().parse("\"int\" trailing");
      fail("Dangling content must be rejected for string input");
    } catch (SchemaParseException expected) {
      assertTrue(expected.getMessage().contains("dangling content"));
    }
  }

  @Test
  public void parserLeavesInputStreamOpen() throws Exception {
    final class ObservableInputStream extends ByteArrayInputStream {
      private boolean closed;
      ObservableInputStream(byte[] bytes) { super(bytes); }
      @Override public void close() { closed = true; }
    }
    ObservableInputStream input = new ObservableInputStream(
        "\"string\"".getBytes(StandardCharsets.UTF_8));

    Schema parsed = new Schema.Parser().parse(input);

    assertEquals(Type.STRING, parsed.getType());
    assertFalse(input.closed);
  }

  @Test
  public void parserDefaultValidationSettingControlsInvalidDefaults() {
    String json = "{\"type\":\"record\",\"name\":\"Configured\","
        + "\"fields\":[{\"name\":\"count\",\"type\":\"int\","
        + "\"default\":\"bad\"}]}";
    Schema.Parser validating = new Schema.Parser().setValidateDefaults(true);
    assertTrue(validating.getValidateDefaults());
    try {
      validating.parse(json);
      fail("Invalid defaults must fail when validation is enabled");
    } catch (AvroTypeException expected) {
      assertTrue(expected.getMessage().contains("Invalid default"));
    }

    Schema.Parser lenient = new Schema.Parser().setValidateDefaults(false);
    assertFalse(lenient.getValidateDefaults());
    Schema parsed = lenient.parse(json);
    assertEquals("bad", parsed.getField("count").defaultVal());
  }

  @Test
  public void schemaPropertiesParticipateInEqualityAndCannotBeOverwritten() {
    Schema left = Schema.create(Type.STRING);
    Schema right = Schema.create(Type.STRING);
    assertEquals(left, right);

    left.addProp("format", "plain");
    assertFalse(left.equals(right));
    right.addProp("format", "plain");
    assertEquals(left, right);
    assertEquals("plain", left.getProp("format"));

    try {
      left.addProp("format", "changed");
      fail("An existing property cannot be replaced with a different value");
    } catch (AvroRuntimeException expected) {
      assertNotNull(expected.getMessage());
    }
  }

  @Test
  public void unionRejectsProperties() {
    Schema union = Schema.createUnion(Schema.create(Type.NULL), Schema.create(Type.STRING));
    try {
      union.addProp("custom", "value");
      fail("Union properties are forbidden");
    } catch (AvroRuntimeException expected) {
      assertTrue(expected.getMessage().contains("Can't set properties on a union"));
    }
  }

  @Test
  public void applyAliasesRewritesRecordAndFieldNamesFromReaderAliases() {
    Schema writer = Schema.createRecord("OldUser", null, "legacy", false,
        Collections.singletonList(new Field("oldId", Schema.create(Type.LONG))));

    Field readerField = new Field("id", Schema.create(Type.LONG));
    readerField.addAlias("oldId");
    Schema reader = Schema.createRecord("User", null, "current", false,
        Collections.singletonList(readerField));
    reader.addAlias("OldUser", "legacy");

    Schema rewritten = Schema.applyAliases(writer, reader);

    assertEquals("current.User", rewritten.getFullName());
    assertNull(rewritten.getField("oldId"));
    assertNotNull(rewritten.getField("id"));
    assertEquals(Type.LONG, rewritten.getField("id").schema().getType());
  }

  @Test
  public void jsonRenderingRoundTripsRepresentativeSchema() {
    Schema original = Schema.createRecord("Container", "doc", "example", false,
        Arrays.asList(
            new Field("names", Schema.createArray(Schema.create(Type.STRING))),
            new Field("attributes", Schema.createMap(Schema.create(Type.LONG)))));

    String json = original.toString();
    Schema reparsed = new Schema.Parser().parse(json);

    assertEquals(original, reparsed);
    assertEquals("example.Container", reparsed.getFullName());
  }
}
