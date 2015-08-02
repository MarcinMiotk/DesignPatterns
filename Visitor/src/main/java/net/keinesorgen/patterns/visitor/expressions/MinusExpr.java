package net.keinesorgen.patterns.visitor.expressions;

/**
 * note: evolution
 */
class MinusExpr extends Expression {

    private final Expression first;
    private final Expression second;

    MinusExpr(Expression first, Expression second) {
        this.first = first;
        this.second = second;
    }

    @Override
    void visit(Visitor v) {
       v.visit(this);
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
