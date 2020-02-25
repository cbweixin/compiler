package com.weixin.templatestest;

import java.util.LinkedList;
import java.util.List;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;
import org.stringtemplate.v4.STGroupString;

public class TempateTest {

  public static void test1() {
    ST hello = new ST("Hello, <name>");
    hello.add("name", "World");
    System.out.println(hello.render());

  }

  public static void test2() {
    ST hello = new ST("Hello, $if(name)$ $name$ $endif$", '$', '$');
    hello.add("name", "risk");
    System.out.println(hello.render());
  }

  public static void test3() {
    ST hello = new ST("Hello, <if(name)><name><endif>");
    hello.add("name", "risk");
    System.out.println(hello.render());
  }

  public static void test4() {
    STGroup stg = new STGroupString(
        "sqlTemplate(columns,condition) ::= \"select <columns> from table where 1=1 <if(condition)>and <condition><endif> \"");
    ST sqlST = stg.getInstanceOf("sqlTemplate");
    sqlST.add("columns", "order_id");
    sqlST.add("condition", "dt='2017-04-04'");
    System.out.print(sqlST.render());

  }

  public static void test5() {
    STGroup stg = new STGroupString("sqlTemplate(columns,condition) ::= <<select <columns> \n" +
        "from table \n" +
        "where 1=1 <if(condition)>and <condition><endif> >>");
    ST sqlST = stg.getInstanceOf("sqlTemplate");
    sqlST.add("columns", "order_id");
    sqlST.add("condition", "dt='2017-04-04'");
    System.out.println(sqlST.render());
  }

  public static void test6() {
    STGroup stg = new STGroupString("sqlTemplate(columns,condition) ::= <<select <columns> " +
        "from table " +
        "where 1=1 <if(condition)>and <condition><endif> >>");
    ST sqlST = stg.getInstanceOf("sqlTemplate");
    sqlST.add("columns", "order_id");
    sqlST.add("condition", "dt='2017-04-04'");
    System.out.println(sqlST.render());
  }

  public static void test7() {
    STGroup stg = new STGroupString("sqlTemplate(columns,condition) ::= <%select <columns> \n" +
        "from table \n" +
        "where 1=1 <if(condition)>and <condition><endif> %>");
    ST sqlST = stg.getInstanceOf("sqlTemplate");
    sqlST.add("columns", "order_id");
    sqlST.add("condition", "dt='2017-04-04'");
    System.out.println(sqlST.render());
  }

  public static void test8() {
    STGroup stg = new STGroupFile(
        "/Users/xinwei/Documents/weixin/study-antlr/antlr-ex/src/main/java/com/weixin/templatestest/dataExtarctSql.stg");
    ST sqlST = stg.getInstanceOf("sqlTemplate");

    List<String> columnList = new LinkedList<String>();
    columnList.add("order_id");
    columnList.add("price");
    columnList.add("phone");
    sqlST.add("columns", columnList);
    sqlST.add("condition", "dt='2017-04-04'");
    System.out.println(sqlST.render());

  }

  public static void test9() {
    STGroup stg = new STGroupFile(
        "/Users/xinwei/Documents/weixin/study-antlr/antlr-ex/src/main/java/com/weixin/templatestest/dataExtarctSql.stg");
    ST sqlST = stg.getInstanceOf("sqlTemplate2");

    List<String> columnList = new LinkedList<String>();
    columnList.add("order_id");
    columnList.add("price");
    columnList.add("phone");
    columnList.add("user");

    sqlST.add("columns", columnList);
    sqlST.add("condition", "dt='2017-04-04'");
    sqlST.add("joinKey", "user");
    sqlST.add("tableName", "orderTable");

    List<String> childColumnList = new LinkedList<String>();
    childColumnList.add("user");
    childColumnList.add("userLeave");
    childColumnList.add("userLocation");
    sqlST.add("childColumns", childColumnList);
    sqlST.add("childJoinKey", "user");
    sqlST.add("childTableName", "userTable");

    String result = sqlST.render();

    System.out.println(result);

  }
  public static void main(String[] args) {
    test1();
    test2();
    test3();
    test4();
    test5();
    test6();
    test7();
    test8();
    test9();
  }

}
