package org.apache.avro.data;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ISW2TimeConversionsRNDTest {

  public static boolean debug = false;

  public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
    if (expectedArray.length != actualArray.length) {
      throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
    }
    for (int i = 0; i < expectedArray.length; i++) {
      if (expectedArray[i] != actualArray[i]) {
        throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
      }
    }
  }

  @Test
  public void test03() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test03");
    org.apache.avro.data.TimeConversions.TimestampNanosConversion timestampNanosConversion0 = new org.apache.avro.data.TimeConversions.TimestampNanosConversion();
    org.apache.avro.Schema schema2 = null;
    org.apache.avro.LogicalType logicalType3 = null;
    java.time.Instant instant4 = timestampNanosConversion0.fromLong((java.lang.Long) 100L, schema2, logicalType3);
    java.lang.Class<?> wildcardClass5 = timestampNanosConversion0.getClass();
    org.junit.Assert.assertNotNull(instant4);
    org.junit.Assert.assertNotNull(wildcardClass5);
  }

  @Test
  public void test07() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test07");
    org.apache.avro.data.TimeConversions.TimeMillisConversion timeMillisConversion0 = new org.apache.avro.data.TimeConversions.TimeMillisConversion();
    java.lang.String str3 = timeMillisConversion0.adjustAndSetValue("hi!", "local-timestamp-nanos");
    org.apache.avro.Schema schema5 = null;
    org.apache.avro.LogicalType logicalType6 = null;
    java.time.LocalTime localTime7 = timeMillisConversion0.fromInt((java.lang.Integer) 0, schema5, logicalType6);
    org.apache.avro.data.TimeConversions.TimeMillisConversion timeMillisConversion8 = new org.apache.avro.data.TimeConversions.TimeMillisConversion();
    java.lang.String str11 = timeMillisConversion8.adjustAndSetValue("hi!", "local-timestamp-nanos");
    org.apache.avro.Schema schema13 = null;
    org.apache.avro.LogicalType logicalType14 = null;
    java.time.LocalTime localTime15 = timeMillisConversion8.fromInt((java.lang.Integer) 0, schema13, logicalType14);
    org.apache.avro.Schema schema16 = null;
    org.apache.avro.LogicalType logicalType17 = null;
    java.lang.Integer int18 = timeMillisConversion0.toInt(localTime15, schema16, logicalType17);
    org.junit.Assert.assertEquals(
        "'" + str3 + "' != '" + "hi! = local-timestamp-nanos.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);" + "'",
        str3, "hi! = local-timestamp-nanos.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);");
    org.junit.Assert.assertNotNull(localTime7);
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "hi! = local-timestamp-nanos.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);" + "'",
        str11, "hi! = local-timestamp-nanos.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);");
    org.junit.Assert.assertNotNull(localTime15);
    org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
  }

  @Test
  public void test09() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test09");
    org.apache.avro.data.TimeConversions.DateConversion dateConversion0 = new org.apache.avro.data.TimeConversions.DateConversion();
    java.lang.String str1 = dateConversion0.getLogicalTypeName();
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "date" + "'", str1, "date");
  }

  @Test
  public void test11() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test11");
    org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion0 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
    java.lang.String str1 = localTimestampNanosConversion0.getLogicalTypeName();
    org.apache.avro.Schema schema3 = null;
    org.apache.avro.LogicalType logicalType4 = null;
    java.time.LocalDateTime localDateTime5 = localTimestampNanosConversion0.fromLong((java.lang.Long) 100L, schema3,
        logicalType4);
    java.lang.Class<java.time.LocalDateTime> localDateTimeClass6 = localTimestampNanosConversion0.getConvertedType();
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "local-timestamp-nanos" + "'", str1, "local-timestamp-nanos");
    org.junit.Assert.assertNotNull(localDateTime5);
    org.junit.Assert.assertNotNull(localDateTimeClass6);
  }

  @Test
  public void test16() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test16");
    org.apache.avro.data.TimeConversions.TimeMillisConversion timeMillisConversion0 = new org.apache.avro.data.TimeConversions.TimeMillisConversion();
    java.lang.String str3 = timeMillisConversion0.adjustAndSetValue("local-timestamp-nanos", "");
    org.apache.avro.data.TimeConversions.TimeMillisConversion timeMillisConversion4 = new org.apache.avro.data.TimeConversions.TimeMillisConversion();
    java.lang.String str7 = timeMillisConversion4.adjustAndSetValue("hi!", "local-timestamp-nanos");
    org.apache.avro.Schema schema9 = null;
    org.apache.avro.LogicalType logicalType10 = null;
    java.time.LocalTime localTime11 = timeMillisConversion4.fromInt((java.lang.Integer) 0, schema9, logicalType10);
    org.apache.avro.Schema schema13 = null;
    org.apache.avro.LogicalType logicalType14 = null;
    java.time.LocalTime localTime15 = timeMillisConversion4.fromInt((java.lang.Integer) 1, schema13, logicalType14);
    org.apache.avro.Schema schema16 = null;
    org.apache.avro.LogicalType logicalType17 = null;
    java.lang.Integer int18 = timeMillisConversion0.toInt(localTime15, schema16, logicalType17);
    org.junit.Assert.assertEquals(
        "'" + str3 + "' != '" + "local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS);" + "'",
        str3, "local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS);");
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "hi! = local-timestamp-nanos.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);" + "'",
        str7, "hi! = local-timestamp-nanos.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);");
    org.junit.Assert.assertNotNull(localTime11);
    org.junit.Assert.assertNotNull(localTime15);
    org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
  }

  @Test
  public void test18() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test18");
    org.apache.avro.data.TimeConversions.TimestampMicrosConversion timestampMicrosConversion0 = new org.apache.avro.data.TimeConversions.TimestampMicrosConversion();
    org.apache.avro.data.TimeConversions.TimestampNanosConversion timestampNanosConversion1 = new org.apache.avro.data.TimeConversions.TimestampNanosConversion();
    org.apache.avro.Schema schema3 = null;
    org.apache.avro.LogicalType logicalType4 = null;
    java.time.Instant instant5 = timestampNanosConversion1.fromLong((java.lang.Long) 100L, schema3, logicalType4);
    org.apache.avro.Schema schema6 = null;
    org.apache.avro.LogicalType logicalType7 = null;
    java.lang.Long long8 = timestampMicrosConversion0.toLong(instant5, schema6, logicalType7);
    java.lang.Class<java.time.Instant> instantClass9 = timestampMicrosConversion0.getConvertedType();
    java.lang.String str12 = timestampMicrosConversion0
        .adjustAndSetValue("hi! = local-timestamp-nanos.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);", "");
    org.apache.avro.generic.GenericFixed genericFixed13 = null;
    org.apache.avro.data.TimeConversions.TimeMicrosConversion timeMicrosConversion14 = new org.apache.avro.data.TimeConversions.TimeMicrosConversion();
    org.apache.avro.Schema schema15 = timeMicrosConversion14.getRecommendedSchema();
    org.apache.avro.LogicalType logicalType16 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.time.Instant instant17 = timestampMicrosConversion0.fromFixed(genericFixed13, schema15, logicalType16);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.LogicalType.getName()\" because \"type\" is null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(instant5);
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    org.junit.Assert.assertNotNull(instantClass9);
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
        + "hi! = local-timestamp-nanos.truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = .truncatedTo(java.time.temporal.ChronoUnit.MICROS);"
        + "'", str12,
        "hi! = local-timestamp-nanos.truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = .truncatedTo(java.time.temporal.ChronoUnit.MICROS);");
    org.junit.Assert.assertNotNull(schema15);
  }

  @Test
  public void test19() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test19");
    org.apache.avro.data.TimeConversions.TimestampNanosConversion timestampNanosConversion0 = new org.apache.avro.data.TimeConversions.TimestampNanosConversion();
    org.apache.avro.Schema schema2 = null;
    org.apache.avro.LogicalType logicalType3 = null;
    java.time.Instant instant4 = timestampNanosConversion0.fromLong((java.lang.Long) 100L, schema2, logicalType3);
    java.lang.String str7 = timestampNanosConversion0.adjustAndSetValue(" = local-timestamp-nanos;",
        " = local-timestamp-nanos;");
    org.junit.Assert.assertNotNull(instant4);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '"
            + " = local-timestamp-nanos; =  = local-timestamp-nanos;.truncatedTo(java.time.temporal.ChronoUnit.NANOS);"
            + "'",
        str7,
        " = local-timestamp-nanos; =  = local-timestamp-nanos;.truncatedTo(java.time.temporal.ChronoUnit.NANOS);");
  }

  @Test
  public void test21() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test21");
    org.apache.avro.data.TimeConversions.TimeMillisConversion timeMillisConversion0 = new org.apache.avro.data.TimeConversions.TimeMillisConversion();
    java.lang.String str3 = timeMillisConversion0.adjustAndSetValue("hi!", "local-timestamp-nanos");
    org.apache.avro.Schema schema5 = null;
    org.apache.avro.LogicalType logicalType6 = null;
    java.time.LocalTime localTime7 = timeMillisConversion0.fromInt((java.lang.Integer) 0, schema5, logicalType6);
    java.lang.Class<java.time.LocalTime> localTimeClass8 = timeMillisConversion0.getConvertedType();
    org.junit.Assert.assertEquals(
        "'" + str3 + "' != '" + "hi! = local-timestamp-nanos.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);" + "'",
        str3, "hi! = local-timestamp-nanos.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);");
    org.junit.Assert.assertNotNull(localTime7);
    org.junit.Assert.assertNotNull(localTimeClass8);
  }

  @Test
  public void test23() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test23");
    org.apache.avro.data.TimeConversions.TimestampNanosConversion timestampNanosConversion0 = new org.apache.avro.data.TimeConversions.TimestampNanosConversion();
    org.apache.avro.Schema schema2 = null;
    org.apache.avro.LogicalType logicalType3 = null;
    java.time.Instant instant4 = timestampNanosConversion0.fromLong((java.lang.Long) 100L, schema2, logicalType3);
    java.lang.String str7 = timestampNanosConversion0.adjustAndSetValue("hi!", "hi!");
    java.lang.Class<java.time.Instant> instantClass8 = timestampNanosConversion0.getConvertedType();
    org.apache.avro.data.TimeConversions.TimestampMicrosConversion timestampMicrosConversion9 = new org.apache.avro.data.TimeConversions.TimestampMicrosConversion();
    org.apache.avro.data.TimeConversions.TimestampNanosConversion timestampNanosConversion10 = new org.apache.avro.data.TimeConversions.TimestampNanosConversion();
    org.apache.avro.Schema schema12 = null;
    org.apache.avro.LogicalType logicalType13 = null;
    java.time.Instant instant14 = timestampNanosConversion10.fromLong((java.lang.Long) 100L, schema12, logicalType13);
    org.apache.avro.Schema schema15 = null;
    org.apache.avro.LogicalType logicalType16 = null;
    java.lang.Long long17 = timestampMicrosConversion9.toLong(instant14, schema15, logicalType16);
    org.apache.avro.data.TimeConversions.TimeMicrosConversion timeMicrosConversion18 = new org.apache.avro.data.TimeConversions.TimeMicrosConversion();
    org.apache.avro.Schema schema19 = timeMicrosConversion18.getRecommendedSchema();
    org.apache.avro.LogicalType logicalType20 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer int21 = timestampNanosConversion0.toInt(instant14, schema19, logicalType20);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.LogicalType.getName()\" because \"type\" is null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(instant4);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "hi! = hi!.truncatedTo(java.time.temporal.ChronoUnit.NANOS);" + "'", str7,
        "hi! = hi!.truncatedTo(java.time.temporal.ChronoUnit.NANOS);");
    org.junit.Assert.assertNotNull(instantClass8);
    org.junit.Assert.assertNotNull(instant14);
    org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    org.junit.Assert.assertNotNull(schema19);
  }

  @Test
  public void test26() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test26");
    org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion0 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
    java.lang.String str1 = localTimestampNanosConversion0.getLogicalTypeName();
    org.apache.avro.Schema schema2 = localTimestampNanosConversion0.getRecommendedSchema();
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "local-timestamp-nanos" + "'", str1, "local-timestamp-nanos");
    org.junit.Assert.assertNotNull(schema2);
  }

  @Test
  public void test27() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test27");
    org.apache.avro.data.TimeConversions.LocalTimestampMillisConversion localTimestampMillisConversion0 = new org.apache.avro.data.TimeConversions.LocalTimestampMillisConversion();
    java.lang.Class<java.time.LocalDateTime> localDateTimeClass1 = localTimestampMillisConversion0.getConvertedType();
    org.apache.avro.data.TimeConversions.TimeMillisConversion timeMillisConversion3 = new org.apache.avro.data.TimeConversions.TimeMillisConversion();
    java.lang.String str6 = timeMillisConversion3.adjustAndSetValue("hi!", "local-timestamp-nanos");
    org.apache.avro.Schema schema8 = null;
    org.apache.avro.LogicalType logicalType9 = null;
    java.time.LocalTime localTime10 = timeMillisConversion3.fromInt((java.lang.Integer) 0, schema8, logicalType9);
    org.apache.avro.Schema schema12 = null;
    org.apache.avro.LogicalType logicalType13 = null;
    java.time.LocalTime localTime14 = timeMillisConversion3.fromInt((java.lang.Integer) 1, schema12, logicalType13);
    java.lang.Class<java.time.LocalTime> localTimeClass15 = timeMillisConversion3.getConvertedType();
    org.apache.avro.data.TimeConversions.TimestampMillisConversion timestampMillisConversion17 = new org.apache.avro.data.TimeConversions.TimestampMillisConversion();
    org.apache.avro.Schema schema18 = timestampMillisConversion17.getRecommendedSchema();
    org.apache.avro.Schema schema19 = timestampMillisConversion17.getRecommendedSchema();
    org.apache.avro.LogicalType logicalType20 = null;
    java.time.LocalTime localTime21 = timeMillisConversion3.fromInt((java.lang.Integer) 10, schema19, logicalType20);
    org.apache.avro.LogicalType logicalType22 = null;
    java.time.LocalDateTime localDateTime23 = localTimestampMillisConversion0.fromLong((java.lang.Long) 100L, schema19,
        logicalType22);
    org.junit.Assert.assertNotNull(localDateTimeClass1);
    org.junit.Assert.assertEquals(
        "'" + str6 + "' != '" + "hi! = local-timestamp-nanos.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);" + "'",
        str6, "hi! = local-timestamp-nanos.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);");
    org.junit.Assert.assertNotNull(localTime10);
    org.junit.Assert.assertNotNull(localTime14);
    org.junit.Assert.assertNotNull(localTimeClass15);
    org.junit.Assert.assertNotNull(schema18);
    org.junit.Assert.assertNotNull(schema19);
    org.junit.Assert.assertNotNull(localTime21);
    org.junit.Assert.assertNotNull(localDateTime23);
  }

  @Test
  public void test30() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test30");
    org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion0 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
    java.lang.String str3 = localTimestampNanosConversion0.adjustAndSetValue("", "local-timestamp-nanos");
    org.apache.avro.data.TimeConversions.LocalTimestampMillisConversion localTimestampMillisConversion4 = new org.apache.avro.data.TimeConversions.LocalTimestampMillisConversion();
    org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion5 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
    java.lang.String str6 = localTimestampNanosConversion5.getLogicalTypeName();
    org.apache.avro.Schema schema8 = null;
    org.apache.avro.LogicalType logicalType9 = null;
    java.time.LocalDateTime localDateTime10 = localTimestampNanosConversion5.fromLong((java.lang.Long) 100L, schema8,
        logicalType9);
    org.apache.avro.Schema schema11 = null;
    org.apache.avro.LogicalType logicalType12 = null;
    java.lang.Long long13 = localTimestampMillisConversion4.toLong(localDateTime10, schema11, logicalType12);
    org.apache.avro.Schema schema14 = null;
    org.apache.avro.LogicalType logicalType15 = null;
    java.lang.Long long16 = localTimestampNanosConversion0.toLong(localDateTime10, schema14, logicalType15);
    java.lang.Class<java.time.LocalDateTime> localDateTimeClass17 = localTimestampNanosConversion0.getConvertedType();
    java.lang.String str18 = localTimestampNanosConversion0.getLogicalTypeName();
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + " = local-timestamp-nanos;" + "'", str3,
        " = local-timestamp-nanos;");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "local-timestamp-nanos" + "'", str6, "local-timestamp-nanos");
    org.junit.Assert.assertNotNull(localDateTime10);
    org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
    org.junit.Assert.assertNotNull(localDateTimeClass17);
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "local-timestamp-nanos" + "'", str18,
        "local-timestamp-nanos");
  }

  @Test
  public void test31() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test31");
    org.apache.avro.data.TimeConversions.TimestampMicrosConversion timestampMicrosConversion0 = new org.apache.avro.data.TimeConversions.TimestampMicrosConversion();
    org.apache.avro.Schema schema1 = timestampMicrosConversion0.getRecommendedSchema();
    java.lang.Class<java.time.Instant> instantClass2 = timestampMicrosConversion0.getConvertedType();
    java.lang.String str5 = timestampMicrosConversion0.adjustAndSetValue(
        "hi! =  = local-timestamp-nanos; =  = local-timestamp-nanos;.truncatedTo(java.time.temporal.ChronoUnit.NANOS);.truncatedTo(java.time.temporal.ChronoUnit.NANOS);",
        "hi! = local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = hi! = hi!.truncatedTo(java.time.temporal.ChronoUnit.NANOS);.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);.truncatedTo(java.time.temporal.ChronoUnit.MICROS);");
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(instantClass2);
    org.junit.Assert.assertEquals("'" + str5 + "' != '"
        + "hi! =  = local-timestamp-nanos; =  = local-timestamp-nanos;.truncatedTo(java.time.temporal.ChronoUnit.NANOS);.truncatedTo(java.time.temporal.ChronoUnit.NANOS); = hi! = local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = hi! = hi!.truncatedTo(java.time.temporal.ChronoUnit.NANOS);.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);.truncatedTo(java.time.temporal.ChronoUnit.MICROS);.truncatedTo(java.time.temporal.ChronoUnit.MICROS);"
        + "'", str5,
        "hi! =  = local-timestamp-nanos; =  = local-timestamp-nanos;.truncatedTo(java.time.temporal.ChronoUnit.NANOS);.truncatedTo(java.time.temporal.ChronoUnit.NANOS); = hi! = local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = hi! = hi!.truncatedTo(java.time.temporal.ChronoUnit.NANOS);.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);.truncatedTo(java.time.temporal.ChronoUnit.MICROS);.truncatedTo(java.time.temporal.ChronoUnit.MICROS);");
  }

  @Test
  public void test34() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test34");
    org.apache.avro.data.TimeConversions.DateConversion dateConversion0 = new org.apache.avro.data.TimeConversions.DateConversion();
    org.apache.avro.Schema schema1 = dateConversion0.getRecommendedSchema();
    java.lang.String str4 = dateConversion0.adjustAndSetValue(
        "local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS);",
        "local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS);");
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertEquals("'" + str4 + "' != '"
        + "local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS);;"
        + "'", str4,
        "local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS);;");
  }

  @Test
  public void test37() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test37");
    org.apache.avro.data.TimeConversions.TimeMillisConversion timeMillisConversion0 = new org.apache.avro.data.TimeConversions.TimeMillisConversion();
    java.lang.String str3 = timeMillisConversion0.adjustAndSetValue("hi!", "local-timestamp-nanos");
    org.apache.avro.Schema schema5 = null;
    org.apache.avro.LogicalType logicalType6 = null;
    java.time.LocalTime localTime7 = timeMillisConversion0.fromInt((java.lang.Integer) 0, schema5, logicalType6);
    org.apache.avro.Schema schema9 = null;
    org.apache.avro.LogicalType logicalType10 = null;
    java.time.LocalTime localTime11 = timeMillisConversion0.fromInt((java.lang.Integer) 1, schema9, logicalType10);
    org.apache.avro.data.TimeConversions.TimestampMillisConversion timestampMillisConversion13 = new org.apache.avro.data.TimeConversions.TimestampMillisConversion();
    java.lang.String str16 = timestampMillisConversion13.adjustAndSetValue(
        "local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS);",
        "hi! = hi!.truncatedTo(java.time.temporal.ChronoUnit.NANOS);");
    org.apache.avro.data.TimeConversions.TimestampMillisConversion timestampMillisConversion17 = new org.apache.avro.data.TimeConversions.TimestampMillisConversion();
    java.lang.String str20 = timestampMillisConversion17.adjustAndSetValue(
        "local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS);",
        "hi! = hi!.truncatedTo(java.time.temporal.ChronoUnit.NANOS);");
    org.apache.avro.data.TimeConversions.TimestampMicrosConversion timestampMicrosConversion21 = new org.apache.avro.data.TimeConversions.TimestampMicrosConversion();
    org.apache.avro.data.TimeConversions.TimestampNanosConversion timestampNanosConversion22 = new org.apache.avro.data.TimeConversions.TimestampNanosConversion();
    org.apache.avro.Schema schema24 = null;
    org.apache.avro.LogicalType logicalType25 = null;
    java.time.Instant instant26 = timestampNanosConversion22.fromLong((java.lang.Long) 100L, schema24, logicalType25);
    org.apache.avro.Schema schema27 = null;
    org.apache.avro.LogicalType logicalType28 = null;
    java.lang.Long long29 = timestampMicrosConversion21.toLong(instant26, schema27, logicalType28);
    org.apache.avro.Schema schema30 = null;
    org.apache.avro.LogicalType logicalType31 = null;
    java.lang.Long long32 = timestampMillisConversion17.toLong(instant26, schema30, logicalType31);
    org.apache.avro.data.TimeConversions.DateConversion dateConversion33 = new org.apache.avro.data.TimeConversions.DateConversion();
    org.apache.avro.data.TimeConversions.LocalTimestampMillisConversion localTimestampMillisConversion35 = new org.apache.avro.data.TimeConversions.LocalTimestampMillisConversion();
    org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion36 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
    java.lang.String str37 = localTimestampNanosConversion36.getLogicalTypeName();
    org.apache.avro.Schema schema39 = null;
    org.apache.avro.LogicalType logicalType40 = null;
    java.time.LocalDateTime localDateTime41 = localTimestampNanosConversion36.fromLong((java.lang.Long) 100L, schema39,
        logicalType40);
    org.apache.avro.Schema schema42 = null;
    org.apache.avro.LogicalType logicalType43 = null;
    java.lang.Long long44 = localTimestampMillisConversion35.toLong(localDateTime41, schema42, logicalType43);
    org.apache.avro.data.TimeConversions.TimeMicrosConversion timeMicrosConversion46 = new org.apache.avro.data.TimeConversions.TimeMicrosConversion();
    org.apache.avro.Schema schema47 = timeMicrosConversion46.getRecommendedSchema();
    org.apache.avro.LogicalType logicalType48 = null;
    java.time.LocalDateTime localDateTime49 = localTimestampMillisConversion35.fromLong((java.lang.Long) 100L, schema47,
        logicalType48);
    org.apache.avro.LogicalType logicalType50 = null;
    java.time.LocalDate localDate51 = dateConversion33.fromInt((java.lang.Integer) 0, schema47, logicalType50);
    org.apache.avro.LogicalType logicalType52 = null;
    java.lang.Long long53 = timestampMillisConversion13.toLong(instant26, schema47, logicalType52);
    org.apache.avro.LogicalType logicalType54 = null;
    java.time.LocalTime localTime55 = timeMillisConversion0.fromInt((java.lang.Integer) 10, schema47, logicalType54);
    org.junit.Assert.assertEquals(
        "'" + str3 + "' != '" + "hi! = local-timestamp-nanos.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);" + "'",
        str3, "hi! = local-timestamp-nanos.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);");
    org.junit.Assert.assertNotNull(localTime7);
    org.junit.Assert.assertNotNull(localTime11);
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
        + "local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = hi! = hi!.truncatedTo(java.time.temporal.ChronoUnit.NANOS);.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);"
        + "'", str16,
        "local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = hi! = hi!.truncatedTo(java.time.temporal.ChronoUnit.NANOS);.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);");
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
        + "local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = hi! = hi!.truncatedTo(java.time.temporal.ChronoUnit.NANOS);.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);"
        + "'", str20,
        "local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = hi! = hi!.truncatedTo(java.time.temporal.ChronoUnit.NANOS);.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);");
    org.junit.Assert.assertNotNull(instant26);
    org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
    org.junit.Assert.assertEquals("'" + str37 + "' != '" + "local-timestamp-nanos" + "'", str37,
        "local-timestamp-nanos");
    org.junit.Assert.assertNotNull(localDateTime41);
    org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
    org.junit.Assert.assertNotNull(schema47);
    org.junit.Assert.assertNotNull(localDateTime49);
    org.junit.Assert.assertNotNull(localDate51);
    org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
    org.junit.Assert.assertNotNull(localTime55);
  }

  @Test
  public void test38() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test38");
    org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion0 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
    java.lang.String str1 = localTimestampNanosConversion0.getLogicalTypeName();
    org.apache.avro.Schema schema3 = null;
    org.apache.avro.LogicalType logicalType4 = null;
    java.time.LocalDateTime localDateTime5 = localTimestampNanosConversion0.fromLong((java.lang.Long) 100L, schema3,
        logicalType4);
    org.apache.avro.Schema schema6 = localTimestampNanosConversion0.getRecommendedSchema();
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "local-timestamp-nanos" + "'", str1, "local-timestamp-nanos");
    org.junit.Assert.assertNotNull(localDateTime5);
    org.junit.Assert.assertNotNull(schema6);
  }

  @Test
  public void test40() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test40");
    org.apache.avro.data.TimeConversions.TimestampNanosConversion timestampNanosConversion0 = new org.apache.avro.data.TimeConversions.TimestampNanosConversion();
    org.apache.avro.Schema schema2 = null;
    org.apache.avro.LogicalType logicalType3 = null;
    java.time.Instant instant4 = timestampNanosConversion0.fromLong((java.lang.Long) 100L, schema2, logicalType3);
    java.lang.String str7 = timestampNanosConversion0.adjustAndSetValue("hi!", "hi!");
    java.lang.Class<java.time.Instant> instantClass8 = timestampNanosConversion0.getConvertedType();
    java.lang.String str11 = timestampNanosConversion0.adjustAndSetValue(
        "hi! = local-timestamp-nanos.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);", "local-timestamp-nanos");
    org.junit.Assert.assertNotNull(instant4);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "hi! = hi!.truncatedTo(java.time.temporal.ChronoUnit.NANOS);" + "'", str7,
        "hi! = hi!.truncatedTo(java.time.temporal.ChronoUnit.NANOS);");
    org.junit.Assert.assertNotNull(instantClass8);
    org.junit.Assert.assertEquals("'" + str11 + "' != '"
        + "hi! = local-timestamp-nanos.truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = local-timestamp-nanos.truncatedTo(java.time.temporal.ChronoUnit.NANOS);"
        + "'", str11,
        "hi! = local-timestamp-nanos.truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = local-timestamp-nanos.truncatedTo(java.time.temporal.ChronoUnit.NANOS);");
  }

  @Test
  public void test45() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test45");
    org.apache.avro.data.TimeConversions.LocalTimestampMillisConversion localTimestampMillisConversion0 = new org.apache.avro.data.TimeConversions.LocalTimestampMillisConversion();
    java.lang.Class<java.time.LocalDateTime> localDateTimeClass1 = localTimestampMillisConversion0.getConvertedType();
    org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion2 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
    java.lang.String str5 = localTimestampNanosConversion2.adjustAndSetValue("", "local-timestamp-nanos");
    org.apache.avro.data.TimeConversions.LocalTimestampMillisConversion localTimestampMillisConversion6 = new org.apache.avro.data.TimeConversions.LocalTimestampMillisConversion();
    org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion7 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
    java.lang.String str8 = localTimestampNanosConversion7.getLogicalTypeName();
    org.apache.avro.Schema schema10 = null;
    org.apache.avro.LogicalType logicalType11 = null;
    java.time.LocalDateTime localDateTime12 = localTimestampNanosConversion7.fromLong((java.lang.Long) 100L, schema10,
        logicalType11);
    org.apache.avro.Schema schema13 = null;
    org.apache.avro.LogicalType logicalType14 = null;
    java.lang.Long long15 = localTimestampMillisConversion6.toLong(localDateTime12, schema13, logicalType14);
    org.apache.avro.Schema schema16 = null;
    org.apache.avro.LogicalType logicalType17 = null;
    java.lang.Long long18 = localTimestampNanosConversion2.toLong(localDateTime12, schema16, logicalType17);
    org.apache.avro.Schema schema19 = null;
    org.apache.avro.LogicalType logicalType20 = null;
    java.lang.Long long21 = localTimestampMillisConversion0.toLong(localDateTime12, schema19, logicalType20);
    org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion22 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
    java.lang.String str23 = localTimestampNanosConversion22.getLogicalTypeName();
    org.apache.avro.Schema schema25 = null;
    org.apache.avro.LogicalType logicalType26 = null;
    java.time.LocalDateTime localDateTime27 = localTimestampNanosConversion22.fromLong((java.lang.Long) 0L, schema25,
        logicalType26);
    org.apache.avro.data.TimeConversions.TimestampNanosConversion timestampNanosConversion28 = new org.apache.avro.data.TimeConversions.TimestampNanosConversion();
    java.lang.String str29 = timestampNanosConversion28.getLogicalTypeName();
    java.lang.String str30 = timestampNanosConversion28.getLogicalTypeName();
    org.apache.avro.Schema schema31 = timestampNanosConversion28.getRecommendedSchema();
    org.apache.avro.LogicalType logicalType32 = null;
    java.lang.Long long33 = localTimestampMillisConversion0.toLong(localDateTime27, schema31, logicalType32);
    org.junit.Assert.assertNotNull(localDateTimeClass1);
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + " = local-timestamp-nanos;" + "'", str5,
        " = local-timestamp-nanos;");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "local-timestamp-nanos" + "'", str8, "local-timestamp-nanos");
    org.junit.Assert.assertNotNull(localDateTime12);
    org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
    org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    org.junit.Assert.assertEquals("'" + str23 + "' != '" + "local-timestamp-nanos" + "'", str23,
        "local-timestamp-nanos");
    org.junit.Assert.assertNotNull(localDateTime27);
    org.junit.Assert.assertEquals("'" + str29 + "' != '" + "timestamp-nanos" + "'", str29, "timestamp-nanos");
    org.junit.Assert.assertEquals("'" + str30 + "' != '" + "timestamp-nanos" + "'", str30, "timestamp-nanos");
    org.junit.Assert.assertNotNull(schema31);
    org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
  }

  @Test
  public void test46() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test46");
    org.apache.avro.data.TimeConversions.TimeMillisConversion timeMillisConversion0 = new org.apache.avro.data.TimeConversions.TimeMillisConversion();
    java.lang.String str3 = timeMillisConversion0.adjustAndSetValue("local-timestamp-nanos", "");
    org.apache.avro.Schema schema4 = timeMillisConversion0.getRecommendedSchema();
    org.junit.Assert.assertEquals(
        "'" + str3 + "' != '" + "local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS);" + "'",
        str3, "local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS);");
    org.junit.Assert.assertNotNull(schema4);
  }

  @Test
  public void test47() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test47");
    org.apache.avro.data.TimeConversions.TimeMicrosConversion timeMicrosConversion0 = new org.apache.avro.data.TimeConversions.TimeMicrosConversion();
    java.lang.Class<java.time.LocalTime> localTimeClass1 = timeMicrosConversion0.getConvertedType();
    org.apache.avro.Schema schema2 = timeMicrosConversion0.getRecommendedSchema();
    org.apache.avro.Schema schema3 = timeMicrosConversion0.getRecommendedSchema();
    org.junit.Assert.assertNotNull(localTimeClass1);
    org.junit.Assert.assertNotNull(schema2);
    org.junit.Assert.assertNotNull(schema3);
  }
}
