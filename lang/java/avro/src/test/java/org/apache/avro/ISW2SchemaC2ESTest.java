/*
 * Derived from EvoSuite 1.2.0 output for Schema C2 and selected nested classes.
 * EvoRunner, scaffolding, EvoSuite runtime assertions, VFS/VNET dependencies,
 * unstable assertions and non-restored global-state mutations were removed.
 * The same conservative adaptation criteria used for C0 and C1 were applied.
 */
package org.apache.avro;

import static org.junit.Assert.*;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.BooleanNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.POJONode;
import com.fasterxml.jackson.databind.node.TextNode;
import com.fasterxml.jackson.databind.node.ValueNode;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.InputStream;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import org.apache.avro.NameValidator;
import org.apache.avro.ParseContext;
import org.apache.avro.Protocol;
import org.apache.avro.Schema;
import org.junit.Test;

public class ISW2SchemaC2ESTest {

  @Test(timeout = 4000)
  public void schema_ESTest_test000() throws Throwable {
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
  public void schema_ESTest_test001() throws Throwable {
    BooleanNode booleanNode0 = BooleanNode.getFalse();
    NameValidator nameValidator0 = Schema.getNameValidator();
    ParseContext parseContext0 = new ParseContext(nameValidator0);
    // Undeclared exception!
    try {
      Schema.parse((JsonNode) booleanNode0, parseContext0, "xOtyQ");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Schema not yet supported: false
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test002() throws Throwable {
    Schema schema0 = Schema.parse("[\"string\"]", false);
    assertNull(schema0.getDoc());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test003() throws Throwable {
    Schema.Names schema_Names0 = new Schema.Names();
    Vector<Schema.Field> vector0 = new Vector<Schema.Field>();
    Schema schema0 = Schema.createRecord((List<Schema.Field>) vector0);
    Schema.Field schema_Field0 = new Schema.Field("float", schema0, "f*FmzEY)5~hAw:<?(l5", schema_Names0);
    assertEquals("f*FmzEY)5~hAw:<?(l5", schema_Field0.doc());
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test004() throws Throwable {
    Schema.LockableArrayList<String> schema_LockableArrayList0 = new Schema.LockableArrayList<String>();
    POJONode pOJONode0 = new POJONode(schema_LockableArrayList0);
    Schema schema0 = Schema.createArray((Schema) null);
    Schema schema1 = Schema.createMap(schema0);
    boolean boolean0 = schema1.isValidDefault(pOJONode0);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test005() throws Throwable {
    Schema.Type schema_Type0 = Schema.Type.NULL;
    Schema schema0 = Schema.create(schema_Type0);
    Schema.Field schema_Field0 = null;
    try {
      schema_Field0 = new Schema.Field("NONE", schema0, "NONE", "NONE");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Invalid default for field NONE: \"java.lang.String@0000000010\" not a
      // \"null\"
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test006() throws Throwable {
    Schema.Type schema_Type0 = Schema.Type.DOUBLE;
    Schema schema0 = Schema.create(schema_Type0);
    Schema.Field schema_Field0 = null;
    try {
      schema_Field0 = new Schema.Field("boolean", schema0, (String) null, "boolean");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Invalid default for field boolean: \"java.lang.String@0000000010\" not a
      // \"double\"
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test007() throws Throwable {
    Schema.Type schema_Type0 = Schema.Type.LONG;
    Schema schema0 = Schema.create(schema_Type0);
    Schema.Field schema_Field0 = null;
    try {
      schema_Field0 = new Schema.Field("boolean", schema0, "boolean", "NONE");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Invalid default for field boolean: \"java.lang.String@0000000010\" not a
      // \"long\"
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test008() throws Throwable {
    Schema schema0 = Schema.createArray((Schema) null);
    POJONode pOJONode0 = new POJONode(schema0);
    boolean boolean0 = schema0.isValidDefault(pOJONode0);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test009() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    boolean boolean0 = schema0.isValidDefault((JsonNode) null);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test010() throws Throwable {
    ParseContext parseContext0 = new ParseContext();
    Schema schema0 = parseContext0.find("e", "e");
    Schema.Field schema_Field0 = null;
    try {
      schema_Field0 = new Schema.Field("null", schema0, "org.apache.avro.compiler.UnrsolvedSchema_25", "null");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Invalid default for field null: \"java.lang.String@0000000019\" not a
      // {\"type\":\"record\",\"name\":\"UnresolvedSchema_847\",\"namespace\":\"org.apache.avro.compiler\",\"doc\":\"unresolved
      // schema\",\"fields\":[],\"org.apache.avro.idl.unresolved.name\":\"e.e\"}
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test011() throws Throwable {
    Schema.Names schema_Names0 = new Schema.Names();
    Schema.Name schema_Name0 = new Schema.Name("items", "Rqg?o uWa`:<~+U?C");
    Vector<Schema> vector0 = new Vector<Schema>();
    Schema schema0 = Schema.createUnion((List<Schema>) vector0);
    schema_Names0.put(schema_Name0, schema0);
    // Undeclared exception!
    try {
      schema_Names0.put(schema_Name0, (Schema) null);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Can't redefine: Rqg?o uWa`:<~+U?C.items
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test012() throws Throwable {
    NameValidator nameValidator0 = Schema.getNameValidator();
    ParseContext parseContext0 = new ParseContext(nameValidator0);
    Schema schema0 = parseContext0.find("org.apache.avro.Schema$RecordSchema", "org.apache.avro.Schema$RecordSchema");
    Schema.Names schema_Names0 = new Schema.Names();
    schema_Names0.put((Schema.Name) null, schema0);
    Schema schema1 = schema_Names0.put((Schema.Name) null, schema0);
    assertEquals("unresolved schema", schema1.getDoc());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test013() throws Throwable {
    ParseContext parseContext0 = new ParseContext();
    Schema schema0 = parseContext0.find("org.apache.avro.compiler.UnresolvedSchema_671", "CONSTANT");
    Schema.Names schema_Names0 = new Schema.Names();
    boolean boolean0 = schema_Names0.contains(schema0);
    assertFalse(boolean0);
    assertEquals("unresolved schema", schema0.getDoc());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test014() throws Throwable {
    Schema.Names schema_Names0 = new Schema.Names();
    Schema schema0 = schema_Names0.get("bytes");
    assertNull(schema0.getDoc());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test015() throws Throwable {
    Schema.Names schema_Names0 = new Schema.Names("s,TuH$1-E5@4aB");
    Schema schema0 = schema_Names0.get("com.fasterxml.jackson.databind.ser");
    assertNull(schema0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test016() throws Throwable {
    // Undeclared exception!
    try {
      Schema.parse((String) null, true);
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
    Schema.Parser schema_Parser0 = new Schema.Parser();
    schema_Parser0.parseInternal("[\"string\"]");
    assertTrue(schema_Parser0.getValidateDefaults());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test018() throws Throwable {
    Schema.Parser schema_Parser0 = new Schema.Parser();
    String[] stringArray0 = new String[2];
    // Undeclared exception!
    try {
      schema_Parser0.parse("union", stringArray0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // com.fasterxml.jackson.core.JsonParseException: Unrecognized token
      // 'unionnullnull': was expecting (JSON String, Number, Array, Object or token
      // 'null', 'true' or 'false')
      // at [Source: (String)\"unionnullnull\"; line: 1, column: 14]
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test019() throws Throwable {
    NameValidator nameValidator0 = Schema.getNameValidator();
    ParseContext parseContext0 = new ParseContext(nameValidator0);
    Schema schema0 = parseContext0.find("org.apache.avro.Schema$RecordSchema", "org.apache.avro.Schema$RecordSchema");
    LinkedHashSet<Schema> linkedHashSet0 = new LinkedHashSet<Schema>();
    linkedHashSet0.add(schema0);
    assertEquals("unresolved schema", schema0.getDoc());

    Schema.Parser schema_Parser0 = new Schema.Parser();
    Schema.Parser schema_Parser1 = schema_Parser0.addTypes((Iterable<Schema>) linkedHashSet0);
    assertTrue(schema_Parser1.getValidateDefaults());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test020() throws Throwable {
    Schema schema0 = Schema.createFixed("com.fasterxml.jackson.da8abind.ext.Java7SupportImpl",
        "com.fasterxml.jackson.da8abind.ext.Java7SupportImpl", "com.fasterxml.jackson.da8abind.ext.Java7SupportImpl",
        12);
    String string0 = schema0.toString(false);
    assertEquals(
        "{\"type\":\"fixed\",\"name\":\"Java7SupportImpl\",\"namespace\":\"com.fasterxml.jackson.da8abind.ext\",\"doc\":\"com.fasterxml.jackson.da8abind.ext.Java7SupportImpl\",\"size\":12}",
        string0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test021() throws Throwable {
    Schema schema0 = Schema.createFixed((String) null, (String) null, (String) null, 635);
    Schema schema1 = Schema.applyAliases(schema0, schema0);
    assertSame(schema1, schema0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test023() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema schema1 = Schema.parse("[\"string\"]", false);
    Schema schema2 = Schema.applyAliases(schema1, schema0);
    assertSame(schema2, schema1);
    assertTrue(schema2.equals((Object) schema0));
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test024() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema schema1 = Schema.createArray(schema0);
    Schema schema2 = Schema.applyAliases(schema0, schema1);
    assertSame(schema2, schema0);
    assertFalse(schema2.equals((Object) schema1));
    assertEquals(Schema.Type.UNION, schema2.getType());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test025() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema schema1 = Schema.applyAliases(schema0, schema0);
    assertTrue(schema1.isUnion());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test026() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema[] schemaArray0 = new Schema[7];
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
  public void schema_ESTest_test027() throws Throwable {
    Schema schema0 = Schema.createFixed((String) null, (String) null, (String) null, 635);
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
  public void schema_ESTest_test028() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema[] schemaArray0 = new Schema[16];
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
  public void schema_ESTest_test029() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema schema1 = Schema.createMap(schema0);
    Schema schema2 = Schema.applyAliases(schema1, schema0);
    Schema schema3 = Schema.applyAliases(schema2, schema2);
    assertFalse(schema3.equals((Object) schema0));
    assertEquals(Schema.Type.MAP, schema3.getType());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test030() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema schema1 = Schema.createArray(schema0);
    Schema schema2 = Schema.createArray(schema0);
    assertTrue(schema2.equals((Object) schema1));

    schema2.addProp("", "");
    Schema schema3 = Schema.applyAliases(schema1, schema2);
    assertFalse(schema3.equals((Object) schema2));
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test031() throws Throwable {
    NameValidator nameValidator0 = Schema.getNameValidator();
    ParseContext parseContext0 = new ParseContext(nameValidator0);
    Schema schema0 = parseContext0.find("org.apache.avro.Schema$RecordSchema", "org.apache.avro.Schema$RecordSchema");
    Schema schema1 = Schema.createArray(schema0);
    Schema schema2 = Schema.createArray(schema1);
    Schema schema3 = Schema.applyAliases(schema2, schema1);
    assertFalse(schema3.equals((Object) schema1));
    assertEquals("unresolved schema", schema0.getDoc());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test032() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema schema1 = Schema.createArray(schema0);
    Schema schema2 = Schema.applyAliases(schema1, schema1);
    assertFalse(schema2.equals((Object) schema0));
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test033() throws Throwable {
    Schema.LockableArrayList<String> schema_LockableArrayList0 = new Schema.LockableArrayList<String>(751);
    schema_LockableArrayList0.add("map");
    Schema schema0 = Schema.createEnum("org.apache.avro", "+p`_#sVd)<(~@0W#", "+p`_#sVd)<(~@0W#",
        (List<String>) schema_LockableArrayList0);
    // Undeclared exception!
    try {
      schema0.getField("org.apache.avro.compiler.UnresolvedSchema_322");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not a record:
      // {\"type\":\"enum\",\"name\":\"avro\",\"namespace\":\"org.apache\",\"doc\":\"+p`_#sVd)<(~@0W#\",\"symbols\":[\"map\"]}
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test034() throws Throwable {
    Schema.LockableArrayList<String> schema_LockableArrayList0 = new Schema.LockableArrayList<String>();
    Schema schema0 = Schema.createEnum((String) null, (String) null, "", (List<String>) schema_LockableArrayList0,
        (String) null);
    Schema schema1 = Schema.applyAliases(schema0, schema0);
    assertFalse(schema1.isUnion());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test035() throws Throwable {
    Schema.LockableArrayList<String> schema_LockableArrayList0 = new Schema.LockableArrayList<String>();
    Schema schema0 = Schema.createEnum((String) null, (String) null, "j\"(!Ma<POT6eJ@vi`",
        (List<String>) schema_LockableArrayList0, (String) null);
    Schema schema1 = Schema.createArray(schema0);
    Schema schema2 = Schema.applyAliases(schema0, schema1);
    assertEquals(Schema.Type.ENUM, schema2.getType());
    assertFalse(schema2.equals((Object) schema1));
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test036() throws Throwable {
    Schema.LockableArrayList<String> schema_LockableArrayList0 = new Schema.LockableArrayList<String>();
    Schema schema0 = Schema.createEnum((String) null, (String) null, (String) null,
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
  public void schema_ESTest_test037() throws Throwable {
    Schema.LockableArrayList<String> schema_LockableArrayList0 = new Schema.LockableArrayList<String>(734);
    schema_LockableArrayList0.add("map");
    schema_LockableArrayList0.add("map");
    // Undeclared exception!
    try {
      Schema.createEnum("org.apache.avro", "org.apache.avro.compiler.UnresolvedSchema_302",
          "org.apache.avro.compiler.UnresolvedSchema_302", (List<String>) schema_LockableArrayList0,
          "org.apache.avro.compiler.UnresolvedSchema_302");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Duplicate enum symbol: map
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test038() throws Throwable {
    Schema.LockableArrayList<String> schema_LockableArrayList0 = new Schema.LockableArrayList<String>();
    schema_LockableArrayList0.add("@P>,m}.zy");
    // Undeclared exception!
    try {
      Schema.createEnum("@P>,m}.zy", "@P>,m}.zy", "@P>,m}.zy", (List<String>) schema_LockableArrayList0, "@P>,m}.zy");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Illegal initial character: @P>,m}.zy
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test039() throws Throwable {
    Schema schema0 = Schema.createRecord("IDLE", "]Ca|R@`FGL=!:", "IDLE", false);
    Schema.Field schema_Field0 = null;
    try {
      schema_Field0 = new Schema.Field("IDLE", schema0, "Can not write a field name, expecting a value",
          "Can not write a field name, expecting a value");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Invalid default for field IDLE: \"java.lang.String@0000000014\" not a
      // {\"type\":\"record\",\"name\":\"IDLE\",\"namespace\":\"IDLE\",\"doc\":\"]Ca|R@`FGL=!:\"}
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test040() throws Throwable {
    LinkedList<Schema.Field> linkedList0 = new LinkedList<Schema.Field>();
    Schema schema0 = Schema.createRecord("ASCENDING", "ASCENDING", "ASCENDING", true, (List<Schema.Field>) linkedList0);
    // Undeclared exception!
    try {
      schema0.getFixedSize();
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not fixed:
      // {\"type\":\"error\",\"name\":\"ASCENDING\",\"namespace\":\"ASCENDING\",\"doc\":\"ASCENDING\",\"fields\":[]}
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test041() throws Throwable {
    Vector<Schema.Field> vector0 = new Vector<Schema.Field>();
    Schema schema0 = Schema.createRecord((List<Schema.Field>) vector0);
    Schema schema1 = Schema.createArray(schema0);
    Schema schema2 = Schema.applyAliases(schema0, schema1);
    assertEquals(Schema.Type.RECORD, schema2.getType());
    assertSame(schema2, schema0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test042() throws Throwable {
    Schema.Field[] schema_FieldArray0 = new Schema.Field[2];
    Schema.LockableArrayList<Schema.Field> schema_LockableArrayList0 = new Schema.LockableArrayList<Schema.Field>(
        schema_FieldArray0);
    // Undeclared exception!
    try {
      Schema.createRecord((List<Schema.Field>) schema_LockableArrayList0);
      fail("Expecting exception: NullPointerException");

    } catch (NullPointerException e) {
      //
      // no message in exception (getMessage() returned null)
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test043() throws Throwable {
    ParseContext parseContext0 = new ParseContext();
    Schema schema0 = parseContext0.find("#]", "#]");
    ArrayList<Schema.Field> arrayList0 = new ArrayList<Schema.Field>();
    // Undeclared exception!
    try {
      schema0.setFields(arrayList0);
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
    ParseContext parseContext0 = new ParseContext();
    Schema schema0 = parseContext0.find("e", "e");
    boolean boolean0 = schema0.hasFields();
    assertEquals("unresolved schema", schema0.getDoc());
    assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test045() throws Throwable {
    Schema schema0 = Schema.createRecord("com.fasterxml.jackson.databind.ext.Java7SupportImpl",
        "com.fasterxml.jackson.databind.ext.Java7SupportImpl", "com.fasterxml.jackson.databind.ext.Java7SupportImpl",
        true);
    Schema schema1 = Schema.createMap(schema0);
    ParseContext parseContext0 = new ParseContext();
    // Undeclared exception!
    try {
      parseContext0.resolve(schema1);
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
    Schema schema0 = Schema.createRecord((String) null, (String) null, "mG$g", true);
    // Undeclared exception!
    try {
      schema0.getField("Re;qKo'@`VGbYlT");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Schema fields not set yet
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test047() throws Throwable {
    Schema.LockableArrayList<String> schema_LockableArrayList0 = new Schema.LockableArrayList<String>();
    Schema schema0 = Schema.createEnum((String) null, (String) null, "j\"(!Ma<POT6eJ@vi`",
        (List<String>) schema_LockableArrayList0, (String) null);
    Schema.LockableArrayList<Schema> schema_LockableArrayList1 = new Schema.LockableArrayList<Schema>();
    Schema.SeenPair schema_SeenPair0 = new Schema.SeenPair(schema0, schema_LockableArrayList1);
    boolean boolean0 = schema_SeenPair0.equals(schema0);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test048() throws Throwable {
    LinkedList<Schema.Field> linkedList0 = new LinkedList<Schema.Field>();
    // Undeclared exception!
    try {
      Schema.createRecord("double", "double", (String) null, false, (List<Schema.Field>) linkedList0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Schemas may not be named after primitives: double
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test050() throws Throwable {
    Schema.LockableArrayList<String> schema_LockableArrayList0 = new Schema.LockableArrayList<String>();
    Schema schema0 = Schema.createEnum("size", "Cy^fN:qah6C}Y", (String) null, (List<String>) schema_LockableArrayList0,
        (String) null);
    schema0.addAlias((String) null, ",{i 4Fe|Z~j f:w");
    // Undeclared exception!
    try {
      schema0.getFixedSize();
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not fixed:
      // {\"type\":\"enum\",\"name\":\"size\",\"doc\":\"Cy^fN:qah6C}Y\",\"symbols\":[],\"aliases\":[null]}
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test051() throws Throwable {
    Schema.LockableArrayList<String> schema_LockableArrayList0 = new Schema.LockableArrayList<String>();
    Schema schema0 = Schema.createEnum("org.apache.avro.compiler.UnresolvedSchema_136", (String) null,
        "j\"(!Ma<POT6eJ@vi`", (List<String>) schema_LockableArrayList0, (String) null);
    schema0.addAlias("org.apache.avro.compiler.UnresolvedSchema_38", "j\"(!Ma<POT6eJ@vi`");
    // Undeclared exception!
    try {
      schema0.getFixedSize();
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not fixed:
      // {\"type\":\"enum\",\"name\":\"UnresolvedSchema_136\",\"namespace\":\"org.apache.avro.compiler\",\"symbols\":[],\"aliases\":[\"UnresolvedSchema_38\"]}
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test052() throws Throwable {
    Schema.Name schema_Name0 = new Schema.Name((String) null, (String) null);
    // Undeclared exception!
    try {
      schema_Name0.writeName("org.apache.avro.compiler.UnresolvedSchema_772", (JsonGenerator) null);
      fail("Expecting exception: NullPointerException");

    } catch (NullPointerException e) {
      //
      // no message in exception (getMessage() returned null)
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test053() throws Throwable {
    byte[] byteArray0 = new byte[1];
    Schema.Name schema_Name0 = new Schema.Name("null", "null");
    DeserializerFactoryConfig deserializerFactoryConfig0 = new DeserializerFactoryConfig();
    BeanDeserializerFactory beanDeserializerFactory0 = new BeanDeserializerFactory(deserializerFactoryConfig0);
    DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(
        beanDeserializerFactory0);
    ObjectMapper objectMapper0 = Schema.MAPPER;
    JsonParser jsonParser0 = objectMapper0.createParser(byteArray0);
    TokenBuffer tokenBuffer0 = defaultDeserializationContext_Impl0.bufferForInputBuffering(jsonParser0);
    schema_Name0.writeName("null", tokenBuffer0);
    assertFalse(tokenBuffer0.isEmpty());
    assertEquals("null.null", schema_Name0.toString());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test054() throws Throwable {
    Schema.LockableArrayList<String> schema_LockableArrayList0 = new Schema.LockableArrayList<String>();
    Schema schema0 = Schema.createEnum((String) null, "org.apache.avro.compiler.UnresolvedSchema_1008", (String) null,
        (List<String>) schema_LockableArrayList0, (String) null);
    Schema.Field schema_Field0 = null;
    try {
      schema_Field0 = new Schema.Field("L4", schema0, "zo[L1IhV},=!wP:C", schema_LockableArrayList0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Invalid default for field L4: [] not a
      // {\"type\":\"enum\",\"doc\":\"org.apache.avro.compiler.UnresolvedSchema_1008\",\"symbols\":[]}
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test055() throws Throwable {
    Schema.Name schema_Name0 = new Schema.Name("string", "string");
    boolean boolean0 = schema_Name0.equals("string");
    assertEquals("string.string", schema_Name0.toString());
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test056() throws Throwable {
    ArrayList<String> arrayList0 = new ArrayList<String>();
    // Undeclared exception!
    try {
      Schema.createEnum("e", "e", "", (List<String>) arrayList0, "");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // The Enum Default: is not in the enum symbol set: []
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test057() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema.Field schema_Field0 = new Schema.Field("NONE", schema0, "NONE", "NONE");
    boolean boolean0 = schema_Field0.equals("NONE");
    assertFalse(boolean0);
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test058() throws Throwable {
    Schema.Type schema_Type0 = Schema.Type.NULL;
    Schema schema0 = Schema.create(schema_Type0);
    Schema.Field schema_Field0 = new Schema.Field("k", schema0, "org.apache.avro.Schema$Names");
    schema_Field0.addAlias("k");
    schema_Field0.addAlias("double");
    assertEquals((-1), schema_Field0.pos());
    assertEquals("org.apache.avro.Schema$Names", schema_Field0.doc());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test059() throws Throwable {
    Object object0 = Schema.Field.NULL_DEFAULT_VALUE;
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.IGNORE;
    Schema.Field schema_Field0 = null;
    try {
      schema_Field0 = new Schema.Field("boolean", (Schema) null, "boolean", object0, schema_Field_Order0);
      fail("Expecting exception: NullPointerException");

    } catch (NullPointerException e) {
      //
      // schema is required and cannot be null
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test060() throws Throwable {
    Schema.Type schema_Type0 = Schema.Type.NULL;
    Schema schema0 = Schema.create(schema_Type0);
    Object object0 = Schema.Field.NULL_DEFAULT_VALUE;
    Schema.Field schema_Field0 = null;
    try {
      schema_Field0 = new Schema.Field("org.apache.avro.compiler.UnresolvedSchema_724", schema0,
          "org.apache.avro.compiler.UnresolvedSchema_724", object0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Illegal character in: org.apache.avro.compiler.UnresolvedSchema_724
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test061() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field schema_Field0 = new Schema.Field("gCTaI", schema0, "gCTaI");
    schema_Field0.addAlias("C6oNDgY5wU*|)m");
    Schema.Field schema_Field1 = new Schema.Field(schema_Field0, schema0);
    assertEquals((-1), schema_Field1.pos());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test062() throws Throwable {
    LinkedList<Schema.Field> linkedList0 = new LinkedList<Schema.Field>();
    Schema schema0 = Schema.createRecord("ASCENDING", "ASCENDING", "ASCENDING", false,
        (List<Schema.Field>) linkedList0);
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.DESCENDING;
    Schema.Field schema_Field0 = new Schema.Field("ASCENDING", schema0, "b]$B)t", (JsonNode) null, false,
        schema_Field_Order0);
    Schema.Field schema_Field1 = new Schema.Field(schema_Field0, schema0);
    assertEquals("b]$B)t", schema_Field1.doc());
    assertEquals((-1), schema_Field1.pos());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test063() throws Throwable {
    Schema.LockableArrayList<Schema> schema_LockableArrayList0 = new Schema.LockableArrayList<Schema>();
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema schema1 = Schema.createUnion((List<Schema>) schema_LockableArrayList0);
    Schema schema2 = Schema.applyAliases(schema1, schema0);
    assertSame(schema2, schema1);
    assertFalse(schema2.equals((Object) schema0));
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test064() throws Throwable {
    ParseContext parseContext0 = new ParseContext();
    Schema schema0 = parseContext0.find("#]", "z0iNpk5.INCLUDE_ALL_AND_PATH");
    LinkedHashSet<Schema> linkedHashSet0 = new LinkedHashSet<Schema>();
    linkedHashSet0.add(schema0);
    Schema.LockableArrayList<Schema.Field> schema_LockableArrayList0 = new Schema.LockableArrayList<Schema.Field>();
    Schema schema1 = Schema.createRecord((List<Schema.Field>) schema_LockableArrayList0);
    Schema schema2 = Schema.applyAliases(schema0, schema1);
    assertSame(schema2, schema0);
    assertEquals("unresolved schema", schema2.getDoc());
    assertFalse(schema2.equals((Object) schema1));
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test065() throws Throwable {
    ParseContext parseContext0 = new ParseContext();
    Schema schema0 = parseContext0.find("#]", "#]");
    LinkedHashSet<Schema> linkedHashSet0 = new LinkedHashSet<Schema>();
    linkedHashSet0.add(schema0);
    linkedHashSet0.add(schema0);
    assertEquals("unresolved schema", schema0.getDoc());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test066() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema schema1 = Schema.createArray(schema0);
    Schema schema2 = Schema.createArray(schema0);
    Schema schema3 = Schema.applyAliases(schema1, schema2);
    assertTrue(schema3.equals((Object) schema2));
    assertFalse(schema3.equals((Object) schema0));
    assertNotSame(schema3, schema2);
    assertFalse(schema0.equals((Object) schema2));
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test067() throws Throwable {
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
  public void schema_ESTest_test068() throws Throwable {
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
  public void schema_ESTest_test069() throws Throwable {
    Schema.Type schema_Type0 = Schema.Type.FIXED;
    String string0 = schema_Type0.getName();
    assertEquals("fixed", string0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test070() throws Throwable {
    Schema.Type schema_Type0 = Schema.Type.FLOAT;
    Schema schema0 = Schema.create(schema_Type0);
    Schema.Field schema_Field0 = null;
    try {
      schema_Field0 = new Schema.Field("boolean", schema0, "boolean", "NONE");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Invalid default for field boolean: \"java.lang.String@0000000010\" not a
      // \"float\"
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test071() throws Throwable {
    Schema.Type schema_Type0 = Schema.Type.INT;
    Schema schema0 = Schema.create(schema_Type0);
    Schema.Field schema_Field0 = null;
    try {
      schema_Field0 = new Schema.Field("fixed", schema0, "boolean", "NONE");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Invalid default for field fixed: \"java.lang.String@0000000010\" not a
      // \"int\"
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test072() throws Throwable {
    Schema.Type schema_Type0 = Schema.Type.BYTES;
    Schema schema0 = Schema.create(schema_Type0);
    Schema.Field schema_Field0 = new Schema.Field("boolean", schema0, (String) null,
        "org.apache.avro.Schema$RecordSchema");
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test073() throws Throwable {
    Schema.Type schema_Type0 = Schema.Type.BOOLEAN;
    Schema schema0 = Schema.create(schema_Type0);
    Schema.Field schema_Field0 = null;
    try {
      schema_Field0 = new Schema.Field("NONE", schema0, "NONE", "NONE");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Invalid default for field NONE: \"java.lang.String@0000000010\" not a
      // \"boolean\"
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test074() throws Throwable {
    Schema.Type schema_Type0 = Schema.Type.LONG;
    Schema schema0 = Schema.create(schema_Type0);
    Schema.Field schema_Field0 = new Schema.Field("boolean", schema0);
    schema_Field0.aliases();
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test075() throws Throwable {
    Schema.LockableArrayList<String> schema_LockableArrayList0 = new Schema.LockableArrayList<String>();
    Schema schema0 = Schema.createEnum((String) null, (String) null, "j\"(!Ma<POT6eJ@vi`",
        (List<String>) schema_LockableArrayList0, (String) null);
    Schema schema1 = Schema.createArray(schema0);
    schema1.hashCode();
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test076() throws Throwable {
    Schema schema0 = Schema.createFixed("com.fasterxml.jackson.databind.ext.Java7SupportImpl",
        "com.fasterxml.jackson.databind.ext.Java7SupportImpl", "com.fasterxml.jackson.databind.ext.Java7SupportImpl",
        12);
    Schema.Names schema_Names0 = new Schema.Names();
    Schema schema1 = schema_Names0.getOrDefault(schema0, schema0);
    assertFalse(schema1.isUnion());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test077() throws Throwable {
    Schema schema0 = Schema.createFixed("com.fasterxml.jackson.databind.ext.Java7SupportImpl",
        "com.fasterxml.jackson.databind.ext.Java7SupportImpl", "com.fasterxml.jackson.databind.ext.Java7SupportImpl",
        12);
    int int0 = schema0.getFixedSize();
    assertEquals(12, int0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test078() throws Throwable {
    ParseContext parseContext0 = new ParseContext();
    Schema schema0 = parseContext0.find("#]", "#]");
    // Undeclared exception!
    try {
      schema0.addAlias("#]");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Illegal initial character: #]
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test079() throws Throwable {
    LinkedList<Schema.Field> linkedList0 = new LinkedList<Schema.Field>();
    Schema schema0 = Schema.createRecord("ASCENDING", "ASCENDING", "ASCENDING", false,
        (List<Schema.Field>) linkedList0);
    Schema schema1 = Schema.createMap(schema0);
    ParseContext parseContext0 = new ParseContext();
    Schema schema2 = parseContext0.resolve(schema1);
    assertTrue(schema2.equals((Object) schema1));
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test080() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema.SeenPair schema_SeenPair0 = new Schema.SeenPair(schema0, schema0);
    Schema.Names schema_Names0 = new Schema.Names();
    Schema schema1 = schema_Names0.getOrDefault(schema_SeenPair0, schema0);
    assertEquals(Schema.Type.UNION, schema1.getType());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test081() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    String string0 = schema0.getName();
    assertEquals("union[string]", string0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test082() throws Throwable {
    Vector<Schema> vector0 = new Vector<Schema>();
    Schema schema0 = Schema.createUnion((List<Schema>) vector0);
    Integer integer0 = schema0.getIndexNamed("org.apache.avro.JsonProperties$2");
    assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test083() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    // Undeclared exception!
    try {
      schema0.addProp("com.fasterxml.jackson.databind.ext", "com.fasterxml.jackson.databind.ext");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Can't set properties on a union: [\"string\"]
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test084() throws Throwable {
    Schema.Names schema_Names0 = new Schema.Names();
    String string0 = schema_Names0.space();
    assertNull(string0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test085() throws Throwable {
    Schema.Names schema_Names0 = new Schema.Names("s,T8uH$1-E54aB");
    schema_Names0.space(".IacP");
    assertEquals(0, schema_Names0.size());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test086() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Names schema_Names0 = new Schema.Names("[");
    // Undeclared exception!
    try {
      schema_Names0.add(schema0);
      fail("Expecting exception: ClassCastException");

    } catch (ClassCastException e) {
      //
      // class org.apache.avro.Schema$StringSchema cannot be cast to class
      // org.apache.avro.Schema$NamedSchema (org.apache.avro.Schema$StringSchema and
      // org.apache.avro.Schema$NamedSchema are in unnamed module of loader
      // org.evosuite.instrumentation.InstrumentingClassLoader @4a23f3a9)
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test087() throws Throwable {
    NameValidator nameValidator0 = Schema.getNameValidator();
    Schema.Parser schema_Parser0 = new Schema.Parser(nameValidator0);
    boolean boolean0 = schema_Parser0.getValidateDefaults();
    assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test088() throws Throwable {
    NameValidator nameValidator0 = Schema.getNameValidator();
    ParseContext parseContext0 = new ParseContext(nameValidator0);
    Schema.Parser schema_Parser0 = new Schema.Parser(parseContext0);
    String[] stringArray0 = new String[0];
    // Undeclared exception!
    try {
      schema_Parser0.parse("214N0.", stringArray0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // com.fasterxml.jackson.core.JsonParseException: Unexpected character ('N'
      // (code 78)): Expected space separating root-level values
      // at [Source: (String)\"214N0.\"; line: 1, column: 5]
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test089() throws Throwable {
    Schema.Parser schema_Parser0 = new Schema.Parser();
    assertTrue(schema_Parser0.getValidateDefaults());

    schema_Parser0.setValidateDefaults(false);
    assertFalse(schema_Parser0.getValidateDefaults());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test090() throws Throwable {
    Schema.Parser schema_Parser0 = new Schema.Parser();
    schema_Parser0.getTypes();
    assertTrue(schema_Parser0.getValidateDefaults());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test091() throws Throwable {
    Schema.Type schema_Type0 = Schema.Type.NULL;
    Schema schema0 = Schema.create(schema_Type0);
    Locale.IsoCountryCode locale_IsoCountryCode0 = Locale.IsoCountryCode.PART3;
    Set<String> set0 = Locale.getISOCountries(locale_IsoCountryCode0);
    // Undeclared exception!
    try {
      schema0.fieldsToJson(set0, "NONE", (JsonGenerator) null);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not a record: \"null\"
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test092() throws Throwable {
    Schema schema0 = Schema.createArray((Schema) null);
    // Undeclared exception!
    try {
      schema0.getFields();
      fail("Expecting exception: NullPointerException");

    } catch (NullPointerException e) {
      //
      // no message in exception (getMessage() returned null)
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test093() throws Throwable {
    // Undeclared exception!
    try {
      Schema.parse("");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Cannot parse <null> schema
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test094() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    // Undeclared exception!
    try {
      schema0.hasEnumSymbol("org.apache.avro.compiler.UnresolvedSchema_582");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not an enum: \"string\"
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test095() throws Throwable {
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
  public void schema_ESTest_test097() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    // Undeclared exception!
    try {
      schema0.addAlias("org.apache.avro.compiler.UnresolvedSchema_136",
          "org.apache.avro.compiler.UnresolvedSchema_136");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not a named type: [\"string\"]
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test099() throws Throwable {
    ParseContext parseContext0 = new ParseContext();
    Schema schema0 = parseContext0.find("#b]I", "#b]I");
    // Undeclared exception!
    try {
      schema0.getEnumDefault();
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not an enum:
      // {\"type\":\"record\",\"name\":\"UnresolvedSchema_858\",\"namespace\":\"org.apache.avro.compiler\",\"doc\":\"unresolved
      // schema\",\"fields\":[],\"org.apache.avro.idl.unresolved.name\":\"#b]I.#b]I\"}
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test100() throws Throwable {
    Schema schema0 = Schema.createFixed("com.fasterxml.jackson.da8abind.ext.Java7SupportImpl",
        "com.fasterxml.jackson.da8abind.ext.Java7SupportImpl", "com.fasterxml.jackson.da8abind.ext.Java7SupportImpl",
        12);
    Schema schema1 = Schema.createArray(schema0);
    Schema schema2 = Schema.applyAliases(schema0, schema1);
    assertFalse(schema2.equals((Object) schema1));
    assertEquals(Schema.Type.FIXED, schema2.getType());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test101() throws Throwable {
    Schema.LockableArrayList<Schema> schema_LockableArrayList0 = new Schema.LockableArrayList<Schema>();
    Schema schema0 = Schema.createUnion((List<Schema>) schema_LockableArrayList0);
    // Undeclared exception!
    try {
      schema0.addAlias("");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not a named type: []
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test102() throws Throwable {
    Schema.Type schema_Type0 = Schema.Type.DOUBLE;
    Schema schema0 = Schema.create(schema_Type0);
    String string0 = schema0.getDoc();
    assertNull(string0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test103() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    boolean boolean0 = schema0.isNullable();
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test104() throws Throwable {
    Schema.LockableArrayList<String> schema_LockableArrayList0 = new Schema.LockableArrayList<String>();
    Schema schema0 = Schema.createEnum("com.fasterxml.jackson.databind.ext.Java7SupportImpl",
        "com.fasterxml.jackson.databind.ext.Java7SupportImpl", "com.fasterxml.jackson.databind.ext.Java7SupportImpl",
        (List<String>) schema_LockableArrayList0, (String) null);
    // Undeclared exception!
    try {
      schema0.getElementType();
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not an array:
      // {\"type\":\"enum\",\"name\":\"Java7SupportImpl\",\"namespace\":\"com.fasterxml.jackson.databind.ext\",\"doc\":\"com.fasterxml.jackson.databind.ext.Java7SupportImpl\",\"symbols\":[]}
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test105() throws Throwable {
    // Undeclared exception!
    try {
      Schema.parse(
          "{\"type\":\"map\",\"values\":{\"type\":\"record\",\"name\":\"UnresolvedSchema_1136\",\"namespace\":\"org.apache.avro.compiler\",\"doc\":\"unresolved schema\",\"fields\":[],\"org.apache.avro.idl.unresolved.name\":\"O*,mq.O*,mq\"}}",
          false);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Undefined schema: O*,mq.O*,mq
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test106() throws Throwable {
    Schema schema0 = Schema.createArray((Schema) null);
    // Undeclared exception!
    try {
      schema0.getNamespace();
      fail("Expecting exception: NullPointerException");

    } catch (NullPointerException e) {
      //
      // no message in exception (getMessage() returned null)
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test107() throws Throwable {
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
  public void schema_ESTest_test108() throws Throwable {
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
  public void schema_ESTest_test109() throws Throwable {
    // Undeclared exception!
    try {
      Schema.parseJsonToObject("NONE");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // com.fasterxml.jackson.core.JsonParseException: Unrecognized token 'NONE': was
      // expecting (JSON String, Number, Array, Object or token 'null', 'true' or
      // 'false')
      // at [Source: (String)\"NONE\"; line: 1, column: 5]
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test110() throws Throwable {
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
  public void schema_ESTest_test111() throws Throwable {
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
  public void schema_ESTest_test112() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    // Undeclared exception!
    try {
      schema0.getEnumSymbols();
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not an enum: \"string\"
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test113() throws Throwable {
    Schema schema0 = Schema.createArray((Schema) null);
    // Undeclared exception!
    try {
      schema0.getIndexNamed("5_P");
      fail("Expecting exception: NullPointerException");

    } catch (NullPointerException e) {
      //
      // no message in exception (getMessage() returned null)
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test114() throws Throwable {
    Schema schema0 = Schema.createArray((Schema) null);
    // Undeclared exception!
    try {
      schema0.getAliases();
      fail("Expecting exception: NullPointerException");

    } catch (NullPointerException e) {
      //
      // no message in exception (getMessage() returned null)
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test116() throws Throwable {
    Schema schema0 = Schema.createArray((Schema) null);
    LogicalType logicalType0 = new LogicalType("RBK!ox\".G");
    schema0.setLogicalType(logicalType0);
    assertFalse(schema0.isUnion());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test117() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Object object0 = schema0.writeReplace();
    boolean boolean0 = schema0.equals(object0);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test118() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    // Undeclared exception!
    try {
      schema0.isError();
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not a record: \"string\"
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test119() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    // Undeclared exception!
    try {
      schema0.getEnumOrdinal(", needed ");
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
    Vector<Schema.Field> vector0 = new Vector<Schema.Field>();
    Schema schema0 = Schema.createRecord((List<Schema.Field>) vector0);
    Schema schema1 = Schema.applyAliases(schema0, schema0);
    assertEquals(Schema.Type.RECORD, schema1.getType());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test121() throws Throwable {
    Schema schema0 = Schema.parse(
        "{\"type\":\"fixed\",\"name\":\"Java7SupportImpl\",\"namespace\":\"com.fasterxml.jackson.da8abind.ext\",\"doc\":\"com.fasterxml.jackson.da8abind.ext.Java7SupportImpl\",\"size\":12}",
        false);
    assertEquals(Schema.Type.FIXED, schema0.getType());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test122() throws Throwable {
    Schema.Type schema_Type0 = Schema.Type.NULL;
    Schema schema0 = Schema.create(schema_Type0);
    Schema.Field schema_Field0 = new Schema.Field("k", schema0, "org.apache.avro.Schema$LockableArrayList");
    int int0 = schema_Field0.pos();
    assertEquals("org.apache.avro.Schema$LockableArrayList", schema_Field0.doc());
    assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test123() throws Throwable {
    ParseContext parseContext0 = new ParseContext();
    Schema schema0 = parseContext0.find("e", "e");
    Schema.Field schema_Field0 = new Schema.Field("e", schema0);
    boolean boolean0 = schema_Field0.hasDefaultValue();
    assertEquals("unresolved schema", schema0.getDoc());
    assertEquals((-1), schema_Field0.pos());
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test124() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema.Field schema_Field0 = new Schema.Field("NONE", schema0, "NONE", "NONE");
    schema_Field0.defaultVal();
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test125() throws Throwable {
    Schema.Type schema_Type0 = Schema.Type.NULL;
    Schema schema0 = Schema.create(schema_Type0);
    Schema.Field schema_Field0 = new Schema.Field("k", schema0, "k");
    schema_Field0.doc();
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test126() throws Throwable {
    Schema.Type schema_Type0 = Schema.Type.NULL;
    Schema schema0 = Schema.create(schema_Type0);
    Schema.Field schema_Field0 = new Schema.Field("k", schema0, "org.apache.avro.Schema$LockableArrayList");
    String string0 = schema_Field0.toString();
    assertEquals("org.apache.avro.Schema$LockableArrayList", schema_Field0.doc());
    assertEquals("k type:NULL pos:-1", string0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test127() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field schema_Field0 = new Schema.Field("double", schema0, "double");
    schema_Field0.name();
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test128() throws Throwable {
    Schema.Type schema_Type0 = Schema.Type.NULL;
    Schema schema0 = Schema.create(schema_Type0);
    Schema.Field schema_Field0 = new Schema.Field("k", schema0, "org.apache.avro.Schema$LockableArrayList");
    schema_Field0.defaultValue();
    assertEquals("org.apache.avro.Schema$LockableArrayList", schema_Field0.doc());
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test129() throws Throwable {
    Schema.Names schema_Names0 = new Schema.Names("s,TuH$1-E5@4aB");
    Schema schema0 = Schema.createMap((Schema) null);
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.IGNORE;
    Schema.Field schema_Field0 = new Schema.Field("JXTQtkRgmk", schema0, "oH7RhZR", schema_Names0, schema_Field_Order0);
    schema_Field0.schema();
    assertEquals("JXTQtkRgmk", schema_Field0.name());
    assertEquals("oH7RhZR", schema_Field0.doc());
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test130() throws Throwable {
    Schema.Type schema_Type0 = Schema.Type.NULL;
    Schema schema0 = Schema.create(schema_Type0);
    Schema.Field schema_Field0 = new Schema.Field("k", schema0, "k");
    schema_Field0.order();
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test131() throws Throwable {
    Schema.LockableArrayList<String> schema_LockableArrayList0 = new Schema.LockableArrayList<String>(734);
    // Undeclared exception!
    try {
      schema_LockableArrayList0.addAll(734, (Collection<? extends String>) schema_LockableArrayList0);
      fail("Expecting exception: IndexOutOfBoundsException");

    } catch (IndexOutOfBoundsException e) {
      //
      // Index: 734, Size: 0
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test132() throws Throwable {
    Schema.LockableArrayList<String> schema_LockableArrayList0 = new Schema.LockableArrayList<String>(11);
    boolean boolean0 = schema_LockableArrayList0.addAll((Collection<? extends String>) schema_LockableArrayList0);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test133() throws Throwable {
    Schema.LockableArrayList<String> schema_LockableArrayList0 = new Schema.LockableArrayList<String>();
    boolean boolean0 = schema_LockableArrayList0.remove((Object) null);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test134() throws Throwable {
    Schema.LockableArrayList<String> schema_LockableArrayList0 = new Schema.LockableArrayList<String>(11);
    // Undeclared exception!
    try {
      schema_LockableArrayList0.remove(11);
      fail("Expecting exception: IndexOutOfBoundsException");

    } catch (IndexOutOfBoundsException e) {
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test135() throws Throwable {
    Schema.LockableArrayList<String> schema_LockableArrayList0 = new Schema.LockableArrayList<String>();
    Locale.IsoCountryCode locale_IsoCountryCode0 = Locale.IsoCountryCode.PART1_ALPHA2;
    Set<String> set0 = Locale.getISOCountries(locale_IsoCountryCode0);
    boolean boolean0 = schema_LockableArrayList0.removeAll(set0);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test136() throws Throwable {
    Schema.Field[] schema_FieldArray0 = new Schema.Field[2];
    Schema.LockableArrayList<Schema.Field> schema_LockableArrayList0 = new Schema.LockableArrayList<Schema.Field>(
        schema_FieldArray0);
    LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>();
    schema_LockableArrayList0.retainAll(linkedHashSet0);
    Schema schema0 = Schema.createRecord((List<Schema.Field>) schema_LockableArrayList0);
    // Undeclared exception!
    try {
      schema0.getFixedSize();
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Not fixed: {\"type\":\"record\",\"fields\":[]}
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test137() throws Throwable {
    Schema.LockableArrayList<Schema> schema_LockableArrayList0 = new Schema.LockableArrayList<Schema>();
    schema_LockableArrayList0.clear();
    assertTrue(schema_LockableArrayList0.isEmpty());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test138() throws Throwable {
    Schema schema0 = Schema.parse("{\"type\":\"array\",\"items\":[\"string\"]}", false);
    assertEquals(Schema.Type.ARRAY, schema0.getType());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test139() throws Throwable {
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
  public void schema_ESTest_test140() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema schema1 = Schema.createMap(schema0);
    Schema schema2 = Schema.applyAliases(schema0, schema1);
    assertFalse(schema2.equals((Object) schema1));
    assertEquals(Schema.Type.STRING, schema2.getType());
  }

  @Test(timeout = 4000)
  public void schema_ESTest_test141() throws Throwable {
    Schema schema0 = Schema.createArray((Schema) null);
    Schema schema1 = Schema.createMap(schema0);
    // Undeclared exception!
    try {
      schema1.getFixedSize();
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
    Schema.Field schema_Field0 = new Schema.Field("logicalType", schema0, "a|(r3bxG)s");
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.DESCENDING;
    Schema.Field schema_Field1 = new Schema.Field("logicalType", schema0, "logicalType", "a|(r3bxG)s",
        schema_Field_Order0);
    boolean boolean0 = schema_Field0.equals(schema_Field1);
    assertFalse(boolean0);
    assertEquals("a|(r3bxG)s", schema_Field0.doc());
    assertEquals((-1), schema_Field1.pos());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test01() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema.Field schema_Field0 = new Schema.Field("logiclTye", schema0, "a|(r3bxG)s");
    Schema.Field schema_Field1 = new Schema.Field(schema_Field0, schema0);
    assertTrue(schema_Field1.equals((Object) schema_Field0));

    schema_Field0.addProp("logiclTye", "logiclTye");
    boolean boolean0 = schema_Field1.equals(schema_Field0);
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test02() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field schema_Field0 = new Schema.Field("logicalType", schema0, "a|(r3bxG)s");
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.DESCENDING;
    Schema.Field schema_Field1 = new Schema.Field("logicalType", schema0, "a|(r3bxG)s", (JsonNode) null, false,
        schema_Field_Order0);
    boolean boolean0 = schema_Field0.equals(schema_Field1);
    assertEquals("a|(r3bxG)s", schema_Field1.doc());
    assertFalse(boolean0);
    assertEquals((-1), schema_Field1.pos());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test03() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema.Field schema_Field0 = new Schema.Field("logiclTye", schema0, "a|(r3bxG)s");
    Schema.Field schema_Field1 = new Schema.Field(schema_Field0, schema0);
    boolean boolean0 = schema_Field1.equals(schema_Field0);
    assertEquals((-1), schema_Field1.pos());
    assertTrue(boolean0);
    assertEquals("a|(r3bxG)s", schema_Field1.doc());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test04() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field schema_Field0 = new Schema.Field("lgcalType", schema0, "a|(r3bxG)s");
    Schema schema1 = Schema.createArray(schema0);
    Schema.Field schema_Field1 = new Schema.Field(schema_Field0, schema1);
    boolean boolean0 = schema_Field0.equals(schema_Field1);
    assertFalse(boolean0);
    assertEquals("a|(r3bxG)s", schema_Field1.doc());
    assertEquals((-1), schema_Field1.pos());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test05() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema.Field schema_Field0 = new Schema.Field("logiclTye", schema0);
    Schema.Field schema_Field1 = new Schema.Field("logicalType", schema0, "Order cannot be null");
    boolean boolean0 = schema_Field0.equals(schema_Field1);
    assertFalse(boolean0);
    assertEquals((-1), schema_Field1.pos());
    assertEquals("Order cannot be null", schema_Field1.doc());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test06() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema.Field schema_Field0 = new Schema.Field("DESCENDI", schema0, "DESCENDI");
    boolean boolean0 = schema_Field0.equals(schema0);
    assertFalse(boolean0);
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test07() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.ASCENDING;
    Schema.Field schema_Field0 = new Schema.Field("logiclTye", schema0, "a|(r3bxG)s", (JsonNode) null, false,
        schema_Field_Order0);
    boolean boolean0 = schema_Field0.equals(schema_Field0);
    assertEquals("a|(r3bxG)s", schema_Field0.doc());
    assertTrue(boolean0);
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test08() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema.Field schema_Field0 = new Schema.Field("logiclTye", schema0);
    Schema.Field schema_Field1 = new Schema.Field("logiclTye", schema0, "logiclTye", "logiclTye");
    boolean boolean0 = schema_Field1.equals(schema_Field0);
    assertEquals((-1), schema_Field1.pos());
    assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test09() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema.Field schema_Field0 = new Schema.Field("DESCENDI", schema0, "DESCENDI");
    schema_Field0.aliases();
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test10() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field schema_Field0 = new Schema.Field("logicalType", schema0, "a|(r3bxG)s");
    schema_Field0.addAlias("logicalType");
    Set<String> set0 = schema_Field0.aliases();
    assertEquals((-1), schema_Field0.pos());
    assertTrue(set0.contains("logicalType"));
    assertEquals("a|(r3bxG)s", schema_Field0.doc());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test11() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field schema_Field0 = new Schema.Field("logicalType", schema0, "a|(r3bxG)s");
    schema_Field0.addAlias("logicalType");
    schema_Field0.addAlias("a|(r3bxG)s");
    assertEquals((-1), schema_Field0.pos());
    assertEquals("a|(r3bxG)s", schema_Field0.doc());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test12() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    DayOfWeek dayOfWeek0 = DayOfWeek.WEDNESDAY;
    DayOfWeek dayOfWeek1 = dayOfWeek0.minus((-1510L));
    Schema.Field schema_Field0 = new Schema.Field("zWZ", schema0, "", dayOfWeek1);
    boolean boolean0 = schema_Field0.hasDefaultValue();
    assertEquals("", schema_Field0.doc());
    assertTrue(boolean0);
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test13() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema.Field schema_Field0 = new Schema.Field("logiclTye", schema0, "a|(r3bxG)s");
    boolean boolean0 = schema_Field0.hasDefaultValue();
    assertFalse(boolean0);
    assertEquals((-1), schema_Field0.pos());
    assertEquals("a|(r3bxG)s", schema_Field0.doc());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test14() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Object object0 = Schema.Field.NULL_DEFAULT_VALUE;
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.ASCENDING;
    Schema.Field schema_Field0 = null;
    try {
      schema_Field0 = new Schema.Field("%uIM5Kz6qYh", schema0, "%uIM5Kz6qYh", object0, schema_Field_Order0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Illegal initial character: %uIM5Kz6qYh
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test15() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Object object0 = Schema.Field.NULL_DEFAULT_VALUE;
    Schema.Field schema_Field0 = null;
    try {
      schema_Field0 = new Schema.Field("XP)kIQStRXef*([+", schema0, "XP)kIQStRXef*([+", object0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Illegal character in: XP)kIQStRXef*([+
      //
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test16() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema.Field schema_Field0 = new Schema.Field("logiclTye", schema0, "logiclTye", "logiclTye");
    Schema.Field.Order schema_Field_Order0 = Schema.Field.Order.ASCENDING;
    Schema.Field schema_Field1 = new Schema.Field("logiclTye", schema0, "org.apache.avro.Schema$Field$Order",
        "a|(r3bxG)s", schema_Field_Order0);
    boolean boolean0 = schema_Field0.equals(schema_Field1);
    assertEquals("org.apache.avro.Schema$Field$Order", schema_Field1.doc());
    assertFalse(boolean0);
    assertEquals((-1), schema_Field1.pos());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test17() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field schema_Field0 = new Schema.Field("logicalType", schema0, "a|(r3bxG)s");
    schema_Field0.addAlias("logicalType");
    Schema.Field schema_Field1 = new Schema.Field(schema_Field0, schema0);
    assertEquals("a|(r3bxG)s", schema_Field1.doc());
    assertEquals((-1), schema_Field1.pos());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test18() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field schema_Field0 = new Schema.Field("logicalType", schema0, "logicalType");
    int int0 = schema_Field0.pos();
    assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test19() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema.Field schema_Field0 = new Schema.Field("DESCENDI", schema0, "DESCENDI");
    schema_Field0.defaultVal();
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test20() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema.Field schema_Field0 = new Schema.Field("DESCENDI", schema0, "DESCENDI");
    schema_Field0.hashCode();
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test21() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema.Field schema_Field0 = new Schema.Field("ESENDING", schema0, "ESENDING");
    schema_Field0.doc();
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test22() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERROR;
    Schema.Field schema_Field0 = new Schema.Field("logicalType", schema0, "logicalType");
    String string0 = schema_Field0.toString();
    assertEquals("logicalType type:STRING pos:-1", string0);
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test23() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema.Field schema_Field0 = new Schema.Field("ESENDING", schema0, "ESENDING");
    schema_Field0.name();
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test24() throws Throwable {
    Schema.Type schema_Type0 = Schema.Type.NULL;
    Schema schema0 = Schema.create(schema_Type0);
    Schema.Field schema_Field0 = new Schema.Field("logicalType", schema0, "[''Wmt84Q-w,o@<");
    schema_Field0.defaultValue();
    assertEquals("[''Wmt84Q-w,o@<", schema_Field0.doc());
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schemaField_ESTest_test25() throws Throwable {
    Schema schema0 = Protocol.SYSTEM_ERRORS;
    Schema.Field schema_Field0 = new Schema.Field("ESENDING", schema0, "ESENDING");
    schema_Field0.schema();
    assertEquals((-1), schema_Field0.pos());
  }

  @Test(timeout = 4000)
  public void schemaParser_ESTest_test0() throws Throwable {
    Schema.Parser schema_Parser0 = new Schema.Parser();
    String[] stringArray0 = new String[3];
    // Undeclared exception!
    try {
      schema_Parser0.parse("com.fasterxml.jackson.core.JsonPointer$PointerParent", stringArray0);
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // com.fasterxml.jackson.core.JsonParseException: Unrecognized token 'com': was
      // expecting (JSON String, Number, Array, Object or token 'null', 'true' or
      // 'false')
      // at [Source:
      // (String)\"com.fasterxml.jackson.core.JsonPointer$PointerParentnullnullnull\";
      // line: 1, column: 4]
      //
      // Expected exception.
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
      // Expected exception.
    }
  }

  @Test(timeout = 4000)
  public void schemaParser_ESTest_test2() throws Throwable {
    Schema.Parser schema_Parser0 = new Schema.Parser((NameValidator) null);
    assertTrue(schema_Parser0.getValidateDefaults());
  }

  @Test(timeout = 4000)
  public void schemaParser_ESTest_test3() throws Throwable {
    ParseContext parseContext0 = new ParseContext();
    Schema.Parser schema_Parser0 = new Schema.Parser(parseContext0);
    JsonNodeFactory jsonNodeFactory0 = new JsonNodeFactory(true);
    ValueNode valueNode0 = jsonNodeFactory0.pojoNode(schema_Parser0);
    // Undeclared exception!
    try {
      Schema.parse((JsonNode) valueNode0, parseContext0, "");
      fail("Expecting exception: RuntimeException");

    } catch (RuntimeException e) {
      //
      // Schema not yet supported: {\"validateDefaults\":true,\"types\":{}}
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
    ParseContext parseContext0 = new ParseContext();
    Schema.Parser schema_Parser0 = new Schema.Parser(parseContext0);
    assertTrue(schema_Parser0.getValidateDefaults());

    schema_Parser0.setValidateDefaults(false);
    assertFalse(schema_Parser0.getValidateDefaults());
  }

  @Test(timeout = 4000)
  public void schemaParser_ESTest_test7() throws Throwable {
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
    assertFalse(schema_SeenPair1.equals(schema_SeenPair0));
  }

  @Test(timeout = 4000)
  public void schemaSeenPair_ESTest_test1() throws Throwable {
    Object object0 = new Object();
    Schema.SeenPair schema_SeenPair0 = new Schema.SeenPair(object0, object0);
    Object object1 = new Object();
    Schema.SeenPair schema_SeenPair1 = new Schema.SeenPair(object1, schema_SeenPair0);
    assertFalse(schema_SeenPair0.equals(schema_SeenPair1));
  }

  @Test(timeout = 4000)
  public void schemaSeenPair_ESTest_test2() throws Throwable {
    Object object0 = new Object();
    Schema.SeenPair schema_SeenPair0 = new Schema.SeenPair(object0, object0);
    assertFalse(schema_SeenPair0.equals(object0));
  }

  @Test(timeout = 4000)
  public void schemaSeenPair_ESTest_test3() throws Throwable {
    Object object0 = new Object();
    Schema.SeenPair schema_SeenPair0 = new Schema.SeenPair(object0, object0);
    assertTrue(schema_SeenPair0.equals(schema_SeenPair0));
  }

  @Test(timeout = 4000)
  public void schemaType_ESTest_test0() throws Throwable {
    Schema.Type schema_Type0 = Schema.Type.BOOLEAN;
    assertEquals("boolean", schema_Type0.getName());
  }
}
