/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information.
 */
package org.apache.avro;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.BigIntegerNode;
import com.fasterxml.jackson.databind.node.BooleanNode;
import com.fasterxml.jackson.databind.node.DoubleNode;
import com.fasterxml.jackson.databind.node.IntNode;
import com.fasterxml.jackson.databind.node.LongNode;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.TextNode;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertThrows;

/**
 * Coverage-focused black-box tests for {@link Schema}.
 *
 * <p>
 * The test cases implement the tables prepared for:
 * </p>
 * <ul>
 * <li>equals(Object) and hashCode() of the relevant nested schema classes;</li>
 * <li>Schema.isValidDefault(JsonNode);</li>
 * <li>the still-uncovered branches of Schema.applyAliases(writer, reader).</li>
 * </ul>
 *
 * <p>
 * The tests use only public behavior. Private helpers are exercised through the
 * corresponding public APIs.
 * </p>
 */
@RunWith(Enclosed.class)
public class ISW2SchemaCFTest {

  private static Schema primitive(Schema.Type type) {
    return Schema.create(type);
  }

  private static Schema fixed(String name, String namespace, String doc, int size) {
    return Schema.createFixed(name, doc, namespace, size);
  }

  private static Schema enumSchema(String name, String namespace, String doc, String enumDefault) {
    return Schema.createEnum(name, doc, namespace, Arrays.asList("OPEN", "CLOSED"), enumDefault);
  }

  private static Schema recordWithStringField(String name, String namespace) {
    return Schema.createRecord(name, null, namespace, false,
        Collections.singletonList(new Schema.Field("name", primitive(Schema.Type.STRING))));
  }

  private static Schema directRecursiveRecord(String name, String namespace, String alias) {
    Schema record = Schema.createRecord(name, null, namespace, false);
    if (alias != null) {
      record.addAlias(alias);
    }
    Schema recursiveUnion = Schema.createUnion(primitive(Schema.Type.NULL), record);
    Schema.Field next = new Schema.Field("next", recursiveUnion, null, Schema.Field.NULL_DEFAULT_VALUE,
        Schema.Field.Order.ASCENDING);
    record.setFields(Collections.singletonList(next));
    return record;
  }

  public static class FixedSchemaEqualityTests {

    @Test
    public void shouldBeReflexiveForFixedSchema() {
      Schema receiver = fixed("Hash", "org.example", null, 16);
      assertTrue(receiver.equals(receiver));
    }

    @Test
    public void shouldEqualDistinctEquivalentFixedSchemas() {
      Schema receiver = fixed("Hash", "org.example", null, 16);
      Schema other = fixed("Hash", "org.example", null, 16);

      assertEquals(receiver, other);
      assertEquals(other, receiver);
      assertEquals(receiver.hashCode(), other.hashCode());
    }

    @Test
    public void shouldDistinguishFixedSize() {
      Schema receiver = fixed("Hash", "org.example", null, 16);
      Schema other = fixed("Hash", "org.example", null, 32);
      assertFalse(receiver.equals(other));
    }

    @Test
    public void shouldDistinguishFixedName() {
      Schema receiver = fixed("Hash", "org.example", null, 16);
      Schema other = fixed("Digest", "org.example", null, 16);
      assertFalse(receiver.equals(other));
    }

    @Test
    public void shouldDistinguishFixedNamespace() {
      Schema receiver = fixed("Hash", "org.example", null, 16);
      Schema other = fixed("Hash", "org.other", null, 16);
      assertFalse(receiver.equals(other));
    }

    @Test
    public void shouldDistinguishFixedProperties() {
      Schema receiver = fixed("Hash", "org.example", null, 16);
      Schema other = fixed("Hash", "org.example", null, 16);
      receiver.addProp("custom", "value");
      assertFalse(receiver.equals(other));
    }

    @Test
    public void shouldIgnoreFixedDocumentationInEquality() {
      Schema receiver = fixed("Hash", "org.example", "first", 16);
      Schema other = fixed("Hash", "org.example", "second", 16);

      assertEquals(receiver, other);
      assertEquals(receiver.hashCode(), other.hashCode());
    }

    @Test
    public void shouldReturnFalseForFixedNullAndDifferentType() {
      Schema receiver = fixed("Hash", "org.example", null, 16);
      assertFalse(receiver.equals(null));
      assertFalse(receiver.equals(primitive(Schema.Type.STRING)));
    }
  }

  public static class MapSchemaEqualityTests {

    @Test
    public void shouldBeReflexiveForMapSchema() {
      Schema receiver = Schema.createMap(primitive(Schema.Type.INT));
      assertTrue(receiver.equals(receiver));
    }

    @Test
    public void shouldEqualDistinctEquivalentMapSchemas() {
      Schema receiver = Schema.createMap(primitive(Schema.Type.INT));
      Schema other = Schema.createMap(primitive(Schema.Type.INT));

      assertEquals(receiver, other);
      assertEquals(other, receiver);
      assertEquals(receiver.hashCode(), other.hashCode());
    }

    @Test
    public void shouldDistinguishMapValueSchema() {
      Schema receiver = Schema.createMap(primitive(Schema.Type.INT));
      Schema other = Schema.createMap(primitive(Schema.Type.STRING));
      assertFalse(receiver.equals(other));
    }

