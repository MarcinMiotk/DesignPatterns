package net.keinesorgen.patterns.visitor.theoretical;


/**
 * This class implements each operation declared by Visitor. Each operation
 * implements a fragment of the algorithm defined for the corresponding class of
 * object in the structure. ConcreteVisitor provides the context for the algorithm
 * and stores its local state. This state often accumulates results during the
 * traversal of the structure.
 * @version 1.0
 * @created 02-sie-2015 09:00:46
 */
public class ConcreteVisitor1 extends Visitor {

	public ConcreteVisitor1(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * 
	 * @param concreteElementA
	 */
	public void VisitConcreteElementA(ConcreteElementA concreteElementA){

	}

	/**
	 * 
	 * @param concreteElementB
	 */
	public void VisitConcreteElementB(ConcreteElementB concreteElementB){

	}

}