package com.weixin.templatestest;

import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
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

  public static void main(String[] args) {
    test1();
    test2();
    test3();
    test4();
  }

}