    @Test
    public void shouldEqualEquivalentNestedMapSchemas() {
      Schema receiver = Schema.createMap(Schema.createArray(primitive(Schema.Type.INT)));
      Schema other = Schema.createMap(Schema.createArray(primitive(Schema.Type.INT)));

      assertEquals(receiver, other);
      assertEquals(receiver.hashCode(), other.hashCode());
    }

    @Test
    public void shouldDistinguishNestedMapSchemas() {
      Schema receiver = Schema.createMap(Schema.createMap(primitive(Schema.Type.INT)));
      Schema other = Schema.createMap(Schema.createMap(primitive(Schema.Type.STRING)));
      assertFalse(receiver.equals(other));
    }

    @Test
    public void shouldDistinguishMapProperties() {
      Schema receiver = Schema.createMap(primitive(Schema.Type.INT));
      Schema other = Schema.createMap(primitive(Schema.Type.INT));
      receiver.addProp("custom", "value");
      assertFalse(receiver.equals(other));
    }

    @Test
    public void shouldReturnFalseForMapNullAndDifferentType() {
      Schema receiver = Schema.createMap(primitive(Schema.Type.INT));
      assertFalse(receiver.equals(null));
      assertFalse(receiver.equals(Schema.createArray(primitive(Schema.Type.INT))));
    }
  }

  public static class EnumSchemaEqualityTests {

    @Test
    public void shouldBeReflexiveForEnumSchema() {
      Schema receiver = enumSchema("Status", "org.example", null, "OPEN");
      assertTrue(receiver.equals(receiver));
    }

    @Test
    public void shouldEqualDistinctEquivalentEnumSchemas() {
      Schema receiver = enumSchema("Status", "org.example", null, "OPEN");
      Schema other = enumSchema("Status", "org.example", null, "OPEN");

      assertEquals(receiver, other);
      assertEquals(other, receiver);
      assertEquals(receiver.hashCode(), other.hashCode());
    }

    @Test
    public void shouldDistinguishEnumName() {
      Schema receiver = enumSchema("Status", "org.example", null, "OPEN");
      Schema other = enumSchema("State", "org.example", null, "OPEN");
      assertFalse(receiver.equals(other));
    }

    @Test
    public void shouldDistinguishEnumNamespace() {
      Schema receiver = enumSchema("Status", "org.example", null, "OPEN");
      Schema other = enumSchema("Status", "org.other", null, "OPEN");
      assertFalse(receiver.equals(other));
    }

    @Test
    public void shouldDistinguishEnumSymbols() {
      Schema receiver = enumSchema("Status", "org.example", null, "OPEN");
      Schema other = Schema.createEnum("Status", null, "org.example", Arrays.asList("OPEN", "PENDING"), "OPEN");
      assertFalse(receiver.equals(other));
    }

    @Test
    public void shouldDistinguishEnumSymbolOrder() {
      Schema receiver = enumSchema("Status", "org.example", null, "OPEN");
      Schema other = Schema.createEnum("Status", null, "org.example", Arrays.asList("CLOSED", "OPEN"), "OPEN");
      assertFalse(receiver.equals(other));
    }

    @Test
    public void shouldDistinguishEnumProperties() {
      Schema receiver = enumSchema("Status", "org.example", null, "OPEN");
      Schema other = enumSchema("Status", "org.example", null, "OPEN");
      receiver.addProp("custom", "value");
      assertFalse(receiver.equals(other));
    }

    @Test
    public void shouldIgnoreEnumDefaultInEquality() {
      Schema receiver = enumSchema("Status", "org.example", null, "OPEN");
      Schema other = enumSchema("Status", "org.example", null, "CLOSED");

      assertEquals(receiver, other);
      assertEquals(receiver.hashCode(), other.hashCode());
    }

    @Test
    public void shouldIgnoreEnumDocumentationInEquality() {
      Schema receiver = enumSchema("Status", "org.example", "first", "OPEN");
      Schema other = enumSchema("Status", "org.example", "second", "OPEN");

      assertEquals(receiver, other);
      assertEquals(receiver.hashCode(), other.hashCode());
    }

    @Test
    public void shouldReturnFalseForEnumNullAndDifferentType() {
      Schema receiver = enumSchema("Status", "org.example", null, "OPEN");
      Schema otherType = fixed("Status", "org.example", null, 16);

      assertFalse(receiver.equals(null));
      assertFalse(receiver.equals(otherType));
    }
  }

  public static class UnionSchemaEqualityCoverageTests {

    @Test
    public void shouldBeReflexiveForUnionSchema() {
      Schema receiver = Schema.createUnion(primitive(Schema.Type.NULL), primitive(Schema.Type.STRING));
      assertTrue(receiver.equals(receiver));
    }

    @Test
    public void shouldReturnFalseForUnionAndDifferentType() {
      Schema receiver = Schema.createUnion(primitive(Schema.Type.NULL), primitive(Schema.Type.STRING));
      assertFalse(receiver.equals(primitive(Schema.Type.STRING)));
    }

    @Test
    public void shouldDistinguishUnionBranchOrder() {
      Schema receiver = Schema.createUnion(primitive(Schema.Type.NULL), primitive(Schema.Type.STRING));
      Schema other = Schema.createUnion(primitive(Schema.Type.STRING), primitive(Schema.Type.NULL));
      assertFalse(receiver.equals(other));
    }
  }

  public static class RecordSchemaEqualityCoverageTests {

