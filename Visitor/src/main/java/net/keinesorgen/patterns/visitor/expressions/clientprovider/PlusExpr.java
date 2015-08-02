package net.keinesorgen.patterns.visitor.expressions.clientprovider;

/**
 *
 */
interface PlusExpr extends Expression {

    Expression getFirst();

    Expression getSecond();

}
