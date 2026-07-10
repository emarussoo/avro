package org.apache.avro.data;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ISW2TimeConversionsC4RNDTest {

  public static boolean debug = false;

  @Test
  public void test04() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2TimeConversionsC4RNDTest0.test04");
    org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion0 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
    java.lang.String str1 = localTimestampNanosConversion0.getLogicalTypeName();
    java.lang.Class<java.time.LocalDateTime> localDateTimeClass2 = localTimestampNanosConversion0.getConvertedType();
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "local-timestamp-nanos" + "'", str1, "local-timestamp-nanos");
    org.junit.Assert.assertNotNull(localDateTimeClass2);
  }

  @Test
  public void test11() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2TimeConversionsC4RNDTest0.test11");
    org.apache.avro.data.TimeConversions.DateConversion dateConversion0 = new org.apache.avro.data.TimeConversions.DateConversion();
    java.lang.String str3 = dateConversion0.adjustAndSetValue("local-timestamp-nanos", "local-timestamp-nanos");
    java.lang.String str4 = dateConversion0.getLogicalTypeName();
    java.lang.Class<java.time.LocalDate> localDateClass5 = dateConversion0.getConvertedType();
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "local-timestamp-nanos = local-timestamp-nanos;" + "'", str3,
        "local-timestamp-nanos = local-timestamp-nanos;");
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "date" + "'", str4, "date");
    org.junit.Assert.assertNotNull(localDateClass5);
  }

  @Test
  public void test16() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2TimeConversionsC4RNDTest0.test16");
    org.apache.avro.data.TimeConversions.TimeMicrosConversion timeMicrosConversion0 = new org.apache.avro.data.TimeConversions.TimeMicrosConversion();
    org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion2 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
    org.apache.avro.data.TimeConversions.TimestampMicrosConversion timestampMicrosConversion4 = new org.apache.avro.data.TimeConversions.TimestampMicrosConversion();
    org.apache.avro.Schema schema5 = timestampMicrosConversion4.getRecommendedSchema();
    org.apache.avro.LogicalType logicalType6 = null;
    java.time.LocalDateTime localDateTime7 = localTimestampNanosConversion2.fromLong((java.lang.Long) 10L, schema5,
        logicalType6);
    org.apache.avro.LogicalType logicalType8 = null;
    java.time.LocalTime localTime9 = timeMicrosConversion0.fromLong((java.lang.Long) 100L, schema5, logicalType8);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertNotNull(localDateTime7);
    org.junit.Assert.assertNotNull(localTime9);
  }

  @Test
  public void test22() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2TimeConversionsC4RNDTest0.test22");
    org.apache.avro.data.TimeConversions.DateConversion dateConversion0 = new org.apache.avro.data.TimeConversions.DateConversion();
    org.apache.avro.Schema schema2 = null;
    org.apache.avro.LogicalType logicalType3 = null;
    java.time.LocalDate localDate4 = dateConversion0.fromInt((java.lang.Integer) 100, schema2, logicalType3);
    java.lang.String str5 = dateConversion0.getLogicalTypeName();
    org.apache.avro.Schema schema6 = dateConversion0.getRecommendedSchema();
    org.junit.Assert.assertNotNull(localDate4);
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "date" + "'", str5, "date");
    org.junit.Assert.assertNotNull(schema6);
  }

  @Test
  public void test23() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2TimeConversionsC4RNDTest0.test23");
    org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion localTimestampMicrosConversion0 = new org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion();
    java.lang.Class<java.time.LocalDateTime> localDateTimeClass1 = localTimestampMicrosConversion0.getConvertedType();
    org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion2 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
    java.lang.String str3 = localTimestampNanosConversion2.getLogicalTypeName();
    org.apache.avro.Schema schema5 = null;
    org.apache.avro.LogicalType logicalType6 = null;
    java.time.LocalDateTime localDateTime7 = localTimestampNanosConversion2.fromLong((java.lang.Long) 0L, schema5,
        logicalType6);
    org.apache.avro.Schema schema8 = null;
    org.apache.avro.LogicalType logicalType9 = null;
    java.lang.Long long10 = localTimestampMicrosConversion0.toLong(localDateTime7, schema8, logicalType9);
    java.lang.String str11 = localTimestampMicrosConversion0.getLogicalTypeName();
    org.junit.Assert.assertNotNull(localDateTimeClass1);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "local-timestamp-nanos" + "'", str3, "local-timestamp-nanos");
    org.junit.Assert.assertNotNull(localDateTime7);
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "local-timestamp-micros" + "'", str11,
        "local-timestamp-micros");
  }

  @Test
  public void test24() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2TimeConversionsC4RNDTest0.test24");
    org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion0 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
    org.apache.avro.data.TimeConversions.TimestampMicrosConversion timestampMicrosConversion2 = new org.apache.avro.data.TimeConversions.TimestampMicrosConversion();
    org.apache.avro.Schema schema3 = timestampMicrosConversion2.getRecommendedSchema();
    org.apache.avro.LogicalType logicalType4 = null;
    java.time.LocalDateTime localDateTime5 = localTimestampNanosConversion0.fromLong((java.lang.Long) 10L, schema3,
        logicalType4);
    org.apache.avro.Schema schema6 = localTimestampNanosConversion0.getRecommendedSchema();
    java.lang.String str9 = localTimestampNanosConversion0.adjustAndSetValue("timestamp-nanos",
        "local-timestamp-micros");
    org.junit.Assert.assertNotNull(schema3);
    org.junit.Assert.assertNotNull(localDateTime5);
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "timestamp-nanos = local-timestamp-micros;" + "'", str9,
        "timestamp-nanos = local-timestamp-micros;");
  }

  @Test
  public void test35() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2TimeConversionsC4RNDTest0.test35");
    org.apache.avro.data.TimeConversions.TimestampMillisConversion timestampMillisConversion0 = new org.apache.avro.data.TimeConversions.TimestampMillisConversion();
    java.lang.String str3 = timestampMillisConversion0.adjustAndSetValue("local-timestamp-nanos", "");
    java.lang.String str4 = timestampMillisConversion0.getLogicalTypeName();
    org.junit.Assert.assertEquals(
        "'" + str3 + "' != '" + "local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS);" + "'",
        str3, "local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS);");
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "timestamp-millis" + "'", str4, "timestamp-millis");
  }

  @Test
  public void test38() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2TimeConversionsC4RNDTest0.test38");
    org.apache.avro.data.TimeConversions.TimeMillisConversion timeMillisConversion0 = new org.apache.avro.data.TimeConversions.TimeMillisConversion();
    org.apache.avro.data.TimeConversions.TimeMicrosConversion timeMicrosConversion1 = new org.apache.avro.data.TimeConversions.TimeMicrosConversion();
    org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion localTimestampMicrosConversion3 = new org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion();
    java.lang.Class<java.time.LocalDateTime> localDateTimeClass4 = localTimestampMicrosConversion3.getConvertedType();
    org.apache.avro.Schema schema5 = localTimestampMicrosConversion3.getRecommendedSchema();
    org.apache.avro.LogicalType logicalType6 = null;
    java.time.LocalTime localTime7 = timeMicrosConversion1.fromLong((java.lang.Long) 0L, schema5, logicalType6);
    org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion8 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
    org.apache.avro.data.TimeConversions.TimestampMicrosConversion timestampMicrosConversion10 = new org.apache.avro.data.TimeConversions.TimestampMicrosConversion();
    org.apache.avro.Schema schema11 = timestampMicrosConversion10.getRecommendedSchema();
    org.apache.avro.LogicalType logicalType12 = null;
    java.time.LocalDateTime localDateTime13 = localTimestampNanosConversion8.fromLong((java.lang.Long) 10L, schema11,
        logicalType12);
    org.apache.avro.Schema schema14 = localTimestampNanosConversion8.getRecommendedSchema();
    org.apache.avro.LogicalType logicalType15 = null;
    java.lang.Integer int16 = timeMillisConversion0.toInt(localTime7, schema14, logicalType15);
    org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion localTimestampMicrosConversion18 = new org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion();
    java.lang.Class<java.time.LocalDateTime> localDateTimeClass19 = localTimestampMicrosConversion18.getConvertedType();
    org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion20 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
    java.lang.String str21 = localTimestampNanosConversion20.getLogicalTypeName();
    org.apache.avro.Schema schema23 = null;
    org.apache.avro.LogicalType logicalType24 = null;
    java.time.LocalDateTime localDateTime25 = localTimestampNanosConversion20.fromLong((java.lang.Long) 0L, schema23,
        logicalType24);
    org.apache.avro.Schema schema26 = null;
    org.apache.avro.LogicalType logicalType27 = null;
    java.lang.Long long28 = localTimestampMicrosConversion18.toLong(localDateTime25, schema26, logicalType27);
    org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion localTimestampMicrosConversion29 = new org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion();
    java.lang.Class<java.time.LocalDateTime> localDateTimeClass30 = localTimestampMicrosConversion29.getConvertedType();
    org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion31 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
    java.lang.String str32 = localTimestampNanosConversion31.getLogicalTypeName();
    org.apache.avro.Schema schema34 = null;
    org.apache.avro.LogicalType logicalType35 = null;
    java.time.LocalDateTime localDateTime36 = localTimestampNanosConversion31.fromLong((java.lang.Long) 0L, schema34,
        logicalType35);
    org.apache.avro.Schema schema37 = null;
    org.apache.avro.LogicalType logicalType38 = null;
    java.lang.Long long39 = localTimestampMicrosConversion29.toLong(localDateTime36, schema37, logicalType38);
    org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion40 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
    org.apache.avro.data.TimeConversions.TimestampMicrosConversion timestampMicrosConversion42 = new org.apache.avro.data.TimeConversions.TimestampMicrosConversion();
    org.apache.avro.Schema schema43 = timestampMicrosConversion42.getRecommendedSchema();
    org.apache.avro.LogicalType logicalType44 = null;
    java.time.LocalDateTime localDateTime45 = localTimestampNanosConversion40.fromLong((java.lang.Long) 10L, schema43,
        logicalType44);
    org.apache.avro.LogicalType logicalType46 = null;
    java.lang.Long long47 = localTimestampMicrosConversion18.toLong(localDateTime36, schema43, logicalType46);
    org.apache.avro.LogicalType logicalType48 = null;

    try {
      java.time.LocalTime localTime49 = timeMillisConversion0.fromLong((java.lang.Long) (-1L), schema43, logicalType48);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.LogicalType.getName()\" because \"type\" is null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

    org.junit.Assert.assertNotNull(localDateTimeClass4);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertNotNull(localTime7);
    org.junit.Assert.assertNotNull(schema11);
    org.junit.Assert.assertNotNull(localDateTime13);
    org.junit.Assert.assertNotNull(schema14);
    org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    org.junit.Assert.assertNotNull(localDateTimeClass19);
    org.junit.Assert.assertEquals("'" + str21 + "' != '" + "local-timestamp-nanos" + "'", str21,
        "local-timestamp-nanos");
    org.junit.Assert.assertNotNull(localDateTime25);
    org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    org.junit.Assert.assertNotNull(localDateTimeClass30);
    org.junit.Assert.assertEquals("'" + str32 + "' != '" + "local-timestamp-nanos" + "'", str32,
        "local-timestamp-nanos");
    org.junit.Assert.assertNotNull(localDateTime36);
    org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
    org.junit.Assert.assertNotNull(schema43);
    org.junit.Assert.assertNotNull(localDateTime45);
    org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
  }

  @Test
  public void test39() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2TimeConversionsC4RNDTest0.test39");
    org.apache.avro.data.TimeConversions.TimeMicrosConversion timeMicrosConversion0 = new org.apache.avro.data.TimeConversions.TimeMicrosConversion();
    org.apache.avro.data.TimeConversions.TimeMicrosConversion timeMicrosConversion1 = new org.apache.avro.data.TimeConversions.TimeMicrosConversion();
    org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion localTimestampMicrosConversion3 = new org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion();
    java.lang.Class<java.time.LocalDateTime> localDateTimeClass4 = localTimestampMicrosConversion3.getConvertedType();
    org.apache.avro.Schema schema5 = localTimestampMicrosConversion3.getRecommendedSchema();
    org.apache.avro.LogicalType logicalType6 = null;
    java.time.LocalTime localTime7 = timeMicrosConversion1.fromLong((java.lang.Long) 0L, schema5, logicalType6);
    org.apache.avro.data.TimeConversions.TimeMicrosConversion timeMicrosConversion8 = new org.apache.avro.data.TimeConversions.TimeMicrosConversion();
    org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion localTimestampMicrosConversion10 = new org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion();
    java.lang.Class<java.time.LocalDateTime> localDateTimeClass11 = localTimestampMicrosConversion10.getConvertedType();
    org.apache.avro.Schema schema12 = localTimestampMicrosConversion10.getRecommendedSchema();
    org.apache.avro.LogicalType logicalType13 = null;
    java.time.LocalTime localTime14 = timeMicrosConversion8.fromLong((java.lang.Long) 0L, schema12, logicalType13);
    org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion localTimestampMicrosConversion15 = new org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion();
    java.lang.Class<java.time.LocalDateTime> localDateTimeClass16 = localTimestampMicrosConversion15.getConvertedType();
    org.apache.avro.Schema schema17 = localTimestampMicrosConversion15.getRecommendedSchema();
    org.apache.avro.Schema schema18 = localTimestampMicrosConversion15.getRecommendedSchema();
    org.apache.avro.LogicalType logicalType19 = null;
    java.lang.Long long20 = timeMicrosConversion1.toLong(localTime14, schema18, logicalType19);
    org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion localTimestampMicrosConversion21 = new org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion();
    java.lang.Class<java.time.LocalDateTime> localDateTimeClass22 = localTimestampMicrosConversion21.getConvertedType();
    org.apache.avro.Schema schema23 = localTimestampMicrosConversion21.getRecommendedSchema();
    org.apache.avro.Schema schema24 = localTimestampMicrosConversion21.getRecommendedSchema();
    org.apache.avro.LogicalType logicalType25 = null;
    java.lang.Long long26 = timeMicrosConversion0.toLong(localTime14, schema24, logicalType25);

    org.junit.Assert.assertNotNull(localDateTimeClass4);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertNotNull(localTime7);
    org.junit.Assert.assertNotNull(localDateTimeClass11);
    org.junit.Assert.assertNotNull(schema12);
    org.junit.Assert.assertNotNull(localTime14);
    org.junit.Assert.assertNotNull(localDateTimeClass16);
    org.junit.Assert.assertNotNull(schema17);
    org.junit.Assert.assertNotNull(schema18);
    org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    org.junit.Assert.assertNotNull(localDateTimeClass22);
    org.junit.Assert.assertNotNull(schema23);
    org.junit.Assert.assertNotNull(schema24);
    org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
  }

  @Test
  public void test42() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2TimeConversionsC4RNDTest0.test42");
    org.apache.avro.data.TimeConversions.LocalTimestampMillisConversion localTimestampMillisConversion0 = new org.apache.avro.data.TimeConversions.LocalTimestampMillisConversion();
    java.lang.String str1 = localTimestampMillisConversion0.getLogicalTypeName();
    java.lang.String str2 = localTimestampMillisConversion0.getLogicalTypeName();
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "local-timestamp-millis" + "'", str1,
        "local-timestamp-millis");
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "local-timestamp-millis" + "'", str2,
        "local-timestamp-millis");
  }

  @Test
  public void test44() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2TimeConversionsC4RNDTest0.test44");
    org.apache.avro.data.TimeConversions.TimestampNanosConversion timestampNanosConversion0 = new org.apache.avro.data.TimeConversions.TimestampNanosConversion();
    java.lang.String str1 = timestampNanosConversion0.getLogicalTypeName();
    org.apache.avro.Schema schema2 = timestampNanosConversion0.getRecommendedSchema();
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "timestamp-nanos" + "'", str1, "timestamp-nanos");
    org.junit.Assert.assertNotNull(schema2);
  }

  @Test
  public void test45() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2TimeConversionsC4RNDTest0.test45");
    org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion0 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
    org.apache.avro.data.TimeConversions.TimestampMicrosConversion timestampMicrosConversion2 = new org.apache.avro.data.TimeConversions.TimestampMicrosConversion();
    org.apache.avro.Schema schema3 = timestampMicrosConversion2.getRecommendedSchema();
    org.apache.avro.LogicalType logicalType4 = null;
    java.time.LocalDateTime localDateTime5 = localTimestampNanosConversion0.fromLong((java.lang.Long) 10L, schema3,
        logicalType4);
    java.lang.String str6 = localTimestampNanosConversion0.getLogicalTypeName();
    java.lang.Class<java.time.LocalDateTime> localDateTimeClass7 = localTimestampNanosConversion0.getConvertedType();
    org.junit.Assert.assertNotNull(schema3);
    org.junit.Assert.assertNotNull(localDateTime5);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "local-timestamp-nanos" + "'", str6, "local-timestamp-nanos");
    org.junit.Assert.assertNotNull(localDateTimeClass7);
  }

  @Test
  public void test50() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2TimeConversionsC4RNDTest0.test50");
    org.apache.avro.data.TimeConversions.LocalTimestampMillisConversion localTimestampMillisConversion0 = new org.apache.avro.data.TimeConversions.LocalTimestampMillisConversion();
    java.lang.String str1 = localTimestampMillisConversion0.getLogicalTypeName();
    org.apache.avro.Schema schema2 = localTimestampMillisConversion0.getRecommendedSchema();
    org.apache.avro.Schema schema3 = localTimestampMillisConversion0.getRecommendedSchema();
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "local-timestamp-millis" + "'", str1,
        "local-timestamp-millis");
    org.junit.Assert.assertNotNull(schema2);
    org.junit.Assert.assertNotNull(schema3);
  }
}
