package com.weixin.listeners.callgraph.symboltable;

public class GlobalScope extends BaseScope {

  public GlobalScope(Scope enclosingScope) {
    super(enclosingScope);
  }

  @Override
  public String getScopeName() {
    return "globals";
  }
}
