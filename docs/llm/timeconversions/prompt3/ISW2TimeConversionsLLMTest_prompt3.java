package org.apache.avro.data;

import static org.junit.Assert.assertEquals;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;

import org.apache.avro.LogicalTypes;
import org.apache.avro.Schema;
import org.junit.Test;

public class ISW2TimeConversionsLLMTest_old {

  @Test
  public void dateConversionConvertsEpochDayAndReportsMetadata() {
    TimeConversions.DateConversion conversion = new TimeConversions.DateConversion();

    LocalDate date = LocalDate.of(2024, 2, 29);
    int epochDay = 19782;

    assertEquals(LocalDate.class, conversion.getConvertedType());
    assertEquals(LogicalTypes.DATE.getName(), conversion.getLogicalTypeName());
    assertEquals(date, conversion.fromInt(epochDay, null, LogicalTypes.date()));
    assertEquals(Integer.valueOf(epochDay), conversion.toInt(date, null, LogicalTypes.date()));

    Schema schema = conversion.getRecommendedSchema();
    assertEquals(Schema.Type.INT, schema.getType());
    assertEquals(LogicalTypes.DATE.getName(), schema.getLogicalType().getName());
  }

  @Test
  public void timeMillisConversionConvertsLocalTimeAndReportsMetadata() {
    TimeConversions.TimeMillisConversion conversion = new TimeConversions.TimeMillisConversion();

    LocalTime time = LocalTime.of(12, 34, 56, 789_000_000);
    int millisAfterMidnight = 45_296_789;

    assertEquals(LocalTime.class, conversion.getConvertedType());
    assertEquals(LogicalTypes.TIME_MILLIS.getName(), conversion.getLogicalTypeName());
    assertEquals(time, conversion.fromInt(millisAfterMidnight, null, LogicalTypes.timeMillis()));
    assertEquals(Integer.valueOf(millisAfterMidnight), conversion.toInt(time, null, LogicalTypes.timeMillis()));

    Schema schema = conversion.getRecommendedSchema();
    assertEquals(Schema.Type.INT, schema.getType());
    assertEquals(LogicalTypes.TIME_MILLIS.getName(), schema.getLogicalType().getName());
  }

  @Test
  public void timeMicrosConversionConvertsLocalTimeAndReportsMetadata() {
    TimeConversions.TimeMicrosConversion conversion = new TimeConversions.TimeMicrosConversion();

    LocalTime time = LocalTime.of(1, 2, 3, 456_789_000);
    long microsAfterMidnight = 3_723_456_789L;

    assertEquals(LocalTime.class, conversion.getConvertedType());
    assertEquals(LogicalTypes.TIME_MICROS.getName(), conversion.getLogicalTypeName());
    assertEquals(time, conversion.fromLong(microsAfterMidnight, null, LogicalTypes.timeMicros()));
    assertEquals(Long.valueOf(microsAfterMidnight), conversion.toLong(time, null, LogicalTypes.timeMicros()));

    Schema schema = conversion.getRecommendedSchema();
    assertEquals(Schema.Type.LONG, schema.getType());
    assertEquals(LogicalTypes.TIME_MICROS.getName(), schema.getLogicalType().getName());
  }

  @Test
  public void timestampMillisConversionConvertsInstantTruncatesSetterAndReportsMetadata() {
    TimeConversions.TimestampMillisConversion conversion = new TimeConversions.TimestampMillisConversion();

    Instant timestamp = Instant.parse("2020-01-02T03:04:05.678Z");
    long millisFromEpoch = 1_577_933_045_678L;

    assertEquals(Instant.class, conversion.getConvertedType());
    assertEquals(LogicalTypes.TIMESTAMP_MILLIS.getName(), conversion.getLogicalTypeName());
    assertEquals(timestamp, conversion.fromLong(millisFromEpoch, null, LogicalTypes.timestampMillis()));
    assertEquals(Long.valueOf(millisFromEpoch), conversion.toLong(timestamp, null, LogicalTypes.timestampMillis()));
    assertEquals("target = value.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);",
        conversion.adjustAndSetValue("target", "value"));

    Schema schema = conversion.getRecommendedSchema();
    assertEquals(Schema.Type.LONG, schema.getType());
    assertEquals(LogicalTypes.TIMESTAMP_MILLIS.getName(), schema.getLogicalType().getName());
  }

  @Test
  public void timestampMicrosConversionConvertsInstantTruncatesSetterAndReportsMetadata() {
    TimeConversions.TimestampMicrosConversion conversion = new TimeConversions.TimestampMicrosConversion();

    Instant timestamp = Instant.parse("2020-01-02T03:04:05.678901Z");
    long microsFromEpoch = 1_577_933_045_678_901L;

    assertEquals(Instant.class, conversion.getConvertedType());
    assertEquals(LogicalTypes.TIMESTAMP_MICROS.getName(), conversion.getLogicalTypeName());
    assertEquals(timestamp, conversion.fromLong(microsFromEpoch, null, LogicalTypes.timestampMicros()));
    assertEquals(Long.valueOf(microsFromEpoch), conversion.toLong(timestamp, null, LogicalTypes.timestampMicros()));
    assertEquals("target = value.truncatedTo(java.time.temporal.ChronoUnit.MICROS);",
        conversion.adjustAndSetValue("target", "value"));

    Schema schema = conversion.getRecommendedSchema();
    assertEquals(Schema.Type.LONG, schema.getType());
    assertEquals(LogicalTypes.TIMESTAMP_MICROS.getName(), schema.getLogicalType().getName());
  }

