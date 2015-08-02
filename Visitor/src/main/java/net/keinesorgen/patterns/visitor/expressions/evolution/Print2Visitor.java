package net.keinesorgen.patterns.visitor.expressions.evolution;

/**
 *
 */
public class Print2Visitor extends PrintVisitor {

    @Override
    void visit(MinusExpr minus) {
        minus.getFirst().visit(this);
        sb.append(" - ");
        minus.getSecond().visit(this);
    }

}
