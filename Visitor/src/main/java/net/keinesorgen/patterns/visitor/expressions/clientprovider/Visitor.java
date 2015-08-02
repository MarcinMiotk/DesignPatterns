package net.keinesorgen.patterns.visitor.expressions.clientprovider;

/**
 *
 */
abstract class Visitor {

    private static Visitor create10(final Version10 v) {
        return new Visitor() {

            @Override
            void dispatch(PlusExpr p) {
                v.visit(p);
            }

            @Override
            void dispatch(NumberExpr n) {
                v.visit(n);
            }

            @Override
            void dispatch(MinusExpr m) {
                if (v.visitUnknown(m)) {
                    m.getFirst().visit(this);
                    m.getSecond().visit(this);
                }
            }

            @Override
            void dispatch(RealExpr r) {
                v.visitUnknown(r);
            }
        };
    }

    private static Visitor create20(final Version20 v) {
        return new Visitor() {

            @Override
            void dispatch(PlusExpr p) {
                v.visit(p);
            }

            @Override
            void dispatch(NumberExpr n) {
                v.visit(n);
            }

            @Override
            void dispatch(MinusExpr m) {
                v.visit(m);
            }

            @Override
            void dispatch(RealExpr r) {
                v.visitUnknown(r);
            }
        };
    }

    private static Visitor create30(final Version30 v) {
        return new Visitor() {

            @Override
            void dispatch(PlusExpr p) {
                v.visit(p);
            }

            @Override
            void dispatch(NumberExpr n) {
                class RealWrapper implements RealExpr {

                    @Override
                    public double getValue() {
                        return n.getValue();
                    }

                    @Override
                    public void visit(Visitor v) {
                        n.visit(v);
                    }
                }
                v.visit(new RealWrapper());

            }

            @Override
            void dispatch(MinusExpr m) {
                v.visit(m);
            }

            @Override
            void dispatch(RealExpr r) {
                v.visit(r);
            }
        };
    }

    public Visitor() {
    }

    public static Visitor create(Version10 v) {
        return create10(v);
    }

    public static Visitor create(Version20 v) {
        return create20(v);
    }

    public static Visitor create(Version30 v) {
        return create30(v);
    }

    abstract void dispatch(PlusExpr p);

    abstract void dispatch(NumberExpr n);

    public interface Version10 {

        boolean visitUnknown(Expression e);

        void visit(PlusExpr p);

        void visit(NumberExpr n);
    }

    // -----------------------------------------------------
    public interface Version20 extends Version10 {

        void visit(MinusExpr m);
    }

    abstract void dispatch(MinusExpr m);

    // -----------------------------------------------------
    public interface Version30 {

        boolean visitUnknown(Expression e);

        void visit(PlusExpr p);

        void visit(MinusExpr m);

        // it replaces NumberExpr
        void visit(RealExpr n);
    }

    abstract void dispatch(RealExpr r);
}
