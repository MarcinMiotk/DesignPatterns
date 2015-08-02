package net.keinesorgen.patterns.visitor.expressions.clientprovider;

/**
 *
 */
class PrintVisitor implements Visitor.Version10 {

    protected final StringBuffer sb = new StringBuffer();

    final Visitor dispatch = Visitor.create(this);

    @Override
    public boolean visitUnknown(Expression e) {
        sb.append(" NA ");
        return true;
    }

    @Override
    public void visit(PlusExpr p) {
        p.getFirst().visit(dispatch);
        sb.append(" + ");
        p.getSecond().visit(dispatch);
    }

    @Override
    public void visit(NumberExpr n) {
        sb.append(n.getValue());
    }

}
