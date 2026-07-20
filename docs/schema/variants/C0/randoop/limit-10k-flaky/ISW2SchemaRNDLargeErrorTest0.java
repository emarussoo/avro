package org.apache.avro;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ISW2SchemaRNDLargeErrorTest0 {

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
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test001");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("", "", "hi!", false);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test002");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema9 = org.apache.avro.Schema.createEnum("", "hi!", "", (java.util.List<java.lang.String>) strList6, "");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test003");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createEnum("", "hi!", "hi!", (java.util.List<java.lang.String>) strList5);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test004");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("", "", "{}", true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test005");
        org.apache.avro.Schema.Names names0 = new org.apache.avro.Schema.Names();
        java.lang.String str1 = names0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema3 = names0.get("hi!");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test006");
        org.apache.avro.Schema.Field[] fieldArray4 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList5 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList5, fieldArray4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createRecord("hi!", "", "", false, (java.util.List<org.apache.avro.Schema.Field>) fieldList5);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test007");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema9 = org.apache.avro.Schema.createEnum("hi!", "{}", "", (java.util.List<java.lang.String>) strList7);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test008");
        org.apache.avro.Schema.Field[] fieldArray4 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList5 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList5, fieldArray4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createRecord("{}", "{}", "", true, (java.util.List<org.apache.avro.Schema.Field>) fieldList5);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test009");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema.Name name2 = new org.apache.avro.Schema.Name("", "{}");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test010");
        org.apache.avro.Schema.Names names0 = new org.apache.avro.Schema.Names();
        java.lang.String str1 = names0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema3 = names0.get("");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test011");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "{}", "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema9 = org.apache.avro.Schema.createEnum("hi!", "", "hi!", (java.util.List<java.lang.String>) strList7);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test012");
        org.apache.avro.Schema.Field[] fieldArray4 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList5 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList5, fieldArray4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createRecord("{}", "{}", "", false, (java.util.List<org.apache.avro.Schema.Field>) fieldList5);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test013");
        org.apache.avro.Schema.Field[] fieldArray4 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList5 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList5, fieldArray4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createRecord("", "{}", "hi!", true, (java.util.List<org.apache.avro.Schema.Field>) fieldList5);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test014");
        org.apache.avro.Schema.Field[] fieldArray4 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList5 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList5, fieldArray4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createRecord("[hi!]", "union[]", "union[]", false, (java.util.List<org.apache.avro.Schema.Field>) fieldList5);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test015");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{}", "{}", "union[]", 522786291);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test016");
        org.apache.avro.Schema.Names names0 = new org.apache.avro.Schema.Names();
        java.lang.String str1 = names0.toString();
        java.lang.String str2 = names0.toString();
        names0.clear();
        java.util.Set<org.apache.avro.Schema.Name> nameSet4 = names0.keySet();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema6 = names0.get("");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test017");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{}", "hi!", "", (int) (short) -1);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test018");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("bytes", "{}", "", (int) 'a');
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test019");
        org.apache.avro.Schema.Names names0 = new org.apache.avro.Schema.Names();
        java.lang.String str1 = names0.toString();
        java.lang.String str2 = names0.toString();
        names0.clear();
        java.util.Set<org.apache.avro.Schema.Name> nameSet4 = names0.keySet();
        boolean boolean5 = names0.isEmpty();
        java.util.Set<org.apache.avro.Schema.Name> nameSet6 = names0.keySet();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema8 = names0.get("array");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test020");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("[hi!]", "hi!", "[hi!]", true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test021");
        java.lang.String[] strArray9 = new java.lang.String[] { "", "[]", "union[]", "union[]", "{}", "[hi!]" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema12 = org.apache.avro.Schema.createEnum("bytes", "hi!", "", (java.util.List<java.lang.String>) strList10);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test022");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema.Name name2 = new org.apache.avro.Schema.Name("array", "");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test023");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("null", "bytes", "hi!", (-2147483648));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test024");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("", "", "null", true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test025");
        org.apache.avro.Schema.Field[] fieldArray4 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList5 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList5, fieldArray4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createRecord("", "null", "{}", false, (java.util.List<org.apache.avro.Schema.Field>) fieldList5);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test026");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("", "[]", "[]", 927646640);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test027");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("null", "{}", "array", (int) '4');
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test028");
        org.apache.avro.Schema.Field[] fieldArray4 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList5 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList5, fieldArray4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createRecord("{}", "fixed", "[hi!]", true, (java.util.List<org.apache.avro.Schema.Field>) fieldList5);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test029");
        java.lang.String[] strArray4 = new java.lang.String[] { "union[]" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createEnum("null", "null", "hi!", (java.util.List<java.lang.String>) strList5, "[]");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test030");
        java.lang.String[] strArray9 = new java.lang.String[] { "null", "union[]", "", "null", "{}", "[hi!]" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createEnum("null", "{}", "fixed", (java.util.List<java.lang.String>) strList10, "array");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test031");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema.Name name2 = new org.apache.avro.Schema.Name("hi!", "\"bytes\"");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test032");
        org.apache.avro.Schema.Field[] fieldArray4 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList5 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList5, fieldArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createRecord("fixed", "[hi!]", "", true, (java.util.List<org.apache.avro.Schema.Field>) fieldList5);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test033");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("hi!", "[]", "", 1);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test034");
        org.apache.avro.Schema.Field[] fieldArray4 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList5 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList5, fieldArray4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createRecord("array", "{}", "{}", true, (java.util.List<org.apache.avro.Schema.Field>) fieldList5);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test035");
        org.apache.avro.Schema.Names names0 = new org.apache.avro.Schema.Names();
        java.lang.String str1 = names0.toString();
        java.lang.String str2 = names0.toString();
        names0.clear();
        names0.clear();
        java.util.Collection<org.apache.avro.Schema> schemaCollection5 = names0.values();
        java.lang.Object obj6 = names0.clone();
        org.apache.avro.Schema.Name name7 = null;
        org.apache.avro.NameValidator nameValidator8 = null;
        org.apache.avro.Schema.Parser parser9 = new org.apache.avro.Schema.Parser(nameValidator8);
        org.apache.avro.ParseContext parseContext10 = parser9.context;
        org.apache.avro.Schema.Parser parser12 = parser9.setValidateDefaults(false);
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema> schemaList13 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema>();
        org.apache.avro.Schema.Parser parser14 = parser12.addTypes((java.lang.Iterable<org.apache.avro.Schema>) schemaList13);
        org.apache.avro.Schema schema15 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList13);
        int int16 = schema15.computeHash();
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createArray(schema15);
        org.apache.avro.LogicalType logicalType18 = schema17.getLogicalType();
        int int19 = schema17.computeHash();
        java.lang.Object obj21 = schema17.getObjectProp("union[]");
        org.apache.avro.Schema schema22 = names0.putIfAbsent(name7, schema17);
        org.apache.avro.NameValidator nameValidator23 = null;
        org.apache.avro.Schema.Parser parser24 = new org.apache.avro.Schema.Parser(nameValidator23);
        org.apache.avro.ParseContext parseContext25 = parser24.context;
        org.apache.avro.Schema.Parser parser27 = parser24.setValidateDefaults(false);
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema> schemaList28 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema>();
        org.apache.avro.Schema.Parser parser29 = parser27.addTypes((java.lang.Iterable<org.apache.avro.Schema>) schemaList28);
        org.apache.avro.Schema schema30 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList28);
        java.util.function.BiConsumer<java.lang.String, java.lang.Object> strBiConsumer31 = null;
        schema30.forEachProperty(strBiConsumer31);
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList34 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((int) (short) 0);
        boolean boolean35 = names0.remove((java.lang.Object) schema30, (java.lang.Object) (short) 0);
        schema30.hashCode = 927646640;
        java.util.List<org.apache.avro.Schema> schemaList38 = schema30.getTypes();
        org.apache.avro.Schema schema39 = org.apache.avro.Schema.createUnion(schemaList38);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on schema15, schema39, and schema30.", !(schema15.equals(schema39) && schema39.equals(schema30)) || schema15.equals(schema30));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test036");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema.Name name2 = new org.apache.avro.Schema.Name("union[]", "");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test037");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("bytes", "fixed", "{}", (int) (byte) -1);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test038");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema.Name name2 = new org.apache.avro.Schema.Name("[]", "[hi!]");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test039");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema.Name name2 = new org.apache.avro.Schema.Name("hi!", "bytes");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test040");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("\"string\"", "", "\"string\"", 522786291);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test041");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("\"bytes\"", "[ ]", "\"bytes\"", true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test042");
        java.lang.String[] strArray8 = new java.lang.String[] { "union[]", "[hi!]", "\"string\"", "\"string\"", "{\n  \"type\" : \"array\",\n  \"items\" : [ ]\n}" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema12 = org.apache.avro.Schema.createEnum("hi!", "hi!", "[]", (java.util.List<java.lang.String>) strList9, "{}");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test043");
        java.lang.String[] strArray7 = new java.lang.String[] { "[ ]", "[ ]", "{\n  \"type\" : \"map\",\n  \"values\" : [ ]\n}", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.createEnum("null", "[]", "\"bytes\"", (java.util.List<java.lang.String>) strList8);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test044");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema.Name name2 = new org.apache.avro.Schema.Name("\"bytes\"", "bytes");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test045");
        java.lang.String[] strArray17 = new java.lang.String[] { "bytes", "long", "long", "array", "long", "{\n  \"type\" : \"map\",\n  \"values\" : [ ]\n}", "[ ]", "null", "bytes", "hi!", "", "{}", "[hi!]", "fixed" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema21 = org.apache.avro.Schema.createEnum("\"bytes\"", "{\n  \"type\" : \"map\",\n  \"values\" : [ ]\n}", "{\n  \"type\" : \"array\",\n  \"items\" : [ ]\n}", (java.util.List<java.lang.String>) strList18, "\"string\"");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test046");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema.Name name2 = new org.apache.avro.Schema.Name("{\n  \"type\" : \"map\",\n  \"values\" : [ ]\n}", "");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test047");
        org.apache.avro.Schema.Field[] fieldArray4 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList5 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList5, fieldArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createRecord("bytes", "\"bytes\"", "bytes", false, (java.util.List<org.apache.avro.Schema.Field>) fieldList5);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test048");
        java.lang.String[] strArray11 = new java.lang.String[] { "union[]", "union[]", "hi!", "\"string\"", "{}", "[hi!]", "long", "\"string\"" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema14 = org.apache.avro.Schema.createEnum("{\n  \"type\" : \"map\",\n  \"values\" : [ ]\n}", "long", "{\n  \"type\" : \"array\",\n  \"items\" : [ ]\n}", (java.util.List<java.lang.String>) strList12);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test049");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("", "\"bytes\"", "boolean", false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test050");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema.Name name2 = new org.apache.avro.Schema.Name("\"string\"", "null");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test051");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema.Name name2 = new org.apache.avro.Schema.Name("bytes", "boolean");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test052");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("", "bytes", "\"string\"", (int) (byte) 100);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test053");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema.Name name2 = new org.apache.avro.Schema.Name("{\n  \"type\" : \"array\",\n  \"items\" : [ ]\n}", "float");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test054");
        java.lang.String[] strArray12 = new java.lang.String[] { "union[]", "{}", "\"string\"", "", "fixed", "hi!", "long", "long", "boolean" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema15 = org.apache.avro.Schema.createEnum("union[]", "{}", "", (java.util.List<java.lang.String>) strList13);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test055");
        org.apache.avro.Schema.Names names0 = new org.apache.avro.Schema.Names();
        java.lang.String str1 = names0.toString();
        java.lang.String str2 = names0.toString();
        names0.clear();
        names0.clear();
        java.util.Map<java.lang.String, org.apache.avro.Schema.Type> strMap5 = org.apache.avro.Schema.PRIMITIVES;
        boolean boolean6 = names0.containsValue((java.lang.Object) strMap5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema8 = names0.get("hi!");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test056");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\n  \"type\" : \"array\",\n  \"items\" : [ ]\n}", "{\n  \"type\" : \"map\",\n  \"values\" : [ ]\n}", "boolean", false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test057");
        java.lang.String[] strArray5 = new java.lang.String[] { "[ ]", "" };
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList6 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>(strArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createEnum("[hi!]", "[hi!]", "{\n  \"type\" : \"array\",\n  \"items\" : [ ]\n}", (java.util.List<java.lang.String>) strList6, "");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test058");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("fixed", "\"string\"", "long", (int) ' ');
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test059");
        org.apache.avro.Schema[] schemaArray1 = new org.apache.avro.Schema[] {};
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.createUnion(schemaArray1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema.Field field4 = new org.apache.avro.Schema.Field("{\n  \"type\" : \"array\",\n  \"items\" : [ ]\n}", schema2, "fixed");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test060");
        java.lang.String[] strArray7 = new java.lang.String[] { "\"string\"", "[]", "null", "[hi!]" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema11 = org.apache.avro.Schema.createEnum("long", "{}", "long", (java.util.List<java.lang.String>) strList8, "");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test061");
        java.lang.String[] strArray5 = new java.lang.String[] { "[ ]", "" };
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList6 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>(strArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createEnum("float", "", "boolean", (java.util.List<java.lang.String>) strList6);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test062");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema.Name name2 = new org.apache.avro.Schema.Name("{\n  \"type\" : \"array\",\n  \"items\" : [ ]\n}", "[ ]");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test063");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "float", "bytes", "[hi!]", "fixed" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema11 = org.apache.avro.Schema.createEnum("[ ]", "[ ]", "union[]", (java.util.List<java.lang.String>) strList9);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test064");
        org.apache.avro.Schema.Field[] fieldArray4 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList5 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList5, fieldArray4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createRecord("", "\"bytes\"", "null", true, (java.util.List<org.apache.avro.Schema.Field>) fieldList5);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test065");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("long", "fixed", "[hi!]", (int) 'a');
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test066");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema.Name name2 = new org.apache.avro.Schema.Name("hi!", "long");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test067");
        java.lang.String[] strArray20 = new java.lang.String[] { "\"string\"", "float", "fixed", "float", "{}", "{\n  \"type\" : \"array\",\n  \"items\" : [ ]\n}", "\"string\"", "{}", "bytes", "[hi!]", "fixed", "null", "fixed", "", "[]", "fixed", "[ ]" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema23 = org.apache.avro.Schema.createEnum("[]", "hi!", "", (java.util.List<java.lang.String>) strList21);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test068");
        org.apache.avro.Schema.Field[] fieldArray4 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList5 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList5, fieldArray4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createRecord("bytes", "{\n  \"type\" : \"array\",\n  \"items\" : [ ]\n}", "long", false, (java.util.List<org.apache.avro.Schema.Field>) fieldList5);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test069");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("bytes", "[hi!]", "{}", 1);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test070");
        org.apache.avro.Schema.Field[] fieldArray4 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList5 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList5, fieldArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createRecord("{}", "hi!", "[ ]", true, (java.util.List<org.apache.avro.Schema.Field>) fieldList5);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test071");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("", "array", "", (int) 'a');
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test072");
        java.lang.String[] strArray13 = new java.lang.String[] { "\"string\"", "boolean", "{}", "[]", "array", "long", "\"string\"", "\"string\"", "bytes", "[]" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createEnum("{}", "array", "[hi!]", (java.util.List<java.lang.String>) strList14, "{\n  \"type\" : \"array\",\n  \"items\" : [ ]\n}");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test073");
        org.apache.avro.Schema.Field[] fieldArray4 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList5 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList5, fieldArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createRecord("", "bytes", "\"string\"", true, (java.util.List<org.apache.avro.Schema.Field>) fieldList5);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test074");
        org.apache.avro.Schema.Field[] fieldArray4 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList5 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList5, fieldArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createRecord("float", "", "int", true, (java.util.List<org.apache.avro.Schema.Field>) fieldList5);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test075");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\n  \"type\" : \"array\",\n  \"items\" : [ ]\n}", "bytes", "union[]", 2);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test076");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("array", "bytes", "fixed", true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test077");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema.Name name2 = new org.apache.avro.Schema.Name("bytes", "long");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test078");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema.Name name2 = new org.apache.avro.Schema.Name("boolean", "");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test079");
        java.lang.String[] strArray5 = new java.lang.String[] { "[ ]", "" };
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList6 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>(strArray5);
        org.apache.avro.Schema.Names names7 = new org.apache.avro.Schema.Names();
        java.lang.String str8 = names7.toString();
        org.apache.avro.Schema.Type type9 = org.apache.avro.Schema.Type.BYTES;
        boolean boolean10 = names7.equals((java.lang.Object) type9);
        org.apache.avro.Schema.SeenPair seenPair11 = new org.apache.avro.Schema.SeenPair((java.lang.Object) strList6, (java.lang.Object) names7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createEnum("long", "{\n  \"type\" : \"array\",\n  \"items\" : [ ]\n}", "", (java.util.List<java.lang.String>) strList6, "int");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test080");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("union[]", "\"string\"", "int", false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test081");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\n  \"type\" : \"array\",\n  \"items\" : [ ]\n}", "[]", "long", true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test082");
        java.lang.String[] strArray5 = new java.lang.String[] { "[ ]", "" };
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList6 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>(strArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createEnum("", "", "fixed", (java.util.List<java.lang.String>) strList6, "long");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test083");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema.Name name2 = new org.apache.avro.Schema.Name("{}", "[ ]");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test084");
        java.lang.String[] strArray9 = new java.lang.String[] { "[]", "[hi!]", "int", "int", "bytes", "[hi!]" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createEnum("long", "{\n  \"type\" : \"array\",\n  \"items\" : [ ]\n}", "{\n  \"type\" : \"map\",\n  \"values\" : [ ]\n}", (java.util.List<java.lang.String>) strList10, "boolean");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test085");
        org.apache.avro.Schema.Field[] fieldArray4 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList5 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList5, fieldArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createRecord("long", "[]", "\"string\"", false, (java.util.List<org.apache.avro.Schema.Field>) fieldList5);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test086");
        java.lang.String[] strArray5 = new java.lang.String[] { "[ ]", "" };
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList6 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>(strArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createEnum("long", "{}", "fixed", (java.util.List<java.lang.String>) strList6, "[hi!]");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test087");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\n  \"type\" : \"map\",\n  \"values\" : [ ]\n}", "", "{\"type\":\"array\",\"items\":[]}", true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test088");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("", "array", "{\n  \"type\" : \"array\",\n  \"items\" : [ ]\n}", false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test089");
        org.apache.avro.Schema.Field[] fieldArray4 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList5 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList5, fieldArray4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createRecord("", "{\n  \"type\" : \"array\",\n  \"items\" : [ ]\n}", "float", false, (java.util.List<org.apache.avro.Schema.Field>) fieldList5);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test090");
        org.apache.avro.Schema.Field[] fieldArray4 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList5 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList5, fieldArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createRecord("", "[ ]", "{\n  \"type\" : \"map\",\n  \"values\" : [ ]\n}", true, (java.util.List<org.apache.avro.Schema.Field>) fieldList5);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test091");
        org.apache.avro.Schema.Field[] fieldArray4 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList5 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList5, fieldArray4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createRecord("", "{}", "", true, (java.util.List<org.apache.avro.Schema.Field>) fieldList5);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test092");
        java.lang.String[] strArray5 = new java.lang.String[] { "[ ]", "" };
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList6 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>(strArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createEnum("[]", "bytes", "", (java.util.List<java.lang.String>) strList6);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test093");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("", "[hi!]", "[ ]", true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test094");
        org.apache.avro.Schema.Names names0 = new org.apache.avro.Schema.Names();
        java.lang.String str1 = names0.toString();
        java.lang.String str2 = names0.toString();
        names0.clear();
        names0.clear();
        java.util.Collection<org.apache.avro.Schema> schemaCollection5 = names0.values();
        java.lang.Object obj6 = names0.clone();
        org.apache.avro.Schema.Name name7 = null;
        org.apache.avro.NameValidator nameValidator8 = null;
        org.apache.avro.Schema.Parser parser9 = new org.apache.avro.Schema.Parser(nameValidator8);
        org.apache.avro.ParseContext parseContext10 = parser9.context;
        org.apache.avro.Schema.Parser parser12 = parser9.setValidateDefaults(false);
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema> schemaList13 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema>();
        org.apache.avro.Schema.Parser parser14 = parser12.addTypes((java.lang.Iterable<org.apache.avro.Schema>) schemaList13);
        org.apache.avro.Schema schema15 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList13);
        int int16 = schema15.computeHash();
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createArray(schema15);
        org.apache.avro.LogicalType logicalType18 = schema17.getLogicalType();
        int int19 = schema17.computeHash();
        java.lang.Object obj21 = schema17.getObjectProp("union[]");
        org.apache.avro.Schema schema22 = names0.putIfAbsent(name7, schema17);
        org.apache.avro.NameValidator nameValidator23 = null;
        org.apache.avro.Schema.Parser parser24 = new org.apache.avro.Schema.Parser(nameValidator23);
        org.apache.avro.ParseContext parseContext25 = parser24.context;
        org.apache.avro.Schema.Parser parser27 = parser24.setValidateDefaults(false);
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema> schemaList28 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema>();
        org.apache.avro.Schema.Parser parser29 = parser27.addTypes((java.lang.Iterable<org.apache.avro.Schema>) schemaList28);
        org.apache.avro.Schema schema30 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList28);
        java.util.function.BiConsumer<java.lang.String, java.lang.Object> strBiConsumer31 = null;
        schema30.forEachProperty(strBiConsumer31);
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList34 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((int) (short) 0);
        boolean boolean35 = names0.remove((java.lang.Object) schema30, (java.lang.Object) (short) 0);
        schema30.hashCode = 927646640;
        java.util.List<org.apache.avro.Schema> schemaList38 = schema30.getTypes();
        java.util.function.BiConsumer<java.lang.String, java.lang.Object> strBiConsumer39 = null;
        schema30.forEachProperty(strBiConsumer39);
        java.util.List<org.apache.avro.Schema> schemaList41 = schema30.getTypes();
        org.apache.avro.Schema schema42 = org.apache.avro.Schema.createUnion(schemaList41);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on schema15, schema42, and schema30.", !(schema15.equals(schema42) && schema42.equals(schema30)) || schema15.equals(schema30));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test095");
        org.apache.avro.Schema.Names names0 = new org.apache.avro.Schema.Names();
        java.lang.String str1 = names0.toString();
        org.apache.avro.Schema.Type type2 = org.apache.avro.Schema.Type.BYTES;
        boolean boolean3 = names0.equals((java.lang.Object) type2);
        org.apache.avro.Schema schema5 = names0.get((java.lang.Object) 1);
        java.util.Set<org.apache.avro.Schema.Name> nameSet6 = names0.keySet();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList8 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((int) (short) 0);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList10 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean11 = strComparableList10.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableList10.iterator();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList14 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean15 = strComparableList14.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor16 = strComparableList14.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList17 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((java.util.List<java.lang.Comparable<java.lang.String>>) strComparableList14);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList19 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean20 = strComparableList19.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor21 = strComparableList19.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList22 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((java.util.List<java.lang.Comparable<java.lang.String>>) strComparableList19);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList24 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean25 = strComparableList24.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor26 = strComparableList24.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList28 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((int) (short) 0);
        java.lang.Cloneable[] cloneableArray29 = new java.lang.Cloneable[] { strComparableList10, strComparableList17, strComparableList22, strComparableList24, strComparableList28 };
        java.lang.Cloneable[] cloneableArray30 = strComparableList8.toArray(cloneableArray29);
        java.lang.Object obj31 = strComparableList8.clone();
        strComparableList8.trimToSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator33 = strComparableList8.spliterator();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList35 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean36 = strComparableList35.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor37 = strComparableList35.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList38 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((java.util.List<java.lang.Comparable<java.lang.String>>) strComparableList35);
        strComparableList35.trimToSize();
        boolean boolean40 = strComparableList8.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList35);
        java.util.List<java.lang.Comparable<java.lang.String>> strComparableList41 = strComparableList8.lock();
        boolean boolean42 = names0.equals((java.lang.Object) strComparableList8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema44 = names0.get("\"bytes\"");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test096");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\n  \"type\" : \"map\",\n  \"values\" : [ ]\n}", "union", "[hi!]", false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test097");
        java.lang.String[] strArray5 = new java.lang.String[] { "[ ]", "" };
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList6 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>(strArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createEnum("int", "array", "[ ]", (java.util.List<java.lang.String>) strList6, "int");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test098");
        java.lang.String[] strArray12 = new java.lang.String[] { "array", "float", "{\n  \"type\" : \"array\",\n  \"items\" : [ ]\n}", "null", "\"bytes\"", "array", "bytes", "", "array" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema16 = org.apache.avro.Schema.createEnum("{\n  \"type\" : \"map\",\n  \"values\" : [ ]\n}", "[ ]", "float", (java.util.List<java.lang.String>) strList13, "union");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test099");
        org.apache.avro.Schema.Field[] fieldArray4 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList5 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList5, fieldArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema9 = org.apache.avro.Schema.createRecord("[ ]", "float", "null", true, (java.util.List<org.apache.avro.Schema.Field>) fieldList5);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test100");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema.Name name2 = new org.apache.avro.Schema.Name("{}", "null");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test101");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema.Name name2 = new org.apache.avro.Schema.Name("{\"type\":\"array\",\"items\":[]}", "\"bytes\"");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test102");
        org.apache.avro.Schema.Field[] fieldArray4 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList5 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList5, fieldArray4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createRecord("bytes", "int", "hi!", true, (java.util.List<org.apache.avro.Schema.Field>) fieldList5);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test103");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"array\",\"items\":[]}", "[hi!]", "null", (int) (byte) -1);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test104");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("[ ]", "", "\"bytes\"", false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test105");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("", "[ ]", "\"string\"", true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test106");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\"type\":\"array\",\"items\":[]}", "", "[]", true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test107");
        java.lang.String[] strArray5 = new java.lang.String[] { "[ ]", "" };
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList6 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>(strArray5);
        org.apache.avro.Schema.Names names7 = new org.apache.avro.Schema.Names();
        java.lang.String str8 = names7.toString();
        org.apache.avro.Schema.Type type9 = org.apache.avro.Schema.Type.BYTES;
        boolean boolean10 = names7.equals((java.lang.Object) type9);
        org.apache.avro.Schema.SeenPair seenPair11 = new org.apache.avro.Schema.SeenPair((java.lang.Object) strList6, (java.lang.Object) names7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createEnum("", "long", "hi!", (java.util.List<java.lang.String>) strList6, "null");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test108");
        org.apache.avro.Schema.Field[] fieldArray4 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList5 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList5, fieldArray4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createRecord("union[]", "union", "map", false, (java.util.List<org.apache.avro.Schema.Field>) fieldList5);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test109");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("float", "[ ]", "hi!", true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test110");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("map", "[ ]", "{\n  \"type\" : \"array\",\n  \"items\" : [ ]\n}", (int) (byte) 1);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test111");
        org.apache.avro.NameValidator nameValidator0 = null;
        org.apache.avro.Schema.Parser parser1 = new org.apache.avro.Schema.Parser(nameValidator0);
        org.apache.avro.ParseContext parseContext2 = parser1.context;
        org.apache.avro.Schema.Parser parser4 = parser1.setValidateDefaults(false);
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema> schemaList5 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema>();
        org.apache.avro.Schema.Parser parser6 = parser4.addTypes((java.lang.Iterable<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        java.util.function.BiConsumer<java.lang.String, java.lang.Object> strBiConsumer8 = null;
        schema7.forEachProperty(strBiConsumer8);
        boolean boolean10 = schema7.isUnion();
        boolean boolean11 = schema7.isUnion();
        java.util.List<org.apache.avro.Schema> schemaList12 = schema7.getTypes();
        org.apache.avro.Schema.Names names13 = new org.apache.avro.Schema.Names();
        java.lang.String str14 = names13.toString();
        java.lang.String str15 = names13.toString();
        names13.clear();
        names13.clear();
        java.util.Collection<org.apache.avro.Schema> schemaCollection18 = names13.values();
        java.lang.Object obj19 = names13.clone();
        org.apache.avro.Schema.Name name20 = null;
        org.apache.avro.NameValidator nameValidator21 = null;
        org.apache.avro.Schema.Parser parser22 = new org.apache.avro.Schema.Parser(nameValidator21);
        org.apache.avro.ParseContext parseContext23 = parser22.context;
        org.apache.avro.Schema.Parser parser25 = parser22.setValidateDefaults(false);
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema> schemaList26 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema>();
        org.apache.avro.Schema.Parser parser27 = parser25.addTypes((java.lang.Iterable<org.apache.avro.Schema>) schemaList26);
        org.apache.avro.Schema schema28 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList26);
        int int29 = schema28.computeHash();
        org.apache.avro.Schema schema30 = org.apache.avro.Schema.createArray(schema28);
        org.apache.avro.LogicalType logicalType31 = schema30.getLogicalType();
        int int32 = schema30.computeHash();
        java.lang.Object obj34 = schema30.getObjectProp("union[]");
        org.apache.avro.Schema schema35 = names13.putIfAbsent(name20, schema30);
        org.apache.avro.NameValidator nameValidator36 = null;
        org.apache.avro.Schema.Parser parser37 = new org.apache.avro.Schema.Parser(nameValidator36);
        org.apache.avro.ParseContext parseContext38 = parser37.context;
        org.apache.avro.Schema.Parser parser40 = parser37.setValidateDefaults(false);
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema> schemaList41 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema>();
        org.apache.avro.Schema.Parser parser42 = parser40.addTypes((java.lang.Iterable<org.apache.avro.Schema>) schemaList41);
        org.apache.avro.Schema schema43 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList41);
        int int44 = schema43.computeHash();
        org.apache.avro.Schema schema45 = org.apache.avro.Schema.createArray(schema43);
        java.lang.Object obj47 = schema43.getObjectProp("");
        schema30.addAllProps((org.apache.avro.JsonProperties) schema43);
        java.lang.Object obj50 = schema30.getObjectProp("");
        org.apache.avro.NameValidator nameValidator51 = null;
        org.apache.avro.Schema.Parser parser52 = new org.apache.avro.Schema.Parser(nameValidator51);
        org.apache.avro.ParseContext parseContext53 = parser52.context;
        org.apache.avro.Schema.Parser parser55 = parser52.setValidateDefaults(false);
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema> schemaList56 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema>();
        org.apache.avro.Schema.Parser parser57 = parser55.addTypes((java.lang.Iterable<org.apache.avro.Schema>) schemaList56);
        org.apache.avro.Schema schema58 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList56);
        int int59 = schema58.computeHash();
        org.apache.avro.Schema schema60 = org.apache.avro.Schema.createArray(schema58);
        org.apache.avro.LogicalType logicalType61 = schema60.getLogicalType();
        int int62 = schema60.computeHash();
        boolean boolean63 = schema60.hasProps();
        org.apache.avro.Schema schema64 = org.apache.avro.Schema.createArray(schema60);
        org.apache.avro.LogicalType logicalType65 = schema60.getLogicalType();
        com.fasterxml.jackson.databind.JsonNode jsonNode67 = org.apache.avro.Schema.parseJson("{}");
        java.util.Set<java.lang.String> strSet68 = org.apache.avro.Schema.parseAliases(jsonNode67);
        boolean boolean69 = schema60.isValidDefault(jsonNode67);
        boolean boolean70 = schema30.isValidDefault(jsonNode67);
        boolean boolean71 = schema7.isValidDefault(jsonNode67);
        schema7.hashCode = '#';
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on schema7 and schema43", schema7.equals(schema43) ? schema7.hashCode() == schema43.hashCode() : true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test112");
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.parse("\"string\"", false);
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = org.apache.avro.Schema.parseJson("{}");
        java.util.Set<java.lang.String> strSet7 = org.apache.avro.Schema.parseAliases(jsonNode6);
        java.util.Set<java.lang.String> strSet8 = org.apache.avro.Schema.parseAliases(jsonNode6);
        java.util.Set<java.lang.String> strSet9 = org.apache.avro.Schema.parseAliases(jsonNode6);
        org.apache.avro.Schema.Field.Order order11 = org.apache.avro.Schema.Field.Order.IGNORE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema.Field field12 = new org.apache.avro.Schema.Field("{\"type\":\"string\",\"[hi!]\":1}", schema3, "hi!", jsonNode6, false, order11);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test113");
        java.lang.String[] strArray5 = new java.lang.String[] { "[ ]", "" };
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList6 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>(strArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createEnum("[hi!]", "bytes", "{\"type\":\"string\",\"[hi!]\":1}", (java.util.List<java.lang.String>) strList6, "{\n  \"type\" : \"array\",\n  \"items\" : [ ]\n}");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test114");
        java.lang.String[] strArray5 = new java.lang.String[] { "[ ]", "" };
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList6 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>(strArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createEnum("{\n  \"type\" : \"string\",\n  \"[hi!]\" : 1\n}", "fixed", "", (java.util.List<java.lang.String>) strList6, "\"string\"");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test115");
        org.apache.avro.Schema.Names names0 = new org.apache.avro.Schema.Names();
        java.lang.String str1 = names0.toString();
        java.lang.String str2 = names0.toString();
        names0.clear();
        java.util.Set<org.apache.avro.Schema.Name> nameSet4 = names0.keySet();
        boolean boolean5 = names0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema7 = names0.get("\"bytes\"");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test116");
        java.lang.String[] strArray19 = new java.lang.String[] { "\"bytes\"", "boolean", "{\n  \"type\" : \"map\",\n  \"values\" : [ ]\n}", "[ ]", "[]", "{\"type\":\"array\",\"items\":[]}", "\"bytes\"", "{\n  \"type\" : \"string\",\n  \"[hi!]\" : 1\n}", "{}", "[ ]", "{\n  \"type\" : \"string\",\n  \"[hi!]\" : 1\n}", "hi!", "{}", "union[]", "hi!", "null" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema23 = org.apache.avro.Schema.createEnum("\"string\"", "{\n  \"type\" : \"map\",\n  \"values\" : [ ]\n}", "[]", (java.util.List<java.lang.String>) strList20, "");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test117");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("hi!", "union", "{\n  \"type\" : \"array\",\n  \"items\" : [ ]\n}", 0);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test118");
        java.lang.String[] strArray5 = new java.lang.String[] { "[ ]", "" };
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList6 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>(strArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createEnum("[ ]", "", "", (java.util.List<java.lang.String>) strList6);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test119");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("\"bytes\"", "{\n  \"type\" : \"map\",\n  \"values\" : [ ]\n}", "{\n  \"type\" : \"array\",\n  \"items\" : [ ]\n}", false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test120");
        java.lang.String[] strArray5 = new java.lang.String[] { "[ ]", "" };
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList6 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>(strArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createEnum("{\"type\":\"array\",\"items\":[]}", "[ ]", "{\n  \"type\" : \"string\",\n  \"[hi!]\" : 1\n}", (java.util.List<java.lang.String>) strList6);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test121");
        java.lang.String[] strArray6 = new java.lang.String[] { "int", "", "union[]" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema9 = org.apache.avro.Schema.createEnum("boolean", "hi!", "fixed", (java.util.List<java.lang.String>) strList7);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test122");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("array", "[hi!]", "\"string\"", (-2147483648));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test123");
        org.apache.avro.Schema.Field[] fieldArray4 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList5 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList5, fieldArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList5);
        org.apache.avro.Schema schema9 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList5);
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema11 = org.apache.avro.Schema.createRecord("bytes", "[ ]", "", true, (java.util.List<org.apache.avro.Schema.Field>) fieldList5);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test124");
        org.apache.avro.Schema.Field[] fieldArray4 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList5 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList5, fieldArray4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createRecord("float", "", "\"bytes\"", false, (java.util.List<org.apache.avro.Schema.Field>) fieldList5);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test125");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("boolean", "", "fixed", 100);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test126");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema.Name name2 = new org.apache.avro.Schema.Name("", "{\"type\":\"array\",\"items\":[]}");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test127");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("", "", "map", true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test128");
        org.apache.avro.Schema.Field[] fieldArray4 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList5 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList5, fieldArray4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createRecord("{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":[],\"bytes\":10}}", "{\n  \"type\" : \"string\",\n  \"[hi!]\" : 1\n}", "long", false, (java.util.List<org.apache.avro.Schema.Field>) fieldList5);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test129");
        org.apache.avro.Schema.Field[] fieldArray4 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList5 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList5, fieldArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createRecord("null", "{\"type\":\"string\",\"[hi!]\":1}", "{\"type\":\"array\",\"items\":[]}", false, (java.util.List<org.apache.avro.Schema.Field>) fieldList5);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test130");
        org.apache.avro.Schema.Type type1 = org.apache.avro.Schema.Type.NULL;
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type1);
        java.lang.String str3 = schema2.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema.Field field4 = new org.apache.avro.Schema.Field("union", schema2);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test131");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("[hi!]", "bytes", "[]", (-1));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test132");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("fixed", "\"string\"", "{\n  \"type\" : \"string\",\n  \"[hi!]\" : 1\n}", false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test133");
        org.apache.avro.Schema.Field[] fieldArray4 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList5 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList5, fieldArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createRecord("{null={\"type\":\"array\",\"items\":[]}}", "array", "", true, (java.util.List<org.apache.avro.Schema.Field>) fieldList5);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test134");
        org.apache.avro.Schema.Names names0 = new org.apache.avro.Schema.Names();
        java.lang.String str1 = names0.toString();
        java.lang.String str2 = names0.toString();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((int) (short) 0);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList6 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean7 = strComparableList6.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableList6.iterator();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList10 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean11 = strComparableList10.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableList10.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList13 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((java.util.List<java.lang.Comparable<java.lang.String>>) strComparableList10);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList15 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean16 = strComparableList15.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor17 = strComparableList15.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList18 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((java.util.List<java.lang.Comparable<java.lang.String>>) strComparableList15);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList20 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean21 = strComparableList20.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor22 = strComparableList20.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList24 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((int) (short) 0);
        java.lang.Cloneable[] cloneableArray25 = new java.lang.Cloneable[] { strComparableList6, strComparableList13, strComparableList18, strComparableList20, strComparableList24 };
        java.lang.Cloneable[] cloneableArray26 = strComparableList4.toArray(cloneableArray25);
        boolean boolean28 = names0.remove((java.lang.Object) cloneableArray26, (java.lang.Object) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema30 = names0.get("array");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test135");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema.Name name2 = new org.apache.avro.Schema.Name("{\"type\":\"array\",\"items\":[]}", "{\n  \"type\" : \"array\",\n  \"items\" : [ ]\n}");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test136");
        org.apache.avro.Schema.Names names0 = new org.apache.avro.Schema.Names();
        java.lang.String str1 = names0.toString();
        java.lang.String str2 = names0.toString();
        names0.clear();
        names0.clear();
        java.lang.String str5 = names0.space();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema7 = names0.get("array");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test137");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("bytes", "int", "fixed", true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test138");
        java.lang.String[] strArray5 = new java.lang.String[] { "[ ]", "" };
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList6 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>(strArray5);
        org.apache.avro.Schema.Names names7 = new org.apache.avro.Schema.Names();
        java.lang.String str8 = names7.toString();
        org.apache.avro.Schema.Type type9 = org.apache.avro.Schema.Type.BYTES;
        boolean boolean10 = names7.equals((java.lang.Object) type9);
        org.apache.avro.Schema.SeenPair seenPair11 = new org.apache.avro.Schema.SeenPair((java.lang.Object) strList6, (java.lang.Object) names7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema12 = org.apache.avro.Schema.createEnum("", "[{\"type\":\"map\",\"values\":[],\"union[]\":[],\"[hi!]\":\"array\"}]", "fixed", (java.util.List<java.lang.String>) strList6);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test139");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("null", "union[]", "string", 0);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test140");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema.Name name2 = new org.apache.avro.Schema.Name("{\n  \"type\" : \"array\",\n  \"items\" : [ ]\n}", "string");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test141");
        org.apache.avro.Schema.Field[] fieldArray4 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList5 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList5, fieldArray4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createRecord("int", "[hi!]", "[hi!]", false, (java.util.List<org.apache.avro.Schema.Field>) fieldList5);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test142");
        java.lang.String[] strArray5 = new java.lang.String[] { "{\"type\":\"string\",\"[hi!]\":1}", "{\"type\":\"map\",\"values\":[]}" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createEnum("\"bytes\"", "[]", "{\n  \"type\" : \"string\",\n  \"[hi!]\" : 1\n}", (java.util.List<java.lang.String>) strList6);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test143");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("[ ]", "array", "[]", false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test144");
        org.apache.avro.Schema.Type type1 = org.apache.avro.Schema.Type.STRING;
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type1);
        org.apache.avro.Schema.LockableArrayList<java.lang.Class<?>> wildcardClassList5 = new org.apache.avro.Schema.LockableArrayList<java.lang.Class<?>>(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema.Field field6 = new org.apache.avro.Schema.Field("{\n  \"type\" : \"string\",\n  \"[hi!]\" : 1\n}", schema2, "union[]", (java.lang.Object) wildcardClassList5);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test145");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema.Name name2 = new org.apache.avro.Schema.Name("", "float");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test146");
        java.lang.String[] strArray5 = new java.lang.String[] { "[ ]", "" };
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList6 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>(strArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createEnum("map", "bytes", "long", (java.util.List<java.lang.String>) strList6, "{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":[],\"bytes\":10}}");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test147");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{}", "hi!", "", 2062003649);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test148");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("\"string\"", "{\n  \"type\" : \"array\",\n  \"items\" : [ ]\n}", "[hi!]", false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test149");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("\"bytes\"", "array", "union", 0);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test150");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema.Name name2 = new org.apache.avro.Schema.Name("enum", "{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":[],\"bytes\":10}}");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test151");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema.Name name2 = new org.apache.avro.Schema.Name("{\"type\":\"map\",\"values\":[],\"union[]\":[],\"[hi!]\":\"array\"}", "hi!");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test152");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("", "{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":[],\"bytes\":10}}", "\"string\"", false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test153");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("union[]", "", "bytes", false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test154");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"array\",\"items\":[]}", "enum", "", (int) (short) 100);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test155");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{}", "\"string\"", "{\n  \"type\" : \"array\",\n  \"items\" : [ ]\n}", 1911361158);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test156");
        java.lang.String[] strArray5 = new java.lang.String[] { "[ ]", "" };
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList6 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>(strArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createEnum("union[]", "null", "{\"type\":\"map\",\"values\":[],\"union[]\":[],\"[hi!]\":\"array\"}", (java.util.List<java.lang.String>) strList6);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test157");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("union", "{null={\"type\":\"array\",\"items\":[]}}", "bytes", false);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test158");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("fixed");
        org.apache.avro.NameValidator nameValidator2 = null;
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser(nameValidator2);
        org.apache.avro.ParseContext parseContext4 = parser3.context;
        org.apache.avro.Schema.Parser parser6 = parser3.setValidateDefaults(false);
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema> schemaList7 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema>();
        org.apache.avro.Schema.Parser parser8 = parser6.addTypes((java.lang.Iterable<org.apache.avro.Schema>) schemaList7);
        org.apache.avro.Schema schema9 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList7);
        int int10 = schema9.computeHash();
        org.apache.avro.Schema schema11 = org.apache.avro.Schema.createArray(schema9);
        schema11.hashCode = 0;
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = org.apache.avro.Schema.parseJson("[ ]");
        boolean boolean16 = schema11.isValidDefault(jsonNode15);
        boolean boolean17 = names1.equals((java.lang.Object) schema11);
        org.apache.avro.NameValidator nameValidator18 = null;
        org.apache.avro.Schema.Parser parser19 = new org.apache.avro.Schema.Parser(nameValidator18);
        org.apache.avro.ParseContext parseContext20 = parser19.context;
        org.apache.avro.Schema.Parser parser22 = parser19.setValidateDefaults(false);
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema> schemaList23 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema>();
        org.apache.avro.Schema.Parser parser24 = parser22.addTypes((java.lang.Iterable<org.apache.avro.Schema>) schemaList23);
        org.apache.avro.Schema schema25 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList23);
        int int26 = schema25.computeHash();
        org.apache.avro.Schema schema27 = org.apache.avro.Schema.createArray(schema25);
        java.lang.Object obj29 = schema25.getObjectProp("");
        org.apache.avro.NameValidator nameValidator30 = null;
        org.apache.avro.Schema.Parser parser31 = new org.apache.avro.Schema.Parser(nameValidator30);
        org.apache.avro.ParseContext parseContext32 = parser31.context;
        org.apache.avro.Schema.Parser parser34 = parser31.setValidateDefaults(false);
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema> schemaList35 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema>();
        org.apache.avro.Schema.Parser parser36 = parser34.addTypes((java.lang.Iterable<org.apache.avro.Schema>) schemaList35);
        org.apache.avro.Schema schema37 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList35);
        int int38 = schema37.computeHash();
        schema25.putAll((org.apache.avro.JsonProperties) schema37);
        org.apache.avro.Schema schema40 = org.apache.avro.Schema.applyAliases(schema11, schema37);
        org.apache.avro.Schema.Names names41 = new org.apache.avro.Schema.Names();
        java.lang.String str42 = names41.toString();
        org.apache.avro.Schema.Name name43 = null;
        org.apache.avro.NameValidator nameValidator44 = null;
        org.apache.avro.Schema.Parser parser45 = new org.apache.avro.Schema.Parser(nameValidator44);
        org.apache.avro.ParseContext parseContext46 = parser45.context;
        org.apache.avro.Schema.Parser parser48 = parser45.setValidateDefaults(false);
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema> schemaList49 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema>();
        org.apache.avro.Schema.Parser parser50 = parser48.addTypes((java.lang.Iterable<org.apache.avro.Schema>) schemaList49);
        org.apache.avro.Schema schema51 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList49);
        int int52 = schema51.computeHash();
        org.apache.avro.NameValidator nameValidator53 = null;
        org.apache.avro.Schema.Parser parser54 = new org.apache.avro.Schema.Parser(nameValidator53);
        org.apache.avro.ParseContext parseContext55 = parser54.context;
        org.apache.avro.Schema.Parser parser57 = parser54.setValidateDefaults(false);
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema> schemaList58 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema>();
        org.apache.avro.Schema.Parser parser59 = parser57.addTypes((java.lang.Iterable<org.apache.avro.Schema>) schemaList58);
        org.apache.avro.Schema schema60 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList58);
        int int61 = schema60.computeHash();
        boolean boolean62 = names41.replace(name43, schema51, schema60);
        java.util.Map<java.lang.String, java.lang.Object> strMap63 = schema60.getObjectProps();
        java.lang.Integer int65 = schema60.getIndexNamed("union[]");
        java.lang.Object obj66 = schema60.writeReplace();
        org.apache.avro.Schema.Type type67 = schema60.getType();
        org.apache.avro.NameValidator nameValidator68 = null;
        org.apache.avro.Schema.Parser parser69 = new org.apache.avro.Schema.Parser(nameValidator68);
        org.apache.avro.ParseContext parseContext70 = parser69.context;
        org.apache.avro.Schema.Parser parser72 = parser69.setValidateDefaults(false);
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema> schemaList73 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema>();
        org.apache.avro.Schema.Parser parser74 = parser72.addTypes((java.lang.Iterable<org.apache.avro.Schema>) schemaList73);
        org.apache.avro.Schema schema75 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList73);
        int int76 = schema75.computeHash();
        org.apache.avro.Schema schema77 = org.apache.avro.Schema.createArray(schema75);
        java.lang.Object obj79 = schema75.getObjectProp("");
        org.apache.avro.NameValidator nameValidator80 = null;
        org.apache.avro.Schema.Parser parser81 = new org.apache.avro.Schema.Parser(nameValidator80);
        org.apache.avro.ParseContext parseContext82 = parser81.context;
        org.apache.avro.Schema.Parser parser84 = parser81.setValidateDefaults(false);
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema> schemaList85 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema>();
        org.apache.avro.Schema.Parser parser86 = parser84.addTypes((java.lang.Iterable<org.apache.avro.Schema>) schemaList85);
        org.apache.avro.Schema schema87 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList85);
        int int88 = schema87.computeHash();
        schema75.putAll((org.apache.avro.JsonProperties) schema87);
        java.lang.String str90 = schema75.getDoc();
        boolean boolean91 = schema60.equals((java.lang.Object) schema75);
        schema37.addAllProps((org.apache.avro.JsonProperties) schema75);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on schema11 and schema77", schema11.equals(schema77) ? schema11.hashCode() == schema77.hashCode() : true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test159");
        org.apache.avro.Schema.Field[] fieldArray4 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList5 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList5, fieldArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList5);
        org.apache.avro.Schema schema9 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.createRecord("{null={\"type\":\"array\",\"items\":[]}}", "{\n  \"type\" : \"string\",\n  \"[hi!]\" : 1\n}", "bytes", false, (java.util.List<org.apache.avro.Schema.Field>) fieldList5);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test160");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("[ ]", "map", "enum", 10);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test161");
        org.apache.avro.Schema.Field[] fieldArray4 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList5 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList5, fieldArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList5);
        org.apache.avro.Schema schema9 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.createRecord("{\"type\":\"map\",\"values\":[]}", "boolean", "[{\"type\":\"map\",\"values\":[],\"union[]\":[],\"[hi!]\":\"array\"}]", false, (java.util.List<org.apache.avro.Schema.Field>) fieldList5);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test162");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"array\",\"items\":[]}", "int", "{null={\"type\":\"array\",\"items\":[]}}", 1911361158);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test163");
        org.apache.avro.Schema.Field[] fieldArray4 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList5 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList5, fieldArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema9 = org.apache.avro.Schema.createRecord("{}", "{\"type\":\"map\",\"values\":[]}", "", false, (java.util.List<org.apache.avro.Schema.Field>) fieldList5);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test164");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("", "fixed", "{\"type\":\"array\",\"items\":[]}", (-1));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test165");
        org.apache.avro.Schema.Field[] fieldArray4 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList5 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList5, fieldArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema9 = org.apache.avro.Schema.createRecord("{\n  \"type\" : \"map\",\n  \"values\" : [ ]\n}", "union", "\"bytes\"", true, (java.util.List<org.apache.avro.Schema.Field>) fieldList5);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test166");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema.Name name2 = new org.apache.avro.Schema.Name("[]", "boolean");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test167");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("\"bytes\"", "\"bytes\"", "long", true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test168");
        java.lang.String[] strArray8 = new java.lang.String[] { "{\n  \"type\" : \"map\",\n  \"values\" : [ ]\n}", "{\n  \"type\" : \"string\",\n  \"[hi!]\" : 1\n}", "[{\"type\":\"map\",\"values\":[],\"union[]\":[],\"[hi!]\":\"array\"}]", "\"string\"", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema11 = org.apache.avro.Schema.createEnum("int", "", "hi!", (java.util.List<java.lang.String>) strList9);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test169");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema.Name name2 = new org.apache.avro.Schema.Name("fixed", "[ ]");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test170");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("float", "\"string\"", "map", true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test171");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("[]");
        org.apache.avro.NameValidator nameValidator2 = null;
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser(nameValidator2);
        org.apache.avro.ParseContext parseContext4 = parser3.context;
        org.apache.avro.Schema.Parser parser6 = parser3.setValidateDefaults(false);
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema> schemaList7 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema>();
        org.apache.avro.Schema.Parser parser8 = parser6.addTypes((java.lang.Iterable<org.apache.avro.Schema>) schemaList7);
        org.apache.avro.Schema schema9 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList7);
        int int10 = schema9.computeHash();
        org.apache.avro.Schema schema11 = org.apache.avro.Schema.createArray(schema9);
        java.lang.Object obj13 = schema9.getObjectProp("");
        org.apache.avro.NameValidator nameValidator14 = null;
        org.apache.avro.Schema.Parser parser15 = new org.apache.avro.Schema.Parser(nameValidator14);
        org.apache.avro.ParseContext parseContext16 = parser15.context;
        org.apache.avro.Schema.Parser parser18 = parser15.setValidateDefaults(false);
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema> schemaList19 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema>();
        org.apache.avro.Schema.Parser parser20 = parser18.addTypes((java.lang.Iterable<org.apache.avro.Schema>) schemaList19);
        org.apache.avro.Schema schema21 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList19);
        int int22 = schema21.computeHash();
        schema9.putAll((org.apache.avro.JsonProperties) schema21);
        java.lang.String str24 = schema9.getDoc();
        org.apache.avro.Schema.Names names25 = new org.apache.avro.Schema.Names();
        java.lang.String str26 = names25.toString();
        org.apache.avro.Schema.Name name27 = null;
        org.apache.avro.NameValidator nameValidator28 = null;
        org.apache.avro.Schema.Parser parser29 = new org.apache.avro.Schema.Parser(nameValidator28);
        org.apache.avro.ParseContext parseContext30 = parser29.context;
        org.apache.avro.Schema.Parser parser32 = parser29.setValidateDefaults(false);
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema> schemaList33 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema>();
        org.apache.avro.Schema.Parser parser34 = parser32.addTypes((java.lang.Iterable<org.apache.avro.Schema>) schemaList33);
        org.apache.avro.Schema schema35 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList33);
        int int36 = schema35.computeHash();
        org.apache.avro.NameValidator nameValidator37 = null;
        org.apache.avro.Schema.Parser parser38 = new org.apache.avro.Schema.Parser(nameValidator37);
        org.apache.avro.ParseContext parseContext39 = parser38.context;
        org.apache.avro.Schema.Parser parser41 = parser38.setValidateDefaults(false);
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema> schemaList42 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema>();
        org.apache.avro.Schema.Parser parser43 = parser41.addTypes((java.lang.Iterable<org.apache.avro.Schema>) schemaList42);
        org.apache.avro.Schema schema44 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList42);
        int int45 = schema44.computeHash();
        boolean boolean46 = names25.replace(name27, schema35, schema44);
        schema9.addAllProps((org.apache.avro.JsonProperties) schema35);
        boolean boolean48 = schema1.equalCachedHash(schema35);
        org.apache.avro.LogicalType logicalType49 = null;
        schema1.setLogicalType(logicalType49);
        schema1.hashCode = 1911361158;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on schema1 and schema21", schema1.equals(schema21) ? schema1.hashCode() == schema21.hashCode() : true);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test172");
        java.lang.String[] strArray5 = new java.lang.String[] { "[ ]", "" };
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList6 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>(strArray5);
        org.apache.avro.Schema.Names names7 = new org.apache.avro.Schema.Names();
        java.lang.String str8 = names7.toString();
        org.apache.avro.Schema.Type type9 = org.apache.avro.Schema.Type.BYTES;
        boolean boolean10 = names7.equals((java.lang.Object) type9);
        org.apache.avro.Schema.SeenPair seenPair11 = new org.apache.avro.Schema.SeenPair((java.lang.Object) strList6, (java.lang.Object) names7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema12 = org.apache.avro.Schema.createEnum("boolean", "[{\"type\":\"map\",\"values\":[],\"union[]\":[],\"[hi!]\":\"array\"}]", "union[]", (java.util.List<java.lang.String>) strList6);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test173");
        org.apache.avro.Schema.Field[] fieldArray4 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList5 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList5, fieldArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList5);
        org.apache.avro.Schema schema9 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList5);
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList5);
        java.util.List<org.apache.avro.Schema.Field> fieldList11 = schema10.getFields();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema12 = org.apache.avro.Schema.createRecord("{\n  \"type\" : \"array\",\n  \"items\" : [ ]\n}", "\"bytes\"", "{\"type\":\"array\",\"items\":\"bytes\"}", false, fieldList11);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test174");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema.Name name2 = new org.apache.avro.Schema.Name("[[ ], ]", "[{\"type\":\"map\",\"values\":[],\"union[]\":[],\"[hi!]\":\"array\"}]");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test175");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("string", "bytes", "boolean", 1021778740);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test176");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema.Name name2 = new org.apache.avro.Schema.Name("{\n  \"type\" : \"map\",\n  \"values\" : [ ]\n}", "array");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test177");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema.Name name2 = new org.apache.avro.Schema.Name("{\"type\":\"map\",\"values\":[]}", "[hi!]");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test178");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema.Name name2 = new org.apache.avro.Schema.Name("[]", "{\n  \"type\" : \"map\",\n  \"values\" : [ ]\n}");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test179");
        java.lang.String[] strArray5 = new java.lang.String[] { "null", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema9 = org.apache.avro.Schema.createEnum("{\n  \"type\" : \"array\",\n  \"items\" : [ ]\n}", "enum", "", (java.util.List<java.lang.String>) strList6, "[{\"type\":\"map\",\"values\":[],\"union[]\":[],\"[hi!]\":\"array\"}]");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test180");
        org.apache.avro.Schema.Field[] fieldArray4 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList5 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList5, fieldArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList5);
        org.apache.avro.Schema schema9 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList5);
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList5);
        org.apache.avro.Schema schema11 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema12 = org.apache.avro.Schema.createRecord("", "map", "union[]", false, (java.util.List<org.apache.avro.Schema.Field>) fieldList5);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test181");
        org.apache.avro.Schema.Field[] fieldArray4 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList5 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList5, fieldArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createRecord("{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":[],\"bytes\":10}}", "[]", "{\"type\":\"array\",\"items\":[]}", false, (java.util.List<org.apache.avro.Schema.Field>) fieldList5);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test182");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("[ ]", "[{\"type\":\"map\",\"values\":[],\"union[]\":[],\"[hi!]\":\"array\"}]", "{null=[]}", (int) '4');
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test183");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"map\",\"values\":[]}", "float", "long", 1332506989);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test184");
        org.apache.avro.Schema.Type type1 = org.apache.avro.Schema.Type.BYTES;
        org.apache.avro.Schema.SeenPair seenPair3 = new org.apache.avro.Schema.SeenPair((java.lang.Object) type1, (java.lang.Object) (short) 1);
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.create(type1);
        org.apache.avro.Schema.Names names6 = new org.apache.avro.Schema.Names();
        java.lang.String str7 = names6.toString();
        org.apache.avro.Schema.Type type8 = org.apache.avro.Schema.Type.BYTES;
        boolean boolean9 = names6.equals((java.lang.Object) type8);
        names6.clear();
        schema4.addProp("{\"type\":\"string\",\"[hi!]\":1}", (java.lang.Object) names6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema.Field field13 = new org.apache.avro.Schema.Field("[{\"type\":\"map\",\"values\":[],\"union[]\":[],\"[hi!]\":\"array\"}]", schema4, "bytes");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test185");
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.parse("\"bytes\"", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema.Field field4 = new org.apache.avro.Schema.Field("{\n  \"type\" : \"array\",\n  \"items\" : [ ]\n}", schema3);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test186");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema.Name name2 = new org.apache.avro.Schema.Name("\"bytes\"", "");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test187");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("boolean", "hi!", "[]", true);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test188");
        java.lang.String[] strArray5 = new java.lang.String[] { "[ ]", "" };
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList6 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>(strArray5);
        org.apache.avro.Schema.Names names7 = new org.apache.avro.Schema.Names();
        java.lang.String str8 = names7.toString();
        org.apache.avro.Schema.Type type9 = org.apache.avro.Schema.Type.BYTES;
        boolean boolean10 = names7.equals((java.lang.Object) type9);
        org.apache.avro.Schema.SeenPair seenPair11 = new org.apache.avro.Schema.SeenPair((java.lang.Object) strList6, (java.lang.Object) names7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema12 = org.apache.avro.Schema.createEnum("\"bytes\"", "union", "{\n  \"type\" : \"string\",\n  \"[hi!]\" : 1\n}", (java.util.List<java.lang.String>) strList6);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test189");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("map", "union", "map", false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test190");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("union", "boolean", "{null={\"type\":\"array\",\"items\":[]}}", (-2147483648));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test191");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("\"string\"", "{\"type\":\"array\",\"items\":\"bytes\"}", "enum", false);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test192");
        java.lang.String[] strArray5 = new java.lang.String[] { "[ ]", "" };
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList6 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>(strArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createEnum("{\n  \"type\" : \"array\",\n  \"items\" : [ ]\n}", "{\"type\":\"map\",\"values\":[]}", "float", (java.util.List<java.lang.String>) strList6, "int");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test193");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("", "[{\"type\":\"map\",\"values\":[],\"union[]\":[],\"[hi!]\":\"array\"}]", "{\n  \"type\" : \"array\",\n  \"items\" : [ ]\n}", false);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test194");
        org.apache.avro.Schema.Field[] fieldArray4 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList5 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList5, fieldArray4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createRecord("hi!", "{\n  \"type\" : \"string\",\n  \"[hi!]\" : 1\n}", "float", true, (java.util.List<org.apache.avro.Schema.Field>) fieldList5);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test195");
        org.apache.avro.Schema[] schemaArray1 = new org.apache.avro.Schema[] {};
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.createUnion(schemaArray1);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion(schemaArray1);
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createUnion(schemaArray1);
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema> schemaList5 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema>(schemaArray1);
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = org.apache.avro.Schema.parseJson("\"bytes\"");
        org.apache.avro.Schema.Field.Order order11 = org.apache.avro.Schema.Field.Order.ASCENDING;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema.Field field12 = new org.apache.avro.Schema.Field("hi!", schema6, "union", jsonNode9, true, order11);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test196");
        java.lang.String[] strArray5 = new java.lang.String[] { "[ ]", "" };
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList6 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>(strArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createEnum("{\"type\":\"string\",\"[hi!]\":1}", "", "union[]", (java.util.List<java.lang.String>) strList6);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test197");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema.Name name2 = new org.apache.avro.Schema.Name("boolean", "int");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test198");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema.Name name2 = new org.apache.avro.Schema.Name("array", "string");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test199");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{null=[]}", "null", "[ ]", (int) (short) -1);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test200");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema.Name name2 = new org.apache.avro.Schema.Name("string", "\"bytes\"");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test201");
        java.lang.String[] strArray5 = new java.lang.String[] { "[ ]", "" };
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList6 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>(strArray5);
        org.apache.avro.Schema.Names names7 = new org.apache.avro.Schema.Names();
        java.lang.String str8 = names7.toString();
        org.apache.avro.Schema.Type type9 = org.apache.avro.Schema.Type.BYTES;
        boolean boolean10 = names7.equals((java.lang.Object) type9);
        org.apache.avro.Schema.SeenPair seenPair11 = new org.apache.avro.Schema.SeenPair((java.lang.Object) strList6, (java.lang.Object) names7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createEnum("", "null", "union[]", (java.util.List<java.lang.String>) strList6, "boolean");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test202");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema.Name name2 = new org.apache.avro.Schema.Name("{\n  \"type\" : \"map\",\n  \"values\" : [ ]\n}", "{}");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test203");
        java.lang.String[] strArray5 = new java.lang.String[] { "[ ]", "" };
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList6 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>(strArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createEnum("[]", "[bytes]", "float", (java.util.List<java.lang.String>) strList6);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test204");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("float", "{}", "[[]]", (int) ' ');
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test205");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema.Name name2 = new org.apache.avro.Schema.Name("{}", "[{\"type\":\"map\",\"values\":[],\"union[]\":[],\"[hi!]\":\"array\"}]");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test206");
        java.lang.String[] strArray5 = new java.lang.String[] { "[ ]", "" };
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList6 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>(strArray5);
        org.apache.avro.Schema.Names names7 = new org.apache.avro.Schema.Names();
        java.lang.String str8 = names7.toString();
        org.apache.avro.Schema.Type type9 = org.apache.avro.Schema.Type.BYTES;
        boolean boolean10 = names7.equals((java.lang.Object) type9);
        org.apache.avro.Schema.SeenPair seenPair11 = new org.apache.avro.Schema.SeenPair((java.lang.Object) strList6, (java.lang.Object) names7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema12 = org.apache.avro.Schema.createEnum("[{\"type\":\"map\",\"values\":[],\"union[]\":[],\"[hi!]\":\"array\"}]", "{\"type\":\"map\",\"values\":[]}", "[ ]", (java.util.List<java.lang.String>) strList6);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test207");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema.Name name2 = new org.apache.avro.Schema.Name("{\n  \"type\" : \"array\",\n  \"items\" : [ ]\n}", "enum");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test208");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\n  \"type\" : \"array\",\n  \"items\" : [ ]\n}", "enum", "", true);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test209");
        org.apache.avro.Schema.Field[] fieldArray4 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList5 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList5, fieldArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createRecord("long", "enum", "{\"type\":\"map\",\"values\":[]}", true, (java.util.List<org.apache.avro.Schema.Field>) fieldList5);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test210");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("[ ]", "string", "{null=[]}", (int) (short) 100);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test211");
        org.apache.avro.Schema.Names names0 = new org.apache.avro.Schema.Names();
        java.lang.String str1 = names0.toString();
        java.lang.String str2 = names0.toString();
        names0.clear();
        names0.clear();
        java.lang.String str5 = names0.space();
        java.util.Set<java.util.Map.Entry<org.apache.avro.Schema.Name, org.apache.avro.Schema>> nameEntrySet6 = names0.entrySet();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList8 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((int) (short) 0);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList10 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean11 = strComparableList10.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableList10.iterator();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList14 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean15 = strComparableList14.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor16 = strComparableList14.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList17 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((java.util.List<java.lang.Comparable<java.lang.String>>) strComparableList14);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList19 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean20 = strComparableList19.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor21 = strComparableList19.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList22 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((java.util.List<java.lang.Comparable<java.lang.String>>) strComparableList19);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList24 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean25 = strComparableList24.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor26 = strComparableList24.iterator();
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList28 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((int) (short) 0);
        java.lang.Cloneable[] cloneableArray29 = new java.lang.Cloneable[] { strComparableList10, strComparableList17, strComparableList22, strComparableList24, strComparableList28 };
        java.lang.Cloneable[] cloneableArray30 = strComparableList8.toArray(cloneableArray29);
        int int31 = strComparableList8.size();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList33 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean34 = strComparableList33.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor35 = strComparableList33.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream36 = strComparableList33.parallelStream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream37 = strComparableList33.parallelStream();
        boolean boolean38 = strComparableList8.remove((java.lang.Object) strComparableList33);
        strComparableList8.ensureCapacity((-1));
        org.apache.avro.Schema schema41 = names0.remove((java.lang.Object) strComparableList8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema43 = names0.get("[]");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test212");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema.Name name2 = new org.apache.avro.Schema.Name("{null=[]}", "union[]");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test213");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema.Name name2 = new org.apache.avro.Schema.Name("{null=[]}", "\"bytes\"");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test214");
        java.lang.String[] strArray5 = new java.lang.String[] { "[ ]", "" };
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList6 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>(strArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createEnum("[ ]", "enum", "[ ]", (java.util.List<java.lang.String>) strList6);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test215");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("map", "{\"type\":\"array\",\"items\":\"bytes\"}", "[ ]", false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test216");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema.Name name2 = new org.apache.avro.Schema.Name("string", "{}");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test217");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("string", "[]", "bytes", (int) (short) -1);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test218");
        java.lang.String[] strArray5 = new java.lang.String[] { "[ ]", "" };
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList6 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>(strArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createEnum("{\n  \"type\" : \"map\",\n  \"values\" : [ ]\n}", "[[ ], ]", "hi!", (java.util.List<java.lang.String>) strList6, "{\"type\":\"string\",\"[hi!]\":1}");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test219");
        java.lang.String[] strArray5 = new java.lang.String[] { "[ ]", "" };
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList6 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>(strArray5);
        org.apache.avro.Schema.Names names7 = new org.apache.avro.Schema.Names();
        java.lang.String str8 = names7.toString();
        org.apache.avro.Schema.Type type9 = org.apache.avro.Schema.Type.BYTES;
        boolean boolean10 = names7.equals((java.lang.Object) type9);
        org.apache.avro.Schema.SeenPair seenPair11 = new org.apache.avro.Schema.SeenPair((java.lang.Object) strList6, (java.lang.Object) names7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema12 = org.apache.avro.Schema.createEnum("{\"type\":\"map\",\"values\":[]}", "{\"type\":\"array\",\"items\":[]}", "[[ ], ]", (java.util.List<java.lang.String>) strList6);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test220");
        java.lang.String[] strArray5 = new java.lang.String[] { "[ ]", "" };
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList6 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>(strArray5);
        org.apache.avro.Schema.Names names7 = new org.apache.avro.Schema.Names();
        java.lang.String str8 = names7.toString();
        org.apache.avro.Schema.Type type9 = org.apache.avro.Schema.Type.BYTES;
        boolean boolean10 = names7.equals((java.lang.Object) type9);
        org.apache.avro.Schema.SeenPair seenPair11 = new org.apache.avro.Schema.SeenPair((java.lang.Object) strList6, (java.lang.Object) names7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema12 = org.apache.avro.Schema.createEnum("{\n  \"type\" : \"array\",\n  \"items\" : [ ]\n}", "null", "[[ ], ]", (java.util.List<java.lang.String>) strList6);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test221");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema.Name name2 = new org.apache.avro.Schema.Name("float", "[]");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test222");
        java.lang.String[] strArray5 = new java.lang.String[] { "[ ]", "" };
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList6 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>(strArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createEnum("fixed", "{\n  \"type\" : \"string\",\n  \"[hi!]\" : 1\n}", "{}", (java.util.List<java.lang.String>) strList6, "enum");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test223");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema.Name name2 = new org.apache.avro.Schema.Name("{null={\"type\":\"array\",\"items\":[]}}", "enum");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test224");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("null", "", "[[]]", true);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test225");
        java.lang.String[] strArray39 = new java.lang.String[] { "long", "[]", "{null=[]}", "{\"type\":\"map\",\"values\":[],\"union[]\":[],\"[hi!]\":\"array\"}", "{\"type\":\"array\",\"items\":[]}", "[[]]", "{\"type\":\"map\",\"values\":[],\"union[]\":[],\"[hi!]\":\"array\"}", "{\"type\":\"string\",\"[hi!]\":1}", "{\"type\":\"string\",\"[hi!]\":1}", "array", "null", "{\n  \"type\" : \"map\",\n  \"values\" : [ ]\n}", "int", "string", "[{\"type\":\"map\",\"values\":[],\"union[]\":[],\"[hi!]\":\"array\"}]", "fixed", "[{\"type\":\"map\",\"values\":[],\"union[]\":[],\"[hi!]\":\"array\"}]", "bytes", "map", "{\"type\":\"string\",\"[hi!]\":1}", "float", "{\n  \"type\" : \"map\",\n  \"values\" : [ ]\n}", "{\"type\":\"string\",\"[hi!]\":1}", "long", "hi!", "string", "map", "[[ ], ]", "null", "{\n  \"type\" : \"map\",\n  \"values\" : [ ]\n}", "\"string\"", "bytes", "", "{\n  \"type\" : \"array\",\n  \"items\" : [ ]\n}", "{null=[]}", "{\"type\":\"array\",\"items\":[]}" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema43 = org.apache.avro.Schema.createEnum("\"string\"", "{\n  \"type\" : \"map\",\n  \"values\" : [ ]\n}", "[bytes]", (java.util.List<java.lang.String>) strList40, "{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":[],\"bytes\":10}}");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test226");
        java.lang.String[] strArray5 = new java.lang.String[] { "[ ]", "" };
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList6 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>(strArray5);
        org.apache.avro.Schema.Names names7 = new org.apache.avro.Schema.Names();
        java.lang.String str8 = names7.toString();
        org.apache.avro.Schema.Type type9 = org.apache.avro.Schema.Type.BYTES;
        boolean boolean10 = names7.equals((java.lang.Object) type9);
        org.apache.avro.Schema.SeenPair seenPair11 = new org.apache.avro.Schema.SeenPair((java.lang.Object) strList6, (java.lang.Object) names7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createEnum("{\n  \"type\" : \"string\",\n  \"[hi!]\" : 1\n}", "", "", (java.util.List<java.lang.String>) strList6, "\"string\"");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test227");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("", "{\n  \"type\" : \"string\",\n  \"[hi!]\" : 1\n}", "array", false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test228");
        org.apache.avro.Schema.Field[] fieldArray4 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList5 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList5, fieldArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createRecord("{null=[]}", "{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":[],\"bytes\":10}}", "{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":[],\"bytes\":10}}", false, (java.util.List<org.apache.avro.Schema.Field>) fieldList5);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test229");
        java.lang.String[] strArray5 = new java.lang.String[] { "[ ]", "" };
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList6 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>(strArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createEnum("[[]]", "float", "{\"type\":\"map\",\"values\":[],\"union[]\":[],\"[hi!]\":\"array\"}", (java.util.List<java.lang.String>) strList6);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test230");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"array\",\"items\":\"bytes\"}", "[]", "hi!", (int) '#');
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test231");
        java.lang.String[] strArray5 = new java.lang.String[] { "[ ]", "" };
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList6 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>(strArray5);
        org.apache.avro.Schema.Names names7 = new org.apache.avro.Schema.Names();
        java.lang.String str8 = names7.toString();
        org.apache.avro.Schema.Type type9 = org.apache.avro.Schema.Type.BYTES;
        boolean boolean10 = names7.equals((java.lang.Object) type9);
        org.apache.avro.Schema.SeenPair seenPair11 = new org.apache.avro.Schema.SeenPair((java.lang.Object) strList6, (java.lang.Object) names7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createEnum("{}", "{}", "[bytes]", (java.util.List<java.lang.String>) strList6, "[ ]");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test232");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema.Name name2 = new org.apache.avro.Schema.Name("fixed", "null");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test233");
        java.lang.String[] strArray4 = new java.lang.String[] { "{\"type\":\"string\",\"[hi!]\":1}" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createEnum("", "string", "enum", (java.util.List<java.lang.String>) strList5);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test234");
        org.apache.avro.Schema.Field[] fieldArray4 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList5 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList5, fieldArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList5);
        org.apache.avro.Schema schema9 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList5);
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList5);
        org.apache.avro.Schema schema11 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList5);
        org.apache.avro.Schema schema12 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createRecord("enum", "[]", "{\"type\":\"array\",\"items\":\"bytes\"}", false, (java.util.List<org.apache.avro.Schema.Field>) fieldList5);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test235");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("[[ ], ]", "", "[[ ], ]", (int) (byte) 10);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaRNDLargeErrorTest0.test236");
        java.lang.String[] strArray16 = new java.lang.String[] { "null", "{\n  \"type\" : \"string\",\n  \"[hi!]\" : 1\n}", "{\"type\":\"map\",\"values\":[],\"union[]\":[],\"[hi!]\":\"array\"}", "fixed", "fixed", "[ ]", "{\"type\":\"array\",\"items\":[],\"\\\"string\\\"\":\"[ ]\"}", "{}", "map", "long", "{\"type\":\"map\",\"values\":[],\"union[]\":[],\"[hi!]\":\"array\"}", "union", "map" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema20 = org.apache.avro.Schema.createEnum("{\"type\":\"array\",\"items\":\"bytes\"}", "\"bytes\"", "[{\"type\":\"map\",\"values\":[],\"union[]\":[],\"[hi!]\":\"array\"}]", (java.util.List<java.lang.String>) strList17, "bytes");
    }
}

