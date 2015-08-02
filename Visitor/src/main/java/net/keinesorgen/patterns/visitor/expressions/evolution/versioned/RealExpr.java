package net.keinesorgen.patterns.visitor.expressions.evolution.versioned;

/**
 *
 */
class RealExpr implements Expression {

    private final double value;

    public RealExpr(double value) {
        this.value = value;
    }

    /**
     * @return the value
     */
    public double getValue() {
        return value;
    }

    @Override
    public void visit(Visitor v) {
        if (v instanceof Visitor30) {
            ((Visitor30) v).visit(this);
        } else {
            v.visitUnknown(this);
        }
    }
}
