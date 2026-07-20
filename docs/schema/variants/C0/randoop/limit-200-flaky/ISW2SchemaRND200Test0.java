package org.apache.avro;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ISW2SchemaRND200Test0 {

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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test001");
        java.util.List<java.lang.String> strList3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createEnum("hi!", "", "", strList3);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: hi!");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test002");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: com.fasterxml.jackson.core.JsonParseException: Unrecognized token 'hi': was expecting (JSON String, Number, Array, Object or token 'null', 'true' or 'false')? at [Source: REDACTED (`StreamReadFeature.INCLUDE_SOURCE_IN_LOCATION` disabled); line: 1, column: 1]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test003");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema2 = org.apache.avro.Schema.applyAliases(schema0, schema1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test004");
        com.fasterxml.jackson.databind.JsonNode jsonNode0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet1 = org.apache.avro.Schema.parseAliases(jsonNode0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test005");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
        org.apache.avro.Schema schema2 = null;
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createMap(schema2);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] { schema3 };
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = schema1.toString((java.util.Collection<org.apache.avro.Schema>) schemaList5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test006");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("", "", "", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test007");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode1 = org.apache.avro.Schema.parseJson("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: com.fasterxml.jackson.core.JsonParseException: Unrecognized token 'hi': was expecting (JSON String, Number, Array, Object or token 'null', 'true' or 'false')? at [Source: REDACTED (`StreamReadFeature.INCLUDE_SOURCE_IN_LOCATION` disabled); line: 1, column: 1]");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test008");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("hi!", "hi!", "hi!", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: hi!");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test009");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.NULL;
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.NULL + "'", type0.equals(org.apache.avro.Schema.Type.NULL));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test010");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema8 = org.apache.avro.Schema.createEnum("hi!", "hi!", "", (java.util.List<java.lang.String>) strList6);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: hi!");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test011");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList2 = schema1.getEnumSymbols();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test012");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("", "", "", 1);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test013");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = schema1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test014");
        org.apache.avro.NameValidator nameValidator0 = null;
        org.apache.avro.Schema.Parser parser1 = new org.apache.avro.Schema.Parser(nameValidator0);
        java.lang.Iterable<org.apache.avro.Schema> schemaIterable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Parser parser3 = parser1.addTypes(schemaIterable2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test015");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = schema1.getNamespace();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test016");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
        org.apache.avro.Schema schema2 = null;
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createMap(schema2);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] { schema0, schema3 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema5 = org.apache.avro.Schema.createUnion(schemaArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test017");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("hi!", "", "hi!", 10);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: hi!");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test018");
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.createMap(schema1);
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = null;
        org.apache.avro.Schema.Field.Order order6 = org.apache.avro.Schema.Field.Order.ASCENDING;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field7 = new org.apache.avro.Schema.Field("", schema1, "hi!", jsonNode4, true, order6);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertTrue("'" + order6 + "' != '" + org.apache.avro.Schema.Field.Order.ASCENDING + "'", order6.equals(org.apache.avro.Schema.Field.Order.ASCENDING));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test019");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = schema1.hasEnumSymbol("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test020");
        com.fasterxml.jackson.databind.JsonNode jsonNode0 = null;
        org.apache.avro.ParseContext parseContext1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema3 = org.apache.avro.Schema.parse(jsonNode0, parseContext1, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Cannot parse <null> schema");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test021");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
        // The following exception was thrown during execution in test generation
        try {
            int int2 = schema1.computeHash();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test022");
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList1 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor3 = strComparableList1.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableList1.parallelStream();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add((int) (byte) 100, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strComparableItor3);
        org.junit.Assert.assertNotNull(strComparableStream4);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test023");
        org.slf4j.Logger logger0 = org.apache.avro.Schema.LOG;
        org.junit.Assert.assertNotNull(logger0);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test024");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
        org.apache.avro.Schema schema2 = null;
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createMap(schema2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.applyAliases(schema1, schema3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema3);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test025");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = schema1.toString((java.util.Set<java.lang.String>) strSet5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test026");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList4 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean5 = strComparableList4.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableList4.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableList4.parallelStream();
        // The following exception was thrown during execution in test generation
        try {
            schema1.addProp("", (java.lang.Object) strComparableStream7);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Unknown datum class: class java.util.stream.ReferencePipeline$Head");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertNotNull(strComparableStream7);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test027");
        org.apache.avro.NameValidator nameValidator0 = null;
        org.apache.avro.Schema.Parser parser1 = new org.apache.avro.Schema.Parser(nameValidator0);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Parser parser3 = parser1.addTypes(strMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test028");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet2 = schema1.getAliases();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test029");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.FIXED;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Can't create a: FIXED");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.FIXED + "'", type0.equals(org.apache.avro.Schema.Type.FIXED));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test030");
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.createMap(schema1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field5 = new org.apache.avro.Schema.Field("", schema1, "", (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test031");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
        // The following exception was thrown during execution in test generation
        try {
            schema1.addAlias("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test032");
        java.lang.Object obj0 = org.apache.avro.Schema.Field.NULL_DEFAULT_VALUE;
        org.junit.Assert.assertNotNull(obj0);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test033");
        org.apache.avro.JsonProperties.Null null0 = org.apache.avro.JsonProperties.NULL_VALUE;
        org.junit.Assert.assertNotNull(null0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test034");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema9 = org.apache.avro.Schema.createEnum("", "hi!", "hi!", (java.util.List<java.lang.String>) strList6, "");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test035");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field3 = schema1.getField("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test036");
        org.apache.avro.Schema.Field[] fieldArray4 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList5 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList5, fieldArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema7 = org.apache.avro.Schema.createRecord("hi!", "hi!", "", false, (java.util.List<org.apache.avro.Schema.Field>) fieldList5);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: hi!");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldArray4);
        org.junit.Assert.assertArrayEquals(fieldArray4, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test037");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Cannot parse <null> schema");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test038");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = schema1.isError();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test039");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.DOUBLE;
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.DOUBLE + "'", type0.equals(org.apache.avro.Schema.Type.DOUBLE));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test040");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
        org.apache.avro.Schema schema2 = null;
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createMap(schema2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = schema1.equalCachedHash(schema2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema3);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test041");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.avro.Schema.Field> fieldList2 = schema1.getFields();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test042");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.INT;
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type0.equals(org.apache.avro.Schema.Type.INT));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test043");
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList1 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable4 = strComparableList1.remove((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test044");
        org.apache.avro.NameValidator nameValidator0 = null;
        org.apache.avro.Schema.Parser parser1 = new org.apache.avro.Schema.Parser(nameValidator0);
        org.apache.avro.ParseContext parseContext2 = parser1.context;
        org.apache.avro.Schema.Parser parser4 = parser1.setValidateDefaults(false);
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema> schemaList5 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema>();
        org.apache.avro.Schema.Parser parser6 = parser1.addTypes((java.lang.Iterable<org.apache.avro.Schema>) schemaList5);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Parser parser8 = parser6.addTypes(strMap7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseContext2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test045");
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList0 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable2 = strComparableList0.get(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test046");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = schema1.getEnumDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test047");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = schema1.toString(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test048");
        java.util.Map<java.lang.String, org.apache.avro.Schema.Type> strMap0 = org.apache.avro.Schema.PRIMITIVES;
        org.junit.Assert.assertNotNull(strMap0);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test049");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList1 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Capacity: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test050");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
        org.apache.avro.Schema schema2 = null;
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createMap(schema2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.applyAliases(schema0, schema3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema3);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test051");
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList1 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor3 = strComparableList1.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((java.util.List<java.lang.Comparable<java.lang.String>>) strComparableList1);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList6 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean7 = strComparableList6.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableList6.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList9 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((java.util.List<java.lang.Comparable<java.lang.String>>) strComparableList6);
        org.apache.avro.Schema.SeenPair seenPair11 = new org.apache.avro.Schema.SeenPair((java.lang.Object) strComparableList6, (java.lang.Object) 0.0f);
        boolean boolean12 = strComparableList4.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList6);
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator13 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList4.replaceAll(strComparableUnaryOperator13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strComparableItor3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test052");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet4 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet4, strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = schema1.toString((java.util.Set<java.lang.String>) strSet4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test053");
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.createMap(schema1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field3 = new org.apache.avro.Schema.Field("", schema2);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test054");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.avro.Schema> schemaList2 = schema1.getTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test055");
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList1 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor3 = strComparableList1.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((java.util.List<java.lang.Comparable<java.lang.String>>) strComparableList1);
        java.util.ArrayList[] arrayListArray6 = new java.util.ArrayList[1];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.Comparable<java.lang.String>>[] strComparableListArray7 = (java.util.ArrayList<java.lang.Comparable<java.lang.String>>[]) arrayListArray6;
        strComparableListArray7[0] = strComparableList4;
        org.apache.avro.Schema.LockableArrayList<java.util.ArrayList<java.lang.Comparable<java.lang.String>>> strComparableListList10 = new org.apache.avro.Schema.LockableArrayList<java.util.ArrayList<java.lang.Comparable<java.lang.String>>>(strComparableListArray7);
        java.lang.Class<?> wildcardClass11 = strComparableListArray7.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strComparableItor3);
        org.junit.Assert.assertNotNull(arrayListArray6);
        org.junit.Assert.assertNotNull(strComparableListArray7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test056");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Name name2 = new org.apache.avro.Schema.Name("", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test057");
        org.apache.avro.NameValidator nameValidator0 = null;
        org.apache.avro.Schema.setNameValidator(nameValidator0);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test058");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            schema1.fieldsToJson((java.util.Set<java.lang.String>) strSet5, "hi!", jsonGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test059");
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.createMap(schema1);
        org.apache.avro.Schema.Field.Order order5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field6 = new org.apache.avro.Schema.Field("hi!", schema2, "hi!", (java.lang.Object) (short) 10, order5);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Unknown datum class: class java.lang.Short");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test060");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
        // The following exception was thrown during execution in test generation
        try {
            schema1.addAlias("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test061");
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList1 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor3 = strComparableList1.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableList1.parallelStream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream5 = strComparableList1.stream();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strComparableItor3);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNotNull(strComparableStream5);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test062");
        org.apache.avro.NameValidator nameValidator0 = null;
        org.apache.avro.Schema.Parser parser1 = new org.apache.avro.Schema.Parser(nameValidator0);
        org.apache.avro.ParseContext parseContext2 = parser1.context;
        org.apache.avro.Schema.Parser parser4 = parser1.setValidateDefaults(false);
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema> schemaList5 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema>();
        org.apache.avro.Schema.Parser parser6 = parser1.addTypes((java.lang.Iterable<org.apache.avro.Schema>) schemaList5);
        java.io.File file7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema8 = parser1.parse(file7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseContext2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test063");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = schema1.getEnumOrdinal("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test064");
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList1 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((int) (short) 0);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList3 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean4 = strComparableList3.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableList3.iterator();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList7 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean8 = strComparableList7.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableList7.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList10 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((java.util.List<java.lang.Comparable<java.lang.String>>) strComparableList7);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList12 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean13 = strComparableList12.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor14 = strComparableList12.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList15 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((java.util.List<java.lang.Comparable<java.lang.String>>) strComparableList12);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList17 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean18 = strComparableList17.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor19 = strComparableList17.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList21 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((int) (short) 0);
        java.lang.Cloneable[] cloneableArray22 = new java.lang.Cloneable[] { strComparableList3, strComparableList10, strComparableList15, strComparableList17, strComparableList21 };
        java.lang.Cloneable[] cloneableArray23 = strComparableList1.toArray(cloneableArray22);
        java.lang.Object obj24 = strComparableList1.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<java.lang.Comparable<java.lang.String>> strComparableItor26 = strComparableList1.listIterator(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strComparableItor14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strComparableItor19);
        org.junit.Assert.assertNotNull(cloneableArray22);
        org.junit.Assert.assertNotNull(cloneableArray23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "[]");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test065");
        org.slf4j.Logger logger0 = org.apache.avro.Schema.LOG;
        org.slf4j.Logger[] loggerArray1 = new org.slf4j.Logger[] { logger0 };
        java.util.ArrayList<org.slf4j.Logger> loggerList2 = new java.util.ArrayList<org.slf4j.Logger>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.slf4j.Logger>) loggerList2, loggerArray1);
        org.apache.avro.Schema.LockableArrayList<org.slf4j.Logger> loggerList4 = new org.apache.avro.Schema.LockableArrayList<org.slf4j.Logger>((java.util.List<org.slf4j.Logger>) loggerList2);
        org.junit.Assert.assertNotNull(logger0);
        org.junit.Assert.assertNotNull(loggerArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test066");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet4 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet4, strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = schema1.toString((java.util.Set<java.lang.String>) strSet4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test067");
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList1 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((int) (short) 0);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList3 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean4 = strComparableList3.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableList3.iterator();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList7 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean8 = strComparableList7.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableList7.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList10 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((java.util.List<java.lang.Comparable<java.lang.String>>) strComparableList7);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList12 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean13 = strComparableList12.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor14 = strComparableList12.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList15 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((java.util.List<java.lang.Comparable<java.lang.String>>) strComparableList12);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList17 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean18 = strComparableList17.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor19 = strComparableList17.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList21 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((int) (short) 0);
        java.lang.Cloneable[] cloneableArray22 = new java.lang.Cloneable[] { strComparableList3, strComparableList10, strComparableList15, strComparableList17, strComparableList21 };
        java.lang.Cloneable[] cloneableArray23 = strComparableList1.toArray(cloneableArray22);
        int int24 = strComparableList1.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strComparableItor14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strComparableItor19);
        org.junit.Assert.assertNotNull(cloneableArray22);
        org.junit.Assert.assertNotNull(cloneableArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test068");
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList1 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor3 = strComparableList1.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableList1.parallelStream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream5 = strComparableList1.parallelStream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableList1.parallelStream();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strComparableItor3);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNotNull(strComparableStream5);
        org.junit.Assert.assertNotNull(strComparableStream6);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test069");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
        org.apache.avro.Schema schema2 = null;
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createMap(schema2);
        // The following exception was thrown during execution in test generation
        try {
            schema1.putAll((org.apache.avro.JsonProperties) schema2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema3);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test070");
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.createMap(schema1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field5 = new org.apache.avro.Schema.Field("hi!", schema2, "", (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Unknown datum class: class java.lang.Short");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test071");
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.createMap(schema1);
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = null;
        org.apache.avro.Schema.Field.Order order6 = org.apache.avro.Schema.Field.Order.ASCENDING;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field7 = new org.apache.avro.Schema.Field("hi!", schema1, "", jsonNode4, true, order6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertTrue("'" + order6 + "' != '" + org.apache.avro.Schema.Field.Order.ASCENDING + "'", order6.equals(org.apache.avro.Schema.Field.Order.ASCENDING));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test072");
        com.fasterxml.jackson.databind.JsonNode jsonNode0 = null;
        org.apache.avro.NameValidator nameValidator1 = null;
        org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser(nameValidator1);
        org.apache.avro.ParseContext parseContext3 = parser2.context;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema5 = org.apache.avro.Schema.parse(jsonNode0, parseContext3, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Cannot parse <null> schema");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseContext3);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test073");
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList1 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((int) (short) 0);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList3 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean4 = strComparableList3.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableList3.iterator();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList7 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean8 = strComparableList7.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableList7.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList10 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((java.util.List<java.lang.Comparable<java.lang.String>>) strComparableList7);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList12 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean13 = strComparableList12.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor14 = strComparableList12.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList15 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((java.util.List<java.lang.Comparable<java.lang.String>>) strComparableList12);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList17 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean18 = strComparableList17.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor19 = strComparableList17.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList21 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((int) (short) 0);
        java.lang.Cloneable[] cloneableArray22 = new java.lang.Cloneable[] { strComparableList3, strComparableList10, strComparableList15, strComparableList17, strComparableList21 };
        java.lang.Cloneable[] cloneableArray23 = strComparableList1.toArray(cloneableArray22);
        java.lang.Object obj24 = null;
        boolean boolean25 = strComparableList1.equals(obj24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable28 = strComparableList1.set((int) (short) 100, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strComparableItor14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strComparableItor19);
        org.junit.Assert.assertNotNull(cloneableArray22);
        org.junit.Assert.assertNotNull(cloneableArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test074");
        org.apache.avro.Schema.Names names0 = new org.apache.avro.Schema.Names();
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.createMap(schema1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = names0.contains(schema1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test075");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int3 = schema1.getIndexNamed("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test076");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
        java.lang.String[] strArray5 = new java.lang.String[] { "{}", "{}", "" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            schema1.fieldsToJson((java.util.Set<java.lang.String>) strSet6, "{}", jsonGenerator9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "{}", "{}", "" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test077");
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList1 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor3 = strComparableList1.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableList1.parallelStream();
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.replaceAll(strComparableUnaryOperator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strComparableItor3);
        org.junit.Assert.assertNotNull(strComparableStream4);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test078");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.BOOLEAN;
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.BOOLEAN + "'", type0.equals(org.apache.avro.Schema.Type.BOOLEAN));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test079");
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.createMap(schema1);
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList5 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((int) (short) 0);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList7 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean8 = strComparableList7.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableList7.iterator();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList11 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean12 = strComparableList11.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor13 = strComparableList11.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList14 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((java.util.List<java.lang.Comparable<java.lang.String>>) strComparableList11);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList16 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean17 = strComparableList16.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor18 = strComparableList16.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList19 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((java.util.List<java.lang.Comparable<java.lang.String>>) strComparableList16);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList21 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean22 = strComparableList21.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor23 = strComparableList21.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList25 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((int) (short) 0);
        java.lang.Cloneable[] cloneableArray26 = new java.lang.Cloneable[] { strComparableList7, strComparableList14, strComparableList19, strComparableList21, strComparableList25 };
        java.lang.Cloneable[] cloneableArray27 = strComparableList5.toArray(cloneableArray26);
        java.lang.Object obj28 = strComparableList5.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field29 = new org.apache.avro.Schema.Field("", schema1, "", obj28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strComparableItor13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strComparableItor18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strComparableItor23);
        org.junit.Assert.assertNotNull(cloneableArray26);
        org.junit.Assert.assertNotNull(cloneableArray27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "[]");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test080");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
        // The following exception was thrown during execution in test generation
        try {
            schema1.addAlias("{}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test081");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.FLOAT;
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.FLOAT + "'", type0.equals(org.apache.avro.Schema.Type.FLOAT));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test082");
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList1 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor3 = strComparableList1.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((java.util.List<java.lang.Comparable<java.lang.String>>) strComparableList1);
        strComparableList1.ensureCapacity((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strComparableItor3);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test083");
        org.apache.avro.NameValidator nameValidator0 = null;
        org.apache.avro.Schema.Parser parser1 = new org.apache.avro.Schema.Parser(nameValidator0);
        org.apache.avro.ParseContext parseContext2 = parser1.context;
        org.apache.avro.Schema.Parser parser4 = parser1.setValidateDefaults(false);
        java.lang.String[] strArray11 = new java.lang.String[] { "{}", "hi!", "hi!", "", "{}" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema12 = parser1.parse("{}", strArray11);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: No type: {}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseContext2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "{}", "hi!", "hi!", "", "{}" });
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test084");
        org.apache.avro.NameValidator nameValidator0 = null;
        org.apache.avro.Schema.Parser parser1 = new org.apache.avro.Schema.Parser(nameValidator0);
        org.apache.avro.ParseContext parseContext2 = parser1.context;
        org.apache.avro.Schema.Parser parser4 = parser1.setValidateDefaults(false);
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema> schemaList5 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema>();
        org.apache.avro.Schema.Parser parser6 = parser1.addTypes((java.lang.Iterable<org.apache.avro.Schema>) schemaList5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema8 = parser1.parseInternal("");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Cannot parse <null> schema");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseContext2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test085");
        org.apache.avro.Schema.SeenPair seenPair2 = new org.apache.avro.Schema.SeenPair((java.lang.Object) 100, (java.lang.Object) 100L);
        org.apache.avro.Schema.Type type3 = org.apache.avro.Schema.Type.RECORD;
        boolean boolean4 = seenPair2.equals((java.lang.Object) type3);
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.apache.avro.Schema.Type.RECORD + "'", type3.equals(org.apache.avro.Schema.Type.RECORD));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test086");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("hi!", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: com.fasterxml.jackson.core.JsonParseException: Unrecognized token 'hi': was expecting (JSON String, Number, Array, Object or token 'null', 'true' or 'false')? at [Source: REDACTED (`StreamReadFeature.INCLUDE_SOURCE_IN_LOCATION` disabled); line: 1, column: 1]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test087");
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.createMap(schema1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field4 = new org.apache.avro.Schema.Field("hi!", schema1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test088");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
        // The following exception was thrown during execution in test generation
        try {
            int int2 = schema1.getFixedSize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test089");
        org.apache.avro.Schema.Names names0 = new org.apache.avro.Schema.Names();
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.createMap(schema1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = names0.contains(schema2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.avro.Schema$MapSchema cannot be cast to class org.apache.avro.Schema$NamedSchema (org.apache.avro.Schema$MapSchema and org.apache.avro.Schema$NamedSchema are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test090");
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList1 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((int) (short) 0);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList3 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean4 = strComparableList3.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableList3.iterator();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList7 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean8 = strComparableList7.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableList7.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList10 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((java.util.List<java.lang.Comparable<java.lang.String>>) strComparableList7);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList12 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean13 = strComparableList12.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor14 = strComparableList12.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList15 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((java.util.List<java.lang.Comparable<java.lang.String>>) strComparableList12);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList17 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean18 = strComparableList17.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor19 = strComparableList17.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList21 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((int) (short) 0);
        java.lang.Cloneable[] cloneableArray22 = new java.lang.Cloneable[] { strComparableList3, strComparableList10, strComparableList15, strComparableList17, strComparableList21 };
        java.lang.Cloneable[] cloneableArray23 = strComparableList1.toArray(cloneableArray22);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList26 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean27 = strComparableList26.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor28 = strComparableList26.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream29 = strComparableList26.parallelStream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream30 = strComparableList26.parallelStream();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = strComparableList1.addAll((int) (byte) -1, (java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList26);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strComparableItor14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strComparableItor19);
        org.junit.Assert.assertNotNull(cloneableArray22);
        org.junit.Assert.assertNotNull(cloneableArray23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strComparableItor28);
        org.junit.Assert.assertNotNull(strComparableStream29);
        org.junit.Assert.assertNotNull(strComparableStream30);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test091");
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList1 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor3 = strComparableList1.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((java.util.List<java.lang.Comparable<java.lang.String>>) strComparableList1);
        org.apache.avro.Schema.SeenPair seenPair6 = new org.apache.avro.Schema.SeenPair((java.lang.Object) strComparableList1, (java.lang.Object) 0.0f);
        boolean boolean8 = strComparableList1.equals((java.lang.Object) 100.0d);
        boolean boolean9 = strComparableList1.isEmpty();
        int int10 = strComparableList1.size();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList12 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean13 = strComparableList12.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor14 = strComparableList12.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList15 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((java.util.List<java.lang.Comparable<java.lang.String>>) strComparableList12);
        java.util.ArrayList[] arrayListArray17 = new java.util.ArrayList[1];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.Comparable<java.lang.String>>[] strComparableListArray18 = (java.util.ArrayList<java.lang.Comparable<java.lang.String>>[]) arrayListArray17;
        strComparableListArray18[0] = strComparableList15;
        org.apache.avro.Schema.LockableArrayList<java.util.ArrayList<java.lang.Comparable<java.lang.String>>> strComparableListList21 = new org.apache.avro.Schema.LockableArrayList<java.util.ArrayList<java.lang.Comparable<java.lang.String>>>(strComparableListArray18);
        java.lang.Class<?> wildcardClass22 = strComparableListArray18.getClass();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList24 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean25 = strComparableList24.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor26 = strComparableList24.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList27 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((java.util.List<java.lang.Comparable<java.lang.String>>) strComparableList24);
        java.util.ArrayList[] arrayListArray29 = new java.util.ArrayList[1];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.Comparable<java.lang.String>>[] strComparableListArray30 = (java.util.ArrayList<java.lang.Comparable<java.lang.String>>[]) arrayListArray29;
        strComparableListArray30[0] = strComparableList27;
        org.apache.avro.Schema.LockableArrayList<java.util.ArrayList<java.lang.Comparable<java.lang.String>>> strComparableListList33 = new org.apache.avro.Schema.LockableArrayList<java.util.ArrayList<java.lang.Comparable<java.lang.String>>>(strComparableListArray30);
        java.lang.Class<?> wildcardClass34 = strComparableListArray30.getClass();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList36 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean37 = strComparableList36.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor38 = strComparableList36.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList39 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((java.util.List<java.lang.Comparable<java.lang.String>>) strComparableList36);
        java.util.ArrayList[] arrayListArray41 = new java.util.ArrayList[1];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.Comparable<java.lang.String>>[] strComparableListArray42 = (java.util.ArrayList<java.lang.Comparable<java.lang.String>>[]) arrayListArray41;
        strComparableListArray42[0] = strComparableList39;
        org.apache.avro.Schema.LockableArrayList<java.util.ArrayList<java.lang.Comparable<java.lang.String>>> strComparableListList45 = new org.apache.avro.Schema.LockableArrayList<java.util.ArrayList<java.lang.Comparable<java.lang.String>>>(strComparableListArray42);
        java.lang.Class<?> wildcardClass46 = strComparableListArray42.getClass();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList48 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean49 = strComparableList48.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor50 = strComparableList48.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList51 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((java.util.List<java.lang.Comparable<java.lang.String>>) strComparableList48);
        java.util.ArrayList[] arrayListArray53 = new java.util.ArrayList[1];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.Comparable<java.lang.String>>[] strComparableListArray54 = (java.util.ArrayList<java.lang.Comparable<java.lang.String>>[]) arrayListArray53;
        strComparableListArray54[0] = strComparableList51;
        org.apache.avro.Schema.LockableArrayList<java.util.ArrayList<java.lang.Comparable<java.lang.String>>> strComparableListList57 = new org.apache.avro.Schema.LockableArrayList<java.util.ArrayList<java.lang.Comparable<java.lang.String>>>(strComparableListArray54);
        java.lang.Class<?> wildcardClass58 = strComparableListArray54.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray59 = new java.lang.reflect.AnnotatedElement[] { wildcardClass22, wildcardClass34, wildcardClass46, wildcardClass58 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.AnnotatedElement[] annotatedElementArray60 = strComparableList1.toArray(annotatedElementArray59);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: arraycopy: element type mismatch: can not cast one of the elements of java.lang.Object[] to the type of the destination array, java.lang.reflect.AnnotatedElement");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strComparableItor3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strComparableItor14);
        org.junit.Assert.assertNotNull(arrayListArray17);
        org.junit.Assert.assertNotNull(strComparableListArray18);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strComparableItor26);
        org.junit.Assert.assertNotNull(arrayListArray29);
        org.junit.Assert.assertNotNull(strComparableListArray30);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(strComparableItor38);
        org.junit.Assert.assertNotNull(arrayListArray41);
        org.junit.Assert.assertNotNull(strComparableListArray42);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(strComparableItor50);
        org.junit.Assert.assertNotNull(arrayListArray53);
        org.junit.Assert.assertNotNull(strComparableListArray54);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(annotatedElementArray59);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test092");
        org.apache.avro.Schema.Names names0 = new org.apache.avro.Schema.Names();
        java.lang.String str1 = names0.toString();
        org.apache.avro.Schema.Type type2 = org.apache.avro.Schema.Type.BYTES;
        boolean boolean3 = names0.equals((java.lang.Object) type2);
        names0.clear();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.apache.avro.Schema.Type.BYTES + "'", type2.equals(org.apache.avro.Schema.Type.BYTES));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test093");
        org.apache.avro.NameValidator nameValidator0 = null;
        org.apache.avro.Schema.Parser parser1 = new org.apache.avro.Schema.Parser(nameValidator0);
        java.io.File file2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema3 = parser1.parse(file2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test094");
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList1 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((int) (short) 0);
        strComparableList1.trimToSize();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test095");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.ARRAY;
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.ARRAY + "'", type0.equals(org.apache.avro.Schema.Type.ARRAY));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test096");
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList0 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList2 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor4 = strComparableList2.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList5 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((java.util.List<java.lang.Comparable<java.lang.String>>) strComparableList2);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList7 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean8 = strComparableList7.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableList7.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList10 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((java.util.List<java.lang.Comparable<java.lang.String>>) strComparableList7);
        org.apache.avro.Schema.SeenPair seenPair12 = new org.apache.avro.Schema.SeenPair((java.lang.Object) strComparableList7, (java.lang.Object) 0.0f);
        boolean boolean13 = strComparableList5.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList7);
        boolean boolean14 = strComparableList0.remove((java.lang.Object) boolean13);
        strComparableList0.trimToSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strComparableItor4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test097");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema2 = parser0.parse(file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test098");
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList0 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
        java.util.List<java.lang.Comparable<java.lang.String>> strComparableList1 = strComparableList0.lock();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList3 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((int) (short) 0);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList5 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean6 = strComparableList5.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = strComparableList5.iterator();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList9 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean10 = strComparableList9.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor11 = strComparableList9.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList12 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((java.util.List<java.lang.Comparable<java.lang.String>>) strComparableList9);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList14 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean15 = strComparableList14.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor16 = strComparableList14.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList17 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((java.util.List<java.lang.Comparable<java.lang.String>>) strComparableList14);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList19 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean20 = strComparableList19.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor21 = strComparableList19.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList23 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((int) (short) 0);
        java.lang.Cloneable[] cloneableArray24 = new java.lang.Cloneable[] { strComparableList5, strComparableList12, strComparableList17, strComparableList19, strComparableList23 };
        java.lang.Cloneable[] cloneableArray25 = strComparableList3.toArray(cloneableArray24);
        java.lang.Object obj26 = null;
        boolean boolean27 = strComparableList3.equals(obj26);
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList28 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((java.util.List<java.lang.Comparable<java.lang.String>>) strComparableList3);
        boolean boolean29 = strComparableList0.contains((java.lang.Object) strComparableList3);
        org.junit.Assert.assertNotNull(strComparableList1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strComparableItor7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strComparableItor11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strComparableItor16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strComparableItor21);
        org.junit.Assert.assertNotNull(cloneableArray24);
        org.junit.Assert.assertNotNull(cloneableArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test099");
        org.apache.avro.Schema.Field field0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.createMap(schema1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field3 = new org.apache.avro.Schema.Field(field0, schema1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test100");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int3 = schema1.getIndexNamed("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test101");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
        org.apache.avro.Schema.Field[] fieldArray2 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList3 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList3, fieldArray2);
        // The following exception was thrown during execution in test generation
        try {
            schema1.setFields((java.util.List<org.apache.avro.Schema.Field>) fieldList3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(fieldArray2);
        org.junit.Assert.assertArrayEquals(fieldArray2, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test102");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema2 = schema1.getElementType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test103");
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList1 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((int) (short) 0);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList3 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean4 = strComparableList3.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableList3.iterator();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList7 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean8 = strComparableList7.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableList7.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList10 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((java.util.List<java.lang.Comparable<java.lang.String>>) strComparableList7);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList12 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean13 = strComparableList12.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor14 = strComparableList12.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList15 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((java.util.List<java.lang.Comparable<java.lang.String>>) strComparableList12);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList17 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean18 = strComparableList17.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor19 = strComparableList17.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList21 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((int) (short) 0);
        java.lang.Cloneable[] cloneableArray22 = new java.lang.Cloneable[] { strComparableList3, strComparableList10, strComparableList15, strComparableList17, strComparableList21 };
        java.lang.Cloneable[] cloneableArray23 = strComparableList1.toArray(cloneableArray22);
        java.lang.Object obj24 = null;
        boolean boolean25 = strComparableList1.equals(obj24);
        java.lang.Object[] objArray26 = strComparableList1.toArray();
        org.apache.avro.Schema.Type type27 = org.apache.avro.Schema.Type.STRING;
        boolean boolean28 = strComparableList1.remove((java.lang.Object) type27);
        org.apache.avro.NameValidator nameValidator29 = null;
        org.apache.avro.Schema.Parser parser30 = new org.apache.avro.Schema.Parser(nameValidator29);
        org.apache.avro.ParseContext parseContext31 = parser30.context;
        org.apache.avro.Schema.Parser parser33 = parser30.setValidateDefaults(false);
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema> schemaList34 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema>();
        org.apache.avro.Schema.Parser parser35 = parser30.addTypes((java.lang.Iterable<org.apache.avro.Schema>) schemaList34);
        int int36 = strComparableList1.lastIndexOf((java.lang.Object) parser30);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strComparableItor14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strComparableItor19);
        org.junit.Assert.assertNotNull(cloneableArray22);
        org.junit.Assert.assertNotNull(cloneableArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertArrayEquals(objArray26, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + type27 + "' != '" + org.apache.avro.Schema.Type.STRING + "'", type27.equals(org.apache.avro.Schema.Type.STRING));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(parseContext31);
        org.junit.Assert.assertNotNull(parser33);
        org.junit.Assert.assertNotNull(parser35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test104");
        org.apache.avro.Schema.Names names0 = new org.apache.avro.Schema.Names();
        java.lang.String str1 = names0.toString();
        org.apache.avro.Schema.Type type2 = org.apache.avro.Schema.Type.BYTES;
        boolean boolean3 = names0.equals((java.lang.Object) type2);
        org.apache.avro.Schema schema4 = null;
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createMap(schema4);
        // The following exception was thrown during execution in test generation
        try {
            names0.add(schema4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.apache.avro.Schema.Type.BYTES + "'", type2.equals(org.apache.avro.Schema.Type.BYTES));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(schema5);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test105");
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList0 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
        java.util.List<java.lang.Comparable<java.lang.String>> strComparableList1 = strComparableList0.lock();
        java.lang.Object obj2 = strComparableList0.clone();
        org.junit.Assert.assertNotNull(strComparableList1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "[]");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test106");
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList1 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((int) (short) 0);
        int int3 = strComparableList1.lastIndexOf((java.lang.Object) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test107");
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList1 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((int) (short) 0);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList3 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean4 = strComparableList3.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableList3.iterator();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList7 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean8 = strComparableList7.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableList7.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList10 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((java.util.List<java.lang.Comparable<java.lang.String>>) strComparableList7);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList12 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean13 = strComparableList12.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor14 = strComparableList12.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList15 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((java.util.List<java.lang.Comparable<java.lang.String>>) strComparableList12);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList17 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean18 = strComparableList17.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor19 = strComparableList17.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList21 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((int) (short) 0);
        java.lang.Cloneable[] cloneableArray22 = new java.lang.Cloneable[] { strComparableList3, strComparableList10, strComparableList15, strComparableList17, strComparableList21 };
        java.lang.Cloneable[] cloneableArray23 = strComparableList1.toArray(cloneableArray22);
        java.lang.Object obj24 = strComparableList1.clone();
        strComparableList1.trimToSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable27 = strComparableList1.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strComparableItor14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strComparableItor19);
        org.junit.Assert.assertNotNull(cloneableArray22);
        org.junit.Assert.assertNotNull(cloneableArray23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "[]");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test108");
        boolean boolean0 = org.apache.avro.Schema.getValidateDefaults();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test109");
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList1 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((int) (short) 0);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList3 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean4 = strComparableList3.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableList3.iterator();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList7 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean8 = strComparableList7.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableList7.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList10 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((java.util.List<java.lang.Comparable<java.lang.String>>) strComparableList7);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList12 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean13 = strComparableList12.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor14 = strComparableList12.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList15 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((java.util.List<java.lang.Comparable<java.lang.String>>) strComparableList12);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList17 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean18 = strComparableList17.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor19 = strComparableList17.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList21 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((int) (short) 0);
        java.lang.Cloneable[] cloneableArray22 = new java.lang.Cloneable[] { strComparableList3, strComparableList10, strComparableList15, strComparableList17, strComparableList21 };
        java.lang.Cloneable[] cloneableArray23 = strComparableList1.toArray(cloneableArray22);
        java.lang.Object obj24 = null;
        boolean boolean25 = strComparableList1.equals(obj24);
        java.lang.Object[] objArray26 = strComparableList1.toArray();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator27 = strComparableList1.spliterator();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strComparableItor14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strComparableItor19);
        org.junit.Assert.assertNotNull(cloneableArray22);
        org.junit.Assert.assertNotNull(cloneableArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertArrayEquals(objArray26, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(strComparableSpliterator27);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test110");
        org.apache.avro.NameValidator nameValidator0 = null;
        org.apache.avro.Schema.Parser parser1 = new org.apache.avro.Schema.Parser(nameValidator0);
        org.apache.avro.ParseContext parseContext2 = parser1.context;
        org.apache.avro.Schema.Parser parser4 = parser1.setValidateDefaults(false);
        org.apache.avro.Schema.Parser parser6 = parser1.setValidateDefaults(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema8 = parser6.parse("hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: com.fasterxml.jackson.core.JsonParseException: Unrecognized token 'hi': was expecting (JSON String, Number, Array, Object or token 'null', 'true' or 'false')? at [Source: REDACTED (`StreamReadFeature.INCLUDE_SOURCE_IN_LOCATION` disabled); line: 1, column: 1]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseContext2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test111");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = schema1.hasFields();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test112");
        org.apache.avro.Schema.Names names0 = new org.apache.avro.Schema.Names();
        java.lang.String str1 = names0.toString();
        java.lang.String str2 = names0.toString();
        names0.clear();
        names0.clear();
        java.util.Collection<org.apache.avro.Schema> schemaCollection5 = names0.values();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{}" + "'", str2, "{}");
        org.junit.Assert.assertNotNull(schemaCollection5);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test113");
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList1 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((int) (short) 0);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList3 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean4 = strComparableList3.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableList3.iterator();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList7 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean8 = strComparableList7.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableList7.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList10 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((java.util.List<java.lang.Comparable<java.lang.String>>) strComparableList7);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList12 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean13 = strComparableList12.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor14 = strComparableList12.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList15 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((java.util.List<java.lang.Comparable<java.lang.String>>) strComparableList12);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList17 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean18 = strComparableList17.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor19 = strComparableList17.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList21 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((int) (short) 0);
        java.lang.Cloneable[] cloneableArray22 = new java.lang.Cloneable[] { strComparableList3, strComparableList10, strComparableList15, strComparableList17, strComparableList21 };
        java.lang.Cloneable[] cloneableArray23 = strComparableList1.toArray(cloneableArray22);
        java.lang.Object obj24 = null;
        boolean boolean25 = strComparableList1.equals(obj24);
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList26 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((java.util.List<java.lang.Comparable<java.lang.String>>) strComparableList1);
        int int27 = strComparableList1.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strComparableItor14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strComparableItor19);
        org.junit.Assert.assertNotNull(cloneableArray22);
        org.junit.Assert.assertNotNull(cloneableArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test114");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Cannot parse <null> schema");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test115");
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList1 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((int) (short) 0);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList3 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean4 = strComparableList3.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableList3.iterator();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList7 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean8 = strComparableList7.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableList7.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList10 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((java.util.List<java.lang.Comparable<java.lang.String>>) strComparableList7);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList12 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean13 = strComparableList12.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor14 = strComparableList12.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList15 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((java.util.List<java.lang.Comparable<java.lang.String>>) strComparableList12);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList17 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean18 = strComparableList17.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor19 = strComparableList17.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList21 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((int) (short) 0);
        java.lang.Cloneable[] cloneableArray22 = new java.lang.Cloneable[] { strComparableList3, strComparableList10, strComparableList15, strComparableList17, strComparableList21 };
        java.lang.Cloneable[] cloneableArray23 = strComparableList1.toArray(cloneableArray22);
        java.lang.Object obj24 = null;
        boolean boolean25 = strComparableList1.equals(obj24);
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList26 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((java.util.List<java.lang.Comparable<java.lang.String>>) strComparableList1);
        org.apache.avro.Schema.SeenPair seenPair28 = new org.apache.avro.Schema.SeenPair((java.lang.Object) strComparableList1, (java.lang.Object) 'a');
        strComparableList1.ensureCapacity((-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strComparableItor14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strComparableItor19);
        org.junit.Assert.assertNotNull(cloneableArray22);
        org.junit.Assert.assertNotNull(cloneableArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test116");
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList1 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((int) (short) 0);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList3 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean4 = strComparableList3.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableList3.iterator();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList7 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean8 = strComparableList7.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableList7.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList10 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((java.util.List<java.lang.Comparable<java.lang.String>>) strComparableList7);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList12 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean13 = strComparableList12.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor14 = strComparableList12.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList15 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((java.util.List<java.lang.Comparable<java.lang.String>>) strComparableList12);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList17 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean18 = strComparableList17.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor19 = strComparableList17.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList21 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((int) (short) 0);
        java.lang.Cloneable[] cloneableArray22 = new java.lang.Cloneable[] { strComparableList3, strComparableList10, strComparableList15, strComparableList17, strComparableList21 };
        java.lang.Cloneable[] cloneableArray23 = strComparableList1.toArray(cloneableArray22);
        java.lang.Object obj24 = null;
        boolean boolean25 = strComparableList1.equals(obj24);
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList26 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((java.util.List<java.lang.Comparable<java.lang.String>>) strComparableList1);
        org.apache.avro.Schema.SeenPair seenPair28 = new org.apache.avro.Schema.SeenPair((java.lang.Object) strComparableList1, (java.lang.Object) 'a');
        org.apache.avro.NameValidator nameValidator29 = null;
        org.apache.avro.Schema.Parser parser30 = new org.apache.avro.Schema.Parser(nameValidator29);
        org.apache.avro.ParseContext parseContext31 = parser30.context;
        org.apache.avro.Schema.Parser parser33 = parser30.setValidateDefaults(false);
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema> schemaList34 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema>();
        org.apache.avro.Schema.Parser parser35 = parser33.addTypes((java.lang.Iterable<org.apache.avro.Schema>) schemaList34);
        boolean boolean36 = strComparableList1.remove((java.lang.Object) parser35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strComparableItor14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strComparableItor19);
        org.junit.Assert.assertNotNull(cloneableArray22);
        org.junit.Assert.assertNotNull(cloneableArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(parseContext31);
        org.junit.Assert.assertNotNull(parser33);
        org.junit.Assert.assertNotNull(parser35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test117");
        org.apache.avro.Schema.Names names0 = new org.apache.avro.Schema.Names();
        java.lang.String str1 = names0.toString();
        java.lang.String str2 = names0.toString();
        names0.clear();
        names0.clear();
        java.lang.String str5 = names0.space();
        java.util.Collection<org.apache.avro.Schema> schemaCollection6 = names0.values();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{}" + "'", str2, "{}");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(schemaCollection6);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test118");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.ENUM;
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.ENUM + "'", type0.equals(org.apache.avro.Schema.Type.ENUM));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test119");
        org.apache.avro.NameValidator nameValidator0 = null;
        org.apache.avro.Schema.Parser parser1 = new org.apache.avro.Schema.Parser(nameValidator0);
        org.apache.avro.ParseContext parseContext2 = parser1.context;
        org.apache.avro.Schema.Parser parser4 = parser1.setValidateDefaults(false);
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema> schemaList5 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema>();
        org.apache.avro.Schema.Parser parser6 = parser4.addTypes((java.lang.Iterable<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = schema7.hasFields();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseContext2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(schema7);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test120");
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList1 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor3 = strComparableList1.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((java.util.List<java.lang.Comparable<java.lang.String>>) strComparableList1);
        org.apache.avro.Schema.SeenPair seenPair6 = new org.apache.avro.Schema.SeenPair((java.lang.Object) strComparableList1, (java.lang.Object) 0.0f);
        boolean boolean8 = strComparableList1.equals((java.lang.Object) 100.0d);
        boolean boolean9 = strComparableList1.isEmpty();
        int int10 = strComparableList1.size();
        java.lang.Object obj11 = strComparableList1.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strComparableItor3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "[hi!]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "[hi!]");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test121");
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList1 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((int) (short) 0);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList3 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean4 = strComparableList3.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableList3.iterator();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList7 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean8 = strComparableList7.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableList7.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList10 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((java.util.List<java.lang.Comparable<java.lang.String>>) strComparableList7);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList12 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean13 = strComparableList12.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor14 = strComparableList12.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList15 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((java.util.List<java.lang.Comparable<java.lang.String>>) strComparableList12);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList17 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean18 = strComparableList17.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor19 = strComparableList17.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList21 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((int) (short) 0);
        java.lang.Cloneable[] cloneableArray22 = new java.lang.Cloneable[] { strComparableList3, strComparableList10, strComparableList15, strComparableList17, strComparableList21 };
        java.lang.Cloneable[] cloneableArray23 = strComparableList1.toArray(cloneableArray22);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList26 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean27 = strComparableList26.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor28 = strComparableList26.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList29 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((java.util.List<java.lang.Comparable<java.lang.String>>) strComparableList26);
        org.apache.avro.Schema.SeenPair seenPair31 = new org.apache.avro.Schema.SeenPair((java.lang.Object) strComparableList26, (java.lang.Object) 0.0f);
        boolean boolean33 = strComparableList26.equals((java.lang.Object) 100.0d);
        boolean boolean34 = strComparableList26.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = strComparableList1.addAll(10, (java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList26);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strComparableItor14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strComparableItor19);
        org.junit.Assert.assertNotNull(cloneableArray22);
        org.junit.Assert.assertNotNull(cloneableArray23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strComparableItor28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test122");
        org.apache.avro.NameValidator nameValidator0 = null;
        org.apache.avro.Schema.Parser parser1 = new org.apache.avro.Schema.Parser(nameValidator0);
        org.apache.avro.ParseContext parseContext2 = parser1.context;
        org.apache.avro.Schema.Parser parser4 = parser1.setValidateDefaults(false);
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema> schemaList5 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema>();
        org.apache.avro.Schema.Parser parser6 = parser4.addTypes((java.lang.Iterable<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        int int8 = schema7.computeHash();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = schema7.getEnumOrdinal("hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseContext2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(schema7);
// flaky "1) test122(org.apache.avro.ISW2SchemaRND200Test0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 522786291 + "'", int8 == 522786291);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test123");
        org.apache.avro.Schema.Names names0 = new org.apache.avro.Schema.Names();
        java.lang.String str1 = names0.toString();
        java.lang.String str2 = names0.toString();
        names0.clear();
        names0.clear();
        org.apache.avro.Schema schema5 = null;
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createMap(schema5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = names0.contains(schema6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.avro.Schema$MapSchema cannot be cast to class org.apache.avro.Schema$NamedSchema (org.apache.avro.Schema$MapSchema and org.apache.avro.Schema$NamedSchema are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{}" + "'", str2, "{}");
        org.junit.Assert.assertNotNull(schema6);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test124");
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList1 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((int) (short) 0);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList3 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean4 = strComparableList3.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableList3.iterator();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList7 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean8 = strComparableList7.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableList7.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList10 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((java.util.List<java.lang.Comparable<java.lang.String>>) strComparableList7);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList12 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean13 = strComparableList12.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor14 = strComparableList12.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList15 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((java.util.List<java.lang.Comparable<java.lang.String>>) strComparableList12);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList17 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean18 = strComparableList17.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor19 = strComparableList17.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList21 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((int) (short) 0);
        java.lang.Cloneable[] cloneableArray22 = new java.lang.Cloneable[] { strComparableList3, strComparableList10, strComparableList15, strComparableList17, strComparableList21 };
        java.lang.Cloneable[] cloneableArray23 = strComparableList1.toArray(cloneableArray22);
        java.lang.Object obj24 = null;
        boolean boolean25 = strComparableList1.equals(obj24);
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList26 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((java.util.List<java.lang.Comparable<java.lang.String>>) strComparableList1);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.add((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "{}");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strComparableItor14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strComparableItor19);
        org.junit.Assert.assertNotNull(cloneableArray22);
        org.junit.Assert.assertNotNull(cloneableArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test125");
        org.apache.avro.NameValidator nameValidator0 = null;
        org.apache.avro.Schema.Parser parser1 = new org.apache.avro.Schema.Parser(nameValidator0);
        org.apache.avro.ParseContext parseContext2 = parser1.context;
        org.apache.avro.Schema.Parser parser4 = parser1.setValidateDefaults(false);
        boolean boolean5 = parser4.getValidateDefaults();
        org.junit.Assert.assertNotNull(parseContext2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test126");
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList1 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((int) (short) 0);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList3 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean4 = strComparableList3.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableList3.iterator();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList7 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean8 = strComparableList7.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableList7.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList10 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((java.util.List<java.lang.Comparable<java.lang.String>>) strComparableList7);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList12 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean13 = strComparableList12.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor14 = strComparableList12.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList15 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((java.util.List<java.lang.Comparable<java.lang.String>>) strComparableList12);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList17 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean18 = strComparableList17.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor19 = strComparableList17.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList21 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((int) (short) 0);
        java.lang.Cloneable[] cloneableArray22 = new java.lang.Cloneable[] { strComparableList3, strComparableList10, strComparableList15, strComparableList17, strComparableList21 };
        java.lang.Cloneable[] cloneableArray23 = strComparableList1.toArray(cloneableArray22);
        java.lang.Object obj24 = strComparableList1.clone();
        strComparableList1.trimToSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator26 = strComparableList1.spliterator();
        strComparableList1.clear();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strComparableItor14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strComparableItor19);
        org.junit.Assert.assertNotNull(cloneableArray22);
        org.junit.Assert.assertNotNull(cloneableArray23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator26);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test127");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse(file0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test128");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = org.apache.avro.Schema.MAPPER;
        org.junit.Assert.assertNotNull(objectMapper0);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test129");
        org.apache.avro.NameValidator nameValidator0 = null;
        org.apache.avro.Schema.Parser parser1 = new org.apache.avro.Schema.Parser(nameValidator0);
        org.apache.avro.ParseContext parseContext2 = parser1.context;
        org.apache.avro.Schema.Parser parser4 = parser1.setValidateDefaults(false);
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema> schemaList5 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema>();
        org.apache.avro.Schema.Parser parser6 = parser4.addTypes((java.lang.Iterable<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        int int8 = schema7.computeHash();
        org.apache.avro.Schema.Field[] fieldArray9 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList10 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList10, fieldArray9);
        // The following exception was thrown during execution in test generation
        try {
            schema7.setFields((java.util.List<org.apache.avro.Schema.Field>) fieldList10);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseContext2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(schema7);
// flaky "2) test129(org.apache.avro.ISW2SchemaRND200Test0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 522786291 + "'", int8 == 522786291);
        org.junit.Assert.assertNotNull(fieldArray9);
        org.junit.Assert.assertArrayEquals(fieldArray9, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test130");
        org.apache.avro.Schema.Names names0 = new org.apache.avro.Schema.Names();
        java.lang.String str1 = names0.toString();
        java.lang.String str2 = names0.toString();
        names0.clear();
        names0.clear();
        java.lang.String str5 = names0.space();
        java.util.Set<org.apache.avro.Schema.Name> nameSet6 = names0.keySet();
        java.lang.String str7 = names0.space();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{}" + "'", str2, "{}");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(nameSet6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test131");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.BYTES;
        org.apache.avro.Schema.SeenPair seenPair2 = new org.apache.avro.Schema.SeenPair((java.lang.Object) type0, (java.lang.Object) (short) 1);
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.BYTES + "'", type0.equals(org.apache.avro.Schema.Type.BYTES));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test132");
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList1 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((int) (short) 1);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test133");
        org.apache.avro.NameValidator nameValidator0 = null;
        org.apache.avro.Schema.Parser parser1 = new org.apache.avro.Schema.Parser(nameValidator0);
        org.apache.avro.ParseContext parseContext2 = parser1.context;
        org.apache.avro.Schema.Parser parser4 = parser1.setValidateDefaults(false);
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema> schemaList5 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema>();
        org.apache.avro.Schema.Parser parser6 = parser4.addTypes((java.lang.Iterable<org.apache.avro.Schema>) schemaList5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema8 = parser6.parseInternal("");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Cannot parse <null> schema");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseContext2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test134");
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList1 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor3 = strComparableList1.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((java.util.List<java.lang.Comparable<java.lang.String>>) strComparableList1);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList6 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean7 = strComparableList6.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableList6.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableList6.parallelStream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream10 = strComparableList6.parallelStream();
        int int11 = strComparableList1.indexOf((java.lang.Object) strComparableStream10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Comparable<java.lang.String>> strComparableList14 = strComparableList1.subList((int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(52) > toIndex(1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strComparableItor3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(strComparableStream10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test135");
        org.apache.avro.Schema.Names names0 = new org.apache.avro.Schema.Names();
        java.lang.String str1 = names0.toString();
        java.lang.String str2 = names0.toString();
        names0.clear();
        java.util.Set<org.apache.avro.Schema.Name> nameSet4 = names0.keySet();
        boolean boolean5 = names0.isEmpty();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{}" + "'", str2, "{}");
        org.junit.Assert.assertNotNull(nameSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test136");
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList1 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor3 = strComparableList1.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((java.util.List<java.lang.Comparable<java.lang.String>>) strComparableList1);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList6 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean7 = strComparableList6.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableList6.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList9 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((java.util.List<java.lang.Comparable<java.lang.String>>) strComparableList6);
        org.apache.avro.Schema.SeenPair seenPair11 = new org.apache.avro.Schema.SeenPair((java.lang.Object) strComparableList6, (java.lang.Object) 0.0f);
        boolean boolean12 = strComparableList4.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList6);
        java.util.ListIterator<java.lang.Comparable<java.lang.String>> strComparableItor13 = strComparableList6.listIterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strComparableItor3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strComparableItor13);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test137");
        org.apache.avro.Schema.Names names0 = new org.apache.avro.Schema.Names();
        java.lang.String str1 = names0.toString();
        org.apache.avro.Schema.Name name2 = null;
        org.apache.avro.NameValidator nameValidator3 = null;
        org.apache.avro.Schema.Parser parser4 = new org.apache.avro.Schema.Parser(nameValidator3);
        org.apache.avro.ParseContext parseContext5 = parser4.context;
        org.apache.avro.Schema.Parser parser7 = parser4.setValidateDefaults(false);
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema> schemaList8 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema>();
        org.apache.avro.Schema.Parser parser9 = parser7.addTypes((java.lang.Iterable<org.apache.avro.Schema>) schemaList8);
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList8);
        int int11 = schema10.computeHash();
        org.apache.avro.NameValidator nameValidator12 = null;
        org.apache.avro.Schema.Parser parser13 = new org.apache.avro.Schema.Parser(nameValidator12);
        org.apache.avro.ParseContext parseContext14 = parser13.context;
        org.apache.avro.Schema.Parser parser16 = parser13.setValidateDefaults(false);
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema> schemaList17 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema>();
        org.apache.avro.Schema.Parser parser18 = parser16.addTypes((java.lang.Iterable<org.apache.avro.Schema>) schemaList17);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList17);
        int int20 = schema19.computeHash();
        boolean boolean21 = names0.replace(name2, schema10, schema19);
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = schema19.getObjectProps();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList23 = schema19.getEnumSymbols();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNotNull(parseContext5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(schema10);
// flaky "3) test137(org.apache.avro.ISW2SchemaRND200Test0)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 522786291 + "'", int11 == 522786291);
        org.junit.Assert.assertNotNull(parseContext14);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(schema19);
// flaky "1) test137(org.apache.avro.ISW2SchemaRND200Test0)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 522786291 + "'", int20 == 522786291);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strMap22);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRND200Test0.test138");
        org.apache.avro.Schema.Names names0 = new org.apache.avro.Schema.Names();
        java.lang.String str1 = names0.toString();
        org.apache.avro.Schema.Name name2 = null;
        org.apache.avro.NameValidator nameValidator3 = null;
        org.apache.avro.Schema.Parser parser4 = new org.apache.avro.Schema.Parser(nameValidator3);
        org.apache.avro.ParseContext parseContext5 = parser4.context;
        org.apache.avro.Schema.Parser parser7 = parser4.setValidateDefaults(false);
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema> schemaList8 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema>();
        org.apache.avro.Schema.Parser parser9 = parser7.addTypes((java.lang.Iterable<org.apache.avro.Schema>) schemaList8);
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList8);
        int int11 = schema10.computeHash();
        org.apache.avro.NameValidator nameValidator12 = null;
        org.apache.avro.Schema.Parser parser13 = new org.apache.avro.Schema.Parser(nameValidator12);
        org.apache.avro.ParseContext parseContext14 = parser13.context;
        org.apache.avro.Schema.Parser parser16 = parser13.setValidateDefaults(false);
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema> schemaList17 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema>();
        org.apache.avro.Schema.Parser parser18 = parser16.addTypes((java.lang.Iterable<org.apache.avro.Schema>) schemaList17);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList17);
        int int20 = schema19.computeHash();
        boolean boolean21 = names0.replace(name2, schema10, schema19);
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = schema19.getObjectProps();
        // The following exception was thrown during execution in test generation
        try {
            int int23 = schema19.getFixedSize();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not fixed: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNotNull(parseContext5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(schema10);
// flaky "4) test138(org.apache.avro.ISW2SchemaRND200Test0)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 522786291 + "'", int11 == 522786291);
        org.junit.Assert.assertNotNull(parseContext14);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(schema19);
// flaky "2) test138(org.apache.avro.ISW2SchemaRND200Test0)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 522786291 + "'", int20 == 522786291);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strMap22);
    }
}
