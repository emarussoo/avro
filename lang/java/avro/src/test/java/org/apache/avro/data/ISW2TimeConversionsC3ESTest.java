package org.apache.avro.data;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.apache.avro.LogicalType;
import org.apache.avro.Schema;
import org.junit.Test;

public class ISW2TimeConversionsC3ESTest {

  /*
   * Valore deterministico osservato nell'ambiente mock di EvoSuite:
   * 2014-02-14T20:21:21.320.
   */
  private static final LocalDateTime EVOSUITE_DATE_TIME = LocalDateTime.of(2014, 2, 14, 20, 21, 21, 320000000);

  /*
   * Corrispondente Instant UTC usato dai test generati con MockInstant.now().
   */
  private static final Instant EVOSUITE_INSTANT = Instant.ofEpochSecond(1392409281L, 320000000L);

  // -------------------------------------------------------------------------
  // DateConversion
  // -------------------------------------------------------------------------

  @Test(timeout = 4000)
  public void dateConversion_ESTest_test0() throws Throwable {
    TimeConversions.DateConversion conversion = new TimeConversions.DateConversion();

    Class<LocalDate> convertedType = conversion.getConvertedType();

    assertEquals("class java.time.LocalDate", convertedType.toString());
  }

  @Test(timeout = 4000)
  public void dateConversion_ESTest_test1() throws Throwable {
    TimeConversions.DateConversion conversion = new TimeConversions.DateConversion();

    LocalDate date = LocalDate.ofEpochDay(-1193L);
    Schema schema = Schema.create(Schema.Type.STRING);

    Integer result = conversion.toInt(date, schema, null);

    assertEquals(-1193, result.intValue());
  }

  @Test(timeout = 4000)
  public void dateConversion_ESTest_test2() throws Throwable {
    TimeConversions.DateConversion conversion = new TimeConversions.DateConversion();

    Schema schema = conversion.getRecommendedSchema();

    assertNull(schema.getDoc());
  }

  @Test(timeout = 4000)
  public void dateConversion_ESTest_test3() throws Throwable {
    TimeConversions.DateConversion conversion = new TimeConversions.DateConversion();

    Integer input = Integer.valueOf(201);
    LogicalType logicalType = new LogicalType("e");

    LocalDate result = conversion.fromInt(input, null, logicalType);

    assertNotNull(result);
  }

  @Test(timeout = 4000)
  public void dateConversion_ESTest_test4() throws Throwable {
    TimeConversions.DateConversion conversion = new TimeConversions.DateConversion();

    String result = conversion.getLogicalTypeName();

    assertEquals("date", result);
  }

  // -------------------------------------------------------------------------
  // LocalTimestampMicrosConversion
  // -------------------------------------------------------------------------

  @Test(timeout = 4000)
  public void localTimestampMicrosConversion_ESTest_test0() throws Throwable {
    TimeConversions.LocalTimestampMicrosConversion conversion = new TimeConversions.LocalTimestampMicrosConversion();

    String result = conversion.getLogicalTypeName();

    assertEquals("local-timestamp-micros", result);
  }

  @Test(timeout = 4000)
  public void localTimestampMicrosConversion_ESTest_test1() throws Throwable {
    TimeConversions.LocalTimestampMicrosConversion conversion = new TimeConversions.LocalTimestampMicrosConversion();

    Class<LocalDateTime> convertedType = conversion.getConvertedType();

    assertFalse(convertedType.isPrimitive());
  }

  @Test(timeout = 4000)
  public void localTimestampMicrosConversion_ESTest_test2() throws Throwable {
    TimeConversions.LocalTimestampMicrosConversion conversion = new TimeConversions.LocalTimestampMicrosConversion();

    Schema schema = conversion.getRecommendedSchema();
    LogicalType logicalType = new LogicalType("local-timestamp-micros");

    try {
      conversion.fromLong(null, schema, logicalType);
      fail("Expecting exception: NullPointerException");
    } catch (NullPointerException e) {
      assertNotNull(e);
    }
  }

