package org.apache.avro;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;

public class ISW2SchemaC4LLMTest {

  @Test
  public void primitiveFactoriesExposeTypeNameAndNullability() {
    for (Schema.Type type : Arrays.asList(
        Schema.Type.STRING, Schema.Type.BYTES, Schema.Type.INT, Schema.Type.LONG,
        Schema.Type.FLOAT, Schema.Type.DOUBLE, Schema.Type.BOOLEAN, Schema.Type.NULL)) {
      Schema schema = Schema.create(type);
      assertEquals(type, schema.getType());
      assertEquals(type.getName(), schema.getName());
      assertEquals(type == Schema.Type.NULL, schema.isNullable());
      assertFalse(schema.isUnion());
    }
  }

  @Test(expected = AvroRuntimeException.class)
  public void primitiveFactoryRejectsNonPrimitiveType() {
    Schema.create(Schema.Type.RECORD);
  }

  @Test
  public void arrayAndMapRetainTheirComponentSchemas() {
    Schema stringSchema = Schema.create(Schema.Type.STRING);
    Schema longSchema = Schema.create(Schema.Type.LONG);
    Schema array = Schema.createArray(stringSchema);
    Schema map = Schema.createMap(longSchema);

    assertEquals(Schema.Type.ARRAY, array.getType());
    assertSame(stringSchema, array.getElementType());
    assertEquals(Schema.Type.MAP, map.getType());
    assertSame(longSchema, map.getValueType());
  }

  @Test
  public void unionExposesBranchesIndexesAndNullableState() {
    Schema nullSchema = Schema.create(Schema.Type.NULL);
    Schema stringSchema = Schema.create(Schema.Type.STRING);
    Schema union = Schema.createUnion(nullSchema, stringSchema);

    assertTrue(union.isUnion());
    assertTrue(union.isNullable());
    assertEquals(Arrays.asList(nullSchema, stringSchema), union.getTypes());
    assertEquals(Integer.valueOf(0), union.getIndexNamed("null"));
    assertEquals(Integer.valueOf(1), union.getIndexNamed("string"));
    assertNull(union.getIndexNamed("missing"));
  }

  @Test(expected = AvroRuntimeException.class)
  public void unionRejectsDuplicateBranches() {
    Schema.createUnion(Schema.create(Schema.Type.INT), Schema.create(Schema.Type.INT));
  }

  @Test(expected = AvroRuntimeException.class)
  public void unionRejectsNestedUnion() {
    Schema inner = Schema.createUnion(
        Schema.create(Schema.Type.NULL), Schema.create(Schema.Type.STRING));
    Schema.createUnion(inner, Schema.create(Schema.Type.INT));
  }

  @Test(expected = AvroRuntimeException.class)
  public void unionRejectsProperties() {
    Schema union = Schema.createUnion(
        Schema.create(Schema.Type.NULL), Schema.create(Schema.Type.STRING));
    union.addProp("custom", "value");
  }

  @Test
  public void namedRecordExposesIdentityDocumentationAndErrorFlag() {
    Schema record = Schema.createRecord("Message", "record doc", "example.avro", true,
        Collections.<Schema.Field>emptyList());

    assertEquals(Schema.Type.RECORD, record.getType());
    assertEquals("Message", record.getName());
    assertEquals("example.avro", record.getNamespace());
    assertEquals("example.avro.Message", record.getFullName());
    assertEquals("record doc", record.getDoc());
    assertTrue(record.isError());
    assertTrue(record.hasFields());
  }

  @Test
  public void recordFieldsReceivePositionsAndSupportLookup() {
    Schema.Field first = new Schema.Field("id", Schema.create(Schema.Type.LONG), "identifier");
    Schema.Field second = new Schema.Field("active", Schema.create(Schema.Type.BOOLEAN));
    Schema record = Schema.createRecord("Item", null, "example", false,
        Arrays.asList(first, second));

    assertEquals(0, first.pos());
    assertEquals(1, second.pos());
    assertSame(first, record.getField("id"));
    assertSame(second, record.getField("active"));
    assertNull(record.getField("absent"));
    assertEquals(Arrays.asList(first, second), record.getFields());
  }

