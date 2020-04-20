package com.weixin.tpdsl.semantics.objectoriented;

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

public class ClassSymbol extends ScopedSymbol implements Scope, Type {

  /**
   * List of all fields and methods
   */
  public Map<String, Symbol> members = new LinkedHashMap<String, Symbol>();
  /**
   * This is the superclass not enclosingScope field. We still record the enclosing scope so we can
   * push in and pop out of class defs.
   */
  ClassSymbol superClass;

  public ClassSymbol(String name, Scope enclosingScope, ClassSymbol superClass) {
    super(name, enclosingScope);
    this.superClass = superClass;
  }

  public Scope getParentScope() {
      if (superClass == null) {
          return enclosingScope; // globals
      }
    return superClass; // if not Object, return super
  }

  /**
   * For a.b, only look in a's class hierarchy to resolve b, not globals
   */
  public Symbol resolveMember(String name) {
    Symbol s = members.get(name);
      if (s != null) {
          return s;
      }
    // if not here, check any enclosing scope
    if (superClass != null) {
      return superClass.resolveMember(name);
    }
    return null; // not found
  }

  /**
   * Return true if 'ancestor' is this class or above in hierarchy
   */
  public boolean isInstanceof(ClassSymbol ancestor) {
    ClassSymbol t = this;
    while (t != null) {
        if (t == ancestor) {
            return true;
        }
      t = t.superClass;
    }
    return false;
  }

  @Override
  public Map<String, Symbol> getMembers() {
    return members;
  }

  @Override
  public String toString() {
    return "class " + name + ":{" +
        stripBrackets(members.keySet().toString()) + "}";
  }

  @Override
  public int getTypeIndex() {
    return SymbolTable.tUSER;
  }

  /**
   * Destination must be object and same type (this is object not ptr)
   */
  @Override
  public boolean canAssignTo(Type destType) {
    return this == destType;
  }
}
