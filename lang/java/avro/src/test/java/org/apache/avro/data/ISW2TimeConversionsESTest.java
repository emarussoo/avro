package org.apache.avro.data;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

import org.apache.avro.LogicalType;
import org.apache.avro.Schema;
import org.junit.Test;

public class ISW2TimeConversionsESTest {

  @Test(timeout = 4000)
  public void dateConversion_ESTest_test0() throws Throwable {
    TimeConversions.DateConversion timeConversions_DateConversion0 = new TimeConversions.DateConversion();
    Class<LocalDate> class0 = timeConversions_DateConversion0.getConvertedType();
    assertFalse(class0.isSynthetic());
  }

  @Test(timeout = 4000)
  public void dateConversion_ESTest_test1() throws Throwable {
    TimeConversions.DateConversion timeConversions_DateConversion0 = new TimeConversions.DateConversion();
    LocalDate localDate0 = LocalDate.ofEpochDay(16115L);
    Schema.Type schema_Type0 = Schema.Type.INT;
    Schema schema0 = Schema.create(schema_Type0);
    Integer integer0 = timeConversions_DateConversion0.toInt(localDate0, schema0, (LogicalType) null);
    assertEquals(16115, (int) integer0);
  }

  @Test(timeout = 4000)
  public void dateConversion_ESTest_test2() throws Throwable {
    TimeConversions.DateConversion timeConversions_DateConversion0 = new TimeConversions.DateConversion();
    Schema schema0 = timeConversions_DateConversion0.getRecommendedSchema();
    assertEquals(Schema.Type.INT, schema0.getType());
  }

  @Test(timeout = 4000)
  public void dateConversion_ESTest_test3() throws Throwable {
    TimeConversions.DateConversion timeConversions_DateConversion0 = new TimeConversions.DateConversion();
    Integer integer0 = Integer.valueOf(1);
    Schema.Type schema_Type0 = Schema.Type.FLOAT;
    Schema schema0 = Schema.create(schema_Type0);
    LocalDate localDate0 = timeConversions_DateConversion0.fromInt(integer0, schema0, (LogicalType) null);
    assertNotNull(localDate0);
  }

  @Test(timeout = 4000)
  public void dateConversion_ESTest_test4() throws Throwable {
    TimeConversions.DateConversion timeConversions_DateConversion0 = new TimeConversions.DateConversion();
    String string0 = timeConversions_DateConversion0.getLogicalTypeName();
    assertEquals("date", string0);
  }

  @Test(timeout = 4000)
  public void localTimestampMicrosConversion_ESTest_test0() throws Throwable {
    TimeConversions.LocalTimestampMicrosConversion timeConversions_LocalTimestampMicrosConversion0 = new TimeConversions.LocalTimestampMicrosConversion();
    String string0 = timeConversions_LocalTimestampMicrosConversion0.getLogicalTypeName();
    assertEquals("local-timestamp-micros", string0);
  }

  @Test(timeout = 4000)
  public void localTimestampMicrosConversion_ESTest_test1() throws Throwable {
    TimeConversions.LocalTimestampMicrosConversion timeConversions_LocalTimestampMicrosConversion0 = new TimeConversions.LocalTimestampMicrosConversion();
    Class<LocalDateTime> class0 = timeConversions_LocalTimestampMicrosConversion0.getConvertedType();
    assertEquals(17, class0.getModifiers());
  }

  @Test(timeout = 4000)
  public void localTimestampMicrosConversion_ESTest_test2() throws Throwable {
    TimeConversions.LocalTimestampMicrosConversion timeConversions_LocalTimestampMicrosConversion0 = new TimeConversions.LocalTimestampMicrosConversion();
    Long long0 = Long.valueOf((-1L));
    Schema schema0 = timeConversions_LocalTimestampMicrosConversion0.getRecommendedSchema();
    LogicalType logicalType0 = new LogicalType(".(Q'^xn9AL [B^>F4");
    LocalDateTime localDateTime0 = timeConversions_LocalTimestampMicrosConversion0.fromLong(long0, schema0,
        logicalType0);
    Long long1 = timeConversions_LocalTimestampMicrosConversion0.toLong(localDateTime0, schema0, logicalType0);
    assertEquals((-1L), (long) long1);
  }