    @Test
    public void shouldBeReflexiveForRecordSchema() {
      Schema receiver = recordWithStringField("Person", "org.example");
      assertTrue(receiver.equals(receiver));
    }

    @Test
    public void shouldDistinguishRecordProperties() {
      Schema receiver = recordWithStringField("Person", "org.example");
      Schema other = recordWithStringField("Person", "org.example");
      receiver.addProp("custom", "value");
      assertFalse(receiver.equals(other));
    }

    @Test
    public void shouldRejectRecordWithDifferentCachedHash() {
      Schema receiver = recordWithStringField("Person", "org.example");
      Schema other = recordWithStringField("Customer", "org.example");

      int receiverHash = receiver.hashCode();
      int otherHash = other.hashCode();

      assertNotEquals(receiverHash, otherHash);
      assertFalse(receiver.equals(other));
    }
  }

  public static class FieldEqualityCoverageTests {

    @Test
    public void shouldReturnFalseForFieldNullAndNonFieldObject() {
      Schema.Field receiver = new Schema.Field("age", primitive(Schema.Type.INT), null, 0,
          Schema.Field.Order.ASCENDING);

      assertFalse(receiver.equals(null));
      assertFalse(receiver.equals(new Object()));
    }

    @Test
    public void shouldDistinguishFieldName() {
      Schema.Field receiver = new Schema.Field("age", primitive(Schema.Type.INT), null, 0,
          Schema.Field.Order.ASCENDING);
      Schema.Field other = new Schema.Field("years", primitive(Schema.Type.INT), null, 0, Schema.Field.Order.ASCENDING);
      assertFalse(receiver.equals(other));
    }

    @Test
    public void shouldDistinguishFieldSchema() {
      Schema.Field receiver = new Schema.Field("value", primitive(Schema.Type.INT), null, 0,
          Schema.Field.Order.ASCENDING);
      Schema.Field other = new Schema.Field("value", primitive(Schema.Type.LONG), null, 0L,
          Schema.Field.Order.ASCENDING);
      assertFalse(receiver.equals(other));
    }

    @Test
    public void shouldDistinguishFieldDefault() {
      Schema.Field receiver = new Schema.Field("age", primitive(Schema.Type.INT), null, 0,
          Schema.Field.Order.ASCENDING);
      Schema.Field other = new Schema.Field("age", primitive(Schema.Type.INT), null, 1, Schema.Field.Order.ASCENDING);
      assertFalse(receiver.equals(other));
    }

    @Test
    public void shouldDistinguishFieldOrder() {
      Schema.Field receiver = new Schema.Field("age", primitive(Schema.Type.INT), null, 0,
          Schema.Field.Order.ASCENDING);
      Schema.Field other = new Schema.Field("age", primitive(Schema.Type.INT), null, 0, Schema.Field.Order.DESCENDING);
      assertFalse(receiver.equals(other));
    }

    @Test
    public void shouldDistinguishFieldProperties() {
      Schema.Field receiver = new Schema.Field("age", primitive(Schema.Type.INT), null, 0,
          Schema.Field.Order.ASCENDING);
      Schema.Field other = new Schema.Field("age", primitive(Schema.Type.INT), null, 0, Schema.Field.Order.ASCENDING);
      receiver.addProp("custom", "value");
      assertFalse(receiver.equals(other));
    }
  }

  public static class SimpleDefaultValidationTests {

    @Test
    public void shouldRejectJavaNullDefaultValue() {
      assertFalse(primitive(Schema.Type.NULL).isValidDefault(null));
    }

    @Test
    public void shouldValidateStringDefaults() {
      Schema receiver = primitive(Schema.Type.STRING);
      assertTrue(receiver.isValidDefault(TextNode.valueOf("value")));
      assertFalse(receiver.isValidDefault(IntNode.valueOf(1)));
    }

    @Test
    public void shouldValidateBytesDefaults() {
      Schema receiver = primitive(Schema.Type.BYTES);
      assertTrue(receiver.isValidDefault(TextNode.valueOf("data")));
      assertFalse(receiver.isValidDefault(IntNode.valueOf(1)));
    }

    @Test
    public void shouldValidateEnumDefaultsAsText() {
      Schema receiver = Schema.createEnum("Status", null, null, Arrays.asList("OPEN", "CLOSED"), null);
      assertTrue(receiver.isValidDefault(TextNode.valueOf("OPEN")));
      assertFalse(receiver.isValidDefault(IntNode.valueOf(0)));
    }

    @Test
    public void shouldCharacterizeUnknownEnumSymbol() {
      Schema receiver = Schema.createEnum("Status", null, null, Arrays.asList("OPEN", "CLOSED"), null);
      assertTrue(receiver.isValidDefault(TextNode.valueOf("UNKNOWN")));
    }

    @Test
    public void shouldValidateFixedDefaultsAsText() {
      Schema receiver = fixed("Hash", null, null, 4);
      assertTrue(receiver.isValidDefault(TextNode.valueOf("ABCD")));
      assertFalse(receiver.isValidDefault(IntNode.valueOf(4)));
    }

    @Test
    public void shouldCharacterizeFixedTextLength() {
      Schema receiver = fixed("Hash", null, null, 4);
      assertTrue(receiver.isValidDefault(TextNode.valueOf("A")));
      assertTrue(receiver.isValidDefault(TextNode.valueOf("TOO-LONG")));
    }

