package net.keinesorgen.patterns.visitor.walking;

/**
 * @author mmiotk
 * @version 1.0
 * @created 02-sie-2015 11:46:56
 */
public class SumNodeVisitor implements NodeVisitor {

    private int sum;

    public SumNodeVisitor() {

    }

    public int getSum() {
        return sum;
    }

    public void finalize() throws Throwable {

    }

    /**
     *
     * @param node
     */
    public void visit(Node node) {
        //Sum elements

        sum += node.getValue();
    }

}
