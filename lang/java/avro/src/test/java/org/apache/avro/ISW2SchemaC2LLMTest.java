package org.apache.avro;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.avro.path.TracingAvroTypeException;
import org.junit.Test;

public class ISW2SchemaC2LLMTest {

  @Test
  public void primitiveFactoriesExposeTypeAndCanonicalName() {
    Schema.Type[] primitiveTypes = { Schema.Type.STRING, Schema.Type.BYTES, Schema.Type.INT, Schema.Type.LONG,
        Schema.Type.FLOAT, Schema.Type.DOUBLE, Schema.Type.BOOLEAN, Schema.Type.NULL };

    for (Schema.Type type : primitiveTypes) {
      Schema schema = Schema.create(type);
      assertEquals(type, schema.getType());
      assertEquals(type.getName(), schema.getName());
      assertEquals(type.getName(), schema.getFullName());
      assertEquals(type == Schema.Type.NULL, schema.isNullable());
    }
  }

  @Test(expected = AvroRuntimeException.class)
  public void primitiveFactoryRejectsNonPrimitiveType() {
    Schema.create(Schema.Type.RECORD);
  }

  @Test
  public void arrayAndMapExposeTheirComponentSchemas() {
    Schema element = Schema.create(Schema.Type.LONG);
    Schema value = Schema.create(Schema.Type.BOOLEAN);
    Schema array = Schema.createArray(element);
    Schema map = Schema.createMap(value);

    assertEquals(Schema.Type.ARRAY, array.getType());
    assertSame(element, array.getElementType());
    assertEquals(Schema.Type.MAP, map.getType());
    assertSame(value, map.getValueType());
  }

  @Test
  public void recordFactorySetsNamesDocumentationErrorFlagAndFields() {
    Schema.Field id = new Schema.Field("id", Schema.create(Schema.Type.LONG), "identifier");
    Schema.Field active = new Schema.Field("active", Schema.create(Schema.Type.BOOLEAN));
    Schema record = Schema.createRecord("User", "user document", "example.avro", true, Arrays.asList(id, active));

    assertEquals(Schema.Type.RECORD, record.getType());
    assertEquals("User", record.getName());
    assertEquals("example.avro", record.getNamespace());
    assertEquals("example.avro.User", record.getFullName());
    assertEquals("user document", record.getDoc());
    assertTrue(record.isError());
    assertTrue(record.hasFields());
    assertSame(id, record.getField("id"));
    assertSame(active, record.getField("active"));
    assertNull(record.getField("missing"));
    assertEquals(0, id.pos());
    assertEquals(1, active.pos());
  }

  @Test(expected = AvroRuntimeException.class)
  public void recordFieldsCannotBeSetTwice() {
    Schema record = Schema.createRecord("R", null, "example", false);
    record.setFields(Collections.<Schema.Field>emptyList());
    record.setFields(Collections.<Schema.Field>emptyList());
  }

  @Test(expected = AvroRuntimeException.class)
  public void recordRejectsDuplicateFieldNames() {
    Schema record = Schema.createRecord("R", null, "example", false);
    Schema.Field first = new Schema.Field("value", Schema.create(Schema.Type.INT));
    Schema.Field second = new Schema.Field("value", Schema.create(Schema.Type.STRING));
    record.setFields(Arrays.asList(first, second));
  }

  @Test(expected = AvroRuntimeException.class)
  public void fieldCannotBeReusedByAnotherRecord() {
    Schema.Field shared = new Schema.Field("shared", Schema.create(Schema.Type.STRING));
    Schema.createRecord("First", null, "example", false, Collections.singletonList(shared));
    Schema.createRecord("Second", null, "example", false, Collections.singletonList(shared));
  }

  @Test(expected = IllegalStateException.class)
  public void returnedRecordFieldListIsLockedAgainstMutation() {
    Schema record = Schema.createRecord("R", null, "example", false,
        Collections.singletonList(new Schema.Field("x", Schema.create(Schema.Type.INT))));
    record.getFields().add(new Schema.Field("y", Schema.create(Schema.Type.INT)));
  }

