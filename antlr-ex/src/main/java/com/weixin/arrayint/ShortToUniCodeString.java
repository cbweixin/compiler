package com.weixin.arrayint;

import com.weixin.arrayint.gen.ArrayInitBaseListener;
import com.weixin.arrayint.gen.ArrayInitParser;

/** Convert short array inits like {1,2,3} to "\u0001\u0002\u0003" */
public class ShortToUniCodeString extends ArrayInitBaseListener {
  /** Translate { to " */
  @Override
  public void enterInit(ArrayInitParser.InitContext ctx) {
    System.out.println('"');
  }

  /** Translate } to " */
  @Override
  public void exitInit(ArrayInitParser.InitContext ctx){
    System.out.println('"');
  }

  /** Translate integers to 4-digit hexadecimal strings prefixed with \\u */
  @Override
  public void enterValue(ArrayInitParser.ValueContext ctx){
    // Assumes no nested array initializers
    int value = Integer.valueOf(ctx.INT().getText());
    System.out.printf("\\u%04x", value);
  }

}
