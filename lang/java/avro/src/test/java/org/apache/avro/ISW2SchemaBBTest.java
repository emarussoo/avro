/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information.
 */
package org.apache.avro;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * Black-box tests for Schema, derived from Category Partition, Base Choice and
 * Boundary Value Analysis.
 */
@RunWith(Enclosed.class)
public class ISW2SchemaBBTest {

  private static Schema primitive(Schema.Type type) {
    return Schema.create(type);
  }

  private static Schema emptyRecord(String name, String namespace) {
    return Schema.createRecord(name, null, namespace, false, Collections.emptyList());
  }

  private static Schema recordWithStringFields(String name, String namespace, String... fieldNames) {
    List<Schema.Field> fields = new ArrayList<>();
    for (String fieldName : fieldNames) {
      fields.add(new Schema.Field(fieldName, primitive(Schema.Type.STRING)));
    }
    return Schema.createRecord(name, null, namespace, false, fields);
  }

  private static Schema recursiveNode() {
    Schema node = Schema.createRecord("Node", null, "org.example", false);
    Schema next = Schema.createUnion(primitive(Schema.Type.NULL), node);
    Schema.Field nextField = new Schema.Field("next", next, null, Schema.Field.NULL_DEFAULT_VALUE);
    node.setFields(Collections.singletonList(nextField));
    return node;
  }

  private static int maximumSupportedFixedSize() {
    int low = 0;
    int high = Integer.MAX_VALUE;
    while (low < high) {
      int middle = low + (int) ((((long) high - low) + 1L) / 2L);
      try {
        SystemLimitException.checkMaxBytesLength(middle);
        low = middle;
      } catch (SystemLimitException | UnsupportedOperationException exception) {
        high = middle - 1;
      }
    }
    return low;
  }

  @RunWith(Parameterized.class)
  public static class PrimitiveCreationTests {

    @Parameters(name = "create({0})")
    public static Collection<Object[]> data() {
      return Arrays.asList(new Object[][] { { Schema.Type.STRING, "string" }, { Schema.Type.BYTES, "bytes" },
          { Schema.Type.INT, "int" }, { Schema.Type.LONG, "long" }, { Schema.Type.FLOAT, "float" },
          { Schema.Type.DOUBLE, "double" }, { Schema.Type.BOOLEAN, "boolean" }, { Schema.Type.NULL, "null" } });
    }

    private final Schema.Type type;
    private final String expectedName;

    public PrimitiveCreationTests(Schema.Type type, String expectedName) {
      this.type = type;
      this.expectedName = expectedName;
    }

    @Test
    public void shouldCreatePrimitiveSchema() {
      Schema schema = Schema.create(type);

      assertNotNull(schema);
      assertEquals(type, schema.getType());
      assertEquals(expectedName, schema.getName());
    }
  }

  @RunWith(Parameterized.class)
  public static class NonPrimitiveCreationTests {

    @Parameters(name = "reject create({0})")
    public static Collection<Object[]> data() {
      return Arrays.asList(new Object[][] { { Schema.Type.RECORD }, { Schema.Type.ARRAY }, { Schema.Type.UNION } });
    }

    private final Schema.Type type;

    public NonPrimitiveCreationTests(Schema.Type type) {
      this.type = type;
    }

    @Test
    public void shouldRejectNonPrimitiveType() {
      assertThrows(AvroRuntimeException.class, () -> Schema.create(type));
    }
  }

  public static class RecordCreationTests {

    @Test
    public void shouldCreateRecordUsingBaseChoice() {
      Schema record = Schema.createRecord("Person", "Person record", "org.example", false);

      assertEquals(Schema.Type.RECORD, record.getType());
      assertEquals("Person", record.getName());
      assertEquals("org.example", record.getNamespace());
      assertEquals("org.example.Person", record.getFullName());
      assertEquals("Person record", record.getDoc());
      assertFalse(record.hasFields());
      assertFalse(record.isError());
    }

    @Test
    public void shouldAcceptMinimumRecordMetadata() {
      Schema record = Schema.createRecord("A", "d", "a", false);

      assertEquals("A", record.getName());
      assertEquals("d", record.getDoc());
      assertEquals("a.A", record.getFullName());
    }

