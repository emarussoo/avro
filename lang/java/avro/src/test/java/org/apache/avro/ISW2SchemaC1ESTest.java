/*
 * Derived from EvoSuite 1.2.0 output for Schema C1 and selected nested classes.
 * EvoRunner, scaffolding, EvoSuite runtime assertions, VFS/VNET dependencies,
 * unstable assertions and non-restored global-state mutations were removed.
 * The same conservative adaptation criteria used for C0 were applied.
 */
package org.apache.avro;

import static org.junit.Assert.*;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.ext.DOMSerializer;
import com.fasterxml.jackson.databind.node.BooleanNode;
import com.fasterxml.jackson.databind.node.FloatNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.type.PlaceholderForType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import org.apache.avro.NameValidator;
import org.apache.avro.ParseContext;
import org.apache.avro.Protocol;
import org.apache.avro.Schema;
import org.junit.Test;

public class ISW2SchemaC1ESTest {

  @Test(timeout = 4000)
  public void schema_ESTest_test000() throws Throwable {
    FloatNode floatNode0 = FloatNode.valueOf(0.75F);
    ParseContext parseContext0 = new ParseContext();
    // Undeclared exception!
    try {
      Schema.parse((JsonNode) floatNode0, parseContext0, "`&UTdpkjlXx[]<},1");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Schema not yet supported: 0.75
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test001() throws Throwable {
    // Undeclared exception!
    try {
      Schema.parse("{\n  \"type\" : \"record\",\n  \"fields\" : [ ]\n}");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // No name in schema: {\"type\":\"record\",\"fields\":[]}
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test002() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    JsonNodeFactory jsonNodeFactory0 = new JsonNodeFactory(true);
    HashMap<String, JsonNode> hashMap0 = new HashMap<String, JsonNode>();
    ObjectNode objectNode0 = new ObjectNode(jsonNodeFactory0, hashMap0);
    ObjectNode objectNode1 = objectNode0.put("j{", true);
    Schema schema1 = Schema.createMap(schema0);
    boolean boolean0 = schema1.isValidDefault(objectNode1);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test003() throws Throwable {
    Schema schema0 = Schema.createMap((Schema) null);
    BooleanNode booleanNode0 = BooleanNode.getTrue();
    boolean boolean0 = schema0.isValidDefault(booleanNode0);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test004() throws Throwable {
    ParseContext parseContext0 = new ParseContext();
    Schema schema0 = parseContext0.find("int", "int");
    FloatNode floatNode0 = FloatNode.valueOf(317.1F);
    boolean boolean0 = schema0.isValidDefault(floatNode0);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test005() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    JsonNodeFactory jsonNodeFactory0 = new JsonNodeFactory(true);
    HashMap<String, JsonNode> hashMap0 = new HashMap<String, JsonNode>();
    ObjectNode objectNode0 = new ObjectNode(jsonNodeFactory0, hashMap0);
    Schema schema1 = Schema.createMap(schema0);
    boolean boolean0 = schema1.isValidDefault(objectNode0);
    assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test006() throws Throwable {
    Schema schema0 = Schema.createArray((Schema) null);
    FloatNode floatNode0 = FloatNode.valueOf(0.6F);
    boolean boolean0 = schema0.isValidDefault(floatNode0);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test007() throws Throwable {
    Stack<Schema.Field> stack0 = new Stack<Schema.Field>();
    Schema schema0 = Schema.createRecord((List<Schema.Field>) stack0);
    BooleanNode booleanNode0 = BooleanNode.getTrue();
    boolean boolean0 = schema0.isValidDefault(booleanNode0);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test008() throws Throwable {
    Schema.LockableArrayList<Schema.Field> schema_LockableArrayList0 = new Schema.LockableArrayList<Schema.Field>();
    Schema schema0 = Schema.createRecord((List<Schema.Field>) schema_LockableArrayList0);
    Schema.Field schema_Field0 = null;
    try {
      schema_Field0 = new Schema.Field((String) null, schema0, "tl\"JtZ9t;r74,Tk?L&%", schema_LockableArrayList0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Null name
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test009() throws Throwable {
    Schema.Names schema_Names0 = new Schema.Names("Cannot parse <null> schema");
    Schema schema0 = schema_Names0.get("doc");
    assertNull(schema0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test010() throws Throwable {
    Schema schema0 = Schema.parse("\"int\"", true);
    assertFalse(schema0.isUnion());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test011() throws Throwable {
    Schema.Parser schema_Parser0 = new Schema.Parser();
    String[] stringArray0 = new String[2];
    // Undeclared exception!
    try {
      schema_Parser0.parse("kcjH3|X", stringArray0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // com.fasterxml.jackson.core.JsonParseException: Unrecognized token 'kcjH3':
      // was expecting (JSON String, Number, Array, Object or token 'null', 'true' or
      // 'false')
      // at [Source: (String)\"kcjH3|Xnullnull\"; line: 1, column: 6]
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test012() throws Throwable {
    Schema.Names schema_Names0 = new Schema.Names((String) null);
    Schema.Parser schema_Parser0 = new Schema.Parser((NameValidator) null);
    Collection<Schema> collection0 = schema_Names0.values();
    Schema.Parser schema_Parser1 = schema_Parser0.addTypes((Iterable<Schema>) collection0);
    assertTrue(schema_Parser1.getValidateDefaults());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test013() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    ArrayList<Schema> arrayList0 = new ArrayList<Schema>();
    Schema schema1 = Schema.createUnion((List<Schema>) arrayList0);
    Schema schema2 = Schema.applyAliases(schema1, schema0);
    assertSame(schema2, schema1);
    assertFalse(schema2.equals((Object) schema0));
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test014() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema schema1 = Schema.applyAliases(schema0, schema0);
    assertEquals(Schema.Type.UNION, schema1.getType());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test015() throws Throwable {
    LinkedList<Schema.Field> linkedList0 = new LinkedList<Schema.Field>();
    Schema schema0 = Schema.createRecord((List<Schema.Field>) linkedList0);
    Schema[] schemaArray0 = new Schema[4];
    schemaArray0[0] = schema0;
    // Undeclared exception!
    try {
      Schema.createUnion(schemaArray0);
      fail("Expecting exception: NullPointerException");

    } catch (NullPointerException e) {
      //
      // no message in exception (getMessage() returned null)
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test016() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema[] schemaArray0 = new Schema[9];
    schemaArray0[0] = schema0;
    // Undeclared exception!
    try {
      Schema.createUnion(schemaArray0);
      fail("Expecting exception: NullPointerException");

    } catch (NullPointerException e) {
      //
      // no message in exception (getMessage() returned null)
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test017() throws Throwable {
    Schema schema0 = Schema.createMap((Schema) null);
    Schema schema1 = Schema.applyAliases(schema0, schema0);
    assertSame(schema0, schema1);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test018() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema schema1 = Schema.createMap(schema0);
    Schema schema2 = Schema.applyAliases(schema1, schema0);
    assertFalse(schema2.equals((Object) schema0));
    assertEquals(Schema.Type.MAP, schema2.getType());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test019() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema schema1 = Schema.createArray(schema0);
    ParseContext parseContext0 = new ParseContext();
    Schema schema2 = parseContext0.resolve(schema1);
    assertTrue(schema2.equals((Object) schema1));

    schema2.addProp("org.apache.avro.compiler.UnresolvedSchema_951", "array");
    Schema schema3 = Schema.applyAliases(schema2, schema1);
    assertFalse(schema3.equals((Object) schema1));
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test020() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema schema1 = Schema.createArray(schema0);
    Schema schema2 = Schema.createArray(schema1);
    Schema schema3 = Schema.applyAliases(schema1, schema2);
    assertFalse(schema3.equals((Object) schema2));
    assertSame(schema3, schema1);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test021() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema schema1 = Schema.createArray(schema0);
    ParseContext parseContext0 = new ParseContext();
    Schema schema2 = parseContext0.resolve(schema1);
    Schema schema3 = Schema.applyAliases(schema2, schema1);
    assertTrue(schema3.equals((Object) schema1));
    assertFalse(schema3.equals((Object) schema0));
    assertFalse(schema0.equals((Object) schema2));
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test022() throws Throwable {
    Schema.LockableArrayList<Schema.Field> schema_LockableArrayList0 = new Schema.LockableArrayList<Schema.Field>();
    Schema schema0 = Schema.createRecord((List<Schema.Field>) schema_LockableArrayList0);
    schema0.addAlias((String) null);
    Schema schema1 = Schema.createArray(schema0);
    Schema schema2 = Schema.applyAliases(schema1, schema0);
    assertFalse(schema2.equals((Object) schema0));
    assertSame(schema2, schema1);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test023() throws Throwable {
    Schema.LockableArrayList<Schema.Field> schema_LockableArrayList0 = new Schema.LockableArrayList<Schema.Field>();
    Schema schema0 = Schema.createRecord((List<Schema.Field>) schema_LockableArrayList0);
    Schema schema1 = Schema.createArray(schema0);
    Schema schema2 = Schema.applyAliases(schema1, schema0);
    assertEquals(Schema.Type.ARRAY, schema2.getType());
    assertFalse(schema2.equals((Object) schema0));
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test024() throws Throwable {
    Schema.LockableArrayList<String> schema_LockableArrayList0 = new Schema.LockableArrayList<String>();
    Schema schema0 = Schema.createEnum((String) null, (String) null, "5_.<sSVn}_{K|[",
        (List<String>) schema_LockableArrayList0);
    // Undeclared exception!
    try {
      schema0.getIndexNamed("}^lw),L:h7 T>IfIrj");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not a union: {\"type\":\"enum\",\"symbols\":[]}
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test025() throws Throwable {
    Schema.LockableArrayList<String> schema_LockableArrayList0 = new Schema.LockableArrayList<String>();
    Schema schema0 = Schema.createEnum((String) null, (String) null, "5_.<sSVn}_{K|[",
        (List<String>) schema_LockableArrayList0);
    Schema schema1 = Schema.applyAliases(schema0, schema0);
    assertEquals(Schema.Type.ENUM, schema1.getType());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test026() throws Throwable {
    Stack<Schema.Field> stack0 = new Stack<Schema.Field>();
    Schema schema0 = Schema.createRecord((List<Schema.Field>) stack0);
    ParseContext parseContext0 = new ParseContext();
    Schema schema1 = parseContext0.resolve(schema0);
    assertTrue(schema1.equals((Object) schema0));

    schema1.addProp("expected a valid value ", "com.fasterxml.jackson.databind.ser.std.CollectionSerializer");
    Schema schema2 = Schema.applyAliases(schema1, schema0);
    assertFalse(schema1.equals((Object) schema0));
    assertSame(schema1, schema2);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test027() throws Throwable {
    Schema.LockableArrayList<Schema.Field> schema_LockableArrayList0 = new Schema.LockableArrayList<Schema.Field>();
    Schema schema0 = Schema.createRecord((List<Schema.Field>) schema_LockableArrayList0);
    Schema schema1 = Schema.applyAliases(schema0, schema0);
    assertFalse(schema1.isUnion());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test028() throws Throwable {
    Stack<Schema.Field> stack0 = new Stack<Schema.Field>();
    Schema schema0 = Schema.createRecord((List<Schema.Field>) stack0);
    // Undeclared exception!
    try {
      schema0.setFields(stack0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Fields are already set
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test029() throws Throwable {
    LinkedList<Schema.Field> linkedList0 = new LinkedList<Schema.Field>();
    Schema schema0 = Schema.createRecord((List<Schema.Field>) linkedList0);
    boolean boolean0 = schema0.hasFields();
    assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test030() throws Throwable {
    Schema.LockableArrayList<Schema.Field> schema_LockableArrayList0 = new Schema.LockableArrayList<Schema.Field>();
    Schema schema0 = Schema.createRecord((List<Schema.Field>) schema_LockableArrayList0);
    Schema.Field schema_Field0 = schema0.getField("VQ");
    assertNull(schema_Field0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test031() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.SeenPair schema_SeenPair0 = new Schema.SeenPair((Object) null, (Object) null);
    Schema.SeenPair schema_SeenPair1 = new Schema.SeenPair((Object) null, schema0);
    boolean boolean0 = schema_SeenPair1.equals(schema_SeenPair0);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test032() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.SeenPair schema_SeenPair0 = new Schema.SeenPair(schema0, (Object) null);
    Schema.SeenPair schema_SeenPair1 = new Schema.SeenPair((Object) null, schema0);
    boolean boolean0 = schema_SeenPair1.equals(schema_SeenPair0);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test033() throws Throwable {
    Schema.SeenPair schema_SeenPair0 = new Schema.SeenPair("namespace", "namespace");
    boolean boolean0 = schema_SeenPair0.equals("namespace");
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test034() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.SeenPair schema_SeenPair0 = new Schema.SeenPair(schema0, (Object) null);
    boolean boolean0 = schema_SeenPair0.equals(schema_SeenPair0);
    assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test035() throws Throwable {
    Schema.LockableArrayList<Schema.Field> schema_LockableArrayList0 = new Schema.LockableArrayList<Schema.Field>();
    Schema schema0 = Schema.createRecord((List<Schema.Field>) schema_LockableArrayList0);
    schema0.addAlias((String) null);
    ParseContext parseContext0 = new ParseContext();
    Schema schema1 = parseContext0.resolve(schema0);
    assertTrue(schema1.equals((Object) schema0));
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test036() throws Throwable {
    Schema.LockableArrayList<Schema.Field> schema_LockableArrayList0 = new Schema.LockableArrayList<Schema.Field>();
    Schema schema0 = Schema.createRecord((List<Schema.Field>) schema_LockableArrayList0);
    schema0.addAlias((String) null);
    schema0.addAlias((String) null);
    assertFalse(schema0.isUnion());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test037() throws Throwable {
    DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
    TokenBuffer tokenBuffer0 = defaultSerializerProvider_Impl0.bufferForValueConversion();
    Schema.Name schema_Name0 = new Schema.Name((String) null, "a}I`a)y");
    schema_Name0.writeName("a}I`a)y", tokenBuffer0);
    assertFalse(tokenBuffer0.isEmpty());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test038() throws Throwable {
    Schema.Name schema_Name0 = new Schema.Name((String) null, (String) null);
    boolean boolean0 = schema_Name0.equals((Object) null);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test039() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.DESCENDING;
    Schema.Field schema_Field0 = null;
    try {
      schema_Field0 = new Schema.Field("5!zu!,vk2.", schema0, "5!zu!,vk2.", schema0, schema_Field_Order0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Unknown datum class: class org.apache.avro.Schema$StringSchema
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test040() throws Throwable {
    Schema.LockableArrayList<Schema.Field> schema_LockableArrayList0 = new Schema.LockableArrayList<Schema.Field>();
    Schema schema0 = Schema.createRecord((List<Schema.Field>) schema_LockableArrayList0);
    Object object0 = Schema.Field.NULL_DEFAULT_VALUE;
    Schema.Field schema_Field0 = null;
    try {
      schema_Field0 = new Schema.Field((String) null, schema0, "tl\"JtZ9t;r74,Tk?L&%", object0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Null name
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test041() throws Throwable {
    Stack<Schema.Field> stack0 = new Stack<Schema.Field>();
    Schema schema0 = Schema.createRecord((List<Schema.Field>) stack0);
    ParseContext parseContext0 = new ParseContext();
    Schema schema1 = parseContext0.resolve(schema0);
    schema1.hashCode();
    Schema schema2 = Schema.applyAliases(schema0, schema1);
    assertTrue(schema2.equals((Object) schema1));
    assertTrue(schema1.equals((Object) schema0));
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test042() throws Throwable {
    Stack<Schema.Field> stack0 = new Stack<Schema.Field>();
    Schema schema0 = Schema.createRecord((List<Schema.Field>) stack0);
    ParseContext parseContext0 = new ParseContext();
    Schema schema1 = parseContext0.resolve(schema0);
    schema1.hashCode();
    Schema schema2 = Schema.applyAliases(schema1, schema0);
    assertTrue(schema1.equals((Object) schema0));
    assertTrue(schema0.equals((Object) schema1));
    assertNotSame(schema2, schema0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test043() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    schema0.hashCode();
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test044() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.SeenPair schema_SeenPair0 = new Schema.SeenPair(schema0, (Object) null);
    boolean boolean0 = schema0.equals(schema_SeenPair0);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test045() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema schema1 = Schema.applyAliases(schema0, schema0);
    assertEquals(Schema.Type.STRING, schema1.getType());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test046() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema schema1 = Schema.parse("\"string\"", false);
    Schema schema2 = Schema.applyAliases(schema0, schema1);
    assertSame(schema2, schema0);
    assertTrue(schema2.equals((Object) schema1));
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test047() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    // Undeclared exception!
    try {
      schema0.getNamespace();
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not a named type: [\"string\"]
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test048() throws Throwable {
    Schema schema0 = Schema.createMap((Schema) null);
    // Undeclared exception!
    try {
      schema0.getEnumSymbols();
      fail("Expecting exception: NullPointerException");

    } catch (NullPointerException e) {
      //
      // no message in exception (getMessage() returned null)
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test049() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    List<Schema> list0 = List.of(schema0);
    String string0 = schema0.toString((Collection<Schema>) list0, true);
    assertEquals("\"string\"", string0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test050() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    String string0 = schema0.toString((Collection<Schema>) null, false);
    assertEquals("[\"string\"]", string0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test051() throws Throwable {
    Schema.Type schema_Type0 = Schema.Type.RECORD;
    // Undeclared exception!
    try {
      Schema.create(schema_Type0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Can't create a: RECORD
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test052() throws Throwable {
    Schema.Type schema_Type0 = Schema.Type.ARRAY;
    String string0 = schema_Type0.getName();
    assertEquals("array", string0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test053() throws Throwable {
    Schema.Type schema_Type0 = Schema.Type.FLOAT;
    Schema schema0 = Schema.create(schema_Type0);
    assertEquals(Schema.Type.FLOAT, schema0.getType());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test054() throws Throwable {
    Schema.Type schema_Type0 = Schema.Type.BYTES;
    Schema schema0 = Schema.create(schema_Type0);
    assertEquals(Schema.Type.BYTES, schema0.getType());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test055() throws Throwable {
    Schema.Type schema_Type0 = Schema.Type.BOOLEAN;
    Schema schema0 = Schema.create(schema_Type0);
    assertFalse(schema0.isUnion());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test056() throws Throwable {
    Schema.Type schema_Type0 = Schema.Type.DOUBLE;
    Schema schema0 = Schema.create(schema_Type0);
    Schema[] schemaArray0 = new Schema[2];
    schemaArray0[0] = schema0;
    schemaArray0[1] = schema0;
    // Undeclared exception!
    try {
      Schema.createUnion(schemaArray0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Duplicate in union:double
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test057() throws Throwable {
    Schema.Type schema_Type0 = Schema.Type.LONG;
    Schema schema0 = Schema.create(schema_Type0);
    assertNull(schema0.getDoc());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test058() throws Throwable {
    Schema schema0 = Schema.parse("{\n  \"type\" : \"array\",\n  \"items\" : [ \"string\" ]\n}");
    assertFalse(schema0.isUnion());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test059() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema schema1 = Schema.createArray(schema0);
    schema1.hashCode();
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test060() throws Throwable {
    Schema.LockableArrayList<Schema.Field> schema_LockableArrayList0 = new Schema.LockableArrayList<Schema.Field>();
    Schema schema0 = Schema.createRecord((List<Schema.Field>) schema_LockableArrayList0);
    schema0.addAlias("~`4nlKruU{uSiI%.rg");
    assertEquals(Schema.Type.RECORD, schema0.getType());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test061() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    String string0 = schema0.getFullName();
    assertEquals("union[string]", string0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test062() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    BooleanNode booleanNode0 = BooleanNode.FALSE;
    boolean boolean0 = schema0.isValidDefault(booleanNode0);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test063() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Integer integer0 = schema0.getIndexNamed("");
    assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test064() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    // Undeclared exception!
    try {
      schema0.addProp("; expected Class<PropertyNamingStrategy>", "; expected Class<PropertyNamingStrategy>");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Can't set properties on a union: [\"string\"]
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test065() throws Throwable {
    Schema.Names schema_Names0 = new Schema.Names("kE6tG");
    String string0 = schema_Names0.space();
    assertEquals("kE6tG", string0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test066() throws Throwable {
    Schema.Names schema_Names0 = new Schema.Names("Cannot parse <null> schema");
    schema_Names0.space("Cannot parse <null> schema");
    assertEquals("Cannot parse <null> schema", schema_Names0.space());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test067() throws Throwable {
    Schema.Parser schema_Parser0 = new Schema.Parser((NameValidator) null);
    boolean boolean0 = schema_Parser0.getValidateDefaults();
    assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test068() throws Throwable {
    ParseContext parseContext0 = new ParseContext();
    Schema.Parser schema_Parser0 = new Schema.Parser(parseContext0);
    LinkedHashSet<Schema> linkedHashSet0 = new LinkedHashSet<Schema>();
    ArrayList<String> arrayList0 = new ArrayList<String>();
    Schema schema0 = Schema.createEnum((String) null, (String) null, "", (List<String>) arrayList0);
    linkedHashSet0.add(schema0);
    // Undeclared exception!
    try {
      schema_Parser0.addTypes((Iterable<Schema>) linkedHashSet0);
      fail("Expecting exception: NullPointerException");

    } catch (NullPointerException e) {
      //
      // no message in exception (getMessage() returned null)
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test069() throws Throwable {
    Schema.Parser schema_Parser0 = new Schema.Parser((NameValidator) null);
    // Undeclared exception!
    try {
      schema_Parser0.parseInternal("pBh3+xSFwTF#Dk");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // com.fasterxml.jackson.core.JsonParseException: Unrecognized token 'pBh3': was
      // expecting (JSON String, Number, Array, Object or token 'null', 'true' or
      // 'false')
      // at [Source: (String)\"pBh3+xSFwTF#Dk\"; line: 1, column: 5]
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test070() throws Throwable {
    Schema.Parser schema_Parser0 = new Schema.Parser((NameValidator) null);
    assertTrue(schema_Parser0.getValidateDefaults());

    schema_Parser0.setValidateDefaults(false);
    assertFalse(schema_Parser0.getValidateDefaults());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test071() throws Throwable {
    Schema.Parser schema_Parser0 = new Schema.Parser();
    schema_Parser0.getTypes();
    assertTrue(schema_Parser0.getValidateDefaults());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test072() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Set<String> set0 = ZoneId.getAvailableZoneIds();
    // Undeclared exception!
    try {
      schema0.fieldsToJson(set0, "I/SOu}]ve?H:", (JsonGenerator) null);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not a record: [\"string\"]
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test073() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    // Undeclared exception!
    try {
      schema0.getFields();
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not a record: \"string\"
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test074() throws Throwable {
    ArrayList<String> arrayList0 = new ArrayList<String>();
    // Undeclared exception!
    try {
      Schema.createEnum("G", "G", "G", (List<String>) arrayList0, "G");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // The Enum Default: G is not in the enum symbol set: []
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test075() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    // Undeclared exception!
    try {
      schema0.hasEnumSymbol("schema is required and cannot be null");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not an enum: [\"string\"]
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test076() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    LinkedList<Schema.Field> linkedList0 = new LinkedList<Schema.Field>();
    // Undeclared exception!
    try {
      schema0.setFields(linkedList0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not a record: [\"string\"]
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test079() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    // Undeclared exception!
    try {
      schema0.addAlias("]*\"f0}y>RwI|)oVS", "]*\"f0}y>RwI|)oVS");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not a named type: [\"string\"]
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test081() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    // Undeclared exception!
    try {
      schema0.getFixedSize();
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not fixed: [\"string\"]
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test082() throws Throwable {
    ParseContext parseContext0 = new ParseContext();
    Schema schema0 = parseContext0.find(".", ".");
    assertEquals("unresolved schema", schema0.getDoc());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test083() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    // Undeclared exception!
    try {
      schema0.getEnumDefault();
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not an enum: [\"string\"]
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test084() throws Throwable {
    Schema schema0 = Schema.createFixed("org.apache.avro.compiler.UnresolvedSchema_490",
        "org.apache.avro.compiler.UnresolvedSchema_490", "org.apache.avro.compiler.UnresolvedSchema_490", 1143);
    assertEquals(Schema.Type.FIXED, schema0.getType());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test085() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema schema1 = Schema.createArray(schema0);
    Schema.LockableArrayList<Schema> schema_LockableArrayList0 = new Schema.LockableArrayList<Schema>();
    String string0 = schema1.toString((Collection<Schema>) schema_LockableArrayList0, true);
    assertEquals("{\n  \"type\" : \"array\",\n  \"items\" : [ \"string\" ]\n}", string0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test086() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    // Undeclared exception!
    try {
      schema0.addAlias("@class");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not a named type: [\"string\"]
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test087() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    // Undeclared exception!
    try {
      schema0.hasFields();
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not a record: [\"string\"]
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test088() throws Throwable {
    // Undeclared exception!
    try {
      Schema.parse((InputStream) null);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Cannot parse <null> schema
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test089() throws Throwable {
    // Undeclared exception!
    try {
      Schema.parseJsonToObject("org.apache.avro.compiler.UnresolvedSchema_154");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // com.fasterxml.jackson.core.JsonParseException: Unrecognized token 'org': was
      // expecting (JSON String, Number, Array, Object or token 'null', 'true' or
      // 'false')
      // at [Source: (String)\"org.apache.avro.compiler.UnresolvedSchema_154\"; line:
      // 1, column: 4]
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test090() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    // Undeclared exception!
    try {
      schema0.getAliases();
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not a named type: [\"string\"]
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test091() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    // Undeclared exception!
    try {
      schema0.getField("");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not a record: [\"string\"]
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test093() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Object object0 = schema0.writeReplace();
    assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test094() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    // Undeclared exception!
    try {
      schema0.isError();
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not a record: [\"string\"]
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test095() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    // Undeclared exception!
    try {
      schema0.getEnumOrdinal("com.fasterxml.jackson");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not an enum: [\"string\"]
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test096() throws Throwable {
    Schema.LockableArrayList<String> schema_LockableArrayList0 = new Schema.LockableArrayList<String>();
    Schema.Names schema_Names0 = new Schema.Names("pqzcgx<f=D");
    boolean boolean0 = schema_LockableArrayList0.remove((Object) schema_Names0);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test097() throws Throwable {
    Schema.LockableArrayList<Schema.LockableArrayList<Object>> schema_LockableArrayList0 = new Schema.LockableArrayList<Schema.LockableArrayList<Object>>(
        1975);
    // Undeclared exception!
    try {
      schema_LockableArrayList0.remove(1975);
      fail("Expecting exception: IndexOutOfBoundsException");

    } catch (IndexOutOfBoundsException e) {
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test098() throws Throwable {
    Schema.LockableArrayList<Schema.Field> schema_LockableArrayList0 = new Schema.LockableArrayList<Schema.Field>(10);
    Schema.LockableArrayList<CoercionAction> schema_LockableArrayList1 = new Schema.LockableArrayList<CoercionAction>(
        10);
    boolean boolean0 = schema_LockableArrayList0.retainAll(schema_LockableArrayList1);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test099() throws Throwable {
    Schema.LockableArrayList<String> schema_LockableArrayList0 = new Schema.LockableArrayList<String>();
    schema_LockableArrayList0.clear();
    assertTrue(schema_LockableArrayList0.isEmpty());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test100() throws Throwable {
    Schema schema0 = Schema.createMap((Schema) null);
    // Undeclared exception!
    try {
      schema0.hashCode();
      fail("Expecting exception: NullPointerException");

    } catch (NullPointerException e) {
      //
      // no message in exception (getMessage() returned null)
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test00() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    JsonNodeFactory jsonNodeFactory0 = JsonNodeFactory.withExactBigDecimals(false);
    ObjectNode objectNode0 = new ObjectNode(jsonNodeFactory0);
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.ASCENDING;
    Schema.Field schema_Field0 = new Schema.Field("CF", schema0, "", objectNode0, false, schema_Field_Order0);
    Schema.Field schema_Field1 = new Schema.Field("CF", schema0);
    boolean boolean0 = schema_Field0.equals(schema_Field1);
    assertFalse(boolean0);
    assertEquals("", schema_Field0.doc());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test01() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field schema_Field0 = new Schema.Field("CF", schema0);
    Schema.Field schema_Field1 = new Schema.Field("CF", schema0, "?Pv:tMjdnrUi,#q");
    boolean boolean0 = schema_Field0.equals(schema_Field1);
    assertTrue(boolean0);
    assertEquals("?Pv:tMjdnrUi,#q", schema_Field1.doc());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test02() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    JsonNodeFactory jsonNodeFactory0 = JsonNodeFactory.withExactBigDecimals(false);
    ObjectNode objectNode0 = new ObjectNode(jsonNodeFactory0);
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.ASCENDING;
    Schema.Field schema_Field0 = new Schema.Field("CF", schema0, "CF", objectNode0, false, schema_Field_Order0);
    schema_Field0.addProp("CF", "CF");
    Schema.Field schema_Field1 = new Schema.Field("CF", schema0, "CF", objectNode0, false, schema_Field_Order0);
    boolean boolean0 = schema_Field1.equals(schema_Field0);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test03() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    JsonNodeFactory jsonNodeFactory0 = JsonNodeFactory.withExactBigDecimals(false);
    ObjectNode objectNode0 = new ObjectNode(jsonNodeFactory0);
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.ASCENDING;
    Schema.Field schema_Field0 = new Schema.Field("CF", schema0, "CF", objectNode0, false, schema_Field_Order0);
    Schema.Field.Order schema_Field_Order1 = Schema.Field.Order.IGNORE;
    Schema.Field schema_Field1 = new Schema.Field("CF", schema0, "CF", objectNode0, false, schema_Field_Order1);
    boolean boolean0 = schema_Field1.equals(schema_Field0);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test04() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    ArrayList<Schema.Field> arrayList0 = new ArrayList<Schema.Field>();
    Schema schema1 = Schema.createRecord("IGNORE", "IGNORE", "IGNORE", false, (List<Schema.Field>) arrayList0);
    Schema.Field schema_Field0 = new Schema.Field("IGNORE", schema0, "IGNORE");
    Schema.Field schema_Field1 = new Schema.Field("IGNORE", schema1);
    boolean boolean0 = schema_Field0.equals(schema_Field1);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test05() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema.Field schema_Field0 = new Schema.Field("IGNORE", schema0, "IGNORE");
    Schema.Field schema_Field1 = new Schema.Field("CF", schema0);
    boolean boolean0 = schema_Field0.equals(schema_Field1);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test06() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    JsonNodeFactory jsonNodeFactory0 = JsonNodeFactory.withExactBigDecimals(false);
    ObjectNode objectNode0 = new ObjectNode(jsonNodeFactory0);
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.ASCENDING;
    Schema.Field schema_Field0 = new Schema.Field("CF", schema0, "CF", objectNode0, false, schema_Field_Order0);
    Schema.Field schema_Field1 = new Schema.Field("CF", schema0);
    boolean boolean0 = schema_Field1.equals(schema_Field0);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test07() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    JsonNodeFactory jsonNodeFactory0 = JsonNodeFactory.withExactBigDecimals(false);
    ObjectNode objectNode0 = new ObjectNode(jsonNodeFactory0);
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.ASCENDING;
    Schema.Field schema_Field0 = new Schema.Field("CF", schema0, "CF", objectNode0, false, schema_Field_Order0);
    boolean boolean0 = schema_Field0.equals(schema_Field0);
    assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test08() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    JsonNodeFactory jsonNodeFactory0 = JsonNodeFactory.withExactBigDecimals(false);
    ObjectNode objectNode0 = new ObjectNode(jsonNodeFactory0);
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.ASCENDING;
    Schema.Field schema_Field0 = new Schema.Field("CF", schema0, "CF", objectNode0, false, schema_Field_Order0);
    boolean boolean0 = schema_Field0.equals(objectNode0);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test09() throws Throwable {
    ParseContext parseContext0 = new ParseContext();
    Schema schema0 = parseContext0.find("IGNORE", "IGNORE");
    Schema.Field schema_Field0 = new Schema.Field("IGNORE", schema0);
    Set<String> set0 = schema_Field0.aliases();
    assertFalse(set0.contains("IGNORE"));
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test10() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field schema_Field0 = new Schema.Field("CF", schema0);
    schema_Field0.addAlias("CF");
    Set<String> set0 = schema_Field0.aliases();
    assertTrue(set0.contains("CF"));
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test11() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    JsonNodeFactory jsonNodeFactory0 = JsonNodeFactory.withExactBigDecimals(false);
    ObjectNode objectNode0 = new ObjectNode(jsonNodeFactory0);
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.ASCENDING;
    Schema.Field schema_Field0 = new Schema.Field("CF", schema0, "CF", objectNode0, false, schema_Field_Order0);
    schema_Field0.addAlias("-");
    schema_Field0.addAlias("CF");
    assertEquals("CF", schema_Field0.doc());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test12() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    JsonNodeFactory jsonNodeFactory0 = JsonNodeFactory.withExactBigDecimals(false);
    ObjectNode objectNode0 = new ObjectNode(jsonNodeFactory0);
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.ASCENDING;
    Schema.Field schema_Field0 = new Schema.Field("CF", schema0, "", objectNode0, false, schema_Field_Order0);
    boolean boolean0 = schema_Field0.hasDefaultValue();
    assertTrue(boolean0);
    assertEquals("", schema_Field0.doc());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test13() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema.Field schema_Field0 = new Schema.Field("CF", schema0);
    boolean boolean0 = schema_Field0.hasDefaultValue();
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test14() throws Throwable {
    Object object0 = Schema.Field.NULL_DEFAULT_VALUE;
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.ASCENDING;
    Schema.Field schema_Field0 = null;
    try {
      schema_Field0 = new Schema.Field("VCYe|`+Hz", (Schema) null, "VCYe|`+Hz", object0, schema_Field_Order0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Illegal character in: VCYe|`+Hz
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test15() throws Throwable {
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.ASCENDING;
    Schema.Field schema_Field0 = null;
    try {
      schema_Field0 = new Schema.Field("Order cannot be null", (Schema) null, "Order cannot be null", (Object) null,
          schema_Field_Order0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Illegal character in: Order cannot be null
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test16() throws Throwable {
    Protocol protocol0 = new Protocol("", "", "");
    Object object0 = Schema.Field.NULL_DEFAULT_VALUE;
    Schema.Field schema_Field0 = null;
    try {
      schema_Field0 = new Schema.Field("", protocol0.SYSTEM_ERROR, "", object0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Empty name
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test17() throws Throwable {
    Schema schema0 = Schema.createArray((Schema) null);
    Schema.Field schema_Field0 = null;
    try {
      schema_Field0 = new Schema.Field("", schema0, "", "");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Empty name
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test18() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field schema_Field0 = new Schema.Field("CF", schema0);
    schema_Field0.addAlias("");
    Schema.Field schema_Field1 = new Schema.Field(schema_Field0, schema0);
    assertFalse(schema_Field1.hasDefaultValue());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test19() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema.Field schema_Field0 = new Schema.Field("IGNORE", schema0);
    Schema.Field schema_Field1 = new Schema.Field(schema_Field0, schema0);
    assertTrue(schema_Field1.equals((Object) schema_Field0));
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test20() throws Throwable {
    ParseContext parseContext0 = new ParseContext();
    Schema schema0 = parseContext0.find("IGNORE", "IGNORE");
    Schema.Field schema_Field0 = new Schema.Field("IGNORE", schema0);
    int int0 = schema_Field0.pos();
    assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test21() throws Throwable {
    ParseContext parseContext0 = new ParseContext();
    Schema schema0 = parseContext0.find("IGNORE", "IGNORE");
    Schema.Field schema_Field0 = new Schema.Field("IGNORE", schema0);
    Object object0 = schema_Field0.defaultVal();
    assertNull(object0);
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test22() throws Throwable {
    ParseContext parseContext0 = new ParseContext();
    Schema schema0 = parseContext0.find("IGNORE", "IGNORE");
    Schema.Field schema_Field0 = new Schema.Field("IGNORE", schema0);
    schema_Field0.hashCode();
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test23() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    JsonNodeFactory jsonNodeFactory0 = JsonNodeFactory.withExactBigDecimals(false);
    ObjectNode objectNode0 = new ObjectNode(jsonNodeFactory0);
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.DESCENDING;
    Schema.Field schema_Field0 = new Schema.Field("CF", schema0, "CF", objectNode0, false, schema_Field_Order0);
    String string0 = schema_Field0.doc();
    assertEquals("CF", string0);
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test24() throws Throwable {
    ParseContext parseContext0 = new ParseContext();
    Schema schema0 = parseContext0.find("IGNORE", "IGNORE");
    Schema.Field schema_Field0 = new Schema.Field("IGNORE", schema0);
    String string0 = schema_Field0.toString();
    assertEquals("IGNORE type:RECORD pos:-1", string0);
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test25() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    ArrayList<Schema.Field> arrayList0 = new ArrayList<Schema.Field>();
    Schema.Field schema_Field0 = new Schema.Field("IGNORE", schema0);
    arrayList0.add(schema_Field0);
    Schema schema1 = Schema.createRecord("IGNORE", "IGNORE", "IGNORE", false, (List<Schema.Field>) arrayList0);
    assertFalse(schema1.equals((Object) schema0));
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test26() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    JsonNodeFactory jsonNodeFactory0 = JsonNodeFactory.withExactBigDecimals(false);
    ObjectNode objectNode0 = new ObjectNode(jsonNodeFactory0);
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.ASCENDING;
    Schema.Field schema_Field0 = new Schema.Field("CF", schema0, "CF", objectNode0, false, schema_Field_Order0);
    schema_Field0.defaultValue();
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test27() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    JsonNodeFactory jsonNodeFactory0 = JsonNodeFactory.instance;
    ObjectNode objectNode0 = new ObjectNode(jsonNodeFactory0);
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.ASCENDING;
    Schema.Field schema_Field0 = new Schema.Field("CF", schema0, "", objectNode0, false, schema_Field_Order0);
    schema_Field0.schema();
    assertEquals((-1), schema_Field0.pos());
    assertEquals("", schema_Field0.doc());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test28() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    JsonNodeFactory jsonNodeFactory0 = JsonNodeFactory.withExactBigDecimals(false);
    ObjectNode objectNode0 = new ObjectNode(jsonNodeFactory0);
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.DESCENDING;
    Schema.Field schema_Field0 = new Schema.Field("lCF", schema0, "lCF", objectNode0, false, schema_Field_Order0);
    schema_Field0.order();
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schemaParser_ESTest_test0() throws Throwable {
    ParseContext parseContext0 = new ParseContext();
    Schema.Parser schema_Parser0 = new Schema.Parser(parseContext0);
    ArrayList<Schema> arrayList0 = new ArrayList<Schema>(0);
    Schema schema0 = Schema.createUnion((List<Schema>) arrayList0);
    List<Schema> list0 = List.of(schema0);
    // Undeclared exception!
    try {
      schema_Parser0.addTypes((Iterable<Schema>) list0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // You can only put a named schema into the context
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schemaParser_ESTest_test1() throws Throwable {
    Schema.Parser schema_Parser0 = new Schema.Parser((NameValidator) null);
    // Undeclared exception!
    try {
      schema_Parser0.parseInternal("[]y`[4`)12'%x1^");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // dangling content after end of schema: y`[4`)12'%x1^
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schemaParser_ESTest_test2() throws Throwable {
    Schema.Parser schema_Parser0 = new Schema.Parser();
    boolean boolean0 = schema_Parser0.getValidateDefaults();
    assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void schemaParser_ESTest_test3() throws Throwable {
    Schema.Parser schema_Parser0 = new Schema.Parser();
    String[] stringArray0 = new String[0];
    // Undeclared exception!
    try {
      schema_Parser0.parse("", stringArray0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Cannot parse <null> schema
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schemaParser_ESTest_test4() throws Throwable {
    ParseContext parseContext0 = new ParseContext();
    Schema.Parser schema_Parser0 = new Schema.Parser(parseContext0);
    HashMap<String, Schema> hashMap0 = new HashMap<String, Schema>();
    Schema.Parser schema_Parser1 = schema_Parser0.addTypes((Map<String, Schema>) hashMap0);
    assertTrue(schema_Parser1.getValidateDefaults());
  }

  @Test(timeout = 4000)
  public void schemaParser_ESTest_test6() throws Throwable {
    Schema.Parser schema_Parser0 = new Schema.Parser();
    assertTrue(schema_Parser0.getValidateDefaults());

    schema_Parser0.setValidateDefaults(false);
    assertFalse(schema_Parser0.getValidateDefaults());
  }

  @Test(timeout = 4000)
  public void schemaParser_ESTest_test7() throws Throwable {
    Schema.Parser schema_Parser0 = new Schema.Parser();
    schema_Parser0.getTypes();
    assertTrue(schema_Parser0.getValidateDefaults());
  }

  @Test(timeout = 4000)
  public void schemaParser_ESTest_test8() throws Throwable {
    Schema.Parser schema_Parser0 = new Schema.Parser();
    // Undeclared exception!
    try {
      schema_Parser0.parse((InputStream) null);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Cannot parse <null> schema
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schemaSeenPair_ESTest_test0() throws Throwable {
    Object object0 = new Object();
    Schema.SeenPair schema_SeenPair0 = new Schema.SeenPair(object0, object0);
    Schema.SeenPair schema_SeenPair1 = new Schema.SeenPair(object0, schema_SeenPair0);
    boolean boolean0 = schema_SeenPair1.equals(schema_SeenPair0);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schemaSeenPair_ESTest_test1() throws Throwable {
    Object object0 = new Object();
    Schema.SeenPair schema_SeenPair0 = new Schema.SeenPair(object0, object0);
    Object object1 = new Object();
    Schema.SeenPair schema_SeenPair1 = new Schema.SeenPair(object1, schema_SeenPair0);
    boolean boolean0 = schema_SeenPair0.equals(schema_SeenPair1);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schemaSeenPair_ESTest_test2() throws Throwable {
    Object object0 = new Object();
    Schema.SeenPair schema_SeenPair0 = new Schema.SeenPair(object0, object0);
    boolean boolean0 = schema_SeenPair0.equals(object0);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schemaSeenPair_ESTest_test3() throws Throwable {
    Object object0 = new Object();
    Schema.SeenPair schema_SeenPair0 = new Schema.SeenPair(object0, object0);
    boolean boolean0 = schema_SeenPair0.equals(schema_SeenPair0);
    assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void schemaType_ESTest_test0() throws Throwable {
    Schema.Type schema_Type0 = Schema.Type.BOOLEAN;
    String string0 = schema_Type0.getName();
    assertEquals("boolean", string0);
  }
}