  @Test(timeout = 4000)
  public void localTimestampMicrosConversion_ESTest_test3() throws Throwable {
    TimeConversions.LocalTimestampMicrosConversion conversion = new TimeConversions.LocalTimestampMicrosConversion();

    LogicalType logicalType = new LogicalType("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder");

    Long result = conversion.toLong(EVOSUITE_DATE_TIME, null, logicalType);

    assertEquals(1392409281320000L, result.longValue());
  }

  // -------------------------------------------------------------------------
  // LocalTimestampMillisConversion
  // -------------------------------------------------------------------------

  @Test(timeout = 4000)
  public void localTimestampMillisConversion_ESTest_test0() throws Throwable {
    TimeConversions.LocalTimestampMillisConversion conversion = new TimeConversions.LocalTimestampMillisConversion();

    LogicalType logicalType = new LogicalType("java.util.");

    Long result = conversion.toLong(EVOSUITE_DATE_TIME, null, logicalType);

    assertEquals(1392409281320L, result.longValue());
  }

  @Test(timeout = 4000)
  public void localTimestampMillisConversion_ESTest_test1() throws Throwable {
    TimeConversions.LocalTimestampMillisConversion conversion = new TimeConversions.LocalTimestampMillisConversion();

    Schema schema = conversion.getRecommendedSchema();
    LogicalType logicalType = new LogicalType("local-timestamp-millis");

    try {
      conversion.fromLong(null, schema, logicalType);
      fail("Expecting exception: NullPointerException");
    } catch (NullPointerException e) {
      assertNotNull(e);
    }
  }

  @Test(timeout = 4000)
  public void localTimestampMillisConversion_ESTest_test2() throws Throwable {
    TimeConversions.LocalTimestampMillisConversion conversion = new TimeConversions.LocalTimestampMillisConversion();

    Class<LocalDateTime> convertedType = conversion.getConvertedType();

    assertEquals("class java.time.LocalDateTime", convertedType.toString());
  }

  @Test(timeout = 4000)
  public void localTimestampMillisConversion_ESTest_test3() throws Throwable {
    TimeConversions.LocalTimestampMillisConversion conversion = new TimeConversions.LocalTimestampMillisConversion();

    String result = conversion.getLogicalTypeName();

    assertEquals("local-timestamp-millis", result);
  }

  // -------------------------------------------------------------------------
  // LocalTimestampNanosConversion
  // -------------------------------------------------------------------------

  @Test(timeout = 4000)
  public void localTimestampNanosConversion_ESTest_test0() throws Throwable {
    TimeConversions.LocalTimestampNanosConversion conversion = new TimeConversions.LocalTimestampNanosConversion();

    Class<LocalDateTime> convertedType = conversion.getConvertedType();

    assertFalse(convertedType.isSynthetic());
  }

  @Test(timeout = 4000)
  public void localTimestampNanosConversion_ESTest_test1() throws Throwable {
    TimeConversions.LocalTimestampNanosConversion conversion = new TimeConversions.LocalTimestampNanosConversion();

    String result = conversion.getLogicalTypeName();

    assertEquals("local-timestamp-nanos", result);
  }

  @Test(timeout = 4000)
  public void localTimestampNanosConversion_ESTest_test2() throws Throwable {
    TimeConversions.LocalTimestampNanosConversion conversion = new TimeConversions.LocalTimestampNanosConversion();

    LogicalType logicalType = new LogicalType(": was expecting closing quote for a string value");

    Long result = conversion.toLong(EVOSUITE_DATE_TIME, null, logicalType);

    assertEquals(1392409281320000000L, result.longValue());
  }

  @Test(timeout = 4000)
  public void localTimestampNanosConversion_ESTest_test3() throws Throwable {
    TimeConversions.LocalTimestampNanosConversion conversion = new TimeConversions.LocalTimestampNanosConversion();

    Schema schema = conversion.getRecommendedSchema();
    LogicalType logicalType = new LogicalType("local-timestamp-nanos");

    try {
      conversion.fromLong(null, schema, logicalType);
      fail("Expecting exception: NullPointerException");
    } catch (NullPointerException e) {
      assertNotNull(e);
    }
  }

