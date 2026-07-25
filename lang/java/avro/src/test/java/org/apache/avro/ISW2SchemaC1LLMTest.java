package org.apache.avro;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.IntNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.TextNode;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import org.apache.avro.path.TracingAvroTypeException;
import org.junit.Test;

public class ISW2SchemaC1LLMTest {

  @Test
  public void primitiveFactoryExposesTypeNameAndNullability() {
    for (Schema.Type type : Arrays.asList(Schema.Type.STRING, Schema.Type.BYTES, Schema.Type.INT, Schema.Type.LONG,
        Schema.Type.FLOAT, Schema.Type.DOUBLE, Schema.Type.BOOLEAN, Schema.Type.NULL)) {
      Schema schema = Schema.create(type);
      assertEquals(type, schema.getType());
      assertEquals(type.getName(), schema.getName());
      assertEquals(type == Schema.Type.NULL, schema.isNullable());
      assertFalse(schema.isUnion());
    }
  }

  @Test
  public void primitiveFactoryRejectsNonPrimitiveType() {
    try {
      Schema.create(Schema.Type.RECORD);
      fail("Expected AvroRuntimeException");
    } catch (AvroRuntimeException expected) {
      assertTrue(expected.getMessage().contains("Can't create"));
    }
  }

  @Test
  public void arrayAndMapExposeTheirComponentSchemas() {
    Schema element = Schema.create(Schema.Type.LONG);
    Schema array = Schema.createArray(element);
    Schema map = Schema.createMap(array);

    assertEquals(Schema.Type.ARRAY, array.getType());
    assertSame(element, array.getElementType());
    assertEquals(Schema.Type.MAP, map.getType());
    assertSame(array, map.getValueType());
  }

  @Test
  public void recordFieldsAreAssignedPositionsAndLookedUpByName() {
    Schema.Field first = new Schema.Field("id", Schema.create(Schema.Type.LONG), "identifier");
    Schema.Field second = new Schema.Field("active", Schema.create(Schema.Type.BOOLEAN));
    Schema record = Schema.createRecord("Account", "account record", "example.avro", false,
        Arrays.asList(first, second));

    assertEquals("Account", record.getName());
    assertEquals("example.avro", record.getNamespace());
    assertEquals("example.avro.Account", record.getFullName());
    assertEquals("account record", record.getDoc());
    assertTrue(record.hasFields());
    assertFalse(record.isError());
    assertEquals(0, first.pos());
    assertEquals(1, second.pos());
    assertSame(second, record.getField("active"));
    assertNull(record.getField("missing"));
    assertEquals(Arrays.asList(first, second), record.getFields());
  }

  @Test
  public void unsetRecordRejectsFieldAccessAndAllowsExactlyOneSet() {
    Schema record = Schema.createRecord("Node", null, "example.avro", false);
    assertFalse(record.hasFields());

    try {
      record.getFields();
      fail("Expected AvroRuntimeException for unset fields");
    } catch (AvroRuntimeException expected) {
      assertTrue(expected.getMessage().contains("not set"));
    }

    record.setFields(Collections.<Schema.Field>emptyList());
    assertTrue(record.hasFields());
    assertTrue(record.getFields().isEmpty());
    try {
      record.setFields(Collections.<Schema.Field>emptyList());
      fail("Expected AvroRuntimeException for setting fields twice");
    } catch (AvroRuntimeException expected) {
      assertTrue(expected.getMessage().contains("already set"));
    }
  }

  @Test
  public void recordRejectsDuplicateFieldNames() {
    Schema.Field first = new Schema.Field("value", Schema.create(Schema.Type.INT));
    Schema.Field duplicate = new Schema.Field("value", Schema.create(Schema.Type.STRING));
    try {
      Schema.createRecord("Duplicate", null, null, false, Arrays.asList(first, duplicate));
      fail("Expected AvroRuntimeException");
    } catch (AvroRuntimeException expected) {
      assertTrue(expected.getMessage().contains("Duplicate field value"));
    }
  }

