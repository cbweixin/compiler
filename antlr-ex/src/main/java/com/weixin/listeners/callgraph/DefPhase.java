package com.weixin.listeners.callgraph;

import com.weixin.listeners.callgraph.gen.CymbolBaseListener;
import com.weixin.listeners.callgraph.gen.CymbolParser;
import com.weixin.listeners.callgraph.symboltable.FunctionSymbol;
import com.weixin.listeners.callgraph.symboltable.GlobalScope;
import com.weixin.listeners.callgraph.symboltable.LocalScope;
import com.weixin.listeners.callgraph.symboltable.Scope;
import com.weixin.listeners.callgraph.symboltable.Symbol;
import com.weixin.listeners.callgraph.symboltable.VariableSymbol;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class DefPhase extends CymbolBaseListener{

  ParseTreeProperty<Scope> scopes = new ParseTreeProperty<Scope>();
  GlobalScope globals;
  Scope currentScope; // define symbols in this scope

  @Override
  public void enterFile(CymbolParser.FileContext ctx) {
    globals = new GlobalScope(null);
    currentScope = globals;
  }

  @Override
  public void exitFile(CymbolParser.FileContext ctx) {
    System.out.println(globals);
  }

  @Override
  public void enterFunctionDecl(CymbolParser.FunctionDeclContext ctx) {
    String name = ctx.ID().getText();
    int typeTokenType = ctx.type().start.getType();
    Symbol.Type type = CheckSymbol.getType(typeTokenType);

    // push new scope by making new one that points to enclosing scope
    FunctionSymbol function = new FunctionSymbol(name, type, currentScope);
    currentScope.define(function); // Define function in current scope
    saveScope(ctx, function);      // Push: set function's parent to current
    currentScope = function;       // Current scope is now function scope
  }

  void saveScope(ParserRuleContext ctx, Scope s) {
    scopes.put(ctx, s);
  }

  @Override
  public void exitFunctionDecl(CymbolParser.FunctionDeclContext ctx) {
    System.out.println(currentScope);
    currentScope = currentScope.getEnclosingScope(); // pop scope
  }

  @Override
  public void enterBlock(CymbolParser.BlockContext ctx) {
    // push new local scope
    currentScope = new LocalScope(currentScope);
    saveScope(ctx, currentScope);
  }

  @Override
  public void exitBlock(CymbolParser.BlockContext ctx) {
    System.out.println(currentScope);
    currentScope = currentScope.getEnclosingScope(); // pop scope
  }

  @Override
  public void exitFormalParameter(CymbolParser.FormalParameterContext ctx) {
    defineVar(ctx.type(), ctx.ID().getSymbol());
  }

  @Override
  public void exitVarDecl(CymbolParser.VarDeclContext ctx) {
    defineVar(ctx.type(), ctx.ID().getSymbol());
  }

  void defineVar(CymbolParser.TypeContext typeCtx, Token nameToken) {
    int typeTokenType = typeCtx.start.getType();
    Symbol.Type type = CheckSymbol.getType(typeTokenType);
    VariableSymbol var = new VariableSymbol(nameToken.getText(), type);
    currentScope.define(var); // Define symbol in current scope
  }

}