    @Test
    public void shouldAcceptEmptyAndAbsentOptionalMetadata() {
      Schema emptyValues = Schema.createRecord("First", "", "", false);
      Schema nullValues = Schema.createRecord("Second", null, null, false);

      assertEquals("", emptyValues.getDoc());
      assertNull(emptyValues.getNamespace());
      assertNull(nullValues.getDoc());
      assertNull(nullValues.getNamespace());
    }

    @Test
    public void shouldUseQualifiedNameWhenNamespaceIsNull() {
      Schema record = Schema.createRecord("org.example.Person", null, null, false);

      assertEquals("Person", record.getName());
      assertEquals("org.example", record.getNamespace());
      assertEquals("org.example.Person", record.getFullName());
    }

    @Test
    public void shouldPreferQualifierToDifferentNamespace() {
      Schema record = Schema.createRecord("org.example.Person", null, "other.space", false);

      assertEquals("org.example", record.getNamespace());
      assertEquals("org.example.Person", record.getFullName());
    }

    @Test
    public void shouldCreateErrorRecord() {
      Schema record = Schema.createRecord("Failure", null, "org.example", true);
      assertTrue(record.isError());
    }

    @Test
    public void shouldRejectInvalidRecordNames() {
      assertThrows(SchemaParseException.class, () -> Schema.createRecord("", null, null, false));
      assertThrows(SchemaParseException.class, () -> Schema.createRecord("1Person", null, null, false));
    }
  }

  public static class RecordFieldTests {

    @Test
    public void shouldSetEmptyFieldList() {
      Schema record = Schema.createRecord("Empty", null, null, false);
      record.setFields(Collections.emptyList());

      assertTrue(record.hasFields());
      assertTrue(record.getFields().isEmpty());
    }

    @Test
    public void shouldSetOneValidField() {
      Schema record = Schema.createRecord("OneField", null, null, false);
      Schema.Field id = new Schema.Field("id", primitive(Schema.Type.LONG));
      record.setFields(Collections.singletonList(id));

      assertSame(id, record.getField("id"));
      assertEquals(0, id.pos());
    }

    @Test
    public void shouldSetTwoDistinctFieldsInOrder() {
      Schema record = Schema.createRecord("TwoFields", null, null, false);
      Schema.Field id = new Schema.Field("id", primitive(Schema.Type.LONG));
      Schema.Field name = new Schema.Field("name", primitive(Schema.Type.STRING));
      record.setFields(Arrays.asList(id, name));

      assertEquals(Arrays.asList(id, name), record.getFields());
      assertEquals(0, id.pos());
      assertEquals(1, name.pos());
    }

    @Test
    public void shouldRejectDuplicateFieldNames() {
      Schema record = Schema.createRecord("Duplicate", null, null, false);
      List<Schema.Field> fields = Arrays.asList(new Schema.Field("id", primitive(Schema.Type.LONG)),
          new Schema.Field("id", primitive(Schema.Type.STRING)));

      assertThrows(AvroRuntimeException.class, () -> record.setFields(fields));
    }

    @Test
    public void shouldRejectAlreadyUsedField() {
      Schema.Field shared = new Schema.Field("id", primitive(Schema.Type.LONG));
      Schema first = Schema.createRecord("First", null, null, false);
      Schema second = Schema.createRecord("Second", null, null, false);
      first.setFields(Collections.singletonList(shared));

      assertThrows(AvroRuntimeException.class, () -> second.setFields(Collections.singletonList(shared)));
    }

    @Test
    public void shouldRejectSecondInvocationAndPreserveOriginalFields() {
      Schema record = Schema.createRecord("Person", null, null, false);
      Schema.Field id = new Schema.Field("id", primitive(Schema.Type.LONG));
      record.setFields(Collections.singletonList(id));

      assertThrows(AvroRuntimeException.class,
          () -> record.setFields(Collections.singletonList(new Schema.Field("name", primitive(Schema.Type.STRING)))));
      assertEquals(Collections.singletonList(id), record.getFields());
    }

    @Test
    public void shouldBuildDirectRecursiveRecord() {
      Schema node = recursiveNode();
      assertSame(node, node.getField("next").schema().getTypes().get(1));
    }
  }

  @RunWith(Parameterized.class)
  public static class InvalidFieldNameTests {

    @Parameters(name = "invalid field name: {0}")
    public static Collection<Object[]> data() {
      return Arrays.asList(new Object[][] { { "" }, { "1age" } });
    }

    private final String name;

