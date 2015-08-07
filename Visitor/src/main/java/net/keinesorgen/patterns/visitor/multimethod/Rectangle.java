package net.keinesorgen.patterns.visitor.multimethod;

/**
 *
 */
public class Rectangle extends Figure {

    @Override
    void accept(Visitor v) {
        v.visit(this);
    }
}