  @Test
  public void fieldExposesMetadataDefaultOrderAndAliases() {
    Schema.Field field = new Schema.Field("count", Schema.create(Schema.Type.INT), "number of items", 7,
        Schema.Field.Order.DESCENDING);
    field.addAlias("total");

    assertEquals("count", field.name());
    assertEquals("number of items", field.doc());
    assertEquals(Integer.valueOf(7), field.defaultVal());
    assertTrue(field.hasDefaultValue());
    assertEquals(Schema.Field.Order.DESCENDING, field.order());
    assertTrue(field.aliases().contains("total"));
    try {
      field.aliases().add("other");
      fail("Aliases must be immutable to callers");
    } catch (UnsupportedOperationException expected) {
      assertEquals(1, field.aliases().size());
    }
  }

  @Test
  public void explicitNullDefaultIsDistinguishedFromNoDefault() {
    Schema nullSchema = Schema.create(Schema.Type.NULL);
    Schema.Field absent = new Schema.Field("absent", nullSchema);
    Schema.Field explicit = new Schema.Field("explicit", nullSchema, null, Schema.Field.NULL_DEFAULT_VALUE);

    assertFalse(absent.hasDefaultValue());
    assertNull(absent.defaultVal());
    assertTrue(explicit.hasDefaultValue());
    assertSame(JsonProperties.NULL_VALUE, explicit.defaultVal());
  }

  @Test
  public void invalidFieldDefaultIsRejectedWithAvroTypeException() {
    try {
      new Schema.Field("count", Schema.create(Schema.Type.INT), null, "not-an-integer");
      fail("Expected AvroTypeException");
    } catch (AvroTypeException expected) {
      assertTrue(expected.getMessage().contains("Invalid default for field count"));
    }
  }

  @Test
  public void enumExposesSymbolsOrdinalsMembershipAndDefault() {
    Schema enumeration = Schema.createEnum("Color", "available colors", "example.avro", Arrays.asList("RED", "GREEN"),
        "GREEN");

    assertEquals(Arrays.asList("RED", "GREEN"), enumeration.getEnumSymbols());
    assertTrue(enumeration.hasEnumSymbol("RED"));
    assertFalse(enumeration.hasEnumSymbol("BLUE"));
    assertEquals(0, enumeration.getEnumOrdinal("RED"));
    assertEquals(1, enumeration.getEnumOrdinal("GREEN"));
    assertEquals("GREEN", enumeration.getEnumDefault());
  }

  @Test
  public void enumRejectsDuplicateSymbolsAndUnknownDefault() {
    try {
      Schema.createEnum("Bad", null, null, Arrays.asList("A", "A"));
      fail("Expected SchemaParseException for duplicate symbol");
    } catch (SchemaParseException expected) {
      assertTrue(expected.getMessage().contains("Duplicate enum symbol"));
    }

    try {
      Schema.createEnum("BadDefault", null, null, Arrays.asList("A", "B"), "C");
      fail("Expected SchemaParseException for unknown default");
    } catch (SchemaParseException expected) {
      assertTrue(expected.getMessage().contains("not in the enum symbol set"));
    }
  }

  @Test
  public void enumRejectsOrdinalLookupForUnknownSymbol() {
    Schema enumeration = Schema.createEnum("Choice", null, null, Arrays.asList("YES", "NO"));
    try {
      enumeration.getEnumOrdinal("MAYBE");
      fail("Expected TracingAvroTypeException");
    } catch (TracingAvroTypeException expected) {
      assertNotNull(expected.getCause());
    }
  }

