package net.keinesorgen.patterns.visitor.cars;


/**
 * @author mmiotk
 * @version 1.0
 * @created 02-sie-2015 09:22:06
 */
public class Body extends CarElement {

	public Body(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * 
	 * @param visitor
	 */
	public void Accept(CarElementVisitor visitor){
		visitor.VisitBody( this );
	}

}