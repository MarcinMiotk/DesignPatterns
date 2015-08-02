package net.keinesorgen.patterns.visitor.expressions.evolution;

/**
 *
 */
abstract class Expression {

    Expression() {
    }

    abstract void visit(Visitor v);
}