  @Test
  public void enumExposesSymbolsOrdinalsMembershipAndDefault() {
    Schema schema = Schema.createEnum("Color", "colors", "example", Arrays.asList("RED", "GREEN"), "GREEN");

    assertEquals(Arrays.asList("RED", "GREEN"), schema.getEnumSymbols());
    assertTrue(schema.hasEnumSymbol("RED"));
    assertFalse(schema.hasEnumSymbol("BLUE"));
    assertEquals(0, schema.getEnumOrdinal("RED"));
    assertEquals(1, schema.getEnumOrdinal("GREEN"));
    assertEquals("GREEN", schema.getEnumDefault());
  }

  @Test(expected = SchemaParseException.class)
  public void enumRejectsDuplicateSymbols() {
    Schema.createEnum("E", null, "example", Arrays.asList("A", "A"));
  }

  @Test(expected = SchemaParseException.class)
  public void enumRejectsDefaultOutsideSymbolSet() {
    Schema.createEnum("E", null, "example", Arrays.asList("A", "B"), "C");
  }

  @Test(expected = TracingAvroTypeException.class)
  public void enumOrdinalRejectsUnknownSymbol() {
    Schema.createEnum("E", null, "example", Collections.singletonList("A")).getEnumOrdinal("MISSING");
  }

  @Test
  public void unionPreservesBranchesIndexesNamesAndNullability() {
    Schema record = Schema.createRecord("Item", null, "example", false, Collections.<Schema.Field>emptyList());
    Schema union = Schema.createUnion(Schema.create(Schema.Type.NULL), Schema.create(Schema.Type.STRING), record);

    assertTrue(union.isUnion());
    assertTrue(union.isNullable());
    assertEquals(3, union.getTypes().size());
    assertEquals(Integer.valueOf(0), union.getIndexNamed("null"));
    assertEquals(Integer.valueOf(1), union.getIndexNamed("string"));
    assertEquals(Integer.valueOf(2), union.getIndexNamed("example.Item"));
    assertNull(union.getIndexNamed("missing"));
  }

  @Test(expected = AvroRuntimeException.class)
  public void unionRejectsDuplicateBranchNames() {
    Schema.createUnion(Schema.create(Schema.Type.STRING), Schema.create(Schema.Type.STRING));
  }

  @Test(expected = AvroRuntimeException.class)
  public void unionRejectsNestedUnion() {
    Schema inner = Schema.createUnion(Schema.create(Schema.Type.INT), Schema.create(Schema.Type.STRING));
    Schema.createUnion(inner, Schema.create(Schema.Type.NULL));
  }

  @Test(expected = AvroRuntimeException.class)
  public void unionRejectsProperties() {
    Schema union = Schema.createUnion(Schema.create(Schema.Type.INT), Schema.create(Schema.Type.STRING));
    union.addProp("custom", "value");
  }

  @Test
  public void fixedSchemaExposesIdentitySizeAndAliases() {
    Schema fixed = Schema.createFixed("Digest", "hash", "example", 16);
    fixed.addAlias("LegacyDigest");
    fixed.addAlias("ExternalDigest", "legacy");

    assertEquals(Schema.Type.FIXED, fixed.getType());
    assertEquals(16, fixed.getFixedSize());
    assertEquals("example.Digest", fixed.getFullName());
    assertEquals("hash", fixed.getDoc());
    assertTrue(fixed.getAliases().contains("example.LegacyDigest"));
    assertTrue(fixed.getAliases().contains("legacy.ExternalDigest"));
  }

  @Test
  public void fieldExposesDefaultOrderDocumentationAndAliases() {
    Schema.Field field = new Schema.Field("count", Schema.create(Schema.Type.INT), "number of items", 7,
        Schema.Field.Order.DESCENDING);
    field.addAlias("legacyCount");

    assertEquals("count", field.name());
    assertEquals(Schema.Type.INT, field.schema().getType());
    assertEquals("number of items", field.doc());
    assertTrue(field.hasDefaultValue());
    assertEquals(Integer.valueOf(7), field.defaultVal());
    assertEquals(Schema.Field.Order.DESCENDING, field.order());
    assertEquals(Collections.singleton("legacyCount"), field.aliases());
  }

