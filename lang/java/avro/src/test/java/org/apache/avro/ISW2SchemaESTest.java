/*
 * Derived from EvoSuite 1.2.0 output for Schema and selected nested classes.
 * EvoRunner, scaffolding, EvoSuite runtime assertions, VFS/VNET dependencies,
 * unstable assertions, and non-restored global-state mutations were removed.
 */

package org.apache.avro;

import static org.junit.Assert.*;

import org.junit.Test;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonFactoryBuilder;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.ext.NioPathSerializer;
import com.fasterxml.jackson.databind.node.BinaryNode;
import com.fasterxml.jackson.databind.node.FloatNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.POJONode;
import com.fasterxml.jackson.databind.node.ValueNode;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.util.RawValue;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.math.BigInteger;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;
import org.apache.avro.LogicalType;
import org.apache.avro.NameValidator;
import org.apache.avro.ParseContext;
import org.apache.avro.Protocol;
import org.apache.avro.Schema;

public class ISW2SchemaESTest {

  @Test(timeout = 4000)
  public void schema_ESTest_test000() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema schema1 = Schema.createArray(schema0);
    Schema schema2 = Schema.applyAliases(schema1, schema0);
    assertFalse(schema2.isUnion());
    assertFalse(schema2.equals((Object) schema0));
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test001() throws Throwable {
    JsonNodeFactory jsonNodeFactory0 = JsonNodeFactory.instance;
    BigInteger bigInteger0 = BigInteger.ONE;
    ValueNode valueNode0 = jsonNodeFactory0.numberNode(bigInteger0);
    ParseContext parseContext0 = new ParseContext();
    // Undeclared exception!
    try {
      Schema.parse((JsonNode) valueNode0, parseContext0, "^\"");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Schema not yet supported: 1
      //
      assertNotNull(e);
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test002() throws Throwable {
    // Undeclared exception!
    try {
      Schema.parse("{\n  \"type\" : \"record\",\n  \"fields\" : [ ]\n}");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // No name in schema: {\"type\":\"record\",\"fields\":[]}
      //
      assertNotNull(e);
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test003() throws Throwable {
    Stack<Schema.Field> stack0 = new Stack<Schema.Field>();
    Schema schema0 = Schema.createRecord((List<Schema.Field>) stack0);
    Schema.Names schema_Names0 = new Schema.Names("Xi$<cs=q[>uzNS],yn");
    Schema.Field schema_Field0 = new Schema.Field("doubjle", schema0, "doubjle", schema_Names0);
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test004() throws Throwable {
    Stack<Schema.Field> stack0 = new Stack<Schema.Field>();
    Schema schema0 = Schema.createRecord((List<Schema.Field>) stack0);
    Schema schema1 = Schema.createArray(schema0);
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.IGNORE;
    Schema.Field schema_Field0 = new Schema.Field("doubjle", schema1, "Xi$<Ncs=q[>uzNS],yn", stack0,
        schema_Field_Order0);
    assertEquals((-1), schema_Field0.pos());
    assertEquals("Xi$<Ncs=q[>uzNS],yn", schema_Field0.doc());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test005() throws Throwable {
    Vector<String> vector0 = new Vector<String>();
    Schema schema0 = Schema.createEnum("WRIE_BIGCIMAL_AS_PLAIN", "WRIE_BIGCIMAL_AS_PLAIN", "'CjSYa(ppX}br",
        (List<String>) vector0);
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.IGNORE;
    Schema.Field schema_Field0 = new Schema.Field("WRIE_BIGCIMAL_AS_PLAIN", schema0, "'CjSYa(ppX}br",
        "WRIE_BIGCIMAL_AS_PLAIN", schema_Field_Order0);
    assertEquals("WRIE_BIGCIMAL_AS_PLAIN", schema0.getDoc());
    assertEquals("'CjSYa(ppX}br", schema_Field0.doc());
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test006() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Name schema_Name0 = new Schema.Name((String) null, "Up7c");
    Schema.Names schema_Names0 = new Schema.Names("Up7c");
    schema_Names0.put(schema_Name0, schema0);
    Schema schema1 = schema_Names0.put(schema_Name0, schema0);
    assertFalse(schema1.isUnion());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test007() throws Throwable {
    Stack<Schema.Field> stack0 = new Stack<Schema.Field>();
    Schema schema0 = Schema.createRecord((List<Schema.Field>) stack0);
    Schema.Names schema_Names0 = new Schema.Names("Xi$<cs=q[>uzNS],yn");
    schema_Names0.put((Schema.Name) null, schema0);
    // Undeclared exception!
    try {
      schema_Names0.put((Schema.Name) null, (Schema) null);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Can't redefine: null
      //
      assertNotNull(e);
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test008() throws Throwable {
    Schema.Names schema_Names0 = new Schema.Names("RG");
    Schema.Name schema_Name0 = new Schema.Name("RG", "RG");
    Schema.Type schema_Type0 = Schema.Type.BOOLEAN;
    Schema schema0 = Schema.create(schema_Type0);
    schema_Names0.put(schema_Name0, schema0);
    Schema schema1 = schema_Names0.get("RG");
    assertSame(schema1, schema0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test009() throws Throwable {
    Schema.Names schema_Names0 = new Schema.Names("RG");
    Schema schema0 = schema_Names0.get("RG");
    assertNull(schema0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test010() throws Throwable {
    // Undeclared exception!
    try {
      Schema.parse("", true);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Cannot parse <null> schema
      //
      assertNotNull(e);
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test011() throws Throwable {
    Schema schema0 = Schema.parse(
        "{\"type\":\"enum\",\"name\":\"WRIE_BIGCIMAL_AS_PLAIN\",\"namespace\":\"WRIE_BIGCIMAL_AS_PLAIN\",\"doc\":\"WRIE_BIGCIMAL_AS_PLAIN\",\"symbols\":[]}",
        false);
    assertEquals(Schema.Type.ENUM, schema0.getType());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test012() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Parser schema_Parser0 = new Schema.Parser();
    List<Schema> list0 = List.of(schema0, schema0, schema0, schema0, schema0);
    // Undeclared exception!
    try {
      schema_Parser0.addTypes((Iterable<Schema>) list0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // You can only put a named schema into the context
      //
      assertNotNull(e);
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test013() throws Throwable {
    NameValidator nameValidator0 = Schema.getNameValidator();
    Schema.Parser schema_Parser0 = new Schema.Parser(nameValidator0);
    Stack<Schema> stack0 = new Stack<Schema>();
    Schema.Parser schema_Parser1 = schema_Parser0.addTypes((Iterable<Schema>) stack0);
    assertTrue(schema_Parser1.getValidateDefaults());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test014() throws Throwable {
    Schema.Parser schema_Parser0 = new Schema.Parser((NameValidator) null);
    String[] stringArray0 = new String[1];
    // Undeclared exception!
    try {
      schema_Parser0.parse("STRING", stringArray0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // com.fasterxml.jackson.core.JsonParseException: Unrecognized token
      // 'STRINGnull': was expecting (JSON String, Number, Array, Object or token
      // 'null', 'true' or 'false')
      // at [Source: (String)\"STRINGnull\"; line: 1, column: 11]
      //
      assertNotNull(e);
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test015() throws Throwable {
    Schema schema0 = Schema.createFixed((String) null, (String) null, "^`:Ki)$8tvG", 2702);
    Object object0 = schema0.writeReplace();
    assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test016() throws Throwable {
    Schema schema0 = Schema.createFixed("WRIE_BIGCIMAL_AS_PLAIN", "WRIE_BIGCIMAL_AS_PLAIN", "WRIE_BIGCIMAL_AS_PLAIN",
        51);
    Schema[] schemaArray0 = new Schema[6];
    schemaArray0[0] = schema0;
    schemaArray0[1] = schema0;
    schemaArray0[2] = schema0;
    schemaArray0[3] = schema0;
    schemaArray0[4] = schema0;
    schemaArray0[5] = schema0;
    Schema.LockableArrayList<Schema> schema_LockableArrayList0 = new Schema.LockableArrayList<Schema>(schemaArray0);
    String string0 = schema0.toString((Collection<Schema>) schema_LockableArrayList0, false);
    assertEquals("\"WRIE_BIGCIMAL_AS_PLAIN.WRIE_BIGCIMAL_AS_PLAIN\"", string0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test017() throws Throwable {
    Schema schema0 = Schema.createFixed("RECORD", "RECORD", "RECORD", 2136);
    Schema schema1 = Schema.createFixed("RECORD", "RECORD", "RECORD", 2136);
    Schema schema2 = Schema.applyAliases(schema1, schema0);
    assertTrue(schema2.equals((Object) schema0));
    assertNotSame(schema2, schema0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test018() throws Throwable {
    Schema schema0 = Schema.createFixed("RECORD", "RECORD", "RECORD", 2136);
    Schema schema1 = Schema.createFixed("RECORD", "RECORD", (String) null, 2136);
    Schema schema2 = Schema.applyAliases(schema1, schema0);
    assertFalse(schema2.equals((Object) schema0));
    assertNotSame(schema2, schema0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test019() throws Throwable {
    Schema schema0 = Schema.createFixed("WRIE_BIGCIMAL_AS_PLAIN", "WRIE_BIGCIMAL_AS_PLAIN", "WRIE_BIGCIMAL_AS_PLAIN",
        33);
    Schema schema1 = Schema.createMap(schema0);
    Schema schema2 = Schema.applyAliases(schema0, schema1);
    assertFalse(schema2.equals((Object) schema1));
    assertEquals(Schema.Type.FIXED, schema2.getType());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test020() throws Throwable {
    Schema schema0 = Schema.createFixed("WRITE_BIGDECIMAL_AS_PLAIN", "WRITE_BIGDECIMAL_AS_PLAIN",
        "WRITE_BIGDECIMAL_AS_PLAIN", 454);
    Schema schema1 = Schema.applyAliases(schema0, schema0);
    assertFalse(schema1.isUnion());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test021() throws Throwable {
    Schema schema0 = Schema.createFixed("RECORD", "WRIE_BIGCIMAL_AS_PLAIN.WRIE_BIGCIMAL_AS_PLAIN",
        "WRIE_BIGCIMAL_AS_PLAIN.WRIE_BIGCIMAL_AS_PLAIN", 2113);
    Schema schema1 = Schema.createFixed("RECORD", ")i$i sUlk+", "WRIE_BIGCIMAL_AS_PLAIN.WRIE_BIGCIMAL_AS_PLAIN", 12);
    Schema schema2 = Schema.applyAliases(schema1, schema0);
    assertFalse(schema0.equals((Object) schema1));
    assertFalse(schema2.equals((Object) schema0));
    assertEquals(")i$i sUlk+", schema2.getDoc());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test022() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    schema0.hashCode();
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test023() throws Throwable {
    Schema.Type schema_Type0 = Schema.Type.BOOLEAN;
    Schema schema0 = Schema.create(schema_Type0);
    Schema schema1 = Protocol.SYSTEM_ERRORS;
    Schema schema2 = Schema.applyAliases(schema1, schema0);
    assertSame(schema2, schema1);
    assertEquals(Schema.Type.UNION, schema2.getType());
    assertFalse(schema2.equals((Object) schema0));
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test024() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    List<Schema> list0 = List.of(schema0, schema0, schema0, schema0);
    // Undeclared exception!
    try {
      Schema.createUnion(list0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Duplicate in union:string
      //
      assertNotNull(e);
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test025() throws Throwable {
    Schema.LockableArrayList<Schema.Field> schema_LockableArrayList0 = new Schema.LockableArrayList<Schema.Field>(8);
    Schema schema0 = Schema.createRecord((List<Schema.Field>) schema_LockableArrayList0);
    List<Schema> list0 = List.of(schema0, schema0, schema0, schema0);
    // Undeclared exception!
    try {
      Schema.createUnion(list0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Nameless in
      // union:[{\"type\":\"record\",\"fields\":[]},{\"type\":\"record\",\"fields\":[]},{\"type\":\"record\",\"fields\":[]},{\"type\":\"record\",\"fields\":[]}]
      //
      assertNotNull(e);
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test026() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    List<Schema> list0 = List.of(schema0, schema0, schema0, schema0, schema0, schema0);
    // Undeclared exception!
    try {
      Schema.createUnion(list0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Nested union:
      // [[\"string\"],[\"string\"],[\"string\"],[\"string\"],[\"string\"],[\"string\"]]
      //
      assertNotNull(e);
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test027() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema schema1 = Schema.createMap(schema0);
    Schema schema2 = Schema.applyAliases(schema1, schema1);
    assertFalse(schema2.equals((Object) schema0));
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test028() throws Throwable {
    Vector<String> vector0 = new Vector<String>();
    Schema schema0 = Schema.createEnum("WRIE_BIGCIMAL_AS_PLAIN", "WRIE_BIGCIMAL_AS_PLAIN", "'CjSYa(ppX}br",
        (List<String>) vector0);
    Schema schema1 = Schema.createMap(schema0);
    Schema schema2 = Schema.applyAliases(schema1, schema0);
    assertFalse(schema2.equals((Object) schema0));
    assertEquals("WRIE_BIGCIMAL_AS_PLAIN", schema0.getDoc());
    assertEquals(Schema.Type.MAP, schema2.getType());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test029() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema schema1 = Schema.createArray(schema0);
    Schema schema2 = Schema.createArray(schema1);
    Schema schema3 = Schema.applyAliases(schema1, schema2);
    assertFalse(schema3.equals((Object) schema2));
    assertNotSame(schema3, schema2);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test030() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema schema1 = Schema.createArray(schema0);
    Schema schema2 = Schema.createArray(schema0);
    Schema schema3 = Schema.applyAliases(schema1, schema2);
    assertTrue(schema3.equals((Object) schema2));
    assertFalse(schema3.equals((Object) schema0));
    assertFalse(schema0.equals((Object) schema2));
    assertSame(schema3, schema1);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test031() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema schema1 = Schema.createArray(schema0);
    Schema schema2 = Schema.applyAliases(schema1, schema1);
    assertFalse(schema2.equals((Object) schema0));
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test032() throws Throwable {
    Vector<String> vector0 = new Vector<String>();
    Schema schema0 = Schema.createEnum("WRIE_BIGCIMAL_AS_PLAIN", (String) null,
        "org.apache.avro.compiler.UnresolvedSchema_777", (List<String>) vector0);
    Schema schema1 = Schema.createMap(schema0);
    // Undeclared exception!
    try {
      schema1.getEnumOrdinal("JE?");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not an enum:
      // {\"type\":\"map\",\"values\":{\"type\":\"enum\",\"name\":\"WRIE_BIGCIMAL_AS_PLAIN\",\"namespace\":\"org.apache.avro.compiler.UnresolvedSchema_777\",\"symbols\":[]}}
      //
      assertNotNull(e);
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test033() throws Throwable {
    Vector<String> vector0 = new Vector<String>();
    Schema schema0 = Schema.createEnum("FOft", "FOft", "FOft", (List<String>) vector0);
    Schema.Field schema_Field0 = new Schema.Field("FOft", schema0, "FOft");
    boolean boolean0 = schema0.equals(schema_Field0);
    assertFalse(boolean0);
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test034() throws Throwable {
    Vector<String> vector0 = new Vector<String>();
    Schema schema0 = Schema.createEnum("WRIE_BIGCIMAL_AS_PLAIN", "WRIE_BIGCIMAL_AS_PLAIN", "'CjSYa(ppX}br",
        (List<String>) vector0);
    boolean boolean0 = schema0.hasEnumSymbol("'CjSYa(ppX}br");
    assertEquals("WRIE_BIGCIMAL_AS_PLAIN", schema0.getDoc());
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test035() throws Throwable {
    Vector<String> vector0 = new Vector<String>();
    vector0.add("STRING");
    Schema schema0 = Schema.createEnum("STRING", "STRING", "STRING", (List<String>) vector0, "STRING");
    assertEquals(Schema.Type.ENUM, schema0.getType());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test036() throws Throwable {
    Vector<String> vector0 = new Vector<String>();
    // Undeclared exception!
    try {
      Schema.createEnum("STRING", "STRING", "STRING", (List<String>) vector0, "STRING");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // The Enum Default: STRING is not in the enum symbol set: []
      //
      assertNotNull(e);
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test037() throws Throwable {
    String[] stringArray0 = new String[8];
    stringArray0[0] = "time";
    stringArray0[1] = "time";
    Schema.LockableArrayList<String> schema_LockableArrayList0 = new Schema.LockableArrayList<String>(stringArray0);
    // Undeclared exception!
    try {
      Schema.createEnum("time", "time", "time", (List<String>) schema_LockableArrayList0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Duplicate enum symbol: time
      //
      assertNotNull(e);
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test038() throws Throwable {
    Vector<String> vector0 = new Vector<String>();
    vector0.addElement("FOft");
    Schema schema0 = Schema.createEnum("FOft", "FOft", "FOft", (List<String>) vector0);
    // Undeclared exception!
    try {
      schema0.getFixedSize();
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not fixed:
      // {\"type\":\"enum\",\"name\":\"FOft\",\"namespace\":\"FOft\",\"doc\":\"FOft\",\"symbols\":[\"FOft\"]}
      //
      assertNotNull(e);
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test039() throws Throwable {
    Schema schema0 = Schema.createRecord("STRING", "STRING", "STRING", true);
    PriorityQueue<Schema> priorityQueue0 = new PriorityQueue<Schema>();
    String string0 = schema0.toString((Collection<Schema>) priorityQueue0, true);
    assertEquals(
        "{\n  \"type\" : \"error\",\n  \"name\" : \"STRING\",\n  \"namespace\" : \"STRING\",\n  \"doc\" : \"STRING\"\n}",
        string0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test040() throws Throwable {
    Schema schema0 = Schema.createRecord("STRING", "STRING", "STRING", false);
    Schema.LockableArrayList<Schema> schema_LockableArrayList0 = new Schema.LockableArrayList<Schema>(4958);
    schema_LockableArrayList0.add(schema0);
    String string0 = schema0.toString((Collection<Schema>) schema_LockableArrayList0, false);
    assertEquals("\"STRING.STRING\"", string0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test041() throws Throwable {
    ParseContext parseContext0 = new ParseContext();
    Schema schema0 = parseContext0.find("2#(sR$&1", "2#(sR$&1");
    schema0.hashCode();
    assertEquals("unresolved schema", schema0.getDoc());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test042() throws Throwable {
    ParseContext parseContext0 = new ParseContext();
    Schema schema0 = parseContext0.find("#(sq$&1", "#(sq$&1");
    Schema schema1 = parseContext0.find("#(sq$&1", "Already had POJO for id (");
    schema1.addAlias("org.apache.avro.compiler.UnresolvedSchema_314");
    Schema schema2 = Schema.applyAliases(schema0, schema1);
    assertNotSame(schema2, schema0);
    assertNotNull(schema2);
    assertTrue(schema2.equals((Object) schema0));
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test043() throws Throwable {
    ParseContext parseContext0 = new ParseContext();
    Schema schema0 = parseContext0.find("#(sq$&1", "#(sq$&1");
    Schema schema1 = parseContext0.find("#(sq$&1", "Already had POJO for id (");
    Schema schema2 = Schema.applyAliases(schema0, schema1);
    assertEquals("unresolved schema", schema2.getDoc());
    assertSame(schema2, schema0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test044() throws Throwable {
    Stack<Schema.Field> stack0 = new Stack<Schema.Field>();
    Schema schema0 = Schema.createRecord((List<Schema.Field>) stack0);
    Schema schema1 = Schema.applyAliases(schema0, schema0);
    assertEquals(Schema.Type.RECORD, schema1.getType());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test045() throws Throwable {
    Stack<Schema.Field> stack0 = new Stack<Schema.Field>();
    Schema schema0 = Schema.createRecord((List<Schema.Field>) stack0);
    boolean boolean0 = schema0.hasFields();
    assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test046() throws Throwable {
    Schema schema0 = Schema.createRecord("STRING", "STRING", "STRING", true);
    Schema schema1 = Schema.createArray(schema0);
    // Undeclared exception!
    try {
      Schema.applyAliases(schema0, schema1);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Schema fields not set yet
      //
      assertNotNull(e);
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test047() throws Throwable {
    Schema schema0 = Schema.createRecord((String) null, (String) null, (String) null, false);
    // Undeclared exception!
    try {
      schema0.getField((String) null);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Schema fields not set yet
      //
      assertNotNull(e);
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test048() throws Throwable {
    Stack<Schema.Field> stack0 = new Stack<Schema.Field>();
    Schema schema0 = Schema.createRecord((List<Schema.Field>) stack0);
    Schema.Field schema_Field0 = schema0.getField("doubjle");
    assertNull(schema_Field0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test049() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    NameValidator nameValidator0 = Schema.getNameValidator();
    Schema.SeenPair schema_SeenPair0 = new Schema.SeenPair(schema0, nameValidator0);
    Schema.Names schema_Names0 = new Schema.Names();
    boolean boolean0 = schema_SeenPair0.equals(schema_Names0);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test050() throws Throwable {
    Stack<Schema.Field> stack0 = new Stack<Schema.Field>();
    Schema schema0 = Schema.createRecord((List<Schema.Field>) stack0);
    schema0.addAlias("com.fasterxml.jackson.databind.node", "com.fasterxml.jackson.databind.node");
    assertNull(schema0.getDoc());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test051() throws Throwable {
    ParseContext parseContext0 = new ParseContext();
    Schema schema0 = parseContext0.find("cspbJtztT", "cd");
    schema0.addAlias("map");
    // Undeclared exception!
    try {
      schema0.getFixedSize();
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not fixed:
      // {\"type\":\"record\",\"name\":\"UnresolvedSchema_497\",\"namespace\":\"org.apache.avro.compiler\",\"doc\":\"unresolved
      // schema\",\"fields\":[],\"org.apache.avro.idl.unresolved.name\":\"cd.cspbJtztT\",\"aliases\":[\"org.apache.avro.compiler.map\"]}
      //
      assertNotNull(e);
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test052() throws Throwable {
    Schema.Name schema_Name0 = new Schema.Name((String) null, (String) null);
    String string0 = schema_Name0.getQualified((String) null);
    assertNull(string0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test053() throws Throwable {
    Vector<String> vector0 = new Vector<String>();
    Schema schema0 = Schema.createEnum("WRIE_BIGCIMAL_AS_PLAIN", "WRIE_BIGCIMAL_AS_PLAIN", "WRIE_BIGCIMAL_AS_PLAIN",
        (List<String>) vector0);
    List<Schema> list0 = List.of(schema0);
    ArrayList<Schema> arrayList0 = new ArrayList<Schema>(list0);
    String string0 = schema0.toString((Collection<Schema>) arrayList0, false);
    assertEquals("\"WRIE_BIGCIMAL_AS_PLAIN.WRIE_BIGCIMAL_AS_PLAIN\"", string0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test054() throws Throwable {
    Schema.Name schema_Name0 = new Schema.Name("time", "float");
    String string0 = schema_Name0.getQualified("float");
    assertEquals("time", string0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test055() throws Throwable {
    Schema.Name schema_Name0 = new Schema.Name((String) null, (String) null);
    ObjectMapper objectMapper0 = Schema.MAPPER;
    JsonFactory jsonFactory0 = new JsonFactory(objectMapper0);
    ByteArrayBuilder byteArrayBuilder0 = new ByteArrayBuilder();
    DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayBuilder0);
    JsonGenerator jsonGenerator0 = jsonFactory0.createGenerator((DataOutput) dataOutputStream0);
    try {
      schema_Name0.writeName("Could not resolve type id '%s' as a subtype of %s", jsonGenerator0);
      fail("Expecting exception: IOException");

    } catch (IOException e) {
      //
      // Can not write a field name, expecting a value
      //
      assertNotNull(e);
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test056() throws Throwable {
    Schema.Name schema_Name0 = new Schema.Name("time", "float");
    DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
    TokenBuffer tokenBuffer0 = defaultSerializerProvider_Impl0.bufferForValueConversion();
    schema_Name0.writeName("float", tokenBuffer0);
    assertFalse(tokenBuffer0.isEmpty());
    assertEquals("float.time", schema_Name0.toString());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test057() throws Throwable {
    Schema.Name schema_Name0 = new Schema.Name("time", "float");
    Base64Variant.PaddingReadBehaviour base64Variant_PaddingReadBehaviour0 = Base64Variant.PaddingReadBehaviour.PADDING_REQUIRED;
    boolean boolean0 = schema_Name0.equals(base64Variant_PaddingReadBehaviour0);
    assertFalse(boolean0);
    assertEquals("float.time", schema_Name0.toString());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test058() throws Throwable {
    Vector<String> vector0 = new Vector<String>();
    Schema schema0 = Schema.createEnum("WRIE_BIGCIMAL_AS_PLAIN", "WRIE_BIGCIMAL_AS_PLAIN", "'CjSYa(ppX}br",
        (List<String>) vector0);
    Schema.Field schema_Field0 = new Schema.Field("WRIE_BIGCIMAL_AS_PLAIN", schema0);
    Schema.Field schema_Field1 = new Schema.Field(schema_Field0, schema0);
    boolean boolean0 = schema_Field0.equals(schema_Field1);
    assertEquals("WRIE_BIGCIMAL_AS_PLAIN", schema0.getDoc());
    assertTrue(boolean0);
    assertEquals((-1), schema_Field1.pos());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test059() throws Throwable {
    Schema schema0 = Schema.createFixed("R", "R", "R", 592);
    Schema.Field schema_Field0 = new Schema.Field("R", schema0);
    schema_Field0.aliases();
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test060() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field schema_Field0 = new Schema.Field("IGN3OE", schema0, "IGN3OE");
    schema_Field0.addAlias("IGN3OE");
    schema_Field0.addAlias("IGN3OE");
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test061() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field schema_Field0 = new Schema.Field("IGN3OE", schema0, "IGN3OE");
    boolean boolean0 = schema_Field0.hasDefaultValue();
    assertFalse(boolean0);
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test062() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema.Field schema_Field0 = new Schema.Field("WRIE_BIGCIMAL_AS_PLAIN", schema0);
    schema_Field0.addAlias("m9*j#t~+g._");
    Schema.Field schema_Field1 = new Schema.Field(schema_Field0, schema0);
    assertEquals((-1), schema_Field1.pos());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test063() throws Throwable {
    Schema schema0 = Schema.createRecord("J", "xUs", "J", false);
    JsonNodeFactory jsonNodeFactory0 = new JsonNodeFactory(false);
    SerializedString serializedString0 = PrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
    RawValue rawValue0 = new RawValue(serializedString0);
    ValueNode valueNode0 = jsonNodeFactory0.rawValueNode(rawValue0);
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.ASCENDING;
    Schema.Field schema_Field0 = new Schema.Field("xUs", schema0, "", valueNode0, false, schema_Field_Order0);
    assertEquals((-1), schema_Field0.pos());
    assertEquals("xUs", schema0.getDoc());
    assertEquals("", schema_Field0.doc());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test064() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    boolean boolean0 = schema0.isNullable();
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test065() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    ParseContext parseContext0 = new ParseContext();
    Schema schema1 = parseContext0.resolve(schema0);
    Schema schema2 = Schema.applyAliases(schema1, schema0);
    assertTrue(schema2.equals((Object) schema0));
    assertSame(schema2, schema1);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test066() throws Throwable {
    Schema.Type schema_Type0 = Schema.Type.FLOAT;
    Schema schema0 = Schema.create(schema_Type0);
    Schema schema1 = Schema.create(schema_Type0);
    Schema schema2 = Schema.applyAliases(schema1, schema0);
    assertTrue(schema2.equals((Object) schema0));
    assertSame(schema2, schema1);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test067() throws Throwable {
    Schema.Type schema_Type0 = Schema.Type.BOOLEAN;
    Schema schema0 = Schema.create(schema_Type0);
    boolean boolean0 = schema0.equals("QGLk");
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test068() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema schema1 = Schema.applyAliases(schema0, schema0);
    assertNull(schema1.getDoc());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test069() throws Throwable {
    Stack<Schema.Field> stack0 = new Stack<Schema.Field>();
    Schema schema0 = Schema.createRecord((List<Schema.Field>) stack0);
    String string0 = schema0.toString((Collection<Schema>) null, true);
    assertEquals("{\n  \"type\" : \"record\",\n  \"fields\" : [ ]\n}", string0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test070() throws Throwable {
    Schema.Type schema_Type0 = Schema.Type.RECORD;
    // Undeclared exception!
    try {
      Schema.create(schema_Type0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Can't create a: RECORD
      //
      assertNotNull(e);
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test071() throws Throwable {
    Schema.Type schema_Type0 = Schema.Type.UNION;
    String string0 = schema_Type0.getName();
    assertEquals("union", string0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test072() throws Throwable {
    Schema.Type schema_Type0 = Schema.Type.INT;
    Schema schema0 = Schema.create(schema_Type0);
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.ASCENDING;
    Object object0 = Schema.Field.NULL_DEFAULT_VALUE;
    Schema.Field schema_Field0 = null;
    try {
      schema_Field0 = new Schema.Field(
          " is not accessible (non-public?): not allowed to try modify access via Reflection: cannot instantiate type",
          schema0, "array", object0, schema_Field_Order0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Illegal initial character: is not accessible (non-public?): not allowed to
      // try modify access via Reflection: cannot instantiate type
      //
      assertNotNull(e);
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test073() throws Throwable {
    Schema.Type schema_Type0 = Schema.Type.BYTES;
    Schema schema0 = Schema.create(schema_Type0);
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.ASCENDING;
    Schema.Field schema_Field0 = new Schema.Field("WRITE_BIGDECIMAL_AS_PLAIN", schema0, "WRITE_BIGDECIMAL_AS_PLAIN",
        "WRITE_BIGDECIMAL_AS_PLAIN", schema_Field_Order0);
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test074() throws Throwable {
    Schema.Type schema_Type0 = Schema.Type.LONG;
    Schema schema0 = Schema.create(schema_Type0);
    Schema.Names schema_Names0 = new Schema.Names();
    Schema schema1 = schema_Names0.getOrDefault(schema0, schema0);
    Schema schema2 = schema_Names0.getOrDefault(schema1, schema0);
    assertSame(schema2, schema0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test075() throws Throwable {
    Schema schema0 = Schema.parse("{\n  \"type\" : \"array\",\n  \"items\" : \"string\"\n}");
    assertFalse(schema0.isUnion());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test076() throws Throwable {
    Schema schema0 = Schema.createFixed("RECORD", "RECORD", "RECORD", 2137);
    schema0.hashCode();
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test077() throws Throwable {
    Schema schema0 = Schema.createFixed("WRIE_BIGCIMAL_AS_PLAIN", "WRIE_BIGCIMAL_AS_PLAIN", "WRIE_BIGCIMAL_AS_PLAIN",
        33);
    int int0 = schema0.getFixedSize();
    assertEquals(33, int0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test078() throws Throwable {
    NameValidator nameValidator0 = Schema.getNameValidator();
    ParseContext parseContext0 = new ParseContext(nameValidator0);
    LinkedList<Schema.Field> linkedList0 = new LinkedList<Schema.Field>();
    Schema schema0 = Schema.createRecord((List<Schema.Field>) linkedList0);
    Schema schema1 = parseContext0.resolve(schema0);
    Schema schema2 = Schema.applyAliases(schema0, schema1);
    assertSame(schema2, schema0);
    assertTrue(schema2.equals((Object) schema1));
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test079() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    LinkedList<Schema> linkedList0 = new LinkedList<Schema>();
    linkedList0.add(schema0);
    String string0 = schema0.toString((Collection<Schema>) linkedList0, true);
    assertEquals("[ \"string\" ]", string0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test080() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Integer integer0 = schema0.getIndexNamed("tNc(.W5lV*,(");
    assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test081() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    // Undeclared exception!
    try {
      schema0.addProp((String) null, (String) null);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Can't set properties on a union: [\"string\"]
      //
      assertNotNull(e);
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test082() throws Throwable {
    Schema.Names schema_Names0 = new Schema.Names();
    String string0 = schema_Names0.space();
    assertNull(string0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test083() throws Throwable {
    Schema.Names schema_Names0 = new Schema.Names();
    schema_Names0.space((String) null);
    assertTrue(schema_Names0.isEmpty());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test084() throws Throwable {
    Schema.Names schema_Names0 = new Schema.Names("`|-k$");
    Schema schema0 = schema_Names0.getOrDefault("`|-k$", (Schema) null);
    // Undeclared exception!
    try {
      schema_Names0.add(schema0);
      fail("Expecting exception: NullPointerException");

    } catch (NullPointerException e) {
      //
      // no message in exception (getMessage() returned null)
      //
      assertNotNull(e);
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test085() throws Throwable {
    Vector<String> vector0 = new Vector<String>();
    Schema schema0 = Schema.createEnum("WRIE_BIGCIMAL_AS_PLAIN", "WRIE_BIGCIMAL_AS_PLAIN", "WRIE_BIGCIMAL_AS_PLAIN",
        (List<String>) vector0);
    List<String> list0 = schema0.getEnumSymbols();
    assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test086() throws Throwable {
    Vector<String> vector0 = new Vector<String>();
    Schema schema0 = Schema.createEnum("WRIE_BIGCIMAL_AS_PLAIN", "WRIE_BIGCIMAL_AS_PLAIN", "WRIE_BIGCIMAL_AS_PLAIN",
        (List<String>) vector0);
    schema0.hashCode();
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test087() throws Throwable {
    Schema.Parser schema_Parser0 = new Schema.Parser();
    boolean boolean0 = schema_Parser0.getValidateDefaults();
    assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test088() throws Throwable {
    NameValidator nameValidator0 = Schema.getNameValidator();
    ParseContext parseContext0 = new ParseContext(nameValidator0);
    Schema.Parser schema_Parser0 = new Schema.Parser(parseContext0);
    schema_Parser0.parseInternal("{\n  \"type\" : \"array\",\n  \"items\" : \"string\"\n}");
    assertTrue(schema_Parser0.getValidateDefaults());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test089() throws Throwable {
    NameValidator nameValidator0 = Schema.getNameValidator();
    ParseContext parseContext0 = new ParseContext(nameValidator0);
    Schema.Parser schema_Parser0 = new Schema.Parser(parseContext0);
    schema_Parser0.setValidateDefaults(true);
    assertTrue(schema_Parser0.getValidateDefaults());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test090() throws Throwable {
    NameValidator nameValidator0 = Schema.getNameValidator();
    Schema.Parser schema_Parser0 = new Schema.Parser(nameValidator0);
    schema_Parser0.getTypes();
    assertTrue(schema_Parser0.getValidateDefaults());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test091() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema.Field schema_Field0 = new Schema.Field("WRIE_BIGCIMAL_AS_PLAIN", schema0);
    Schema.Field[] schema_FieldArray0 = new Schema.Field[7];
    Schema.Field schema_Field1 = new Schema.Field(schema_Field0, schema0);
    schema_FieldArray0[0] = schema_Field1;
    schema_FieldArray0[1] = schema_Field0;
    Schema.LockableArrayList<Schema.Field> schema_LockableArrayList0 = new Schema.LockableArrayList<Schema.Field>(
        schema_FieldArray0);
    // Undeclared exception!
    try {
      Schema.createRecord((List<Schema.Field>) schema_LockableArrayList0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Duplicate field WRIE_BIGCIMAL_AS_PLAIN in record null: WRIE_BIGCIMAL_AS_PLAIN
      // type:UNION pos:1 and WRIE_BIGCIMAL_AS_PLAIN type:UNION pos:0.
      //
      assertNotNull(e);
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test092() throws Throwable {
    Schema.Names schema_Names0 = new Schema.Names(
        "com.fasterxml.jackson.core.json.async.NonBlockingByteBufferJsonParser");
    schema_Names0.get("float");
    DeserializerFactoryConfig deserializerFactoryConfig0 = new DeserializerFactoryConfig();
    BeanDeserializerFactory beanDeserializerFactory0 = new BeanDeserializerFactory(deserializerFactoryConfig0);
    DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(
        beanDeserializerFactory0);
    JsonFactoryBuilder jsonFactoryBuilder0 = new JsonFactoryBuilder();
    JsonFactory jsonFactory0 = new JsonFactory(jsonFactoryBuilder0);
    char[] charArray0 = new char[0];
    JsonParser jsonParser0 = jsonFactory0.createParser(charArray0);
    defaultDeserializationContext_Impl0.bufferForInputBuffering(jsonParser0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test093() throws Throwable {
    Vector<String> vector0 = new Vector<String>();
    Schema schema0 = Schema.createEnum("WRIE_BIGCIMAL_AS_PLAIN", "WRIE_BIGCIMAL_AS_PLAIN", "WRIE_BIGCIMAL_AS_PLAIN",
        (List<String>) vector0);
    // Undeclared exception!
    try {
      schema0.getFields();
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not a record:
      // {\"type\":\"enum\",\"name\":\"WRIE_BIGCIMAL_AS_PLAIN\",\"namespace\":\"WRIE_BIGCIMAL_AS_PLAIN\",\"doc\":\"WRIE_BIGCIMAL_AS_PLAIN\",\"symbols\":[]}
      //
      assertNotNull(e);
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test094() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema.Field schema_Field0 = new Schema.Field("AXgkg", schema0, "(-t4MvS6/y", "AXgkg");
    boolean boolean0 = schema_Field0.hasDefaultValue();
    assertEquals("(-t4MvS6/y", schema_Field0.doc());
    assertTrue(boolean0);
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test095() throws Throwable {
    Vector<String> vector0 = new Vector<String>();
    // Undeclared exception!
    try {
      Schema.createEnum("bytes", "bytes", "", (List<String>) vector0, "K{p2RUw/f#rVV=rJ8");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // The Enum Default: K{p2RUw/f#rVV=rJ8 is not in the enum symbol set: []
      //
      assertNotNull(e);
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test096() throws Throwable {
    Vector<String> vector0 = new Vector<String>();
    Schema schema0 = Schema.createEnum("WRIE_BIGCIMAL_AS_PLAIN", "WRIE_BIGCIMAL_AS_PLAIN",
        "org.apache.avro.compiler.UnresolvedSchema_777", (List<String>) vector0);
    LinkedList<Schema.Field> linkedList0 = new LinkedList<Schema.Field>();
    // Undeclared exception!
    try {
      schema0.setFields(linkedList0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not a record:
      // {\"type\":\"enum\",\"name\":\"WRIE_BIGCIMAL_AS_PLAIN\",\"namespace\":\"org.apache.avro.compiler.UnresolvedSchema_777\",\"doc\":\"WRIE_BIGCIMAL_AS_PLAIN\",\"symbols\":[]}
      //
      assertNotNull(e);
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test098() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    // Undeclared exception!
    try {
      schema0.addAlias("M/}w", "M/}w");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not a named type: \"string\"
      //
      assertNotNull(e);
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test099() throws Throwable {
    boolean boolean0 = Schema.getValidateDefaults();
    assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test100() throws Throwable {
    Schema schema0 = Schema.createMap((Schema) null);
    // Undeclared exception!
    try {
      schema0.getEnumDefault();
      fail("Expecting exception: NullPointerException");

    } catch (NullPointerException e) {
      //
      // no message in exception (getMessage() returned null)
      //
      assertNotNull(e);
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test101() throws Throwable {
    Schema.Type schema_Type0 = Schema.Type.FLOAT;
    Schema schema0 = Schema.create(schema_Type0);
    // Undeclared exception!
    try {
      schema0.addAlias("U`M7LSUT#d6");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not a named type: \"float\"
      //
      assertNotNull(e);
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test102() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    String string0 = schema0.getDoc();
    assertNull(string0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test103() throws Throwable {
    Vector<String> vector0 = new Vector<String>();
    Schema schema0 = Schema.createEnum("WRIE_BIGCIMAL_AS_PLAIN", "WRIE_BIGCIMAL_AS_PLAIN",
        "org.apache.avro.compiler.UnresolvedSchema_777", (List<String>) vector0);
    // Undeclared exception!
    try {
      schema0.getElementType();
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not an array:
      // {\"type\":\"enum\",\"name\":\"WRIE_BIGCIMAL_AS_PLAIN\",\"namespace\":\"org.apache.avro.compiler.UnresolvedSchema_777\",\"doc\":\"WRIE_BIGCIMAL_AS_PLAIN\",\"symbols\":[]}
      //
      assertNotNull(e);
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test105() throws Throwable {
    Schema.Type schema_Type0 = Schema.Type.BOOLEAN;
    Schema schema0 = Schema.create(schema_Type0);
    // Undeclared exception!
    try {
      schema0.getNamespace();
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not a named type: \"boolean\"
      //
      assertNotNull(e);
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test106() throws Throwable {
    Vector<String> vector0 = new Vector<String>();
    Schema schema0 = Schema.createEnum("WRIE_BIGCIMAL_AS_PLAIN", "WRIE_BIGCIMAL_AS_PLAIN", "WRIE_BIGCIMAL_AS_PLAIN",
        (List<String>) vector0);
    // Undeclared exception!
    try {
      schema0.hasFields();
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not a record:
      // {\"type\":\"enum\",\"name\":\"WRIE_BIGCIMAL_AS_PLAIN\",\"namespace\":\"WRIE_BIGCIMAL_AS_PLAIN\",\"doc\":\"WRIE_BIGCIMAL_AS_PLAIN\",\"symbols\":[]}
      //
      assertNotNull(e);
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test107() throws Throwable {
    InputStream inputStream0 = InputStream.nullInputStream();
    // Undeclared exception!
    try {
      Schema.parse(inputStream0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Cannot parse <null> schema
      //
      assertNotNull(e);
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test108() throws Throwable {
    // Undeclared exception!
    try {
      Schema.parseJsonToObject("_23B*Cxt1T>Wn4`ejW");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // com.fasterxml.jackson.core.JsonParseException: Unrecognized token '_23B': was
      // expecting (JSON String, Number, Array, Object or token 'null', 'true' or
      // 'false')
      // at [Source: (String)\"_23B*Cxt1T>Wn4`ejW\"; line: 1, column: 5]
      //
      assertNotNull(e);
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test109() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    // Undeclared exception!
    try {
      schema0.getValueType();
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not a map: \"string\"
      //
      assertNotNull(e);
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test110() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    // Undeclared exception!
    try {
      schema0.getTypes();
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not a union: \"string\"
      //
      assertNotNull(e);
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test111() throws Throwable {
    Stack<Schema.Field> stack0 = new Stack<Schema.Field>();
    Schema schema0 = Schema.createRecord((List<Schema.Field>) stack0);
    // Undeclared exception!
    try {
      schema0.getEnumSymbols();
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not an enum: {\"type\":\"record\",\"fields\":[]}
      //
      assertNotNull(e);
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test112() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    // Undeclared exception!
    try {
      schema0.getAliases();
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not a named type: \"string\"
      //
      assertNotNull(e);
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test113() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    // Undeclared exception!
    try {
      schema0.getField("org.apache.avro.compiler.UnresolvedSchema_322");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not a record: \"string\"
      //
      assertNotNull(e);
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test115() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    schema0.setLogicalType((LogicalType) null);
    assertEquals(Schema.Type.UNION, schema0.getType());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test116() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    // Undeclared exception!
    try {
      schema0.isError();
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not a record: [\"string\"]
      //
      assertNotNull(e);
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test117() throws Throwable {
    Stack<Schema.Field> stack0 = new Stack<Schema.Field>();
    Schema schema0 = Schema.createRecord((List<Schema.Field>) stack0);
    // Undeclared exception!
    try {
      schema0.getIndexNamed("livQhWT|wv.~mr");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not a union: {\"type\":\"record\",\"fields\":[]}
      //
      assertNotNull(e);
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test118() throws Throwable {
    // Undeclared exception!
    try {
      Schema.parse(
          "{\n  \"type\" : \"error\",\n  \"name\" : \"STRING\",\n  \"namespace\" : \"STRING\",\n  \"doc\" : \"STRING\"\n}");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Record has no fields:
      // {\"type\":\"error\",\"name\":\"STRING\",\"namespace\":\"STRING\",\"doc\":\"STRING\"}
      //
      assertNotNull(e);
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test119() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field schema_Field0 = new Schema.Field("STRING", schema0, "NULL");
    int int0 = schema_Field0.pos();
    assertEquals((-1), int0);
    assertEquals("NULL", schema_Field0.doc());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test120() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field schema_Field0 = new Schema.Field("STRING", schema0, "NULL");
    schema_Field0.defaultVal();
    assertEquals((-1), schema_Field0.pos());
    assertEquals("NULL", schema_Field0.doc());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test121() throws Throwable {
    Vector<String> vector0 = new Vector<String>();
    Schema schema0 = Schema.createEnum("WRIE_BIGCIMAL_AS_PLAIN", "WRIE_BIGCIMAL_AS_PLAIN", "'CjSYa(ppX}br",
        (List<String>) vector0);
    Schema.Field schema_Field0 = new Schema.Field("WRIE_BIGCIMAL_AS_PLAIN", schema0);
    String string0 = schema_Field0.doc();
    assertEquals((-1), schema_Field0.pos());
    assertEquals("WRIE_BIGCIMAL_AS_PLAIN", schema0.getDoc());
    assertNull(string0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test122() throws Throwable {
    Vector<String> vector0 = new Vector<String>();
    Schema schema0 = Schema.createEnum("WRIp_BIGCIMAL_AS_GLvIN", "WRIp_BIGCIMAL_AS_GLvIN", "'CjSYa(ppX}br",
        (List<String>) vector0);
    Schema.Field schema_Field0 = new Schema.Field("WRIp_BIGCIMAL_AS_GLvIN", schema0, "WRIp_BIGCIMAL_AS_GLvIN");
    List<Schema.Field> list0 = List.of(schema_Field0, schema_Field0, schema_Field0, schema_Field0, schema_Field0,
        schema_Field0, schema_Field0, schema_Field0);
    // Undeclared exception!
    try {
      Schema.createRecord("WRIp_BIGCIMAL_AS_GLvIN", "8b?|Gsrd!.S", "", false, list0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Field already used: WRIp_BIGCIMAL_AS_GLvIN type:ENUM pos:0
      //
      assertNotNull(e);
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test123() throws Throwable {
    Vector<String> vector0 = new Vector<String>();
    Schema schema0 = Schema.createEnum("WRIE_BIGCIMAL_AS_PLAIN", "WRIE_BIGCIMAL_AS_PLAIN", "'CjSYa(ppX}br",
        (List<String>) vector0);
    Schema.Field schema_Field0 = new Schema.Field("WRIE_BIGCIMAL_AS_PLAIN", schema0);
    schema_Field0.defaultValue();
    assertEquals("WRIE_BIGCIMAL_AS_PLAIN", schema0.getDoc());
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test124() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field schema_Field0 = new Schema.Field("WRITE_BIGDECIMAL_AS_PLAIN", schema0);
    schema_Field0.schema();
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test125() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field schema_Field0 = new Schema.Field("STRING", schema0, "NULL");
    schema_Field0.order();
    assertEquals((-1), schema_Field0.pos());
    assertEquals("NULL", schema_Field0.doc());
    assertEquals("STRING", schema_Field0.name());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test126() throws Throwable {
    Schema.LockableArrayList<Schema.Field> schema_LockableArrayList0 = new Schema.LockableArrayList<Schema.Field>(2294);
    // Undeclared exception!
    try {
      schema_LockableArrayList0.addAll(2294, (Collection<? extends Schema.Field>) schema_LockableArrayList0);
      fail("Expecting exception: IndexOutOfBoundsException");

    } catch (IndexOutOfBoundsException e) {
      //
      // Index: 2294, Size: 0
      //
      assertNotNull(e);
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test127() throws Throwable {
    Schema.LockableArrayList<BinaryNode> schema_LockableArrayList0 = new Schema.LockableArrayList<BinaryNode>(13);
    HashSet<BinaryNode> hashSet0 = new HashSet<BinaryNode>();
    boolean boolean0 = schema_LockableArrayList0.addAll((Collection<? extends BinaryNode>) hashSet0);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test128() throws Throwable {
    Month[] monthArray0 = new Month[9];
    Month month0 = Month.AUGUST;
    Schema.LockableArrayList<Month> schema_LockableArrayList0 = new Schema.LockableArrayList<Month>(monthArray0);
    boolean boolean0 = schema_LockableArrayList0.remove((Object) month0);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test129() throws Throwable {
    Schema[] schemaArray0 = new Schema[0];
    Schema schema0 = Schema.createUnion(schemaArray0);
    assertTrue(schema0.isUnion());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test130() throws Throwable {
    Schema.LockableArrayList<Object> schema_LockableArrayList0 = new Schema.LockableArrayList<Object>();
    // Undeclared exception!
    try {
      schema_LockableArrayList0.remove(1508);
      fail("Expecting exception: IndexOutOfBoundsException");

    } catch (IndexOutOfBoundsException e) {
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test131() throws Throwable {
    Stack<Schema.Field> stack0 = new Stack<Schema.Field>();
    Schema.LockableArrayList<ObjectMapper.DefaultTyping> schema_LockableArrayList0 = new Schema.LockableArrayList<ObjectMapper.DefaultTyping>();
    boolean boolean0 = schema_LockableArrayList0.removeAll(stack0);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test132() throws Throwable {
    Schema.LockableArrayList<Schema> schema_LockableArrayList0 = new Schema.LockableArrayList<Schema>();
    // Undeclared exception!
    try {
      schema_LockableArrayList0.retainAll((Collection<?>) null);
      fail("Expecting exception: NullPointerException");

    } catch (NullPointerException e) {
      //
      // no message in exception (getMessage() returned null)
      //
      assertNotNull(e);
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test133() throws Throwable {
    Schema.LockableArrayList<ObjectMapper.DefaultTyping> schema_LockableArrayList0 = new Schema.LockableArrayList<ObjectMapper.DefaultTyping>();
    schema_LockableArrayList0.clear();
    assertTrue(schema_LockableArrayList0.isEmpty());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test134() throws Throwable {
    Schema schema0 = Schema.createMap((Schema) null);
    // Undeclared exception!
    try {
      schema0.hashCode();
      fail("Expecting exception: NullPointerException");

    } catch (NullPointerException e) {
      //
      // no message in exception (getMessage() returned null)
      //
      assertNotNull(e);
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test135() throws Throwable {
    Schema schema0 = Schema.parse("{\n  \"type\" : \"map\",\n  \"values\" : [ \"string\" ]\n}");
    assertFalse(schema0.isUnion());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test00() throws Throwable {
    JsonNodeFactory jsonNodeFactory0 = new JsonNodeFactory(true);
    HashMap<String, JsonNode> hashMap0 = new HashMap<String, JsonNode>();
    ObjectNode objectNode0 = new ObjectNode(jsonNodeFactory0, hashMap0);
    Schema[] schemaArray0 = new Schema[0];
    Schema schema0 = Schema.createUnion(schemaArray0);
    Schema.Field schema_Field0 = new Schema.Field("DESCENDING", schema0);
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.ASCENDING;
    Schema.Field schema_Field1 = new Schema.Field("DESCENDING", schema0, "hbB\"", objectNode0, false,
        schema_Field_Order0);
    boolean boolean0 = schema_Field1.equals(schema_Field0);
    assertFalse(boolean0);
    assertEquals("hbB\"", schema_Field1.doc());
    assertEquals((-1), schema_Field1.pos());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test01() throws Throwable {
    Schema[] schemaArray0 = new Schema[0];
    Schema schema0 = Schema.createUnion(schemaArray0);
    Schema.Field schema_Field0 = new Schema.Field("DESCENDING", schema0, "DESCENDING");
    Schema.Field schema_Field1 = new Schema.Field(schema_Field0, schema0);
    assertTrue(schema_Field1.equals((Object) schema_Field0));

    schema_Field0.addProp("DESCENDING", (Object) "DESCENDING");
    boolean boolean0 = schema_Field0.equals(schema_Field1);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test02() throws Throwable {
    FloatNode floatNode0 = FloatNode.valueOf(1597.9246F);
    List<String> list0 = floatNode0.findValuesAsText("DESCENDING");
    Schema schema0 = Schema.createEnum("DESCENDING", "DESCENDING", "DESCENDING", list0);
    Schema.Field schema_Field0 = new Schema.Field("DESCENDING", schema0);
    POJONode pOJONode0 = new POJONode(schema_Field0);
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.DESCENDING;
    Schema.Field schema_Field1 = new Schema.Field("DESCENDING", schema0, "DESCENDING", pOJONode0, false,
        schema_Field_Order0);
    boolean boolean0 = schema_Field0.equals(schema_Field1);
    assertEquals((-1), schema_Field1.pos());
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test03() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema.Field schema_Field0 = new Schema.Field("DESCENDING", schema0, "$VALUES");
    Schema schema1 = Protocol.SYSTEM_ERROR;
    Schema.Field schema_Field1 = new Schema.Field(schema_Field0, schema1);
    boolean boolean0 = schema_Field0.equals(schema_Field1);
    assertEquals((-1), schema_Field1.pos());
    assertEquals("$VALUES", schema_Field1.doc());
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test04() throws Throwable {
    Schema[] schemaArray0 = new Schema[0];
    Schema schema0 = Schema.createUnion(schemaArray0);
    Schema.Field schema_Field0 = new Schema.Field("DESCENDING", schema0, "DESCENDING");
    Schema.Field schema_Field1 = new Schema.Field("InwD", schema0);
    boolean boolean0 = schema_Field0.equals(schema_Field1);
    assertFalse(boolean0);
    assertEquals((-1), schema_Field1.pos());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test05() throws Throwable {
    JsonNodeFactory jsonNodeFactory0 = new JsonNodeFactory(true);
    HashMap<String, JsonNode> hashMap0 = new HashMap<String, JsonNode>();
    ObjectNode objectNode0 = new ObjectNode(jsonNodeFactory0, hashMap0);
    Schema[] schemaArray0 = new Schema[0];
    Schema schema0 = Schema.createUnion(schemaArray0);
    Schema.Field schema_Field0 = new Schema.Field("DESCENDING", schema0);
    NullNode nullNode0 = objectNode0.nullNode();
    boolean boolean0 = schema_Field0.equals(nullNode0);
    assertFalse(boolean0);
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test06() throws Throwable {
    FloatNode floatNode0 = FloatNode.valueOf(1597.9246F);
    List<String> list0 = floatNode0.findValuesAsText("DESCENDING");
    Schema schema0 = Schema.createEnum("DESCENDING", "DESCENDING", "DESCENDING", list0);
    Schema.Field schema_Field0 = new Schema.Field("DESCENDING", schema0);
    boolean boolean0 = schema_Field0.equals(schema_Field0);
    assertTrue(boolean0);
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test07() throws Throwable {
    FloatNode floatNode0 = FloatNode.valueOf(1597.9246F);
    List<String> list0 = floatNode0.findValuesAsText("DESCENDING");
    Schema schema0 = Schema.createEnum("DESCENDING", "DESCENDING", "DESCENDING", list0);
    Schema.Field schema_Field0 = new Schema.Field("DESCENDING", schema0);
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.IGNORE;
    Schema.Field schema_Field1 = new Schema.Field("DESCENDING", schema0, "DESCENDING", (JsonNode) null, false,
        schema_Field_Order0);
    boolean boolean0 = schema_Field0.equals(schema_Field1);
    assertEquals((-1), schema_Field1.pos());
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test08() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field schema_Field0 = new Schema.Field("USE_FAST_DOUBLE_PARSER", schema0, "USE_FAST_DOUBLE_PARSER");
    schema_Field0.aliases();
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test09() throws Throwable {
    Schema[] schemaArray0 = new Schema[0];
    Schema schema0 = Schema.createUnion(schemaArray0);
    Schema.Field schema_Field0 = new Schema.Field("DESCENDING", schema0, "DESCENDING");
    schema_Field0.addAlias("DESCENDING");
    Set<String> set0 = schema_Field0.aliases();
    assertTrue(set0.contains("DESCENDING"));
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test10() throws Throwable {
    Schema[] schemaArray0 = new Schema[0];
    Schema schema0 = Schema.createUnion(schemaArray0);
    Schema.Field schema_Field0 = new Schema.Field("DESCENDING", schema0,
        "com.fasterxml.jackson.databind.cfg.ConfigOverride$Empty");
    schema_Field0.addAlias("com.fasterxml.jackson.databind.cfg.ConfigOverride$Empty");
    schema_Field0.addAlias("DESCENDING");
    assertEquals("com.fasterxml.jackson.databind.cfg.ConfigOverride$Empty", schema_Field0.doc());
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test11() throws Throwable {
    JsonNodeFactory jsonNodeFactory0 = JsonNodeFactory.instance;
    HashMap<String, JsonNode> hashMap0 = new HashMap<String, JsonNode>();
    ObjectNode objectNode0 = new ObjectNode(jsonNodeFactory0, hashMap0);
    Schema[] schemaArray0 = new Schema[0];
    Schema schema0 = Schema.createUnion(schemaArray0);
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.ASCENDING;
    Schema.Field schema_Field0 = new Schema.Field("DESCENDING", schema0, "DESCENDING", objectNode0, false,
        schema_Field_Order0);
    boolean boolean0 = schema_Field0.hasDefaultValue();
    assertTrue(boolean0);
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test12() throws Throwable {
    FloatNode floatNode0 = FloatNode.valueOf(1597.9246F);
    List<String> list0 = floatNode0.findValuesAsText("DESCENDING");
    Schema schema0 = Schema.createEnum("DESCENDING", "DESCENDING", "DESCENDING", list0);
    Schema.Field schema_Field0 = new Schema.Field("DESCENDING", schema0);
    boolean boolean0 = schema_Field0.hasDefaultValue();
    assertFalse(boolean0);
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test13() throws Throwable {
    Object object0 = Schema.Field.NULL_DEFAULT_VALUE;
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.DESCENDING;
    Schema.Field schema_Field0 = null;
    try {
      schema_Field0 = new Schema.Field((String) null, (Schema) null, (String) null, object0, schema_Field_Order0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Null name
      //
      assertNotNull(e);
    }
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test14() throws Throwable {
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.IGNORE;
    Schema.Field schema_Field0 = null;
    try {
      schema_Field0 = new Schema.Field((String) null, (Schema) null, (String) null, (Object) null, schema_Field_Order0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Null name
      //
      assertNotNull(e);
    }
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test15() throws Throwable {
    Schema[] schemaArray0 = new Schema[0];
    Schema schema0 = Schema.createUnion(schemaArray0);
    Object object0 = Schema.Field.NULL_DEFAULT_VALUE;
    Schema.Field schema_Field0 = null;
    try {
      schema_Field0 = new Schema.Field("#-G`\"wLcc6L[ATJ\"U#", schema0, "#-G`\"wLcc6L[ATJ\"U#", object0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Illegal initial character: #-G`\"wLcc6L[ATJ\"U#
      //
      assertNotNull(e);
    }
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test16() throws Throwable {
    LinkedList<Schema> linkedList0 = new LinkedList<Schema>();
    Schema schema0 = Schema.createUnion((List<Schema>) linkedList0);
    Schema.Field schema_Field0 = null;
    try {
      schema_Field0 = new Schema.Field("FAIL_ON_EMPTY_BEANS", schema0, "FAIL_ON_EMPTY_BEANS", linkedList0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Invalid default for field FAIL_ON_EMPTY_BEANS: [] not a []
      //
      assertNotNull(e);
    }
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test17() throws Throwable {
    Schema[] schemaArray0 = new Schema[0];
    Schema schema0 = Schema.createUnion(schemaArray0);
    Schema.Field schema_Field0 = new Schema.Field("DESCENDING", schema0,
        "com.fasterxml.jackson.databind.cfg.ConfigOverride$Empty");
    schema_Field0.addAlias("DESCENDING");
    Schema.Field schema_Field1 = new Schema.Field(schema_Field0, schema0);
    assertEquals("com.fasterxml.jackson.databind.cfg.ConfigOverride$Empty", schema_Field1.doc());
    assertEquals((-1), schema_Field1.pos());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test18() throws Throwable {
    Schema[] schemaArray0 = new Schema[0];
    Schema schema0 = Schema.createUnion(schemaArray0);
    Schema.Field schema_Field0 = new Schema.Field("DESCENDING", schema0, "DESCENDING");
    Schema.Field schema_Field1 = new Schema.Field(schema_Field0, schema0);
    boolean boolean0 = schema_Field0.equals(schema_Field1);
    assertTrue(boolean0);
    assertEquals((-1), schema_Field1.pos());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test19() throws Throwable {
    FloatNode floatNode0 = FloatNode.valueOf(1597.9246F);
    List<String> list0 = floatNode0.findValuesAsText("DESCENDING");
    Schema schema0 = Schema.createEnum("DESCENDING", "DESCENDING", "hbB\"", list0);
    Schema.Field schema_Field0 = new Schema.Field("DESCENDING", schema0, "hbB\"");
    int int0 = schema_Field0.pos();
    assertEquals((-1), int0);
    assertEquals("hbB\"", schema_Field0.doc());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test20() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field schema_Field0 = new Schema.Field("USE_FAST_DOUBLE_PARSER", schema0, "USE_FAST_DOUBLE_PARSER");
    schema_Field0.defaultVal();
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test21() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field schema_Field0 = new Schema.Field("USE_FAST_DOUBLE_PARSER", schema0, "USE_FAST_DOUBLE_PARSER");
    schema_Field0.hashCode();
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test22() throws Throwable {
    FloatNode floatNode0 = FloatNode.valueOf(1597.9246F);
    List<String> list0 = floatNode0.findValuesAsText("DESCENDING");
    Schema schema0 = Schema.createEnum("DESCENDING", "DESCENDING", "DESCENDING", list0);
    Schema.Field schema_Field0 = new Schema.Field("DESCENDING", schema0);
    String string0 = schema_Field0.doc();
    assertNull(string0);
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test23() throws Throwable {
    Schema[] schemaArray0 = new Schema[0];
    Schema schema0 = Schema.createUnion(schemaArray0);
    Schema.Field schema_Field0 = new Schema.Field("si", schema0);
    String string0 = schema_Field0.toString();
    assertEquals("si type:UNION pos:-1", string0);
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test24() throws Throwable {
    FloatNode floatNode0 = FloatNode.valueOf(1597.9246F);
    List<String> list0 = floatNode0.findValuesAsText("DESCENDING");
    Schema schema0 = Schema.createEnum("DESCENDING", "o^>bA", "hbB\"", list0);
    Schema.Field schema_Field0 = new Schema.Field("DESCENDING", schema0);
    schema_Field0.name();
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test25() throws Throwable {
    FloatNode floatNode0 = FloatNode.valueOf(1597.9246F);
    List<String> list0 = floatNode0.findValuesAsText("DESCENDING");
    Schema schema0 = Schema.createEnum("DESCENDING", "DESCENDING", "DESCENDING", list0);
    Schema.Field schema_Field0 = new Schema.Field("DESCENDING", schema0);
    schema_Field0.defaultValue();
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test26() throws Throwable {
    FloatNode floatNode0 = FloatNode.valueOf((short) 0);
    List<String> list0 = floatNode0.findValuesAsText("DESCENDING");
    Schema schema0 = Schema.createEnum("DESCENDING", "DESCENDING", "DESCENDING", list0);
    Schema.Field schema_Field0 = new Schema.Field("DESCENDING", schema0);
    schema_Field0.schema();
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test27() throws Throwable {
    ArrayList<String> arrayList0 = new ArrayList<String>();
    Schema schema0 = Schema.createEnum("DESCdNDING", "DESCdNDING", "DESCdNDING", (List<String>) arrayList0);
    Schema.Field schema_Field0 = new Schema.Field("DESCdNDING", schema0, "DESCdNDING");
    schema_Field0.order();
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schemaParser_ESTest_test0() throws Throwable {
    ParseContext parseContext0 = new ParseContext();
    Schema.Parser schema_Parser0 = new Schema.Parser(parseContext0);
    String[] stringArray0 = new String[5];
    stringArray0[0] = "\"as@~3FY~*xaSeYi";
    // Undeclared exception!
    try {
      schema_Parser0.parse("\"as@~3FY~*xaSeYi", stringArray0);
      fail("Expecting exception: NullPointerException");

    } catch (NullPointerException e) {
      //
      // Unknown schema: org.apache.avro.compiler.UnresolvedSchema_17
      //
      assertNotNull(e);
    }
  }

  @Test(timeout = 4000)
  public void schemaParser_ESTest_test1() throws Throwable {
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
      assertNotNull(e);
    }
  }

  @Test(timeout = 4000)
  public void schemaParser_ESTest_test2() throws Throwable {
    Schema.Parser schema_Parser0 = new Schema.Parser((NameValidator) null);
    assertTrue(schema_Parser0.getValidateDefaults());
  }

  @Test(timeout = 4000)
  public void schemaParser_ESTest_test3() throws Throwable {
    Schema.Parser schema_Parser0 = new Schema.Parser();
    boolean boolean0 = schema_Parser0.getValidateDefaults();
    assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void schemaParser_ESTest_test5() throws Throwable {
    Schema.Parser schema_Parser0 = new Schema.Parser();
    assertTrue(schema_Parser0.getValidateDefaults());

    schema_Parser0.setValidateDefaults(false);
    assertFalse(schema_Parser0.getValidateDefaults());
  }

  @Test(timeout = 4000)
  public void schemaParser_ESTest_test6() throws Throwable {
    ParseContext parseContext0 = new ParseContext();
    Schema.Parser schema_Parser0 = new Schema.Parser(parseContext0);
    schema_Parser0.getTypes();
    assertTrue(schema_Parser0.getValidateDefaults());
  }

  @Test(timeout = 4000)
  public void schemaParser_ESTest_test7() throws Throwable {
    ParseContext parseContext0 = new ParseContext();
    Schema.Parser schema_Parser0 = new Schema.Parser(parseContext0);
    // Undeclared exception!
    try {
      schema_Parser0.parse((InputStream) null);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Cannot parse <null> schema
      //
      assertNotNull(e);
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
