package org.apache.avro;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ISW2SchemaC3RNDTest {

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
      System.out.format("%n%s%n", "ISW2SchemaC3RNDTest.test01");
    java.util.List<java.lang.String> strList3 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema4 = org.apache.avro.Schema.createEnum("hi!", "", "", strList3);
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: hi!");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
  }

  @Test
  public void test03() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2SchemaC3RNDTest.test03");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.STRING;
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.STRING + "'",
        type0.equals(org.apache.avro.Schema.Type.STRING));
  }

  @Test
  public void test04() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2SchemaC3RNDTest.test04");
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
  public void test05() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2SchemaC3RNDTest.test05");
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
  public void test06() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2SchemaC3RNDTest.test06");
    org.apache.avro.Schema schema0 = null;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
    org.apache.avro.Schema schema2 = null;
    org.apache.avro.Schema schema3 = org.apache.avro.Schema.createMap(schema2);
    org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] { schema3 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5,
        schemaArray4);
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
  public void test07() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2SchemaC3RNDTest.test07");
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("", "", "", (int) (short) 0);
      org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
  }

  @Test
  public void test08() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2SchemaC3RNDTest.test08");
    // The following exception was thrown during execution in test generation
    try {
      com.fasterxml.jackson.databind.JsonNode jsonNode1 = org.apache.avro.Schema.parseJson("hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.RuntimeException; message: com.fasterxml.jackson.core.JsonParseException: Unrecognized token 'hi': was expecting (JSON String, Number, Array, Object or token 'null', 'true' or 'false')? at [Source: REDACTED (`StreamReadFeature.INCLUDE_SOURCE_IN_LOCATION` disabled); line: 1, column: 1]");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
  }

  @Test
  public void test09() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2SchemaC3RNDTest.test09");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.RECORD;
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.RECORD + "'",
        type0.equals(org.apache.avro.Schema.Type.RECORD));
  }

  @Test
  public void test10() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2SchemaC3RNDTest.test10");
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("hi!", "hi!", "hi!", true);
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: hi!");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
  }

  @Test
  public void test11() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2SchemaC3RNDTest.test11");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.NULL;
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.NULL + "'",
        type0.equals(org.apache.avro.Schema.Type.NULL));
  }

  @Test
  public void test12() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2SchemaC3RNDTest.test12");
    java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
    java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
    boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema8 = org.apache.avro.Schema.createEnum("hi!", "hi!", "",
          (java.util.List<java.lang.String>) strList6);
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: hi!");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(strArray5);
    org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
  }

  @Test
  public void test13() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2SchemaC3RNDTest.test13");
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
  public void test14() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2SchemaC3RNDTest.test14");
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("", "", "", 1);
      org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
  }

  @Test
  public void test15() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2SchemaC3RNDTest.test15");
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
  public void test16() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2SchemaC3RNDTest.test16");
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
  public void test17() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2SchemaC3RNDTest.test17");
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
  public void test18() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2SchemaC3RNDTest.test18");
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
  public void test19() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2SchemaC3RNDTest.test19");
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("hi!", "", "hi!", 10);
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: hi!");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
  }

  @Test
  public void test20() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2SchemaC3RNDTest.test20");
    org.apache.avro.Schema schema1 = null;
    org.apache.avro.Schema schema2 = org.apache.avro.Schema.createMap(schema1);
    com.fasterxml.jackson.databind.JsonNode jsonNode4 = null;
    org.apache.avro.Schema.Field.Order order6 = org.apache.avro.Schema.Field.Order.ASCENDING;
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Field field7 = new org.apache.avro.Schema.Field("", schema1, "hi!", jsonNode4, true,
          order6);
      org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(schema2);
    org.junit.Assert.assertTrue("'" + order6 + "' != '" + org.apache.avro.Schema.Field.Order.ASCENDING + "'",
        order6.equals(org.apache.avro.Schema.Field.Order.ASCENDING));
  }

  @Test
  public void test21() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2SchemaC3RNDTest.test21");
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
  public void test22() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2SchemaC3RNDTest.test22");
    com.fasterxml.jackson.databind.JsonNode jsonNode0 = null;
    org.apache.avro.ParseContext parseContext1 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema3 = org.apache.avro.Schema.parse(jsonNode0, parseContext1, "hi!");
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.SchemaParseException; message: Cannot parse <null> schema");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
  }

  @Test
  public void test23() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2SchemaC3RNDTest.test23");
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
  public void test26() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2SchemaC3RNDTest.test26");
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
  public void test27() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2SchemaC3RNDTest.test27");
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
  public void test28() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2SchemaC3RNDTest.test28");
    org.apache.avro.Schema schema0 = null;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
    java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList4 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
    boolean boolean5 = strComparableList4.add((java.lang.Comparable<java.lang.String>) "hi!");
    java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableList4.iterator();
    java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableList4
        .parallelStream();
    // The following exception was thrown during execution in test generation
    try {
      schema1.addProp("", (java.lang.Object) strComparableStream7);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Unknown datum class: class java.util.stream.ReferencePipeline$Head");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertNotNull(strComparableItor6);
    org.junit.Assert.assertNotNull(strComparableStream7);
  }

  @Test
  public void test29() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2SchemaC3RNDTest.test29");
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
  public void test30() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2SchemaC3RNDTest.test30");
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
  public void test31() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2SchemaC3RNDTest.test31");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.FIXED;
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Can't create a: FIXED");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.FIXED + "'",
        type0.equals(org.apache.avro.Schema.Type.FIXED));
  }

  @Test
  public void test32() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2SchemaC3RNDTest.test32");
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
  public void test33() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2SchemaC3RNDTest.test33");
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
  public void test34() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2SchemaC3RNDTest.test34");
    java.lang.Object obj0 = org.apache.avro.Schema.Field.NULL_DEFAULT_VALUE;
    org.junit.Assert.assertNotNull(obj0);
  }

  @Test
  public void test35() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2SchemaC3RNDTest.test35");
    org.apache.avro.JsonProperties.Null null0 = org.apache.avro.JsonProperties.NULL_VALUE;
    org.junit.Assert.assertNotNull(null0);
  }

  @Test
  public void test36() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2SchemaC3RNDTest.test36");
    java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
    java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
    boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema9 = org.apache.avro.Schema.createEnum("", "hi!", "hi!",
          (java.util.List<java.lang.String>) strList6, "");
      org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(strArray5);
    org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
  }

  @Test
  public void test37() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2SchemaC3RNDTest.test37");
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
  public void test38() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2SchemaC3RNDTest.test38");
    org.apache.avro.Schema.Field[] fieldArray4 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList5 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList5,
        fieldArray4);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema7 = org.apache.avro.Schema.createRecord("hi!", "hi!", "", false,
          (java.util.List<org.apache.avro.Schema.Field>) fieldList5);
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: hi!");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(fieldArray4);
    org.junit.Assert.assertArrayEquals(fieldArray4, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test40() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2SchemaC3RNDTest.test40");
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
  public void test41() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2SchemaC3RNDTest.test41");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.DOUBLE;
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.DOUBLE + "'",
        type0.equals(org.apache.avro.Schema.Type.DOUBLE));
  }

  @Test
  public void test42() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2SchemaC3RNDTest.test42");
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
  public void test43() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2SchemaC3RNDTest.test43");
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
  public void test44() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2SchemaC3RNDTest.test44");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.INT;
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.INT + "'",
        type0.equals(org.apache.avro.Schema.Type.INT));
  }

  @Test
  public void test46() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2SchemaC3RNDTest.test46");
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
  public void test49() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2SchemaC3RNDTest.test49");
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
  public void test50() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2SchemaC3RNDTest.test50");
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
  public void test53() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2SchemaC3RNDTest.test53");
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
  public void test57() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2SchemaC3RNDTest.test57");
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
  public void test58() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2SchemaC3RNDTest.test58");
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
  public void test59() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2SchemaC3RNDTest.test59");
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
  public void test61() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2SchemaC3RNDTest.test61");
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Name name2 = new org.apache.avro.Schema.Name("", "hi!");
      org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
  }

  @Test
  public void test63() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2SchemaC3RNDTest.test63");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.BYTES;
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.BYTES + "'",
        type0.equals(org.apache.avro.Schema.Type.BYTES));
  }

  @Test
  public void test64() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2SchemaC3RNDTest.test64");
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
  public void test67() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2SchemaC3RNDTest.test67");
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
  public void test69() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2SchemaC3RNDTest.test69");
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
  public void test70() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2SchemaC3RNDTest.test70");
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
  public void test74() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ISW2SchemaC3RNDTest.test74");
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

}