    @Test
    public void shouldValidateBooleanDefaults() {
      Schema receiver = primitive(Schema.Type.BOOLEAN);
      assertTrue(receiver.isValidDefault(BooleanNode.TRUE));
      assertTrue(receiver.isValidDefault(BooleanNode.FALSE));
      assertFalse(receiver.isValidDefault(TextNode.valueOf("true")));
      assertFalse(receiver.isValidDefault(IntNode.valueOf(1)));
    }

    @Test
    public void shouldValidateJsonNullDefault() {
      Schema receiver = primitive(Schema.Type.NULL);
      assertTrue(receiver.isValidDefault(NullNode.getInstance()));
      assertFalse(receiver.isValidDefault(TextNode.valueOf("null")));
    }
  }

  public static class NumericDefaultValidationTests {

    @Test
    public void shouldAcceptIntegerBoundaries() {
      Schema receiver = primitive(Schema.Type.INT);
      assertTrue(receiver.isValidDefault(IntNode.valueOf(Integer.MIN_VALUE)));
      assertTrue(receiver.isValidDefault(IntNode.valueOf(Integer.MAX_VALUE)));
    }

    @Test
    public void shouldRejectIntegerOutsideRange() {
      Schema receiver = primitive(Schema.Type.INT);
      assertFalse(receiver.isValidDefault(LongNode.valueOf((long) Integer.MAX_VALUE + 1L)));
      assertFalse(receiver.isValidDefault(LongNode.valueOf((long) Integer.MIN_VALUE - 1L)));
    }

    @Test
    public void shouldRejectNonIntegralIntegerDefaults() {
      Schema receiver = primitive(Schema.Type.INT);
      assertFalse(receiver.isValidDefault(DoubleNode.valueOf(1.5)));
      assertFalse(receiver.isValidDefault(TextNode.valueOf("1")));
    }

    @Test
    public void shouldAcceptLongBoundaries() {
      Schema receiver = primitive(Schema.Type.LONG);
      assertTrue(receiver.isValidDefault(LongNode.valueOf(Long.MIN_VALUE)));
      assertTrue(receiver.isValidDefault(LongNode.valueOf(Long.MAX_VALUE)));
    }

    @Test
    public void shouldRejectLongOutsideRange() {
      Schema receiver = primitive(Schema.Type.LONG);
      BigInteger outsideLong = BigInteger.valueOf(Long.MAX_VALUE).add(BigInteger.ONE);
      assertFalse(receiver.isValidDefault(BigIntegerNode.valueOf(outsideLong)));
    }

    @Test
    public void shouldRejectNonIntegralLongDefaults() {
      Schema receiver = primitive(Schema.Type.LONG);
      assertFalse(receiver.isValidDefault(DoubleNode.valueOf(1.5)));
      assertFalse(receiver.isValidDefault(TextNode.valueOf("1")));
    }

    @Test
    public void shouldValidateFloatDefaults() {
      Schema receiver = primitive(Schema.Type.FLOAT);
      assertTrue(receiver.isValidDefault(DoubleNode.valueOf(1.5)));
      assertTrue(receiver.isValidDefault(IntNode.valueOf(1)));
      assertFalse(receiver.isValidDefault(TextNode.valueOf("1.5")));
    }

    @Test
    public void shouldValidateDoubleDefaults() {
      Schema receiver = primitive(Schema.Type.DOUBLE);
      assertTrue(receiver.isValidDefault(DoubleNode.valueOf(1.5)));
      assertTrue(receiver.isValidDefault(LongNode.valueOf(1L)));
      assertFalse(receiver.isValidDefault(BooleanNode.TRUE));
    }
  }

  public static class ArrayDefaultValidationTests {

    @Test
    public void shouldRejectNonArrayDefault() {
      Schema receiver = Schema.createArray(primitive(Schema.Type.INT));
      assertFalse(receiver.isValidDefault(TextNode.valueOf("not-array")));
    }

    @Test
    public void shouldAcceptEmptyArrayDefault() {
      Schema receiver = Schema.createArray(primitive(Schema.Type.INT));
      ArrayNode jsonValue = Schema.MAPPER.createArrayNode();
      assertTrue(receiver.isValidDefault(jsonValue));
    }

    @Test
    public void shouldAcceptArrayWithValidElements() {
      Schema receiver = Schema.createArray(primitive(Schema.Type.INT));
      ArrayNode jsonValue = Schema.MAPPER.createArrayNode().add(1).add(2).add(3);
      assertTrue(receiver.isValidDefault(jsonValue));
    }

    @Test
    public void shouldRejectArrayWithInvalidElement() {
      Schema receiver = Schema.createArray(primitive(Schema.Type.INT));
      ArrayNode jsonValue = Schema.MAPPER.createArrayNode().add(1).add("invalid").add(3);
      assertFalse(receiver.isValidDefault(jsonValue));
    }
  }

  public static class MapDefaultValidationTests {

    @Test
    public void shouldRejectNonObjectMapDefault() {
      Schema receiver = Schema.createMap(primitive(Schema.Type.INT));
      assertFalse(receiver.isValidDefault(Schema.MAPPER.createArrayNode()));
    }

    @Test
    public void shouldAcceptEmptyMapDefault() {
      Schema receiver = Schema.createMap(primitive(Schema.Type.INT));
      ObjectNode jsonValue = Schema.MAPPER.createObjectNode();
      assertTrue(receiver.isValidDefault(jsonValue));
    }

