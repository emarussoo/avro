package org.apache.avro.data;

import static org.junit.Assert.assertEquals;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.apache.avro.LogicalType;
import org.apache.avro.LogicalTypes;
import org.apache.avro.Schema;
import org.junit.Test;

public class ISW2TimeConversionsC2LLMTest {

  private static void assertRecommendedSchema(Schema schema, Schema.Type expectedType, String expectedLogicalTypeName) {
    assertEquals(expectedType, schema.getType());
    assertEquals(expectedLogicalTypeName, schema.getLogicalType().getName());
  }

  @Test
  public void dateConversionConvertsEpochDaysAndExposesMetadata() {
    TimeConversions.DateConversion conversion = new TimeConversions.DateConversion();
    Schema schema = conversion.getRecommendedSchema();
    LogicalType logicalType = schema.getLogicalType();

    LocalDate leapDay = LocalDate.of(2020, 2, 29);

    assertEquals(LocalDate.class, conversion.getConvertedType());
    assertEquals("date", conversion.getLogicalTypeName());
    assertRecommendedSchema(schema, Schema.Type.INT, "date");
    assertEquals(leapDay, conversion.fromInt(18321, schema, logicalType));
    assertEquals(Integer.valueOf(18321), conversion.toInt(leapDay, schema, logicalType));
  }

  @Test
  public void timeMillisConversionConvertsMillisecondsAndTruncatesSetterValue() {
    TimeConversions.TimeMillisConversion conversion = new TimeConversions.TimeMillisConversion();
    Schema schema = conversion.getRecommendedSchema();
    LogicalType logicalType = schema.getLogicalType();
    LocalTime time = LocalTime.of(12, 34, 56, 789_000_000);

    assertEquals(LocalTime.class, conversion.getConvertedType());
    assertEquals("time-millis", conversion.getLogicalTypeName());
    assertRecommendedSchema(schema, Schema.Type.INT, "time-millis");
    assertEquals(time, conversion.fromInt(45_296_789, schema, logicalType));
    assertEquals(Integer.valueOf(45_296_789), conversion.toInt(time, schema, logicalType));
    assertEquals("field = value.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);",
        conversion.adjustAndSetValue("field", "value"));
  }

  @Test
  public void timeMicrosConversionConvertsMicrosecondsAndTruncatesSetterValue() {
    TimeConversions.TimeMicrosConversion conversion = new TimeConversions.TimeMicrosConversion();
    Schema schema = conversion.getRecommendedSchema();
    LogicalType logicalType = schema.getLogicalType();
    LocalTime time = LocalTime.of(12, 34, 56, 789_123_000);

    assertEquals(LocalTime.class, conversion.getConvertedType());
    assertEquals("time-micros", conversion.getLogicalTypeName());
    assertRecommendedSchema(schema, Schema.Type.LONG, "time-micros");
    assertEquals(time, conversion.fromLong(45_296_789_123L, schema, logicalType));
    assertEquals(Long.valueOf(45_296_789_123L), conversion.toLong(time, schema, logicalType));
    assertEquals("field = value.truncatedTo(java.time.temporal.ChronoUnit.MICROS);",
        conversion.adjustAndSetValue("field", "value"));
  }

  @Test
  public void timestampMillisConversionConvertsEpochMillisecondsAndTruncatesSetterValue() {
    TimeConversions.TimestampMillisConversion conversion = new TimeConversions.TimestampMillisConversion();
    Schema schema = conversion.getRecommendedSchema();
    LogicalType logicalType = schema.getLogicalType();
    Instant instant = Instant.ofEpochSecond(1_609_459_200L, 123_000_000);

    assertEquals(Instant.class, conversion.getConvertedType());
    assertEquals("timestamp-millis", conversion.getLogicalTypeName());
    assertRecommendedSchema(schema, Schema.Type.LONG, "timestamp-millis");
    assertEquals(instant, conversion.fromLong(1_609_459_200_123L, schema, logicalType));
    assertEquals(Long.valueOf(1_609_459_200_123L), conversion.toLong(instant, schema, logicalType));
    assertEquals("field = value.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);",
        conversion.adjustAndSetValue("field", "value"));
  }

  @Test
  public void timestampMicrosConversionConvertsEpochMicrosecondsIncludingNegativeValues() {
    TimeConversions.TimestampMicrosConversion conversion = new TimeConversions.TimestampMicrosConversion();
    Schema schema = conversion.getRecommendedSchema();
    LogicalType logicalType = schema.getLogicalType();
    Instant instant = Instant.ofEpochSecond(1_609_459_200L, 123_456_000);
    Instant halfSecondBeforeEpoch = Instant.ofEpochSecond(-1L, 500_000_000);

    assertEquals(Instant.class, conversion.getConvertedType());
    assertEquals("timestamp-micros", conversion.getLogicalTypeName());
    assertRecommendedSchema(schema, Schema.Type.LONG, "timestamp-micros");
    assertEquals(instant, conversion.fromLong(1_609_459_200_123_456L, schema, logicalType));
    assertEquals(Long.valueOf(1_609_459_200_123_456L), conversion.toLong(instant, schema, logicalType));
    assertEquals(halfSecondBeforeEpoch, conversion.fromLong(-500_000L, schema, logicalType));
    assertEquals(Long.valueOf(-500_000L), conversion.toLong(halfSecondBeforeEpoch, schema, logicalType));
    assertEquals("field = value.truncatedTo(java.time.temporal.ChronoUnit.MICROS);",
        conversion.adjustAndSetValue("field", "value"));
  }

