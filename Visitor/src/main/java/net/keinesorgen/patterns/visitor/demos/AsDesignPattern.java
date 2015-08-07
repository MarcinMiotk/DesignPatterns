package net.keinesorgen.patterns.visitor.demos;

/**
 *
 */
class AsDesignPattern {

    interface Element {

        public void accept(Visitor v); // first dispatch
    }

    static class This implements Element {

        @Override
        public void accept(Visitor v) {
            v.visit(this);
        }

        public String thiss() {
            return "This";
        }
    }

    static class That implements Element {

        @Override
        public void accept(Visitor v) {
            v.visit(this);
        }

        public String that() {
            return "That";
        }
    }

    static class TheOther implements Element {

        @Override
        public void accept(Visitor v) {
            v.visit(this);
        }

        public String theOther() {
            return "TheOther";
        }
    }

    interface Visitor {

        public void visit(This e);          // second dispatch 

        public void visit(That e);

        public void visit(TheOther e);
    }

    static class UpVisitor implements Visitor {

        @Override
        public void visit(This e) {
            System.out.println("do Up on " + e.thiss());
        } //    each "operation"

        @Override
        public void visit(That e) {
            System.out.println("do Up on " + e.that());
        }  //    "elements"

        @Override
        public void visit(TheOther e) {
            System.out.println("do Up on " + e.theOther());
        }
    }

    static class DownVisitor implements Visitor {

        @Override
        public void visit(This e) {
            System.out.println("do Down on " + e.thiss());
        }

        @Override
        public void visit(That e) {
            System.out.println("do Down on " + e.that());
        }

        @Override
        public void visit(TheOther e) {
            System.out.println("do Down on " + e.theOther());
        }
    }

    public static void main(String[] args) {
        Element[] list = {new This(), new That(), new TheOther()};
        UpVisitor up = new UpVisitor();
        DownVisitor down = new DownVisitor();
        for (int i = 0; i < list.length; i++) {
            list[i].accept(up);
        }
        for (int i = 0; i < list.length; i++) {
            list[i].accept(down);
        }

        //do Up on This
        //do Up on That
        //do Up on TheOther
        //do Down on This
        //do Down on That
        //do Down on TheOther
    }
}
