package net.keinesorgen.patterns.visitor.cars;


/**
 * This class defines an Accept operation that takes a visitor as an argument.
 * @version 1.0
 * @created 02-sie-2015 09:22:06
 */
public abstract class CarElement {

	public CarElement(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param visitor
	 */
	public abstract void Accept(CarElementVisitor visitor);

}