package net.keinesorgen.patterns.visitor.mathexpressions;

/**
 *
 */
class AddExp extends Expression {

    Expression exp1, exp2;
    
    @Override
    void accept(ExpressionVisitor v) {
        v.visit(this);
    }

}
