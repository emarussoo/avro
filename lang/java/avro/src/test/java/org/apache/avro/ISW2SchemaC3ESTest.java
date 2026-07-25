/*
 * Derived from EvoSuite 1.2.0 output for Schema C3 and selected nested classes.
 * EvoRunner, scaffolding, EvoSuite runtime assertions, VFS/VNET dependencies,
 * unstable assertions, mock-file dependencies, non-restored global-state
 * mutations, and tests without an observable oracle were removed.
 * The same conservative adaptation criteria used for C0-C2 were applied.
 */
package org.apache.avro;

import static org.junit.Assert.*;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.cfg.EnumFeature;
import com.fasterxml.jackson.databind.ext.NioPathSerializer;
import com.fasterxml.jackson.databind.node.BooleanNode;
import com.fasterxml.jackson.databind.node.NumericNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.ShortNode;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.BufferedInputStream;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;
import org.apache.avro.LogicalType;
import org.apache.avro.NameValidator;
import org.apache.avro.ParseContext;
import org.apache.avro.Protocol;
import org.apache.avro.Schema;
import org.junit.Test;

public class ISW2SchemaC3ESTest {

  @Test(timeout = 4000)
  public void schema_ESTest_test000() throws Throwable {
    Schema.LockableArrayList<String> schema_LockableArrayList0 = new Schema.LockableArrayList<String>();
    schema_LockableArrayList0.lock();
    // Undeclared exception!
    try {
      schema_LockableArrayList0.add("m^9Z==HKqPyw");
      fail("Expecting exception: IllegalStateException");

    } catch (IllegalStateException e) {
      //
      // no message in exception (getMessage() returned null)
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test001() throws Throwable {
    ShortNode shortNode0 = ShortNode.valueOf((short) 3);
    Set<String> set0 = Schema.parseAliases(shortNode0);
    assertNull(set0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test002() throws Throwable {
    BooleanNode booleanNode0 = BooleanNode.TRUE;
    // Undeclared exception!
    try {
      Schema.parse((JsonNode) booleanNode0, (ParseContext) null, "s=Q&.9");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Schema not yet supported: true
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test003() throws Throwable {
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
  public void schema_ESTest_test004() throws Throwable {
    ParseContext parseContext0 = new ParseContext();
    // Undeclared exception!
    try {
      Schema.parse((JsonNode) null, parseContext0, ">H=Q+_f");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Cannot parse <null> schema
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test005() throws Throwable {
    Stack<Schema.Field> stack0 = new Stack<Schema.Field>();
    Schema schema0 = Schema.createRecord((List<Schema.Field>) stack0);
    ShortNode shortNode0 = ShortNode.valueOf((short) 644);
    boolean boolean0 = schema0.isValidDefault(shortNode0);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test006() throws Throwable {
    Schema schema0 = Schema.createFixed("error", "error", "error", 4);
    ShortNode shortNode0 = ShortNode.valueOf((short) 180);
    boolean boolean0 = schema0.isValidDefault(shortNode0);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test007() throws Throwable {
    ShortNode shortNode0 = ShortNode.valueOf((short) 180);
    Schema schema0 = Schema.createMap((Schema) null);
    boolean boolean0 = schema0.isValidDefault(shortNode0);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test008() throws Throwable {
    Vector<Schema.Field> vector0 = new Vector<Schema.Field>();
    Schema schema0 = Schema.createRecord((List<Schema.Field>) vector0);
    boolean boolean0 = schema0.isValidDefault((JsonNode) null);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test009() throws Throwable {
    Schema schema0 = Schema.createArray((Schema) null);
    Schema.Field schema_Field0 = null;
    try {
      schema_Field0 = new Schema.Field("vK", schema0, "SXe6P", "SXe6P");
      fail("Expecting exception: NullPointerException");

    } catch (NullPointerException e) {
      //
      // no message in exception (getMessage() returned null)
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test010() throws Throwable {
    Schema.Names schema_Names0 = new Schema.Names();
    Schema.Name schema_Name0 = new Schema.Name((String) null, (String) null);
    schema_Names0.put(schema_Name0, (Schema) null);
    Schema schema0 = Schema.createArray((Schema) null);
    // Undeclared exception!
    try {
      schema_Names0.put(schema_Name0, schema0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Can't redefine: null
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test011() throws Throwable {
    Schema.Names schema_Names0 = new Schema.Names();
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    schema_Names0.put((Schema.Name) null, schema0);
    Schema schema1 = schema_Names0.put((Schema.Name) null, schema0);
    assertEquals(Schema.Type.UNION, schema1.getType());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test012() throws Throwable {
    ArrayList<String> arrayList0 = new ArrayList<String>();
    Schema schema0 = Schema.createEnum((String) null, "{`ktWXe[-*Y}3%UWGb", "{`ktWXe[-*Y}3%UWGb",
        (List<String>) arrayList0, (String) null);
    Schema.Names schema_Names0 = new Schema.Names();
    Schema.Name schema_Name0 = new Schema.Name((String) null, (String) null);
    schema_Names0.put(schema_Name0, schema0);
    boolean boolean0 = schema_Names0.contains(schema0);
    assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test013() throws Throwable {
    Schema schema0 = Schema.createRecord("SXe6P", "SXe6P", "SXe6P", true);
    Schema.Names schema_Names0 = new Schema.Names();
    boolean boolean0 = schema_Names0.contains(schema0);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test014() throws Throwable {
    Schema.Name schema_Name0 = new Schema.Name("UNION", ">0Bd^");
    Schema.Names schema_Names0 = new Schema.Names(">0Bd^");
    schema_Names0.put(schema_Name0, (Schema) null);
    Schema schema0 = schema_Names0.get("UNION");
    assertNull(schema0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test016() throws Throwable {
    // Undeclared exception!
    try {
      Schema.parse("org.apache.avro.Schema", true);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // com.fasterxml.jackson.core.JsonParseException: Unrecognized token 'org': was
      // expecting (JSON String, Number, Array, Object or token 'null', 'true' or
      // 'false')
      // at [Source: (String)\"org.apache.avro.Schema\"; line: 1, column: 4]
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test017() throws Throwable {
    // Undeclared exception!
    try {
      Schema.parse("com.fasterxml.jackson.databind", false);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // com.fasterxml.jackson.core.JsonParseException: Unrecognized token 'com': was
      // expecting (JSON String, Number, Array, Object or token 'null', 'true' or
      // 'false')
      // at [Source: (String)\"com.fasterxml.jackson.databind\"; line: 1, column: 4]
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test018() throws Throwable {
    Schema.Parser schema_Parser0 = new Schema.Parser();
    String[] stringArray0 = new String[1];
    // Undeclared exception!
    try {
      schema_Parser0.parse("') as character #", stringArray0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // com.fasterxml.jackson.core.JsonParseException: Unexpected character ('''
      // (code 39)): expected a valid value (JSON String, Number, Array, Object or
      // token 'null', 'true' or 'false')
      // at [Source: (String)\"') as character #null\"; line: 1, column: 2]
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test019() throws Throwable {
    Schema.Parser schema_Parser0 = new Schema.Parser((NameValidator) null);
    LinkedList<Schema> linkedList0 = new LinkedList<Schema>();
    Schema.Parser schema_Parser1 = schema_Parser0.addTypes((Iterable<Schema>) linkedList0);
    assertTrue(schema_Parser1.getValidateDefaults());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test020() throws Throwable {
    Schema schema0 = Schema.createFixed((String) null, (String) null, (String) null, 1);
    // Undeclared exception!
    try {
      schema0.getFields();
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not a record: {\"type\":\"fixed\",\"size\":1}
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test021() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Vector<Schema> vector0 = new Vector<Schema>();
    Schema.LockableArrayList<Schema> schema_LockableArrayList0 = new Schema.LockableArrayList<Schema>(vector0);
    Schema schema1 = Schema.createUnion((List<Schema>) schema_LockableArrayList0);
    Schema schema2 = Schema.applyAliases(schema1, schema0);
    assertSame(schema2, schema1);
    assertFalse(schema2.equals((Object) schema0));
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test022() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    List<Schema> list0 = List.of(schema0, schema0, schema0, schema0, schema0, schema0, schema0, schema0, schema0);
    // Undeclared exception!
    try {
      Schema.createUnion(list0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Duplicate in union:string
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test023() throws Throwable {
    Schema[] schemaArray0 = new Schema[1];
    Vector<Schema.Field> vector0 = new Vector<Schema.Field>();
    Schema schema0 = Schema.createRecord((List<Schema.Field>) vector0);
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
  public void schema_ESTest_test024() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema[] schemaArray0 = new Schema[1];
    schemaArray0[0] = schema0;
    // Undeclared exception!
    try {
      Schema.createUnion(schemaArray0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Nested union: [[\"string\"]]
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test025() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema schema1 = Schema.createMap(schema0);
    Schema schema2 = Schema.applyAliases(schema1, schema1);
    assertFalse(schema2.equals((Object) schema0));
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test026() throws Throwable {
    Schema schema0 = Schema.createMap((Schema) null);
    // Undeclared exception!
    try {
      Schema.applyAliases(schema0, (Schema) null);
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
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema schema1 = Schema.createArray(schema0);
    Schema schema2 = Schema.createArray(schema0);
    Schema schema3 = Schema.applyAliases(schema1, schema2);
    assertFalse(schema3.equals((Object) schema0));
    assertTrue(schema3.equals((Object) schema2));
    assertNotSame(schema3, schema2);
    assertFalse(schema0.equals((Object) schema1));
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test028() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema schema1 = Schema.createArray(schema0);
    Schema schema2 = Schema.createArray(schema1);
    Schema schema3 = Schema.applyAliases(schema2, schema1);
    assertFalse(schema3.equals((Object) schema1));
    assertNotSame(schema3, schema1);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test029() throws Throwable {
    Schema.LockableArrayList<String> schema_LockableArrayList0 = new Schema.LockableArrayList<String>();
    Schema schema0 = Schema.createEnum((String) null, (String) null, (String) null,
        (List<String>) schema_LockableArrayList0, (String) null);
    // Undeclared exception!
    try {
      schema0.getFields();
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not a record: {\"type\":\"enum\",\"symbols\":[]}
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test030() throws Throwable {
    Schema.LockableArrayList<String> schema_LockableArrayList0 = new Schema.LockableArrayList<String>();
    Schema schema0 = Schema.createEnum((String) null, (String) null, (String) null,
        (List<String>) schema_LockableArrayList0, (String) null);
    Schema schema1 = Schema.applyAliases(schema0, schema0);
    assertNull(schema1.getDoc());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test031() throws Throwable {
    Schema.LockableArrayList<String> schema_LockableArrayList0 = new Schema.LockableArrayList<String>();
    Schema schema0 = Schema.createEnum((String) null, "FlA0K(fwlxG#BQ", "FlA0K(fwlxG#BQ",
        (List<String>) schema_LockableArrayList0, (String) null);
    boolean boolean0 = schema0.equals(schema_LockableArrayList0);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test032() throws Throwable {
    Schema.LockableArrayList<String> schema_LockableArrayList0 = new Schema.LockableArrayList<String>();
    Schema schema0 = Schema.createEnum((String) null, "FlA0K(fwlxG#BQ", "FlA0K(fwlxG#BQ",
        (List<String>) schema_LockableArrayList0, (String) null);
    // Undeclared exception!
    try {
      schema0.getEnumOrdinal((String) null);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // enum value 'null' is not in the enum symbol set: []
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test033() throws Throwable {
    Schema.LockableArrayList<String> schema_LockableArrayList0 = new Schema.LockableArrayList<String>();
    schema_LockableArrayList0.add("null");
    Schema schema0 = Schema.createEnum("null", "null", "null", (List<String>) schema_LockableArrayList0, "null");
    assertFalse(schema0.isUnion());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test034() throws Throwable {
    Schema.LockableArrayList<String> schema_LockableArrayList0 = new Schema.LockableArrayList<String>();
    // Undeclared exception!
    try {
      Schema.createEnum("null", "null", "null", (List<String>) schema_LockableArrayList0, "null");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // The Enum Default: null is not in the enum symbol set: []
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test035() throws Throwable {
    ArrayList<String> arrayList0 = new ArrayList<String>();
    arrayList0.add("DESCENDING");
    Schema schema0 = Schema.createEnum((String) null, (String) null, "DESCENDING", (List<String>) arrayList0);
    assertEquals(Schema.Type.ENUM, schema0.getType());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test036() throws Throwable {
    Schema.LockableArrayList<String> schema_LockableArrayList0 = new Schema.LockableArrayList<String>();
    schema_LockableArrayList0.add("items");
    Schema schema0 = Schema.createEnum((String) null, "com.fasterxml.jackson.databind",
        "com.fasterxml.jackson.databind", (List<String>) schema_LockableArrayList0, (String) null);
    // Undeclared exception!
    try {
      schema0.getField("org.apache.avro.Schema$Field$Order");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not a record:
      // {\"type\":\"enum\",\"doc\":\"com.fasterxml.jackson.databind\",\"symbols\":[\"items\"]}
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test037() throws Throwable {
    Vector<Schema.Field> vector0 = new Vector<Schema.Field>();
    Schema schema0 = Schema.createRecord((List<Schema.Field>) vector0);
    Locale locale0 = Locale.KOREAN;
    Set<String> set0 = locale0.getUnicodeLocaleAttributes();
    String string0 = schema0.toString(set0, true);
    assertEquals("{\n  \"type\" : \"record\",\n  \"fields\" : [ ]\n}", string0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test039() throws Throwable {
    LinkedList<Schema.Field> linkedList0 = new LinkedList<Schema.Field>();
    Schema schema0 = Schema.createRecord((List<Schema.Field>) linkedList0);
    Schema schema1 = Schema.createArray(schema0);
    schema0.addAlias("lo.lo");
    Schema schema2 = Schema.applyAliases(schema1, schema0);
    assertFalse(schema0.equals((Object) schema1));
    assertFalse(schema2.equals((Object) schema0));
    assertSame(schema2, schema1);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test040() throws Throwable {
    ParseContext parseContext0 = new ParseContext();
    Schema schema0 = Schema.createRecord("org.apache.avro.compiler.UnresolvedSchema_236",
        "org.apache.avro.compiler.UnresolvedSchema_236", "org.apache.avro.compiler.UnresolvedSchema_236", false);
    Schema schema1 = parseContext0.find("org.apache.avro.compiler.UnresolvedSchema_236",
        "org.apache.avro.compiler.UnresolvedSchema_236");
    Schema schema2 = Schema.applyAliases(schema0, schema1);
    assertFalse(schema2.equals((Object) schema1));
    assertEquals("unresolved schema", schema1.getDoc());
    assertEquals("org.apache.avro.compiler.UnresolvedSchema_236", schema2.getDoc());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test041() throws Throwable {
    Vector<Schema.Field> vector0 = new Vector<Schema.Field>();
    Schema schema0 = Schema.createRecord((List<Schema.Field>) vector0);
    Schema schema1 = Schema.applyAliases(schema0, schema0);
    assertFalse(schema1.isUnion());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test042() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field schema_Field0 = new Schema.Field("T", schema0, "T");
    Schema.Field[] schema_FieldArray0 = new Schema.Field[2];
    schema_FieldArray0[0] = schema_Field0;
    schema_FieldArray0[1] = schema_Field0;
    Schema.LockableArrayList<Schema.Field> schema_LockableArrayList0 = new Schema.LockableArrayList<Schema.Field>(
        schema_FieldArray0);
    // Undeclared exception!
    try {
      Schema.createRecord((List<Schema.Field>) schema_LockableArrayList0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Field already used: T type:STRING pos:0
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test043() throws Throwable {
    Vector<Schema.Field> vector0 = new Vector<Schema.Field>();
    Schema schema0 = Schema.createRecord((List<Schema.Field>) vector0);
    // Undeclared exception!
    try {
      schema0.setFields(vector0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Fields are already set
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test044() throws Throwable {
    Stack<Schema.Field> stack0 = new Stack<Schema.Field>();
    Schema schema0 = Schema.createRecord((List<Schema.Field>) stack0);
    boolean boolean0 = schema0.hasFields();
    assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test045() throws Throwable {
    String string0 = "*z>Lj=@+j>6%|Ht_";
    Schema schema0 = Schema.createRecord("array", "array", "*z>Lj=@+j>6%|Ht_", true);
    // Undeclared exception!
    try {
      schema0.getField(string0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Schema fields not set yet
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test046() throws Throwable {
    LinkedList<Schema.Field> linkedList0 = new LinkedList<Schema.Field>();
    Schema schema0 = Schema.createRecord((List<Schema.Field>) linkedList0);
    Schema.Field schema_Field0 = schema0.getField("org.apache.avro.Schema$Field$Order");
    assertNull(schema_Field0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test047() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema.SeenPair schema_SeenPair0 = new Schema.SeenPair(schema0, schema0);
    Schema.SeenPair schema_SeenPair1 = new Schema.SeenPair("rrhr", schema0);
    boolean boolean0 = schema_SeenPair0.equals(schema_SeenPair1);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test048() throws Throwable {
    Schema.LockableArrayList<String> schema_LockableArrayList0 = new Schema.LockableArrayList<String>();
    Schema.SeenPair schema_SeenPair0 = new Schema.SeenPair((Object) null, schema_LockableArrayList0);
    boolean boolean0 = schema_SeenPair0.equals(schema_SeenPair0);
    assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test049() throws Throwable {
    Vector<Schema.Field> vector0 = new Vector<Schema.Field>();
    Schema schema0 = Schema.createRecord((List<Schema.Field>) vector0);
    schema0.addAlias("org.apache.avro.compiler.UnresolvedSchema_740.float");
    ParseContext parseContext0 = new ParseContext();
    Schema schema1 = parseContext0.resolve(schema0);
    assertTrue(schema1.equals((Object) schema0));
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test050() throws Throwable {
    Vector<Schema.Field> vector0 = new Vector<Schema.Field>();
    Schema schema0 = Schema.createRecord((List<Schema.Field>) vector0);
    schema0.addAlias("S6P");
    ParseContext parseContext0 = new ParseContext();
    Schema schema1 = parseContext0.resolve(schema0);
    assertTrue(schema1.equals((Object) schema0));
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test051() throws Throwable {
    Schema schema0 = Schema.createFixed("error", "error", "error", 2044);
    schema0.addAlias("error", "error");
    schema0.addAlias("error");
    assertEquals("error", schema0.getDoc());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test052() throws Throwable {
    // Undeclared exception!
    try {
      Schema.createRecord("double", "double", (String) null, false);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Schemas may not be named after primitives: double
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test053() throws Throwable {
    Schema schema0 = Schema.createRecord("SET", "com.fasterxml.jackson.databind", "array", false);
    schema0.addAlias("array");
    // Undeclared exception!
    try {
      schema0.getElementType();
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not an array:
      // {\"type\":\"record\",\"name\":\"SET\",\"namespace\":\"array\",\"doc\":\"com.fasterxml.jackson.databind\",\"aliases\":[\"array.array\"]}
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test054() throws Throwable {
    Schema schema0 = Schema.createFixed("error", "error", "error", 2044);
    schema0.addAlias("error", "error");
    // Undeclared exception!
    try {
      schema0.getFields();
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not a record:
      // {\"type\":\"fixed\",\"name\":\"error\",\"namespace\":\"error\",\"doc\":\"error\",\"size\":2044,\"aliases\":[\"error\"]}
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test055() throws Throwable {
    Schema.Name schema_Name0 = new Schema.Name((String) null, "org.apache.avro.compiler.UnresolvedSchema_314");
    ObjectMapper objectMapper0 = new ObjectMapper();
    JsonFactory jsonFactory0 = new JsonFactory(objectMapper0);
    JsonGenerator jsonGenerator0 = jsonFactory0.createGenerator((DataOutput) null);
    try {
      schema_Name0.writeName("org.apache.avro.compiler.UnresolvedSchema_314", jsonGenerator0);
      fail("Expecting exception: IOException");

    } catch (IOException e) {
      //
      // Can not write a field name, expecting a value
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test056() throws Throwable {
    Schema.Name schema_Name0 = new Schema.Name("ermIor", "TdF");
    DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
    TokenBuffer tokenBuffer0 = defaultSerializerProvider_Impl0.bufferForValueConversion();
    schema_Name0.writeName("TdF", tokenBuffer0);
    assertFalse(tokenBuffer0.isEmpty());
    assertEquals("TdF.ermIor", schema_Name0.toString());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test057() throws Throwable {
    Schema.Name schema_Name0 = new Schema.Name((String) null, (String) null);
    boolean boolean0 = schema_Name0.equals((Object) null);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test058() throws Throwable {
    Schema.Names schema_Names0 = new Schema.Names();
    Schema schema0 = schema_Names0.get("S6P");
    assertNull(schema0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test059() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema.Field schema_Field0 = new Schema.Field("T", schema0, "T");
    Schema.Field[] schema_FieldArray0 = new Schema.Field[2];
    schema_FieldArray0[0] = schema_Field0;
    Schema.LockableArrayList<Schema.Field> schema_LockableArrayList0 = new Schema.LockableArrayList<Schema.Field>(
        schema_FieldArray0);
    boolean boolean0 = schema_LockableArrayList0.remove((Object) schema_Field0);
    assertEquals(1, schema_LockableArrayList0.size());
    assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test060() throws Throwable {
    ArrayList<String> arrayList0 = new ArrayList<String>();
    Schema schema0 = Schema.createEnum((String) null, "com.fasterxml.jackson.databind",
        "com.fasterxml.jackson.databind", (List<String>) arrayList0, (String) null);
    Schema.Field schema_Field0 = new Schema.Field("GE", schema0, (String) null, "GE");
    schema_Field0.aliases();
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test061() throws Throwable {
    Schema schema0 = Schema.createFixed("error", "error", "error", 4);
    Schema.Field schema_Field0 = new Schema.Field("error", schema0, "error");
    schema_Field0.addAlias("");
    Set<String> set0 = schema_Field0.aliases();
    assertEquals((-1), schema_Field0.pos());
    assertTrue(set0.contains(""));
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test062() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field schema_Field0 = new Schema.Field("T", schema0, "T");
    schema_Field0.addAlias("T");
    schema_Field0.addAlias("TT$h");
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test063() throws Throwable {
    ArrayList<String> arrayList0 = new ArrayList<String>();
    Schema schema0 = Schema.createEnum((String) null, "com.fasterxml.jackson.databind",
        "com.fasterxml.jackson.databind", (List<String>) arrayList0, (String) null);
    Schema.Field schema_Field0 = new Schema.Field("GE", schema0, (String) null, "GE");
    boolean boolean0 = schema_Field0.hasDefaultValue();
    assertTrue(boolean0);
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test064() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field schema_Field0 = new Schema.Field("T", schema0);
    boolean boolean0 = schema_Field0.hasDefaultValue();
    assertEquals((-1), schema_Field0.pos());
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test065() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Object object0 = Schema.Field.NULL_DEFAULT_VALUE;
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.ASCENDING;
    Schema.Field schema_Field0 = null;
    try {
      schema_Field0 = new Schema.Field("", schema0, "T", object0, schema_Field_Order0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Empty name
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test066() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.IGNORE;
    Schema.Field schema_Field0 = null;
    try {
      schema_Field0 = new Schema.Field("com.fasterxml.jackson.databind.cfg.CoercionAction", schema0,
          "com.fasterxml.jackson.databind.cfg.CoercionAction", schema0, schema_Field_Order0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Unknown datum class: class org.apache.avro.Schema$StringSchema
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test067() throws Throwable {
    Object object0 = Schema.Field.NULL_DEFAULT_VALUE;
    Schema.Field schema_Field0 = null;
    try {
      schema_Field0 = new Schema.Field("yV;6=", (Schema) null, "yV;6=", object0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Illegal character in: yV;6=
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test068() throws Throwable {
    Schema schema0 = Schema.createFixed("error", "error", "error", 4);
    Schema.Field schema_Field0 = new Schema.Field("error", schema0, "error");
    schema_Field0.addAlias("");
    Schema.Field schema_Field1 = new Schema.Field(schema_Field0, schema0);
    assertEquals((-1), schema_Field1.pos());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test069() throws Throwable {
    Schema schema0 = Schema.createFixed("error", "error", "error", 4);
    Schema.Field schema_Field0 = new Schema.Field("error", schema0, "error");
    Schema.Field schema_Field1 = new Schema.Field(schema_Field0, schema0);
    assertEquals((-1), schema_Field1.pos());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test070() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    ObjectMapper objectMapper0 = Schema.MAPPER;
    ObjectNode objectNode0 = objectMapper0.createObjectNode();
    NumericNode numericNode0 = objectNode0.numberNode((short) 14566);
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.ASCENDING;
    Schema.Field schema_Field0 = new Schema.Field("int", schema0, "~*$ru", numericNode0, false, schema_Field_Order0);
    assertEquals((-1), schema_Field0.pos());
    assertEquals("~*$ru", schema_Field0.doc());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test072() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema schema1 = Schema.createFixed((String) null, (String) null, (String) null, 1);
    schema1.hashCode = 1;
    boolean boolean0 = schema1.equalCachedHash(schema0);
    assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test073() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    ParseContext parseContext0 = new ParseContext();
    Schema schema1 = parseContext0.resolve(schema0);
    Schema schema2 = Schema.applyAliases(schema1, schema0);
    assertNotSame(schema2, schema0);
    assertTrue(schema2.equals((Object) schema0));
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test074() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    schema0.hashCode();
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test075() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    boolean boolean0 = schema0.equals((Object) null);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test076() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Type schema_Type0 = Schema.Type.INT;
    Schema schema1 = Schema.create(schema_Type0);
    Schema schema2 = Schema.applyAliases(schema0, schema1);
    assertFalse(schema2.equals((Object) schema1));
    assertEquals(Schema.Type.STRING, schema2.getType());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test077() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    String string0 = schema0.toString((Collection<Schema>) null, false);
    assertEquals("\"string\"", string0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test078() throws Throwable {
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
  public void schema_ESTest_test079() throws Throwable {
    Schema.Type schema_Type0 = Schema.Type.ARRAY;
    String string0 = schema_Type0.getName();
    assertEquals("array", string0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test080() throws Throwable {
    Schema.Type schema_Type0 = Schema.Type.FLOAT;
    Schema schema0 = Schema.create(schema_Type0);
    assertNull(schema0.getDoc());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test081() throws Throwable {
    Schema.Type schema_Type0 = Schema.Type.BYTES;
    Schema schema0 = Schema.create(schema_Type0);
    assertEquals(Schema.Type.BYTES, schema0.getType());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test082() throws Throwable {
    ParseContext parseContext0 = new ParseContext();
    Schema schema0 = parseContext0.find("null", "null");
    assertFalse(schema0.isUnion());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test083() throws Throwable {
    Schema.Type schema_Type0 = Schema.Type.BOOLEAN;
    Schema schema0 = Schema.create(schema_Type0);
    assertFalse(schema0.isUnion());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test084() throws Throwable {
    Schema.Type schema_Type0 = Schema.Type.LONG;
    Schema schema0 = Schema.create(schema_Type0);
    Schema schema1 = Schema.applyAliases(schema0, schema0);
    assertNull(schema1.getDoc());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test086() throws Throwable {
    Vector<Schema.Field> vector0 = new Vector<Schema.Field>();
    Schema schema0 = Schema.createRecord((List<Schema.Field>) vector0);
    ParseContext parseContext0 = new ParseContext();
    Schema schema1 = parseContext0.resolve(schema0);
    assertTrue(schema1.equals((Object) schema0));
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test087() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    List<Schema> list0 = List.of(schema0, schema0);
    Schema.LockableArrayList<Schema> schema_LockableArrayList0 = new Schema.LockableArrayList<Schema>(list0);
    String string0 = schema0.toString((Collection<Schema>) schema_LockableArrayList0, true);
    assertEquals("[ \"string\" ]", string0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test088() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    ShortNode shortNode0 = ShortNode.valueOf((short) (-1478));
    boolean boolean0 = schema0.isValidDefault(shortNode0);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test089() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Integer integer0 = schema0.getIndexNamed("UT_K7+C6j:Da");
    assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test090() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    // Undeclared exception!
    try {
      schema0.addProp("values", "values");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Can't set properties on a union: [\"string\"]
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test091() throws Throwable {
    Schema.Names schema_Names0 = new Schema.Names("'aqDc.0(R3YxWFYm");
    String string0 = schema_Names0.space();
    assertEquals("'aqDc.0(R3YxWFYm", string0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test092() throws Throwable {
    Schema.Names schema_Names0 = new Schema.Names();
    schema_Names0.space("Ad");
    assertTrue(schema_Names0.isEmpty());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test093() throws Throwable {
    Schema schema0 = Schema.createRecord("SXe6P", "org.apache.avro.compiler.UnresolvedSchema_213", "SXe6P", true);
    Schema.Names schema_Names0 = new Schema.Names();
    schema_Names0.add(schema0);
    assertEquals("org.apache.avro.compiler.UnresolvedSchema_213", schema0.getDoc());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test094() throws Throwable {
    Schema.LockableArrayList<String> schema_LockableArrayList0 = new Schema.LockableArrayList<String>();
    Schema schema0 = Schema.createEnum((String) null, "org.apache.avro.compiler.UnresolvedSchema_267",
        "org.apache.avro.compiler.UnresolvedSchema_267", (List<String>) schema_LockableArrayList0, (String) null);
    List<String> list0 = schema0.getEnumSymbols();
    assertFalse(list0.contains("org.apache.avro.compiler.UnresolvedSchema_267"));
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test096() throws Throwable {
    Schema.Parser schema_Parser0 = new Schema.Parser();
    boolean boolean0 = schema_Parser0.getValidateDefaults();
    assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test097() throws Throwable {
    ParseContext parseContext0 = new ParseContext();
    Schema.Parser schema_Parser0 = new Schema.Parser(parseContext0);
    assertTrue(schema_Parser0.getValidateDefaults());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test098() throws Throwable {
    Schema.Parser schema_Parser0 = new Schema.Parser((NameValidator) null);
    // Undeclared exception!
    try {
      schema_Parser0.parseInternal("_}|RLOSWp:MbG\"@vp0");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // com.fasterxml.jackson.core.JsonParseException: Unrecognized token '_': was
      // expecting (JSON String, Number, Array, Object or token 'null', 'true' or
      // 'false')
      // at [Source: (String)\"_}|RLOSWp:MbG\"@vp0\"; line: 1, column: 2]
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test099() throws Throwable {
    Schema.Parser schema_Parser0 = new Schema.Parser();
    schema_Parser0.setValidateDefaults(true);
    assertTrue(schema_Parser0.getValidateDefaults());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test100() throws Throwable {
    Schema.Parser schema_Parser0 = new Schema.Parser();
    schema_Parser0.getTypes();
    assertTrue(schema_Parser0.getValidateDefaults());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test101() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    String string0 = "T";
    Schema.Field schema_Field0 = new Schema.Field("T", schema0, "T");
    Schema.Field[] schema_FieldArray0 = new Schema.Field[4];
    Schema.Field schema_Field1 = new Schema.Field(string0, schema0);
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
      // Duplicate field T in record null: T type:STRING pos:1 and T type:STRING
      // pos:0.
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test102() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    // Undeclared exception!
    try {
      schema0.hasEnumSymbol("org.apache.avro.compiler.UnresolvedSchema_251");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not an enum: [\"string\"]
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test103() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema.LockableArrayList<Schema.Field> schema_LockableArrayList0 = new Schema.LockableArrayList<Schema.Field>();
    // Undeclared exception!
    try {
      schema0.setFields(schema_LockableArrayList0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not a record: [\"string\"]
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test105() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    // Undeclared exception!
    try {
      schema0.addAlias("WX}z6H>*_//|)O", "WX}z6H>*_//|)O");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not a named type: [\"string\"]
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test107() throws Throwable {
    Schema schema0 = Schema.createArray((Schema) null);
    // Undeclared exception!
    try {
      schema0.getFixedSize();
      fail("Expecting exception: NullPointerException");

    } catch (NullPointerException e) {
      //
      // no message in exception (getMessage() returned null)
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test108() throws Throwable {
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
  public void schema_ESTest_test109() throws Throwable {
    Schema schema0 = Schema.createFixed("error", "error", "error", 4);
    int int0 = schema0.getFixedSize();
    assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test110() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    // Undeclared exception!
    try {
      schema0.addAlias((String) null);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not a named type: \"string\"
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test111() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    String string0 = schema0.getDoc();
    assertNull(string0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test112() throws Throwable {
    Schema schema0 = Schema.createRecord("SXe6P", "SXe6P", "SXe6P", false);
    boolean boolean0 = schema0.isUnion();
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test113() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    HashSet<String> hashSet0 = new HashSet<String>();
    schema0.addProp(".\u0000qj*:C;s", (Object) hashSet0);
    assertNull(schema0.getDoc());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test114() throws Throwable {
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
  public void schema_ESTest_test115() throws Throwable {
    BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) null);
    try {
      Schema.parse((InputStream) bufferedInputStream0);
      fail("Expecting exception: IOException");

    } catch (IOException e) {
      //
      // Stream closed
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test116() throws Throwable {
    // Undeclared exception!
    try {
      Schema.parseJsonToObject("rl'6+Ooc5]D`~%z");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // com.fasterxml.jackson.core.JsonParseException: Unrecognized token 'rl': was
      // expecting (JSON String, Number, Array, Object or token 'null', 'true' or
      // 'false')
      // at [Source: (String)\"rl'6+Ooc5]\\u007FD`~%z\"; line: 1, column: 3]
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test117() throws Throwable {
    Schema schema0 = Schema.createArray((Schema) null);
    // Undeclared exception!
    try {
      schema0.getValueType();
      fail("Expecting exception: NullPointerException");

    } catch (NullPointerException e) {
      //
      // no message in exception (getMessage() returned null)
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test118() throws Throwable {
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
  public void schema_ESTest_test119() throws Throwable {
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
  public void schema_ESTest_test120() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    // Undeclared exception!
    try {
      schema0.getIndexNamed("\"string\"");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not a union: \"string\"
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test121() throws Throwable {
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
  public void schema_ESTest_test123() throws Throwable {
    LogicalType logicalType0 = new LogicalType("n(5cAr;j8$:{BVx/");
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema schema1 = logicalType0.addToSchema(schema0);
    assertSame(schema1, schema0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test124() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    // Undeclared exception!
    try {
      schema0.isError();
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not a record: [{\"type\":\"string\",\"logicalType\":\"n(5cAr;j8$:{BVx/\"}]
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test125() throws Throwable {
    Schema schema0 = Schema.createRecord("errhr", "errhr", "errhr", true);
    // Undeclared exception!
    try {
      schema0.getEnumOrdinal("errhr");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not an enum:
      // {\"type\":\"error\",\"name\":\"errhr\",\"namespace\":\"errhr\",\"doc\":\"errhr\"}
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test126() throws Throwable {
    // Undeclared exception!
    try {
      Schema.parse(
          "{\n  \"type\" : \"error\",\n  \"name\" : \"SXe6P\",\n  \"namespace\" : \"SXe6P\",\n  \"doc\" : \"SXe6P\"\n}");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Record has no fields:
      // {\"type\":\"error\",\"name\":\"SXe6P\",\"namespace\":\"SXe6P\",\"doc\":\"SXe6P\"}
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test127() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field schema_Field0 = new Schema.Field("GE", schema0, (String) null, "Io+'Tw8,?,06U");
    int int0 = schema_Field0.pos();
    assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test128() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field schema_Field0 = new Schema.Field("T", schema0, "T");
    schema_Field0.defaultVal();
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test130() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field schema_Field0 = new Schema.Field("T", schema0, "T");
    schema_Field0.doc();
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test131() throws Throwable {
    ParseContext parseContext0 = new ParseContext();
    Schema schema0 = parseContext0.find("order", "order");
    NioPathSerializer nioPathSerializer0 = new NioPathSerializer();
    ObjectMapper objectMapper0 = Schema.MAPPER;
    SerializerProvider serializerProvider0 = objectMapper0.getSerializerProviderInstance();
    JsonNode jsonNode0 = nioPathSerializer0.getSchema(serializerProvider0, (Type) null, true);
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.ASCENDING;
    Schema.Field schema_Field0 = new Schema.Field("order", schema0, "name", jsonNode0, true, schema_Field_Order0);
    schema_Field0.order();
    assertEquals("name", schema_Field0.doc());
    assertEquals((-1), schema_Field0.pos());
    assertEquals("order", schema_Field0.name());
    assertEquals("unresolved schema", schema0.getDoc());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test132() throws Throwable {
    Schema.LockableArrayList<String> schema_LockableArrayList0 = new Schema.LockableArrayList<String>();
    // Undeclared exception!
    try {
      schema_LockableArrayList0.addAll(8, (Collection<? extends String>) null);
      fail("Expecting exception: IndexOutOfBoundsException");

    } catch (IndexOutOfBoundsException e) {
      //
      // Index: 8, Size: 0
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test133() throws Throwable {
    Schema.LockableArrayList<String> schema_LockableArrayList0 = new Schema.LockableArrayList<String>();
    Vector<String> vector0 = new Vector<String>();
    boolean boolean0 = schema_LockableArrayList0.addAll((Collection<? extends String>) vector0);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test134() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema.Field schema_Field0 = new Schema.Field("T", schema0, "T");
    Schema.Field[] schema_FieldArray0 = new Schema.Field[2];
    Schema.LockableArrayList<Schema.Field> schema_LockableArrayList0 = new Schema.LockableArrayList<Schema.Field>(
        schema_FieldArray0);
    boolean boolean0 = schema_LockableArrayList0.remove((Object) schema_Field0);
    assertFalse(boolean0);
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test135() throws Throwable {
    int int0 = 2044;
    Schema.LockableArrayList<EnumFeature> schema_LockableArrayList0 = new Schema.LockableArrayList<EnumFeature>();
    // Undeclared exception!
    try {
      schema_LockableArrayList0.remove(int0);
      fail("Expecting exception: IndexOutOfBoundsException");

    } catch (IndexOutOfBoundsException e) {
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test136() throws Throwable {
    Schema.LockableArrayList<String> schema_LockableArrayList0 = new Schema.LockableArrayList<String>();
    MapperFeature mapperFeature0 = MapperFeature.SORT_CREATOR_PROPERTIES_FIRST;
    EnumSet<MapperFeature> enumSet0 = EnumSet.of(mapperFeature0);
    boolean boolean0 = schema_LockableArrayList0.removeAll(enumSet0);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test137() throws Throwable {
    Schema.LockableArrayList<String> schema_LockableArrayList0 = new Schema.LockableArrayList<String>();
    Object[] objectArray0 = new Object[0];
    Schema.LockableArrayList<Object> schema_LockableArrayList1 = new Schema.LockableArrayList<Object>(objectArray0);
    boolean boolean0 = schema_LockableArrayList0.retainAll(schema_LockableArrayList1);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test138() throws Throwable {
    Schema.Field[] schema_FieldArray0 = new Schema.Field[4];
    Schema.LockableArrayList<Schema.Field> schema_LockableArrayList0 = new Schema.LockableArrayList<Schema.Field>(
        schema_FieldArray0);
    schema_LockableArrayList0.clear();
    assertEquals(0, schema_LockableArrayList0.size());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test139() throws Throwable {
    Schema schema0 = Schema.parse("[ \"string\" ]");
    assertNull(schema0.getDoc());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test140() throws Throwable {
    Schema schema0 = Schema.createMap((Schema) null);
    // Undeclared exception!
    try {
      schema0.computeHash();
      fail("Expecting exception: NullPointerException");

    } catch (NullPointerException e) {
      //
      // no message in exception (getMessage() returned null)
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test141() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema schema1 = Schema.createMap(schema0);
    Schema schema2 = Schema.applyAliases(schema0, schema1);
    assertFalse(schema2.equals((Object) schema1));
    assertSame(schema2, schema0);
    assertEquals(Schema.Type.UNION, schema2.getType());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test142() throws Throwable {
    Schema.LockableArrayList<String> schema_LockableArrayList0 = new Schema.LockableArrayList<String>();
    Schema schema0 = Schema.createEnum((String) null, "com.fasterxml.jackson.databind",
        "com.fasterxml.jackson.databind", (List<String>) schema_LockableArrayList0, (String) null);
    Schema schema1 = Schema.createMap(schema0);
    // Undeclared exception!
    try {
      schema1.fieldsToJson((Set<String>) null, (String) null, (JsonGenerator) null);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not a record:
      // {\"type\":\"map\",\"values\":{\"type\":\"enum\",\"doc\":\"com.fasterxml.jackson.databind\",\"symbols\":[]}}
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test00() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.IGNORE;
    Schema.Field schema_Field0 = new Schema.Field("ND", schema0,
        "com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter", (JsonNode) null, true, schema_Field_Order0);
    Schema.Field schema_Field1 = new Schema.Field("ND", schema0,
        "com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter", "ND");
    boolean boolean0 = schema_Field0.equals(schema_Field1);
    assertFalse(boolean0);
    assertEquals((-1), schema_Field1.pos());
    assertEquals("com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter", schema_Field1.doc());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test01() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.DESCENDING;
    Schema.Field schema_Field0 = new Schema.Field("ND", schema0, "REQUIRE_SETTERS_FOR_GETTERS", schema_Field_Order0);
    Schema.Field schema_Field1 = new Schema.Field(schema_Field0, schema0);
    assertTrue(schema_Field1.equals((Object) schema_Field0));

    schema_Field0.addProp("REQUIRE_SETTERS_FOR_GETTERS", "REQUIRE_SETTERS_FOR_GETTERS");
    boolean boolean0 = schema_Field0.equals(schema_Field1);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test02() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.DESCENDING;
    Schema.Field schema_Field0 = new Schema.Field("ND", schema0, "6?S=m!s", (JsonNode) null, true, schema_Field_Order0);
    Schema.Field schema_Field1 = new Schema.Field("ND", schema0, "ND");
    boolean boolean0 = schema_Field0.equals(schema_Field1);
    assertEquals((-1), schema_Field1.pos());
    assertEquals("6?S=m!s", schema_Field0.doc());
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test03() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.DESCENDING;
    Schema.Field schema_Field0 = new Schema.Field("ND", schema0, "ep}phFkfF@bdh*?d(ez", schema_Field_Order0);
    Schema.Field schema_Field1 = new Schema.Field("ND", schema0, "ep}phFkfF@bdh*?d(ez", (JsonNode) null, false,
        schema_Field_Order0);
    boolean boolean0 = schema_Field0.equals(schema_Field1);
    assertEquals((-1), schema_Field1.pos());
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test04() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.DESCENDING;
    Schema.Field schema_Field0 = new Schema.Field("ND", schema0, "REQUIRE_SETTERS_FOR_GETTERS", schema_Field_Order0);
    Schema schema1 = Schema.createArray(schema0);
    Schema.Field schema_Field1 = new Schema.Field("ND", schema1,
        "com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
    boolean boolean0 = schema_Field0.equals(schema_Field1);
    assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer$Parser", schema_Field1.doc());
    assertEquals((-1), schema_Field1.pos());
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test05() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.DESCENDING;
    Schema.Field schema_Field0 = new Schema.Field("ND", schema0, "REQUIRE_SETTERS_FOR_GETTERS", schema_Field_Order0);
    Schema.Field schema_Field1 = new Schema.Field("REQUIRE_SETTERS_FOR_GETTERS", schema0, "X78\"AcX*p#apAT7B|j",
        "REQUIRE_SETTERS_FOR_GETTERS");
    boolean boolean0 = schema_Field0.equals(schema_Field1);
    assertEquals("X78\"AcX*p#apAT7B|j", schema_Field1.doc());
    assertFalse(boolean0);
    assertEquals((-1), schema_Field1.pos());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test06() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.DESCENDING;
    Schema.Field schema_Field0 = new Schema.Field("ND", schema0, "ep}phFkfF@bdh*?d(ez", schema_Field_Order0);
    boolean boolean0 = schema_Field0.equals((Object) null);
    assertEquals((-1), schema_Field0.pos());
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test07() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.DESCENDING;
    Schema.Field schema_Field0 = new Schema.Field("ND", schema0, "ND", schema_Field_Order0);
    boolean boolean0 = schema_Field0.equals(schema_Field0);
    assertTrue(boolean0);
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test08() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.DESCENDING;
    Schema.Field schema_Field0 = new Schema.Field("ND", schema0, "ND", schema_Field_Order0);
    schema_Field0.aliases();
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test09() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.DESCENDING;
    Schema.Field schema_Field0 = new Schema.Field("ND", schema0, "ND", schema_Field_Order0);
    schema_Field0.addAlias("6HL/I$%P@");
    Set<String> set0 = schema_Field0.aliases();
    assertTrue(set0.contains("6HL/I$%P@"));
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test10() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.DESCENDING;
    Schema.Field schema_Field0 = new Schema.Field("ND", schema0, "ND", schema_Field_Order0);
    boolean boolean0 = schema_Field0.hasDefaultValue();
    assertTrue(boolean0);
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test11() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field schema_Field0 = new Schema.Field("REQUIRE_SETTERS_FOR_GETTERS", schema0,
        "REQUIRE_SETTERS_FOR_GETTERS");
    boolean boolean0 = schema_Field0.hasDefaultValue();
    assertFalse(boolean0);
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test12() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.DESCENDING;
    Object object0 = Schema.Field.NULL_DEFAULT_VALUE;
    Schema.Field schema_Field0 = null;
    try {
      schema_Field0 = new Schema.Field("ND", schema0, "ND", object0, schema_Field_Order0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Invalid default for field ND: null not a \"string\"
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test13() throws Throwable {
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
  public void schemaField_ESTest_test14() throws Throwable {
    Object object0 = Schema.Field.NULL_DEFAULT_VALUE;
    Schema.Field schema_Field0 = null;
    try {
      schema_Field0 = new Schema.Field("", (Schema) null, "", object0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Empty name
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test15() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.DESCENDING;
    Schema.Field schema_Field0 = new Schema.Field("ND", schema0, "ND", schema_Field_Order0);
    schema_Field0.addAlias("ND");
    Schema.Field schema_Field1 = new Schema.Field(schema_Field0, schema0);
    assertEquals((-1), schema_Field1.pos());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test16() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.DESCENDING;
    Schema.Field schema_Field0 = new Schema.Field("ND", schema0, "REQUIRE_SETTERS_FOR_GETTERS", schema_Field_Order0);
    Schema.Field schema_Field1 = new Schema.Field(schema_Field0, schema0);
    boolean boolean0 = schema_Field0.equals(schema_Field1);
    assertEquals((-1), schema_Field1.pos());
    assertTrue(boolean0);
    assertEquals("REQUIRE_SETTERS_FOR_GETTERS", schema_Field1.doc());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test17() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field schema_Field0 = new Schema.Field("REQUIRE_SETTERS_FOR_GETTERS", schema0,
        "REQUIRE_SETTERS_FOR_GETTERS");
    int int0 = schema_Field0.pos();
    assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test18() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field schema_Field0 = new Schema.Field("fyr", schema0);
    schema_Field0.addAlias("fyr");
    schema_Field0.addAlias("fyr");
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test19() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema.Field schema_Field0 = new Schema.Field("f4", schema0, "f4");
    schema_Field0.defaultVal();
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test20() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema.Field schema_Field0 = new Schema.Field("f4", schema0, "f4");
    schema_Field0.hashCode();
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test21() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.DESCENDING;
    Schema.Field schema_Field0 = new Schema.Field("ND", schema0, "6?S=m!s", (JsonNode) null, true, schema_Field_Order0);
    String string0 = schema_Field0.doc();
    assertEquals("6?S=m!s", string0);
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test22() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.DESCENDING;
    Schema.Field schema_Field0 = new Schema.Field("ND", schema0, "REQUIRE_SETTERS_FOR_GETTERS", schema_Field_Order0);
    String string0 = schema_Field0.toString();
    assertEquals("ND type:STRING pos:-1", string0);
    assertEquals("REQUIRE_SETTERS_FOR_GETTERS", schema_Field0.doc());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test23() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.DESCENDING;
    Schema.Field schema_Field0 = new Schema.Field("ND", schema0, "6?S=m!s", (JsonNode) null, true, schema_Field_Order0);
    schema_Field0.name();
    assertEquals((-1), schema_Field0.pos());
    assertEquals("6?S=m!s", schema_Field0.doc());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test24() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.DESCENDING;
    Schema.Field schema_Field0 = new Schema.Field("ND", schema0, "ND", (JsonNode) null, true, schema_Field_Order0);
    schema_Field0.defaultValue();
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test25() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.IGNORE;
    Schema.Field schema_Field0 = new Schema.Field("ND", schema0,
        "com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter", (JsonNode) null, true, schema_Field_Order0);
    schema_Field0.schema();
    assertEquals((-1), schema_Field0.pos());
    assertEquals("com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter", schema_Field0.doc());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test26() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.DESCENDING;
    Schema.Field schema_Field0 = new Schema.Field("ND", schema0, "6?S=m!s", (JsonNode) null, true, schema_Field_Order0);
    schema_Field0.order();
    assertEquals((-1), schema_Field0.pos());
    assertEquals("6?S=m!s", schema_Field0.doc());
  }

  @Test(timeout = 4000)
  public void schemaParser_ESTest_test0() throws Throwable {
    Schema.Parser schema_Parser0 = new Schema.Parser((NameValidator) null);
    String[] stringArray0 = new String[4];
    stringArray0[0] = "\"+>b tt2Zd5}G*<Wwe%";
    // Undeclared exception!
    try {
      schema_Parser0.parse("\"+>b tt2Zd5}G*<Wwe%", stringArray0);
      fail("Expecting exception: NullPointerException");

    } catch (NullPointerException e) {
      //
      // Unknown schema: org.apache.avro.compiler.UnresolvedSchema_17
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schemaParser_ESTest_test1() throws Throwable {
    Schema.Parser schema_Parser0 = new Schema.Parser((NameValidator) null);
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    List<Schema> list0 = List.of(schema0, schema0);
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
  public void schemaParser_ESTest_test2() throws Throwable {
    Schema.Parser schema_Parser0 = new Schema.Parser((NameValidator) null);
    boolean boolean0 = schema_Parser0.getValidateDefaults();
    assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void schemaParser_ESTest_test3() throws Throwable {
    ParseContext parseContext0 = new ParseContext();
    Schema.Parser schema_Parser0 = new Schema.Parser(parseContext0);
    assertTrue(schema_Parser0.getValidateDefaults());
  }

  @Test(timeout = 4000)
  public void schemaParser_ESTest_test4() throws Throwable {
    Schema.Parser schema_Parser0 = new Schema.Parser((NameValidator) null);
    HashMap<String, Schema> hashMap0 = new HashMap<String, Schema>();
    Schema.Parser schema_Parser1 = schema_Parser0.addTypes((Map<String, Schema>) hashMap0);
    assertTrue(schema_Parser1.getValidateDefaults());
  }

  @Test(timeout = 4000)
  public void schemaParser_ESTest_test5() throws Throwable {
    Schema.Parser schema_Parser0 = new Schema.Parser((NameValidator) null);
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
    Schema.Parser schema_Parser0 = new Schema.Parser((NameValidator) null);
    // Undeclared exception!
    try {
      schema_Parser0.parse((File) null);
      fail("Expecting exception: NullPointerException");

    } catch (NullPointerException e) {
      //
      // no message in exception (getMessage() returned null)
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schemaParser_ESTest_test7() throws Throwable {
    Schema.Parser schema_Parser0 = new Schema.Parser();
    assertTrue(schema_Parser0.getValidateDefaults());

    schema_Parser0.setValidateDefaults(false);
    assertFalse(schema_Parser0.getValidateDefaults());
  }

  @Test(timeout = 4000)
  public void schemaParser_ESTest_test8() throws Throwable {
    Schema.Parser schema_Parser0 = new Schema.Parser();
    schema_Parser0.getTypes();
    assertTrue(schema_Parser0.getValidateDefaults());
  }

  @Test(timeout = 4000)
  public void schemaParser_ESTest_test9() throws Throwable {
    Schema.Parser schema_Parser0 = new Schema.Parser((NameValidator) null);
    PipedInputStream pipedInputStream0 = new PipedInputStream();
    try {
      schema_Parser0.parse((InputStream) pipedInputStream0);
      fail("Expecting exception: IOException");

    } catch (IOException e) {
      //
      // Pipe not connected
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
