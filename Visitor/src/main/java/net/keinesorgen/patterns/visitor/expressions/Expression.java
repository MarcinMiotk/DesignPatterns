package net.keinesorgen.patterns.visitor.expressions;

/**
 *
 */
abstract class Expression {

    Expression() {
    }

    abstract void visit(Visitor v);
}
