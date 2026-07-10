package org.apache.avro.data;

import static org.junit.Assert.assertEquals;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;

import org.apache.avro.Conversion;
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

/**
 * Unit tests for {@link TimeConversions}.
 *
 * <p>
 * All temporal values are deterministic and timezone-independent. When a
 * timestamp conversion requires an offset, UTC is used explicitly.
 * </p>
 */
public class ISW2TimeConversionsC4LLMTest {

  @Test
  public void dateConversionConvertsEpochDaysAndExposesMetadata() {
    DateConversion conversion = new DateConversion();

    assertEquals(LocalDate.class, conversion.getConvertedType());
    assertEquals("date", conversion.getLogicalTypeName());
    assertRecommendedSchema(conversion.getRecommendedSchema(), Schema.Type.INT, "date");

    assertEquals(LocalDate.of(1970, 1, 1), conversion.fromInt(0, null, null));
    assertEquals(LocalDate.of(1970, 1, 6), conversion.fromInt(5, null, null));
    assertEquals(LocalDate.of(1969, 12, 27), conversion.fromInt(-5, null, null));
    assertEquals(Integer.valueOf(19810), conversion.toInt(LocalDate.of(2024, 3, 28), null, null));
  }

  @Test
  public void timeMillisConversionConvertsMillisOfDayAndExposesMetadata() {
    TimeMillisConversion conversion = new TimeMillisConversion();

    assertEquals(LocalTime.class, conversion.getConvertedType());
    assertEquals("time-millis", conversion.getLogicalTypeName());
    assertRecommendedSchema(conversion.getRecommendedSchema(), Schema.Type.INT, "time-millis");

    assertEquals(LocalTime.MIDNIGHT, conversion.fromInt(0, null, null));
    assertEquals(LocalTime.of(1, 2, 3, 456000000), conversion.fromInt(3723456, null, null));
    assertEquals(Integer.valueOf(3723456), conversion.toInt(LocalTime.of(1, 2, 3, 456789000), null, null));
  }

  @Test
  public void timeMicrosConversionConvertsMicrosOfDayAndExposesMetadata() {
    TimeMicrosConversion conversion = new TimeMicrosConversion();

    assertEquals(LocalTime.class, conversion.getConvertedType());
    assertEquals("time-micros", conversion.getLogicalTypeName());
    assertRecommendedSchema(conversion.getRecommendedSchema(), Schema.Type.LONG, "time-micros");

    assertEquals(LocalTime.MIDNIGHT, conversion.fromLong(0L, null, null));
    assertEquals(LocalTime.of(1, 2, 3, 456789000), conversion.fromLong(3723456789L, null, null));
    assertEquals(Long.valueOf(3723456789L), conversion.toLong(LocalTime.of(1, 2, 3, 456789123), null, null));
  }

  @Test
  public void timestampMillisConversionConvertsEpochMillisAndTruncatesSetterValue() {
    TimestampMillisConversion conversion = new TimestampMillisConversion();

    assertEquals(Instant.class, conversion.getConvertedType());
    assertEquals("timestamp-millis", conversion.getLogicalTypeName());
    assertRecommendedSchema(conversion.getRecommendedSchema(), Schema.Type.LONG, "timestamp-millis");

    assertEquals(Instant.EPOCH, conversion.fromLong(0L, null, null));
    assertEquals(Instant.parse("2024-03-28T12:34:56.789Z"), conversion.fromLong(1711629296789L, null, null));
    assertEquals(Long.valueOf(1711629296789L),
        conversion.toLong(Instant.parse("2024-03-28T12:34:56.789123456Z"), null, null));
    assertEquals("target = value.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);",
        conversion.adjustAndSetValue("target", "value"));
  }

  @Test
  public void timestampMicrosConversionConvertsEpochMicrosAndTruncatesSetterValue() {
    TimestampMicrosConversion conversion = new TimestampMicrosConversion();

    assertEquals(Instant.class, conversion.getConvertedType());
    assertEquals("timestamp-micros", conversion.getLogicalTypeName());
    assertRecommendedSchema(conversion.getRecommendedSchema(), Schema.Type.LONG, "timestamp-micros");

    assertEquals(Instant.EPOCH, conversion.fromLong(0L, null, null));
    assertEquals(Instant.parse("2024-03-28T12:34:56.789123Z"), conversion.fromLong(1711629296789123L, null, null));
    assertEquals(Long.valueOf(1711629296789123L),
        conversion.toLong(Instant.parse("2024-03-28T12:34:56.789123456Z"), null, null));
    assertEquals("target = value.truncatedTo(java.time.temporal.ChronoUnit.MICROS);",
        conversion.adjustAndSetValue("target", "value"));
  }