  // -------------------------------------------------------------------------
  // TimeMicrosConversion
  // -------------------------------------------------------------------------

  @Test(timeout = 4000)
  public void timeMicrosConversion_ESTest_test0() throws Throwable {
    TimeConversions.TimeMicrosConversion conversion = new TimeConversions.TimeMicrosConversion();

    Long input = Long.valueOf(1675L);
    Schema schema = conversion.getRecommendedSchema();
    LogicalType logicalType = new LogicalType("");

    LocalTime time = conversion.fromLong(input, schema, logicalType);
    Long result = conversion.toLong(time, schema, logicalType);

    assertTrue(result.equals(input));
  }

  @Test(timeout = 4000)
  public void timeMicrosConversion_ESTest_test1() throws Throwable {
    TimeConversions.TimeMicrosConversion conversion = new TimeConversions.TimeMicrosConversion();

    String result = conversion.getLogicalTypeName();

    assertEquals("time-micros", result);
  }

  @Test(timeout = 4000)
  public void timeMicrosConversion_ESTest_test2() throws Throwable {
    TimeConversions.TimeMicrosConversion conversion = new TimeConversions.TimeMicrosConversion();

    Schema schema = conversion.getRecommendedSchema();

    assertEquals(Schema.Type.LONG, schema.getType());
  }

  @Test(timeout = 4000)
  public void timeMicrosConversion_ESTest_test3() throws Throwable {
    TimeConversions.TimeMicrosConversion conversion = new TimeConversions.TimeMicrosConversion();

    String result = conversion.adjustAndSetValue("", "PLx?3@B.}9VsRbKP(");

    assertEquals(" = PLx?3@B.}9VsRbKP(.truncatedTo(java.time.temporal.ChronoUnit.MICROS);", result);
  }

  @Test(timeout = 4000)
  public void timeMicrosConversion_ESTest_test4() throws Throwable {
    TimeConversions.TimeMicrosConversion conversion = new TimeConversions.TimeMicrosConversion();

    Class<LocalTime> convertedType = conversion.getConvertedType();

    assertFalse(convertedType.isSynthetic());
  }

  // -------------------------------------------------------------------------
  // TimeMillisConversion
  // -------------------------------------------------------------------------

  @Test(timeout = 4000)
  public void timeMillisConversion_ESTest_test0() throws Throwable {
    TimeConversions.TimeMillisConversion conversion = new TimeConversions.TimeMillisConversion();

    String result = conversion.adjustAndSetValue("com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider",
        "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams");

    assertEquals("com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider"
        + " = com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"
        + ".truncatedTo(java.time.temporal.ChronoUnit.MILLIS);", result);
  }

  @Test(timeout = 4000)
  public void timeMillisConversion_ESTest_test1() throws Throwable {
    TimeConversions.TimeMillisConversion conversion = new TimeConversions.TimeMillisConversion();

    Schema schema = conversion.getRecommendedSchema();

    assertFalse(schema.isUnion());
  }

  @Test(timeout = 4000)
  public void timeMillisConversion_ESTest_test2() throws Throwable {
    TimeConversions.TimeMillisConversion conversion = new TimeConversions.TimeMillisConversion();

    String result = conversion.getLogicalTypeName();

    assertEquals("time-millis", result);
  }

  @Test(timeout = 4000)
  public void timeMillisConversion_ESTest_test3() throws Throwable {
    TimeConversions.TimeMillisConversion conversion = new TimeConversions.TimeMillisConversion();

    Class<LocalTime> convertedType = conversion.getConvertedType();

    assertEquals("class java.time.LocalTime", convertedType.toString());
  }

  @Test(timeout = 4000)
  public void timeMillisConversion_ESTest_test4() throws Throwable {
    TimeConversions.TimeMillisConversion conversion = new TimeConversions.TimeMillisConversion();

    Integer input = Integer.valueOf(0);
    Schema schema = conversion.getRecommendedSchema();
    LogicalType logicalType = new LogicalType("");

    LocalTime time = conversion.fromInt(input, schema, logicalType);
    Integer result = conversion.toInt(time, schema, logicalType);

    assertEquals(0, result.intValue());
  }

