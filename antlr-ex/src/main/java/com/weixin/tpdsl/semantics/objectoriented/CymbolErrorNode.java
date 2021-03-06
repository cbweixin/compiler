package com.weixin.tpdsl.semantics.objectoriented;

/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonErrorNode;

/** A node representing erroneous token range in token stream */
public class CymbolErrorNode extends CymbolAST {
	org.antlr.runtime.tree.CommonErrorNode delegate;

	public CymbolErrorNode(TokenStream input, Token start, Token stop,
					   RecognitionException e)
	{
		delegate = new CommonErrorNode(input,start,stop,e);
	}

    @Override
		public boolean isNil() { return delegate.isNil(); }

	@Override
	public int getType() { return delegate.getType(); }

	@Override
	public String getText() { return delegate.getText(); }
	@Override
	public String toString() { return delegate.toString(); }
}
