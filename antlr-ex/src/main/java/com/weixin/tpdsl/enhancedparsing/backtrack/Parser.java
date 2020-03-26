package com.weixin.tpdsl.enhancedparsing.backtrack;

import java.util.ArrayList;
import java.util.List;

/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
 ***/
public abstract class Parser {

  // from where do we get tokens?
  Lexer input;
  // stack of index markers into lookahead buffer
  List<Integer> markers;
  // dynamically-sized lookahead buffer
  List<Token> lookahead;
  // index of current lookahead token;
  int p = 0;
  // LT(1) returns lookahead[p]

  public Parser(Lexer input) {
    this.input = input;
    // make marker stack
    markers = new ArrayList<Integer>();
    // make lookahead buffer
    lookahead = new ArrayList<Token>();
    // prime buffer with at least 1 token
    sync(1);
  }

  public void consume() {
    p++;
    // have we hit end of buffer when not backtracking?
    if (p == lookahead.size() && !isSpeculating()) {
      // if so, it's an opportunity to start filling at index 0 again
      p = 0;
      // size goes to 0, but retains memory
      lookahead.clear();
    }
    // get another to replace consumed token
    sync(1);
  }

  /**
   * Make sure we have i tokens from current position p
   */
  public void sync(int i) {
    // out of tokens?
    if (p + i - 1 > (lookahead.size() - 1)) {
      // get n tokens
      int n = (p + i - 1) - (lookahead.size() - 1);
      fill(n);
    }
  }

  public void fill(int n) {
    // add n tokens
    for (int i = 1; i <= n; i++) {
      lookahead.add(input.nextToken());
    }
  }

  public Token LT(int i) {
    sync(i);
    return lookahead.get(p + i - 1);
  }

  public int LA(int i) {
    return LT(i).type;
  }

  public void match(int x) throws MismatchedTokenException {
    if (LA(1) == x) {
      consume();
    } else {
      throw new MismatchedTokenException("expecting " +
          input.getTokenName(x) + " found " + LT(1));
    }
  }

  public int mark() {
    markers.add(p);
    return p;
  }

  public void release() {
    int marker = markers.get(markers.size() - 1);
    markers.remove(markers.size() - 1);
    seek(marker);
  }

  public void seek(int index) {
    p = index;
  }

  public boolean isSpeculating() {
    return markers.size() > 0;
  }

}
