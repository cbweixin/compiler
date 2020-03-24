package com.weixin.tpdsl.parsing.llk;

import com.weixin.tpdsl.parsing.nestedlist.Lexer;
import com.weixin.tpdsl.parsing.nestedlist.Token;

public abstract class Parser {

  Lexer input;
  Token[] lookAhead;
  int k;
  int p = 0;

  public Parser(Lexer input, int k) {
    this.input = input;
    this.k = k;
    this.lookAhead = new Token[k];

    for (int i = 1; i <= k; i++) {
      consume();
    }
  }

  public void consume() {
    lookAhead[p] = input.nextToken();
    p = (p + 1) % k;
  }
  public Token LT(int i) {
    return lookAhead[(p + i - 1) % k];  // circular fetch token
  }

  public int LA(int i) {
    return LT(i).type;   // return totken type
  }

  public void match(int x) {
    if ( LA(1) == x ) {
      consume();
    } else {
      throw new Error("expecting " + input.getTokenName(x) + "; found " + LT(1));
    }
  }

}