  @Test
  public void timestampNanosConversionConvertsEpochNanosecondsAndTruncatesSetterValue() {
    TimeConversions.TimestampNanosConversion conversion = new TimeConversions.TimestampNanosConversion();
    Schema schema = conversion.getRecommendedSchema();
    LogicalType logicalType = schema.getLogicalType();
    Instant instant = Instant.ofEpochSecond(1_609_459_200L, 123_456_789);

    assertEquals(Instant.class, conversion.getConvertedType());
    assertEquals("timestamp-nanos", conversion.getLogicalTypeName());
    assertRecommendedSchema(schema, Schema.Type.LONG, "timestamp-nanos");
    assertEquals(instant, conversion.fromLong(1_609_459_200_123_456_789L, schema, logicalType));
    assertEquals(Long.valueOf(1_609_459_200_123_456_789L), conversion.toLong(instant, schema, logicalType));
    assertEquals("field = value.truncatedTo(java.time.temporal.ChronoUnit.NANOS);",
        conversion.adjustAndSetValue("field", "value"));
  }

  @Test
  public void localTimestampMillisConversionDelegatesUsingUtcEpochMilliseconds() {
    TimeConversions.LocalTimestampMillisConversion conversion = new TimeConversions.LocalTimestampMillisConversion();
    Schema schema = conversion.getRecommendedSchema();
    LogicalType logicalType = schema.getLogicalType();
    LocalDateTime timestamp = LocalDateTime.of(2021, 1, 1, 0, 0, 0, 123_000_000);

    assertEquals(LocalDateTime.class, conversion.getConvertedType());
    assertEquals("local-timestamp-millis", conversion.getLogicalTypeName());
    assertRecommendedSchema(schema, Schema.Type.LONG, "local-timestamp-millis");
    assertEquals(timestamp, conversion.fromLong(1_609_459_200_123L, schema, logicalType));
    assertEquals(Long.valueOf(1_609_459_200_123L), conversion.toLong(timestamp, schema, logicalType));
  }

  @Test
  public void localTimestampMicrosConversionDelegatesUsingUtcEpochMicroseconds() {
    TimeConversions.LocalTimestampMicrosConversion conversion = new TimeConversions.LocalTimestampMicrosConversion();
    Schema schema = conversion.getRecommendedSchema();
    LogicalType logicalType = schema.getLogicalType();
    LocalDateTime timestamp = LocalDateTime.of(2021, 1, 1, 0, 0, 0, 123_456_000);

    assertEquals(LocalDateTime.class, conversion.getConvertedType());
    assertEquals("local-timestamp-micros", conversion.getLogicalTypeName());
    assertRecommendedSchema(schema, Schema.Type.LONG, "local-timestamp-micros");
    assertEquals(timestamp, conversion.fromLong(1_609_459_200_123_456L, schema, logicalType));
    assertEquals(Long.valueOf(1_609_459_200_123_456L), conversion.toLong(timestamp, schema, logicalType));
  }

  @Test
  public void localTimestampNanosConversionDelegatesUsingUtcEpochNanoseconds() {
    TimeConversions.LocalTimestampNanosConversion conversion = new TimeConversions.LocalTimestampNanosConversion();
    Schema schema = conversion.getRecommendedSchema();
    LogicalType logicalType = schema.getLogicalType();
    LocalDateTime timestamp = LocalDateTime.of(2021, 1, 1, 0, 0, 0, 123_456_789);

    assertEquals(LocalDateTime.class, conversion.getConvertedType());
    assertEquals("local-timestamp-nanos", conversion.getLogicalTypeName());
    assertRecommendedSchema(schema, Schema.Type.LONG, "local-timestamp-nanos");
    assertEquals(timestamp, conversion.fromLong(1_609_459_200_123_456_789L, schema, logicalType));
    assertEquals(Long.valueOf(1_609_459_200_123_456_789L), conversion.toLong(timestamp, schema, logicalType));
  }

  @Test
  public void recommendedSchemasUseTheExpectedLogicalTypeSingletons() {
    assertEquals(LogicalTypes.date().getName(),
        new TimeConversions.DateConversion().getRecommendedSchema().getLogicalType().getName());
    assertEquals(LogicalTypes.timeMillis().getName(),
        new TimeConversions.TimeMillisConversion().getRecommendedSchema().getLogicalType().getName());
    assertEquals(LogicalTypes.timeMicros().getName(),
        new TimeConversions.TimeMicrosConversion().getRecommendedSchema().getLogicalType().getName());
    assertEquals(LogicalTypes.timestampMillis().getName(),
        new TimeConversions.TimestampMillisConversion().getRecommendedSchema().getLogicalType().getName());
    assertEquals(LogicalTypes.timestampMicros().getName(),
        new TimeConversions.TimestampMicrosConversion().getRecommendedSchema().getLogicalType().getName());
    assertEquals(LogicalTypes.timestampNanos().getName(),
        new TimeConversions.TimestampNanosConversion().getRecommendedSchema().getLogicalType().getName());
    assertEquals(LogicalTypes.localTimestampMillis().getName(),
        new TimeConversions.LocalTimestampMillisConversion().getRecommendedSchema().getLogicalType().getName());
    assertEquals(LogicalTypes.localTimestampMicros().getName(),
        new TimeConversions.LocalTimestampMicrosConversion().getRecommendedSchema().getLogicalType().getName());
    assertEquals(LogicalTypes.localTimestampNanos().getName(),
        new TimeConversions.LocalTimestampNanosConversion().getRecommendedSchema().getLogicalType().getName());
  }
}
