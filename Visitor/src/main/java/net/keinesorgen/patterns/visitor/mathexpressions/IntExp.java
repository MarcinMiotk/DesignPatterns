package net.keinesorgen.patterns.visitor.mathexpressions;

/**
 *
 */
class IntExp extends Expression {
    
    int value;
    
    @Override
    void accept(ExpressionVisitor v) {
        v.visit(this);
    }
    
}
