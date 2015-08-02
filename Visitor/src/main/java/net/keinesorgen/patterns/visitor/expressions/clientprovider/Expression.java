package net.keinesorgen.patterns.visitor.expressions.clientprovider;

/**
 *
 */
interface Expression {

    void visit(Visitor v);
}
