package net.keinesorgen.patterns.visitor.tutorial.staff;


/**
 * @author mmiotk
 * @version 1.0
 * @created 09-sie-2015 13:30:24
 */
public interface Visitor {

	/**
	 * 
	 * @param manager
	 */
	public void visit(Manager manager);

	/**
	 * 
	 * @param employee
	 */
	public void visit(Employee employee);

	/**
	 * 
	 * @param freelancer
	 */
	public void visit(Freelancer freelancer);

}