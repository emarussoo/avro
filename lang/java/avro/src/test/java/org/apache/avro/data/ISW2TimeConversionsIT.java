package org.apache.avro.data;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Collections;

import org.apache.avro.LogicalTypes;
import org.apache.avro.Schema;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericDatumReader;
import org.apache.avro.generic.GenericDatumWriter;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.BinaryDecoder;
import org.apache.avro.io.BinaryEncoder;
import org.apache.avro.io.DecoderFactory;
import org.apache.avro.io.EncoderFactory;
import org.junit.Test;

public class ISW2TimeConversionsIT {

  /*
   * IT1 - Integrazione timestamp-millis.
   *
   * Obiettivo: Verificare che TimeConversions.TimestampMillisConversion funzioni
   * quando viene usata dentro il normale flusso Avro di
   * serializzazione/deserializzazione.
   *
   * Componenti integrati: - Schema Avro con logical type timestamp-millis -
   * GenericData con conversione registrata - GenericRecord - GenericDatumWriter -
   * GenericDatumReader - BinaryEncoder/BinaryDecoder
   */
  @Test
  public void timestampMillisLogicalTypeShouldRoundTripInstantThroughAvroSerialization() throws IOException {
    GenericData model = new GenericData();
    model.addLogicalTypeConversion(new TimeConversions.TimestampMillisConversion());

    Schema timestampMillisSchema = LogicalTypes.timestampMillis().addToSchema(Schema.create(Schema.Type.LONG));
    Schema recordSchema = createSingleFieldRecordSchema("TimestampMillisRecord", "timestamp", timestampMillisSchema);

    Instant expected = Instant.parse("2020-01-02T03:04:05.678Z");

    GenericData.Record record = new GenericData.Record(recordSchema);
    record.put("timestamp", expected);

    GenericRecord decoded = roundTrip(model, recordSchema, record);

    assertEquals(expected, decoded.get("timestamp"));
  }

  /*
   * IT2 - Integrazione date.
   *
   * Obiettivo: Verificare che DateConversion funzioni nel flusso completo Avro
   * usando uno schema con logical type date e un valore Java LocalDate.
   */
  @Test
  public void dateLogicalTypeShouldRoundTripLocalDateThroughAvroSerialization() throws IOException {
    GenericData model = new GenericData();
    model.addLogicalTypeConversion(new TimeConversions.DateConversion());

    Schema dateSchema = LogicalTypes.date().addToSchema(Schema.create(Schema.Type.INT));
    Schema recordSchema = createSingleFieldRecordSchema("DateRecord", "date", dateSchema);

    LocalDate expected = LocalDate.of(2024, 2, 29);

    GenericData.Record record = new GenericData.Record(recordSchema);
    record.put("date", expected);

    GenericRecord decoded = roundTrip(model, recordSchema, record);

    assertEquals(expected, decoded.get("date"));
  }

  /*
   * IT3 - Integrazione time-micros.
   *
   * Obiettivo: Verificare che TimeMicrosConversion funzioni nel flusso completo
   * Avro usando uno schema con logical type time-micros e un valore Java
   * LocalTime.
   */
  @Test
  public void timeMicrosLogicalTypeShouldRoundTripLocalTimeThroughAvroSerialization() throws IOException {
    GenericData model = new GenericData();
    model.addLogicalTypeConversion(new TimeConversions.TimeMicrosConversion());

    Schema timeMicrosSchema = LogicalTypes.timeMicros().addToSchema(Schema.create(Schema.Type.LONG));
    Schema recordSchema = createSingleFieldRecordSchema("TimeMicrosRecord", "time", timeMicrosSchema);

    LocalTime expected = LocalTime.of(12, 30, 15, 123_456_000);

    GenericData.Record record = new GenericData.Record(recordSchema);
    record.put("time", expected);

    GenericRecord decoded = roundTrip(model, recordSchema, record);

    assertEquals(expected, decoded.get("time"));
  }

  /*
   * IT4 - Integrazione local-timestamp-nanos.
   *
   * Obiettivo: Verificare che LocalTimestampNanosConversion funzioni nel flusso
   * completo Avro usando uno schema con logical type local-timestamp-nanos e un
   * valore Java LocalDateTime.
   *
   * Questo test non usa il caso bug-exposing negativo frazionario, ma un valore
   * positivo deterministico.
   */
  @Test
  public void localTimestampNanosLogicalTypeShouldRoundTripLocalDateTimeThroughAvroSerialization() throws IOException {
    GenericData model = new GenericData();
    model.addLogicalTypeConversion(new TimeConversions.LocalTimestampNanosConversion());

    Schema localTimestampNanosSchema = LogicalTypes.localTimestampNanos().addToSchema(Schema.create(Schema.Type.LONG));
    Schema recordSchema = createSingleFieldRecordSchema("LocalTimestampNanosRecord", "localTimestamp",
        localTimestampNanosSchema);

    LocalDateTime expected = LocalDateTime.of(2020, 1, 2, 3, 4, 5, 678_901_234);

    GenericData.Record record = new GenericData.Record(recordSchema);
    record.put("localTimestamp", expected);

    GenericRecord decoded = roundTrip(model, recordSchema, record);

    assertEquals(expected, decoded.get("localTimestamp"));
  }

  private static Schema createSingleFieldRecordSchema(String recordName, String fieldName, Schema fieldSchema) {
    Schema recordSchema = Schema.createRecord(recordName, null, "org.apache.avro.data", false);

    Schema.Field field = new Schema.Field(fieldName, fieldSchema, null, (Object) null);
    recordSchema.setFields(Collections.singletonList(field));

    return recordSchema;
  }

  private static GenericRecord roundTrip(GenericData model, Schema schema, GenericRecord record) throws IOException {
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    GenericDatumWriter<GenericRecord> writer = new GenericDatumWriter<>(schema, model);
    BinaryEncoder encoder = EncoderFactory.get().binaryEncoder(outputStream, null);
    writer.write(record, encoder);
    encoder.flush();

    byte[] serialized = outputStream.toByteArray();

    GenericDatumReader<GenericRecord> reader = new GenericDatumReader<>(schema, schema, model);
    BinaryDecoder decoder = DecoderFactory.get().binaryDecoder(serialized, null);

    return reader.read(null, decoder);
  }
}
