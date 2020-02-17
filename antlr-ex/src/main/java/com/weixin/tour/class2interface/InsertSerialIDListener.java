package com.weixin.tour.class2interface;

import com.weixin.tour.class2interface.gen.JavaBaseListener;
import com.weixin.tour.class2interface.gen.JavaParser;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;

/**
 * @author xinwei
 */
public class InsertSerialIDListener extends JavaBaseListener {
  TokenStreamRewriter rewriter;
  public InsertSerialIDListener(TokenStream tokens) {
    rewriter = new TokenStreamRewriter(tokens);
  }

  @Override
  public void enterClassBody(JavaParser.ClassBodyContext ctx) {
    String field = "\n\tpublic static final long serialVersionUID = 1L;";
    rewriter.insertAfter(ctx.start, field);
  }
}
