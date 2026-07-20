package org.apache.avro;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.avro.Schema.Field;
import org.apache.avro.Schema.Type;
import org.apache.avro.path.TracingAvroTypeException;
import org.junit.Test;

public class ISW2SchemaLLMTest {

  @Test
  public void primitiveTypesHaveExpectedTypeAndName() {
    Type[] primitiveTypes = { Type.STRING, Type.BYTES, Type.INT, Type.LONG, Type.FLOAT, Type.DOUBLE, Type.BOOLEAN,
        Type.NULL };

    for (Type type : primitiveTypes) {
      Schema schema = Schema.create(type);
      assertEquals(type, schema.getType());
      assertEquals(type.name().toLowerCase(java.util.Locale.ENGLISH), schema.getName());
      assertEquals(schema.getName(), schema.getFullName());
      assertNull(schema.getDoc());
    }
  }

  @Test
  public void createRejectsNonPrimitiveType() {
    try {
      Schema.create(Type.RECORD);
      fail("A record must not be created by the primitive factory");
    } catch (AvroRuntimeException expected) {
      assertTrue(expected.getMessage().contains("RECORD"));
    }
  }

  @Test
  public void arrayAndMapExposeTheirComponentSchemas() {
    Schema element = Schema.create(Type.LONG);
    Schema value = Schema.create(Type.BOOLEAN);
    Schema array = Schema.createArray(element);
    Schema map = Schema.createMap(value);

    assertEquals(Type.ARRAY, array.getType());
    assertSame(element, array.getElementType());
    assertEquals(Type.MAP, map.getType());
    assertSame(value, map.getValueType());
  }

  @Test
  public void accessorsRejectInapplicableSchemaKinds() {
    Schema string = Schema.create(Type.STRING);

    try {
      string.getFields();
      fail("A primitive schema has no record fields");
    } catch (AvroRuntimeException expected) {
      assertTrue(expected.getMessage().startsWith("Not a record:"));
    }

    try {
      string.getFixedSize();
      fail("A primitive schema has no fixed size");
    } catch (AvroRuntimeException expected) {
      assertTrue(expected.getMessage().startsWith("Not fixed:"));
    }
  }

  @Test
  public void recordMetadataAndFieldsAreExposedInPositionOrder() {
    Field id = new Field("id", Schema.create(Type.LONG), "identifier");
    Field active = new Field("active", Schema.create(Type.BOOLEAN));
    Schema record = Schema.createRecord("User", "user record", "example.model", false, Arrays.asList(id, active));

    assertEquals(Type.RECORD, record.getType());
    assertEquals("User", record.getName());
    assertEquals("example.model", record.getNamespace());
    assertEquals("example.model.User", record.getFullName());
    assertEquals("user record", record.getDoc());
    assertFalse(record.isError());
    assertTrue(record.hasFields());
    assertEquals(Arrays.asList(id, active), record.getFields());
    assertSame(id, record.getField("id"));
    assertNull(record.getField("missing"));
    assertEquals(0, id.pos());
    assertEquals(1, active.pos());
  }

  @Test
  public void unsetRecordRejectsFieldLookupUntilFieldsAreSet() {
    Schema record = Schema.createRecord("Node", null, "example", false);
    assertFalse(record.hasFields());

    try {
      record.getField("value");
      fail("Field lookup must fail before setFields");
    } catch (AvroRuntimeException expected) {
      assertEquals("Schema fields not set yet", expected.getMessage());
    }
  }

  @Test
  public void recordFieldsCanBeSetOnlyOnce() {
    Schema record = Schema.createRecord("R", null, "example", false);
    record.setFields(Collections.singletonList(new Field("value", Schema.create(Type.INT))));

    try {
      record.setFields(Collections.<Field>emptyList());
      fail("setFields must not succeed twice");
    } catch (AvroRuntimeException expected) {
      assertEquals("Fields are already set", expected.getMessage());
    }
  }

  @Test
  public void aFieldCannotBeReusedByAnotherRecord() {
    Field shared = new Field("value", Schema.create(Type.STRING));
    Schema first = Schema.createRecord("First", null, "example", false, Collections.singletonList(shared));
    assertSame(shared, first.getField("value"));

    try {
      Schema.createRecord("Second", null, "example", false, Collections.singletonList(shared));
      fail("A positioned field must not be reused");
    } catch (AvroRuntimeException expected) {
      assertTrue(expected.getMessage().startsWith("Field already used:"));
    }
  }