  @Test(expected = AvroRuntimeException.class)
  public void recordFieldsMayOnlyBeSetOnce() {
    Schema record = Schema.createRecord("Once", null, null, false);
    record.setFields(Collections.<Schema.Field>emptyList());
    record.setFields(Collections.<Schema.Field>emptyList());
  }

  @Test(expected = AvroRuntimeException.class)
  public void recordRejectsDuplicateFieldNames() {
    Schema.Field one = new Schema.Field("value", Schema.create(Schema.Type.INT));
    Schema.Field two = new Schema.Field("value", Schema.create(Schema.Type.STRING));
    Schema.createRecord("Duplicate", null, null, false, Arrays.asList(one, two));
  }

  @Test(expected = AvroRuntimeException.class)
  public void fieldCannotBeReusedAcrossRecords() {
    Schema.Field field = new Schema.Field("value", Schema.create(Schema.Type.INT));
    Schema.createRecord("First", null, null, false, Collections.singletonList(field));
    Schema.createRecord("Second", null, null, false, Collections.singletonList(field));
  }

  @Test
  public void fieldExposesMetadataDefaultOrderAndAliases() {
    Schema.Field field = new Schema.Field("count", Schema.create(Schema.Type.INT),
        "number of items", Integer.valueOf(7), Schema.Field.Order.DESCENDING);
    field.addAlias("total");

    assertEquals("count", field.name());
    assertEquals(Schema.Type.INT, field.schema().getType());
    assertEquals("number of items", field.doc());
    assertTrue(field.hasDefaultValue());
    assertEquals(Integer.valueOf(7), field.defaultVal());
    assertEquals(Schema.Field.Order.DESCENDING, field.order());
    assertEquals(Collections.singleton("total"), field.aliases());
  }

  @Test
  public void nullDefaultIsDistinguishedFromAbsentDefault() {
    Schema nullSchema = Schema.create(Schema.Type.NULL);
    Schema.Field absent = new Schema.Field("absent", nullSchema);
    Schema.Field explicit = new Schema.Field("explicit", nullSchema, null,
        Schema.Field.NULL_DEFAULT_VALUE);

    assertFalse(absent.hasDefaultValue());
    assertNull(absent.defaultVal());
    assertTrue(explicit.hasDefaultValue());
    assertNull(explicit.defaultVal());
  }

  @Test(expected = AvroTypeException.class)
  public void fieldRejectsDefaultThatDoesNotMatchSchema() {
    new Schema.Field("age", Schema.create(Schema.Type.INT), null, "not-an-integer");
  }

  @Test
  public void enumExposesSymbolsOrdinalsMembershipAndDefault() {
    Schema schema = Schema.createEnum("Color", "colors", "example",
        Arrays.asList("RED", "GREEN", "BLUE"), "GREEN");

    assertEquals(Arrays.asList("RED", "GREEN", "BLUE"), schema.getEnumSymbols());
    assertEquals(0, schema.getEnumOrdinal("RED"));
    assertEquals(2, schema.getEnumOrdinal("BLUE"));
    assertTrue(schema.hasEnumSymbol("GREEN"));
    assertFalse(schema.hasEnumSymbol("PURPLE"));
    assertEquals("GREEN", schema.getEnumDefault());
  }

  @Test(expected = SchemaParseException.class)
  public void enumRejectsDuplicateSymbols() {
    Schema.createEnum("BadEnum", null, null, Arrays.asList("A", "A"));
  }

  @Test(expected = SchemaParseException.class)
  public void enumRejectsDefaultOutsideSymbolSet() {
    Schema.createEnum("BadDefault", null, null, Arrays.asList("A", "B"), "C");
  }