    @Test
    public void shouldAcceptMapWithValidValues() {
      Schema receiver = Schema.createMap(primitive(Schema.Type.INT));
      ObjectNode jsonValue = Schema.MAPPER.createObjectNode();
      jsonValue.put("first", 1);
      jsonValue.put("second", 2);
      assertTrue(receiver.isValidDefault(jsonValue));
    }

    @Test
    public void shouldRejectMapWithInvalidValue() {
      Schema receiver = Schema.createMap(primitive(Schema.Type.INT));
      ObjectNode jsonValue = Schema.MAPPER.createObjectNode();
      jsonValue.put("first", 1);
      jsonValue.put("second", "invalid");
      assertFalse(receiver.isValidDefault(jsonValue));
    }
  }

  public static class UnionDefaultValidationTests {

    @Test
    public void shouldAcceptDefaultMatchingFirstUnionBranch() {
      Schema receiver = Schema.createUnion(primitive(Schema.Type.NULL), primitive(Schema.Type.STRING));
      assertTrue(receiver.isValidDefault(NullNode.getInstance()));
    }

    @Test
    public void shouldAcceptDefaultMatchingLaterUnionBranch() {
      Schema receiver = Schema.createUnion(primitive(Schema.Type.NULL), primitive(Schema.Type.STRING));
      assertTrue(receiver.isValidDefault(TextNode.valueOf("value")));
    }

    @Test
    public void shouldRejectDefaultMatchingNoUnionBranch() {
      Schema receiver = Schema.createUnion(primitive(Schema.Type.NULL), primitive(Schema.Type.STRING));
      assertFalse(receiver.isValidDefault(IntNode.valueOf(1)));
    }

    @Test
    public void shouldRejectAnyDefaultForEmptyUnion() {
      Schema receiver = Schema.createUnion(Collections.emptyList());
      assertFalse(receiver.isValidDefault(TextNode.valueOf("value")));
    }
  }

  public static class RecordDefaultValidationTests {

    @Test
    public void shouldRejectNonObjectRecordDefault() {
      Schema receiver = Schema.createRecord("Person", null, "org.example", false, Collections.emptyList());
      assertFalse(receiver.isValidDefault(TextNode.valueOf("not-record")));
    }

    @Test
    public void shouldAcceptEmptyObjectForEmptyRecord() {
      Schema receiver = Schema.createRecord("Empty", null, "org.example", false, Collections.emptyList());
      assertTrue(receiver.isValidDefault(Schema.MAPPER.createObjectNode()));
    }

    @Test
    public void shouldAcceptRecordWithValidPresentField() {
      Schema.Field age = new Schema.Field("age", primitive(Schema.Type.INT));
      Schema receiver = Schema.createRecord("Person", null, "org.example", false, Collections.singletonList(age));
      ObjectNode jsonValue = Schema.MAPPER.createObjectNode();
      jsonValue.put("age", 25);
      assertTrue(receiver.isValidDefault(jsonValue));
    }

    @Test
    public void shouldRejectRecordWithInvalidPresentField() {
      Schema.Field age = new Schema.Field("age", primitive(Schema.Type.INT));
      Schema receiver = Schema.createRecord("Person", null, "org.example", false, Collections.singletonList(age));
      ObjectNode jsonValue = Schema.MAPPER.createObjectNode();
      jsonValue.put("age", "invalid");
      assertFalse(receiver.isValidDefault(jsonValue));
    }

    @Test
    public void shouldAcceptMissingFieldWithValidDefault() {
      Schema.Field age = new Schema.Field("age", primitive(Schema.Type.INT), null, 0, Schema.Field.Order.ASCENDING);
      Schema receiver = Schema.createRecord("Person", null, "org.example", false, Collections.singletonList(age));
      assertTrue(receiver.isValidDefault(Schema.MAPPER.createObjectNode()));
    }

    @Test
    public void shouldRejectMissingFieldWithoutDefault() {
      Schema.Field age = new Schema.Field("age", primitive(Schema.Type.INT));
      Schema receiver = Schema.createRecord("Person", null, "org.example", false, Collections.singletonList(age));
      assertFalse(receiver.isValidDefault(Schema.MAPPER.createObjectNode()));
    }

    @Test
    public void shouldAcceptRecordWithNestedValidField() {
      Schema.Field values = new Schema.Field("values", Schema.createArray(primitive(Schema.Type.INT)));
      Schema receiver = Schema.createRecord("Container", null, "org.example", false, Collections.singletonList(values));
      ObjectNode jsonValue = Schema.MAPPER.createObjectNode();
      jsonValue.set("values", Schema.MAPPER.createArrayNode().add(1).add(2));
      assertTrue(receiver.isValidDefault(jsonValue));
    }

    @Test
    public void shouldRejectRecordWithNestedInvalidField() {
      Schema.Field values = new Schema.Field("values", Schema.createArray(primitive(Schema.Type.INT)));
      Schema receiver = Schema.createRecord("Container", null, "org.example", false, Collections.singletonList(values));
      ObjectNode jsonValue = Schema.MAPPER.createObjectNode();
      jsonValue.set("values", Schema.MAPPER.createArrayNode().add(1).add("invalid"));
      assertFalse(receiver.isValidDefault(jsonValue));
    }
  }

