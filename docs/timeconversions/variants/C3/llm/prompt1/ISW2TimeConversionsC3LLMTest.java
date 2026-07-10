package org.apache.avro.data;

import static org.junit.Assert.assertEquals;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.apache.avro.Conversion;
import org.apache.avro.Schema;
import org.junit.Test;

public class ISW2TimeConversionsC3LLMTest {

  @Test
  public void dateConversionConvertsEpochDaysAndExposesMetadata() {
    TimeConversions.DateConversion conversion = new TimeConversions.DateConversion();

    assertEquals(LocalDate.class, conversion.getConvertedType());
    assertEquals("date", conversion.getLogicalTypeName());
    assertRecommendedSchema(conversion, Schema.Type.INT, "date");

    assertEquals(LocalDate.of(1970, 1, 1), conversion.fromInt(Integer.valueOf(0), null, null));
    assertEquals(LocalDate.of(1970, 1, 6), conversion.fromInt(Integer.valueOf(5), null, null));
    assertEquals(LocalDate.of(1969, 12, 27), conversion.fromInt(Integer.valueOf(-5), null, null));
    assertEquals(Integer.valueOf(18765), conversion.toInt(LocalDate.of(2021, 5, 18), null, null));
  }

  @Test
  public void timeMillisConversionConvertsLocalTimeAndTruncatesSubMillisPrecision() {
    TimeConversions.TimeMillisConversion conversion = new TimeConversions.TimeMillisConversion();

    assertEquals(LocalTime.class, conversion.getConvertedType());
    assertEquals("time-millis", conversion.getLogicalTypeName());
    assertRecommendedSchema(conversion, Schema.Type.INT, "time-millis");

    assertEquals(LocalTime.of(0, 0), conversion.fromInt(Integer.valueOf(0), null, null));
    assertEquals(LocalTime.of(1, 2, 3, 456_000_000), conversion.fromInt(Integer.valueOf(3_723_456), null, null));
    assertEquals(Integer.valueOf(3_723_456), conversion.toInt(LocalTime.of(1, 2, 3, 456_789_123), null, null));
  }

  @Test
  public void timeMicrosConversionConvertsLocalTimeAndTruncatesSubMicrosPrecision() {
    TimeConversions.TimeMicrosConversion conversion = new TimeConversions.TimeMicrosConversion();

    assertEquals(LocalTime.class, conversion.getConvertedType());
    assertEquals("time-micros", conversion.getLogicalTypeName());
    assertRecommendedSchema(conversion, Schema.Type.LONG, "time-micros");

    assertEquals(LocalTime.of(0, 0), conversion.fromLong(Long.valueOf(0L), null, null));
    assertEquals(LocalTime.of(1, 2, 3, 456_789_000), conversion.fromLong(Long.valueOf(3_723_456_789L), null, null));
    assertEquals(Long.valueOf(3_723_456_789L), conversion.toLong(LocalTime.of(1, 2, 3, 456_789_123), null, null));
  }

  @Test
  public void timestampMillisConversionConvertsInstantAndAdjustsGeneratedSetterValue() {
    TimeConversions.TimestampMillisConversion conversion = new TimeConversions.TimestampMillisConversion();

    assertEquals(Instant.class, conversion.getConvertedType());
    assertEquals("timestamp-millis", conversion.getLogicalTypeName());
    assertRecommendedSchema(conversion, Schema.Type.LONG, "timestamp-millis");

    assertEquals(Instant.parse("1970-01-01T00:00:00Z"), conversion.fromLong(Long.valueOf(0L), null, null));
    assertEquals(Instant.parse("2021-05-18T10:35:30.456Z"),
        conversion.fromLong(Long.valueOf(1_621_334_130_456L), null, null));
    assertEquals(Long.valueOf(1_621_334_130_456L),
        conversion.toLong(Instant.parse("2021-05-18T10:35:30.456789123Z"), null, null));
    assertEquals("field = value.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);",
        conversion.adjustAndSetValue("field", "value"));
  }

  @Test
  public void timestampMicrosConversionConvertsInstantAndAdjustsGeneratedSetterValue() {
    TimeConversions.TimestampMicrosConversion conversion = new TimeConversions.TimestampMicrosConversion();

    assertEquals(Instant.class, conversion.getConvertedType());
    assertEquals("timestamp-micros", conversion.getLogicalTypeName());
    assertRecommendedSchema(conversion, Schema.Type.LONG, "timestamp-micros");

    assertEquals(Instant.parse("2021-05-18T10:35:30.456789Z"),
        conversion.fromLong(Long.valueOf(1_621_334_130_456_789L), null, null));
    assertEquals(Long.valueOf(1_621_334_130_456_789L),
        conversion.toLong(Instant.parse("2021-05-18T10:35:30.456789123Z"), null, null));
    assertEquals("field = value.truncatedTo(java.time.temporal.ChronoUnit.MICROS);",
        conversion.adjustAndSetValue("field", "value"));
  }

