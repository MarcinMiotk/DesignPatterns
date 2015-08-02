package net.keinesorgen.patterns.visitor.expressions.evolution.versioned;

/**
 * note: evolution
 */
class MinusExpr implements Expression {

    private final Expression first;
    private final Expression second;

    MinusExpr(Expression first, Expression second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public void visit(Visitor v) {
        if (v instanceof Visitor20) {
            ((Visitor20) v).visit(this);
        } else if (v instanceof Visitor30) {        // 3.0 does not extends 2.0 !!
            ((Visitor20) v).visit(this);
        } else {
            v.visitUnknown(this);
        }
    }

    /**
     * @return the first
     */
    public Expression getFirst() {
        return first;
    }

    /**
     * @return the second
     */
    public Expression getSecond() {
        return second;
    }

}
