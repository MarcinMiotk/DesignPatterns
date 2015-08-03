package net.keinesorgen.patterns.visitor.theoretical;


/**
 * This class defines an Accept operation that takes a visitor as an argument.
 * @version 1.0
 * @created 02-sie-2015 09:00:46
 */
abstract class Element {

	public Element(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param visitor
	 */
	public abstract void Accept(Visitor visitor);

}