  // -------------------------------------------------------------------------
  // TimestampMicrosConversion
  // -------------------------------------------------------------------------

  @Test(timeout = 4000)
  public void timestampMicrosConversion_ESTest_test0() throws Throwable {
    TimeConversions.TimestampMicrosConversion conversion = new TimeConversions.TimestampMicrosConversion();

    Schema schema = conversion.getRecommendedSchema();
    LogicalType logicalType = new LogicalType("k");
    Long input = Long.valueOf(-1897L);

    Instant instant = conversion.fromLong(input, schema, logicalType);
    Long result = conversion.toLong(instant, schema, logicalType);

    assertEquals(-1897L, result.longValue());
  }

  @Test(timeout = 4000)
  public void timestampMicrosConversion_ESTest_test1() throws Throwable {
    TimeConversions.TimestampMicrosConversion conversion = new TimeConversions.TimestampMicrosConversion();

    Schema schema = conversion.getRecommendedSchema();
    LogicalType logicalType = new LogicalType("k");
    Long input = Long.valueOf(0L);

    Instant instant = conversion.fromLong(input, schema, logicalType);
    Instant shiftedInstant = instant.minusSeconds(1395L);
    Long result = conversion.toLong(shiftedInstant, schema, logicalType);

    assertEquals(-1395000000L, result.longValue());
  }

  @Test(timeout = 4000)
  public void timestampMicrosConversion_ESTest_test2() throws Throwable {
    TimeConversions.TimestampMicrosConversion conversion = new TimeConversions.TimestampMicrosConversion();

    String result = conversion.adjustAndSetValue(null, "");

    assertEquals("null = .truncatedTo(java.time.temporal.ChronoUnit.MICROS);", result);
  }

  @Test(timeout = 4000)
  public void timestampMicrosConversion_ESTest_test3() throws Throwable {
    TimeConversions.TimestampMicrosConversion conversion = new TimeConversions.TimestampMicrosConversion();

    Class<Instant> convertedType = conversion.getConvertedType();

    assertFalse(convertedType.isAnnotation());
  }

  @Test(timeout = 4000)
  public void timestampMicrosConversion_ESTest_test4() throws Throwable {
    TimeConversions.TimestampMicrosConversion conversion = new TimeConversions.TimestampMicrosConversion();

    Schema schema = conversion.getRecommendedSchema();
    LogicalType logicalType = new LogicalType("k");
    Long input = Long.valueOf(0L);

    Instant instant = conversion.fromLong(input, schema, logicalType);
    Long result = conversion.toLong(instant, schema, logicalType);

    assertEquals(0L, result.longValue());
  }

  @Test(timeout = 4000)
  public void timestampMicrosConversion_ESTest_test5() throws Throwable {
    TimeConversions.TimestampMicrosConversion conversion = new TimeConversions.TimestampMicrosConversion();

    String result = conversion.getLogicalTypeName();

    assertEquals("timestamp-micros", result);
  }

  // -------------------------------------------------------------------------
  // TimestampMillisConversion
  // -------------------------------------------------------------------------

  @Test(timeout = 4000)
  public void timestampMillisConversion_ESTest_test0() throws Throwable {
    TimeConversions.TimestampMillisConversion conversion = new TimeConversions.TimestampMillisConversion();

    Schema schema = conversion.getRecommendedSchema();
    Long input = Long.valueOf(0L);
    LogicalType logicalType = schema.getLogicalType();

    Instant result = conversion.fromLong(input, schema, logicalType);

    assertNotNull(result);
  }

  @Test(timeout = 4000)
  public void timestampMillisConversion_ESTest_test1() throws Throwable {
    TimeConversions.TimestampMillisConversion conversion = new TimeConversions.TimestampMillisConversion();

    Long result = conversion.toLong(EVOSUITE_INSTANT, null, null);

    assertEquals(1392409281320L, result.longValue());
  }

  @Test(timeout = 4000)
  public void timestampMillisConversion_ESTest_test2() throws Throwable {
    TimeConversions.TimestampMillisConversion conversion = new TimeConversions.TimestampMillisConversion();

    String result = conversion.getLogicalTypeName();

    assertEquals("timestamp-millis", result);
  }

