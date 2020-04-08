package com.weixin.tpdsl.symtab.nested;

/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
 ***/

import java.util.LinkedHashMap;
import java.util.Map;

public class MethodSymbol extends Symbol implements Scope {

  Map<String, Symbol> orderedArgs = new LinkedHashMap<String, Symbol>();
  Scope enclosingScope;

  public MethodSymbol(String name, Type retType, Scope enclosingScope) {
    super(name, retType);
    this.enclosingScope = enclosingScope;
  }

  @Override
  public Symbol resolve(String name) {
    Symbol s = orderedArgs.get(name);
		if (s != null) {
			return s;
		}
    // if not here, check any enclosing scope
    if (getEnclosingScope() != null) {
      return getEnclosingScope().resolve(name);
    }
    return null; // not found
  }

  @Override
	public void define(Symbol sym) {
    orderedArgs.put(sym.name, sym);
    sym.scope = this; // track the scope in each symbol
  }

  @Override
	public Scope getEnclosingScope() {
    return enclosingScope;
  }

  @Override
	public String getScopeName() {
    return name;
  }

  @Override
	public String toString() {
    return "method" + super.toString() + ":" + orderedArgs.values();
  }
}
