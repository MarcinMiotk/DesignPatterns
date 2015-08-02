package net.keinesorgen.patterns.visitor.expressions.evolution;

/**
 *
 */
class PrintVisitor extends Visitor {

    protected final StringBuffer sb = new StringBuffer();

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

    protected String getPrinted() {
        return sb.toString();
    }
}
