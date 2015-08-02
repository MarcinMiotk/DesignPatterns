package net.keinesorgen.patterns.visitor.expressions.evolution;

/**
 * Here Visitor is abstract class instead of interface
 */
abstract class Visitor {
    
    abstract void visit(PlusExpr plus);
    
    abstract void visit(NumberExpr number);

    // note: evolution
    void visit(MinusExpr minus) {
        visitUnknown(minus);
    }
    
    public void visitUnknown(Expression exp) {
        throw new IllegalStateException("Unknown element (evolution of visited structure is hidden): " + exp);
        
    }
}