  public static class ApplyAliasesCoverageTests {

    @Test
    public void shouldApplyEnumAlias() {
      Schema writer = Schema.createEnum("OldStatus", "status", "org.example", Arrays.asList("OPEN", "CLOSED"), "OPEN");
      writer.addProp("source", "writer");

      Schema reader = Schema.createEnum("Status", "status", "org.example", Arrays.asList("OPEN", "CLOSED"), "OPEN");
      reader.addAlias("OldStatus");

      Schema result = Schema.applyAliases(writer, reader);

      assertEquals(Schema.Type.ENUM, result.getType());
      assertEquals("org.example.Status", result.getFullName());
      assertEquals(Arrays.asList("OPEN", "CLOSED"), result.getEnumSymbols());
      assertEquals("OPEN", result.getEnumDefault());
      assertEquals("writer", result.getProp("source"));
    }

    @Test
    public void shouldApplyFixedAlias() {
      Schema writer = fixed("OldHash", "org.example", "hash", 16);
      writer.addProp("source", "writer");

      Schema reader = fixed("Hash", "org.example", "hash", 16);
      reader.addAlias("OldHash");

      Schema result = Schema.applyAliases(writer, reader);

      assertEquals(Schema.Type.FIXED, result.getType());
      assertEquals("org.example.Hash", result.getFullName());
      assertEquals(16, result.getFixedSize());
      assertEquals("writer", result.getProp("source"));
    }

    @Test
    public void shouldApplyAliasesInsideArrayMapAndUnion() {
      Schema writerPerson = recordWithStringField("OldPerson", "org.example");
      Schema readerPerson = recordWithStringField("Person", "org.example");
      readerPerson.addAlias("OldPerson");

      Schema.Field writerArray = new Schema.Field("peopleArray", Schema.createArray(writerPerson));
      Schema.Field writerMap = new Schema.Field("peopleMap", Schema.createMap(writerPerson));
      Schema.Field writerOptional = new Schema.Field("optionalPerson",
          Schema.createUnion(primitive(Schema.Type.NULL), writerPerson), null, Schema.Field.NULL_DEFAULT_VALUE);
      Schema writer = Schema.createRecord("Container", null, "org.example", false,
          Arrays.asList(writerArray, writerMap, writerOptional));
      writer.addProp("source", "writer");

      Schema.Field readerArray = new Schema.Field("peopleArray", Schema.createArray(readerPerson));
      Schema.Field readerMap = new Schema.Field("peopleMap", Schema.createMap(readerPerson));
      Schema.Field readerOptional = new Schema.Field("optionalPerson",
          Schema.createUnion(primitive(Schema.Type.NULL), readerPerson), null, Schema.Field.NULL_DEFAULT_VALUE);
      Schema reader = Schema.createRecord("Container", null, "org.example", false,
          Arrays.asList(readerArray, readerMap, readerOptional));

      Schema result = Schema.applyAliases(writer, reader);

      assertEquals(Schema.Type.RECORD, result.getType());
      assertEquals("org.example.Container", result.getFullName());
      assertEquals(Arrays.asList("peopleArray", "peopleMap", "optionalPerson"), Arrays.asList(
          result.getFields().get(0).name(), result.getFields().get(1).name(), result.getFields().get(2).name()));

      Schema arrayElement = result.getField("peopleArray").schema().getElementType();
      Schema mapValue = result.getField("peopleMap").schema().getValueType();
      Schema optional = result.getField("optionalPerson").schema();

      assertEquals("org.example.Person", arrayElement.getFullName());
      assertEquals("org.example.Person", mapValue.getFullName());
      assertEquals(2, optional.getTypes().size());
      assertEquals(Schema.Type.NULL, optional.getTypes().get(0).getType());
      assertEquals("org.example.Person", optional.getTypes().get(1).getFullName());
      assertEquals("writer", result.getProp("source"));
    }

    @Test
    public void shouldApplyAliasToDirectRecursiveRecord() {
      Schema writer = directRecursiveRecord("OldNode", "org.example", null);
      Schema reader = directRecursiveRecord("Node", "org.example", "OldNode");

      Schema result = Schema.applyAliases(writer, reader);

      assertNotNull(result);
      assertEquals(Schema.Type.RECORD, result.getType());
      assertEquals("org.example.Node", result.getFullName());
      Schema recursiveUnion = result.getField("next").schema();
      assertEquals(Arrays.asList(Schema.Type.NULL, Schema.Type.RECORD),
          Arrays.asList(recursiveUnion.getTypes().get(0).getType(), recursiveUnion.getTypes().get(1).getType()));
      assertSame(result, recursiveUnion.getTypes().get(1));
    }
  }

  public static class SchemaParserCoverageTests {

    @Test
    public void shouldParsePrimitiveSchema() {
      Schema.Parser parser = new Schema.Parser();

      Schema result = parser.parse("\"string\"");

      assertNotNull(result);
      assertEquals(Schema.Type.STRING, result.getType());
      assertEquals("string", result.getName());
      assertEquals("string", result.getFullName());
    }