  @Test(timeout = 4000)
  public void timestampMillisConversion_ESTest_test3() throws Throwable {
    TimeConversions.TimestampMillisConversion conversion = new TimeConversions.TimestampMillisConversion();

    String result = conversion.adjustAndSetValue("timestamp-millis", "timestamp-millis");

    assertEquals("timestamp-millis = timestamp-millis" + ".truncatedTo(java.time.temporal.ChronoUnit.MILLIS);", result);
  }

  @Test(timeout = 4000)
  public void timestampMillisConversion_ESTest_test4() throws Throwable {
    TimeConversions.TimestampMillisConversion conversion = new TimeConversions.TimestampMillisConversion();

    Class<Instant> convertedType = conversion.getConvertedType();

    assertFalse(convertedType.isSynthetic());
  }

  // -------------------------------------------------------------------------
  // TimestampNanosConversion
  // -------------------------------------------------------------------------

  @Test(timeout = 4000)
  public void timestampNanosConversion_ESTest_test0() throws Throwable {
    TimeConversions.TimestampNanosConversion conversion = new TimeConversions.TimestampNanosConversion();

    Long input = Long.valueOf(0L);
    Schema schema = conversion.getRecommendedSchema();
    LogicalType logicalType = new LogicalType("a|7OrDNO8JD<<@");

    Instant instant = conversion.fromLong(input, schema, logicalType);
    Instant shiftedInstant = instant.minusNanos(989L);
    Long result = conversion.toLong(shiftedInstant, schema, logicalType);

    assertEquals(998999011L, result.longValue());
  }

  @Test(timeout = 4000)
  public void timestampNanosConversion_ESTest_test1() throws Throwable {
    TimeConversions.TimestampNanosConversion conversion = new TimeConversions.TimestampNanosConversion();

    Instant instant = Instant.ofEpochSecond(-2995L);
    Schema schema = conversion.getRecommendedSchema();
    LogicalType logicalType = new LogicalType("a|7OrDNO8JD<<@");

    Long result = conversion.toLong(instant, schema, logicalType);

    assertEquals(-2995000000000L, result.longValue());
  }

  @Test(timeout = 4000)
  public void timestampNanosConversion_ESTest_test2() throws Throwable {
    TimeConversions.TimestampNanosConversion conversion = new TimeConversions.TimestampNanosConversion();

    Class<Instant> convertedType = conversion.getConvertedType();

    assertFalse(convertedType.isSynthetic());
  }

  @Test(timeout = 4000)
  public void timestampNanosConversion_ESTest_test3() throws Throwable {
    TimeConversions.TimestampNanosConversion conversion = new TimeConversions.TimestampNanosConversion();

    String result = conversion.getLogicalTypeName();

    assertEquals("timestamp-nanos", result);
  }

  @Test(timeout = 4000)
  public void timestampNanosConversion_ESTest_test4() throws Throwable {
    TimeConversions.TimestampNanosConversion conversion = new TimeConversions.TimestampNanosConversion();

    String result = conversion.adjustAndSetValue("", "");

    assertEquals(" = .truncatedTo(java.time.temporal.ChronoUnit.NANOS);", result);
  }

  @Test(timeout = 4000)
  public void timestampNanosConversion_ESTest_test5() throws Throwable {
    TimeConversions.TimestampNanosConversion conversion = new TimeConversions.TimestampNanosConversion();

    Long input = Long.valueOf(0L);
    Schema schema = conversion.getRecommendedSchema();
    LogicalType logicalType = new LogicalType("a|7OrDNO8JD<<@");

    Instant instant = conversion.fromLong(input, schema, logicalType);
    Long result = conversion.toLong(instant, schema, logicalType);

    assertEquals(0L, result.longValue());
  }

  @Test(timeout = 4000)
  public void timestampNanosConversion_ESTest_test6() throws Throwable {
    TimeConversions.TimestampNanosConversion conversion = new TimeConversions.TimestampNanosConversion();

    Schema schema = conversion.getRecommendedSchema();

    assertNull(schema.getDoc());
  }
}
