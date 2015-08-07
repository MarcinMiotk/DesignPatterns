package net.keinesorgen.patterns.visitor.multimethod;

/**
 *
 */
public abstract class FigureFunctions {

    //abstract double intersect(Circle a, Circle b);

//    abstract double intersect(Circle a, Rectangle b);

//    abstract double intersect(Rectangle a, Rectangle b);

    // better one function instance of 3 functions
    abstract double intersect(Figure a, Figure b);
}
