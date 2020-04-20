package com.weixin.tpdsl.semantics.objectoriented;

/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
 ***/

import java.util.Map;

public abstract class ScopedSymbol extends Symbol implements Scope {

  Scope enclosingScope;

  public ScopedSymbol(String name, Type type, Scope enclosingScope) {
    super(name, type);
    this.enclosingScope = enclosingScope;
  }

  public ScopedSymbol(String name, Scope enclosingScope) {
    super(name);
    this.enclosingScope = enclosingScope;
  }

  @Override
  public Symbol resolve(String name) {
    Symbol s = getMembers().get(name);
    if (s != null) {
      return s;
    }
    // if not here, check any enclosing scope
    if (getEnclosingScope() != null) {
      return getEnclosingScope().resolve(name);
    }
    // not found
    return null;
  }

  public Symbol resolveType(String name) {
    return resolve(name);
  }

  @Override
  public void define(Symbol sym) {
    getMembers().put(sym.name, sym);
    // track the scope in each symbol
    sym.scope = this;
  }

  @Override
  public Scope getEnclosingScope() {
    return enclosingScope;
  }

  @Override
  public String getScopeName() {
    return name;
  }

  /**
   * Indicate how subclasses store scope members. Allows us to factor out common code in this
   * class.
   */
  public abstract Map<String, Symbol> getMembers();
}
