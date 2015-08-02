package net.keinesorgen.patterns.visitor.expressions.evolution.versioned;

/**
 *
 */
interface Visitor10 extends Visitor {

    void visit(PlusExpr plus);

    void visit(NumberExpr number);
}
