package com.weixin.tpdsl.symtab.monolithic;

/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
 ***/

import java.util.*;

// single-scope symtab
public class SymbolTable implements Scope {

  Map<String, Symbol> symbols = new HashMap<String, Symbol>();

  public SymbolTable() {
    initTypeSystem();
  }

  protected void initTypeSystem() {
    define(new BuiltInTypeSymbol("int"));
    define(new BuiltInTypeSymbol("float"));
  }

  // Satisfy Scope interface
  @Override
  public String getScopeName() {
    return "global";
  }

  @Override
  public Scope getEnclosingScope() {
    return null;
  }

  @Override
  public void define(Symbol sym) {
    symbols.put(sym.name, sym);
  }

  @Override
  public Symbol resolve(String name) {
    return symbols.get(name);
  }

  @Override
  public String toString() {
    return getScopeName() + ":" + symbols;
  }
}
