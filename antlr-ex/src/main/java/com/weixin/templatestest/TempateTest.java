package com.weixin.templatestest;

import org.stringtemplate.v4.ST;

public class TempateTest {
  public static void test1(){
    ST hello = new ST("Hello, <name>");
    hello.add("name", "World");
    System.out.println(hello.render());

  }

  public static void test2(){
    ST hello = new ST("Hello, $if(name)$ $name$ $endif$", '$', '$');
    hello.add("name", "risk");
    System.out.println(hello.render());
  }

  public static void test3(){
    ST hello = new ST("Hello, <if(name)><name><endif>");
    hello.add("name", "risk");
    System.out.println(hello.render());
  }

  public static void main(String[] args) {
    test1();
    test2();
    test3();
  }

}