  @Test
  public void recordFieldListCannotBeModifiedByClients() {
    Schema record = Schema.createRecord("R", null, "example", false,
        Collections.singletonList(new Field("value", Schema.create(Type.INT))));

    try {
      record.getFields().add(new Field("other", Schema.create(Type.INT)));
      fail("The exposed field list must be locked");
    } catch (IllegalStateException expected) {
      assertEquals(1, record.getFields().size());
      assertNotNull(record.getField("value"));
    }
  }

  @Test
  public void fieldExposesDefaultOrderDocumentationAndAliases() {
    Field field = new Field("count", Schema.create(Type.INT), "number of items", Integer.valueOf(7),
        Field.Order.DESCENDING);
    field.addAlias("total");

    assertEquals("count", field.name());
    assertEquals(Type.INT, field.schema().getType());
    assertEquals("number of items", field.doc());
    assertTrue(field.hasDefaultValue());
    assertEquals(Integer.valueOf(7), field.defaultVal());
    assertEquals(Field.Order.DESCENDING, field.order());
    assertEquals(Collections.singleton("total"), field.aliases());
  }

  @Test
  public void explicitNullDefaultIsDistinctFromNoDefault() {
    Field absent = new Field("absent", Schema.create(Type.NULL));
    Field explicit = new Field("explicit", Schema.create(Type.NULL), null, Field.NULL_DEFAULT_VALUE);

    assertFalse(absent.hasDefaultValue());
    assertNull(absent.defaultVal());
    assertTrue(explicit.hasDefaultValue());
    assertSame(JsonProperties.NULL_VALUE, explicit.defaultVal());
  }

  @Test
  public void invalidFieldDefaultIsRejected() {
    try {
      new Field("count", Schema.create(Type.INT), null, "not-an-integer");
      fail("A string is not a valid default for an int field");
    } catch (AvroTypeException expected) {
      assertTrue(expected.getMessage().contains("Invalid default for field count"));
    }
  }

  @Test
  public void enumExposesSymbolsOrdinalsAndDefault() {
    List<String> symbols = Arrays.asList("RED", "GREEN", "BLUE");
    Schema schema = Schema.createEnum("Color", "available colors", "example", symbols, "GREEN");

    assertEquals(Type.ENUM, schema.getType());
    assertEquals(symbols, schema.getEnumSymbols());
    assertEquals("GREEN", schema.getEnumDefault());
    assertTrue(schema.hasEnumSymbol("BLUE"));
    assertFalse(schema.hasEnumSymbol("blue"));
    assertEquals(0, schema.getEnumOrdinal("RED"));
    assertEquals(2, schema.getEnumOrdinal("BLUE"));
  }

  @Test
  public void enumRejectsDuplicateSymbols() {
    try {
      Schema.createEnum("E", null, "example", Arrays.asList("A", "A"));
      fail("Duplicate enum symbols must be rejected");
    } catch (SchemaParseException expected) {
      assertTrue(expected.getMessage().contains("Duplicate enum symbol: A"));
    }
  }

  @Test
  public void enumRejectsDefaultOutsideSymbolSet() {
    try {
      Schema.createEnum("E", null, "example", Arrays.asList("A", "B"), "C");
      fail("The enum default must be one of its symbols");
    } catch (SchemaParseException expected) {
      assertTrue(expected.getMessage().contains("C"));
    }
  }

  @Test
  public void enumOrdinalRejectsUnknownSymbol() {
    Schema schema = Schema.createEnum("E", null, "example", Arrays.asList("A", "B"));

    try {
      schema.getEnumOrdinal("C");
      fail("An unknown symbol has no ordinal");
    } catch (TracingAvroTypeException expected) {
      assertTrue(expected.getMessage().contains("C"));
    }
  }

  @Test
  public void unionPreservesBranchOrderAndSupportsNameLookup() {
    Schema nullSchema = Schema.create(Type.NULL);
    Schema record = Schema.createRecord("Entry", null, "example", false, Collections.<Field>emptyList());
    Schema union = Schema.createUnion(nullSchema, record);

    assertEquals(Type.UNION, union.getType());
    assertTrue(union.isUnion());
    assertTrue(union.isNullable());
    assertEquals(Arrays.asList(nullSchema, record), union.getTypes());
    assertEquals(Integer.valueOf(0), union.getIndexNamed("null"));
    assertEquals(Integer.valueOf(1), union.getIndexNamed("example.Entry"));
    assertNull(union.getIndexNamed("Entry"));
  }

  @Test
  public void nullableRecognizesNullAndNestedContainerCases() {
    Schema nullSchema = Schema.create(Type.NULL);
    Schema stringSchema = Schema.create(Type.STRING);
    Schema arrayOfNullable = Schema.createArray(Schema.createUnion(stringSchema, nullSchema));

    assertTrue(nullSchema.isNullable());
    assertFalse(stringSchema.isNullable());
    assertFalse(arrayOfNullable.isNullable());
  }

