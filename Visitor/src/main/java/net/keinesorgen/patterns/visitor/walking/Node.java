package net.keinesorgen.patterns.visitor.walking;

/**
 * @author mmiotk
 * @version 1.0
 * @created 02-sie-2015 11:46:56
 */
public class Node {

    private Node left;
    private Node right;
    private int value;
    private String name;

    public Node(String name, int value, Node left, Node right) {
        this.left = left;
        this.right = right;
        this.value = value;
        this.name = name;
    }

    public Node() {

    }

    public void finalize() throws Throwable {

    }

    /**
     *
     * @param visitor
     */
    public void accept(NodeVisitor visitor) {
        walkThrough(visitor);
    }

    public int getValue() {
        return value;
    }

    /**
     *
     * @param visitor
     */
    private void walkThrough(NodeVisitor visitor) {
        visitor.visit(this);
        if (left != null) {
            left.walkThrough(visitor);

        }
        if (right != null) {
            right.walkThrough(visitor);

        }
    }

    /**
     * @param left the left to set
     */
    public void setLeft(Node left) {
        this.left = left;
    }

    /**
     * @param right the right to set
     */
    public void setRight(Node right) {
        this.right = right;
    }

    public String getName() {
        return name;
    }

}
