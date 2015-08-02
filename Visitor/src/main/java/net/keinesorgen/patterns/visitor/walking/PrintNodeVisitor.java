package net.keinesorgen.patterns.visitor.walking;

/**
 * @author mmiotk
 * @version 1.0
 * @created 02-sie-2015 11:46:56
 */
public class PrintNodeVisitor implements NodeVisitor {

    public PrintNodeVisitor() {

    }

    public void finalize() throws Throwable {

    }

    /**
     *
     * @param node
     */
    public void visit(Node node) {
        //Printing of value

        System.out.println("Value of " + node.getName() + " is " + node.getValue());
    }

}
