package com.weixin.tpdsl.parsing.llk;

import com.weixin.tpdsl.parsing.nestedlist.Lexer;

public class LookAheadParser extends Parser {


  public LookAheadParser(Lexer input, int k) {
    super(input, k);
  }

  /**
   * list : '[' elements ']' ; // match bracketed list
   */
  public void list() {
    match(LookAheadLexer.LBRACK);
    elements();
    match(LookAheadLexer.RBRACK);
  }

  /**
   * elements : element (',' element)* ; // match comma-separated list
   */
  void elements() {
    element();
    while (LA(1) == LookAheadLexer.COMMA) {
      match(LookAheadLexer.COMMA);
      element();
    }
  }

  /** element : NAME '=' NAME | NAME | list ; assignment, NAME or list */
  void element() {
    if ( LA(1)==LookAheadLexer.NAME && LA(2)==LookAheadLexer.EQUALS ) {
      match(LookAheadLexer.NAME);
      match(LookAheadLexer.EQUALS);
      match(LookAheadLexer.NAME);
    }
    else if ( LA(1)==LookAheadLexer.NAME ) {
      match(LookAheadLexer.NAME);
    } else if ( LA(1)==LookAheadLexer.LBRACK ) {
      list();
    } else {
      throw new Error("expecting name or list; found " + LT(1));
    }
  }
}
