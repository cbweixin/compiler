package com.weixin.tpdsl.interpreter.stack;

/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
 ***/
public class StackFrame {

  // associated with which function?
  FunctionSymbol sym;
  // the instruction following the call
  int returnAddress;
  // holds parameters and local variables
  Object[] locals;

  public StackFrame(FunctionSymbol sym, int returnAddress) {
    this.sym = sym;
    this.returnAddress = returnAddress;
    locals = new Object[sym.nargs + sym.nlocals];
  }
}