  @Test
  public void timestampNanosConversionConvertsEpochNanosAndUsesDefaultSetterValue() {
    TimestampNanosConversion conversion = new TimestampNanosConversion();

    assertEquals(Instant.class, conversion.getConvertedType());
    assertEquals("timestamp-nanos", conversion.getLogicalTypeName());
    assertRecommendedSchema(conversion.getRecommendedSchema(), Schema.Type.LONG, "timestamp-nanos");

    assertEquals(Instant.EPOCH, conversion.fromLong(0L, null, null));
    assertEquals(Instant.parse("2024-03-28T12:34:56.789123456Z"),
        conversion.fromLong(1711629296789123456L, null, null));
    assertEquals(Long.valueOf(1711629296789123456L),
        conversion.toLong(Instant.parse("2024-03-28T12:34:56.789123456Z"), null, null));
    assertEquals("target = value.truncatedTo(java.time.temporal.ChronoUnit.NANOS);",
        conversion.adjustAndSetValue("target", "value"));
  }

  @Test
  public void localTimestampMillisConversionUsesUtcEpochMillisAndExposesMetadata() {
    LocalTimestampMillisConversion conversion = new LocalTimestampMillisConversion();
    LocalDateTime value = LocalDateTime.of(2024, 3, 28, 12, 34, 56, 789123456);

    assertEquals(LocalDateTime.class, conversion.getConvertedType());
    assertEquals("local-timestamp-millis", conversion.getLogicalTypeName());
    assertRecommendedSchema(conversion.getRecommendedSchema(), Schema.Type.LONG, "local-timestamp-millis");

    assertEquals(LocalDateTime.of(1970, 1, 1, 0, 0), conversion.fromLong(0L, null, null));
    assertEquals(LocalDateTime.of(2024, 3, 28, 12, 34, 56, 789000000), conversion.fromLong(1711629296789L, null, null));
    assertEquals(Long.valueOf(value.toInstant(ZoneOffset.UTC).toEpochMilli()), conversion.toLong(value, null, null));
    assertEquals("target = value;", conversion.adjustAndSetValue("target", "value"));
  }

  @Test
  public void localTimestampMicrosConversionUsesUtcEpochMicrosAndExposesMetadata() {
    LocalTimestampMicrosConversion conversion = new LocalTimestampMicrosConversion();
    LocalDateTime value = LocalDateTime.of(2024, 3, 28, 12, 34, 56, 789123456);

    assertEquals(LocalDateTime.class, conversion.getConvertedType());
    assertEquals("local-timestamp-micros", conversion.getLogicalTypeName());
    assertRecommendedSchema(conversion.getRecommendedSchema(), Schema.Type.LONG, "local-timestamp-micros");

    assertEquals(LocalDateTime.of(1970, 1, 1, 0, 0), conversion.fromLong(0L, null, null));
    assertEquals(LocalDateTime.of(2024, 3, 28, 12, 34, 56, 789123000),
        conversion.fromLong(1711629296789123L, null, null));
    assertEquals(Long.valueOf(1711629296789123L), conversion.toLong(value, null, null));
    assertEquals("target = value;", conversion.adjustAndSetValue("target", "value"));
  }

  @Test
  public void localTimestampNanosConversionUsesUtcEpochNanosAndExposesMetadata() {
    LocalTimestampNanosConversion conversion = new LocalTimestampNanosConversion();
    LocalDateTime value = LocalDateTime.of(2024, 3, 28, 12, 34, 56, 789123456);

    assertEquals(LocalDateTime.class, conversion.getConvertedType());
    assertEquals("local-timestamp-nanos", conversion.getLogicalTypeName());
    assertRecommendedSchema(conversion.getRecommendedSchema(), Schema.Type.LONG, "local-timestamp-nanos");

    assertEquals(LocalDateTime.of(1970, 1, 1, 0, 0), conversion.fromLong(0L, null, null));
    assertEquals(value, conversion.fromLong(1711629296789123456L, null, null));
    assertEquals(Long.valueOf(1711629296789123456L), conversion.toLong(value, null, null));
    assertEquals("target = value;", conversion.adjustAndSetValue("target", "value"));
  }

  private static void assertRecommendedSchema(Schema schema, Schema.Type primitiveType, String logicalTypeName) {
    assertEquals(primitiveType, schema.getType());
    assertEquals(logicalTypeName, schema.getLogicalType().getName());
  }
}