    public InvalidFieldNameTests(String name) {
      this.name = name;
    }

    @Test
    public void shouldRejectInvalidFieldName() {
      assertThrows(SchemaParseException.class, () -> new Schema.Field(name, primitive(Schema.Type.INT)));
    }
  }

  @RunWith(Parameterized.class)
  public static class FieldOrderTests {

    @Parameters(name = "order={0}")
    public static Collection<Object[]> data() {
      return Arrays.asList(new Object[][] { { Schema.Field.Order.ASCENDING }, { Schema.Field.Order.DESCENDING },
          { Schema.Field.Order.IGNORE } });
    }

    private final Schema.Field.Order order;

    public FieldOrderTests(Schema.Field.Order order) {
      this.order = order;
    }

    @Test
    public void shouldSupportFieldOrder() {
      Schema.Field field = new Schema.Field("age", primitive(Schema.Type.INT), "Age", 0, order);
      assertEquals(order, field.order());
    }
  }

  @RunWith(Parameterized.class)
  public static class IntegerDefaultBoundaryTests {

    @Parameters(name = "default={0}")
    public static Collection<Object[]> data() {
      return Arrays.asList(new Object[][] { { Integer.MIN_VALUE }, { Integer.MAX_VALUE } });
    }

    private final int defaultValue;

    public IntegerDefaultBoundaryTests(int defaultValue) {
      this.defaultValue = defaultValue;
    }

    @Test
    public void shouldAcceptIntegerDefaultBoundary() {
      Schema.Field field = new Schema.Field("value", primitive(Schema.Type.INT), null, defaultValue);
      assertEquals(defaultValue, field.defaultVal());
    }
  }

  public static class FieldConstructionTests {

    @Test
    public void shouldCreateFieldUsingBaseChoice() {
      Schema schema = primitive(Schema.Type.INT);
      Schema.Field field = new Schema.Field("age", schema, "Age", 0, Schema.Field.Order.ASCENDING);

      assertEquals("age", field.name());
      assertSame(schema, field.schema());
      assertEquals("Age", field.doc());
      assertTrue(field.hasDefaultValue());
      assertEquals(0, field.defaultVal());
      assertEquals(-1, field.pos());
    }

    @Test
    public void shouldHandleFieldDocumentationBoundaries() {
      Schema.Field minimum = new Schema.Field("first", primitive(Schema.Type.INT), "d");
      Schema.Field empty = new Schema.Field("second", primitive(Schema.Type.INT), "");
      Schema.Field absent = new Schema.Field("third", primitive(Schema.Type.INT), null);

      assertEquals("d", minimum.doc());
      assertEquals("", empty.doc());
      assertNull(absent.doc());
    }

    @Test
    public void shouldDistinguishAbsentAndExplicitNullDefault() {
      Schema.Field absent = new Schema.Field("first", primitive(Schema.Type.INT));
      Schema nullable = Schema.createUnion(primitive(Schema.Type.NULL), primitive(Schema.Type.STRING));
      Schema.Field explicitNull = new Schema.Field("second", nullable, null, Schema.Field.NULL_DEFAULT_VALUE);

      assertFalse(absent.hasDefaultValue());
      assertTrue(explicitNull.hasDefaultValue());
      assertSame(JsonProperties.NULL_VALUE, explicitNull.defaultVal());
    }

    @Test
    public void shouldRejectIncompatibleDefault() {
      assertThrows(AvroTypeException.class, () -> new Schema.Field("age", primitive(Schema.Type.INT), null, "zero"));
    }

    @Test
    public void shouldRejectMissingSchemaOrOrder() {
      assertThrows(NullPointerException.class, () -> new Schema.Field("age", null));
      assertThrows(NullPointerException.class,
          () -> new Schema.Field("age", primitive(Schema.Type.INT), null, 0, null));
    }
  }

  @RunWith(Parameterized.class)
  public static class InvalidEnumSymbolTests {

    @Parameters(name = "invalid symbol: {0}")
    public static Collection<Object[]> data() {
      return Arrays.asList(new Object[][] { { "" }, { "1OPEN" }, { "IN PROGRESS" } });
    }

    private final String symbol;

    public InvalidEnumSymbolTests(String symbol) {
      this.symbol = symbol;
    }

