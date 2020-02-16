package com.weixin.tour.class2interface;

import com.weixin.tour.class2interface.gen.JavaBaseListener;
import com.weixin.tour.class2interface.gen.JavaParser;
import org.antlr.v4.runtime.TokenStream;

public class ExtractInterfaceListener extends JavaBaseListener {

  JavaParser parser;

  public ExtractInterfaceListener(JavaParser parser) {
    this.parser = parser;
  }

  /**
   * Listen to matches of classDeclaration
   */
  @Override
  public void enterClassDeclaration(JavaParser.ClassDeclarationContext ctx) {
    System.out.println("interface I" + ctx.Identifier() + " {");
  }

  @Override
  public void exitClassDeclaration(JavaParser.ClassDeclarationContext ctx) {
    System.out.println("}");
  }

  /**
   * Listen to matches of methodDeclaration
   */
  @Override
  public void enterMethodDeclaration(
      JavaParser.MethodDeclarationContext ctx
  ) {
    // need parser to get tokens
    TokenStream tokens = parser.getTokenStream();
    String type = "void";
    if (ctx.type() != null) {
      type = tokens.getText(ctx.type());
    }
    String args = tokens.getText(ctx.formalParameters());
    System.out.println("\t" + type + " " + ctx.Identifier() + args + ";");
  }


}