  @Test(timeout = 4000)
  public void localTimestampMillisConversion_ESTest_test0() throws Throwable {
    TimeConversions.LocalTimestampMillisConversion timeConversions_LocalTimestampMillisConversion0 = new TimeConversions.LocalTimestampMillisConversion();
    Long long0 = Long.valueOf(0L);
    Schema schema0 = timeConversions_LocalTimestampMillisConversion0.getRecommendedSchema();
    LocalDateTime localDateTime0 = timeConversions_LocalTimestampMillisConversion0.fromLong(long0, schema0,
        (LogicalType) null);
    assertNotNull(localDateTime0);
  }

  @Test(timeout = 4000)
  public void localTimestampMillisConversion_ESTest_test1() throws Throwable {
    TimeConversions.LocalTimestampMillisConversion timeConversions_LocalTimestampMillisConversion0 = new TimeConversions.LocalTimestampMillisConversion();
    ZoneId zoneId0 = ZoneId.systemDefault();
    Clock clock0 = Clock.tickMillis(zoneId0);
    LocalDateTime localDateTime0 = LocalDateTime.now(clock0);
    LogicalType logicalType0 = new LogicalType("");
    timeConversions_LocalTimestampMillisConversion0.toLong(localDateTime0, (Schema) null, logicalType0);
  }

  @Test(timeout = 4000)
  public void localTimestampMillisConversion_ESTest_test2() throws Throwable {
    TimeConversions.LocalTimestampMillisConversion timeConversions_LocalTimestampMillisConversion0 = new TimeConversions.LocalTimestampMillisConversion();
    Schema schema0 = timeConversions_LocalTimestampMillisConversion0.getRecommendedSchema();
    assertNull(schema0.getDoc());
  }

  @Test(timeout = 4000)
  public void localTimestampMillisConversion_ESTest_test3() throws Throwable {
    TimeConversions.LocalTimestampMillisConversion timeConversions_LocalTimestampMillisConversion0 = new TimeConversions.LocalTimestampMillisConversion();
    Class<LocalDateTime> class0 = timeConversions_LocalTimestampMillisConversion0.getConvertedType();
    assertFalse(class0.isPrimitive());
  }

  @Test(timeout = 4000)
  public void localTimestampMillisConversion_ESTest_test4() throws Throwable {
    TimeConversions.LocalTimestampMillisConversion timeConversions_LocalTimestampMillisConversion0 = new TimeConversions.LocalTimestampMillisConversion();
    String string0 = timeConversions_LocalTimestampMillisConversion0.getLogicalTypeName();
    assertEquals("local-timestamp-millis", string0);
  }

  @Test(timeout = 4000)
  public void localTimestampNanosConversion_ESTest_test0() throws Throwable {
    TimeConversions.LocalTimestampNanosConversion timeConversions_LocalTimestampNanosConversion0 = new TimeConversions.LocalTimestampNanosConversion();
    LocalDateTime localDateTime0 = LocalDateTime.of(2014, 2, 14, 20, 21, 21, 320000000);
    Schema schema0 = Schema.create(Schema.Type.LONG);
    LogicalType logicalType0 = new LogicalType("local-timestamp-nanos");
    Long long0 = timeConversions_LocalTimestampNanosConversion0.toLong(localDateTime0, schema0, logicalType0);
    assertEquals(1392409281320000000L, (long) long0);
  }

  @Test(timeout = 4000)
  public void localTimestampNanosConversion_ESTest_test1() throws Throwable {
    TimeConversions.LocalTimestampNanosConversion timeConversions_LocalTimestampNanosConversion0 = new TimeConversions.LocalTimestampNanosConversion();
    Class<LocalDateTime> class0 = timeConversions_LocalTimestampNanosConversion0.getConvertedType();
    assertFalse(class0.isArray());
  }

