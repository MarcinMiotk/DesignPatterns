package net.keinesorgen.patterns.visitor.mathexpressions;

/**
 *
 */
abstract class Expression {

    abstract void accept(ExpressionVisitor v);
}
