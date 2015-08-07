package net.keinesorgen.patterns.visitor.mathexpressions;

/**
 *
 */
class PrettyPrintingVisitor extends ExpressionVisitor {
    
    @Override
    void visit(IntExp a) {
        System.out.println(a);
    }
    
    @Override
    void visit(AddExp a) {
        a.exp1.accept(this);
        System.out.println(" + ");
        a.exp2.accept(this);
    }
    
}
