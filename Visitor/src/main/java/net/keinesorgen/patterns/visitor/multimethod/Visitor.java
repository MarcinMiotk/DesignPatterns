package net.keinesorgen.patterns.visitor.multimethod;

/**
 *
 */
interface Visitor {

    void visit(Rectangle rectangle);

    void visit(Circle circle);
}
