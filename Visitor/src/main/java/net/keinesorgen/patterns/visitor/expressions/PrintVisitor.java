package net.keinesorgen.patterns.visitor.expressions;

/**
 *
 */
class PrintVisitor implements Visitor {

    private final StringBuffer sb = new StringBuffer();

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

    // note: evolution
    @Override
    public void visit(MinusExpr minus) {
        minus.getFirst().visit(this);
        sb.append(" - ");
        minus.getSecond().visit(this);
    }
}
