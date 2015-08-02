package net.keinesorgen.patterns.visitor.expressions;

/**
 *
 */
class NumberExpr extends Expression {

    private final int value;

    public NumberExpr(int value) {
        this.value = value;
    }

    @Override
    void visit(Visitor v) {
        v.visit(this);
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

}
