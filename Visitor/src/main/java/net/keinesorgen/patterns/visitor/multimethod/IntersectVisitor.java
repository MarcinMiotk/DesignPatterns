package net.keinesorgen.patterns.visitor.multimethod;

/**
 *
 */
public class IntersectVisitor implements Visitor {

    private final Figure first;
    private double value;

    public IntersectVisitor(Figure first) {
        this.first = first;
    }

    @Override
    public void visit(Circle circle) {
        CircleVisitor v = new CircleVisitor(circle);
        first.accept(v);
        value = v.getValue();
    }

    @Override
    public void visit(Rectangle rectangle) {
        RectangleVisitor v = new RectangleVisitor(rectangle);
        first.accept(v);
        value = v.getValue();
    }

    protected double getValue() {
        return value;
    }
}
