package org.apache.avro;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ISW2SchemaC1RNDErrorTest0 {

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
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaC1RNDErrorTest0.test1");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("", "", "hi!", false);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaC1RNDErrorTest0.test2");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema9 = org.apache.avro.Schema.createEnum("", "hi!", "", (java.util.List<java.lang.String>) strList6, "");
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ISW2SchemaC1RNDErrorTest0.test3");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createEnum("", "hi!", "hi!", (java.util.List<java.lang.String>) strList5);
    }
}