  @Test
  public void unionExposesBranchesIndexesAndNullableStatus() {
    Schema nullSchema = Schema.create(Schema.Type.NULL);
    Schema stringSchema = Schema.create(Schema.Type.STRING);
    Schema union = Schema.createUnion(nullSchema, stringSchema);

    assertTrue(union.isUnion());
    assertTrue(union.isNullable());
    assertEquals(Arrays.asList(nullSchema, stringSchema), union.getTypes());
    assertEquals(Integer.valueOf(0), union.getIndexNamed("null"));
    assertEquals(Integer.valueOf(1), union.getIndexNamed("string"));
    assertNull(union.getIndexNamed("long"));
  }

  @Test
  public void unionRejectsDuplicateAndNestedBranches() {
    try {
      Schema.createUnion(Schema.create(Schema.Type.INT), Schema.create(Schema.Type.INT));
      fail("Expected AvroRuntimeException for duplicate branch");
    } catch (AvroRuntimeException expected) {
      assertTrue(expected.getMessage().contains("Duplicate in union"));
    }

    Schema inner = Schema.createUnion(Schema.create(Schema.Type.NULL), Schema.create(Schema.Type.STRING));
    try {
      Schema.createUnion(inner, Schema.create(Schema.Type.INT));
      fail("Expected AvroRuntimeException for nested union");
    } catch (AvroRuntimeException expected) {
      assertTrue(expected.getMessage().contains("Nested union"));
    }
  }

  @Test
  public void namedSchemaAliasesAreNamespaceQualified() {
    Schema fixed = Schema.createFixed("Token", "opaque token", "example.avro", 16);
    fixed.addAlias("OldToken");
    fixed.addAlias("LegacyToken", "legacy.avro");

    assertEquals(16, fixed.getFixedSize());
    assertTrue(fixed.getAliases().contains("example.avro.OldToken"));
    assertTrue(fixed.getAliases().contains("legacy.avro.LegacyToken"));
    assertEquals(2, fixed.getAliases().size());
  }

  @Test
  public void schemaPropertiesAffectEqualityAndInvalidateCachedHash() {
    Schema left = Schema.create(Schema.Type.STRING);
    Schema right = Schema.create(Schema.Type.STRING);
    assertEquals(left, right);
    assertEquals(left.hashCode(), right.hashCode());

    left.addProp("custom", "value");
    assertNotEquals(left, right);
    right.addProp("custom", "value");
    assertEquals(left, right);
    assertEquals(left.hashCode(), right.hashCode());
  }

  @Test
  public void parserBuildsNestedSchemaAndTracksNamedTypes() {
    String json = "{\"type\":\"record\",\"name\":\"User\",\"namespace\":\"example.avro\","
        + "\"fields\":[{\"name\":\"tags\",\"type\":{\"type\":\"array\",\"items\":\"string\"}}]}";
    Schema.Parser parser = new Schema.Parser();
    Schema parsed = parser.parse(json);

    assertEquals("example.avro.User", parsed.getFullName());
    assertEquals(Schema.Type.ARRAY, parsed.getField("tags").schema().getType());
    assertEquals(Schema.Type.STRING, parsed.getField("tags").schema().getElementType().getType());
    Map<String, Schema> known = parser.getTypes();
    assertSame(parsed, known.get("example.avro.User"));
  }