  @Test
  public void unionRejectsDuplicateBranches() {
    try {
      Schema.createUnion(Schema.create(Type.INT), Schema.create(Type.INT));
      fail("A union must not contain duplicate branch names");
    } catch (AvroRuntimeException expected) {
      assertTrue(expected.getMessage().contains("Duplicate in union:int"));
    }
  }

  @Test
  public void unionRejectsNestedUnion() {
    Schema inner = Schema.createUnion(Schema.create(Type.NULL), Schema.create(Type.STRING));

    try {
      Schema.createUnion(inner, Schema.create(Type.INT));
      fail("A union must not directly contain another union");
    } catch (AvroRuntimeException expected) {
      assertTrue(expected.getMessage().startsWith("Nested union:"));
    }
  }

  @Test
  public void unionRejectsProperties() {
    Schema union = Schema.createUnion(Schema.create(Type.NULL), Schema.create(Type.STRING));

    try {
      union.addProp("custom", "value");
      fail("Union schemas do not accept properties");
    } catch (AvroRuntimeException expected) {
      assertTrue(expected.getMessage().startsWith("Can't set properties on a union:"));
    }
  }

  @Test
  public void fixedSchemaExposesNameAliasesAndSize() {
    Schema fixed = Schema.createFixed("Token", "binary token", "example", 16);
    fixed.addAlias("LegacyToken");
    fixed.addAlias("ExternalToken", "legacy");

    assertEquals(Type.FIXED, fixed.getType());
    assertEquals("example.Token", fixed.getFullName());
    assertEquals("binary token", fixed.getDoc());
    assertEquals(16, fixed.getFixedSize());
    assertEquals(new java.util.LinkedHashSet<String>(Arrays.asList("example.LegacyToken", "legacy.ExternalToken")),
        fixed.getAliases());
  }

  @Test
  public void qualifiedNameOverridesSeparateNamespaceArgument() {
    Schema record = Schema.createRecord("actual.space.Item", null, "ignored.space", false,
        Collections.<Field>emptyList());

    assertEquals("Item", record.getName());
    assertEquals("actual.space", record.getNamespace());
    assertEquals("actual.space.Item", record.getFullName());
  }

  @Test
  public void namedSchemaCannotUsePrimitiveFullName() {
    try {
      Schema.createFixed("int", null, null, 4);
      fail("A named schema must not use a primitive name");
    } catch (AvroTypeException expected) {
      assertTrue(expected.getMessage().contains("int"));
    }
  }

  @Test
  public void structurallyEqualSchemasHaveEqualHashCodes() {
    Schema left = Schema.createArray(Schema.create(Type.STRING));
    Schema right = Schema.createArray(Schema.create(Type.STRING));

    assertEquals(left, right);
    assertEquals(left.hashCode(), right.hashCode());

    right.addProp("custom", "different");
    assertFalse(left.equals(right));
  }

  @Test
  public void recursiveRecordsSupportEqualityAndHashing() {
    Schema left = recursiveNodeSchema();
    Schema right = recursiveNodeSchema();

    assertEquals(left, right);
    assertEquals(left.hashCode(), right.hashCode());
    assertTrue(left.toString().contains("\"name\":\"Node\""));
  }

  @Test
  public void applyAliasesRewritesRecordAndFieldNames() {
    Schema writer = Schema.createRecord("OldRecord", null, "example", false,
        Collections.singletonList(new Field("oldField", Schema.create(Type.STRING))));

    Field readerField = new Field("newField", Schema.create(Type.STRING));
    readerField.addAlias("oldField");
    Schema reader = Schema.createRecord("NewRecord", null, "example", false, Collections.singletonList(readerField));
    reader.addAlias("OldRecord");

    Schema rewritten = Schema.applyAliases(writer, reader);

    assertEquals("example.NewRecord", rewritten.getFullName());
    assertNotNull(rewritten.getField("newField"));
    assertNull(rewritten.getField("oldField"));
    assertEquals(Type.STRING, rewritten.getField("newField").schema().getType());
  }

  @Test
  public void applyAliasesReturnsWriterWhenReaderDefinesNoAliases() {
    Schema writer = Schema.create(Type.STRING);
    Schema reader = Schema.create(Type.LONG);

    assertSame(writer, Schema.applyAliases(writer, reader));
  }

  private static Schema recursiveNodeSchema() {
    Schema node = Schema.createRecord("Node", null, "example", false);
    Schema next = Schema.createUnion(Schema.create(Type.NULL), node);
    node.setFields(Collections.singletonList(new Field("next", next)));
    return node;
  }
}
