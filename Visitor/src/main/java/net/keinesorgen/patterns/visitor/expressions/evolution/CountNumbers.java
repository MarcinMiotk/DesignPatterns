package net.keinesorgen.patterns.visitor.expressions.evolution;

/**
 *
 */
public class CountNumbers extends Visitor {

    int counter;

    @Override
    public void visitUnknown(Expression exp) {
        // it is not a number
    }

    @Override
    void visit(PlusExpr plus) {
        plus.getFirst().visit(this);
        plus.getSecond().visit(this);
    }

    @Override
    void visit(MinusExpr minus) {
        minus.getFirst().visit(this);
        minus.getSecond().visit(this);
    }

    @Override
    void visit(NumberExpr number) {
        counter++;
    }

}
