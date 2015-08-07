package net.keinesorgen.patterns.visitor.multimethod;

/**
 *
 */
public class Circle extends Figure {

    @Override
    void accept(Visitor v) {
        v.visit(this);
    }

    
}
