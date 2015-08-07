package net.keinesorgen.patterns.visitor.multimethod;

/**
 *
 */
class CircleVisitor implements Visitor {

    private final Circle first;
    private double value;

    protected double getValue() {
        return value;
    }
    
    protected CircleVisitor(Circle first) {
        this.first = first;
    }

    @Override
    public void visit(Circle circle) {
        value = intersect(first, circle);
    }

    @Override
    public void visit(Rectangle rectangle) {
        value = intersect(first, rectangle);
    }

    private double intersect(Circle a, Circle b) {
        System.out.println("CircleVisitor # circle+circle <=> " + a + "+" + b);
        return 1.1;
    }

    private double intersect(Circle a, Rectangle b) {
        System.out.println("CircleVisitor # circle+rectangle <=> " + a + "+" + b);
        return 1.2;
    }
}