    @Test
    public void shouldRejectInvalidEnumSymbol() {
      assertThrows(SchemaParseException.class,
          () -> Schema.createEnum("Status", null, null, Collections.singletonList(symbol), null));
    }
  }

  @RunWith(Parameterized.class)
  public static class EnumDefaultPositionTests {

    @Parameters(name = "default={0}")
    public static Collection<Object[]> data() {
      return Arrays.asList(new Object[][] { { "OPEN" }, { "CLOSED" } });
    }

    private final String defaultSymbol;

    public EnumDefaultPositionTests(String defaultSymbol) {
      this.defaultSymbol = defaultSymbol;
    }

    @Test
    public void shouldAcceptFirstOrLastSymbolAsDefault() {
      Schema schema = Schema.createEnum("Status", null, null, Arrays.asList("OPEN", "CLOSED"), defaultSymbol);
      assertEquals(defaultSymbol, schema.getEnumDefault());
    }
  }

  public static class EnumTests {

    @Test
    public void shouldCreateEnumUsingBaseChoice() {
      Schema schema = Schema.createEnum("Status", "Status values", "org.example", Arrays.asList("OPEN", "CLOSED"),
          "OPEN");

      assertEquals(Schema.Type.ENUM, schema.getType());
      assertEquals("org.example.Status", schema.getFullName());
      assertEquals(Arrays.asList("OPEN", "CLOSED"), schema.getEnumSymbols());
      assertEquals(0, schema.getEnumOrdinal("OPEN"));
      assertEquals(1, schema.getEnumOrdinal("CLOSED"));
      assertTrue(schema.hasEnumSymbol("OPEN"));
      assertFalse(schema.hasEnumSymbol("UNKNOWN"));
    }

    @Test
    public void shouldAcceptSingleAndEmptySymbolLists() {
      Schema single = Schema.createEnum("Single", null, null, Collections.singletonList("OPEN"), "OPEN");
      Schema empty = Schema.createEnum("Empty", null, null, Collections.emptyList(), null);

      assertEquals(1, single.getEnumSymbols().size());
      assertTrue(empty.getEnumSymbols().isEmpty());
    }

    @Test
    public void shouldCreateEnumWithoutDefault() {
      Schema schema = Schema.createEnum("Status", null, null, Arrays.asList("OPEN", "CLOSED"), null);
      assertNull(schema.getEnumDefault());
    }

    @Test
    public void shouldRejectDuplicateOrNullSymbols() {
      assertThrows(SchemaParseException.class,
          () -> Schema.createEnum("Status", null, null, Arrays.asList("OPEN", "OPEN"), null));
      assertThrows(RuntimeException.class,
          () -> Schema.createEnum("Status", null, null, Collections.singletonList(null), null));
    }

    @Test
    public void shouldRejectDefaultOutsideSymbolSet() {
      assertThrows(SchemaParseException.class,
          () -> Schema.createEnum("Status", null, null, Arrays.asList("OPEN", "CLOSED"), "UNKNOWN"));
    }
  }

  public static class ArrayTests {

    @Test
    public void shouldCreateArrayOfPrimitiveAndNamedType() {
      Schema integer = primitive(Schema.Type.INT);
      Schema person = emptyRecord("Person", "org.example");

      assertSame(integer, Schema.createArray(integer).getElementType());
      assertSame(person, Schema.createArray(person).getElementType());
    }

    @Test
    public void shouldCreateNestedArray() {
      Schema inner = Schema.createArray(primitive(Schema.Type.INT));
      assertSame(inner, Schema.createArray(inner).getElementType());
    }

    @Test
    public void shouldCreateArrayOfNullableUnionAndAcceptNullReference() {
      Schema union = Schema.createUnion(primitive(Schema.Type.NULL), primitive(Schema.Type.STRING));

      assertSame(union, Schema.createArray(union).getElementType());
      assertNull(Schema.createArray(null).getElementType());
    }
  }

  public static class MapTests {

    @Test
    public void shouldCreateMapOfPrimitiveAndNamedType() {
      Schema value = primitive(Schema.Type.LONG);
      Schema person = emptyRecord("Person", "org.example");

      assertSame(value, Schema.createMap(value).getValueType());
      assertSame(person, Schema.createMap(person).getValueType());
    }

    @Test
    public void shouldCreateNestedMap() {
      Schema inner = Schema.createMap(primitive(Schema.Type.INT));
      assertSame(inner, Schema.createMap(inner).getValueType());
    }

