package com.weixin.listeners.callgraph.symboltable;

public class LocalScope extends BaseScope {

  public LocalScope(Scope parent) {
    super(parent);
  }

  @Override
  public String getScopeName() {
    return "locals";
  }

}
