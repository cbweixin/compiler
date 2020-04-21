package com.weixin.tpdsl.interpreter.syntax;

/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
 ***/

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import org.antlr.runtime.Token;

public class Row {

  LinkedHashMap<String, Object> values = new LinkedHashMap<String, Object>();

  public Row(List<String> columns) {
    for (String c : columns) {
      values.put(c, Table.nil);
    }
  }

  public List<Object> getColumns() {
    List<Object> row = new ArrayList<Object>();
    for (Object o : values.values()) {
      row.add(o);
    }
    return row;
  }

  public List<Object> getColumns(List<Token> columns) {
    List<Object> row = new ArrayList<Object>();
    for (Token t : columns) {
      row.add(values.get(t.getText()));
    }
    return row;
  }

  public void set(String col, Object value) {
    values.put(col, value);
  }

  @Override
  public String toString() {
    return values.toString();
  }
}