  @Test
  public void nullDefaultIsDistinguishedFromAbsentDefault() {
    Schema nullSchema = Schema.create(Schema.Type.NULL);
    Schema.Field absent = new Schema.Field("absent", nullSchema);
    Schema.Field explicit = new Schema.Field("explicit", nullSchema, null, Schema.Field.NULL_DEFAULT_VALUE);

    assertFalse(absent.hasDefaultValue());
    assertNull(absent.defaultVal());
    assertTrue(explicit.hasDefaultValue());
    assertSame(JsonProperties.NULL_VALUE, explicit.defaultVal());
  }

  @Test(expected = AvroTypeException.class)
  public void fieldRejectsDefaultThatDoesNotMatchSchema() {
    new Schema.Field("count", Schema.create(Schema.Type.INT), null, "not-an-int");
  }

  @Test
  public void parserBuildsRecursiveRecordAndRegistersNamedType() {
    String json = "{\"type\":\"record\",\"name\":\"Node\","
        + "\"namespace\":\"example\",\"fields\":[{\"name\":\"next\","
        + "\"type\":[\"null\",\"Node\"],\"default\":null}]}";
    Schema.Parser parser = new Schema.Parser();
    Schema node = parser.parse(json);

    assertEquals("example.Node", node.getFullName());
    Schema next = node.getField("next").schema();
    assertTrue(next.isNullable());
    assertSame(node, next.getTypes().get(1));
    assertSame(node, parser.getTypes().get("example.Node"));
  }

  @Test(expected = SchemaParseException.class)
  public void parserRejectsDanglingContentAfterSchema() {
    new Schema.Parser().parse("\"string\" trailing");
  }

  @Test
  public void parserValidateDefaultsSettingIsFluentAndObservable() {
    Schema.Parser parser = new Schema.Parser();
    assertTrue(parser.getValidateDefaults());
    assertSame(parser, parser.setValidateDefaults(false));
    assertFalse(parser.getValidateDefaults());
  }

  @Test
  public void applyAliasesRewritesRecordAndFieldNamesFromReaderAliases() {
    Schema writer = Schema.createRecord("OldUser", null, "example", false,
        Collections.singletonList(new Schema.Field("oldId", Schema.create(Schema.Type.LONG))));

    Schema.Field readerField = new Schema.Field("id", Schema.create(Schema.Type.LONG));
    readerField.addAlias("oldId");
    Schema reader = Schema.createRecord("User", null, "example", false, Collections.singletonList(readerField));
    reader.addAlias("OldUser");

    Schema rewritten = Schema.applyAliases(writer, reader);

    assertNotSame(writer, rewritten);
    assertEquals("example.User", rewritten.getFullName());
    assertNull(rewritten.getField("oldId"));
    assertEquals("id", rewritten.getField("id").name());
    assertEquals(Schema.Type.LONG, rewritten.getField("id").schema().getType());
  }

  @Test
  public void structurallyEqualSchemasHaveEqualHashCodes() {
    List<Schema.Field> leftFields = Collections.singletonList(new Schema.Field("x", Schema.create(Schema.Type.INT)));
    List<Schema.Field> rightFields = Collections.singletonList(new Schema.Field("x", Schema.create(Schema.Type.INT)));
    Schema left = Schema.createRecord("R", null, "example", false, leftFields);
    Schema right = Schema.createRecord("R", null, "example", false, rightFields);

    assertEquals(left, right);
    assertEquals(left.hashCode(), right.hashCode());
  }

  @Test(expected = AvroRuntimeException.class)
  public void wrongTypeAccessorFailsInsteadOfReturningAnUnrelatedValue() {
    Schema.create(Schema.Type.STRING).getFields();
  }
}