  @Test
  public void timestampNanosConversionConvertsInstantAndPreservesNanosecondPrecision() {
    TimeConversions.TimestampNanosConversion conversion = new TimeConversions.TimestampNanosConversion();

    assertEquals(Instant.class, conversion.getConvertedType());
    assertEquals("timestamp-nanos", conversion.getLogicalTypeName());
    assertRecommendedSchema(conversion, Schema.Type.LONG, "timestamp-nanos");

    assertEquals(Instant.parse("2021-05-18T10:35:30.456789123Z"),
        conversion.fromLong(Long.valueOf(1_621_334_130_456_789_123L), null, null));
    assertEquals(Long.valueOf(1_621_334_130_456_789_123L),
        conversion.toLong(Instant.parse("2021-05-18T10:35:30.456789123Z"), null, null));
    assertEquals("field = value.truncatedTo(java.time.temporal.ChronoUnit.NANOS);",
        conversion.adjustAndSetValue("field", "value"));
  }

  @Test
  public void localTimestampMillisConversionUsesUtcTimelineWithoutSystemTimezone() {
    TimeConversions.LocalTimestampMillisConversion conversion = new TimeConversions.LocalTimestampMillisConversion();

    assertEquals(LocalDateTime.class, conversion.getConvertedType());
    assertEquals("local-timestamp-millis", conversion.getLogicalTypeName());
    assertRecommendedSchema(conversion, Schema.Type.LONG, "local-timestamp-millis");

    LocalDateTime timestamp = LocalDateTime.of(2021, 5, 18, 10, 35, 30, 456_789_123);
    assertEquals(LocalDateTime.of(2021, 5, 18, 10, 35, 30, 456_000_000),
        conversion.fromLong(Long.valueOf(1_621_334_130_456L), null, null));
    assertEquals(Long.valueOf(1_621_334_130_456L), conversion.toLong(timestamp, null, null));
  }

  @Test
  public void localTimestampMicrosConversionUsesUtcTimelineWithoutSystemTimezone() {
    TimeConversions.LocalTimestampMicrosConversion conversion = new TimeConversions.LocalTimestampMicrosConversion();

    assertEquals(LocalDateTime.class, conversion.getConvertedType());
    assertEquals("local-timestamp-micros", conversion.getLogicalTypeName());
    assertRecommendedSchema(conversion, Schema.Type.LONG, "local-timestamp-micros");

    LocalDateTime timestamp = LocalDateTime.of(2021, 5, 18, 10, 35, 30, 456_789_123);
    assertEquals(LocalDateTime.of(2021, 5, 18, 10, 35, 30, 456_789_000),
        conversion.fromLong(Long.valueOf(1_621_334_130_456_789L), null, null));
    assertEquals(Long.valueOf(1_621_334_130_456_789L), conversion.toLong(timestamp, null, null));
  }

  @Test
  public void localTimestampNanosConversionUsesUtcTimelineWithoutSystemTimezone() {
    TimeConversions.LocalTimestampNanosConversion conversion = new TimeConversions.LocalTimestampNanosConversion();

    assertEquals(LocalDateTime.class, conversion.getConvertedType());
    assertEquals("local-timestamp-nanos", conversion.getLogicalTypeName());
    assertRecommendedSchema(conversion, Schema.Type.LONG, "local-timestamp-nanos");

    LocalDateTime timestamp = LocalDateTime.of(2021, 5, 18, 10, 35, 30, 456_789_123);
    assertEquals(timestamp, conversion.fromLong(Long.valueOf(1_621_334_130_456_789_123L), null, null));
    assertEquals(Long.valueOf(1_621_334_130_456_789_123L), conversion.toLong(timestamp, null, null));
  }

  private static void assertRecommendedSchema(Conversion<?> conversion, Schema.Type expectedType,
      String expectedLogicalTypeName) {
    Schema recommendedSchema = conversion.getRecommendedSchema();
    assertEquals(expectedType, recommendedSchema.getType());
    assertEquals(expectedLogicalTypeName, recommendedSchema.getLogicalType().getName());
  }
}
