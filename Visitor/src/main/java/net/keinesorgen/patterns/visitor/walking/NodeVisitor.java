package net.keinesorgen.patterns.visitor.walking;


/**
 * @author mmiotk
 * @version 1.0
 * @created 02-sie-2015 11:46:56
 */
public interface NodeVisitor {

	/**
	 * 
	 * @param node
	 */
	public void visit(Node node);

}