  @Test(timeout = 4000)
  public void localTimestampNanosConversion_ESTest_test2() throws Throwable {
    TimeConversions.LocalTimestampNanosConversion timeConversions_LocalTimestampNanosConversion0 = new TimeConversions.LocalTimestampNanosConversion();
    String string0 = timeConversions_LocalTimestampNanosConversion0.getLogicalTypeName();
    assertEquals("local-timestamp-nanos", string0);
  }

  @Test(timeout = 4000)
  public void localTimestampNanosConversion_ESTest_test3() throws Throwable {
    TimeConversions.LocalTimestampNanosConversion timeConversions_LocalTimestampNanosConversion0 = new TimeConversions.LocalTimestampNanosConversion();
    Schema schema0 = timeConversions_LocalTimestampNanosConversion0.getRecommendedSchema();
    Long long0 = Long.valueOf(0L);
    LogicalType logicalType0 = schema0.getLogicalType();
    LocalDateTime localDateTime0 = timeConversions_LocalTimestampNanosConversion0.fromLong(long0, schema0,
        logicalType0);
    assertNotNull(localDateTime0);
  }

  @Test(timeout = 4000)
  public void timeMicrosConversion_ESTest_test0() throws Throwable {
    TimeConversions.TimeMicrosConversion timeConversions_TimeMicrosConversion0 = new TimeConversions.TimeMicrosConversion();
    Long long0 = Long.valueOf(226L);
    Schema schema0 = Schema.create(Schema.Type.LONG);
    LocalTime localTime0 = timeConversions_TimeMicrosConversion0.fromLong(long0, schema0, (LogicalType) null);
    assertNotNull(localTime0);
  }

  @Test(timeout = 4000)
  public void timeMicrosConversion_ESTest_test1() throws Throwable {
    TimeConversions.TimeMicrosConversion timeConversions_TimeMicrosConversion0 = new TimeConversions.TimeMicrosConversion();
    ZoneOffset zoneOffset0 = ZoneOffset.MAX;
    LocalTime localTime0 = LocalTime.of(14, 21, 21, 320000000);
    Schema schema0 = Schema.create(Schema.Type.LONG);
    Long long0 = timeConversions_TimeMicrosConversion0.toLong(localTime0, schema0, (LogicalType) null);
    assertEquals(51681320000L, (long) long0);
    assertNotNull(zoneOffset0);
  }

  @Test(timeout = 4000)
  public void timeMicrosConversion_ESTest_test2() throws Throwable {
    TimeConversions.TimeMicrosConversion timeConversions_TimeMicrosConversion0 = new TimeConversions.TimeMicrosConversion();
    String string0 = timeConversions_TimeMicrosConversion0.getLogicalTypeName();
    assertEquals("time-micros", string0);
  }

  @Test(timeout = 4000)
  public void timeMicrosConversion_ESTest_test3() throws Throwable {
    TimeConversions.TimeMicrosConversion timeConversions_TimeMicrosConversion0 = new TimeConversions.TimeMicrosConversion();
    Schema schema0 = timeConversions_TimeMicrosConversion0.getRecommendedSchema();
    assertEquals(Schema.Type.LONG, schema0.getType());
  }

  @Test(timeout = 4000)
  public void timeMicrosConversion_ESTest_test4() throws Throwable {
    TimeConversions.TimeMicrosConversion timeConversions_TimeMicrosConversion0 = new TimeConversions.TimeMicrosConversion();
    String string0 = timeConversions_TimeMicrosConversion0.adjustAndSetValue("?", "");
    assertEquals("? = .truncatedTo(java.time.temporal.ChronoUnit.MICROS);", string0);
  }

  @Test(timeout = 4000)
  public void timeMicrosConversion_ESTest_test5() throws Throwable {
    TimeConversions.TimeMicrosConversion timeConversions_TimeMicrosConversion0 = new TimeConversions.TimeMicrosConversion();
    Class<LocalTime> class0 = timeConversions_TimeMicrosConversion0.getConvertedType();
    assertFalse(class0.isArray());
  }

