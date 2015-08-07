package net.keinesorgen.patterns.visitor.multimethod;

/**
 *
 */
class RectangleVisitor implements Visitor {

    private final Rectangle first;
    private double value;

    protected RectangleVisitor(Rectangle first) {
        this.first = first;
    }

    protected double getValue() {
        return value;
    }

    @Override
    public void visit(Circle circle) {
        value = intersect(first, circle);
    }

    @Override
    public void visit(Rectangle rectangle) {
        value = intersect(first, rectangle);
    }

    private double intersect(Rectangle a, Circle b) {
        System.out.println("RectangleVisitor # rectangle+circle <=> " + a + "+" + b);
        return 2.1;
    }

    private double intersect(Rectangle a, Rectangle b) {
        System.out.println("RectangleVisitor # rectangle+rectangle <=> " + a + "+" + b);
        return 2.2;
    }

}
