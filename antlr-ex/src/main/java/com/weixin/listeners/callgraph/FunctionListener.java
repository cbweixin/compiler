package com.weixin.listeners.callgraph;

import com.weixin.listeners.callgraph.gen.CymbolBaseListener;
import com.weixin.listeners.callgraph.gen.CymbolParser;

class FunctionListener extends CymbolBaseListener {

    Graph graph = new Graph();
    String currentFunctionName = null;

    @Override
    public void enterFunctionDecl(CymbolParser.FunctionDeclContext ctx) {
      currentFunctionName = ctx.ID().getText();
      graph.nodes.add(currentFunctionName);
    }

    @Override
    public void exitCall(CymbolParser.CallContext ctx) {
      String funcName = ctx.ID().getText();
      // map current function to the callee
      graph.edge(currentFunctionName, funcName);
    }
  }
