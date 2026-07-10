package org.apache.avro.data;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ISW2TimeConversionsC2RNDTest0 {

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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsC2RNDTest0.test01");
        org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion localTimestampMicrosConversion0 = new org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion();
        java.time.LocalDateTime localDateTime1 = null;
        org.apache.avro.Schema schema2 = null;
        org.apache.avro.LogicalType logicalType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long4 = localTimestampMicrosConversion0.toLong(localDateTime1, schema2, logicalType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.toInstant(java.time.ZoneOffset)\" because \"timestamp\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsC2RNDTest0.test02");
        org.apache.avro.data.TimeConversions.TimestampMillisConversion timestampMillisConversion0 = new org.apache.avro.data.TimeConversions.TimestampMillisConversion();
        java.time.Instant instant1 = null;
        org.apache.avro.Schema schema2 = null;
        org.apache.avro.LogicalType logicalType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long4 = timestampMillisConversion0.toLong(instant1, schema2, logicalType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.Instant.toEpochMilli()\" because \"timestamp\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsC2RNDTest0.test03");
        org.apache.avro.data.TimeConversions.TimestampMillisConversion timestampMillisConversion0 = new org.apache.avro.data.TimeConversions.TimestampMillisConversion();
        org.apache.avro.Schema schema2 = null;
        org.apache.avro.LogicalType logicalType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.Instant instant4 = timestampMillisConversion0.fromInt((java.lang.Integer) (-1), schema2, logicalType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.LogicalType.getName()\" because \"type\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsC2RNDTest0.test04");
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion0 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        java.lang.String str1 = localTimestampNanosConversion0.getLogicalTypeName();
        java.lang.Class<java.time.LocalDateTime> localDateTimeClass2 = localTimestampNanosConversion0.getConvertedType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "local-timestamp-nanos" + "'", str1, "local-timestamp-nanos");
        org.junit.Assert.assertNotNull(localDateTimeClass2);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsC2RNDTest0.test05");
        org.apache.avro.data.TimeConversions.DateConversion dateConversion0 = new org.apache.avro.data.TimeConversions.DateConversion();
        org.apache.avro.Schema schema2 = null;
        org.apache.avro.LogicalType logicalType3 = null;
        java.time.LocalDate localDate4 = dateConversion0.fromInt((java.lang.Integer) 100, schema2, logicalType3);
        org.apache.avro.data.TimeConversions.DateConversion dateConversion5 = new org.apache.avro.data.TimeConversions.DateConversion();
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.LogicalType logicalType8 = null;
        java.time.LocalDate localDate9 = dateConversion5.fromInt((java.lang.Integer) 100, schema7, logicalType8);
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.LogicalType logicalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long12 = dateConversion0.toLong(localDate9, schema10, logicalType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.LogicalType.getName()\" because \"type\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate9);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsC2RNDTest0.test06");
        org.apache.avro.data.TimeConversions.DateConversion dateConversion0 = new org.apache.avro.data.TimeConversions.DateConversion();
        org.apache.avro.Schema schema2 = null;
        org.apache.avro.LogicalType logicalType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate4 = dateConversion0.fromLong((java.lang.Long) 100L, schema2, logicalType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.LogicalType.getName()\" because \"type\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsC2RNDTest0.test07");
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion0 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion1 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        java.lang.String str2 = localTimestampNanosConversion1.getLogicalTypeName();
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.LogicalType logicalType5 = null;
        java.time.LocalDateTime localDateTime6 = localTimestampNanosConversion1.fromLong((java.lang.Long) 0L, schema4, logicalType5);
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.LogicalType logicalType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int9 = localTimestampNanosConversion0.toInt(localDateTime6, schema7, logicalType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.LogicalType.getName()\" because \"type\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "local-timestamp-nanos" + "'", str2, "local-timestamp-nanos");
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsC2RNDTest0.test08");
        org.apache.avro.data.TimeConversions.TimestampMillisConversion timestampMillisConversion0 = new org.apache.avro.data.TimeConversions.TimestampMillisConversion();
        java.lang.String str3 = timestampMillisConversion0.adjustAndSetValue("local-timestamp-nanos", "");
        java.time.Instant instant4 = null;
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion5 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        org.apache.avro.data.TimeConversions.TimestampMicrosConversion timestampMicrosConversion7 = new org.apache.avro.data.TimeConversions.TimestampMicrosConversion();
        org.apache.avro.Schema schema8 = timestampMicrosConversion7.getRecommendedSchema();
        org.apache.avro.LogicalType logicalType9 = null;
        java.time.LocalDateTime localDateTime10 = localTimestampNanosConversion5.fromLong((java.lang.Long) 10L, schema8, logicalType9);
        org.apache.avro.LogicalType logicalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long12 = timestampMillisConversion0.toLong(instant4, schema8, logicalType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.Instant.toEpochMilli()\" because \"timestamp\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS);" + "'", str3, "local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS);");
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsC2RNDTest0.test09");
        org.apache.avro.data.TimeConversions.DateConversion dateConversion0 = new org.apache.avro.data.TimeConversions.DateConversion();
        java.lang.String str3 = dateConversion0.adjustAndSetValue("local-timestamp-nanos", "local-timestamp-nanos");
        org.apache.avro.data.TimeConversions.DateConversion dateConversion4 = new org.apache.avro.data.TimeConversions.DateConversion();
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.LogicalType logicalType7 = null;
        java.time.LocalDate localDate8 = dateConversion4.fromInt((java.lang.Integer) 100, schema6, logicalType7);
        org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion localTimestampMicrosConversion9 = new org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion();
        java.lang.Class<java.time.LocalDateTime> localDateTimeClass10 = localTimestampMicrosConversion9.getConvertedType();
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion11 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        java.lang.String str12 = localTimestampNanosConversion11.getLogicalTypeName();
        org.apache.avro.Schema schema14 = null;
        org.apache.avro.LogicalType logicalType15 = null;
        java.time.LocalDateTime localDateTime16 = localTimestampNanosConversion11.fromLong((java.lang.Long) 0L, schema14, logicalType15);
        org.apache.avro.Schema schema17 = null;
        org.apache.avro.LogicalType logicalType18 = null;
        java.lang.Long long19 = localTimestampMicrosConversion9.toLong(localDateTime16, schema17, logicalType18);
        org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion localTimestampMicrosConversion20 = new org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion();
        java.lang.Class<java.time.LocalDateTime> localDateTimeClass21 = localTimestampMicrosConversion20.getConvertedType();
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion22 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        java.lang.String str23 = localTimestampNanosConversion22.getLogicalTypeName();
        org.apache.avro.Schema schema25 = null;
        org.apache.avro.LogicalType logicalType26 = null;
        java.time.LocalDateTime localDateTime27 = localTimestampNanosConversion22.fromLong((java.lang.Long) 0L, schema25, logicalType26);
        org.apache.avro.Schema schema28 = null;
        org.apache.avro.LogicalType logicalType29 = null;
        java.lang.Long long30 = localTimestampMicrosConversion20.toLong(localDateTime27, schema28, logicalType29);
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion31 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        org.apache.avro.data.TimeConversions.TimestampMicrosConversion timestampMicrosConversion33 = new org.apache.avro.data.TimeConversions.TimestampMicrosConversion();
        org.apache.avro.Schema schema34 = timestampMicrosConversion33.getRecommendedSchema();
        org.apache.avro.LogicalType logicalType35 = null;
        java.time.LocalDateTime localDateTime36 = localTimestampNanosConversion31.fromLong((java.lang.Long) 10L, schema34, logicalType35);
        org.apache.avro.LogicalType logicalType37 = null;
        java.lang.Long long38 = localTimestampMicrosConversion9.toLong(localDateTime27, schema34, logicalType37);
        org.apache.avro.LogicalType logicalType39 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long40 = dateConversion0.toLong(localDate8, schema34, logicalType39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.LogicalType.getName()\" because \"type\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "local-timestamp-nanos = local-timestamp-nanos;" + "'", str3, "local-timestamp-nanos = local-timestamp-nanos;");
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDateTimeClass10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "local-timestamp-nanos" + "'", str12, "local-timestamp-nanos");
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(localDateTimeClass21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "local-timestamp-nanos" + "'", str23, "local-timestamp-nanos");
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(schema34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsC2RNDTest0.test10");
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion0 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        java.lang.String str1 = localTimestampNanosConversion0.getLogicalTypeName();
        org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion localTimestampMicrosConversion2 = new org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion();
        java.lang.Class<java.time.LocalDateTime> localDateTimeClass3 = localTimestampMicrosConversion2.getConvertedType();
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion4 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        java.lang.String str5 = localTimestampNanosConversion4.getLogicalTypeName();
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.LogicalType logicalType8 = null;
        java.time.LocalDateTime localDateTime9 = localTimestampNanosConversion4.fromLong((java.lang.Long) 0L, schema7, logicalType8);
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.LogicalType logicalType11 = null;
        java.lang.Long long12 = localTimestampMicrosConversion2.toLong(localDateTime9, schema10, logicalType11);
        org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion localTimestampMicrosConversion13 = new org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion();
        java.lang.Class<java.time.LocalDateTime> localDateTimeClass14 = localTimestampMicrosConversion13.getConvertedType();
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion15 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        java.lang.String str16 = localTimestampNanosConversion15.getLogicalTypeName();
        org.apache.avro.Schema schema18 = null;
        org.apache.avro.LogicalType logicalType19 = null;
        java.time.LocalDateTime localDateTime20 = localTimestampNanosConversion15.fromLong((java.lang.Long) 0L, schema18, logicalType19);
        org.apache.avro.Schema schema21 = null;
        org.apache.avro.LogicalType logicalType22 = null;
        java.lang.Long long23 = localTimestampMicrosConversion13.toLong(localDateTime20, schema21, logicalType22);
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion24 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        org.apache.avro.data.TimeConversions.TimestampMicrosConversion timestampMicrosConversion26 = new org.apache.avro.data.TimeConversions.TimestampMicrosConversion();
        org.apache.avro.Schema schema27 = timestampMicrosConversion26.getRecommendedSchema();
        org.apache.avro.LogicalType logicalType28 = null;
        java.time.LocalDateTime localDateTime29 = localTimestampNanosConversion24.fromLong((java.lang.Long) 10L, schema27, logicalType28);
        org.apache.avro.LogicalType logicalType30 = null;
        java.lang.Long long31 = localTimestampMicrosConversion2.toLong(localDateTime20, schema27, logicalType30);
        org.apache.avro.data.TimeConversions.TimestampMicrosConversion timestampMicrosConversion32 = new org.apache.avro.data.TimeConversions.TimestampMicrosConversion();
        org.apache.avro.Schema schema33 = timestampMicrosConversion32.getRecommendedSchema();
        org.apache.avro.LogicalType logicalType34 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int35 = localTimestampNanosConversion0.toInt(localDateTime20, schema33, logicalType34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.LogicalType.getName()\" because \"type\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "local-timestamp-nanos" + "'", str1, "local-timestamp-nanos");
        org.junit.Assert.assertNotNull(localDateTimeClass3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "local-timestamp-nanos" + "'", str5, "local-timestamp-nanos");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(localDateTimeClass14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "local-timestamp-nanos" + "'", str16, "local-timestamp-nanos");
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(schema33);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsC2RNDTest0.test11");
        org.apache.avro.data.TimeConversions.DateConversion dateConversion0 = new org.apache.avro.data.TimeConversions.DateConversion();
        java.lang.String str3 = dateConversion0.adjustAndSetValue("local-timestamp-nanos", "local-timestamp-nanos");
        java.lang.String str4 = dateConversion0.getLogicalTypeName();
        java.lang.Class<java.time.LocalDate> localDateClass5 = dateConversion0.getConvertedType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "local-timestamp-nanos = local-timestamp-nanos;" + "'", str3, "local-timestamp-nanos = local-timestamp-nanos;");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "date" + "'", str4, "date");
        org.junit.Assert.assertNotNull(localDateClass5);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsC2RNDTest0.test12");
        org.apache.avro.data.TimeConversions.TimestampMillisConversion timestampMillisConversion0 = new org.apache.avro.data.TimeConversions.TimestampMillisConversion();
        java.lang.String str3 = timestampMillisConversion0.adjustAndSetValue("local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS);", "");
        java.time.Instant instant4 = null;
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion5 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        org.apache.avro.data.TimeConversions.TimestampMicrosConversion timestampMicrosConversion7 = new org.apache.avro.data.TimeConversions.TimestampMicrosConversion();
        org.apache.avro.Schema schema8 = timestampMicrosConversion7.getRecommendedSchema();
        org.apache.avro.LogicalType logicalType9 = null;
        java.time.LocalDateTime localDateTime10 = localTimestampNanosConversion5.fromLong((java.lang.Long) 10L, schema8, logicalType9);
        org.apache.avro.LogicalType logicalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int12 = timestampMillisConversion0.toInt(instant4, schema8, logicalType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.LogicalType.getName()\" because \"type\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS);" + "'", str3, "local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS);");
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsC2RNDTest0.test13");
        org.apache.avro.data.TimeConversions.DateConversion dateConversion0 = new org.apache.avro.data.TimeConversions.DateConversion();
        org.apache.avro.Schema schema2 = null;
        org.apache.avro.LogicalType logicalType3 = null;
        java.time.LocalDate localDate4 = dateConversion0.fromInt((java.lang.Integer) 100, schema2, logicalType3);
        java.lang.String str5 = dateConversion0.getLogicalTypeName();
        org.apache.avro.data.TimeConversions.DateConversion dateConversion6 = new org.apache.avro.data.TimeConversions.DateConversion();
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.LogicalType logicalType9 = null;
        java.time.LocalDate localDate10 = dateConversion6.fromInt((java.lang.Integer) 100, schema8, logicalType9);
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion11 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        org.apache.avro.data.TimeConversions.TimestampMicrosConversion timestampMicrosConversion13 = new org.apache.avro.data.TimeConversions.TimestampMicrosConversion();
        org.apache.avro.Schema schema14 = timestampMicrosConversion13.getRecommendedSchema();
        org.apache.avro.LogicalType logicalType15 = null;
        java.time.LocalDateTime localDateTime16 = localTimestampNanosConversion11.fromLong((java.lang.Long) 10L, schema14, logicalType15);
        org.apache.avro.LogicalType logicalType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long18 = dateConversion0.toLong(localDate10, schema14, logicalType17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.LogicalType.getName()\" because \"type\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "date" + "'", str5, "date");
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(localDateTime16);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsC2RNDTest0.test14");
        org.apache.avro.data.TimeConversions.TimeMicrosConversion timeMicrosConversion0 = new org.apache.avro.data.TimeConversions.TimeMicrosConversion();
        java.lang.Class<java.time.LocalTime> localTimeClass1 = timeMicrosConversion0.getConvertedType();
        org.junit.Assert.assertNotNull(localTimeClass1);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsC2RNDTest0.test15");
        org.apache.avro.data.TimeConversions.TimestampMillisConversion timestampMillisConversion0 = new org.apache.avro.data.TimeConversions.TimestampMillisConversion();
        java.lang.String str3 = timestampMillisConversion0.adjustAndSetValue("local-timestamp-nanos", "");
        java.time.Instant instant4 = null;
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.LogicalType logicalType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long7 = timestampMillisConversion0.toLong(instant4, schema5, logicalType6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.Instant.toEpochMilli()\" because \"timestamp\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS);" + "'", str3, "local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS);");
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsC2RNDTest0.test16");
        org.apache.avro.data.TimeConversions.TimeMicrosConversion timeMicrosConversion0 = new org.apache.avro.data.TimeConversions.TimeMicrosConversion();
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion2 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        org.apache.avro.data.TimeConversions.TimestampMicrosConversion timestampMicrosConversion4 = new org.apache.avro.data.TimeConversions.TimestampMicrosConversion();
        org.apache.avro.Schema schema5 = timestampMicrosConversion4.getRecommendedSchema();
        org.apache.avro.LogicalType logicalType6 = null;
        java.time.LocalDateTime localDateTime7 = localTimestampNanosConversion2.fromLong((java.lang.Long) 10L, schema5, logicalType6);
        org.apache.avro.LogicalType logicalType8 = null;
        java.time.LocalTime localTime9 = timeMicrosConversion0.fromLong((java.lang.Long) 100L, schema5, logicalType8);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localTime9);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsC2RNDTest0.test17");
        org.apache.avro.data.TimeConversions.TimestampMillisConversion timestampMillisConversion0 = new org.apache.avro.data.TimeConversions.TimestampMillisConversion();
        java.lang.String str3 = timestampMillisConversion0.adjustAndSetValue("local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS);", "");
        java.lang.String str6 = timestampMillisConversion0.adjustAndSetValue("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS);" + "'", str3, "local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS);");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! = hi!.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);" + "'", str6, "hi! = hi!.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsC2RNDTest0.test18");
        org.apache.avro.data.TimeConversions.DateConversion dateConversion0 = new org.apache.avro.data.TimeConversions.DateConversion();
        org.apache.avro.Schema schema2 = null;
        org.apache.avro.LogicalType logicalType3 = null;
        java.time.LocalDate localDate4 = dateConversion0.fromInt((java.lang.Integer) 100, schema2, logicalType3);
        java.lang.String str5 = dateConversion0.getLogicalTypeName();
        org.apache.avro.data.TimeConversions.DateConversion dateConversion6 = new org.apache.avro.data.TimeConversions.DateConversion();
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.LogicalType logicalType9 = null;
        java.time.LocalDate localDate10 = dateConversion6.fromInt((java.lang.Integer) 100, schema8, logicalType9);
        org.apache.avro.data.TimeConversions.LocalTimestampMillisConversion localTimestampMillisConversion11 = new org.apache.avro.data.TimeConversions.LocalTimestampMillisConversion();
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion13 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        org.apache.avro.data.TimeConversions.TimestampMicrosConversion timestampMicrosConversion15 = new org.apache.avro.data.TimeConversions.TimestampMicrosConversion();
        org.apache.avro.Schema schema16 = timestampMicrosConversion15.getRecommendedSchema();
        org.apache.avro.LogicalType logicalType17 = null;
        java.time.LocalDateTime localDateTime18 = localTimestampNanosConversion13.fromLong((java.lang.Long) 10L, schema16, logicalType17);
        org.apache.avro.LogicalType logicalType19 = null;
        java.time.LocalDateTime localDateTime20 = localTimestampMillisConversion11.fromLong((java.lang.Long) 0L, schema16, logicalType19);
        org.apache.avro.LogicalType logicalType21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long22 = dateConversion0.toLong(localDate10, schema16, logicalType21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.LogicalType.getName()\" because \"type\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "date" + "'", str5, "date");
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsC2RNDTest0.test19");
        org.apache.avro.data.TimeConversions.DateConversion dateConversion0 = new org.apache.avro.data.TimeConversions.DateConversion();
        java.lang.String str3 = dateConversion0.adjustAndSetValue("local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS);", "local-timestamp-nanos = local-timestamp-nanos;");
        org.apache.avro.data.TimeConversions.DateConversion dateConversion4 = new org.apache.avro.data.TimeConversions.DateConversion();
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.LogicalType logicalType7 = null;
        java.time.LocalDate localDate8 = dateConversion4.fromInt((java.lang.Integer) 100, schema6, logicalType7);
        org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion localTimestampMicrosConversion9 = new org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion();
        java.lang.Class<java.time.LocalDateTime> localDateTimeClass10 = localTimestampMicrosConversion9.getConvertedType();
        org.apache.avro.Schema schema11 = localTimestampMicrosConversion9.getRecommendedSchema();
        org.apache.avro.LogicalType logicalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long13 = dateConversion0.toLong(localDate8, schema11, logicalType12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.LogicalType.getName()\" because \"type\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = local-timestamp-nanos = local-timestamp-nanos;;" + "'", str3, "local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = local-timestamp-nanos = local-timestamp-nanos;;");
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDateTimeClass10);
        org.junit.Assert.assertNotNull(schema11);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsC2RNDTest0.test20");
        org.apache.avro.data.TimeConversions.TimestampMillisConversion timestampMillisConversion0 = new org.apache.avro.data.TimeConversions.TimestampMillisConversion();
        java.lang.String str3 = timestampMillisConversion0.adjustAndSetValue("local-timestamp-nanos", "");
        java.lang.Class<java.time.Instant> instantClass4 = timestampMillisConversion0.getConvertedType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS);" + "'", str3, "local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS);");
        org.junit.Assert.assertNotNull(instantClass4);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsC2RNDTest0.test21");
        org.apache.avro.data.TimeConversions.TimestampMillisConversion timestampMillisConversion0 = new org.apache.avro.data.TimeConversions.TimestampMillisConversion();
        java.lang.String str3 = timestampMillisConversion0.adjustAndSetValue("local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS);", "");
        java.lang.Class<java.time.Instant> instantClass4 = timestampMillisConversion0.getConvertedType();
        java.time.Instant instant5 = null;
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion6 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        org.apache.avro.data.TimeConversions.TimestampMicrosConversion timestampMicrosConversion8 = new org.apache.avro.data.TimeConversions.TimestampMicrosConversion();
        org.apache.avro.Schema schema9 = timestampMicrosConversion8.getRecommendedSchema();
        org.apache.avro.LogicalType logicalType10 = null;
        java.time.LocalDateTime localDateTime11 = localTimestampNanosConversion6.fromLong((java.lang.Long) 10L, schema9, logicalType10);
        java.lang.String str12 = localTimestampNanosConversion6.getLogicalTypeName();
        org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion localTimestampMicrosConversion14 = new org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion();
        java.lang.Class<java.time.LocalDateTime> localDateTimeClass15 = localTimestampMicrosConversion14.getConvertedType();
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion16 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        java.lang.String str17 = localTimestampNanosConversion16.getLogicalTypeName();
        org.apache.avro.Schema schema19 = null;
        org.apache.avro.LogicalType logicalType20 = null;
        java.time.LocalDateTime localDateTime21 = localTimestampNanosConversion16.fromLong((java.lang.Long) 0L, schema19, logicalType20);
        org.apache.avro.Schema schema22 = null;
        org.apache.avro.LogicalType logicalType23 = null;
        java.lang.Long long24 = localTimestampMicrosConversion14.toLong(localDateTime21, schema22, logicalType23);
        org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion localTimestampMicrosConversion25 = new org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion();
        java.lang.Class<java.time.LocalDateTime> localDateTimeClass26 = localTimestampMicrosConversion25.getConvertedType();
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion27 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        java.lang.String str28 = localTimestampNanosConversion27.getLogicalTypeName();
        org.apache.avro.Schema schema30 = null;
        org.apache.avro.LogicalType logicalType31 = null;
        java.time.LocalDateTime localDateTime32 = localTimestampNanosConversion27.fromLong((java.lang.Long) 0L, schema30, logicalType31);
        org.apache.avro.Schema schema33 = null;
        org.apache.avro.LogicalType logicalType34 = null;
        java.lang.Long long35 = localTimestampMicrosConversion25.toLong(localDateTime32, schema33, logicalType34);
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion36 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        org.apache.avro.data.TimeConversions.TimestampMicrosConversion timestampMicrosConversion38 = new org.apache.avro.data.TimeConversions.TimestampMicrosConversion();
        org.apache.avro.Schema schema39 = timestampMicrosConversion38.getRecommendedSchema();
        org.apache.avro.LogicalType logicalType40 = null;
        java.time.LocalDateTime localDateTime41 = localTimestampNanosConversion36.fromLong((java.lang.Long) 10L, schema39, logicalType40);
        org.apache.avro.LogicalType logicalType42 = null;
        java.lang.Long long43 = localTimestampMicrosConversion14.toLong(localDateTime32, schema39, logicalType42);
        org.apache.avro.LogicalType logicalType44 = null;
        java.time.LocalDateTime localDateTime45 = localTimestampNanosConversion6.fromLong((java.lang.Long) 1L, schema39, logicalType44);
        org.apache.avro.LogicalType logicalType46 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long47 = timestampMillisConversion0.toLong(instant5, schema39, logicalType46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.Instant.toEpochMilli()\" because \"timestamp\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS);" + "'", str3, "local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS);");
        org.junit.Assert.assertNotNull(instantClass4);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "local-timestamp-nanos" + "'", str12, "local-timestamp-nanos");
        org.junit.Assert.assertNotNull(localDateTimeClass15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "local-timestamp-nanos" + "'", str17, "local-timestamp-nanos");
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(localDateTimeClass26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "local-timestamp-nanos" + "'", str28, "local-timestamp-nanos");
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(schema39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNotNull(localDateTime45);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsC2RNDTest0.test22");
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
            System.out.format("%n%s%n", "ISW2TimeConversionsC2RNDTest0.test23");
        org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion localTimestampMicrosConversion0 = new org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion();
        java.lang.Class<java.time.LocalDateTime> localDateTimeClass1 = localTimestampMicrosConversion0.getConvertedType();
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion2 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        java.lang.String str3 = localTimestampNanosConversion2.getLogicalTypeName();
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.LogicalType logicalType6 = null;
        java.time.LocalDateTime localDateTime7 = localTimestampNanosConversion2.fromLong((java.lang.Long) 0L, schema5, logicalType6);
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.LogicalType logicalType9 = null;
        java.lang.Long long10 = localTimestampMicrosConversion0.toLong(localDateTime7, schema8, logicalType9);
        java.lang.String str11 = localTimestampMicrosConversion0.getLogicalTypeName();
        org.junit.Assert.assertNotNull(localDateTimeClass1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "local-timestamp-nanos" + "'", str3, "local-timestamp-nanos");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "local-timestamp-micros" + "'", str11, "local-timestamp-micros");
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsC2RNDTest0.test24");
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion0 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        org.apache.avro.data.TimeConversions.TimestampMicrosConversion timestampMicrosConversion2 = new org.apache.avro.data.TimeConversions.TimestampMicrosConversion();
        org.apache.avro.Schema schema3 = timestampMicrosConversion2.getRecommendedSchema();
        org.apache.avro.LogicalType logicalType4 = null;
        java.time.LocalDateTime localDateTime5 = localTimestampNanosConversion0.fromLong((java.lang.Long) 10L, schema3, logicalType4);
        org.apache.avro.Schema schema6 = localTimestampNanosConversion0.getRecommendedSchema();
        java.lang.String str9 = localTimestampNanosConversion0.adjustAndSetValue("timestamp-nanos", "local-timestamp-micros");
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "timestamp-nanos = local-timestamp-micros;" + "'", str9, "timestamp-nanos = local-timestamp-micros;");
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsC2RNDTest0.test25");
        org.apache.avro.data.TimeConversions.DateConversion dateConversion0 = new org.apache.avro.data.TimeConversions.DateConversion();
        org.apache.avro.Schema schema2 = null;
        org.apache.avro.LogicalType logicalType3 = null;
        java.time.LocalDate localDate4 = dateConversion0.fromInt((java.lang.Integer) 100, schema2, logicalType3);
        java.lang.Class<java.time.LocalDate> localDateClass5 = dateConversion0.getConvertedType();
        org.apache.avro.data.TimeConversions.DateConversion dateConversion6 = new org.apache.avro.data.TimeConversions.DateConversion();
        java.lang.String str9 = dateConversion6.adjustAndSetValue("local-timestamp-nanos", "local-timestamp-nanos");
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion11 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        org.apache.avro.data.TimeConversions.TimestampMicrosConversion timestampMicrosConversion13 = new org.apache.avro.data.TimeConversions.TimestampMicrosConversion();
        org.apache.avro.Schema schema14 = timestampMicrosConversion13.getRecommendedSchema();
        org.apache.avro.LogicalType logicalType15 = null;
        java.time.LocalDateTime localDateTime16 = localTimestampNanosConversion11.fromLong((java.lang.Long) 10L, schema14, logicalType15);
        java.lang.String str17 = localTimestampNanosConversion11.getLogicalTypeName();
        org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion localTimestampMicrosConversion19 = new org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion();
        java.lang.Class<java.time.LocalDateTime> localDateTimeClass20 = localTimestampMicrosConversion19.getConvertedType();
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion21 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        java.lang.String str22 = localTimestampNanosConversion21.getLogicalTypeName();
        org.apache.avro.Schema schema24 = null;
        org.apache.avro.LogicalType logicalType25 = null;
        java.time.LocalDateTime localDateTime26 = localTimestampNanosConversion21.fromLong((java.lang.Long) 0L, schema24, logicalType25);
        org.apache.avro.Schema schema27 = null;
        org.apache.avro.LogicalType logicalType28 = null;
        java.lang.Long long29 = localTimestampMicrosConversion19.toLong(localDateTime26, schema27, logicalType28);
        org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion localTimestampMicrosConversion30 = new org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion();
        java.lang.Class<java.time.LocalDateTime> localDateTimeClass31 = localTimestampMicrosConversion30.getConvertedType();
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion32 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        java.lang.String str33 = localTimestampNanosConversion32.getLogicalTypeName();
        org.apache.avro.Schema schema35 = null;
        org.apache.avro.LogicalType logicalType36 = null;
        java.time.LocalDateTime localDateTime37 = localTimestampNanosConversion32.fromLong((java.lang.Long) 0L, schema35, logicalType36);
        org.apache.avro.Schema schema38 = null;
        org.apache.avro.LogicalType logicalType39 = null;
        java.lang.Long long40 = localTimestampMicrosConversion30.toLong(localDateTime37, schema38, logicalType39);
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion41 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        org.apache.avro.data.TimeConversions.TimestampMicrosConversion timestampMicrosConversion43 = new org.apache.avro.data.TimeConversions.TimestampMicrosConversion();
        org.apache.avro.Schema schema44 = timestampMicrosConversion43.getRecommendedSchema();
        org.apache.avro.LogicalType logicalType45 = null;
        java.time.LocalDateTime localDateTime46 = localTimestampNanosConversion41.fromLong((java.lang.Long) 10L, schema44, logicalType45);
        org.apache.avro.LogicalType logicalType47 = null;
        java.lang.Long long48 = localTimestampMicrosConversion19.toLong(localDateTime37, schema44, logicalType47);
        org.apache.avro.LogicalType logicalType49 = null;
        java.time.LocalDateTime localDateTime50 = localTimestampNanosConversion11.fromLong((java.lang.Long) 1L, schema44, logicalType49);
        org.apache.avro.LogicalType logicalType51 = null;
        java.time.LocalDate localDate52 = dateConversion6.fromInt((java.lang.Integer) 0, schema44, logicalType51);
        org.apache.avro.Schema schema53 = null;
        org.apache.avro.LogicalType logicalType54 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long55 = dateConversion0.toLong(localDate52, schema53, logicalType54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.LogicalType.getName()\" because \"type\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDateClass5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "local-timestamp-nanos = local-timestamp-nanos;" + "'", str9, "local-timestamp-nanos = local-timestamp-nanos;");
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "local-timestamp-nanos" + "'", str17, "local-timestamp-nanos");
        org.junit.Assert.assertNotNull(localDateTimeClass20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "local-timestamp-nanos" + "'", str22, "local-timestamp-nanos");
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(localDateTimeClass31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "local-timestamp-nanos" + "'", str33, "local-timestamp-nanos");
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertNotNull(schema44);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(localDate52);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsC2RNDTest0.test26");
        org.apache.avro.data.TimeConversions.DateConversion dateConversion0 = new org.apache.avro.data.TimeConversions.DateConversion();
        org.apache.avro.Schema schema2 = null;
        org.apache.avro.LogicalType logicalType3 = null;
        java.time.LocalDate localDate4 = dateConversion0.fromInt((java.lang.Integer) 100, schema2, logicalType3);
        java.lang.String str7 = dateConversion0.adjustAndSetValue("", "");
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " = ;" + "'", str7, " = ;");
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsC2RNDTest0.test27");
        org.apache.avro.data.TimeConversions.TimestampNanosConversion timestampNanosConversion0 = new org.apache.avro.data.TimeConversions.TimestampNanosConversion();
        java.lang.String str1 = timestampNanosConversion0.getLogicalTypeName();
        java.lang.String str4 = timestampNanosConversion0.adjustAndSetValue("hi! = hi!.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);", "local-timestamp-micros");
        org.apache.avro.Schema schema5 = timestampNanosConversion0.getRecommendedSchema();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "timestamp-nanos" + "'", str1, "timestamp-nanos");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi! = hi!.truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = local-timestamp-micros.truncatedTo(java.time.temporal.ChronoUnit.NANOS);" + "'", str4, "hi! = hi!.truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = local-timestamp-micros.truncatedTo(java.time.temporal.ChronoUnit.NANOS);");
        org.junit.Assert.assertNotNull(schema5);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsC2RNDTest0.test28");
        org.apache.avro.data.TimeConversions.TimestampNanosConversion timestampNanosConversion0 = new org.apache.avro.data.TimeConversions.TimestampNanosConversion();
        java.lang.String str1 = timestampNanosConversion0.getLogicalTypeName();
        java.lang.String str4 = timestampNanosConversion0.adjustAndSetValue("hi! = hi!.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);", "local-timestamp-micros");
        java.time.Instant instant5 = null;
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion6 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        org.apache.avro.data.TimeConversions.TimestampMicrosConversion timestampMicrosConversion8 = new org.apache.avro.data.TimeConversions.TimestampMicrosConversion();
        org.apache.avro.Schema schema9 = timestampMicrosConversion8.getRecommendedSchema();
        org.apache.avro.LogicalType logicalType10 = null;
        java.time.LocalDateTime localDateTime11 = localTimestampNanosConversion6.fromLong((java.lang.Long) 10L, schema9, logicalType10);
        org.apache.avro.LogicalType logicalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int13 = timestampNanosConversion0.toInt(instant5, schema9, logicalType12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.LogicalType.getName()\" because \"type\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "timestamp-nanos" + "'", str1, "timestamp-nanos");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi! = hi!.truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = local-timestamp-micros.truncatedTo(java.time.temporal.ChronoUnit.NANOS);" + "'", str4, "hi! = hi!.truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = local-timestamp-micros.truncatedTo(java.time.temporal.ChronoUnit.NANOS);");
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsC2RNDTest0.test29");
        org.apache.avro.data.TimeConversions.TimestampNanosConversion timestampNanosConversion0 = new org.apache.avro.data.TimeConversions.TimestampNanosConversion();
        java.lang.String str3 = timestampNanosConversion0.adjustAndSetValue("local-timestamp-nanos", "local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS);");
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion5 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        org.apache.avro.data.TimeConversions.TimestampMicrosConversion timestampMicrosConversion7 = new org.apache.avro.data.TimeConversions.TimestampMicrosConversion();
        org.apache.avro.Schema schema8 = timestampMicrosConversion7.getRecommendedSchema();
        org.apache.avro.LogicalType logicalType9 = null;
        java.time.LocalDateTime localDateTime10 = localTimestampNanosConversion5.fromLong((java.lang.Long) 10L, schema8, logicalType9);
        org.apache.avro.LogicalType logicalType11 = null;
        java.time.Instant instant12 = timestampNanosConversion0.fromLong((java.lang.Long) (-1L), schema8, logicalType11);
        java.lang.String str15 = timestampNanosConversion0.adjustAndSetValue("local-timestamp-nanos = local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS);.truncatedTo(java.time.temporal.ChronoUnit.NANOS);", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "local-timestamp-nanos = local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS);.truncatedTo(java.time.temporal.ChronoUnit.NANOS);" + "'", str3, "local-timestamp-nanos = local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS);.truncatedTo(java.time.temporal.ChronoUnit.NANOS);");
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "local-timestamp-nanos = local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS);.truncatedTo(java.time.temporal.ChronoUnit.NANOS); = .truncatedTo(java.time.temporal.ChronoUnit.NANOS);" + "'", str15, "local-timestamp-nanos = local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS);.truncatedTo(java.time.temporal.ChronoUnit.NANOS); = .truncatedTo(java.time.temporal.ChronoUnit.NANOS);");
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsC2RNDTest0.test30");
        org.apache.avro.data.TimeConversions.TimestampMicrosConversion timestampMicrosConversion0 = new org.apache.avro.data.TimeConversions.TimestampMicrosConversion();
        org.apache.avro.data.TimeConversions.DateConversion dateConversion2 = new org.apache.avro.data.TimeConversions.DateConversion();
        java.lang.String str5 = dateConversion2.adjustAndSetValue("local-timestamp-nanos", "local-timestamp-nanos");
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion7 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        org.apache.avro.data.TimeConversions.TimestampMicrosConversion timestampMicrosConversion9 = new org.apache.avro.data.TimeConversions.TimestampMicrosConversion();
        org.apache.avro.Schema schema10 = timestampMicrosConversion9.getRecommendedSchema();
        org.apache.avro.LogicalType logicalType11 = null;
        java.time.LocalDateTime localDateTime12 = localTimestampNanosConversion7.fromLong((java.lang.Long) 10L, schema10, logicalType11);
        java.lang.String str13 = localTimestampNanosConversion7.getLogicalTypeName();
        org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion localTimestampMicrosConversion15 = new org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion();
        java.lang.Class<java.time.LocalDateTime> localDateTimeClass16 = localTimestampMicrosConversion15.getConvertedType();
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion17 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        java.lang.String str18 = localTimestampNanosConversion17.getLogicalTypeName();
        org.apache.avro.Schema schema20 = null;
        org.apache.avro.LogicalType logicalType21 = null;
        java.time.LocalDateTime localDateTime22 = localTimestampNanosConversion17.fromLong((java.lang.Long) 0L, schema20, logicalType21);
        org.apache.avro.Schema schema23 = null;
        org.apache.avro.LogicalType logicalType24 = null;
        java.lang.Long long25 = localTimestampMicrosConversion15.toLong(localDateTime22, schema23, logicalType24);
        org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion localTimestampMicrosConversion26 = new org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion();
        java.lang.Class<java.time.LocalDateTime> localDateTimeClass27 = localTimestampMicrosConversion26.getConvertedType();
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion28 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        java.lang.String str29 = localTimestampNanosConversion28.getLogicalTypeName();
        org.apache.avro.Schema schema31 = null;
        org.apache.avro.LogicalType logicalType32 = null;
        java.time.LocalDateTime localDateTime33 = localTimestampNanosConversion28.fromLong((java.lang.Long) 0L, schema31, logicalType32);
        org.apache.avro.Schema schema34 = null;
        org.apache.avro.LogicalType logicalType35 = null;
        java.lang.Long long36 = localTimestampMicrosConversion26.toLong(localDateTime33, schema34, logicalType35);
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion37 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        org.apache.avro.data.TimeConversions.TimestampMicrosConversion timestampMicrosConversion39 = new org.apache.avro.data.TimeConversions.TimestampMicrosConversion();
        org.apache.avro.Schema schema40 = timestampMicrosConversion39.getRecommendedSchema();
        org.apache.avro.LogicalType logicalType41 = null;
        java.time.LocalDateTime localDateTime42 = localTimestampNanosConversion37.fromLong((java.lang.Long) 10L, schema40, logicalType41);
        org.apache.avro.LogicalType logicalType43 = null;
        java.lang.Long long44 = localTimestampMicrosConversion15.toLong(localDateTime33, schema40, logicalType43);
        org.apache.avro.LogicalType logicalType45 = null;
        java.time.LocalDateTime localDateTime46 = localTimestampNanosConversion7.fromLong((java.lang.Long) 1L, schema40, logicalType45);
        org.apache.avro.LogicalType logicalType47 = null;
        java.time.LocalDate localDate48 = dateConversion2.fromInt((java.lang.Integer) 0, schema40, logicalType47);
        org.apache.avro.LogicalType logicalType49 = null;
        java.time.Instant instant50 = timestampMicrosConversion0.fromLong((java.lang.Long) 0L, schema40, logicalType49);
        java.lang.Class<java.time.Instant> instantClass51 = timestampMicrosConversion0.getConvertedType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "local-timestamp-nanos = local-timestamp-nanos;" + "'", str5, "local-timestamp-nanos = local-timestamp-nanos;");
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "local-timestamp-nanos" + "'", str13, "local-timestamp-nanos");
        org.junit.Assert.assertNotNull(localDateTimeClass16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "local-timestamp-nanos" + "'", str18, "local-timestamp-nanos");
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(localDateTimeClass27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "local-timestamp-nanos" + "'", str29, "local-timestamp-nanos");
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(schema40);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(localDate48);
        org.junit.Assert.assertNotNull(instant50);
        org.junit.Assert.assertNotNull(instantClass51);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsC2RNDTest0.test31");
        org.apache.avro.data.TimeConversions.DateConversion dateConversion0 = new org.apache.avro.data.TimeConversions.DateConversion();
        org.apache.avro.Schema schema2 = null;
        org.apache.avro.LogicalType logicalType3 = null;
        java.time.LocalDate localDate4 = dateConversion0.fromInt((java.lang.Integer) 100, schema2, logicalType3);
        java.lang.String str7 = dateConversion0.adjustAndSetValue("", "local-timestamp-micros");
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " = local-timestamp-micros;" + "'", str7, " = local-timestamp-micros;");
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsC2RNDTest0.test32");
        org.apache.avro.data.TimeConversions.DateConversion dateConversion0 = new org.apache.avro.data.TimeConversions.DateConversion();
        java.lang.String str3 = dateConversion0.adjustAndSetValue("local-timestamp-nanos", "local-timestamp-nanos");
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion5 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        org.apache.avro.data.TimeConversions.TimestampMicrosConversion timestampMicrosConversion7 = new org.apache.avro.data.TimeConversions.TimestampMicrosConversion();
        org.apache.avro.Schema schema8 = timestampMicrosConversion7.getRecommendedSchema();
        org.apache.avro.LogicalType logicalType9 = null;
        java.time.LocalDateTime localDateTime10 = localTimestampNanosConversion5.fromLong((java.lang.Long) 10L, schema8, logicalType9);
        java.lang.String str11 = localTimestampNanosConversion5.getLogicalTypeName();
        org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion localTimestampMicrosConversion13 = new org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion();
        java.lang.Class<java.time.LocalDateTime> localDateTimeClass14 = localTimestampMicrosConversion13.getConvertedType();
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion15 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        java.lang.String str16 = localTimestampNanosConversion15.getLogicalTypeName();
        org.apache.avro.Schema schema18 = null;
        org.apache.avro.LogicalType logicalType19 = null;
        java.time.LocalDateTime localDateTime20 = localTimestampNanosConversion15.fromLong((java.lang.Long) 0L, schema18, logicalType19);
        org.apache.avro.Schema schema21 = null;
        org.apache.avro.LogicalType logicalType22 = null;
        java.lang.Long long23 = localTimestampMicrosConversion13.toLong(localDateTime20, schema21, logicalType22);
        org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion localTimestampMicrosConversion24 = new org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion();
        java.lang.Class<java.time.LocalDateTime> localDateTimeClass25 = localTimestampMicrosConversion24.getConvertedType();
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion26 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        java.lang.String str27 = localTimestampNanosConversion26.getLogicalTypeName();
        org.apache.avro.Schema schema29 = null;
        org.apache.avro.LogicalType logicalType30 = null;
        java.time.LocalDateTime localDateTime31 = localTimestampNanosConversion26.fromLong((java.lang.Long) 0L, schema29, logicalType30);
        org.apache.avro.Schema schema32 = null;
        org.apache.avro.LogicalType logicalType33 = null;
        java.lang.Long long34 = localTimestampMicrosConversion24.toLong(localDateTime31, schema32, logicalType33);
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion35 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        org.apache.avro.data.TimeConversions.TimestampMicrosConversion timestampMicrosConversion37 = new org.apache.avro.data.TimeConversions.TimestampMicrosConversion();
        org.apache.avro.Schema schema38 = timestampMicrosConversion37.getRecommendedSchema();
        org.apache.avro.LogicalType logicalType39 = null;
        java.time.LocalDateTime localDateTime40 = localTimestampNanosConversion35.fromLong((java.lang.Long) 10L, schema38, logicalType39);
        org.apache.avro.LogicalType logicalType41 = null;
        java.lang.Long long42 = localTimestampMicrosConversion13.toLong(localDateTime31, schema38, logicalType41);
        org.apache.avro.LogicalType logicalType43 = null;
        java.time.LocalDateTime localDateTime44 = localTimestampNanosConversion5.fromLong((java.lang.Long) 1L, schema38, logicalType43);
        org.apache.avro.LogicalType logicalType45 = null;
        java.time.LocalDate localDate46 = dateConversion0.fromInt((java.lang.Integer) 0, schema38, logicalType45);
        org.apache.avro.data.TimeConversions.TimeMicrosConversion timeMicrosConversion48 = new org.apache.avro.data.TimeConversions.TimeMicrosConversion();
        org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion localTimestampMicrosConversion50 = new org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion();
        java.lang.Class<java.time.LocalDateTime> localDateTimeClass51 = localTimestampMicrosConversion50.getConvertedType();
        org.apache.avro.Schema schema52 = localTimestampMicrosConversion50.getRecommendedSchema();
        org.apache.avro.LogicalType logicalType53 = null;
        java.time.LocalTime localTime54 = timeMicrosConversion48.fromLong((java.lang.Long) 0L, schema52, logicalType53);
        org.apache.avro.LogicalType logicalType55 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate56 = dateConversion0.fromLong((java.lang.Long) 0L, schema52, logicalType55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.LogicalType.getName()\" because \"type\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "local-timestamp-nanos = local-timestamp-nanos;" + "'", str3, "local-timestamp-nanos = local-timestamp-nanos;");
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "local-timestamp-nanos" + "'", str11, "local-timestamp-nanos");
        org.junit.Assert.assertNotNull(localDateTimeClass14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "local-timestamp-nanos" + "'", str16, "local-timestamp-nanos");
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(localDateTimeClass25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "local-timestamp-nanos" + "'", str27, "local-timestamp-nanos");
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(schema38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(localDate46);
        org.junit.Assert.assertNotNull(localDateTimeClass51);
        org.junit.Assert.assertNotNull(schema52);
        org.junit.Assert.assertNotNull(localTime54);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsC2RNDTest0.test33");
        org.apache.avro.data.TimeConversions.TimestampMillisConversion timestampMillisConversion0 = new org.apache.avro.data.TimeConversions.TimestampMillisConversion();
        java.lang.String str3 = timestampMillisConversion0.adjustAndSetValue("timestamp-nanos = local-timestamp-micros;", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "timestamp-nanos = local-timestamp-micros; = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS);" + "'", str3, "timestamp-nanos = local-timestamp-micros; = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS);");
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsC2RNDTest0.test34");
        org.apache.avro.data.TimeConversions.TimestampMicrosConversion timestampMicrosConversion0 = new org.apache.avro.data.TimeConversions.TimestampMicrosConversion();
        java.lang.String str3 = timestampMicrosConversion0.adjustAndSetValue("local-timestamp-nanos = local-timestamp-nanos;", "local-timestamp-nanos");
        org.apache.avro.Schema schema4 = timestampMicrosConversion0.getRecommendedSchema();
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion6 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        java.lang.String str7 = localTimestampNanosConversion6.getLogicalTypeName();
        org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion localTimestampMicrosConversion8 = new org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion();
        java.lang.Class<java.time.LocalDateTime> localDateTimeClass9 = localTimestampMicrosConversion8.getConvertedType();
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion10 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        java.lang.String str11 = localTimestampNanosConversion10.getLogicalTypeName();
        org.apache.avro.Schema schema13 = null;
        org.apache.avro.LogicalType logicalType14 = null;
        java.time.LocalDateTime localDateTime15 = localTimestampNanosConversion10.fromLong((java.lang.Long) 0L, schema13, logicalType14);
        org.apache.avro.Schema schema16 = null;
        org.apache.avro.LogicalType logicalType17 = null;
        java.lang.Long long18 = localTimestampMicrosConversion8.toLong(localDateTime15, schema16, logicalType17);
        org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion localTimestampMicrosConversion19 = new org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion();
        java.lang.Class<java.time.LocalDateTime> localDateTimeClass20 = localTimestampMicrosConversion19.getConvertedType();
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion21 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        java.lang.String str22 = localTimestampNanosConversion21.getLogicalTypeName();
        org.apache.avro.Schema schema24 = null;
        org.apache.avro.LogicalType logicalType25 = null;
        java.time.LocalDateTime localDateTime26 = localTimestampNanosConversion21.fromLong((java.lang.Long) 0L, schema24, logicalType25);
        org.apache.avro.Schema schema27 = null;
        org.apache.avro.LogicalType logicalType28 = null;
        java.lang.Long long29 = localTimestampMicrosConversion19.toLong(localDateTime26, schema27, logicalType28);
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion30 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        org.apache.avro.data.TimeConversions.TimestampMicrosConversion timestampMicrosConversion32 = new org.apache.avro.data.TimeConversions.TimestampMicrosConversion();
        org.apache.avro.Schema schema33 = timestampMicrosConversion32.getRecommendedSchema();
        org.apache.avro.LogicalType logicalType34 = null;
        java.time.LocalDateTime localDateTime35 = localTimestampNanosConversion30.fromLong((java.lang.Long) 10L, schema33, logicalType34);
        org.apache.avro.LogicalType logicalType36 = null;
        java.lang.Long long37 = localTimestampMicrosConversion8.toLong(localDateTime26, schema33, logicalType36);
        org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion localTimestampMicrosConversion38 = new org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion();
        java.lang.Class<java.time.LocalDateTime> localDateTimeClass39 = localTimestampMicrosConversion38.getConvertedType();
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion40 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        java.lang.String str41 = localTimestampNanosConversion40.getLogicalTypeName();
        org.apache.avro.Schema schema43 = null;
        org.apache.avro.LogicalType logicalType44 = null;
        java.time.LocalDateTime localDateTime45 = localTimestampNanosConversion40.fromLong((java.lang.Long) 0L, schema43, logicalType44);
        org.apache.avro.Schema schema46 = null;
        org.apache.avro.LogicalType logicalType47 = null;
        java.lang.Long long48 = localTimestampMicrosConversion38.toLong(localDateTime45, schema46, logicalType47);
        org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion localTimestampMicrosConversion49 = new org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion();
        java.lang.Class<java.time.LocalDateTime> localDateTimeClass50 = localTimestampMicrosConversion49.getConvertedType();
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion51 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        java.lang.String str52 = localTimestampNanosConversion51.getLogicalTypeName();
        org.apache.avro.Schema schema54 = null;
        org.apache.avro.LogicalType logicalType55 = null;
        java.time.LocalDateTime localDateTime56 = localTimestampNanosConversion51.fromLong((java.lang.Long) 0L, schema54, logicalType55);
        org.apache.avro.Schema schema57 = null;
        org.apache.avro.LogicalType logicalType58 = null;
        java.lang.Long long59 = localTimestampMicrosConversion49.toLong(localDateTime56, schema57, logicalType58);
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion60 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        org.apache.avro.data.TimeConversions.TimestampMicrosConversion timestampMicrosConversion62 = new org.apache.avro.data.TimeConversions.TimestampMicrosConversion();
        org.apache.avro.Schema schema63 = timestampMicrosConversion62.getRecommendedSchema();
        org.apache.avro.LogicalType logicalType64 = null;
        java.time.LocalDateTime localDateTime65 = localTimestampNanosConversion60.fromLong((java.lang.Long) 10L, schema63, logicalType64);
        org.apache.avro.LogicalType logicalType66 = null;
        java.lang.Long long67 = localTimestampMicrosConversion38.toLong(localDateTime56, schema63, logicalType66);
        org.apache.avro.LogicalType logicalType68 = null;
        java.lang.Long long69 = localTimestampNanosConversion6.toLong(localDateTime26, schema63, logicalType68);
        org.apache.avro.LogicalType logicalType70 = null;
        java.time.Instant instant71 = timestampMicrosConversion0.fromLong((java.lang.Long) 10L, schema63, logicalType70);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "local-timestamp-nanos = local-timestamp-nanos; = local-timestamp-nanos.truncatedTo(java.time.temporal.ChronoUnit.MICROS);" + "'", str3, "local-timestamp-nanos = local-timestamp-nanos; = local-timestamp-nanos.truncatedTo(java.time.temporal.ChronoUnit.MICROS);");
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "local-timestamp-nanos" + "'", str7, "local-timestamp-nanos");
        org.junit.Assert.assertNotNull(localDateTimeClass9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "local-timestamp-nanos" + "'", str11, "local-timestamp-nanos");
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(localDateTimeClass20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "local-timestamp-nanos" + "'", str22, "local-timestamp-nanos");
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(localDateTimeClass39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "local-timestamp-nanos" + "'", str41, "local-timestamp-nanos");
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertNotNull(localDateTimeClass50);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "local-timestamp-nanos" + "'", str52, "local-timestamp-nanos");
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertNotNull(schema63);
        org.junit.Assert.assertNotNull(localDateTime65);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertNotNull(instant71);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsC2RNDTest0.test35");
        org.apache.avro.data.TimeConversions.TimestampMillisConversion timestampMillisConversion0 = new org.apache.avro.data.TimeConversions.TimestampMillisConversion();
        java.lang.String str3 = timestampMillisConversion0.adjustAndSetValue("local-timestamp-nanos", "");
        java.lang.String str4 = timestampMillisConversion0.getLogicalTypeName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS);" + "'", str3, "local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS);");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "timestamp-millis" + "'", str4, "timestamp-millis");
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsC2RNDTest0.test36");
        org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion localTimestampMicrosConversion0 = new org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion();
        java.lang.Class<java.time.LocalDateTime> localDateTimeClass1 = localTimestampMicrosConversion0.getConvertedType();
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion2 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        java.lang.String str3 = localTimestampNanosConversion2.getLogicalTypeName();
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.LogicalType logicalType6 = null;
        java.time.LocalDateTime localDateTime7 = localTimestampNanosConversion2.fromLong((java.lang.Long) 0L, schema5, logicalType6);
        org.apache.avro.Schema schema8 = null;
        org.apache.avro.LogicalType logicalType9 = null;
        java.lang.Long long10 = localTimestampMicrosConversion0.toLong(localDateTime7, schema8, logicalType9);
        java.lang.Class<java.time.LocalDateTime> localDateTimeClass11 = localTimestampMicrosConversion0.getConvertedType();
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion12 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        org.apache.avro.data.TimeConversions.TimestampMicrosConversion timestampMicrosConversion14 = new org.apache.avro.data.TimeConversions.TimestampMicrosConversion();
        org.apache.avro.Schema schema15 = timestampMicrosConversion14.getRecommendedSchema();
        org.apache.avro.LogicalType logicalType16 = null;
        java.time.LocalDateTime localDateTime17 = localTimestampNanosConversion12.fromLong((java.lang.Long) 10L, schema15, logicalType16);
        org.apache.avro.data.TimeConversions.TimestampMicrosConversion timestampMicrosConversion18 = new org.apache.avro.data.TimeConversions.TimestampMicrosConversion();
        org.apache.avro.data.TimeConversions.DateConversion dateConversion20 = new org.apache.avro.data.TimeConversions.DateConversion();
        java.lang.String str23 = dateConversion20.adjustAndSetValue("local-timestamp-nanos", "local-timestamp-nanos");
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion25 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        org.apache.avro.data.TimeConversions.TimestampMicrosConversion timestampMicrosConversion27 = new org.apache.avro.data.TimeConversions.TimestampMicrosConversion();
        org.apache.avro.Schema schema28 = timestampMicrosConversion27.getRecommendedSchema();
        org.apache.avro.LogicalType logicalType29 = null;
        java.time.LocalDateTime localDateTime30 = localTimestampNanosConversion25.fromLong((java.lang.Long) 10L, schema28, logicalType29);
        java.lang.String str31 = localTimestampNanosConversion25.getLogicalTypeName();
        org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion localTimestampMicrosConversion33 = new org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion();
        java.lang.Class<java.time.LocalDateTime> localDateTimeClass34 = localTimestampMicrosConversion33.getConvertedType();
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion35 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        java.lang.String str36 = localTimestampNanosConversion35.getLogicalTypeName();
        org.apache.avro.Schema schema38 = null;
        org.apache.avro.LogicalType logicalType39 = null;
        java.time.LocalDateTime localDateTime40 = localTimestampNanosConversion35.fromLong((java.lang.Long) 0L, schema38, logicalType39);
        org.apache.avro.Schema schema41 = null;
        org.apache.avro.LogicalType logicalType42 = null;
        java.lang.Long long43 = localTimestampMicrosConversion33.toLong(localDateTime40, schema41, logicalType42);
        org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion localTimestampMicrosConversion44 = new org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion();
        java.lang.Class<java.time.LocalDateTime> localDateTimeClass45 = localTimestampMicrosConversion44.getConvertedType();
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion46 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        java.lang.String str47 = localTimestampNanosConversion46.getLogicalTypeName();
        org.apache.avro.Schema schema49 = null;
        org.apache.avro.LogicalType logicalType50 = null;
        java.time.LocalDateTime localDateTime51 = localTimestampNanosConversion46.fromLong((java.lang.Long) 0L, schema49, logicalType50);
        org.apache.avro.Schema schema52 = null;
        org.apache.avro.LogicalType logicalType53 = null;
        java.lang.Long long54 = localTimestampMicrosConversion44.toLong(localDateTime51, schema52, logicalType53);
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion55 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        org.apache.avro.data.TimeConversions.TimestampMicrosConversion timestampMicrosConversion57 = new org.apache.avro.data.TimeConversions.TimestampMicrosConversion();
        org.apache.avro.Schema schema58 = timestampMicrosConversion57.getRecommendedSchema();
        org.apache.avro.LogicalType logicalType59 = null;
        java.time.LocalDateTime localDateTime60 = localTimestampNanosConversion55.fromLong((java.lang.Long) 10L, schema58, logicalType59);
        org.apache.avro.LogicalType logicalType61 = null;
        java.lang.Long long62 = localTimestampMicrosConversion33.toLong(localDateTime51, schema58, logicalType61);
        org.apache.avro.LogicalType logicalType63 = null;
        java.time.LocalDateTime localDateTime64 = localTimestampNanosConversion25.fromLong((java.lang.Long) 1L, schema58, logicalType63);
        org.apache.avro.LogicalType logicalType65 = null;
        java.time.LocalDate localDate66 = dateConversion20.fromInt((java.lang.Integer) 0, schema58, logicalType65);
        org.apache.avro.LogicalType logicalType67 = null;
        java.time.Instant instant68 = timestampMicrosConversion18.fromLong((java.lang.Long) 0L, schema58, logicalType67);
        org.apache.avro.LogicalType logicalType69 = null;
        java.lang.Long long70 = localTimestampMicrosConversion0.toLong(localDateTime17, schema58, logicalType69);
        org.junit.Assert.assertNotNull(localDateTimeClass1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "local-timestamp-nanos" + "'", str3, "local-timestamp-nanos");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(localDateTimeClass11);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "local-timestamp-nanos = local-timestamp-nanos;" + "'", str23, "local-timestamp-nanos = local-timestamp-nanos;");
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "local-timestamp-nanos" + "'", str31, "local-timestamp-nanos");
        org.junit.Assert.assertNotNull(localDateTimeClass34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "local-timestamp-nanos" + "'", str36, "local-timestamp-nanos");
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNotNull(localDateTimeClass45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "local-timestamp-nanos" + "'", str47, "local-timestamp-nanos");
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertNotNull(schema58);
        org.junit.Assert.assertNotNull(localDateTime60);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertNotNull(localDateTime64);
        org.junit.Assert.assertNotNull(localDate66);
        org.junit.Assert.assertNotNull(instant68);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsC2RNDTest0.test37");
        org.apache.avro.data.TimeConversions.TimestampMillisConversion timestampMillisConversion0 = new org.apache.avro.data.TimeConversions.TimestampMillisConversion();
        java.lang.String str3 = timestampMillisConversion0.adjustAndSetValue("local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS);", "");
        org.apache.avro.data.TimeConversions.TimestampMicrosConversion timestampMicrosConversion5 = new org.apache.avro.data.TimeConversions.TimestampMicrosConversion();
        org.apache.avro.data.TimeConversions.DateConversion dateConversion7 = new org.apache.avro.data.TimeConversions.DateConversion();
        java.lang.String str10 = dateConversion7.adjustAndSetValue("local-timestamp-nanos", "local-timestamp-nanos");
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion12 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        org.apache.avro.data.TimeConversions.TimestampMicrosConversion timestampMicrosConversion14 = new org.apache.avro.data.TimeConversions.TimestampMicrosConversion();
        org.apache.avro.Schema schema15 = timestampMicrosConversion14.getRecommendedSchema();
        org.apache.avro.LogicalType logicalType16 = null;
        java.time.LocalDateTime localDateTime17 = localTimestampNanosConversion12.fromLong((java.lang.Long) 10L, schema15, logicalType16);
        java.lang.String str18 = localTimestampNanosConversion12.getLogicalTypeName();
        org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion localTimestampMicrosConversion20 = new org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion();
        java.lang.Class<java.time.LocalDateTime> localDateTimeClass21 = localTimestampMicrosConversion20.getConvertedType();
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion22 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        java.lang.String str23 = localTimestampNanosConversion22.getLogicalTypeName();
        org.apache.avro.Schema schema25 = null;
        org.apache.avro.LogicalType logicalType26 = null;
        java.time.LocalDateTime localDateTime27 = localTimestampNanosConversion22.fromLong((java.lang.Long) 0L, schema25, logicalType26);
        org.apache.avro.Schema schema28 = null;
        org.apache.avro.LogicalType logicalType29 = null;
        java.lang.Long long30 = localTimestampMicrosConversion20.toLong(localDateTime27, schema28, logicalType29);
        org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion localTimestampMicrosConversion31 = new org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion();
        java.lang.Class<java.time.LocalDateTime> localDateTimeClass32 = localTimestampMicrosConversion31.getConvertedType();
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion33 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        java.lang.String str34 = localTimestampNanosConversion33.getLogicalTypeName();
        org.apache.avro.Schema schema36 = null;
        org.apache.avro.LogicalType logicalType37 = null;
        java.time.LocalDateTime localDateTime38 = localTimestampNanosConversion33.fromLong((java.lang.Long) 0L, schema36, logicalType37);
        org.apache.avro.Schema schema39 = null;
        org.apache.avro.LogicalType logicalType40 = null;
        java.lang.Long long41 = localTimestampMicrosConversion31.toLong(localDateTime38, schema39, logicalType40);
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion42 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        org.apache.avro.data.TimeConversions.TimestampMicrosConversion timestampMicrosConversion44 = new org.apache.avro.data.TimeConversions.TimestampMicrosConversion();
        org.apache.avro.Schema schema45 = timestampMicrosConversion44.getRecommendedSchema();
        org.apache.avro.LogicalType logicalType46 = null;
        java.time.LocalDateTime localDateTime47 = localTimestampNanosConversion42.fromLong((java.lang.Long) 10L, schema45, logicalType46);
        org.apache.avro.LogicalType logicalType48 = null;
        java.lang.Long long49 = localTimestampMicrosConversion20.toLong(localDateTime38, schema45, logicalType48);
        org.apache.avro.LogicalType logicalType50 = null;
        java.time.LocalDateTime localDateTime51 = localTimestampNanosConversion12.fromLong((java.lang.Long) 1L, schema45, logicalType50);
        org.apache.avro.LogicalType logicalType52 = null;
        java.time.LocalDate localDate53 = dateConversion7.fromInt((java.lang.Integer) 0, schema45, logicalType52);
        org.apache.avro.LogicalType logicalType54 = null;
        java.time.Instant instant55 = timestampMicrosConversion5.fromLong((java.lang.Long) 0L, schema45, logicalType54);
        org.apache.avro.LogicalType logicalType56 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.Instant instant57 = timestampMillisConversion0.fromInt((java.lang.Integer) 100, schema45, logicalType56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.LogicalType.getName()\" because \"type\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS);" + "'", str3, "local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS);");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "local-timestamp-nanos = local-timestamp-nanos;" + "'", str10, "local-timestamp-nanos = local-timestamp-nanos;");
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "local-timestamp-nanos" + "'", str18, "local-timestamp-nanos");
        org.junit.Assert.assertNotNull(localDateTimeClass21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "local-timestamp-nanos" + "'", str23, "local-timestamp-nanos");
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(localDateTimeClass32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "local-timestamp-nanos" + "'", str34, "local-timestamp-nanos");
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(schema45);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(localDate53);
        org.junit.Assert.assertNotNull(instant55);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsC2RNDTest0.test38");
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
        java.time.LocalDateTime localDateTime13 = localTimestampNanosConversion8.fromLong((java.lang.Long) 10L, schema11, logicalType12);
        org.apache.avro.Schema schema14 = localTimestampNanosConversion8.getRecommendedSchema();
        org.apache.avro.LogicalType logicalType15 = null;
        java.lang.Integer int16 = timeMillisConversion0.toInt(localTime7, schema14, logicalType15);
        org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion localTimestampMicrosConversion18 = new org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion();
        java.lang.Class<java.time.LocalDateTime> localDateTimeClass19 = localTimestampMicrosConversion18.getConvertedType();
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion20 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        java.lang.String str21 = localTimestampNanosConversion20.getLogicalTypeName();
        org.apache.avro.Schema schema23 = null;
        org.apache.avro.LogicalType logicalType24 = null;
        java.time.LocalDateTime localDateTime25 = localTimestampNanosConversion20.fromLong((java.lang.Long) 0L, schema23, logicalType24);
        org.apache.avro.Schema schema26 = null;
        org.apache.avro.LogicalType logicalType27 = null;
        java.lang.Long long28 = localTimestampMicrosConversion18.toLong(localDateTime25, schema26, logicalType27);
        org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion localTimestampMicrosConversion29 = new org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion();
        java.lang.Class<java.time.LocalDateTime> localDateTimeClass30 = localTimestampMicrosConversion29.getConvertedType();
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion31 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        java.lang.String str32 = localTimestampNanosConversion31.getLogicalTypeName();
        org.apache.avro.Schema schema34 = null;
        org.apache.avro.LogicalType logicalType35 = null;
        java.time.LocalDateTime localDateTime36 = localTimestampNanosConversion31.fromLong((java.lang.Long) 0L, schema34, logicalType35);
        org.apache.avro.Schema schema37 = null;
        org.apache.avro.LogicalType logicalType38 = null;
        java.lang.Long long39 = localTimestampMicrosConversion29.toLong(localDateTime36, schema37, logicalType38);
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion40 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        org.apache.avro.data.TimeConversions.TimestampMicrosConversion timestampMicrosConversion42 = new org.apache.avro.data.TimeConversions.TimestampMicrosConversion();
        org.apache.avro.Schema schema43 = timestampMicrosConversion42.getRecommendedSchema();
        org.apache.avro.LogicalType logicalType44 = null;
        java.time.LocalDateTime localDateTime45 = localTimestampNanosConversion40.fromLong((java.lang.Long) 10L, schema43, logicalType44);
        org.apache.avro.LogicalType logicalType46 = null;
        java.lang.Long long47 = localTimestampMicrosConversion18.toLong(localDateTime36, schema43, logicalType46);
        org.apache.avro.LogicalType logicalType48 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime49 = timeMillisConversion0.fromLong((java.lang.Long) (-1L), schema43, logicalType48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.LogicalType.getName()\" because \"type\" is null");
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "local-timestamp-nanos" + "'", str21, "local-timestamp-nanos");
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(localDateTimeClass30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "local-timestamp-nanos" + "'", str32, "local-timestamp-nanos");
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertNotNull(schema43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsC2RNDTest0.test39");
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
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsC2RNDTest0.test40");
        org.apache.avro.data.TimeConversions.DateConversion dateConversion0 = new org.apache.avro.data.TimeConversions.DateConversion();
        java.lang.String str3 = dateConversion0.adjustAndSetValue("local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS);", "local-timestamp-nanos = local-timestamp-nanos;");
        java.lang.String str6 = dateConversion0.adjustAndSetValue("local-timestamp-nanos = local-timestamp-nanos;", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = local-timestamp-nanos = local-timestamp-nanos;;" + "'", str3, "local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = local-timestamp-nanos = local-timestamp-nanos;;");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "local-timestamp-nanos = local-timestamp-nanos; = ;" + "'", str6, "local-timestamp-nanos = local-timestamp-nanos; = ;");
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsC2RNDTest0.test41");
        org.apache.avro.data.TimeConversions.DateConversion dateConversion0 = new org.apache.avro.data.TimeConversions.DateConversion();
        org.apache.avro.Schema schema2 = null;
        org.apache.avro.LogicalType logicalType3 = null;
        java.time.LocalDate localDate4 = dateConversion0.fromInt((java.lang.Integer) 100, schema2, logicalType3);
        java.lang.Class<java.time.LocalDate> localDateClass5 = dateConversion0.getConvertedType();
        org.apache.avro.data.TimeConversions.TimestampMicrosConversion timestampMicrosConversion7 = new org.apache.avro.data.TimeConversions.TimestampMicrosConversion();
        org.apache.avro.Schema schema8 = timestampMicrosConversion7.getRecommendedSchema();
        org.apache.avro.LogicalType logicalType9 = null;
        java.time.LocalDate localDate10 = dateConversion0.fromInt((java.lang.Integer) 100, schema8, logicalType9);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDateClass5);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(localDate10);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsC2RNDTest0.test42");
        org.apache.avro.data.TimeConversions.LocalTimestampMillisConversion localTimestampMillisConversion0 = new org.apache.avro.data.TimeConversions.LocalTimestampMillisConversion();
        java.lang.String str1 = localTimestampMillisConversion0.getLogicalTypeName();
        java.lang.String str2 = localTimestampMillisConversion0.getLogicalTypeName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "local-timestamp-millis" + "'", str1, "local-timestamp-millis");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "local-timestamp-millis" + "'", str2, "local-timestamp-millis");
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsC2RNDTest0.test43");
        org.apache.avro.data.TimeConversions.TimestampMillisConversion timestampMillisConversion0 = new org.apache.avro.data.TimeConversions.TimestampMillisConversion();
        java.lang.String str3 = timestampMillisConversion0.adjustAndSetValue("local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS);", "");
        java.lang.String str6 = timestampMillisConversion0.adjustAndSetValue("local-timestamp-nanos", "local-timestamp-millis");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS);" + "'", str3, "local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS);");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "local-timestamp-nanos = local-timestamp-millis.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);" + "'", str6, "local-timestamp-nanos = local-timestamp-millis.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);");
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsC2RNDTest0.test44");
        org.apache.avro.data.TimeConversions.TimestampNanosConversion timestampNanosConversion0 = new org.apache.avro.data.TimeConversions.TimestampNanosConversion();
        java.lang.String str1 = timestampNanosConversion0.getLogicalTypeName();
        org.apache.avro.Schema schema2 = timestampNanosConversion0.getRecommendedSchema();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "timestamp-nanos" + "'", str1, "timestamp-nanos");
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsC2RNDTest0.test45");
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion0 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        org.apache.avro.data.TimeConversions.TimestampMicrosConversion timestampMicrosConversion2 = new org.apache.avro.data.TimeConversions.TimestampMicrosConversion();
        org.apache.avro.Schema schema3 = timestampMicrosConversion2.getRecommendedSchema();
        org.apache.avro.LogicalType logicalType4 = null;
        java.time.LocalDateTime localDateTime5 = localTimestampNanosConversion0.fromLong((java.lang.Long) 10L, schema3, logicalType4);
        java.lang.String str6 = localTimestampNanosConversion0.getLogicalTypeName();
        java.lang.Class<java.time.LocalDateTime> localDateTimeClass7 = localTimestampNanosConversion0.getConvertedType();
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "local-timestamp-nanos" + "'", str6, "local-timestamp-nanos");
        org.junit.Assert.assertNotNull(localDateTimeClass7);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsC2RNDTest0.test46");
        org.apache.avro.data.TimeConversions.TimestampMillisConversion timestampMillisConversion0 = new org.apache.avro.data.TimeConversions.TimestampMillisConversion();
        java.lang.String str3 = timestampMillisConversion0.adjustAndSetValue("local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS);", "");
        java.lang.Class<java.time.Instant> instantClass4 = timestampMillisConversion0.getConvertedType();
        org.apache.avro.data.TimeConversions.TimeMillisConversion timeMillisConversion6 = new org.apache.avro.data.TimeConversions.TimeMillisConversion();
        java.lang.Class<java.time.LocalTime> localTimeClass7 = timeMillisConversion6.getConvertedType();
        org.apache.avro.data.TimeConversions.TimeMillisConversion timeMillisConversion8 = new org.apache.avro.data.TimeConversions.TimeMillisConversion();
        org.apache.avro.data.TimeConversions.TimeMicrosConversion timeMicrosConversion9 = new org.apache.avro.data.TimeConversions.TimeMicrosConversion();
        org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion localTimestampMicrosConversion11 = new org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion();
        java.lang.Class<java.time.LocalDateTime> localDateTimeClass12 = localTimestampMicrosConversion11.getConvertedType();
        org.apache.avro.Schema schema13 = localTimestampMicrosConversion11.getRecommendedSchema();
        org.apache.avro.LogicalType logicalType14 = null;
        java.time.LocalTime localTime15 = timeMicrosConversion9.fromLong((java.lang.Long) 0L, schema13, logicalType14);
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion16 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        org.apache.avro.data.TimeConversions.TimestampMicrosConversion timestampMicrosConversion18 = new org.apache.avro.data.TimeConversions.TimestampMicrosConversion();
        org.apache.avro.Schema schema19 = timestampMicrosConversion18.getRecommendedSchema();
        org.apache.avro.LogicalType logicalType20 = null;
        java.time.LocalDateTime localDateTime21 = localTimestampNanosConversion16.fromLong((java.lang.Long) 10L, schema19, logicalType20);
        org.apache.avro.Schema schema22 = localTimestampNanosConversion16.getRecommendedSchema();
        org.apache.avro.LogicalType logicalType23 = null;
        java.lang.Integer int24 = timeMillisConversion8.toInt(localTime15, schema22, logicalType23);
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion25 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        org.apache.avro.data.TimeConversions.TimestampMicrosConversion timestampMicrosConversion27 = new org.apache.avro.data.TimeConversions.TimestampMicrosConversion();
        org.apache.avro.Schema schema28 = timestampMicrosConversion27.getRecommendedSchema();
        org.apache.avro.LogicalType logicalType29 = null;
        java.time.LocalDateTime localDateTime30 = localTimestampNanosConversion25.fromLong((java.lang.Long) 10L, schema28, logicalType29);
        org.apache.avro.Schema schema31 = localTimestampNanosConversion25.getRecommendedSchema();
        org.apache.avro.LogicalType logicalType32 = null;
        java.lang.Integer int33 = timeMillisConversion6.toInt(localTime15, schema31, logicalType32);
        org.apache.avro.LogicalType logicalType34 = null;
        java.time.Instant instant35 = timestampMillisConversion0.fromLong((java.lang.Long) 100L, schema31, logicalType34);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS);" + "'", str3, "local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS);");
        org.junit.Assert.assertNotNull(instantClass4);
        org.junit.Assert.assertNotNull(localTimeClass7);
        org.junit.Assert.assertNotNull(localDateTimeClass12);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(instant35);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsC2RNDTest0.test47");
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion0 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        org.apache.avro.data.TimeConversions.TimestampMicrosConversion timestampMicrosConversion2 = new org.apache.avro.data.TimeConversions.TimestampMicrosConversion();
        org.apache.avro.Schema schema3 = timestampMicrosConversion2.getRecommendedSchema();
        org.apache.avro.LogicalType logicalType4 = null;
        java.time.LocalDateTime localDateTime5 = localTimestampNanosConversion0.fromLong((java.lang.Long) 10L, schema3, logicalType4);
        org.apache.avro.Schema schema6 = localTimestampNanosConversion0.getRecommendedSchema();
        java.lang.String str9 = localTimestampNanosConversion0.adjustAndSetValue("", "local-timestamp-nanos = local-timestamp-nanos;");
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " = local-timestamp-nanos = local-timestamp-nanos;;" + "'", str9, " = local-timestamp-nanos = local-timestamp-nanos;;");
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsC2RNDTest0.test48");
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
        java.time.LocalDateTime localDateTime13 = localTimestampNanosConversion8.fromLong((java.lang.Long) 10L, schema11, logicalType12);
        org.apache.avro.Schema schema14 = localTimestampNanosConversion8.getRecommendedSchema();
        org.apache.avro.LogicalType logicalType15 = null;
        java.lang.Integer int16 = timeMillisConversion0.toInt(localTime7, schema14, logicalType15);
        org.apache.avro.data.TimeConversions.TimeMicrosConversion timeMicrosConversion17 = new org.apache.avro.data.TimeConversions.TimeMicrosConversion();
        org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion localTimestampMicrosConversion19 = new org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion();
        java.lang.Class<java.time.LocalDateTime> localDateTimeClass20 = localTimestampMicrosConversion19.getConvertedType();
        org.apache.avro.Schema schema21 = localTimestampMicrosConversion19.getRecommendedSchema();
        org.apache.avro.LogicalType logicalType22 = null;
        java.time.LocalTime localTime23 = timeMicrosConversion17.fromLong((java.lang.Long) 0L, schema21, logicalType22);
        org.apache.avro.data.TimeConversions.TimeMicrosConversion timeMicrosConversion24 = new org.apache.avro.data.TimeConversions.TimeMicrosConversion();
        org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion localTimestampMicrosConversion26 = new org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion();
        java.lang.Class<java.time.LocalDateTime> localDateTimeClass27 = localTimestampMicrosConversion26.getConvertedType();
        org.apache.avro.Schema schema28 = localTimestampMicrosConversion26.getRecommendedSchema();
        org.apache.avro.LogicalType logicalType29 = null;
        java.time.LocalTime localTime30 = timeMicrosConversion24.fromLong((java.lang.Long) 0L, schema28, logicalType29);
        org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion localTimestampMicrosConversion31 = new org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion();
        java.lang.Class<java.time.LocalDateTime> localDateTimeClass32 = localTimestampMicrosConversion31.getConvertedType();
        org.apache.avro.Schema schema33 = localTimestampMicrosConversion31.getRecommendedSchema();
        org.apache.avro.Schema schema34 = localTimestampMicrosConversion31.getRecommendedSchema();
        org.apache.avro.LogicalType logicalType35 = null;
        java.lang.Long long36 = timeMicrosConversion17.toLong(localTime30, schema34, logicalType35);
        org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion localTimestampMicrosConversion37 = new org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion();
        java.lang.Class<java.time.LocalDateTime> localDateTimeClass38 = localTimestampMicrosConversion37.getConvertedType();
        org.apache.avro.data.TimeConversions.TimeMicrosConversion timeMicrosConversion40 = new org.apache.avro.data.TimeConversions.TimeMicrosConversion();
        org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion localTimestampMicrosConversion42 = new org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion();
        java.lang.Class<java.time.LocalDateTime> localDateTimeClass43 = localTimestampMicrosConversion42.getConvertedType();
        org.apache.avro.Schema schema44 = localTimestampMicrosConversion42.getRecommendedSchema();
        org.apache.avro.LogicalType logicalType45 = null;
        java.time.LocalTime localTime46 = timeMicrosConversion40.fromLong((java.lang.Long) 0L, schema44, logicalType45);
        org.apache.avro.data.TimeConversions.TimeMicrosConversion timeMicrosConversion47 = new org.apache.avro.data.TimeConversions.TimeMicrosConversion();
        org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion localTimestampMicrosConversion49 = new org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion();
        java.lang.Class<java.time.LocalDateTime> localDateTimeClass50 = localTimestampMicrosConversion49.getConvertedType();
        org.apache.avro.Schema schema51 = localTimestampMicrosConversion49.getRecommendedSchema();
        org.apache.avro.LogicalType logicalType52 = null;
        java.time.LocalTime localTime53 = timeMicrosConversion47.fromLong((java.lang.Long) 0L, schema51, logicalType52);
        org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion localTimestampMicrosConversion54 = new org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion();
        java.lang.Class<java.time.LocalDateTime> localDateTimeClass55 = localTimestampMicrosConversion54.getConvertedType();
        org.apache.avro.Schema schema56 = localTimestampMicrosConversion54.getRecommendedSchema();
        org.apache.avro.Schema schema57 = localTimestampMicrosConversion54.getRecommendedSchema();
        org.apache.avro.LogicalType logicalType58 = null;
        java.lang.Long long59 = timeMicrosConversion40.toLong(localTime53, schema57, logicalType58);
        org.apache.avro.LogicalType logicalType60 = null;
        java.time.LocalDateTime localDateTime61 = localTimestampMicrosConversion37.fromLong((java.lang.Long) 100L, schema57, logicalType60);
        org.apache.avro.LogicalType logicalType62 = null;
        java.lang.Integer int63 = timeMillisConversion0.toInt(localTime30, schema57, logicalType62);
        org.junit.Assert.assertNotNull(localDateTimeClass4);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(localDateTimeClass20);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localDateTimeClass27);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(localDateTimeClass32);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNotNull(schema34);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(localDateTimeClass38);
        org.junit.Assert.assertNotNull(localDateTimeClass43);
        org.junit.Assert.assertNotNull(schema44);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(localDateTimeClass50);
        org.junit.Assert.assertNotNull(schema51);
        org.junit.Assert.assertNotNull(localTime53);
        org.junit.Assert.assertNotNull(localDateTimeClass55);
        org.junit.Assert.assertNotNull(schema56);
        org.junit.Assert.assertNotNull(schema57);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsC2RNDTest0.test49");
        org.apache.avro.data.TimeConversions.TimestampMicrosConversion timestampMicrosConversion0 = new org.apache.avro.data.TimeConversions.TimestampMicrosConversion();
        java.lang.String str3 = timestampMicrosConversion0.adjustAndSetValue("local-timestamp-nanos = local-timestamp-nanos;", "local-timestamp-nanos");
        java.lang.Class<java.time.Instant> instantClass4 = timestampMicrosConversion0.getConvertedType();
        org.apache.avro.Schema schema5 = timestampMicrosConversion0.getRecommendedSchema();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "local-timestamp-nanos = local-timestamp-nanos; = local-timestamp-nanos.truncatedTo(java.time.temporal.ChronoUnit.MICROS);" + "'", str3, "local-timestamp-nanos = local-timestamp-nanos; = local-timestamp-nanos.truncatedTo(java.time.temporal.ChronoUnit.MICROS);");
        org.junit.Assert.assertNotNull(instantClass4);
        org.junit.Assert.assertNotNull(schema5);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsC2RNDTest0.test50");
        org.apache.avro.data.TimeConversions.LocalTimestampMillisConversion localTimestampMillisConversion0 = new org.apache.avro.data.TimeConversions.LocalTimestampMillisConversion();
        java.lang.String str1 = localTimestampMillisConversion0.getLogicalTypeName();
        org.apache.avro.Schema schema2 = localTimestampMillisConversion0.getRecommendedSchema();
        org.apache.avro.Schema schema3 = localTimestampMillisConversion0.getRecommendedSchema();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "local-timestamp-millis" + "'", str1, "local-timestamp-millis");
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertNotNull(schema3);
    }
}

