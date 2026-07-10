/*
 * Unit tests generated for org.apache.avro.data.TimeConversions.
 */
package org.apache.avro.data;

import static org.junit.Assert.assertEquals;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.apache.avro.Schema;
import org.apache.avro.data.TimeConversions.DateConversion;
import org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion;
import org.apache.avro.data.TimeConversions.LocalTimestampMillisConversion;
import org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion;
import org.apache.avro.data.TimeConversions.TimeMicrosConversion;
import org.apache.avro.data.TimeConversions.TimeMillisConversion;
import org.apache.avro.data.TimeConversions.TimestampMicrosConversion;
import org.apache.avro.data.TimeConversions.TimestampMillisConversion;
import org.apache.avro.data.TimeConversions.TimestampNanosConversion;
import org.junit.Test;

public class ISW2TimeConversionsC1LLMTest {

  @Test
  public void dateConversionConvertsEpochDaysAndExposesMetadata() {
    DateConversion conversion = new DateConversion();

    LocalDate dateBeforeEpoch = LocalDate.of(1969, 12, 30);
    LocalDate dateAfterEpoch = LocalDate.of(2020, 2, 29);

    assertEquals(LocalDate.class, conversion.getConvertedType());
    assertEquals("date", conversion.getLogicalTypeName());
    assertRecommendedSchema(Schema.Type.INT, "date", conversion.getRecommendedSchema());
    assertEquals(dateBeforeEpoch, conversion.fromInt(-2, null, null));
    assertEquals(Integer.valueOf(-2), conversion.toInt(dateBeforeEpoch, null, null));
    assertEquals(dateAfterEpoch, conversion.fromInt(18321, null, null));
    assertEquals(Integer.valueOf(18321), conversion.toInt(dateAfterEpoch, null, null));
  }

  @Test
  public void timeMillisConversionConvertsMillisOfDayAndTruncatesNanosOnWrite() {
    TimeMillisConversion conversion = new TimeMillisConversion();
    LocalTime preciseTime = LocalTime.of(1, 2, 3, 456_789_123);

    assertEquals(LocalTime.class, conversion.getConvertedType());
    assertEquals("time-millis", conversion.getLogicalTypeName());
    assertRecommendedSchema(Schema.Type.INT, "time-millis", conversion.getRecommendedSchema());
    assertEquals(LocalTime.of(1, 2, 3, 456_000_000), conversion.fromInt(3_723_456, null, null));
    assertEquals(Integer.valueOf(3_723_456), conversion.toInt(preciseTime, null, null));
    assertEquals(LocalTime.of(23, 59, 59, 999_000_000), conversion.fromInt(86_399_999, null, null));
  }

  @Test
  public void timeMicrosConversionConvertsMicrosOfDayAndTruncatesNanosOnWrite() {
    TimeMicrosConversion conversion = new TimeMicrosConversion();
    LocalTime preciseTime = LocalTime.of(1, 2, 3, 456_789_123);

    assertEquals(LocalTime.class, conversion.getConvertedType());
    assertEquals("time-micros", conversion.getLogicalTypeName());
    assertRecommendedSchema(Schema.Type.LONG, "time-micros", conversion.getRecommendedSchema());
    assertEquals(LocalTime.of(1, 2, 3, 456_789_000), conversion.fromLong(3_723_456_789L, null, null));
    assertEquals(Long.valueOf(3_723_456_789L), conversion.toLong(preciseTime, null, null));
    assertEquals(LocalTime.of(23, 59, 59, 999_999_000), conversion.fromLong(86_399_999_999L, null, null));
  }

  @Test
  public void timestampMillisConversionConvertsEpochMillisAndExposesSetterAdjustment() {
    TimestampMillisConversion conversion = new TimestampMillisConversion();
    Instant instant = Instant.ofEpochSecond(1_600_000_000L, 123_456_789L);

    assertEquals(Instant.class, conversion.getConvertedType());
    assertEquals("timestamp-millis", conversion.getLogicalTypeName());
    assertRecommendedSchema(Schema.Type.LONG, "timestamp-millis", conversion.getRecommendedSchema());
    assertEquals(Instant.parse("2020-09-13T12:26:40.123Z"), conversion.fromLong(1_600_000_000_123L, null, null));
    assertEquals(Long.valueOf(1_600_000_000_123L), conversion.toLong(instant, null, null));
    assertEquals("target=value.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);",
        compact(conversion.adjustAndSetValue("target", "value")));
  }

