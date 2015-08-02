package net.keinesorgen.patterns.visitor.expressions.evolution.versioned;

/**
 *
 */
class NumberExpr implements Expression {

    private final int value;

    public NumberExpr(int value) {
        this.value = value;
    }

    @Override
    public void visit(Visitor v) {
        if (v instanceof Visitor10) {
            ((Visitor10) v).visit(this);
        } else {
            v.visitUnknown(this);
        }
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

}