    @Test
    public void shouldCreateMapOfNullableUnionAndAcceptNullReference() {
      Schema union = Schema.createUnion(primitive(Schema.Type.NULL), primitive(Schema.Type.STRING));

      assertSame(union, Schema.createMap(union).getValueType());
      assertNull(Schema.createMap(null).getValueType());
    }
  }

  public static class UnionTests {

    @Test
    public void shouldCreateEmptyUnion() {
      Schema union = Schema.createUnion(Collections.emptyList());
      assertTrue(union.isUnion());
      assertTrue(union.getTypes().isEmpty());
    }

    @Test
    public void shouldCreateSingleBranchUnion() {
      Schema integer = primitive(Schema.Type.INT);
      Schema union = Schema.createUnion(integer);
      assertEquals(Collections.singletonList(integer), union.getTypes());
    }

    @Test
    public void shouldCreateTwoDistinctBranchesInOrder() {
      Schema union = Schema.createUnion(primitive(Schema.Type.INT), primitive(Schema.Type.STRING));

      assertEquals(Integer.valueOf(0), union.getIndexNamed("int"));
      assertEquals(Integer.valueOf(1), union.getIndexNamed("string"));
    }

    @Test
    public void shouldCreateNullableUnion() {
      Schema union = Schema.createUnion(primitive(Schema.Type.NULL), primitive(Schema.Type.STRING));
      assertTrue(union.isNullable());
    }

    @Test
    public void shouldRejectDuplicateOrNestedBranches() {
      assertThrows(AvroRuntimeException.class,
          () -> Schema.createUnion(primitive(Schema.Type.INT), primitive(Schema.Type.INT)));

      Schema nested = Schema.createUnion(primitive(Schema.Type.INT), primitive(Schema.Type.STRING));
      assertThrows(AvroRuntimeException.class, () -> Schema.createUnion(Collections.singletonList(nested)));
    }

    @Test
    public void shouldRejectNullBranchOrNullList() {
      assertThrows(NullPointerException.class, () -> Schema.createUnion(Collections.singletonList(null)));
      assertThrows(NullPointerException.class, () -> Schema.createUnion((List<Schema>) null));
    }

    @Test
    public void shouldProduceEquivalentUnionForVarargs() {
      Schema integer = primitive(Schema.Type.INT);
      Schema string = primitive(Schema.Type.STRING);

      assertEquals(Schema.createUnion(Arrays.asList(integer, string)), Schema.createUnion(integer, string));
    }
  }

  @RunWith(Parameterized.class)
  public static class ValidFixedSizeTests {

    @Parameters(name = "valid size={0}")
    public static Collection<Object[]> data() {
      int maximum = maximumSupportedFixedSize();
      return Arrays.asList(new Object[][] { { 0 }, { 1 }, { maximum } });
    }

    private final int size;

    public ValidFixedSizeTests(int size) {
      this.size = size;
    }

    @Test
    public void shouldAcceptValidFixedSize() {
      assertEquals(size, Schema.createFixed("Hash", null, null, size).getFixedSize());
    }
  }

  @RunWith(Parameterized.class)
  public static class InvalidFixedSizeTests {

    @Parameters(name = "invalid size={0}, expected={1}")
    public static Collection<Object[]> data() {
      int maximum = maximumSupportedFixedSize();

      List<Object[]> values = new ArrayList<>();

      values.add(new Object[] { -1, AvroRuntimeException.class });

      values.add(new Object[] { Integer.MIN_VALUE, AvroRuntimeException.class });

      if (maximum < Integer.MAX_VALUE) {
        values.add(new Object[] { maximum + 1, UnsupportedOperationException.class });
      }

      return values;
    }

    private final int size;
    private final Class<? extends Throwable> expectedException;

    public InvalidFixedSizeTests(int size, Class<? extends Throwable> expectedException) {

      this.size = size;
      this.expectedException = expectedException;
    }

    @Test
    public void shouldRejectInvalidFixedSize() {
      assertThrows(expectedException, () -> Schema.createFixed("Hash", null, null, size));
    }
  }

  public static class FixedTests {

    @Test
    public void shouldCreateFixedUsingBaseChoice() {
      Schema fixed = Schema.createFixed("Hash", "Hash bytes", "org.example", 16);

      assertEquals(Schema.Type.FIXED, fixed.getType());
      assertEquals("org.example.Hash", fixed.getFullName());
      assertEquals("Hash bytes", fixed.getDoc());
      assertEquals(16, fixed.getFixedSize());
    }

