/*
 * 02/25/2012
 *
 * Copyright (C) 2012 Robert Futrell
 * robert_futrell at users.sourceforge.net
 * http://fifesoft.com/rsyntaxtextarea
 *
 * This library is distributed under a modified BSD license.  See the included
 * RSTALanguageSupport.License.txt file for details.
 */
package org.fife.rsta.ac.js.completion;

import org.fife.rsta.ac.js.ast.JSVariableDeclaration;
import org.fife.rsta.ac.js.ast.TypeDeclarationFactory;
import org.fife.ui.autocomplete.CompletionProvider;
import org.fife.ui.autocomplete.VariableCompletion;


public class JSVariableCompletion extends VariableCompletion {

	private JSVariableDeclaration dec;


	public JSVariableCompletion(CompletionProvider provider, String name,
			JSVariableDeclaration dec) {
		super(provider, name, dec.getJavaScriptTypeName());
		this.dec = dec;
	}


	public JSVariableDeclaration getVariableDeclaration() {
		return dec;
	}

	public String getType()
	{
		String value = super.getType();
		return TypeDeclarationFactory.lookupJSType(value, false);
	}
	
	public String getType(boolean qualified) {
		return TypeDeclarationFactory.lookupJSType(super.getType(), qualified);
	}
}