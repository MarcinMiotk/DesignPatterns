package net.keinesorgen.patterns.visitor.theoretical;


/**
 * This class implements an Accept operation that takes a Visitor as an argument.
 * @version 1.0
 * @created 02-sie-2015 09:00:46
 */
class ConcreteElementB extends Element {

	public ConcreteElementB(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * 
	 * @param visitor
	 */
	public void Accept(Visitor visitor){
		visitor.VisitConcreteElementB( this );
	}

}