  @Test
  public void timestampMicrosConversionConvertsEpochMicrosIncludingNegativeValuesAndExposesSetterAdjustment() {
    TimestampMicrosConversion conversion = new TimestampMicrosConversion();
    Instant instant = Instant.ofEpochSecond(1_600_000_000L, 123_456_789L);

    assertEquals(Instant.class, conversion.getConvertedType());
    assertEquals("timestamp-micros", conversion.getLogicalTypeName());
    assertRecommendedSchema(Schema.Type.LONG, "timestamp-micros", conversion.getRecommendedSchema());
    assertEquals(Instant.parse("2020-09-13T12:26:40.123456Z"), conversion.fromLong(1_600_000_000_123_456L, null, null));
    assertEquals(Instant.parse("1969-12-31T23:59:59.999999Z"), conversion.fromLong(-1L, null, null));
    assertEquals(Long.valueOf(1_600_000_000_123_456L), conversion.toLong(instant, null, null));
    assertEquals("target=value.truncatedTo(java.time.temporal.ChronoUnit.MICROS);",
        compact(conversion.adjustAndSetValue("target", "value")));
  }

  @Test
  public void timestampNanosConversionConvertsEpochNanosIncludingNegativeValues() {
    TimestampNanosConversion conversion = new TimestampNanosConversion();
    Instant instant = Instant.ofEpochSecond(1_600_000_000L, 123_456_789L);

    assertEquals(Instant.class, conversion.getConvertedType());
    assertEquals("timestamp-nanos", conversion.getLogicalTypeName());
    assertRecommendedSchema(Schema.Type.LONG, "timestamp-nanos", conversion.getRecommendedSchema());
    assertEquals(Instant.parse("2020-09-13T12:26:40.123456789Z"),
        conversion.fromLong(1_600_000_000_123_456_789L, null, null));
    assertEquals(Instant.parse("1969-12-31T23:59:59.999999999Z"), conversion.fromLong(-1L, null, null));
    assertEquals(Long.valueOf(1_600_000_000_123_456_789L), conversion.toLong(instant, null, null));
  }

  @Test
  public void localTimestampMillisConversionUsesUtcEquivalentEpochMillis() {
    LocalTimestampMillisConversion conversion = new LocalTimestampMillisConversion();
    LocalDateTime dateTime = LocalDateTime.of(2020, 9, 13, 12, 26, 40, 123_456_789);

    assertEquals(LocalDateTime.class, conversion.getConvertedType());
    assertEquals("local-timestamp-millis", conversion.getLogicalTypeName());
    assertRecommendedSchema(Schema.Type.LONG, "local-timestamp-millis", conversion.getRecommendedSchema());
    assertEquals(LocalDateTime.of(2020, 9, 13, 12, 26, 40, 123_000_000),
        conversion.fromLong(1_600_000_000_123L, null, null));
    assertEquals(Long.valueOf(1_600_000_000_123L), conversion.toLong(dateTime, null, null));
    assertEquals("target=value;", compact(conversion.adjustAndSetValue("target", "value")));
  }

  @Test
  public void localTimestampMicrosConversionUsesUtcEquivalentEpochMicros() {
    LocalTimestampMicrosConversion conversion = new LocalTimestampMicrosConversion();
    LocalDateTime dateTime = LocalDateTime.of(2020, 9, 13, 12, 26, 40, 123_456_789);

    assertEquals(LocalDateTime.class, conversion.getConvertedType());
    assertEquals("local-timestamp-micros", conversion.getLogicalTypeName());
    assertRecommendedSchema(Schema.Type.LONG, "local-timestamp-micros", conversion.getRecommendedSchema());
    assertEquals(LocalDateTime.of(2020, 9, 13, 12, 26, 40, 123_456_000),
        conversion.fromLong(1_600_000_000_123_456L, null, null));
    assertEquals(Long.valueOf(1_600_000_000_123_456L), conversion.toLong(dateTime, null, null));
    assertEquals("target=value;", compact(conversion.adjustAndSetValue("target", "value")));
  }

  @Test
  public void localTimestampNanosConversionUsesUtcEquivalentEpochNanos() {
    LocalTimestampNanosConversion conversion = new LocalTimestampNanosConversion();
    LocalDateTime dateTime = LocalDateTime.of(2020, 9, 13, 12, 26, 40, 123_456_789);

    assertEquals(LocalDateTime.class, conversion.getConvertedType());
    assertEquals("local-timestamp-nanos", conversion.getLogicalTypeName());
    assertRecommendedSchema(Schema.Type.LONG, "local-timestamp-nanos", conversion.getRecommendedSchema());
    assertEquals(LocalDateTime.of(2020, 9, 13, 12, 26, 40, 123_456_789),
        conversion.fromLong(1_600_000_000_123_456_789L, null, null));
    assertEquals(Long.valueOf(1_600_000_000_123_456_789L), conversion.toLong(dateTime, null, null));
  }

  private static void assertRecommendedSchema(Schema.Type expectedType, String expectedLogicalTypeName, Schema schema) {
    assertEquals(expectedType, schema.getType());
    assertEquals(expectedLogicalTypeName, schema.getLogicalType().getName());
  }

  private static String compact(String generatedSetterCode) {
    return generatedSetterCode.replaceAll("\\s+", "");
  }
}
