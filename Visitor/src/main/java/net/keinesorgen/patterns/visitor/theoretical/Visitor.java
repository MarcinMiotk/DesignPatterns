package net.keinesorgen.patterns.visitor.theoretical;


/**
 * This class declares a Visit operation for each class of ConcreteElement in the
 * object structure. The operation's name and signature identifies the class that
 * sends the Visit request to the visitor. That lets the visitor determine the
 * concrete class of the element being visited. Then the visitor can access the
 * element directly through its particular interface.
 * @version 1.0
 * @created 02-sie-2015 09:00:47
 */
abstract class Visitor {

	public Visitor(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param concreteElementA
	 */
	public abstract void VisitConcreteElementA(ConcreteElementA concreteElementA);

	/**
	 * 
	 * @param concreteElementB
	 */
	public abstract void VisitConcreteElementB(ConcreteElementB concreteElementB);

}