  @Test
  public void fixedSchemaExposesNameSizeAndAliases() {
    Schema fixed = Schema.createFixed("Digest", "binary digest", "example", 16);
    fixed.addAlias("OldDigest");
    fixed.addAlias("LegacyDigest", "legacy");

    assertEquals(Schema.Type.FIXED, fixed.getType());
    assertEquals(16, fixed.getFixedSize());
    assertEquals("example.Digest", fixed.getFullName());
    assertTrue(fixed.getAliases().contains("example.OldDigest"));
    assertTrue(fixed.getAliases().contains("legacy.LegacyDigest"));
  }

  @Test
  public void parserBuildsRecordAndRetainsNamedType() {
    String json = "{\"type\":\"record\",\"name\":\"User\","
        + "\"namespace\":\"example\",\"fields\":["
        + "{\"name\":\"name\",\"type\":\"string\"}]}";
    Schema.Parser parser = new Schema.Parser();
    Schema record = parser.parse(json);

    assertEquals("example.User", record.getFullName());
    assertEquals(Schema.Type.STRING, record.getField("name").schema().getType());
    assertSame(record, parser.getTypes().get("example.User"));
    assertTrue(parser.getValidateDefaults());
  }

  @Test(expected = SchemaParseException.class)
  public void parserRejectsDanglingContentForStringInput() {
    new Schema.Parser().parse("\"string\" trailing");
  }

  @Test
  public void parserLeavesInputStreamOpen() throws Exception {
    final class ObservableStream extends ByteArrayInputStream {
      private boolean closed;
      ObservableStream(byte[] bytes) { super(bytes); }
      @Override public void close() { closed = true; }
    }
    ObservableStream stream = new ObservableStream("\"long\"".getBytes(StandardCharsets.UTF_8));
    Schema parsed = new Schema.Parser().parse(stream);

    assertEquals(Schema.Type.LONG, parsed.getType());
    assertFalse(stream.closed);
  }

  @Test
  public void serializationRoundTripThroughParserPreservesSchema() {
    Schema original = Schema.createArray(Schema.createMap(Schema.create(Schema.Type.STRING)));
    Schema parsed = new Schema.Parser().parse(original.toString());

    assertEquals(original, parsed);
    assertEquals(original.hashCode(), parsed.hashCode());
  }

  @Test
  public void customPropertyAffectsEqualityAndIsRendered() {
    Schema plain = Schema.create(Schema.Type.STRING);
    Schema decorated = Schema.create(Schema.Type.STRING);
    decorated.addProp("custom", "value");

    assertNotEquals(plain, decorated);
    assertEquals("value", decorated.getProp("custom"));
    assertTrue(decorated.toString().contains("\"custom\":\"value\""));
  }

  @Test
  public void applyAliasesRewritesWriterRecordAndFieldNames() {
    Schema writer = Schema.createRecord("OldRecord", null, "example", false,
        Collections.singletonList(new Schema.Field("oldField", Schema.create(Schema.Type.INT))));
    Schema.Field readerField = new Schema.Field("newField", Schema.create(Schema.Type.INT));
    readerField.addAlias("oldField");
    Schema reader = Schema.createRecord("NewRecord", null, "example", false,
        Collections.singletonList(readerField));
    reader.addAlias("OldRecord");

    Schema rewritten = Schema.applyAliases(writer, reader);

    assertEquals("example.NewRecord", rewritten.getFullName());
    assertNull(rewritten.getField("oldField"));
    assertEquals(Schema.Type.INT, rewritten.getField("newField").schema().getType());
  }

  @Test
  public void seenPairUsesObjectIdentityRatherThanLogicalEquality() {
    Schema first = Schema.create(Schema.Type.INT);
    Schema equalButDistinct = Schema.create(Schema.Type.INT);
    Object right = new Object();

    assertEquals(new Schema.SeenPair(first, right), new Schema.SeenPair(first, right));
    assertNotEquals(new Schema.SeenPair(first, right), new Schema.SeenPair(equalButDistinct, right));
  }
}
