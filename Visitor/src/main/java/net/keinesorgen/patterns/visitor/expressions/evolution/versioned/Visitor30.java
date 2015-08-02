package net.keinesorgen.patterns.visitor.expressions.evolution.versioned;

/**
 *
 */
interface Visitor30 extends Visitor {

    void visit(PlusExpr plus);

    void visit(MinusExpr minus);

    // Note: Only real numbers are supported!
    void visit(RealExpr minus);

    // Note: removed since 3.0
    //void visit(NumberExpr number);
}
