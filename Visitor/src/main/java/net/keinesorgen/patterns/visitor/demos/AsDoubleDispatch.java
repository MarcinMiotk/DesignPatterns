package net.keinesorgen.patterns.visitor.demos;

/**
 *
 */
class AsDoubleDispatch {

    interface Base {

        void processBase(Base secondObject);

        void processA(A firstObject);

        void processB(B firstObject);

        void processC(C firstObject);
    }

    static class A implements Base {

        @Override
        public void processBase(Base second) {
            second.processA(this);
        }

        @Override
        public void processA(A first) {
            System.out.println("first is A, second is A");
        }

        @Override
        public void processB(B first) {
            System.out.println("first is B, second is A");
        }

        @Override
        public void processC(C first) {
            System.out.println("first is C, second is A");
        }
    }

    static class B implements Base {

        @Override
        public void processBase(Base second) {
            second.processB(this);
        }

        @Override
        public void processA(A first) {
            System.out.println("first is A, second is B");
        }

        @Override
        public void processB(B first) {
            System.out.println("first is B, second is B");
        }

        @Override
        public void processC(C first) {
            System.out.println("first is C, second is B");
        }
    }

    static class C implements Base {

        @Override
        public void processBase(Base second) {
            second.processC(this);
        }

        @Override
        public void processA(A first) {
            System.out.println("first is A, second is C");
        }

        @Override
        public void processB(B first) {
            System.out.println("first is B, second is C");
        }

        @Override
        public void processC(C first) {
            System.out.println("first is C, second is C");
        }
    }

    static void process(Base a, Base b) {
        a.processBase(b);
    }

    public static void main(String[] args) {
        Base array[] = {new A(), new B(), new C()};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 3; j++) {
                process(array[i], array[j]);
            }
        }
    }

    // first is A, second is A
    // first is A, second is B
    // first is A, second is C
    // first is B, second is A
    // first is B, second is B
    // first is B, second is C
    // first is C, second is A
    // first is C, second is B
    // first is C, second is C
}