  @Test(timeout = 4000)
  public void timeMillisConversion_ESTest_test0() throws Throwable {
    TimeConversions.TimeMillisConversion timeConversions_TimeMillisConversion0 = new TimeConversions.TimeMillisConversion();
    String string0 = timeConversions_TimeMillisConversion0.adjustAndSetValue("iD\"*+z<)A~md\u007F", "logicalType");
    assertEquals("iD\"*+z<)A~md\u007F = logicalType.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);", string0);
  }

  @Test(timeout = 4000)
  public void timeMillisConversion_ESTest_test1() throws Throwable {
    TimeConversions.TimeMillisConversion timeConversions_TimeMillisConversion0 = new TimeConversions.TimeMillisConversion();
    Schema schema0 = timeConversions_TimeMillisConversion0.getRecommendedSchema();
    assertEquals(Schema.Type.INT, schema0.getType());
  }

  @Test(timeout = 4000)
  public void timeMillisConversion_ESTest_test2() throws Throwable {
    TimeConversions.TimeMillisConversion timeConversions_TimeMillisConversion0 = new TimeConversions.TimeMillisConversion();
    String string0 = timeConversions_TimeMillisConversion0.getLogicalTypeName();
    assertEquals("time-millis", string0);
  }

  @Test(timeout = 4000)
  public void timeMillisConversion_ESTest_test3() throws Throwable {
    TimeConversions.TimeMillisConversion timeConversions_TimeMillisConversion0 = new TimeConversions.TimeMillisConversion();
    Class<LocalTime> class0 = timeConversions_TimeMillisConversion0.getConvertedType();
    assertFalse(class0.isInterface());
  }

  @Test(timeout = 4000)
  public void timeMillisConversion_ESTest_test4() throws Throwable {
    TimeConversions.TimeMillisConversion timeConversions_TimeMillisConversion0 = new TimeConversions.TimeMillisConversion();
    LocalTime localTime0 = LocalTime.of(20, 21, 21, 320000000);
    Schema.Type schema_Type0 = Schema.Type.STRING;
    Schema schema0 = Schema.create(schema_Type0);
    Integer integer0 = timeConversions_TimeMillisConversion0.toInt(localTime0, schema0, (LogicalType) null);
    LocalTime localTime1 = timeConversions_TimeMillisConversion0.fromInt(integer0, schema0, (LogicalType) null);
    assertTrue(localTime1.equals((Object) localTime0));
  }

  @Test(timeout = 4000)
  public void timestampMicrosConversion_ESTest_test0() throws Throwable {
    TimeConversions.TimestampMicrosConversion timeConversions_TimestampMicrosConversion0 = new TimeConversions.TimestampMicrosConversion();
    Instant instant1 = Instant.ofEpochSecond(-1391409281L);
    Schema schema0 = Schema.create(Schema.Type.LONG);
    LogicalType logicalType0 = new LogicalType("");
    Long long0 = timeConversions_TimestampMicrosConversion0.toLong(instant1, schema0, logicalType0);
    assertEquals((-1391409281000000L), (long) long0);
  }

  @Test(timeout = 4000)
  public void timestampMicrosConversion_ESTest_test1() throws Throwable {
    TimeConversions.TimestampMicrosConversion timeConversions_TimestampMicrosConversion0 = new TimeConversions.TimestampMicrosConversion();
    Long long0 = Long.valueOf(0L);
    Schema schema0 = Schema.create(Schema.Type.LONG);
    Instant instant0 = timeConversions_TimestampMicrosConversion0.fromLong(long0, schema0, (LogicalType) null);
    Long long1 = timeConversions_TimestampMicrosConversion0.toLong(instant0, schema0, (LogicalType) null);
    assertEquals(0L, (long) long1);
  }

