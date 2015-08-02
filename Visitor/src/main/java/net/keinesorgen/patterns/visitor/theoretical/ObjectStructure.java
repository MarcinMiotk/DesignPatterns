package net.keinesorgen.patterns.visitor.theoretical;

import java.util.*;

/**
 * This class can enumerate its elements, may provide a high-level interface to
 * allow the visitor to visit its elements and may either be a composite or a
 * collection such as a list or a set.
 * @version 1.0
 * @created 02-sie-2015 09:00:46
 */
public class ObjectStructure {

	private Vector elements = new Vector();

	public ObjectStructure(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param visitor
	 */
	public void Accept(Visitor visitor){
		// foreach (Element e in elements) e.Accept( visitor );
	}

	/**
	 * 
	 * @param element
	 */
	public void Attach(Element element){
		elements.addElement( element );
	}

	/**
	 * 
	 * @param element
	 */
	public void Detach(Element element){
		elements.removeElement( element );
	}

}