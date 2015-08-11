package net.keinesorgen.patterns.visitor.tutorial.staff;


/**
 * @author mmiotk
 * @version 1.0
 * @created 09-sie-2015 13:30:24
 */
public interface Visitable {

	/**
	 * 
	 * @param visitor
	 */
	public void accept(Visitor visitor);

}