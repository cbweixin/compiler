package com.weixin.tpdsl.semantics.types;

/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
 ***/
// A generic programming language symbol
public class Symbol {

  // All symbols at least have a name
  String name;
  Type type;
  // All symbols know what scope contains them.
  Scope scope;
  // Location in AST of ID node
  CymbolAST def;

  public Symbol(String name) {
    this.name = name;
  }

  public Symbol(String name, Type type) {
    this(name);
    this.type = type;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    String s = "";
      if (scope != null) {
          s = scope.getScopeName() + ".";
      }
      if (type != null) {
          return '<' + s + getName() + ":" + type + '>';
      }
    return s + getName();
  }

  public static String stripBrackets(String s) {
    return s.substring(1, s.length() - 1);
  }
}