  @Test
  public void timestampNanosConversionConvertsInstantAndReportsMetadata() {
    TimeConversions.TimestampNanosConversion conversion = new TimeConversions.TimestampNanosConversion();

    Instant timestamp = Instant.parse("2020-01-02T03:04:05.678901234Z");
    long nanosFromEpoch = 1_577_933_045_678_901_234L;

    assertEquals(Instant.class, conversion.getConvertedType());
    assertEquals(LogicalTypes.TIMESTAMP_NANOS.getName(), conversion.getLogicalTypeName());
    assertEquals(timestamp, conversion.fromLong(nanosFromEpoch, null, LogicalTypes.timestampNanos()));
    assertEquals(Long.valueOf(nanosFromEpoch), conversion.toLong(timestamp, null, LogicalTypes.timestampNanos()));

    Schema schema = conversion.getRecommendedSchema();
    assertEquals(Schema.Type.LONG, schema.getType());
    assertEquals(LogicalTypes.TIMESTAMP_NANOS.getName(), schema.getLogicalType().getName());
  }

  @Test
  public void localTimestampMillisConversionUsesUtcEpochMathAndReportsMetadata() {
    TimeConversions.LocalTimestampMillisConversion conversion = new TimeConversions.LocalTimestampMillisConversion();

    LocalDateTime localTimestamp = LocalDateTime.of(2020, 1, 2, 3, 4, 5, 678_000_000);
    long millisFromEpoch = localTimestamp.toInstant(ZoneOffset.UTC).toEpochMilli();

    assertEquals(LocalDateTime.class, conversion.getConvertedType());
    assertEquals(LogicalTypes.LOCAL_TIMESTAMP_MILLIS.getName(), conversion.getLogicalTypeName());
    assertEquals(localTimestamp, conversion.fromLong(millisFromEpoch, null, LogicalTypes.localTimestampMillis()));
    assertEquals(Long.valueOf(millisFromEpoch),
        conversion.toLong(localTimestamp, null, LogicalTypes.localTimestampMillis()));
    assertEquals("target = value.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);",
        conversion.adjustAndSetValue("target", "value"));

    Schema schema = conversion.getRecommendedSchema();
    assertEquals(Schema.Type.LONG, schema.getType());
    assertEquals(LogicalTypes.LOCAL_TIMESTAMP_MILLIS.getName(), schema.getLogicalType().getName());
  }

  @Test
  public void localTimestampMicrosConversionUsesUtcEpochMathAndReportsMetadata() {
    TimeConversions.LocalTimestampMicrosConversion conversion = new TimeConversions.LocalTimestampMicrosConversion();

    LocalDateTime localTimestamp = LocalDateTime.of(2020, 1, 2, 3, 4, 5, 678_901_000);
    long microsFromEpoch = ChronoUnit.MICROS.between(LocalDateTime.ofEpochSecond(0, 0, ZoneOffset.UTC), localTimestamp);

    assertEquals(LocalDateTime.class, conversion.getConvertedType());
    assertEquals(LogicalTypes.LOCAL_TIMESTAMP_MICROS.getName(), conversion.getLogicalTypeName());
    assertEquals(localTimestamp, conversion.fromLong(microsFromEpoch, null, LogicalTypes.localTimestampMicros()));
    assertEquals(Long.valueOf(microsFromEpoch),
        conversion.toLong(localTimestamp, null, LogicalTypes.localTimestampMicros()));
    assertEquals("target = value.truncatedTo(java.time.temporal.ChronoUnit.MICROS);",
        conversion.adjustAndSetValue("target", "value"));

    Schema schema = conversion.getRecommendedSchema();
    assertEquals(Schema.Type.LONG, schema.getType());
    assertEquals(LogicalTypes.LOCAL_TIMESTAMP_MICROS.getName(), schema.getLogicalType().getName());
  }

  @Test
  public void localTimestampNanosConversionUsesUtcEpochMathAndReportsMetadata() {
    TimeConversions.LocalTimestampNanosConversion conversion = new TimeConversions.LocalTimestampNanosConversion();

    LocalDateTime localTimestamp = LocalDateTime.of(2020, 1, 2, 3, 4, 5, 678_901_234);
    long nanosFromEpoch = ChronoUnit.NANOS.between(LocalDateTime.ofEpochSecond(0, 0, ZoneOffset.UTC), localTimestamp);

    assertEquals(LocalDateTime.class, conversion.getConvertedType());
    assertEquals(LogicalTypes.LOCAL_TIMESTAMP_NANOS.getName(), conversion.getLogicalTypeName());
    assertEquals(localTimestamp, conversion.fromLong(nanosFromEpoch, null, LogicalTypes.localTimestampNanos()));
    assertEquals(Long.valueOf(nanosFromEpoch),
        conversion.toLong(localTimestamp, null, LogicalTypes.localTimestampNanos()));

    Schema schema = conversion.getRecommendedSchema();
    assertEquals(Schema.Type.LONG, schema.getType());
    assertEquals(LogicalTypes.LOCAL_TIMESTAMP_NANOS.getName(), schema.getLogicalType().getName());
  }
}
