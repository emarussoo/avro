/*
 * Derived from EvoSuite 1.2.0 output for Schema C4 and selected nested classes.
 * EvoRunner, scaffolding, EvoSuite runtime assertions, VFS/VNET dependencies,
 * unstable assertions, mock-file dependencies and non-restored global-state
 * mutations were removed.
 * The same conservative adaptation criteria used for C0-C3 were applied.
 */
package org.apache.avro;

import static org.junit.Assert.*;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.BooleanNode;
import com.fasterxml.jackson.databind.node.DoubleNode;
import com.fasterxml.jackson.databind.node.FloatNode;
import com.fasterxml.jackson.databind.node.IntNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.LongNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.File;
import java.io.InputStream;
import java.time.chrono.MinguoEra;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;
import org.apache.avro.LogicalType;
import org.apache.avro.NameValidator;
import org.apache.avro.ParseContext;
import org.apache.avro.Protocol;
import org.apache.avro.Schema;
import org.junit.Test;

public class ISW2SchemaC4ESTest {

  @Test(timeout = 4000)
  public void schema_ESTest_test000() throws Throwable {
    Schema.LockableArrayList<Schema.Field> schema_LockableArrayList0 = new Schema.LockableArrayList<Schema.Field>();
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field schema_Field0 = new Schema.Field("stri", schema0);
    schema_LockableArrayList0.add(schema_Field0);
    Schema schema1 = Schema.createRecord("stri", "stri", "stri", true, (List<Schema.Field>) schema_LockableArrayList0);
    schema_Field0.addAlias((String) null);
    assertEquals(0, schema_Field0.pos());

    Schema schema2 = Schema.createFixed("stri", "stri", (String) null, 5);
    schema1.addAlias("stri", "stri");
    Schema.applyAliases(schema2, schema1);
    assertFalse(schema2.equals((Object) schema1));
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test001() throws Throwable {
    Schema.LockableArrayList<Schema.Field> schema_LockableArrayList0 = new Schema.LockableArrayList<Schema.Field>();
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field schema_Field0 = new Schema.Field("stri", schema0);
    schema_LockableArrayList0.add(schema_Field0);
    Schema schema1 = Schema.createRecord("stri", "stri", "stri", true, (List<Schema.Field>) schema_LockableArrayList0);
    Schema schema2 = Schema.applyAliases(schema0, schema1);
    assertEquals(Schema.Type.STRING, schema2.getType());
    assertFalse(schema2.equals((Object) schema1));
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test002() throws Throwable {
    Schema schema0 = Schema.createFixed("pH", "type", "type", 14);
    schema0.addAlias("type", "type");
    Schema schema1 = Schema.createArray(schema0);
    Schema schema2 = Schema.applyAliases(schema0, schema1);
    assertFalse(schema2.equals((Object) schema1));
    assertEquals("type", schema2.getDoc());
    assertSame(schema2, schema0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test003() throws Throwable {
    Schema schema0 = Schema.createFixed("type", "type", "type", 14);
    schema0.addAlias("type", "type");
    Schema schema1 = Protocol.SYSTEM_ERRORS;
    Schema schema2 = Schema.applyAliases(schema1, schema0);
    assertTrue(schema2.equals((Object) schema1));
    assertNotSame(schema2, schema1);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test004() throws Throwable {
    Schema schema0 = Schema.createFixed("type", "type", "type", 12);
    schema0.addAlias("type", "type");
    Schema[] schemaArray0 = new Schema[0];
    Schema schema1 = Schema.createUnion(schemaArray0);
    Schema schema2 = Schema.applyAliases(schema1, schema0);
    assertNotSame(schema2, schema1);
    assertTrue(schema2.equals((Object) schema1));
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test005() throws Throwable {
    // Undeclared exception!
    try {
      Schema.parse("{\"type\":\"record\",\"fields\":[]}");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // No name in schema: {\"type\":\"record\",\"fields\":[]}
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test006() throws Throwable {
    Schema.Parser schema_Parser0 = new Schema.Parser();
    // Undeclared exception!
    try {
      schema_Parser0.parse("5");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Schema not yet supported: 5
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test007() throws Throwable {
    Schema schema0 = Schema.parse(
        "{\"type\":\"enum\",\"name\":\"USE_GETTERS_AS_SETTERS\",\"namespace\":\"USE_GETTERS_AS_SETTERS\",\"doc\":\"USE_GETTERS_AS_SETTERS\",\"symbols\":[]}");
    assertEquals("USE_GETTERS_AS_SETTERS", schema0.getDoc());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test008() throws Throwable {
    Schema schema0 = Schema.parse(
        "{\n  \"type\" : \"fixed\",\n  \"name\" : \"type\",\n  \"namespace\" : \"type\",\n  \"doc\" : \"type\",\n  \"size\" : 16\n}");
    assertFalse(schema0.isUnion());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test009() throws Throwable {
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
  public void schema_ESTest_test010() throws Throwable {
    Schema.LockableArrayList<Schema.Field> schema_LockableArrayList0 = new Schema.LockableArrayList<Schema.Field>();
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field schema_Field0 = new Schema.Field("stri", schema0);
    schema_LockableArrayList0.add(schema_Field0);
    Schema schema1 = Schema.createRecord("stri", "stri", "stri", true, (List<Schema.Field>) schema_LockableArrayList0);
    JsonNodeFactory jsonNodeFactory0 = JsonNodeFactory.instance;
    ObjectNode objectNode0 = new ObjectNode(jsonNodeFactory0);
    ObjectNode objectNode1 = objectNode0.put("stri", "stri");
    boolean boolean0 = schema1.isValidDefault(objectNode1);
    assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test011() throws Throwable {
    Schema schema0 = Schema.createMap((Schema) null);
    JsonNodeFactory jsonNodeFactory0 = JsonNodeFactory.instance;
    ObjectNode objectNode0 = new ObjectNode(jsonNodeFactory0);
    objectNode0.putNull("/Hc_uB,0");
    // Undeclared exception!
    try {
      schema0.isValidDefault(objectNode0);
      fail("Expecting exception: NullPointerException");

    } catch (NullPointerException e) {
      //
      // no message in exception (getMessage() returned null)
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test012() throws Throwable {
    Schema schema0 = Schema.createMap((Schema) null);
    JsonNodeFactory jsonNodeFactory0 = JsonNodeFactory.instance;
    ObjectNode objectNode0 = new ObjectNode(jsonNodeFactory0);
    boolean boolean0 = schema0.isValidDefault(objectNode0);
    assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test013() throws Throwable {
    Schema.Type schema_Type0 = Schema.Type.LONG;
    Schema schema0 = Schema.create(schema_Type0);
    LongNode longNode0 = new LongNode(2644L);
    boolean boolean0 = schema0.isValidDefault(longNode0);
    assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test014() throws Throwable {
    Schema.Type schema_Type0 = Schema.Type.INT;
    Schema schema0 = Schema.create(schema_Type0);
    JsonNodeFactory jsonNodeFactory0 = JsonNodeFactory.instance;
    ObjectNode objectNode0 = new ObjectNode(jsonNodeFactory0);
    boolean boolean0 = schema0.isValidDefault(objectNode0);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test015() throws Throwable {
    Schema.Type schema_Type0 = Schema.Type.BOOLEAN;
    Schema schema0 = Schema.create(schema_Type0);
    JsonNodeFactory jsonNodeFactory0 = JsonNodeFactory.instance;
    ObjectNode objectNode0 = jsonNodeFactory0.objectNode();
    boolean boolean0 = schema0.isValidDefault(objectNode0);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test016() throws Throwable {
    Schema schema0 = Schema.createFixed("ibn9V2", "ibn9V2", "ibn9V2", 512);
    FloatNode floatNode0 = FloatNode.valueOf(512);
    boolean boolean0 = schema0.isValidDefault(floatNode0);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test017() throws Throwable {
    Schema schema0 = Schema.createArray((Schema) null);
    JsonNodeFactory jsonNodeFactory0 = JsonNodeFactory.instance;
    ArrayNode arrayNode0 = new ArrayNode(jsonNodeFactory0, 3800);
    boolean boolean0 = schema0.isValidDefault(arrayNode0);
    assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test018() throws Throwable {
    Stack<String> stack0 = new Stack<String>();
    Schema schema0 = Schema.createEnum("USE_GETTERS_AS_SETERS", "USE_GETTERS_AS_SETERS", "USE_GETTERS_AS_SETERS",
        (List<String>) stack0);
    BooleanNode booleanNode0 = BooleanNode.getTrue();
    boolean boolean0 = schema0.isValidDefault(booleanNode0);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test019() throws Throwable {
    Schema schema0 = Schema.createArray((Schema) null);
    boolean boolean0 = schema0.isValidDefault((JsonNode) null);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test020() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field schema_Field0 = new Schema.Field("m", schema0, "m", "m");
    assertEquals(Schema.Field.Order.ASCENDING, schema_Field0.order());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test021() throws Throwable {
    Schema.Names schema_Names0 = new Schema.Names("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer");
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema.Name schema_Name0 = new Schema.Name("com.fasterxml.jackson.databind.introspect.BasicBeanDescription", ".F");
    schema_Names0.put(schema_Name0, schema0);
    schema_Names0.put(schema_Name0, schema0);
    assertEquals("com.fasterxml.jackson.databind.introspect.BasicBeanDescription", schema_Name0.toString());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test022() throws Throwable {
    Schema schema0 = Schema.createFixed("com.fasterxml.jacksondatabnd.deser.std.SdDelegatingDeserializer", "charOffset",
        "float", 512);
    Schema.Names schema_Names0 = new Schema.Names();
    Schema.Name schema_Name0 = new Schema.Name("com.fasterxml.jacksondatabnd.deser.std.SdDelegatingDeserializer",
        "com.fasterxml.jacksondatabnd.deser.std.SdDelegatingDeserializer");
    schema_Names0.put(schema_Name0, schema0);
    assertEquals("com.fasterxml.jacksondatabnd.deser.std.SdDelegatingDeserializer", schema_Name0.toString());

    boolean boolean0 = schema_Names0.contains(schema0);
    assertEquals("charOffset", schema0.getDoc());
    assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test023() throws Throwable {
    Schema.Names schema_Names0 = new Schema.Names();
    Schema schema0 = Schema.createFixed("ibn9V2", "ibn9V2", "ibn9V2", 512);
    boolean boolean0 = schema_Names0.contains(schema0);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test024() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Names schema_Names0 = new Schema.Names("org.apache.avro.compiler.UnresolvedSchema_87");
    Schema.Name schema_Name0 = new Schema.Name("org.apache.avro.compiler.UnresolvedSchema_87", "o:;HPd6HU8?HD^");
    schema_Names0.put(schema_Name0, schema0);
    Schema schema1 = schema_Names0.get("org.apache.avro.compiler.UnresolvedSchema_87");
    assertFalse(schema1.isUnion());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test025() throws Throwable {
    // Undeclared exception!
    try {
      Schema.parse("type", true);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // com.fasterxml.jackson.core.JsonParseException: Unrecognized token 'type': was
      // expecting (JSON String, Number, Array, Object or token 'null', 'true' or
      // 'false')
      // at [Source: (String)\"type\"; line: 1, column: 5]
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test026() throws Throwable {
    // Undeclared exception!
    try {
      Schema.parse((String) null, false);
      fail("Expecting exception: NullPointerException");

    } catch (NullPointerException e) {
      //
      // no message in exception (getMessage() returned null)
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test027() throws Throwable {
    Schema.Parser schema_Parser0 = new Schema.Parser();
    String[] stringArray0 = new String[4];
    // Undeclared exception!
    try {
      schema_Parser0.parse("c)j2;7`W;-RG.E7NUM", stringArray0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // com.fasterxml.jackson.core.JsonParseException: Unrecognized token 'c': was
      // expecting (JSON String, Number, Array, Object or token 'null', 'true' or
      // 'false')
      // at [Source: (String)\"c)j2;7`W;-RG.E7NUMnullnullnullnull\"; line: 1, column:
      // 2]
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test028() throws Throwable {
    NameValidator nameValidator0 = Schema.getNameValidator();
    Schema.Parser schema_Parser0 = new Schema.Parser(nameValidator0);
    Schema[] schemaArray0 = new Schema[5];
    Schema.LockableArrayList<Schema> schema_LockableArrayList0 = new Schema.LockableArrayList<Schema>(schemaArray0);
    // Undeclared exception!
    try {
      schema_Parser0.addTypes((Iterable<Schema>) schema_LockableArrayList0);
      fail("Expecting exception: NullPointerException");

    } catch (NullPointerException e) {
      //
      // no message in exception (getMessage() returned null)
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test029() throws Throwable {
    Schema schema0 = Schema.createFixed("type", "type", "type", 12);
    schema0.addAlias("type", "type");
    Schema schema1 = Schema.createMap(schema0);
    LogicalType logicalType0 = new LogicalType("org.apache.avro.compiler.UnresolvedSchema_432");
    Schema schema2 = logicalType0.addToSchema(schema0);
    Schema schema3 = Schema.applyAliases(schema2, schema1);
    assertNotSame(schema3, schema2);
    assertTrue(schema3.equals((Object) schema2));
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test030() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema.LockableArrayList<Schema> schema_LockableArrayList0 = new Schema.LockableArrayList<Schema>(13);
    Schema schema1 = Schema.createUnion((List<Schema>) schema_LockableArrayList0);
    Schema schema2 = Schema.applyAliases(schema1, schema0);
    assertFalse(schema2.equals((Object) schema0));
    assertSame(schema2, schema1);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test031() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema schema1 = Schema.applyAliases(schema0, schema0);
    assertSame(schema1, schema0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test032() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema[] schemaArray0 = new Schema[9];
    schemaArray0[0] = schema0;
    schemaArray0[1] = schema0;
    // Undeclared exception!
    try {
      Schema.createUnion(schemaArray0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Duplicate in union:string
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test033() throws Throwable {
    LinkedList<Schema.Field> linkedList0 = new LinkedList<Schema.Field>();
    Schema schema0 = Schema.createRecord((List<Schema.Field>) linkedList0);
    Schema[] schemaArray0 = new Schema[1];
    schemaArray0[0] = schema0;
    // Undeclared exception!
    try {
      Schema.createUnion(schemaArray0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Nameless in union:[{\"type\":\"record\",\"fields\":[]}]
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test034() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema[] schemaArray0 = new Schema[2];
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
  public void schema_ESTest_test035() throws Throwable {
    Schema schema0 = Schema.createFixed("com.fasterxml.jacksondatabnd.deser.std.SdDelegatingDeserializer",
        "com.fasterxml.jacksondatabnd.deser.std.SdDelegatingDeserializer",
        "com.fasterxml.jacksondatabnd.deser.std.SdDelegatingDeserializer", 14);
    Schema schema1 = Schema.createArray(schema0);
    schema1.addProp("com.fasterxml.jacksondatabnd.deser.std.SdDelegatingDeserializer", "fixed");
    Schema schema2 = Schema.createArray(schema0);
    Schema schema3 = Schema.applyAliases(schema1, schema2);
    assertFalse(schema3.equals((Object) schema2));
    assertSame(schema3, schema1);
    assertFalse(schema0.equals((Object) schema2));
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test036() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema schema1 = Schema.createArray(schema0);
    Schema schema2 = Schema.createArray(schema0);
    Schema schema3 = Schema.applyAliases(schema1, schema2);
    assertFalse(schema3.equals((Object) schema0));
    assertTrue(schema3.equals((Object) schema2));
    assertFalse(schema0.equals((Object) schema2));
    assertNotSame(schema3, schema2);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test037() throws Throwable {
    Schema schema0 = Schema.createRecord("type", "type", "type", false);
    Schema schema1 = Schema.createArray(schema0);
    Schema schema2 = Schema.createArray(schema1);
    // Undeclared exception!
    try {
      Schema.applyAliases(schema1, schema2);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Schema fields not set yet
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test038() throws Throwable {
    List<String> list0 = List.of("pH");
    Schema schema0 = Schema.createEnum("De", "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer",
        "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", list0);
    // Undeclared exception!
    try {
      schema0.getValueType();
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not a map:
      // {\"type\":\"enum\",\"name\":\"De\",\"namespace\":\"com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer\",\"doc\":\"com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer\",\"symbols\":[\"pH\"]}
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test039() throws Throwable {
    Schema.LockableArrayList<String> schema_LockableArrayList0 = new Schema.LockableArrayList<String>();
    Schema schema0 = Schema.createEnum("-)L&pNEb.USE_GETTERS_AS_SETTERS", (String) null,
        "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked",
        (List<String>) schema_LockableArrayList0);
    // Undeclared exception!
    try {
      schema0.getFixedSize();
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not fixed:
      // {\"type\":\"enum\",\"name\":\"USE_GETTERS_AS_SETTERS\",\"namespace\":\"-)L&pNEb\",\"symbols\":[]}
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test040() throws Throwable {
    Stack<String> stack0 = new Stack<String>();
    Schema schema0 = Schema.createEnum("USE_GETTERS_AS_SETTERS", "USE_GETTERS_AS_SETTERS", "USE_GETTERS_AS_SETTERS",
        (List<String>) stack0);
    stack0.add("USE_GETTERS_AS_SETTERS");
    Schema schema1 = Schema.createEnum("USE_GETTERS_AS_SETTERS", "USE_GETTERS_AS_SETTERS", "USE_GETTERS_AS_SETTERS",
        (List<String>) stack0);
    Schema schema2 = Schema.applyAliases(schema0, schema1);
    assertFalse(schema2.equals((Object) schema1));
    assertSame(schema2, schema0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test041() throws Throwable {
    LinkedList<String> linkedList0 = new LinkedList<String>();
    Schema schema0 = Schema.createEnum("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter", "type",
        "type", (List<String>) linkedList0);
    Schema schema1 = Schema.createEnum("I", "Lx\"Ag_A^|h", (String) null, (List<String>) linkedList0);
    Schema schema2 = Schema.applyAliases(schema0, schema1);
    assertFalse(schema2.equals((Object) schema1));
    assertEquals("type", schema2.getDoc());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test042() throws Throwable {
    LinkedList<String> linkedList0 = new LinkedList<String>();
    Schema schema0 = Schema.createFixed("type", "type", "type", 14);
    schema0.addAlias("type", "type");
    Schema schema1 = Schema.createEnum("type", "oykHm", "oykHm", (List<String>) linkedList0);
    Schema schema2 = Schema.applyAliases(schema1, schema0);
    assertEquals("oykHm", schema2.getDoc());
    assertSame(schema2, schema1);
    assertFalse(schema2.equals((Object) schema0));
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test043() throws Throwable {
    Vector<String> vector0 = new Vector<String>();
    vector0.add("USE_GETTERS_AS_SETTERS");
    Schema schema0 = Schema.createEnum("USE_GETTERS_AS_SETTERS", "USE_GETTERS_AS_SETTERS", "USE_GETTERS_AS_SETTERS",
        (List<String>) vector0);
    boolean boolean0 = schema0.hasEnumSymbol("USE_GETTERS_AS_SETTERS");
    assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test044() throws Throwable {
    Vector<String> vector0 = new Vector<String>();
    Schema schema0 = Schema.createEnum("USE_GETTERS_AS_SETTERS", "USE_GETTERS_AS_SETTERS", "USE_GETTERS_AS_SETTERS",
        (List<String>) vector0);
    boolean boolean0 = schema0.hasEnumSymbol("USE_GETTERS_AS_SETTERS");
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test045() throws Throwable {
    Vector<String> vector0 = new Vector<String>();
    vector0.add("USE_GETTERS_AS_SETTERS");
    Schema schema0 = Schema.createEnum("USE_GETTERS_AS_SETTERS", "USE_GETTERS_AS_SETTERS", "USE_GETTERS_AS_SETTERS",
        (List<String>) vector0, "USE_GETTERS_AS_SETTERS");
    assertFalse(schema0.isUnion());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test046() throws Throwable {
    Vector<String> vector0 = new Vector<String>();
    // Undeclared exception!
    try {
      Schema.createEnum("USE_GETTERS_AS_SETTERS", "USE_GETTERS_AS_SETTERS", "USE_GETTERS_AS_SETTERS",
          (List<String>) vector0, "USE_GETTERS_AS_SETTERS");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // The Enum Default: USE_GETTERS_AS_SETTERS is not in the enum symbol set: []
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test047() throws Throwable {
    String[] stringArray0 = new String[4];
    stringArray0[0] = "fixed";
    stringArray0[1] = "fixed";
    Schema.LockableArrayList<String> schema_LockableArrayList0 = new Schema.LockableArrayList<String>(stringArray0);
    // Undeclared exception!
    try {
      Schema.createEnum("fixed", "fixed", "fixed", (List<String>) schema_LockableArrayList0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Duplicate enum symbol: fixed
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test048() throws Throwable {
    Schema schema0 = Schema.createRecord("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer",
        "org.apache.avro.Schema$BytesSchema", "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer",
        false);
    // Undeclared exception!
    try {
      schema0.getValueType();
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not a map:
      // {\"type\":\"record\",\"name\":\"StdDelegatingDeserializer\",\"namespace\":\"com.fasterxml.jackson.databind.deser.std\",\"doc\":\"org.apache.avro.Schema$BytesSchema\"}
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test051() throws Throwable {
    LinkedList<Schema.Field> linkedList0 = new LinkedList<Schema.Field>();
    Schema schema0 = Schema.createRecord((List<Schema.Field>) linkedList0);
    Schema.applyAliases(schema0, schema0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test052() throws Throwable {
    Schema.LockableArrayList<Schema.Field> schema_LockableArrayList0 = new Schema.LockableArrayList<Schema.Field>();
    Schema schema0 = Schema.createRecord("e.e", ") does not override copy(); it has to", "fpA|9]8{o@@D5u>P,", false,
        (List<Schema.Field>) schema_LockableArrayList0);
    // Undeclared exception!
    try {
      schema0.setFields(schema_LockableArrayList0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Fields are already set
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test053() throws Throwable {
    LinkedList<Schema.Field> linkedList0 = new LinkedList<Schema.Field>();
    Schema schema0 = Schema.createRecord((List<Schema.Field>) linkedList0);
    schema0.hasFields();
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test054() throws Throwable {
    Schema schema0 = Schema.createRecord("type", "type", "type", false);
    Schema schema1 = Schema.createArray(schema0);
    // Undeclared exception!
    try {
      Schema.applyAliases(schema1, schema0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Schema fields not set yet
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test055() throws Throwable {
    Schema schema0 = Schema.createRecord("map", "hWS+vWn1V<aQ", "map", false);
    // Undeclared exception!
    try {
      schema0.getField("map");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Schema fields not set yet
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test056() throws Throwable {
    LinkedList<Schema.Field> linkedList0 = new LinkedList<Schema.Field>();
    Schema schema0 = Schema.createRecord((List<Schema.Field>) linkedList0);
    schema0.getField("lK!7 SlJ>(7aZo v");
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test057() throws Throwable {
    SerializationFeature serializationFeature0 = SerializationFeature.WRITE_ENUMS_USING_TO_STRING;
    Schema.SeenPair schema_SeenPair0 = new Schema.SeenPair(serializationFeature0, (Object) null);
    boolean boolean0 = schema_SeenPair0.equals(serializationFeature0);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test058() throws Throwable {
    Schema schema0 = Schema.createMap((Schema) null);
    JsonNodeFactory jsonNodeFactory0 = JsonNodeFactory.instance;
    Schema.SeenPair schema_SeenPair0 = new Schema.SeenPair(jsonNodeFactory0, schema0);
    boolean boolean0 = schema_SeenPair0.equals(schema_SeenPair0);
    assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test059() throws Throwable {
    Schema.LockableArrayList<Schema.Field> schema_LockableArrayList0 = new Schema.LockableArrayList<Schema.Field>();
    Schema schema0 = Schema.createRecord((List<Schema.Field>) schema_LockableArrayList0);
    schema0.addAlias((String) null, "order");
    schema0.getAliases();
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test060() throws Throwable {
    Schema schema0 = Schema.createFixed("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer",
        "qv;^rQZ9R", "De", 14);
    schema0.addAlias((String) null, "De");
    Set<String> set0 = schema0.getAliases();
    assertEquals("qv;^rQZ9R", schema0.getDoc());
    assertEquals(1, set0.size());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test061() throws Throwable {
    Vector<String> vector0 = new Vector<String>();
    Schema schema0 = Schema.createEnum("USE_GETTERS_AS_SETTERS", "USE_GETTERS_AS_SETTERS", "USE_GETTERS_AS_SETTERS",
        (List<String>) vector0);
    schema0.addAlias("null", "null");
    Set<String> set0 = schema0.getAliases();
    assertEquals(1, set0.size());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test062() throws Throwable {
    Schema.LockableArrayList<Schema.Field> schema_LockableArrayList0 = new Schema.LockableArrayList<Schema.Field>();
    Schema schema0 = Schema.createRecord((List<Schema.Field>) schema_LockableArrayList0);
    ParseContext parseContext0 = new ParseContext();
    parseContext0.resolve(schema0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test063() throws Throwable {
    Schema schema0 = Schema.createFixed("type", "type", "type", 14);
    schema0.addAlias("type", "type");
    schema0.addAlias("type", "type");
    assertEquals(Schema.Type.FIXED, schema0.getType());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test064() throws Throwable {
    Schema schema0 = Schema.createFixed((String) null, (String) null, (String) null, 25);
    schema0.addAlias((String) null, (String) null);
    // Undeclared exception!
    try {
      schema0.getValueType();
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not a map: {\"type\":\"fixed\",\"size\":25,\"aliases\":[null]}
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test065() throws Throwable {
    Schema schema0 = Schema.createFixed("type", "type", "type", 14);
    schema0.addAlias("type", "type");
    // Undeclared exception!
    try {
      schema0.getValueType();
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not a map:
      // {\"type\":\"fixed\",\"name\":\"type\",\"namespace\":\"type\",\"doc\":\"type\",\"size\":14,\"aliases\":[\"type\"]}
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test066() throws Throwable {
    Schema.Name schema_Name0 = new Schema.Name((String) null, (String) null);
    // Undeclared exception!
    try {
      schema_Name0.writeName("5]\"~-gG%n:}=#P5", (JsonGenerator) null);
      fail("Expecting exception: NullPointerException");

    } catch (NullPointerException e) {
      //
      // no message in exception (getMessage() returned null)
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test067() throws Throwable {
    Vector<String> vector0 = new Vector<String>();
    Schema schema0 = Schema.createEnum("USE_GETTERS_AS_SETTERS", "USE_GETTERS_AS_SETTERS", "USE_GETTERS_AS_SETTERS",
        (List<String>) vector0);
    HashSet<String> hashSet0 = new HashSet<String>();
    DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
    ObjectMapper objectMapper0 = new ObjectMapper();
    TokenBuffer tokenBuffer0 = defaultSerializerProvider_Impl0.bufferForValueConversion((ObjectCodec) objectMapper0);
    schema0.toJson(hashSet0, "USE_GETTERS_AS_SETTERS", tokenBuffer0);
    assertFalse(tokenBuffer0.isEmpty());
    assertEquals(1, hashSet0.size());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test068() throws Throwable {
    Schema.Name schema_Name0 = new Schema.Name((String) null, "-Infinity");
    boolean boolean0 = schema_Name0.equals("-Infinity");
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test069() throws Throwable {
    Schema.Names schema_Names0 = new Schema.Names();
    Schema schema0 = schema_Names0.get("items");
    assertNull(schema0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test070() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field schema_Field0 = new Schema.Field("ENUM", schema0);
    boolean boolean0 = schema_Field0.equals("ENUM");
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test071() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field schema_Field0 = new Schema.Field("stri", schema0);
    Set<String> set0 = schema_Field0.aliases();
    assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test072() throws Throwable {
    List<String> list0 = List.of("pH");
    Schema schema0 = Schema.createEnum("De", "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer",
        "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", list0);
    Schema.Field schema_Field0 = new Schema.Field("De", schema0, "pH");
    schema_Field0.addAlias("De");
    Set<String> set0 = schema_Field0.aliases();
    assertEquals("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", schema0.getDoc());
    assertEquals("pH", schema_Field0.doc());
    assertTrue(set0.contains("De"));
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test073() throws Throwable {
    List<String> list0 = List.of("pH");
    Schema schema0 = Schema.createEnum("De", "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer",
        "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", list0);
    Schema.Field schema_Field0 = new Schema.Field("De", schema0, "pH");
    schema_Field0.addAlias("De");
    schema_Field0.addAlias("?9)CW");
    assertEquals("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", schema0.getDoc());
    assertEquals("pH", schema_Field0.doc());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test074() throws Throwable {
    Schema schema0 = Schema.createArray((Schema) null);
    LongNode longNode0 = new LongNode((-813L));
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.DESCENDING;
    Schema.Field schema_Field0 = new Schema.Field("items", schema0, "items", longNode0, false, schema_Field_Order0);
    boolean boolean0 = schema_Field0.hasDefaultValue();
    assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test075() throws Throwable {
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.DESCENDING;
    Schema.Field schema_Field0 = null;
    try {
      schema_Field0 = new Schema.Field("K\".&Z", (Schema) null, "K\".&Z", "K\".&Z", schema_Field_Order0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Illegal character in: K\".&Z
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test076() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field schema_Field0 = new Schema.Field("stri", schema0);
    Schema.Field schema_Field1 = new Schema.Field(schema_Field0, schema0);
    assertEquals((-1), schema_Field1.pos());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test077() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema schema1 = Schema.createMap(schema0);
    boolean boolean0 = schema1.equalCachedHash(schema0);
    assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test078() throws Throwable {
    Vector<String> vector0 = new Vector<String>();
    Schema schema0 = Schema.createEnum("org.apacLe.avro.idl.unresolved.name", "org.apacLe.avro.idl.unresolved.name",
        "org.apacLe.avro.idl.unresolved.name", (List<String>) vector0);
    LinkedHashSet<Schema> linkedHashSet0 = new LinkedHashSet<Schema>();
    linkedHashSet0.add(schema0);
    Schema schema1 = Schema.createEnum("org.apacLe.avro.idl.unresolved.name", "org.apacLe.avro.idl.unresolved.name",
        "org.apacLe.avro.idl.unresolved.name", (List<String>) vector0);
    Schema schema2 = Schema.applyAliases(schema0, schema1);
    assertTrue(schema2.equals((Object) schema1));
    assertTrue(schema1.equals((Object) schema0));
    assertNotSame(schema2, schema1);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test079() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    LinkedHashSet<Schema> linkedHashSet0 = new LinkedHashSet<Schema>();
    boolean boolean0 = linkedHashSet0.add(schema0);
    assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test080() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    MinguoEra minguoEra0 = MinguoEra.ROC;
    boolean boolean0 = schema0.equals(minguoEra0);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test081() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema schema1 = Schema.parse("[ \"string\" ]");
    Schema schema2 = Schema.applyAliases(schema0, schema1);
    assertTrue(schema2.equals((Object) schema1));
    assertNotSame(schema2, schema1);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test082() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    LinkedHashSet<Schema> linkedHashSet0 = new LinkedHashSet<Schema>();
    String string0 = schema0.toString((Collection<Schema>) linkedHashSet0, true);
    assertEquals("[ \"string\" ]", string0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test083() throws Throwable {
    Schema schema0 = Schema.createArray((Schema) null);
    // Undeclared exception!
    try {
      schema0.toString((Collection<Schema>) null, true);
      fail("Expecting exception: NullPointerException");

    } catch (NullPointerException e) {
      //
      // no message in exception (getMessage() returned null)
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test084() throws Throwable {
    Schema.Type schema_Type0 = Schema.Type.ENUM;
    // Undeclared exception!
    try {
      Schema.create(schema_Type0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Can't create a: ENUM
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test085() throws Throwable {
    Schema.Type schema_Type0 = Schema.Type.ARRAY;
    String string0 = schema_Type0.getName();
    assertEquals("array", string0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test086() throws Throwable {
    Schema.Type schema_Type0 = Schema.Type.FLOAT;
    Schema schema0 = Schema.create(schema_Type0);
    LongNode longNode0 = LongNode.valueOf(2644L);
    boolean boolean0 = schema0.isValidDefault(longNode0);
    assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test087() throws Throwable {
    Schema.Type schema_Type0 = Schema.Type.INT;
    Schema schema0 = Schema.create(schema_Type0);
    LongNode longNode0 = new LongNode(2644L);
    boolean boolean0 = schema0.isValidDefault(longNode0);
    assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test088() throws Throwable {
    Schema.Type schema_Type0 = Schema.Type.BYTES;
    Schema schema0 = Schema.create(schema_Type0);
    LongNode longNode0 = LongNode.valueOf(2644L);
    boolean boolean0 = schema0.isValidDefault(longNode0);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test089() throws Throwable {
    Schema.Type schema_Type0 = Schema.Type.NULL;
    Schema schema0 = Schema.create(schema_Type0);
    LongNode longNode0 = LongNode.valueOf(2644L);
    boolean boolean0 = schema0.isValidDefault(longNode0);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test091() throws Throwable {
    Schema.Type schema_Type0 = Schema.Type.DOUBLE;
    Schema schema0 = Schema.create(schema_Type0);
    JsonNodeFactory jsonNodeFactory0 = JsonNodeFactory.instance;
    ObjectNode objectNode0 = jsonNodeFactory0.objectNode();
    boolean boolean0 = schema0.isValidDefault(objectNode0);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test092() throws Throwable {
    Schema.Type schema_Type0 = Schema.Type.LONG;
    Schema schema0 = Schema.create(schema_Type0);
    BooleanNode booleanNode0 = BooleanNode.TRUE;
    boolean boolean0 = schema0.isValidDefault(booleanNode0);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test093() throws Throwable {
    Schema.LockableArrayList<Schema.Field> schema_LockableArrayList0 = new Schema.LockableArrayList<Schema.Field>();
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field schema_Field0 = new Schema.Field("stri", schema0);
    schema_LockableArrayList0.add(schema_Field0);
    Schema schema1 = Schema.createRecord("stri", "stri", "stri", true, (List<Schema.Field>) schema_LockableArrayList0);
    schema_Field0.addAlias((String) null);
    Schema schema2 = Schema.createArray(schema1);
    Schema schema3 = Schema.applyAliases(schema2, schema1);
    assertSame(schema3, schema2);
    assertEquals(Schema.Type.ARRAY, schema3.getType());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test094() throws Throwable {
    Schema schema0 = Schema.createArray((Schema) null);
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
  public void schema_ESTest_test096() throws Throwable {
    Schema schema0 = Schema.createFixed("type", "type", "type", 12);
    schema0.addAlias("type", "type");
    Schema schema1 = Schema.createMap(schema0);
    Schema schema2 = Schema.applyAliases(schema0, schema1);
    assertNotSame(schema2, schema0);
    assertTrue(schema2.equals((Object) schema0));
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test097() throws Throwable {
    Schema schema0 = Schema.createFixed("type", "type", "type", 12);
    schema0.addAlias("type");
    assertEquals(Schema.Type.FIXED, schema0.getType());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test098() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    String string0 = schema0.getFullName();
    assertEquals("union[string]", string0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test099() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    IntNode intNode0 = new IntNode((-3727));
    boolean boolean0 = schema0.isValidDefault(intNode0);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test100() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Integer integer0 = schema0.getIndexNamed((String) null);
    assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test101() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    LogicalType logicalType0 = new LogicalType(", new = ");
    // Undeclared exception!
    try {
      logicalType0.addToSchema(schema0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Can't set properties on a union: [\"string\"]
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test102() throws Throwable {
    Schema.Names schema_Names0 = new Schema.Names();
    String string0 = schema_Names0.space();
    assertNull(string0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test103() throws Throwable {
    Schema.Names schema_Names0 = new Schema.Names();
    schema_Names0.space("ibn9V2");
    assertEquals("ibn9V2", schema_Names0.space());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test104() throws Throwable {
    Schema.Names schema_Names0 = new Schema.Names();
    // Undeclared exception!
    try {
      schema_Names0.add((Schema) null);
      fail("Expecting exception: NullPointerException");

    } catch (NullPointerException e) {
      //
      // no message in exception (getMessage() returned null)
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test105() throws Throwable {
    Schema.Parser schema_Parser0 = new Schema.Parser();
    boolean boolean0 = schema_Parser0.getValidateDefaults();
    assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test106() throws Throwable {
    ParseContext parseContext0 = new ParseContext();
    Schema.Parser schema_Parser0 = new Schema.Parser(parseContext0);
    ArrayDeque<Schema> arrayDeque0 = new ArrayDeque<Schema>();
    Schema.Parser schema_Parser1 = schema_Parser0.addTypes((Iterable<Schema>) arrayDeque0);
    assertTrue(schema_Parser1.getValidateDefaults());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test107() throws Throwable {
    Schema.Parser schema_Parser0 = new Schema.Parser();
    // Undeclared exception!
    try {
      schema_Parser0.parseInternal("`6z2O&Kl$`");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // com.fasterxml.jackson.core.JsonParseException: Unexpected character ('`'
      // (code 96)): expected a valid value (JSON String, Number, Array, Object or
      // token 'null', 'true' or 'false')
      // at [Source: (String)\"`6z2O&Kl$`\"; line: 1, column: 2]
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test108() throws Throwable {
    NameValidator nameValidator0 = Schema.getNameValidator();
    Schema.Parser schema_Parser0 = new Schema.Parser(nameValidator0);
    assertTrue(schema_Parser0.getValidateDefaults());

    schema_Parser0.setValidateDefaults(false);
    assertFalse(schema_Parser0.getValidateDefaults());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test109() throws Throwable {
    Schema.Parser schema_Parser0 = new Schema.Parser();
    schema_Parser0.getTypes();
    assertTrue(schema_Parser0.getValidateDefaults());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test110() throws Throwable {
    Schema.Names schema_Names0 = new Schema.Names("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer");
    Schema.Name schema_Name0 = new Schema.Name("com.fasterxml.jackson.databind.introspect.BasicBeanDescription", ".F");
    schema_Names0.put(schema_Name0, (Schema) null);
    Schema schema0 = Schema.createMap((Schema) null);
    // Undeclared exception!
    try {
      schema_Names0.put(schema_Name0, schema0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Can't redefine:
      // com.fasterxml.jackson.databind.introspect.BasicBeanDescription
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test111() throws Throwable {
    Schema schema0 = Schema.createFixed("pH", "type", "type", 14);
    // Undeclared exception!
    try {
      schema0.fieldsToJson((Set<String>) null, "type", (JsonGenerator) null);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not a record:
      // {\"type\":\"fixed\",\"name\":\"pH\",\"namespace\":\"type\",\"doc\":\"type\",\"size\":14}
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test112() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    // Undeclared exception!
    try {
      schema0.getFields();
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not a record: [\"string\"]
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test113() throws Throwable {
    Schema schema0 = Schema.createFixed("type", "type", "type", 14);
    schema0.addAlias("type", "type");
    Stack<String> stack0 = new Stack<String>();
    Schema schema1 = Schema.createEnum("type", "type", "type", (List<String>) stack0);
    Schema schema2 = Schema.applyAliases(schema1, schema0);
    assertTrue(schema2.equals((Object) schema1));
    assertNotSame(schema2, schema1);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test114() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    // Undeclared exception!
    try {
      schema0.hasEnumSymbol("MA");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not an enum: \"string\"
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test115() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Vector<Schema.Field> vector0 = new Vector<Schema.Field>();
    // Undeclared exception!
    try {
      schema0.setFields(vector0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not a record: [\"string\"]
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test116() throws Throwable {
    // Undeclared exception!
    try {
      Schema.parse((File) null);
      fail("Expecting exception: NullPointerException");

    } catch (NullPointerException e) {
      //
      // no message in exception (getMessage() returned null)
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test117() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    // Undeclared exception!
    try {
      schema0.addAlias("org.apache.avro.Schema$SeenPair", "org.apache.avro.Schema$SeenPair");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not a named type: [\"string\"]
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test118() throws Throwable {
    boolean boolean0 = Schema.getValidateDefaults();
    assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test119() throws Throwable {
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
  public void schema_ESTest_test120() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    // Undeclared exception!
    try {
      schema0.addAlias("org.apache.avro.compiler.UnresolvedSchema_197");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not a named type: [\"string\"]
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test121() throws Throwable {
    Schema schema0 = Schema.createArray((Schema) null);
    String string0 = schema0.getDoc();
    assertNull(string0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test122() throws Throwable {
    Schema.LockableArrayList<Schema.Field> schema_LockableArrayList0 = new Schema.LockableArrayList<Schema.Field>();
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field schema_Field0 = new Schema.Field("stri", schema0);
    schema_LockableArrayList0.add(schema_Field0);
    Schema schema1 = Schema.createRecord("stri", "stri", "stri", true, (List<Schema.Field>) schema_LockableArrayList0);
    JsonNodeFactory jsonNodeFactory0 = JsonNodeFactory.instance;
    ObjectNode objectNode0 = new ObjectNode(jsonNodeFactory0);
    Short short0 = new Short((short) 7);
    objectNode0.put("stri", short0);
    boolean boolean0 = schema1.isValidDefault(objectNode0);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test123() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    // Undeclared exception!
    try {
      schema0.getElementType();
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not an array: [\"string\"]
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test124() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    // Undeclared exception!
    try {
      schema0.getNamespace();
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not a named type: \"string\"
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test125() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    // Undeclared exception!
    try {
      schema0.hasFields();
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not a record: \"string\"
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test126() throws Throwable {
    // Undeclared exception!
    try {
      Schema.parseJsonToObject("v_C\"#");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // com.fasterxml.jackson.core.JsonParseException: Unrecognized token 'v_C': was
      // expecting (JSON String, Number, Array, Object or token 'null', 'true' or
      // 'false')
      // at [Source: (String)\"v_C\"#\"; line: 1, column: 4]
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test127() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    // Undeclared exception!
    try {
      schema0.getTypes();
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not a union: \"string\"
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test128() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    // Undeclared exception!
    try {
      schema0.getEnumSymbols();
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not an enum: [\"string\"]
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test129() throws Throwable {
    Schema schema0 = Schema.createArray((Schema) null);
    // Undeclared exception!
    try {
      schema0.getIndexNamed("null");
      fail("Expecting exception: NullPointerException");

    } catch (NullPointerException e) {
      //
      // no message in exception (getMessage() returned null)
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test130() throws Throwable {
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
  public void schema_ESTest_test131() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    // Undeclared exception!
    try {
      schema0.getField("stri");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not a record: \"string\"
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test133() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Object object0 = schema0.writeReplace();
    assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test134() throws Throwable {
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
  public void schema_ESTest_test135() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    // Undeclared exception!
    try {
      schema0.getEnumOrdinal("RYs]pJ/L$,kaqW'");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not an enum: [\"string\"]
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test136() throws Throwable {
    // Undeclared exception!
    try {
      Schema.parse(
          "{\"type\":\"record\",\"name\":\"UnresolvedSchema_497\",\"namespace\":\"org.apache.avro.compiler\",\"doc\":\"unresolved schema\",\"fields\":[],\"org.apache.avro.idl.unresolved.name\":\"lN[`NI 5S. @!&QkVvF8yzi,4h#\"}");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Undefined schema: lN[`NI 5S. @!&QkVvF8yzi,4h#
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test137() throws Throwable {
    Vector<String> vector0 = new Vector<String>();
    Schema schema0 = Schema.createEnum("USE_GETTERS_AS_SETTERS", "USE_GETTERS_AS_SETTERS", "USE_GETTERS_AS_SETTERS",
        (List<String>) vector0);
    LinkedHashSet<Schema> linkedHashSet0 = new LinkedHashSet<Schema>();
    linkedHashSet0.add(schema0);
    String string0 = schema0.toString((Collection<Schema>) linkedHashSet0, false);
    assertEquals("\"USE_GETTERS_AS_SETTERS.USE_GETTERS_AS_SETTERS\"", string0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test138() throws Throwable {
    Schema schema0 = Schema.createArray((Schema) null);
    LongNode longNode0 = new LongNode((-813L));
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.DESCENDING;
    Schema.Field schema_Field0 = new Schema.Field("items", schema0, "lk/i'Q#MGTgH?jW:U", longNode0, false,
        schema_Field_Order0);
    int int0 = schema_Field0.pos();
    assertEquals((-1), int0);
    assertEquals("lk/i'Q#MGTgH?jW:U", schema_Field0.doc());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test139() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    DoubleNode doubleNode0 = DoubleNode.valueOf(0.0);
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.DESCENDING;
    Schema.Field schema_Field0 = new Schema.Field("Collection", schema0, "Collection", doubleNode0, false,
        schema_Field_Order0);
    Object object0 = schema_Field0.defaultVal();
    assertNull(object0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test140() throws Throwable {
    Schema.LockableArrayList<Schema.Field> schema_LockableArrayList0 = new Schema.LockableArrayList<Schema.Field>();
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field schema_Field0 = new Schema.Field("stri", schema0);
    schema_LockableArrayList0.add(schema_Field0);
    schema_LockableArrayList0.add(schema_Field0);
    // Undeclared exception!
    try {
      Schema.createRecord("stri", "stri", "stri", true, (List<Schema.Field>) schema_LockableArrayList0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Field already used: stri type:STRING pos:0
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test141() throws Throwable {
    Schema.LockableArrayList<Schema.Field> schema_LockableArrayList0 = new Schema.LockableArrayList<Schema.Field>();
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field schema_Field0 = new Schema.Field("stri", schema0);
    schema_LockableArrayList0.add(schema_Field0);
    assertEquals((-1), schema_Field0.pos());

    Schema schema1 = Schema.createRecord("stri", "stri", "stri", true, (List<Schema.Field>) schema_LockableArrayList0);
    JsonNodeFactory jsonNodeFactory0 = JsonNodeFactory.instance;
    ObjectNode objectNode0 = new ObjectNode(jsonNodeFactory0);
    boolean boolean0 = schema1.isValidDefault(objectNode0);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test142() throws Throwable {
    Schema.LockableArrayList<Schema.Field> schema_LockableArrayList0 = new Schema.LockableArrayList<Schema.Field>();
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field schema_Field0 = new Schema.Field("stri", schema0);
    schema_LockableArrayList0.add(schema_Field0);
    Schema schema1 = Schema.createRecord("stri", "stri", "stri", true, (List<Schema.Field>) schema_LockableArrayList0);
    // Undeclared exception!
    try {
      schema1.getValueType();
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not a map:
      // {\"type\":\"error\",\"name\":\"stri\",\"namespace\":\"stri\",\"doc\":\"stri\",\"fields\":[{\"name\":\"stri\",\"type\":\"string\"}]}
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test143() throws Throwable {
    Schema.LockableArrayList<String> schema_LockableArrayList0 = new Schema.LockableArrayList<String>(958);
    HashSet<String> hashSet0 = new HashSet<String>();
    // Undeclared exception!
    try {
      schema_LockableArrayList0.addAll(958, (Collection<? extends String>) hashSet0);
      fail("Expecting exception: IndexOutOfBoundsException");

    } catch (IndexOutOfBoundsException e) {
      //
      // Index: 958, Size: 0
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test144() throws Throwable {
    Schema.LockableArrayList<Schema.Field> schema_LockableArrayList0 = new Schema.LockableArrayList<Schema.Field>();
    boolean boolean0 = schema_LockableArrayList0.addAll((Collection<? extends Schema.Field>) schema_LockableArrayList0);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test145() throws Throwable {
    Schema.LockableArrayList<Schema.Field> schema_LockableArrayList0 = new Schema.LockableArrayList<Schema.Field>();
    boolean boolean0 = schema_LockableArrayList0.remove((Object) "DESCENDING");
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test146() throws Throwable {
    Schema.LockableArrayList<Object> schema_LockableArrayList0 = new Schema.LockableArrayList<Object>();
    // Undeclared exception!
    try {
      schema_LockableArrayList0.remove(2761);
      fail("Expecting exception: IndexOutOfBoundsException");

    } catch (IndexOutOfBoundsException e) {
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test147() throws Throwable {
    Schema.LockableArrayList<Schema.Field> schema_LockableArrayList0 = new Schema.LockableArrayList<Schema.Field>();
    ArrayDeque<Schema> arrayDeque0 = new ArrayDeque<Schema>();
    boolean boolean0 = schema_LockableArrayList0.removeAll(arrayDeque0);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test148() throws Throwable {
    Schema.LockableArrayList<Schema.Field> schema_LockableArrayList0 = new Schema.LockableArrayList<Schema.Field>();
    PriorityQueue<String> priorityQueue0 = new PriorityQueue<String>();
    boolean boolean0 = schema_LockableArrayList0.retainAll(priorityQueue0);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test149() throws Throwable {
    Schema.LockableArrayList<Schema.Field> schema_LockableArrayList0 = new Schema.LockableArrayList<Schema.Field>();
    schema_LockableArrayList0.clear();
    assertTrue(schema_LockableArrayList0.isEmpty());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test151() throws Throwable {
    Schema.LockableArrayList<Schema.Field> schema_LockableArrayList0 = new Schema.LockableArrayList<Schema.Field>();
    Schema schema0 = Schema.createRecord((List<Schema.Field>) schema_LockableArrayList0);
    schema0.addAlias((String) null, (String) null);
    Schema schema1 = Schema.createMap(schema0);
    Schema schema2 = Schema.applyAliases(schema1, schema0);
    assertSame(schema2, schema1);
    assertEquals(Schema.Type.MAP, schema2.getType());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test00() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema.Field schema_Field0 = new Schema.Field("CIXmYaEFkIU", schema0, "CIXmYaEFkIU");
    Schema.Field schema_Field1 = new Schema.Field("CIXmYaEFkIU", schema0, "URI", "URI");
    boolean boolean0 = schema_Field0.equals(schema_Field1);
    assertFalse(boolean0);
    assertFalse(schema_Field1.equals((Object) schema_Field0));
    assertEquals((-1), schema_Field1.pos());
    assertEquals("URI", schema_Field1.doc());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test01() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema.Field schema_Field0 = new Schema.Field("CIXmYaEFkIU", schema0, "CIXmYaEFkIU");
    Schema.Field schema_Field1 = new Schema.Field(schema_Field0, schema0);
    assertTrue(schema_Field1.equals((Object) schema_Field0));

    schema_Field1.addProp("CIXmYaEFkIU", "CIXmYaEFkIU");
    boolean boolean0 = schema_Field0.equals(schema_Field1);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test02() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema.Field schema_Field0 = new Schema.Field("CIXmYaEFkIU", schema0, "CIXmYaEFkIU");
    Schema schema1 = Schema.createArray(schema0);
    Schema.Field schema_Field1 = new Schema.Field("CIXmYaEFkIU", schema1, "CIXmYaEFkIU");
    boolean boolean0 = schema_Field0.equals(schema_Field1);
    assertFalse(boolean0);
    assertEquals((-1), schema_Field1.pos());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test03() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema.Field schema_Field0 = new Schema.Field("CIXmYaEFkIU", schema0, "CIXmYaEFkIU");
    Schema.Field schema_Field1 = new Schema.Field("URI", schema0, "URI");
    boolean boolean0 = schema_Field0.equals(schema_Field1);
    assertEquals((-1), schema_Field1.pos());
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test04() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field schema_Field0 = new Schema.Field("CIXmYaEFkIU", schema0, "CIXmYaEFkIU");
    boolean boolean0 = schema_Field0.equals("CIXmYaEFkIU");
    assertEquals((-1), schema_Field0.pos());
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test05() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema.Field schema_Field0 = new Schema.Field("CIXmYaEFkIU", schema0, "l>rtf,r]Nl-(N*0");
    boolean boolean0 = schema_Field0.equals(schema_Field0);
    assertEquals("l>rtf,r]Nl-(N*0", schema_Field0.doc());
    assertTrue(boolean0);
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test06() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.ASCENDING;
    Schema.Field schema_Field0 = new Schema.Field("out", schema0, "out", "out", schema_Field_Order0);
    Schema.Field schema_Field1 = new Schema.Field("out", schema0, "out");
    boolean boolean0 = schema_Field0.equals(schema_Field1);
    assertFalse(boolean0);
    assertEquals((-1), schema_Field1.pos());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test07() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema.Field schema_Field0 = new Schema.Field("CIXmYaEFkIU", schema0, "CIXmYaEFkIU");
    schema_Field0.aliases();
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test08() throws Throwable {
    FloatNode floatNode0 = new FloatNode(3550.7805F);
    LinkedList<String> linkedList0 = new LinkedList<String>();
    Schema schema0 = Schema.createEnum("D", "D", "D", (List<String>) linkedList0);
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.DESCENDING;
    Schema.Field schema_Field0 = new Schema.Field("D", schema0, "D", floatNode0, false, schema_Field_Order0);
    schema_Field0.addAlias("D");
    Set<String> set0 = schema_Field0.aliases();
    assertTrue(set0.contains("D"));
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test09() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field schema_Field0 = new Schema.Field("CIXmYaIU", schema0, "CIXmYaIU");
    schema_Field0.addAlias("CIXmYaIU");
    schema_Field0.addAlias("CIXmYaIU");
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test10() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.ASCENDING;
    Schema.Field schema_Field0 = new Schema.Field("out", schema0, "out", "out", schema_Field_Order0);
    boolean boolean0 = schema_Field0.hasDefaultValue();
    assertEquals((-1), schema_Field0.pos());
    assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test11() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field schema_Field0 = new Schema.Field("ASCENDING", schema0);
    boolean boolean0 = schema_Field0.hasDefaultValue();
    assertFalse(boolean0);
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test12() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Object object0 = Schema.Field.NULL_DEFAULT_VALUE;
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.IGNORE;
    Schema.Field schema_Field0 = null;
    try {
      schema_Field0 = new Schema.Field("", schema0, "", object0, schema_Field_Order0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Empty name
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test13() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Object object0 = Schema.Field.NULL_DEFAULT_VALUE;
    Schema.Field schema_Field0 = null;
    try {
      schema_Field0 = new Schema.Field("?rh?na}Hx8&&#`t3[kX", schema0, "?rh?na}Hx8&&#`t3[kX", object0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Illegal initial character: ?rh?na}Hx8&&#`t3[kX
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test14() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema.Field schema_Field0 = new Schema.Field("CIXmYaEFkIU", schema0, "CIXmYaEFkIU");
    schema_Field0.addAlias("CIXmYaEFkIU");
    Schema.Field schema_Field1 = new Schema.Field(schema_Field0, schema0);
    assertEquals((-1), schema_Field1.pos());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test15() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.ASCENDING;
    Schema.Field schema_Field0 = new Schema.Field("out", schema0, "out", "out", schema_Field_Order0);
    Schema.Field schema_Field1 = new Schema.Field(schema_Field0, schema0);
    boolean boolean0 = schema_Field0.equals(schema_Field1);
    assertTrue(boolean0);
    assertEquals((-1), schema_Field1.pos());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test16() throws Throwable {
    FloatNode floatNode0 = FloatNode.valueOf(3550.7805F);
    Vector<String> vector0 = new Vector<String>();
    Schema schema0 = Schema.createEnum("D", "D", "D", (List<String>) vector0);
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.DESCENDING;
    Schema.Field schema_Field0 = new Schema.Field("D", schema0, "D", floatNode0, false, schema_Field_Order0);
    int int0 = schema_Field0.pos();
    assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test17() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field schema_Field0 = new Schema.Field("CIXmYaEFkIU", schema0);
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.DESCENDING;
    Schema.Field schema_Field1 = new Schema.Field("CIXmYaEFkIU", schema0, (String) null, (JsonNode) null, true,
        schema_Field_Order0);
    boolean boolean0 = schema_Field0.equals(schema_Field1);
    assertFalse(boolean0);
    assertEquals((-1), schema_Field1.pos());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test18() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field schema_Field0 = new Schema.Field("CIXmYaEFkIU", schema0, "CIXmYaEFkIU");
    schema_Field0.hashCode();
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test19() throws Throwable {
    FloatNode floatNode0 = new FloatNode(3550.7805F);
    LinkedList<String> linkedList0 = new LinkedList<String>();
    Schema schema0 = Schema.createEnum("D", "D", "D", (List<String>) linkedList0);
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.DESCENDING;
    Schema.Field schema_Field0 = new Schema.Field("D", schema0, "D", floatNode0, false, schema_Field_Order0);
    schema_Field0.doc();
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test20() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field schema_Field0 = new Schema.Field("UnresolvedSchema", schema0, "UnresolvedSchema");
    List<Schema.Field> list0 = List.of(schema_Field0, schema_Field0, schema_Field0, schema_Field0, schema_Field0,
        schema_Field0, schema_Field0, schema_Field0, schema_Field0, schema_Field0);
    // Undeclared exception!
    try {
      Schema.createRecord("UnresolvedSchema", "UnresolvedSchema", "CIXmYaEFkIU", true, list0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Field already used: UnresolvedSchema type:STRING pos:0
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test21() throws Throwable {
    FloatNode floatNode0 = new FloatNode(3550.7805F);
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.DESCENDING;
    Schema.Field schema_Field0 = new Schema.Field("D", schema0, "D", floatNode0, false, schema_Field_Order0);
    schema_Field0.defaultValue();
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test22() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema.Field schema_Field0 = new Schema.Field("CIXmYaEFkIU", schema0, "CIXmYaEFkIU");
    schema_Field0.defaultVal();
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test23() throws Throwable {
    FloatNode floatNode0 = new FloatNode(3550.7805F);
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.DESCENDING;
    Schema.Field schema_Field0 = new Schema.Field("D", schema0, "D", floatNode0, false, schema_Field_Order0);
    schema_Field0.schema();
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test24() throws Throwable {
    FloatNode floatNode0 = FloatNode.valueOf(3545.79F);
    LinkedList<String> linkedList0 = new LinkedList<String>();
    Schema schema0 = Schema.createEnum("D", "D", "D", (List<String>) linkedList0);
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.DESCENDING;
    Schema.Field schema_Field0 = new Schema.Field("D", schema0, "D", floatNode0, false, schema_Field_Order0);
    schema_Field0.order();
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schemaParser_ESTest_test0() throws Throwable {
    Schema.Parser schema_Parser0 = new Schema.Parser();
    String[] stringArray0 = new String[1];
    // Undeclared exception!
    try {
      schema_Parser0.parse("_ARD[D~!xoDr$qt`", stringArray0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // com.fasterxml.jackson.core.JsonParseException: Unrecognized token '_ARD': was
      // expecting (JSON String, Number, Array, Object or token 'null', 'true' or
      // 'false')
      // at [Source: (String)\"_ARD[D~!xoDr$qt`null\"; line: 1, column: 5]
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schemaParser_ESTest_test1() throws Throwable {
    Schema.Parser schema_Parser0 = new Schema.Parser((NameValidator) null);
    assertTrue(schema_Parser0.getValidateDefaults());
  }

  @Test(timeout = 4000)
  public void schemaParser_ESTest_test2() throws Throwable {
    Schema.Parser schema_Parser0 = new Schema.Parser();
    boolean boolean0 = schema_Parser0.getValidateDefaults();
    assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void schemaParser_ESTest_test3() throws Throwable {
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
  public void schemaParser_ESTest_test4() throws Throwable {
    Schema.Parser schema_Parser0 = new Schema.Parser();
    // Undeclared exception!
    try {
      schema_Parser0.parseInternal("");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Cannot parse <null> schema
      //
      // Expected exception.
    }
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
    Map<String, Schema> map0 = schema_Parser0.getTypes();
    Schema.Parser schema_Parser1 = schema_Parser0.addTypes(map0);
    assertTrue(schema_Parser1.getValidateDefaults());
  }

  @Test(timeout = 4000)
  public void schemaParser_ESTest_test8() throws Throwable {
    Schema.Parser schema_Parser0 = new Schema.Parser();
    InputStream inputStream0 = InputStream.nullInputStream();
    // Undeclared exception!
    try {
      schema_Parser0.parse(inputStream0);
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
    Schema.SeenPair p0 = new Schema.SeenPair(object0, object0);
    Schema.SeenPair p1 = new Schema.SeenPair(object0, p0);
    assertFalse(p1.equals(p0));
  }

  @Test(timeout = 4000)
  public void schemaSeenPair_ESTest_test1() throws Throwable {
    Object object0 = new Object();
    Schema.SeenPair p0 = new Schema.SeenPair(object0, object0);
    Object object1 = new Object();
    Schema.SeenPair p1 = new Schema.SeenPair(object1, p0);
    assertFalse(p0.equals(p1));
  }

  @Test(timeout = 4000)
  public void schemaSeenPair_ESTest_test2() throws Throwable {
    Object object0 = new Object();
    Schema.SeenPair p0 = new Schema.SeenPair(object0, object0);
    assertFalse(p0.equals(object0));
  }

  @Test(timeout = 4000)
  public void schemaSeenPair_ESTest_test3() throws Throwable {
    Object object0 = new Object();
    Schema.SeenPair p0 = new Schema.SeenPair(object0, object0);
    assertTrue(p0.equals(p0));
  }

  @Test(timeout = 4000)
  public void schemaType_ESTest_test0() throws Throwable {
    assertEquals("boolean", Schema.Type.BOOLEAN.getName());
  }
}