  @Test(timeout = 4000)
  public void timestampMicrosConversion_ESTest_test2() throws Throwable {
    TimeConversions.TimestampMicrosConversion timeConversions_TimestampMicrosConversion0 = new TimeConversions.TimestampMicrosConversion();
    Long long0 = Long.valueOf(3421L);
    Schema schema0 = Schema.create(Schema.Type.LONG);
    LogicalType logicalType0 = new LogicalType("org.apache.avro.data.TimeConversions$TimestampMicrosConversion");
    Instant instant0 = timeConversions_TimestampMicrosConversion0.fromLong(long0, schema0, logicalType0);
    Instant instant1 = instant0.minusMillis(3421L);
    Long long1 = timeConversions_TimestampMicrosConversion0.toLong(instant1, (Schema) null, (LogicalType) null);
    assertEquals((-3417579L), (long) long1);
  }

  @Test(timeout = 4000)
  public void timestampMicrosConversion_ESTest_test3() throws Throwable {
    TimeConversions.TimestampMicrosConversion timeConversions_TimestampMicrosConversion0 = new TimeConversions.TimestampMicrosConversion();
    String string0 = timeConversions_TimestampMicrosConversion0.adjustAndSetValue("logicalType", "BIG_INTEGER");
    assertEquals("logicalType = BIG_INTEGER.truncatedTo(java.time.temporal.ChronoUnit.MICROS);", string0);
  }

  @Test(timeout = 4000)
  public void timestampMicrosConversion_ESTest_test4() throws Throwable {
    TimeConversions.TimestampMicrosConversion timeConversions_TimestampMicrosConversion0 = new TimeConversions.TimestampMicrosConversion();
    Class<Instant> class0 = timeConversions_TimestampMicrosConversion0.getConvertedType();
    assertFalse(class0.isSynthetic());
  }

  @Test(timeout = 4000)
  public void timestampMicrosConversion_ESTest_test5() throws Throwable {
    TimeConversions.TimestampMicrosConversion timeConversions_TimestampMicrosConversion0 = new TimeConversions.TimestampMicrosConversion();
    Schema schema0 = timeConversions_TimestampMicrosConversion0.getRecommendedSchema();
    assertEquals(Schema.Type.LONG, schema0.getType());
  }

  @Test(timeout = 4000)
  public void timestampMicrosConversion_ESTest_test6() throws Throwable {
    TimeConversions.TimestampMicrosConversion timeConversions_TimestampMicrosConversion0 = new TimeConversions.TimestampMicrosConversion();
    String string0 = timeConversions_TimestampMicrosConversion0.getLogicalTypeName();
    assertEquals("timestamp-micros", string0);
  }

  @Test(timeout = 4000)
  public void timestampMillisConversion_ESTest_test0() throws Throwable {
    TimeConversions.TimestampMillisConversion timeConversions_TimestampMillisConversion0 = new TimeConversions.TimestampMillisConversion();
    Schema schema0 = timeConversions_TimestampMillisConversion0.getRecommendedSchema();
    try {
      timeConversions_TimestampMillisConversion0.fromLong((Long) null, schema0, (LogicalType) null);
      fail("Expecting exception: NullPointerException");
    } catch (NullPointerException e) {
      assertNotNull(e);
    }
  }

  @Test(timeout = 4000)
  public void timestampMillisConversion_ESTest_test1() throws Throwable {
    TimeConversions.TimestampMillisConversion timeConversions_TimestampMillisConversion0 = new TimeConversions.TimestampMillisConversion();
    Instant instant0 = Instant.ofEpochMilli(2054L);
    Schema schema0 = timeConversions_TimestampMillisConversion0.getRecommendedSchema();
    LogicalType logicalType0 = schema0.getLogicalType();
    Long long0 = timeConversions_TimestampMillisConversion0.toLong(instant0, schema0, logicalType0);
    assertEquals(2054L, (long) long0);
  }

  @Test(timeout = 4000)
  public void timestampMillisConversion_ESTest_test2() throws Throwable {
    TimeConversions.TimestampMillisConversion timeConversions_TimestampMillisConversion0 = new TimeConversions.TimestampMillisConversion();
    String string0 = timeConversions_TimestampMillisConversion0.getLogicalTypeName();
    assertEquals("timestamp-millis", string0);
  }

