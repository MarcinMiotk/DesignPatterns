package net.keinesorgen.patterns.visitor.mathexpressions;

/**
 *
 */
abstract class ExpressionVisitor {

    abstract void visit(IntExp a);
    
    abstract void visit(AddExp a);
}