    @Test
    public void shouldParseCompleteRecordSchema() {
      String json = "{" + "\"type\":\"record\"," + "\"name\":\"Container\"," + "\"namespace\":\"org.example\","
          + "\"doc\":\"Container record\"," + "\"aliases\":[\"OldContainer\"]," + "\"custom\":\"value\","
          + "\"fields\":[" + "{" + "\"name\":\"id\"," + "\"type\":\"long\"," + "\"doc\":\"identifier\","
          + "\"aliases\":[\"oldId\"]," + "\"fieldCustom\":\"fieldValue\"" + "}," + "{" + "\"name\":\"score\","
          + "\"type\":\"double\"," + "\"default\":\"1.5\"," + "\"order\":\"descending\"" + "}," + "{"
          + "\"name\":\"tags\"," + "\"type\":{" + "\"type\":\"array\"," + "\"items\":\"string\"" + "}" + "}," + "{"
          + "\"name\":\"attributes\"," + "\"type\":{" + "\"type\":\"map\"," + "\"values\":\"int\"" + "}" + "}," + "{"
          + "\"name\":\"optionalName\"," + "\"type\":[\"null\",\"string\"]," + "\"default\":null" + "}," + "{"
          + "\"name\":\"status\"," + "\"type\":{" + "\"type\":\"enum\"," + "\"name\":\"Status\","
          + "\"symbols\":[\"OPEN\",\"CLOSED\"]," + "\"default\":\"OPEN\"" + "}" + "}," + "{" + "\"name\":\"hash\","
          + "\"type\":{" + "\"type\":\"fixed\"," + "\"name\":\"Hash\"," + "\"size\":16" + "}" + "}" + "]" + "}";

      Schema.Parser parser = new Schema.Parser();

      Schema result = parser.parse(json);

      assertNotNull(result);
      assertEquals(Schema.Type.RECORD, result.getType());
      assertEquals("Container", result.getName());
      assertEquals("org.example", result.getNamespace());
      assertEquals("org.example.Container", result.getFullName());
      assertEquals("Container record", result.getDoc());
      assertEquals("value", result.getProp("custom"));
      assertTrue(result.getAliases().contains("org.example.OldContainer"));
      assertEquals(7, result.getFields().size());

      assertEquals(Arrays.asList("id", "score", "tags", "attributes", "optionalName", "status", "hash"),
          Arrays.asList(result.getFields().get(0).name(), result.getFields().get(1).name(),
              result.getFields().get(2).name(), result.getFields().get(3).name(), result.getFields().get(4).name(),
              result.getFields().get(5).name(), result.getFields().get(6).name()));

      Schema.Field id = result.getField("id");

      assertNotNull(id);
      assertEquals(Schema.Type.LONG, id.schema().getType());
      assertEquals("identifier", id.doc());
      assertTrue(id.aliases().contains("oldId"));
      assertEquals("fieldValue", id.getProp("fieldCustom"));
      assertEquals(0, id.pos());

      Schema.Field score = result.getField("score");

      assertNotNull(score);
      assertEquals(Schema.Type.DOUBLE, score.schema().getType());
      assertTrue(score.hasDefaultValue());
      assertEquals(1.5, ((Number) score.defaultVal()).doubleValue(), 0.0);
      assertEquals(Schema.Field.Order.DESCENDING, score.order());
      assertEquals(1, score.pos());

      Schema.Field tags = result.getField("tags");

      assertNotNull(tags);
      assertEquals(Schema.Type.ARRAY, tags.schema().getType());
      assertEquals(Schema.Type.STRING, tags.schema().getElementType().getType());

      Schema.Field attributes = result.getField("attributes");

      assertNotNull(attributes);
      assertEquals(Schema.Type.MAP, attributes.schema().getType());
      assertEquals(Schema.Type.INT, attributes.schema().getValueType().getType());

      Schema.Field optionalName = result.getField("optionalName");

      assertNotNull(optionalName);
      assertEquals(Schema.Type.UNION, optionalName.schema().getType());
      assertEquals(2, optionalName.schema().getTypes().size());
      assertEquals(Schema.Type.NULL, optionalName.schema().getTypes().get(0).getType());
      assertEquals(Schema.Type.STRING, optionalName.schema().getTypes().get(1).getType());
      assertTrue(optionalName.hasDefaultValue());
      assertSame(JsonProperties.NULL_VALUE, optionalName.defaultVal());

      Schema.Field status = result.getField("status");

      assertNotNull(status);
      assertEquals(Schema.Type.ENUM, status.schema().getType());
      assertEquals("org.example.Status", status.schema().getFullName());
      assertEquals(Arrays.asList("OPEN", "CLOSED"), status.schema().getEnumSymbols());
      assertEquals("OPEN", status.schema().getEnumDefault());

      Schema.Field hash = result.getField("hash");

      assertNotNull(hash);
      assertEquals(Schema.Type.FIXED, hash.schema().getType());
      assertEquals("org.example.Hash", hash.schema().getFullName());
      assertEquals(16, hash.schema().getFixedSize());
    }

    @Test
    public void shouldParseSchemaFromStringFragments() {
      Schema.Parser parser = new Schema.Parser();

      Schema result = parser.parse("{\"type\":\"array\",", "\"items\":", "\"long\"}");

      assertNotNull(result);
      assertEquals(Schema.Type.ARRAY, result.getType());
      assertEquals(Schema.Type.LONG, result.getElementType().getType());
    }

