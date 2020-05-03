package com.weixin.tpdsl.translate.make;

/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
 ***/
public interface MakeGenerator {

  void start();

  void finish();

  void target(String t);

  void dependency(String d);

  void action(String a);

  void endTarget(String t);
}
