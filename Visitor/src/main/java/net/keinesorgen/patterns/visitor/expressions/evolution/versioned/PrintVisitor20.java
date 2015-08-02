package net.keinesorgen.patterns.visitor.expressions.evolution.versioned;

/**
 *
 */
public class PrintVisitor20 implements Visitor20 {

    protected final StringBuffer sb = new StringBuffer();

    @Override
    public void visit(MinusExpr minus) {
        minus.getFirst().visit(this);
        sb.append(" - ");
        minus.getSecond().visit(this);
    }

    @Override
    public void visit(PlusExpr plus) {
        plus.getFirst().visit(this);
        sb.append(" + ");
        plus.getSecond().visit(this);
    }

    @Override
    public void visit(NumberExpr number) {
        sb.append(number.getValue());
    }

    @Override
    public void visitUnknown(Expression e) {
        sb.append("NA");
    }

}