  @Test
  public void parserRejectsDanglingInputAndMissingRecordFields() {
    Schema.Parser parser = new Schema.Parser();
    try {
      parser.parse("\"string\" trailing");
      fail("Expected SchemaParseException for dangling content");
    } catch (SchemaParseException expected) {
      assertTrue(expected.getMessage().contains("dangling content"));
    }

    try {
      new Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Empty\"}");
      fail("Expected SchemaParseException for missing fields");
    } catch (SchemaParseException expected) {
      assertTrue(expected.getMessage().contains("Record has no fields"));
    }
  }

  @Test
  public void inputStreamParsingLeavesStreamOpen() throws Exception {
    final class TrackingStream extends ByteArrayInputStream {
      private boolean closed;

      TrackingStream(byte[] data) {
        super(data);
      }

      @Override
      public void close() {
        closed = true;
      }
    }
    TrackingStream input = new TrackingStream("\"long\"".getBytes(StandardCharsets.UTF_8));
    Schema parsed = new Schema.Parser().parse(input);

    assertEquals(Schema.Type.LONG, parsed.getType());
    assertFalse(input.closed);
    assertEquals(-1, input.read());
  }

  @Test
  public void validDefaultChecksCoverScalarArrayMapAndRecordShapes() {
    assertTrue(Schema.create(Schema.Type.INT).isValidDefault(IntNode.valueOf(4)));
    assertFalse(Schema.create(Schema.Type.INT).isValidDefault(TextNode.valueOf("4")));

    Schema arraySchema = Schema.createArray(Schema.create(Schema.Type.INT));
    ArrayNode validArray = JsonNodeFactory.instance.arrayNode().add(1).add(2);
    ArrayNode invalidArray = JsonNodeFactory.instance.arrayNode().add(1).add("two");
    assertTrue(arraySchema.isValidDefault(validArray));
    assertFalse(arraySchema.isValidDefault(invalidArray));

    Schema mapSchema = Schema.createMap(Schema.create(Schema.Type.BOOLEAN));
    ObjectNode validMap = JsonNodeFactory.instance.objectNode().put("enabled", true);
    assertTrue(mapSchema.isValidDefault(validMap));
    assertFalse(mapSchema.isValidDefault(validArray));

    Schema.Field required = new Schema.Field("id", Schema.create(Schema.Type.LONG));
    Schema.Field optional = new Schema.Field("note",
        Schema.createUnion(Schema.create(Schema.Type.NULL), Schema.create(Schema.Type.STRING)), null,
        Schema.Field.NULL_DEFAULT_VALUE);
    Schema record = Schema.createRecord("Payload", null, null, false, Arrays.asList(required, optional));
    ObjectNode validRecord = JsonNodeFactory.instance.objectNode().put("id", 9L);
    ObjectNode invalidRecord = JsonNodeFactory.instance.objectNode().set("id", NullNode.getInstance());
    assertTrue(record.isValidDefault(validRecord));
    assertFalse(record.isValidDefault(invalidRecord));
  }

  @Test
  public void jsonRenderingRoundTripsForRecursiveRecord() {
    Schema node = Schema.createRecord("Node", null, "example.avro", false);
    Schema.Field next = new Schema.Field("next", Schema.createUnion(Schema.create(Schema.Type.NULL), node), null,
        Schema.Field.NULL_DEFAULT_VALUE);
    node.setFields(Collections.singletonList(next));

    Schema reparsed = new Schema.Parser().parse(node.toString());
    assertEquals(node, reparsed);
    assertEquals("example.avro.Node", reparsed.getFullName());
    assertEquals("example.avro.Node", reparsed.getField("next").schema().getTypes().get(1).getFullName());
  }

  @Test
  public void applyAliasesRenamesWriterRecordAndFieldFromReaderAliases() {
    Schema writer = Schema.createRecord("OldUser", null, "example.avro", false,
        Collections.singletonList(new Schema.Field("oldId", Schema.create(Schema.Type.LONG))));

    Schema.Field readerField = new Schema.Field("id", Schema.create(Schema.Type.LONG));
    readerField.addAlias("oldId");
    Schema reader = Schema.createRecord("User", null, "example.avro", false, Collections.singletonList(readerField));
    reader.addAlias("OldUser");

    Schema rewritten = Schema.applyAliases(writer, reader);
    assertEquals("example.avro.User", rewritten.getFullName());
    assertNotNull(rewritten.getField("id"));
    assertNull(rewritten.getField("oldId"));
    assertEquals(Schema.Type.LONG, rewritten.getField("id").schema().getType());
  }

  @Test
  public void schemaTypeNamesAreLowerCaseAndStable() {
    assertEquals("record", Schema.Type.RECORD.getName());
    assertEquals("double", Schema.Type.DOUBLE.getName());
  }
}
