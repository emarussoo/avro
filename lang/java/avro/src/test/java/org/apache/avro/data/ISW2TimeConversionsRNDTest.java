package org.apache.avro.data;

import org.junit.Test;

public class ISW2TimeConversionsRNDTest {

  public static boolean debug = false;

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
  public void test08() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test08");
    org.apache.avro.data.TimeConversions.DateConversion dateConversion0 = new org.apache.avro.data.TimeConversions.DateConversion();
    java.lang.String str1 = dateConversion0.getLogicalTypeName();
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "date" + "'", str1, "date");
  }

  @Test
  public void test13() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test13");
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
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + " = local-timestamp-nanos;" + "'", str3,
        " = local-timestamp-nanos;");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "local-timestamp-nanos" + "'", str6, "local-timestamp-nanos");
    org.junit.Assert.assertNotNull(localDateTime10);
    org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
    org.junit.Assert.assertNotNull(localDateTimeClass17);
  }

  @Test
  public void test18() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test18");
    org.apache.avro.data.TimeConversions.TimeMillisConversion timeMillisConversion0 = new org.apache.avro.data.TimeConversions.TimeMillisConversion();
    java.lang.String str3 = timeMillisConversion0.adjustAndSetValue("hi!", "local-timestamp-nanos");
    org.apache.avro.Schema schema5 = null;
    org.apache.avro.LogicalType logicalType6 = null;
    java.time.LocalTime localTime7 = timeMillisConversion0.fromInt((java.lang.Integer) 0, schema5, logicalType6);
    org.apache.avro.Schema schema9 = null;
    org.apache.avro.LogicalType logicalType10 = null;
    java.time.LocalTime localTime11 = timeMillisConversion0.fromInt((java.lang.Integer) 1, schema9, logicalType10);
    java.lang.Class<java.time.LocalTime> localTimeClass12 = timeMillisConversion0.getConvertedType();
    org.junit.Assert.assertEquals(
        "'" + str3 + "' != '" + "hi! = local-timestamp-nanos.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);" + "'",
        str3, "hi! = local-timestamp-nanos.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);");
    org.junit.Assert.assertNotNull(localTime7);
    org.junit.Assert.assertNotNull(localTime11);
    org.junit.Assert.assertNotNull(localTimeClass12);
  }

  @Test
  public void test19() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test19");
    org.apache.avro.data.TimeConversions.LocalTimestampMillisConversion localTimestampMillisConversion0 = new org.apache.avro.data.TimeConversions.LocalTimestampMillisConversion();
    org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion1 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
    java.lang.String str2 = localTimestampNanosConversion1.getLogicalTypeName();
    org.apache.avro.Schema schema4 = null;
    org.apache.avro.LogicalType logicalType5 = null;
    java.time.LocalDateTime localDateTime6 = localTimestampNanosConversion1.fromLong((java.lang.Long) 100L, schema4,
        logicalType5);
    org.apache.avro.Schema schema7 = null;
    org.apache.avro.LogicalType logicalType8 = null;
    java.lang.Long long9 = localTimestampMillisConversion0.toLong(localDateTime6, schema7, logicalType8);
    org.apache.avro.Schema schema11 = null;
    org.apache.avro.LogicalType logicalType12 = null;
    java.time.LocalDateTime localDateTime13 = localTimestampMillisConversion0.fromLong((java.lang.Long) 100L, schema11,
        logicalType12);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "local-timestamp-nanos" + "'", str2, "local-timestamp-nanos");
    org.junit.Assert.assertNotNull(localDateTime6);
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    org.junit.Assert.assertNotNull(localDateTime13);
  }

  @Test
  public void test22() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test22");
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
    org.apache.avro.Schema schema20 = null;
    org.apache.avro.LogicalType logicalType21 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.time.LocalTime localTime22 = timeMillisConversion0.fromLong((java.lang.Long) 100L, schema20, logicalType21);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.LogicalType.getName()\" because \"type\" is null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
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
  public void test23() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test23");
    org.apache.avro.data.TimeConversions.TimestampNanosConversion timestampNanosConversion0 = new org.apache.avro.data.TimeConversions.TimestampNanosConversion();
    java.lang.String str1 = timestampNanosConversion0.getLogicalTypeName();
    org.apache.avro.Schema schema3 = null;
    org.apache.avro.LogicalType logicalType4 = null;
    java.time.Instant instant5 = timestampNanosConversion0.fromLong((java.lang.Long) 10L, schema3, logicalType4);
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "timestamp-nanos" + "'", str1, "timestamp-nanos");
    org.junit.Assert.assertNotNull(instant5);
  }

  @Test
  public void test25() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test25");
    org.apache.avro.data.TimeConversions.TimeMicrosConversion timeMicrosConversion0 = new org.apache.avro.data.TimeConversions.TimeMicrosConversion();
    java.lang.String str3 = timeMicrosConversion0.adjustAndSetValue("hi!",
        "local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = hi! = hi!.truncatedTo(java.time.temporal.ChronoUnit.NANOS);.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);");
    java.lang.Class<java.time.LocalTime> localTimeClass4 = timeMicrosConversion0.getConvertedType();
    org.junit.Assert.assertEquals("'" + str3 + "' != '"
        + "hi! = local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = hi! = hi!.truncatedTo(java.time.temporal.ChronoUnit.NANOS);.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);.truncatedTo(java.time.temporal.ChronoUnit.MICROS);"
        + "'", str3,
        "hi! = local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = hi! = hi!.truncatedTo(java.time.temporal.ChronoUnit.NANOS);.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);.truncatedTo(java.time.temporal.ChronoUnit.MICROS);");
    org.junit.Assert.assertNotNull(localTimeClass4);
  }

  @Test
  public void test26() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test26");
    org.apache.avro.data.TimeConversions.LocalTimestampMillisConversion localTimestampMillisConversion0 = new org.apache.avro.data.TimeConversions.LocalTimestampMillisConversion();
    org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion1 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
    java.lang.String str2 = localTimestampNanosConversion1.getLogicalTypeName();
    org.apache.avro.Schema schema4 = null;
    org.apache.avro.LogicalType logicalType5 = null;
    java.time.LocalDateTime localDateTime6 = localTimestampNanosConversion1.fromLong((java.lang.Long) 100L, schema4,
        logicalType5);
    org.apache.avro.Schema schema7 = null;
    org.apache.avro.LogicalType logicalType8 = null;
    java.lang.Long long9 = localTimestampMillisConversion0.toLong(localDateTime6, schema7, logicalType8);
    java.lang.Class<java.time.LocalDateTime> localDateTimeClass10 = localTimestampMillisConversion0.getConvertedType();
    java.lang.String str11 = localTimestampMillisConversion0.getLogicalTypeName();
    org.apache.avro.Schema schema13 = null;
    org.apache.avro.LogicalType logicalType14 = null;
    java.time.LocalDateTime localDateTime15 = localTimestampMillisConversion0.fromLong((java.lang.Long) 100L, schema13,
        logicalType14);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "local-timestamp-nanos" + "'", str2, "local-timestamp-nanos");
    org.junit.Assert.assertNotNull(localDateTime6);
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    org.junit.Assert.assertNotNull(localDateTimeClass10);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "local-timestamp-millis" + "'", str11,
        "local-timestamp-millis");
    org.junit.Assert.assertNotNull(localDateTime15);
  }

  @Test
  public void test34() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test34");
    org.apache.avro.data.TimeConversions.DateConversion dateConversion0 = new org.apache.avro.data.TimeConversions.DateConversion();
    org.apache.avro.Schema schema2 = null;
    org.apache.avro.LogicalType logicalType3 = null;
    java.time.LocalDate localDate4 = dateConversion0.fromInt((java.lang.Integer) 0, schema2, logicalType3);
    java.lang.String str7 = dateConversion0.adjustAndSetValue("", "date");
    java.lang.String str8 = dateConversion0.getLogicalTypeName();
    org.junit.Assert.assertNotNull(localDate4);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + " = date;" + "'", str7, " = date;");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "date" + "'", str8, "date");
  }

  @Test
  public void test37() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test37");
    org.apache.avro.data.TimeConversions.TimestampMillisConversion timestampMillisConversion0 = new org.apache.avro.data.TimeConversions.TimestampMillisConversion();
    java.lang.Class<java.time.Instant> instantClass1 = timestampMillisConversion0.getConvertedType();
    org.apache.avro.Schema schema3 = null;
    org.apache.avro.LogicalType logicalType4 = null;
    java.time.Instant instant5 = timestampMillisConversion0.fromLong((java.lang.Long) (-1L), schema3, logicalType4);
    org.junit.Assert.assertNotNull(instantClass1);
    org.junit.Assert.assertNotNull(instant5);
  }

  @Test
  public void test38() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test38");
    org.apache.avro.data.TimeConversions.TimeMicrosConversion timeMicrosConversion0 = new org.apache.avro.data.TimeConversions.TimeMicrosConversion();
    java.lang.String str3 = timeMicrosConversion0.adjustAndSetValue("hi!",
        "local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = hi! = hi!.truncatedTo(java.time.temporal.ChronoUnit.NANOS);.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);");
    org.apache.avro.Schema schema5 = null;
    org.apache.avro.LogicalType logicalType6 = null;
    java.time.LocalTime localTime7 = timeMicrosConversion0.fromLong((java.lang.Long) 1000L, schema5, logicalType6);
    org.junit.Assert.assertEquals("'" + str3 + "' != '"
        + "hi! = local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = hi! = hi!.truncatedTo(java.time.temporal.ChronoUnit.NANOS);.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);.truncatedTo(java.time.temporal.ChronoUnit.MICROS);"
        + "'", str3,
        "hi! = local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = hi! = hi!.truncatedTo(java.time.temporal.ChronoUnit.NANOS);.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);.truncatedTo(java.time.temporal.ChronoUnit.MICROS);");
    org.junit.Assert.assertNotNull(localTime7);
  }

  @Test
  public void test39() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test39");
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
    java.lang.String str13 = timestampMicrosConversion0.getLogicalTypeName();
    java.lang.String str16 = timestampMicrosConversion0.adjustAndSetValue("", "");
    org.junit.Assert.assertNotNull(instant5);
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    org.junit.Assert.assertNotNull(instantClass9);
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
        + "hi! = local-timestamp-nanos.truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = .truncatedTo(java.time.temporal.ChronoUnit.MICROS);"
        + "'", str12,
        "hi! = local-timestamp-nanos.truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = .truncatedTo(java.time.temporal.ChronoUnit.MICROS);");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "timestamp-micros" + "'", str13, "timestamp-micros");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + " = .truncatedTo(java.time.temporal.ChronoUnit.MICROS);" + "'", str16,
        " = .truncatedTo(java.time.temporal.ChronoUnit.MICROS);");
  }

  @Test
  public void test42() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test42");
    org.apache.avro.data.TimeConversions.TimestampNanosConversion timestampNanosConversion0 = new org.apache.avro.data.TimeConversions.TimestampNanosConversion();
    java.lang.String str1 = timestampNanosConversion0.getLogicalTypeName();
    java.lang.Class<java.time.Instant> instantClass2 = timestampNanosConversion0.getConvertedType();
    org.apache.avro.Schema schema4 = null;
    org.apache.avro.LogicalType logicalType5 = null;
    java.time.Instant instant6 = timestampNanosConversion0.fromLong((java.lang.Long) 100L, schema4, logicalType5);
    java.lang.Class<java.time.Instant> instantClass7 = timestampNanosConversion0.getConvertedType();
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "timestamp-nanos" + "'", str1, "timestamp-nanos");
    org.junit.Assert.assertNotNull(instantClass2);
    org.junit.Assert.assertNotNull(instant6);
    org.junit.Assert.assertNotNull(instantClass7);
  }

  @Test
  public void test43() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test43");
    org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion0 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
    java.lang.String str1 = localTimestampNanosConversion0.getLogicalTypeName();
    org.apache.avro.Schema schema3 = null;
    org.apache.avro.LogicalType logicalType4 = null;
    java.time.LocalDateTime localDateTime5 = localTimestampNanosConversion0.fromLong((java.lang.Long) 0L, schema3,
        logicalType4);
    org.apache.avro.Schema schema7 = null;
    org.apache.avro.LogicalType logicalType8 = null;
    java.time.LocalDateTime localDateTime9 = localTimestampNanosConversion0.fromLong((java.lang.Long) 100L, schema7,
        logicalType8);
    java.lang.String str10 = localTimestampNanosConversion0.getLogicalTypeName();
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "local-timestamp-nanos" + "'", str1, "local-timestamp-nanos");
    org.junit.Assert.assertNotNull(localDateTime5);
    org.junit.Assert.assertNotNull(localDateTime9);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "local-timestamp-nanos" + "'", str10,
        "local-timestamp-nanos");
  }

  @Test
  public void test45() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test45");
    org.apache.avro.data.TimeConversions.TimestampMillisConversion timestampMillisConversion0 = new org.apache.avro.data.TimeConversions.TimestampMillisConversion();
    org.apache.avro.data.TimeConversions.TimestampMicrosConversion timestampMicrosConversion1 = new org.apache.avro.data.TimeConversions.TimestampMicrosConversion();
    org.apache.avro.data.TimeConversions.TimestampNanosConversion timestampNanosConversion2 = new org.apache.avro.data.TimeConversions.TimestampNanosConversion();
    org.apache.avro.Schema schema4 = null;
    org.apache.avro.LogicalType logicalType5 = null;
    java.time.Instant instant6 = timestampNanosConversion2.fromLong((java.lang.Long) 100L, schema4, logicalType5);
    org.apache.avro.Schema schema7 = null;
    org.apache.avro.LogicalType logicalType8 = null;
    java.lang.Long long9 = timestampMicrosConversion1.toLong(instant6, schema7, logicalType8);
    java.lang.Class<java.time.Instant> instantClass10 = timestampMicrosConversion1.getConvertedType();
    java.lang.String str13 = timestampMicrosConversion1
        .adjustAndSetValue("hi! = local-timestamp-nanos.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);", "");
    org.apache.avro.data.TimeConversions.TimestampMicrosConversion timestampMicrosConversion14 = new org.apache.avro.data.TimeConversions.TimestampMicrosConversion();
    org.apache.avro.data.TimeConversions.TimestampNanosConversion timestampNanosConversion15 = new org.apache.avro.data.TimeConversions.TimestampNanosConversion();
    org.apache.avro.Schema schema17 = null;
    org.apache.avro.LogicalType logicalType18 = null;
    java.time.Instant instant19 = timestampNanosConversion15.fromLong((java.lang.Long) 100L, schema17, logicalType18);
    org.apache.avro.Schema schema20 = null;
    org.apache.avro.LogicalType logicalType21 = null;
    java.lang.Long long22 = timestampMicrosConversion14.toLong(instant19, schema20, logicalType21);
    org.apache.avro.Schema schema23 = null;
    org.apache.avro.LogicalType logicalType24 = null;
    java.lang.Long long25 = timestampMicrosConversion1.toLong(instant19, schema23, logicalType24);
    org.apache.avro.Schema schema26 = null;
    org.apache.avro.LogicalType logicalType27 = null;
    java.lang.Long long28 = timestampMillisConversion0.toLong(instant19, schema26, logicalType27);
    java.lang.Class<java.time.Instant> instantClass29 = timestampMillisConversion0.getConvertedType();
    org.junit.Assert.assertNotNull(instant6);
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    org.junit.Assert.assertNotNull(instantClass10);
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
        + "hi! = local-timestamp-nanos.truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = .truncatedTo(java.time.temporal.ChronoUnit.MICROS);"
        + "'", str13,
        "hi! = local-timestamp-nanos.truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = .truncatedTo(java.time.temporal.ChronoUnit.MICROS);");
    org.junit.Assert.assertNotNull(instant19);
    org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    org.junit.Assert.assertNotNull(instantClass29);
  }

  @Test
  public void test48() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test48");
    org.apache.avro.data.TimeConversions.TimestampNanosConversion timestampNanosConversion0 = new org.apache.avro.data.TimeConversions.TimestampNanosConversion();
    org.apache.avro.Schema schema2 = null;
    org.apache.avro.LogicalType logicalType3 = null;
    java.time.Instant instant4 = timestampNanosConversion0.fromLong((java.lang.Long) 100L, schema2, logicalType3);
    java.lang.String str7 = timestampNanosConversion0.adjustAndSetValue("hi!", "hi!");
    java.lang.String str10 = timestampNanosConversion0.adjustAndSetValue("",
        "hi! = hi!.truncatedTo(java.time.temporal.ChronoUnit.NANOS);");
    org.junit.Assert.assertNotNull(instant4);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "hi! = hi!.truncatedTo(java.time.temporal.ChronoUnit.NANOS);" + "'", str7,
        "hi! = hi!.truncatedTo(java.time.temporal.ChronoUnit.NANOS);");
    org.junit.Assert.assertEquals("'" + str10 + "' != '"
        + " = hi! = hi!.truncatedTo(java.time.temporal.ChronoUnit.NANOS);.truncatedTo(java.time.temporal.ChronoUnit.NANOS);"
        + "'", str10,
        " = hi! = hi!.truncatedTo(java.time.temporal.ChronoUnit.NANOS);.truncatedTo(java.time.temporal.ChronoUnit.NANOS);");
  }
}