  @Test(timeout = 4000)
  public void timestampMillisConversion_ESTest_test3() throws Throwable {
    TimeConversions.TimestampMillisConversion timeConversions_TimestampMillisConversion0 = new TimeConversions.TimestampMillisConversion();
    String string0 = timeConversions_TimestampMillisConversion0.adjustAndSetValue("logicalType", "logicalType");
    assertEquals("logicalType = logicalType.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);", string0);
  }

  @Test(timeout = 4000)
  public void timestampMillisConversion_ESTest_test4() throws Throwable {
    TimeConversions.TimestampMillisConversion timeConversions_TimestampMillisConversion0 = new TimeConversions.TimestampMillisConversion();
    Class<Instant> class0 = timeConversions_TimestampMillisConversion0.getConvertedType();
    assertFalse(class0.isInterface());
  }

  @Test(timeout = 4000)
  public void timestampNanosConversion_ESTest_test0() throws Throwable {
    TimeConversions.TimestampNanosConversion timeConversions_TimestampNanosConversion0 = new TimeConversions.TimestampNanosConversion();
    Instant instant0 = Instant.ofEpochSecond(-2209075577L);
    LogicalType logicalType0 = new LogicalType("]}/5zOelg:]");
    Long long0 = timeConversions_TimestampNanosConversion0.toLong(instant0, (Schema) null, logicalType0);
    assertEquals((-2209075577000000000L), (long) long0);
  }

  @Test(timeout = 4000)
  public void timestampNanosConversion_ESTest_test1() throws Throwable {
    TimeConversions.TimestampNanosConversion timeConversions_TimestampNanosConversion0 = new TimeConversions.TimestampNanosConversion();
    Instant instant0 = Instant.ofEpochSecond(1392409281L, 320000000L);
    Schema schema0 = timeConversions_TimestampNanosConversion0.getRecommendedSchema();
    LogicalType logicalType0 = schema0.getLogicalType();
    Long long0 = timeConversions_TimestampNanosConversion0.toLong(instant0, schema0, logicalType0);
    assertEquals(1392409281320000000L, (long) long0);
  }

  @Test(timeout = 4000)
  public void timestampNanosConversion_ESTest_test2() throws Throwable {
    TimeConversions.TimestampNanosConversion timeConversions_TimestampNanosConversion0 = new TimeConversions.TimestampNanosConversion();
    Class<Instant> class0 = timeConversions_TimestampNanosConversion0.getConvertedType();
    assertEquals(17, class0.getModifiers());
  }

  @Test(timeout = 4000)
  public void timestampNanosConversion_ESTest_test3() throws Throwable {
    TimeConversions.TimestampNanosConversion timeConversions_TimestampNanosConversion0 = new TimeConversions.TimestampNanosConversion();
    String string0 = timeConversions_TimestampNanosConversion0.getLogicalTypeName();
    assertEquals("timestamp-nanos", string0);
  }

  @Test(timeout = 4000)
  public void timestampNanosConversion_ESTest_test4() throws Throwable {
    TimeConversions.TimestampNanosConversion timeConversions_TimestampNanosConversion0 = new TimeConversions.TimestampNanosConversion();
    String string0 = timeConversions_TimestampNanosConversion0.adjustAndSetValue("]}/5zOelg:]",
        "com.fasterxml.jackson.databind.MapperFeature");
    assertEquals(
        "]}/5zOelg:] = com.fasterxml.jackson.databind.MapperFeature.truncatedTo(java.time.temporal.ChronoUnit.NANOS);",
        string0);
  }

  @Test(timeout = 4000)
  public void timestampNanosConversion_ESTest_test5() throws Throwable {
    TimeConversions.TimestampNanosConversion timeConversions_TimestampNanosConversion0 = new TimeConversions.TimestampNanosConversion();
    Long long0 = Long.valueOf((-158L));
    LogicalType logicalType0 = new LogicalType("|]S! FOm");
    Instant instant0 = timeConversions_TimestampNanosConversion0.fromLong(long0, (Schema) null, logicalType0);
    Long long1 = timeConversions_TimestampNanosConversion0.toLong(instant0, (Schema) null, logicalType0);
    assertEquals(998999842L, (long) long1);
  }
}