    @Test
    public void shouldResolveKnownTypeUsingSameParser() {
      String personJson = "{" + "\"type\":\"record\"," + "\"name\":\"Person\"," + "\"namespace\":\"org.example\","
          + "\"fields\":[" + "{" + "\"name\":\"name\"," + "\"type\":\"string\"" + "}" + "]" + "}";

      Schema.Parser parser = new Schema.Parser();

      Schema person = parser.parse(personJson);

      assertTrue(parser.getTypes().containsKey("org.example.Person"));
      assertSame(person, parser.getTypes().get("org.example.Person"));

      Schema resolved = parser.parse("\"org.example.Person\"");

      assertSame(person, resolved);
    }

    @Test
    public void shouldAddAndResolvePredefinedType() {
      Schema predefined = Schema.createRecord("Person", null, "org.example", false,
          Collections.singletonList(new Schema.Field("name", primitive(Schema.Type.STRING))));

      Schema.Parser parser = new Schema.Parser();

      Schema.Parser returnedParser = parser.addTypes(Collections.singletonList(predefined));

      assertSame(parser, returnedParser);
      assertTrue(parser.getTypes().containsKey("org.example.Person"));
      assertSame(predefined, parser.getTypes().get("org.example.Person"));

      Schema resolved = parser.parse("\"org.example.Person\"");

      assertEquals(predefined, resolved);
      assertEquals("org.example.Person", resolved.getFullName());
    }

    @Test
    public void shouldControlDefaultValidation() {
      String json = "{" + "\"type\":\"record\"," + "\"name\":\"Measure\"," + "\"namespace\":\"org.example\","
          + "\"fields\":[" + "{" + "\"name\":\"value\"," + "\"type\":\"int\"," + "\"default\":\"invalid\"" + "}" + "]"
          + "}";

      Schema.Parser validatingParser = new Schema.Parser();

      assertSame(validatingParser, validatingParser.setValidateDefaults(true));
      assertTrue(validatingParser.getValidateDefaults());

      assertThrows(AvroTypeException.class, () -> validatingParser.parse(json));

      Schema.Parser nonValidatingParser = new Schema.Parser();

      assertSame(nonValidatingParser, nonValidatingParser.setValidateDefaults(false));
      assertFalse(nonValidatingParser.getValidateDefaults());

      Schema result = nonValidatingParser.parse(json);

      assertNotNull(result);
      assertEquals(Schema.Type.RECORD, result.getType());

      Schema.Field valueField = result.getField("value");

      assertNotNull(valueField);
      assertEquals(Schema.Type.INT, valueField.schema().getType());
      assertTrue(valueField.hasDefaultValue());
    }

    @Test
    public void shouldUseNoValidationWhenValidatorIsNull() {
      String json = "{" + "\"type\":\"record\"," + "\"name\":\"1Record\"," + "\"fields\":[" + "{"
          + "\"name\":\"1field\"," + "\"type\":\"string\"" + "}" + "]" + "}";

      Schema.Parser parser = new Schema.Parser((NameValidator) null);

      Schema result = parser.parse(json);

      assertNotNull(result);
      assertEquals(Schema.Type.RECORD, result.getType());
      assertEquals("1Record", result.getName());
      assertNotNull(result.getField("1field"));
      assertEquals(Schema.Type.STRING, result.getField("1field").schema().getType());
    }

    @Test
    public void shouldRejectDanglingAndMalformedContent() {
      Schema.Parser danglingParser = new Schema.Parser();

      assertThrows(SchemaParseException.class, () -> danglingParser.parse("\"string\" trailing"));

      Schema.Parser malformedParser = new Schema.Parser();

      assertThrows(SchemaParseException.class, () -> malformedParser.parse("{\"type\":\"record\","));
    }

    @Test
    public void shouldRejectInvalidSchemaStructures() {
      String[] invalidSchemas = { "{\"name\":\"MissingType\"}", "{\"type\":\"unknown\"}",
          "{" + "\"type\":\"record\"," + "\"name\":\"Person\"" + "}",
          "{" + "\"type\":\"record\"," + "\"name\":\"Person\"," + "\"fields\":[" + "{\"type\":\"string\"}" + "]" + "}",
          "{" + "\"type\":\"record\"," + "\"name\":\"Person\"," + "\"fields\":[" + "{\"name\":\"value\"}" + "]" + "}",
          "{\"type\":\"array\"}", "{\"type\":\"map\"}", "{" + "\"type\":\"enum\"," + "\"name\":\"Status\"" + "}",
          "{" + "\"type\":\"fixed\"," + "\"name\":\"Hash\"" + "}" };

      for (String invalidSchema : invalidSchemas) {
        Schema.Parser parser = new Schema.Parser();

        assertThrows("Schema non valido accettato: " + invalidSchema, SchemaParseException.class,
            () -> parser.parse(invalidSchema));
      }
    }

    @Test
    public void shouldRejectInvalidAliases() {
      String aliasesNotArray = "{" + "\"type\":\"record\"," + "\"name\":\"Person\"," + "\"aliases\":\"OldPerson\","
          + "\"fields\":[]" + "}";

      String nonTextualAlias = "{" + "\"type\":\"record\"," + "\"name\":\"Person\"," + "\"aliases\":[10],"
          + "\"fields\":[]" + "}";

      Schema.Parser firstParser = new Schema.Parser();

      assertThrows(SchemaParseException.class, () -> firstParser.parse(aliasesNotArray));

      Schema.Parser secondParser = new Schema.Parser();

      assertThrows(SchemaParseException.class, () -> secondParser.parse(nonTextualAlias));
    }
  }
}
