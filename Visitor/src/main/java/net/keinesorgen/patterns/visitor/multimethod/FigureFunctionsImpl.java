package net.keinesorgen.patterns.visitor.multimethod;

public class FigureFunctionsImpl extends FigureFunctions {

    /**
     * It replaces 3 functions
     *
     *
     * Try call Rectangle+Circle
     *
     * @param a
     * @param b
     * @return
     */
    @Override
    double intersect(Figure a, Figure b) {
        IntersectVisitor v = new IntersectVisitor(b);
        a.accept(v);
        return v.getValue();
    }
}
