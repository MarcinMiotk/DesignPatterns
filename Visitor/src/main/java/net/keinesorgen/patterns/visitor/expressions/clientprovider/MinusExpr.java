package net.keinesorgen.patterns.visitor.expressions.clientprovider;

/**
 *
 */
interface MinusExpr extends Expression {

    Expression getFirst();

    Expression getSecond();

}
