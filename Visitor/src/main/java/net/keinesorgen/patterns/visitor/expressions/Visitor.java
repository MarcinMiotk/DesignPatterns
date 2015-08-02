package net.keinesorgen.patterns.visitor.expressions;

/**
 *
 */
interface Visitor {

    void visit(PlusExpr plus);

    void visit(NumberExpr number);

    // note: evolution
    void visit(MinusExpr minus);
}
