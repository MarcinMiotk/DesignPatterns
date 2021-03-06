package net.keinesorgen.patterns.visitor.cars;


/**
 * This class implements an Accept operation that takes a Visitor as an argument.
 * @version 1.0
 * @created 02-sie-2015 09:22:06
 */
public class Whell extends CarElement {

	public Whell(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * 
	 * @param visitor
	 */
	public void Accept(CarElementVisitor visitor){
		visitor.VisitWhell( this );
	}

}