/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information.
 */
package org.apache.avro;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;

/**
 * Mutation-testing refinements for Schema.
 *
 * <p>
 * Each test strengthens an oracle associated with one or more mutants that
 * survived the BB and CF suites.
 * </p>
 */
public class ISW2SchemaMTTest {

  private static Schema primitive(Schema.Type type) {
    return Schema.create(type);
  }

  private static Schema emptyRecord(String name, String namespace) {
    return Schema.createRecord(name, null, namespace, false, Collections.emptyList());
  }

  @Test
  public void shouldPreserveFieldPropertiesWhenApplyingAliases() {
    Schema.Field writerField = new Schema.Field("oldName", primitive(Schema.Type.STRING));
    writerField.addProp("fieldProp", "writer-value");
    Schema writer = Schema.createRecord("Person", null, "org.example", false, Collections.singletonList(writerField));

    Schema.Field readerField = new Schema.Field("name", primitive(Schema.Type.STRING));
    readerField.addAlias("oldName");
    Schema reader = Schema.createRecord("Person", null, "org.example", false, Collections.singletonList(readerField));

    Schema result = Schema.applyAliases(writer, reader);
    Schema.Field renamedField = result.getField("name");

    assertNotNull(renamedField);
    assertEquals("writer-value", renamedField.getProp("fieldProp"));
  }

  @Test
  public void shouldPreservePropertiesAndLogicalTypesOfParsedSchemas() {
    String json = "{" + "\"type\":\"record\"," + "\"name\":\"Container\"," + "\"namespace\":\"org.example\","
        + "\"fields\":[" + "{\"name\":\"items\",\"type\":{"
        + "\"type\":\"array\",\"items\":\"string\",\"arrayProp\":\"array-value\"}},"
        + "{\"name\":\"attributes\",\"type\":{" + "\"type\":\"map\",\"values\":\"long\",\"mapProp\":\"map-value\"}},"
        + "{\"name\":\"status\",\"type\":{" + "\"type\":\"enum\",\"name\":\"Status\","
        + "\"symbols\":[\"OPEN\",\"CLOSED\"],\"enumProp\":\"enum-value\"}}," + "{\"name\":\"hash\",\"type\":{"
        + "\"type\":\"fixed\",\"name\":\"Hash\",\"size\":8," + "\"fixedProp\":\"fixed-value\"}},"
        + "{\"name\":\"createdOn\",\"type\":{" + "\"type\":\"int\",\"logicalType\":\"date\"}}" + "]}";

    Schema result = new Schema.Parser().parse(json);

    Schema arraySchema = result.getField("items").schema();
    Schema mapSchema = result.getField("attributes").schema();
    Schema enumSchema = result.getField("status").schema();
    Schema fixedSchema = result.getField("hash").schema();
    Schema dateSchema = result.getField("createdOn").schema();

    assertEquals("array-value", arraySchema.getProp("arrayProp"));
    assertEquals("map-value", mapSchema.getProp("mapProp"));
    assertEquals("enum-value", enumSchema.getProp("enumProp"));
    assertEquals("fixed-value", fixedSchema.getProp("fixedProp"));
    assertNotNull(dateSchema.getLogicalType());
    assertEquals("date", dateSchema.getLogicalType().getName());
  }

  @Test
  public void shouldParseAliasesAndRegisterEnumAndFixedTypes() {
    Schema.Parser parser = new Schema.Parser();

    String enumJson = "{" + "\"type\":\"enum\"," + "\"name\":\"Status\"," + "\"namespace\":\"org.example\","
        + "\"aliases\":[\"OldStatus\"]," + "\"symbols\":[\"OPEN\",\"CLOSED\"]" + "}";

    Schema enumSchema = parser.parse(enumJson);

    assertTrue(enumSchema.getAliases().contains("org.example.OldStatus"));
    assertEquals(enumSchema, parser.parse("\"org.example.Status\""));

    String fixedJson = "{" + "\"type\":\"fixed\"," + "\"name\":\"Hash\"," + "\"namespace\":\"org.example\","
        + "\"aliases\":[\"OldHash\"]," + "\"size\":16" + "}";

    Schema fixedSchema = parser.parse(fixedJson);

    assertTrue(fixedSchema.getAliases().contains("org.example.OldHash"));
    assertEquals(fixedSchema, parser.parse("\"org.example.Hash\""));
  }

  @Test
  public void shouldDiscoverAliasesInsideRootContainers() {
    Schema arrayWriterRecord = emptyRecord("OldArrayPerson", "org.example");
    Schema arrayReaderRecord = emptyRecord("ArrayPerson", "org.example");
    arrayReaderRecord.addAlias("OldArrayPerson");

    Schema arrayResult = Schema.applyAliases(Schema.createArray(arrayWriterRecord),
        Schema.createArray(arrayReaderRecord));

    assertEquals("org.example.ArrayPerson", arrayResult.getElementType().getFullName());

    Schema mapWriterRecord = emptyRecord("OldMapPerson", "org.example");
    Schema mapReaderRecord = emptyRecord("MapPerson", "org.example");
    mapReaderRecord.addAlias("OldMapPerson");

    Schema mapResult = Schema.applyAliases(Schema.createMap(mapWriterRecord), Schema.createMap(mapReaderRecord));

    assertEquals("org.example.MapPerson", mapResult.getValueType().getFullName());

    Schema unionWriterRecord = emptyRecord("OldUnionPerson", "org.example");
    Schema unionReaderRecord = emptyRecord("UnionPerson", "org.example");
    unionReaderRecord.addAlias("OldUnionPerson");

    Schema unionWriter = Schema.createUnion(primitive(Schema.Type.NULL), unionWriterRecord);
    Schema unionReader = Schema.createUnion(primitive(Schema.Type.NULL), unionReaderRecord);

    Schema unionResult = Schema.applyAliases(unionWriter, unionReader);

    assertEquals(Arrays.asList(Schema.Type.NULL, Schema.Type.RECORD),
        Arrays.asList(unionResult.getTypes().get(0).getType(), unionResult.getTypes().get(1).getType()));
    assertEquals("org.example.UnionPerson", unionResult.getTypes().get(1).getFullName());
  }

  @Test
  public void shouldCharacterizeNullableSchemas() {
    Schema nullSchema = primitive(Schema.Type.NULL);
    Schema stringSchema = primitive(Schema.Type.STRING);
    Schema nullableLater = Schema.createUnion(primitive(Schema.Type.STRING), primitive(Schema.Type.NULL));
    Schema nonNullableUnion = Schema.createUnion(primitive(Schema.Type.STRING), primitive(Schema.Type.INT));

    assertTrue(nullSchema.isNullable());
    assertFalse(stringSchema.isNullable());
    assertTrue(nullableLater.isNullable());
    assertFalse(nonNullableUnion.isNullable());
  }

  @SuppressWarnings("deprecation")
  @Test
  public void shouldSetReadAndRestoreGlobalNameValidator() {
    NameValidator previous = Schema.getNameValidator();

    try {
      Schema.setNameValidator(NameValidator.NO_VALIDATION);

      assertSame(NameValidator.NO_VALIDATION, Schema.getNameValidator());
    } finally {
      Schema.setNameValidator(previous);
    }
  }
}
