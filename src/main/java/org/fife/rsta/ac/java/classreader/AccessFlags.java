/*
 * 03/21/2010
 *
 * Copyright (C) 2010 Robert Futrell
 * robert_futrell at users.sourceforge.net
 * http://fifesoft.com/rsyntaxtextarea
 *
 * This library is distributed under a modified BSD license.  See the included
 * RSTALanguageSupport.License.txt file for details.
 */
package org.fife.rsta.ac.java.classreader;


/**
 * Class/interface access flag masks.
 *
 * @author Robert Futrell
 * @version 1.0
 */
public interface AccessFlags {

	/**
	 * Declared public; may be accessed from outside its package.
	 */
	int ACC_PUBLIC			= 0x0001;

	/**
	 * Declared private; usable only within the defining class.
	 */
	int ACC_PRIVATE			= 0x0002;

	/**
	 * Declared protected; may be accessed within subclasses.
	 */
	int ACC_PROTECTED		= 0x0004;

	/**
	 * Declared static.
	 */
	int ACC_STATIC			= 0x0008;

	/**
	 * Declared final; no subclasses allowed.
	 */
	int ACC_FINAL			= 0x0010;

	/**
	 * Treat superclass methods specially when invoked by the
	 * <em>invokespecial</em> instruction.
	 */
	/*
	 * NOTE: This is the same value as ACC_SYNCHRONIZED.
	 */
	int ACC_SUPER			= 0x0020;

	/**
	 * Declared synchronized; invocation is wrapped in a monitor block.
	 */
	/*
	 * NOTE: This is the same value as ACC_SUPER.
	 */
	int ACC_SYNCHRONIZED	= 0x0020;

	/**
	 * Declared volatile; cannot be cached.
	 */
	int ACC_VOLATILE		= 0x0040;

	/**
	 * Declared transient; not written or read by a persistent object manager.
	 */
	int ACC_TRANSIENT		= 0x0080;

	/**
	 * Declared native; implemented in a language other than Java.
	 */
	int ACC_NATIVE			= 0x0100;

	/**
	 * Is an interface, not a class.
	 */
	int ACC_INTERFACE		= 0x0200;

	/**
	 * Declared abstract; may not be instantiated.
	 */
	int ACC_ABSTRACT		= 0x0400;

	/**
	 * Declared strictfp; floating-point mode is FP-strict.
	 */
	int ACC_STRICT			= 0x0800;

	/**
	 * Declared <code>synthetic</code>; not present in the source code.
	 */
	int ACC_SYNTHETIC		= 0x1000;

	/**
	 * Declared as an annotation type.
	 */
	int ACC_ANNOTATION		= 0x2000;

	/**
	 * Declared as an enum type.
	 */
	int ACC_ENUM			= 0x4000;

}
