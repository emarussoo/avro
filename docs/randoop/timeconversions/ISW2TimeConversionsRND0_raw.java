package org.apache.avro.data;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ISW2TimeConversionsRND0 {

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
            System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test01");
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion0 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        java.time.LocalDateTime localDateTime1 = null;
        org.apache.avro.Schema schema2 = null;
        org.apache.avro.LogicalType logicalType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int4 = localTimestampNanosConversion0.toInt(localDateTime1, schema2, logicalType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.LogicalType.getName()\" because \"type\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test02");
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion0 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        java.lang.String str1 = localTimestampNanosConversion0.getLogicalTypeName();
        org.apache.avro.generic.GenericFixed genericFixed2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.LogicalType logicalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime5 = localTimestampNanosConversion0.fromFixed(genericFixed2, schema3, logicalType4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.LogicalType.getName()\" because \"type\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "local-timestamp-nanos" + "'", str1, "local-timestamp-nanos");
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
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test04");
        org.apache.avro.data.TimeConversions.TimestampNanosConversion timestampNanosConversion0 = new org.apache.avro.data.TimeConversions.TimestampNanosConversion();
        org.apache.avro.Schema schema2 = null;
        org.apache.avro.LogicalType logicalType3 = null;
        java.time.Instant instant4 = timestampNanosConversion0.fromLong((java.lang.Long) 100L, schema2, logicalType3);
        org.apache.avro.data.TimeConversions.TimestampNanosConversion timestampNanosConversion5 = new org.apache.avro.data.TimeConversions.TimestampNanosConversion();
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.LogicalType logicalType8 = null;
        java.time.Instant instant9 = timestampNanosConversion5.fromLong((java.lang.Long) 100L, schema7, logicalType8);
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.LogicalType logicalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int12 = timestampNanosConversion0.toInt(instant9, schema10, logicalType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.LogicalType.getName()\" because \"type\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(instant9);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test05");
        org.apache.avro.data.TimeConversions.TimestampNanosConversion timestampNanosConversion0 = new org.apache.avro.data.TimeConversions.TimestampNanosConversion();
        org.apache.avro.generic.GenericFixed genericFixed1 = null;
        org.apache.avro.Schema schema2 = null;
        org.apache.avro.LogicalType logicalType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.Instant instant4 = timestampNanosConversion0.fromFixed(genericFixed1, schema2, logicalType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.LogicalType.getName()\" because \"type\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test06");
        org.apache.avro.data.TimeConversions.TimestampNanosConversion timestampNanosConversion0 = new org.apache.avro.data.TimeConversions.TimestampNanosConversion();
        org.apache.avro.Schema schema2 = null;
        org.apache.avro.LogicalType logicalType3 = null;
        java.time.Instant instant4 = timestampNanosConversion0.fromLong((java.lang.Long) 100L, schema2, logicalType3);
        java.time.Instant instant5 = null;
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.LogicalType logicalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long8 = timestampNanosConversion0.toLong(instant5, schema6, logicalType7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.Instant.getEpochSecond()\" because \"instant\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant4);
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! = local-timestamp-nanos.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);" + "'", str3, "hi! = local-timestamp-nanos.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);");
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! = local-timestamp-nanos.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);" + "'", str11, "hi! = local-timestamp-nanos.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);");
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test08");
        org.apache.avro.data.TimeConversions.DateConversion dateConversion0 = new org.apache.avro.data.TimeConversions.DateConversion();
        java.time.LocalDate localDate1 = null;
        org.apache.avro.Schema schema2 = null;
        org.apache.avro.LogicalType logicalType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long4 = dateConversion0.toLong(localDate1, schema2, logicalType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.LogicalType.getName()\" because \"type\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test10");
        org.apache.avro.data.TimeConversions.LocalTimestampMillisConversion localTimestampMillisConversion0 = new org.apache.avro.data.TimeConversions.LocalTimestampMillisConversion();
        java.lang.Class<java.time.LocalDateTime> localDateTimeClass1 = localTimestampMillisConversion0.getConvertedType();
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.LogicalType logicalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime5 = localTimestampMillisConversion0.fromInt((java.lang.Integer) 0, schema3, logicalType4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.LogicalType.getName()\" because \"type\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTimeClass1);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test11");
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion0 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        java.lang.String str1 = localTimestampNanosConversion0.getLogicalTypeName();
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.LogicalType logicalType4 = null;
        java.time.LocalDateTime localDateTime5 = localTimestampNanosConversion0.fromLong((java.lang.Long) 100L, schema3, logicalType4);
        java.lang.Class<java.time.LocalDateTime> localDateTimeClass6 = localTimestampNanosConversion0.getConvertedType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "local-timestamp-nanos" + "'", str1, "local-timestamp-nanos");
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTimeClass6);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test12");
        org.apache.avro.data.TimeConversions.LocalTimestampMillisConversion localTimestampMillisConversion0 = new org.apache.avro.data.TimeConversions.LocalTimestampMillisConversion();
        java.lang.Class<java.time.LocalDateTime> localDateTimeClass1 = localTimestampMillisConversion0.getConvertedType();
        java.lang.Class<java.time.LocalDateTime> localDateTimeClass2 = localTimestampMillisConversion0.getConvertedType();
        org.junit.Assert.assertNotNull(localDateTimeClass1);
        org.junit.Assert.assertNotNull(localDateTimeClass2);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test13");
        org.apache.avro.data.TimeConversions.TimestampNanosConversion timestampNanosConversion0 = new org.apache.avro.data.TimeConversions.TimestampNanosConversion();
        java.lang.Class<java.time.Instant> instantClass1 = timestampNanosConversion0.getConvertedType();
        org.apache.avro.data.TimeConversions.TimestampNanosConversion timestampNanosConversion2 = new org.apache.avro.data.TimeConversions.TimestampNanosConversion();
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.LogicalType logicalType5 = null;
        java.time.Instant instant6 = timestampNanosConversion2.fromLong((java.lang.Long) 100L, schema4, logicalType5);
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.LogicalType logicalType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int9 = timestampNanosConversion0.toInt(instant6, schema7, logicalType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.LogicalType.getName()\" because \"type\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instantClass1);
        org.junit.Assert.assertNotNull(instant6);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test14");
        org.apache.avro.data.TimeConversions.TimestampNanosConversion timestampNanosConversion0 = new org.apache.avro.data.TimeConversions.TimestampNanosConversion();
        java.lang.String str1 = timestampNanosConversion0.getLogicalTypeName();
        org.apache.avro.generic.GenericFixed genericFixed2 = null;
        org.apache.avro.Schema schema3 = null;
        org.apache.avro.LogicalType logicalType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.Instant instant5 = timestampNanosConversion0.fromFixed(genericFixed2, schema3, logicalType4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.LogicalType.getName()\" because \"type\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "timestamp-nanos" + "'", str1, "timestamp-nanos");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test15");
        org.apache.avro.data.TimeConversions.TimeMicrosConversion timeMicrosConversion0 = new org.apache.avro.data.TimeConversions.TimeMicrosConversion();
        java.lang.String str3 = timeMicrosConversion0.adjustAndSetValue("hi!", "local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = hi! = hi!.truncatedTo(java.time.temporal.ChronoUnit.NANOS);.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! = local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = hi! = hi!.truncatedTo(java.time.temporal.ChronoUnit.NANOS);.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);.truncatedTo(java.time.temporal.ChronoUnit.MICROS);" + "'", str3, "hi! = local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = hi! = hi!.truncatedTo(java.time.temporal.ChronoUnit.NANOS);.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);.truncatedTo(java.time.temporal.ChronoUnit.MICROS);");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS);" + "'", str3, "local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS);");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! = local-timestamp-nanos.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);" + "'", str7, "hi! = local-timestamp-nanos.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);");
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test17");
        org.apache.avro.data.TimeConversions.TimeMillisConversion timeMillisConversion0 = new org.apache.avro.data.TimeConversions.TimeMillisConversion();
        java.lang.String str3 = timeMillisConversion0.adjustAndSetValue("hi!", "local-timestamp-nanos");
        org.apache.avro.generic.GenericFixed genericFixed4 = null;
        org.apache.avro.data.TimeConversions.TimeMicrosConversion timeMicrosConversion5 = new org.apache.avro.data.TimeConversions.TimeMicrosConversion();
        org.apache.avro.Schema schema6 = timeMicrosConversion5.getRecommendedSchema();
        org.apache.avro.LogicalType logicalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime8 = timeMillisConversion0.fromFixed(genericFixed4, schema6, logicalType7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.LogicalType.getName()\" because \"type\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! = local-timestamp-nanos.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);" + "'", str3, "hi! = local-timestamp-nanos.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);");
        org.junit.Assert.assertNotNull(schema6);
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
        java.lang.String str12 = timestampMicrosConversion0.adjustAndSetValue("hi! = local-timestamp-nanos.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);", "");
        org.apache.avro.generic.GenericFixed genericFixed13 = null;
        org.apache.avro.data.TimeConversions.TimeMicrosConversion timeMicrosConversion14 = new org.apache.avro.data.TimeConversions.TimeMicrosConversion();
        org.apache.avro.Schema schema15 = timeMicrosConversion14.getRecommendedSchema();
        org.apache.avro.LogicalType logicalType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.Instant instant17 = timestampMicrosConversion0.fromFixed(genericFixed13, schema15, logicalType16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.LogicalType.getName()\" because \"type\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(instantClass9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! = local-timestamp-nanos.truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = .truncatedTo(java.time.temporal.ChronoUnit.MICROS);" + "'", str12, "hi! = local-timestamp-nanos.truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = .truncatedTo(java.time.temporal.ChronoUnit.MICROS);");
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
        java.lang.String str7 = timestampNanosConversion0.adjustAndSetValue(" = local-timestamp-nanos;", " = local-timestamp-nanos;");
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " = local-timestamp-nanos; =  = local-timestamp-nanos;.truncatedTo(java.time.temporal.ChronoUnit.NANOS);" + "'", str7, " = local-timestamp-nanos; =  = local-timestamp-nanos;.truncatedTo(java.time.temporal.ChronoUnit.NANOS);");
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test20");
        org.apache.avro.data.TimeConversions.TimestampNanosConversion timestampNanosConversion0 = new org.apache.avro.data.TimeConversions.TimestampNanosConversion();
        java.lang.Class<java.time.Instant> instantClass1 = timestampNanosConversion0.getConvertedType();
        java.lang.String str4 = timestampNanosConversion0.adjustAndSetValue(" = local-timestamp-nanos; =  = local-timestamp-nanos;.truncatedTo(java.time.temporal.ChronoUnit.NANOS);", "hi! = local-timestamp-nanos.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);");
        org.junit.Assert.assertNotNull(instantClass1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " = local-timestamp-nanos; =  = local-timestamp-nanos;.truncatedTo(java.time.temporal.ChronoUnit.NANOS); = hi! = local-timestamp-nanos.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);.truncatedTo(java.time.temporal.ChronoUnit.NANOS);" + "'", str4, " = local-timestamp-nanos; =  = local-timestamp-nanos;.truncatedTo(java.time.temporal.ChronoUnit.NANOS); = hi! = local-timestamp-nanos.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);.truncatedTo(java.time.temporal.ChronoUnit.NANOS);");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! = local-timestamp-nanos.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);" + "'", str3, "hi! = local-timestamp-nanos.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);");
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTimeClass8);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test22");
        org.apache.avro.data.TimeConversions.TimeMillisConversion timeMillisConversion0 = new org.apache.avro.data.TimeConversions.TimeMillisConversion();
        java.lang.String str3 = timeMillisConversion0.adjustAndSetValue("hi!", "local-timestamp-nanos");
        java.lang.Class<java.time.LocalTime> localTimeClass4 = timeMillisConversion0.getConvertedType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! = local-timestamp-nanos.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);" + "'", str3, "hi! = local-timestamp-nanos.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);");
        org.junit.Assert.assertNotNull(localTimeClass4);
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
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.LogicalType.getName()\" because \"type\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! = hi!.truncatedTo(java.time.temporal.ChronoUnit.NANOS);" + "'", str7, "hi! = hi!.truncatedTo(java.time.temporal.ChronoUnit.NANOS);");
        org.junit.Assert.assertNotNull(instantClass8);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(schema19);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test24");
        org.apache.avro.data.TimeConversions.DateConversion dateConversion0 = new org.apache.avro.data.TimeConversions.DateConversion();
        org.apache.avro.Schema schema1 = dateConversion0.getRecommendedSchema();
        org.apache.avro.generic.GenericFixed genericFixed2 = null;
        org.apache.avro.data.TimeConversions.DateConversion dateConversion3 = new org.apache.avro.data.TimeConversions.DateConversion();
        org.apache.avro.data.TimeConversions.LocalTimestampMillisConversion localTimestampMillisConversion5 = new org.apache.avro.data.TimeConversions.LocalTimestampMillisConversion();
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion6 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        java.lang.String str7 = localTimestampNanosConversion6.getLogicalTypeName();
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.LogicalType logicalType10 = null;
        java.time.LocalDateTime localDateTime11 = localTimestampNanosConversion6.fromLong((java.lang.Long) 100L, schema9, logicalType10);
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.LogicalType logicalType13 = null;
        java.lang.Long long14 = localTimestampMillisConversion5.toLong(localDateTime11, schema12, logicalType13);
        org.apache.avro.data.TimeConversions.TimeMicrosConversion timeMicrosConversion16 = new org.apache.avro.data.TimeConversions.TimeMicrosConversion();
        org.apache.avro.Schema schema17 = timeMicrosConversion16.getRecommendedSchema();
        org.apache.avro.LogicalType logicalType18 = null;
        java.time.LocalDateTime localDateTime19 = localTimestampMillisConversion5.fromLong((java.lang.Long) 100L, schema17, logicalType18);
        org.apache.avro.LogicalType logicalType20 = null;
        java.time.LocalDate localDate21 = dateConversion3.fromInt((java.lang.Integer) 0, schema17, logicalType20);
        org.apache.avro.LogicalType logicalType22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate23 = dateConversion0.fromFixed(genericFixed2, schema17, logicalType22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.LogicalType.getName()\" because \"type\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "local-timestamp-nanos" + "'", str7, "local-timestamp-nanos");
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDate21);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test25");
        org.apache.avro.data.TimeConversions.LocalTimestampMillisConversion localTimestampMillisConversion0 = new org.apache.avro.data.TimeConversions.LocalTimestampMillisConversion();
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion1 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        java.lang.String str2 = localTimestampNanosConversion1.getLogicalTypeName();
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.LogicalType logicalType5 = null;
        java.time.LocalDateTime localDateTime6 = localTimestampNanosConversion1.fromLong((java.lang.Long) 100L, schema4, logicalType5);
        org.apache.avro.Schema schema7 = null;
        org.apache.avro.LogicalType logicalType8 = null;
        java.lang.Long long9 = localTimestampMillisConversion0.toLong(localDateTime6, schema7, logicalType8);
        java.lang.Class<java.time.LocalDateTime> localDateTimeClass10 = localTimestampMillisConversion0.getConvertedType();
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion11 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        java.lang.String str12 = localTimestampNanosConversion11.getLogicalTypeName();
        org.apache.avro.Schema schema14 = null;
        org.apache.avro.LogicalType logicalType15 = null;
        java.time.LocalDateTime localDateTime16 = localTimestampNanosConversion11.fromLong((java.lang.Long) 100L, schema14, logicalType15);
        org.apache.avro.data.TimeConversions.DateConversion dateConversion17 = new org.apache.avro.data.TimeConversions.DateConversion();
        org.apache.avro.Schema schema18 = dateConversion17.getRecommendedSchema();
        org.apache.avro.LogicalType logicalType19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int20 = localTimestampMillisConversion0.toInt(localDateTime16, schema18, logicalType19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.LogicalType.getName()\" because \"type\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "local-timestamp-nanos" + "'", str2, "local-timestamp-nanos");
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(localDateTimeClass10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "local-timestamp-nanos" + "'", str12, "local-timestamp-nanos");
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(schema18);
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
        java.time.LocalDateTime localDateTime23 = localTimestampMillisConversion0.fromLong((java.lang.Long) 100L, schema19, logicalType22);
        org.junit.Assert.assertNotNull(localDateTimeClass1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! = local-timestamp-nanos.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);" + "'", str6, "hi! = local-timestamp-nanos.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);");
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTimeClass15);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test28");
        org.apache.avro.data.TimeConversions.TimestampNanosConversion timestampNanosConversion0 = new org.apache.avro.data.TimeConversions.TimestampNanosConversion();
        java.lang.String str1 = timestampNanosConversion0.getLogicalTypeName();
        java.lang.String str4 = timestampNanosConversion0.adjustAndSetValue("local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = hi! = hi!.truncatedTo(java.time.temporal.ChronoUnit.NANOS);.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);", "timestamp-nanos");
        java.lang.String str7 = timestampNanosConversion0.adjustAndSetValue("hi!", " = local-timestamp-nanos; =  = local-timestamp-nanos;.truncatedTo(java.time.temporal.ChronoUnit.NANOS);");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "timestamp-nanos" + "'", str1, "timestamp-nanos");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = hi! = hi!.truncatedTo(java.time.temporal.ChronoUnit.NANOS);.truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = timestamp-nanos.truncatedTo(java.time.temporal.ChronoUnit.NANOS);" + "'", str4, "local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = hi! = hi!.truncatedTo(java.time.temporal.ChronoUnit.NANOS);.truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = timestamp-nanos.truncatedTo(java.time.temporal.ChronoUnit.NANOS);");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! =  = local-timestamp-nanos; =  = local-timestamp-nanos;.truncatedTo(java.time.temporal.ChronoUnit.NANOS);.truncatedTo(java.time.temporal.ChronoUnit.NANOS);" + "'", str7, "hi! =  = local-timestamp-nanos; =  = local-timestamp-nanos;.truncatedTo(java.time.temporal.ChronoUnit.NANOS);.truncatedTo(java.time.temporal.ChronoUnit.NANOS);");
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test29");
        org.apache.avro.data.TimeConversions.TimestampMillisConversion timestampMillisConversion0 = new org.apache.avro.data.TimeConversions.TimestampMillisConversion();
        java.time.Instant instant1 = null;
        org.apache.avro.data.TimeConversions.TimeMicrosConversion timeMicrosConversion2 = new org.apache.avro.data.TimeConversions.TimeMicrosConversion();
        java.lang.Class<java.time.LocalTime> localTimeClass3 = timeMicrosConversion2.getConvertedType();
        org.apache.avro.Schema schema4 = timeMicrosConversion2.getRecommendedSchema();
        org.apache.avro.data.TimeConversions.LocalTimestampMillisConversion localTimestampMillisConversion6 = new org.apache.avro.data.TimeConversions.LocalTimestampMillisConversion();
        java.lang.Class<java.time.LocalDateTime> localDateTimeClass7 = localTimestampMillisConversion6.getConvertedType();
        org.apache.avro.data.TimeConversions.DateConversion dateConversion9 = new org.apache.avro.data.TimeConversions.DateConversion();
        org.apache.avro.data.TimeConversions.LocalTimestampMillisConversion localTimestampMillisConversion11 = new org.apache.avro.data.TimeConversions.LocalTimestampMillisConversion();
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion12 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        java.lang.String str13 = localTimestampNanosConversion12.getLogicalTypeName();
        org.apache.avro.Schema schema15 = null;
        org.apache.avro.LogicalType logicalType16 = null;
        java.time.LocalDateTime localDateTime17 = localTimestampNanosConversion12.fromLong((java.lang.Long) 100L, schema15, logicalType16);
        org.apache.avro.Schema schema18 = null;
        org.apache.avro.LogicalType logicalType19 = null;
        java.lang.Long long20 = localTimestampMillisConversion11.toLong(localDateTime17, schema18, logicalType19);
        org.apache.avro.data.TimeConversions.TimeMicrosConversion timeMicrosConversion22 = new org.apache.avro.data.TimeConversions.TimeMicrosConversion();
        org.apache.avro.Schema schema23 = timeMicrosConversion22.getRecommendedSchema();
        org.apache.avro.LogicalType logicalType24 = null;
        java.time.LocalDateTime localDateTime25 = localTimestampMillisConversion11.fromLong((java.lang.Long) 100L, schema23, logicalType24);
        org.apache.avro.LogicalType logicalType26 = null;
        java.time.LocalDate localDate27 = dateConversion9.fromInt((java.lang.Integer) 0, schema23, logicalType26);
        org.apache.avro.LogicalType logicalType28 = null;
        java.time.LocalDateTime localDateTime29 = localTimestampMillisConversion6.fromLong((java.lang.Long) 0L, schema23, logicalType28);
        org.apache.avro.LogicalType logicalType30 = null;
        java.time.LocalTime localTime31 = timeMicrosConversion2.fromLong((java.lang.Long) 1L, schema23, logicalType30);
        org.apache.avro.LogicalType logicalType32 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long33 = timestampMillisConversion0.toLong(instant1, schema23, logicalType32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.Instant.toEpochMilli()\" because \"timestamp\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTimeClass3);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(localDateTimeClass7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "local-timestamp-nanos" + "'", str13, "local-timestamp-nanos");
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localTime31);
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
        java.time.LocalDateTime localDateTime10 = localTimestampNanosConversion5.fromLong((java.lang.Long) 100L, schema8, logicalType9);
        org.apache.avro.Schema schema11 = null;
        org.apache.avro.LogicalType logicalType12 = null;
        java.lang.Long long13 = localTimestampMillisConversion4.toLong(localDateTime10, schema11, logicalType12);
        org.apache.avro.Schema schema14 = null;
        org.apache.avro.LogicalType logicalType15 = null;
        java.lang.Long long16 = localTimestampNanosConversion0.toLong(localDateTime10, schema14, logicalType15);
        java.lang.Class<java.time.LocalDateTime> localDateTimeClass17 = localTimestampNanosConversion0.getConvertedType();
        java.lang.String str18 = localTimestampNanosConversion0.getLogicalTypeName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " = local-timestamp-nanos;" + "'", str3, " = local-timestamp-nanos;");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "local-timestamp-nanos" + "'", str6, "local-timestamp-nanos");
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertNotNull(localDateTimeClass17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "local-timestamp-nanos" + "'", str18, "local-timestamp-nanos");
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test31");
        org.apache.avro.data.TimeConversions.TimestampMicrosConversion timestampMicrosConversion0 = new org.apache.avro.data.TimeConversions.TimestampMicrosConversion();
        org.apache.avro.Schema schema1 = timestampMicrosConversion0.getRecommendedSchema();
        java.lang.Class<java.time.Instant> instantClass2 = timestampMicrosConversion0.getConvertedType();
        java.lang.String str5 = timestampMicrosConversion0.adjustAndSetValue("hi! =  = local-timestamp-nanos; =  = local-timestamp-nanos;.truncatedTo(java.time.temporal.ChronoUnit.NANOS);.truncatedTo(java.time.temporal.ChronoUnit.NANOS);", "hi! = local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = hi! = hi!.truncatedTo(java.time.temporal.ChronoUnit.NANOS);.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);.truncatedTo(java.time.temporal.ChronoUnit.MICROS);");
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(instantClass2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! =  = local-timestamp-nanos; =  = local-timestamp-nanos;.truncatedTo(java.time.temporal.ChronoUnit.NANOS);.truncatedTo(java.time.temporal.ChronoUnit.NANOS); = hi! = local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = hi! = hi!.truncatedTo(java.time.temporal.ChronoUnit.NANOS);.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);.truncatedTo(java.time.temporal.ChronoUnit.MICROS);.truncatedTo(java.time.temporal.ChronoUnit.MICROS);" + "'", str5, "hi! =  = local-timestamp-nanos; =  = local-timestamp-nanos;.truncatedTo(java.time.temporal.ChronoUnit.NANOS);.truncatedTo(java.time.temporal.ChronoUnit.NANOS); = hi! = local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = hi! = hi!.truncatedTo(java.time.temporal.ChronoUnit.NANOS);.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);.truncatedTo(java.time.temporal.ChronoUnit.MICROS);.truncatedTo(java.time.temporal.ChronoUnit.MICROS);");
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test32");
        org.apache.avro.data.TimeConversions.DateConversion dateConversion0 = new org.apache.avro.data.TimeConversions.DateConversion();
        org.apache.avro.data.TimeConversions.LocalTimestampMillisConversion localTimestampMillisConversion2 = new org.apache.avro.data.TimeConversions.LocalTimestampMillisConversion();
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion3 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        java.lang.String str4 = localTimestampNanosConversion3.getLogicalTypeName();
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.LogicalType logicalType7 = null;
        java.time.LocalDateTime localDateTime8 = localTimestampNanosConversion3.fromLong((java.lang.Long) 100L, schema6, logicalType7);
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.LogicalType logicalType10 = null;
        java.lang.Long long11 = localTimestampMillisConversion2.toLong(localDateTime8, schema9, logicalType10);
        org.apache.avro.data.TimeConversions.TimeMicrosConversion timeMicrosConversion13 = new org.apache.avro.data.TimeConversions.TimeMicrosConversion();
        org.apache.avro.Schema schema14 = timeMicrosConversion13.getRecommendedSchema();
        org.apache.avro.LogicalType logicalType15 = null;
        java.time.LocalDateTime localDateTime16 = localTimestampMillisConversion2.fromLong((java.lang.Long) 100L, schema14, logicalType15);
        org.apache.avro.LogicalType logicalType17 = null;
        java.time.LocalDate localDate18 = dateConversion0.fromInt((java.lang.Integer) 0, schema14, logicalType17);
        org.apache.avro.Schema schema19 = dateConversion0.getRecommendedSchema();
        org.apache.avro.data.TimeConversions.DateConversion dateConversion20 = new org.apache.avro.data.TimeConversions.DateConversion();
        org.apache.avro.data.TimeConversions.LocalTimestampMillisConversion localTimestampMillisConversion22 = new org.apache.avro.data.TimeConversions.LocalTimestampMillisConversion();
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion23 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        java.lang.String str24 = localTimestampNanosConversion23.getLogicalTypeName();
        org.apache.avro.Schema schema26 = null;
        org.apache.avro.LogicalType logicalType27 = null;
        java.time.LocalDateTime localDateTime28 = localTimestampNanosConversion23.fromLong((java.lang.Long) 100L, schema26, logicalType27);
        org.apache.avro.Schema schema29 = null;
        org.apache.avro.LogicalType logicalType30 = null;
        java.lang.Long long31 = localTimestampMillisConversion22.toLong(localDateTime28, schema29, logicalType30);
        org.apache.avro.data.TimeConversions.TimeMicrosConversion timeMicrosConversion33 = new org.apache.avro.data.TimeConversions.TimeMicrosConversion();
        org.apache.avro.Schema schema34 = timeMicrosConversion33.getRecommendedSchema();
        org.apache.avro.LogicalType logicalType35 = null;
        java.time.LocalDateTime localDateTime36 = localTimestampMillisConversion22.fromLong((java.lang.Long) 100L, schema34, logicalType35);
        org.apache.avro.LogicalType logicalType37 = null;
        java.time.LocalDate localDate38 = dateConversion20.fromInt((java.lang.Integer) 0, schema34, logicalType37);
        org.apache.avro.data.TimeConversions.TimestampMicrosConversion timestampMicrosConversion39 = new org.apache.avro.data.TimeConversions.TimestampMicrosConversion();
        org.apache.avro.data.TimeConversions.TimestampNanosConversion timestampNanosConversion40 = new org.apache.avro.data.TimeConversions.TimestampNanosConversion();
        org.apache.avro.Schema schema42 = null;
        org.apache.avro.LogicalType logicalType43 = null;
        java.time.Instant instant44 = timestampNanosConversion40.fromLong((java.lang.Long) 100L, schema42, logicalType43);
        org.apache.avro.Schema schema45 = null;
        org.apache.avro.LogicalType logicalType46 = null;
        java.lang.Long long47 = timestampMicrosConversion39.toLong(instant44, schema45, logicalType46);
        org.apache.avro.Schema schema48 = timestampMicrosConversion39.getRecommendedSchema();
        org.apache.avro.LogicalType logicalType49 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long50 = dateConversion0.toLong(localDate38, schema48, logicalType49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.LogicalType.getName()\" because \"type\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "local-timestamp-nanos" + "'", str4, "local-timestamp-nanos");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "local-timestamp-nanos" + "'", str24, "local-timestamp-nanos");
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(schema34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertNotNull(instant44);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNotNull(schema48);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test33");
        org.apache.avro.data.TimeConversions.TimestampMillisConversion timestampMillisConversion0 = new org.apache.avro.data.TimeConversions.TimestampMillisConversion();
        java.lang.Class<java.time.Instant> instantClass1 = timestampMillisConversion0.getConvertedType();
        org.junit.Assert.assertNotNull(instantClass1);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test34");
        org.apache.avro.data.TimeConversions.DateConversion dateConversion0 = new org.apache.avro.data.TimeConversions.DateConversion();
        org.apache.avro.Schema schema1 = dateConversion0.getRecommendedSchema();
        java.lang.String str4 = dateConversion0.adjustAndSetValue("local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS);", "local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS);");
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS);;" + "'", str4, "local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS);;");
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test35");
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion0 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        java.lang.String str1 = localTimestampNanosConversion0.getLogicalTypeName();
        org.apache.avro.data.TimeConversions.TimeMicrosConversion timeMicrosConversion3 = new org.apache.avro.data.TimeConversions.TimeMicrosConversion();
        org.apache.avro.data.TimeConversions.LocalTimestampMillisConversion localTimestampMillisConversion5 = new org.apache.avro.data.TimeConversions.LocalTimestampMillisConversion();
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion6 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        java.lang.String str7 = localTimestampNanosConversion6.getLogicalTypeName();
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.LogicalType logicalType10 = null;
        java.time.LocalDateTime localDateTime11 = localTimestampNanosConversion6.fromLong((java.lang.Long) 100L, schema9, logicalType10);
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.LogicalType logicalType13 = null;
        java.lang.Long long14 = localTimestampMillisConversion5.toLong(localDateTime11, schema12, logicalType13);
        org.apache.avro.data.TimeConversions.TimeMicrosConversion timeMicrosConversion16 = new org.apache.avro.data.TimeConversions.TimeMicrosConversion();
        org.apache.avro.Schema schema17 = timeMicrosConversion16.getRecommendedSchema();
        org.apache.avro.LogicalType logicalType18 = null;
        java.time.LocalDateTime localDateTime19 = localTimestampMillisConversion5.fromLong((java.lang.Long) 100L, schema17, logicalType18);
        org.apache.avro.LogicalType logicalType20 = null;
        java.time.LocalTime localTime21 = timeMicrosConversion3.fromLong((java.lang.Long) 100L, schema17, logicalType20);
        org.apache.avro.LogicalType logicalType22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime23 = localTimestampNanosConversion0.fromInt((java.lang.Integer) 0, schema17, logicalType22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.LogicalType.getName()\" because \"type\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "local-timestamp-nanos" + "'", str1, "local-timestamp-nanos");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "local-timestamp-nanos" + "'", str7, "local-timestamp-nanos");
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localTime21);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test36");
        org.apache.avro.data.TimeConversions.TimestampNanosConversion timestampNanosConversion0 = new org.apache.avro.data.TimeConversions.TimestampNanosConversion();
        org.apache.avro.Schema schema2 = null;
        org.apache.avro.LogicalType logicalType3 = null;
        java.time.Instant instant4 = timestampNanosConversion0.fromLong((java.lang.Long) 100L, schema2, logicalType3);
        org.apache.avro.data.TimeConversions.DateConversion dateConversion6 = new org.apache.avro.data.TimeConversions.DateConversion();
        org.apache.avro.Schema schema7 = dateConversion6.getRecommendedSchema();
        org.apache.avro.LogicalType logicalType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.Instant instant9 = timestampNanosConversion0.fromInt((java.lang.Integer) 0, schema7, logicalType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.LogicalType.getName()\" because \"type\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(schema7);
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
        java.lang.String str16 = timestampMillisConversion13.adjustAndSetValue("local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS);", "hi! = hi!.truncatedTo(java.time.temporal.ChronoUnit.NANOS);");
        org.apache.avro.data.TimeConversions.TimestampMillisConversion timestampMillisConversion17 = new org.apache.avro.data.TimeConversions.TimestampMillisConversion();
        java.lang.String str20 = timestampMillisConversion17.adjustAndSetValue("local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS);", "hi! = hi!.truncatedTo(java.time.temporal.ChronoUnit.NANOS);");
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
        java.time.LocalDateTime localDateTime41 = localTimestampNanosConversion36.fromLong((java.lang.Long) 100L, schema39, logicalType40);
        org.apache.avro.Schema schema42 = null;
        org.apache.avro.LogicalType logicalType43 = null;
        java.lang.Long long44 = localTimestampMillisConversion35.toLong(localDateTime41, schema42, logicalType43);
        org.apache.avro.data.TimeConversions.TimeMicrosConversion timeMicrosConversion46 = new org.apache.avro.data.TimeConversions.TimeMicrosConversion();
        org.apache.avro.Schema schema47 = timeMicrosConversion46.getRecommendedSchema();
        org.apache.avro.LogicalType logicalType48 = null;
        java.time.LocalDateTime localDateTime49 = localTimestampMillisConversion35.fromLong((java.lang.Long) 100L, schema47, logicalType48);
        org.apache.avro.LogicalType logicalType50 = null;
        java.time.LocalDate localDate51 = dateConversion33.fromInt((java.lang.Integer) 0, schema47, logicalType50);
        org.apache.avro.LogicalType logicalType52 = null;
        java.lang.Long long53 = timestampMillisConversion13.toLong(instant26, schema47, logicalType52);
        org.apache.avro.LogicalType logicalType54 = null;
        java.time.LocalTime localTime55 = timeMillisConversion0.fromInt((java.lang.Integer) 10, schema47, logicalType54);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! = local-timestamp-nanos.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);" + "'", str3, "hi! = local-timestamp-nanos.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);");
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = hi! = hi!.truncatedTo(java.time.temporal.ChronoUnit.NANOS);.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);" + "'", str16, "local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = hi! = hi!.truncatedTo(java.time.temporal.ChronoUnit.NANOS);.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = hi! = hi!.truncatedTo(java.time.temporal.ChronoUnit.NANOS);.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);" + "'", str20, "local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = hi! = hi!.truncatedTo(java.time.temporal.ChronoUnit.NANOS);.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);");
        org.junit.Assert.assertNotNull(instant26);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "local-timestamp-nanos" + "'", str37, "local-timestamp-nanos");
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
        java.time.LocalDateTime localDateTime5 = localTimestampNanosConversion0.fromLong((java.lang.Long) 100L, schema3, logicalType4);
        org.apache.avro.Schema schema6 = localTimestampNanosConversion0.getRecommendedSchema();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "local-timestamp-nanos" + "'", str1, "local-timestamp-nanos");
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(schema6);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test39");
        org.apache.avro.data.TimeConversions.DateConversion dateConversion0 = new org.apache.avro.data.TimeConversions.DateConversion();
        org.apache.avro.data.TimeConversions.LocalTimestampMillisConversion localTimestampMillisConversion2 = new org.apache.avro.data.TimeConversions.LocalTimestampMillisConversion();
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion3 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        java.lang.String str4 = localTimestampNanosConversion3.getLogicalTypeName();
        org.apache.avro.Schema schema6 = null;
        org.apache.avro.LogicalType logicalType7 = null;
        java.time.LocalDateTime localDateTime8 = localTimestampNanosConversion3.fromLong((java.lang.Long) 100L, schema6, logicalType7);
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.LogicalType logicalType10 = null;
        java.lang.Long long11 = localTimestampMillisConversion2.toLong(localDateTime8, schema9, logicalType10);
        org.apache.avro.data.TimeConversions.TimeMicrosConversion timeMicrosConversion13 = new org.apache.avro.data.TimeConversions.TimeMicrosConversion();
        org.apache.avro.Schema schema14 = timeMicrosConversion13.getRecommendedSchema();
        org.apache.avro.LogicalType logicalType15 = null;
        java.time.LocalDateTime localDateTime16 = localTimestampMillisConversion2.fromLong((java.lang.Long) 100L, schema14, logicalType15);
        org.apache.avro.LogicalType logicalType17 = null;
        java.time.LocalDate localDate18 = dateConversion0.fromInt((java.lang.Integer) 0, schema14, logicalType17);
        org.apache.avro.data.TimeConversions.DateConversion dateConversion20 = new org.apache.avro.data.TimeConversions.DateConversion();
        org.apache.avro.data.TimeConversions.LocalTimestampMillisConversion localTimestampMillisConversion22 = new org.apache.avro.data.TimeConversions.LocalTimestampMillisConversion();
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion23 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        java.lang.String str24 = localTimestampNanosConversion23.getLogicalTypeName();
        org.apache.avro.Schema schema26 = null;
        org.apache.avro.LogicalType logicalType27 = null;
        java.time.LocalDateTime localDateTime28 = localTimestampNanosConversion23.fromLong((java.lang.Long) 100L, schema26, logicalType27);
        org.apache.avro.Schema schema29 = null;
        org.apache.avro.LogicalType logicalType30 = null;
        java.lang.Long long31 = localTimestampMillisConversion22.toLong(localDateTime28, schema29, logicalType30);
        org.apache.avro.data.TimeConversions.TimeMicrosConversion timeMicrosConversion33 = new org.apache.avro.data.TimeConversions.TimeMicrosConversion();
        org.apache.avro.Schema schema34 = timeMicrosConversion33.getRecommendedSchema();
        org.apache.avro.LogicalType logicalType35 = null;
        java.time.LocalDateTime localDateTime36 = localTimestampMillisConversion22.fromLong((java.lang.Long) 100L, schema34, logicalType35);
        org.apache.avro.LogicalType logicalType37 = null;
        java.time.LocalDate localDate38 = dateConversion20.fromInt((java.lang.Integer) 0, schema34, logicalType37);
        org.apache.avro.Schema schema39 = dateConversion20.getRecommendedSchema();
        org.apache.avro.LogicalType logicalType40 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate41 = dateConversion0.fromLong((java.lang.Long) 0L, schema39, logicalType40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.LogicalType.getName()\" because \"type\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "local-timestamp-nanos" + "'", str4, "local-timestamp-nanos");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "local-timestamp-nanos" + "'", str24, "local-timestamp-nanos");
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(schema34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertNotNull(schema39);
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
        java.lang.String str11 = timestampNanosConversion0.adjustAndSetValue("hi! = local-timestamp-nanos.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);", "local-timestamp-nanos");
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! = hi!.truncatedTo(java.time.temporal.ChronoUnit.NANOS);" + "'", str7, "hi! = hi!.truncatedTo(java.time.temporal.ChronoUnit.NANOS);");
        org.junit.Assert.assertNotNull(instantClass8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! = local-timestamp-nanos.truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = local-timestamp-nanos.truncatedTo(java.time.temporal.ChronoUnit.NANOS);" + "'", str11, "hi! = local-timestamp-nanos.truncatedTo(java.time.temporal.ChronoUnit.MILLIS); = local-timestamp-nanos.truncatedTo(java.time.temporal.ChronoUnit.NANOS);");
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test41");
        org.apache.avro.data.TimeConversions.TimestampMillisConversion timestampMillisConversion0 = new org.apache.avro.data.TimeConversions.TimestampMillisConversion();
        org.apache.avro.Schema schema1 = timestampMillisConversion0.getRecommendedSchema();
        java.lang.Class<java.time.Instant> instantClass2 = timestampMillisConversion0.getConvertedType();
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(instantClass2);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test42");
        org.apache.avro.data.TimeConversions.TimestampMillisConversion timestampMillisConversion0 = new org.apache.avro.data.TimeConversions.TimestampMillisConversion();
        org.apache.avro.Schema schema1 = timestampMillisConversion0.getRecommendedSchema();
        org.apache.avro.data.TimeConversions.DateConversion dateConversion3 = new org.apache.avro.data.TimeConversions.DateConversion();
        org.apache.avro.data.TimeConversions.LocalTimestampMillisConversion localTimestampMillisConversion5 = new org.apache.avro.data.TimeConversions.LocalTimestampMillisConversion();
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion6 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        java.lang.String str7 = localTimestampNanosConversion6.getLogicalTypeName();
        org.apache.avro.Schema schema9 = null;
        org.apache.avro.LogicalType logicalType10 = null;
        java.time.LocalDateTime localDateTime11 = localTimestampNanosConversion6.fromLong((java.lang.Long) 100L, schema9, logicalType10);
        org.apache.avro.Schema schema12 = null;
        org.apache.avro.LogicalType logicalType13 = null;
        java.lang.Long long14 = localTimestampMillisConversion5.toLong(localDateTime11, schema12, logicalType13);
        org.apache.avro.data.TimeConversions.TimeMicrosConversion timeMicrosConversion16 = new org.apache.avro.data.TimeConversions.TimeMicrosConversion();
        org.apache.avro.Schema schema17 = timeMicrosConversion16.getRecommendedSchema();
        org.apache.avro.LogicalType logicalType18 = null;
        java.time.LocalDateTime localDateTime19 = localTimestampMillisConversion5.fromLong((java.lang.Long) 100L, schema17, logicalType18);
        org.apache.avro.LogicalType logicalType20 = null;
        java.time.LocalDate localDate21 = dateConversion3.fromInt((java.lang.Integer) 0, schema17, logicalType20);
        org.apache.avro.Schema schema22 = dateConversion3.getRecommendedSchema();
        org.apache.avro.LogicalType logicalType23 = null;
        java.time.Instant instant24 = timestampMillisConversion0.fromLong((java.lang.Long) 10L, schema22, logicalType23);
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "local-timestamp-nanos" + "'", str7, "local-timestamp-nanos");
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(instant24);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test43");
        org.apache.avro.data.TimeConversions.TimestampMicrosConversion timestampMicrosConversion0 = new org.apache.avro.data.TimeConversions.TimestampMicrosConversion();
        org.apache.avro.Schema schema1 = timestampMicrosConversion0.getRecommendedSchema();
        java.lang.Class<java.time.Instant> instantClass2 = timestampMicrosConversion0.getConvertedType();
        org.apache.avro.data.TimeConversions.DateConversion dateConversion4 = new org.apache.avro.data.TimeConversions.DateConversion();
        org.apache.avro.data.TimeConversions.LocalTimestampMillisConversion localTimestampMillisConversion6 = new org.apache.avro.data.TimeConversions.LocalTimestampMillisConversion();
        org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion localTimestampNanosConversion7 = new org.apache.avro.data.TimeConversions.LocalTimestampNanosConversion();
        java.lang.String str8 = localTimestampNanosConversion7.getLogicalTypeName();
        org.apache.avro.Schema schema10 = null;
        org.apache.avro.LogicalType logicalType11 = null;
        java.time.LocalDateTime localDateTime12 = localTimestampNanosConversion7.fromLong((java.lang.Long) 100L, schema10, logicalType11);
        org.apache.avro.Schema schema13 = null;
        org.apache.avro.LogicalType logicalType14 = null;
        java.lang.Long long15 = localTimestampMillisConversion6.toLong(localDateTime12, schema13, logicalType14);
        org.apache.avro.data.TimeConversions.TimeMicrosConversion timeMicrosConversion17 = new org.apache.avro.data.TimeConversions.TimeMicrosConversion();
        org.apache.avro.Schema schema18 = timeMicrosConversion17.getRecommendedSchema();
        org.apache.avro.LogicalType logicalType19 = null;
        java.time.LocalDateTime localDateTime20 = localTimestampMillisConversion6.fromLong((java.lang.Long) 100L, schema18, logicalType19);
        org.apache.avro.LogicalType logicalType21 = null;
        java.time.LocalDate localDate22 = dateConversion4.fromInt((java.lang.Integer) 0, schema18, logicalType21);
        org.apache.avro.Schema schema23 = dateConversion4.getRecommendedSchema();
        org.apache.avro.LogicalType logicalType24 = null;
        java.time.Instant instant25 = timestampMicrosConversion0.fromLong((java.lang.Long) 100L, schema23, logicalType24);
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(instantClass2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "local-timestamp-nanos" + "'", str8, "local-timestamp-nanos");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(instant25);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2TimeConversionsRND0.test44");
        org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion localTimestampMicrosConversion0 = new org.apache.avro.data.TimeConversions.LocalTimestampMicrosConversion();
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
        java.time.LocalDateTime localDateTime12 = localTimestampNanosConversion7.fromLong((java.lang.Long) 100L, schema10, logicalType11);
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
        java.time.LocalDateTime localDateTime27 = localTimestampNanosConversion22.fromLong((java.lang.Long) 0L, schema25, logicalType26);
        org.apache.avro.data.TimeConversions.TimestampNanosConversion timestampNanosConversion28 = new org.apache.avro.data.TimeConversions.TimestampNanosConversion();
        java.lang.String str29 = timestampNanosConversion28.getLogicalTypeName();
        java.lang.String str30 = timestampNanosConversion28.getLogicalTypeName();
        org.apache.avro.Schema schema31 = timestampNanosConversion28.getRecommendedSchema();
        org.apache.avro.LogicalType logicalType32 = null;
        java.lang.Long long33 = localTimestampMillisConversion0.toLong(localDateTime27, schema31, logicalType32);
        org.junit.Assert.assertNotNull(localDateTimeClass1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " = local-timestamp-nanos;" + "'", str5, " = local-timestamp-nanos;");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "local-timestamp-nanos" + "'", str8, "local-timestamp-nanos");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "local-timestamp-nanos" + "'", str23, "local-timestamp-nanos");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS);" + "'", str3, "local-timestamp-nanos = .truncatedTo(java.time.temporal.ChronoUnit.MILLIS);");
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