    @Test
    public void shouldAcceptMinimumFixedMetadata() {
      Schema fixed = Schema.createFixed("A", "d", "a", 1);
      assertEquals("a.A", fixed.getFullName());
      assertEquals("d", fixed.getDoc());
    }

    @Test
    public void shouldPreferQualifierToDifferentNamespace() {
      Schema fixed = Schema.createFixed("org.example.Hash", null, "other.space", 1);
      assertEquals("org.example.Hash", fixed.getFullName());
    }

    @Test
    public void shouldRejectEmptyFixedName() {
      assertThrows(SchemaParseException.class, () -> Schema.createFixed("", null, null, 1));
    }
  }

  public static class EqualityTests {

    @Test
    public void shouldBeReflexive() {
      Schema schema = primitive(Schema.Type.INT);
      assertEquals(schema, schema);
    }

    @Test
    public void shouldEqualDistinctEquivalentSchemasAndHashes() {
      Schema first = Schema.createArray(primitive(Schema.Type.INT));
      Schema second = Schema.createArray(primitive(Schema.Type.INT));

      assertEquals(first, second);
      assertEquals(first.hashCode(), second.hashCode());
    }

    @Test
    public void shouldDistinguishOneStructuralDifference() {
      assertFalse(
          Schema.createArray(primitive(Schema.Type.INT)).equals(Schema.createArray(primitive(Schema.Type.STRING))));
    }

    @Test
    public void shouldDistinguishDifferentTypes() {
      assertFalse(Schema.createArray(primitive(Schema.Type.INT)).equals(Schema.createMap(primitive(Schema.Type.INT))));
    }

    @Test
    public void shouldReturnFalseForNullAndNonSchemaObject() {
      Schema schema = primitive(Schema.Type.INT);
      assertFalse(schema.equals(null));
      assertFalse(schema.equals(new Object()));
    }

    @Test
    public void shouldDetectOnePropertyDifference() {
      Schema first = primitive(Schema.Type.STRING);
      Schema second = primitive(Schema.Type.STRING);
      first.addProp("custom", "value");
      assertFalse(first.equals(second));
    }

    @Test
    public void shouldCompareDirectRecursiveSchemas() {
      Schema first = recursiveNode();
      Schema second = recursiveNode();

      assertEquals(first, second);
      assertEquals(first.hashCode(), second.hashCode());
    }
  }

  public static class AliasApplicationTests {

    @Test
    public void shouldReturnWriterForEquivalentSchemas() {
      Schema writer = recordWithStringFields("Person", "org.example", "name");
      Schema reader = recordWithStringFields("Person", "org.example", "name");
      assertSame(writer, Schema.applyAliases(writer, reader));
    }

    @Test
    public void shouldReturnWriterWhenNoAliasesApply() {
      Schema writer = recordWithStringFields("OldPerson", "org.example", "name");
      Schema reader = recordWithStringFields("Person", "org.example", "name");
      assertSame(writer, Schema.applyAliases(writer, reader));
    }

    @Test
    public void shouldApplyRecordAlias() {
      Schema writer = recordWithStringFields("OldPerson", "org.example", "name");
      Schema reader = recordWithStringFields("Person", "org.example", "name");
      reader.addAlias("OldPerson");

      Schema result = Schema.applyAliases(writer, reader);

      assertEquals("org.example.Person", result.getFullName());
      assertEquals("name", result.getFields().get(0).name());
    }

    @Test
    public void shouldApplyFieldAlias() {
      Schema writer = recordWithStringFields("Person", "org.example", "oldName");
      Schema reader = recordWithStringFields("Person", "org.example", "name");
      reader.getField("name").addAlias("oldName");

      Schema result = Schema.applyAliases(writer, reader);

      assertEquals("name", result.getFields().get(0).name());
      assertEquals(0, result.getFields().get(0).pos());
    }

    @Test
    public void shouldRejectNullWriterOrReader() {
      Schema schema = recordWithStringFields("Person", "org.example", "name");
      assertThrows(NullPointerException.class, () -> Schema.applyAliases(null, schema));
      assertThrows(NullPointerException.class, () -> Schema.applyAliases(schema, null));
    }
  }
}
