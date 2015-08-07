package net.keinesorgen.patterns.visitor.demos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
class AsComposite {

    interface Component {

        void traverse();
    }

    static class Leaf implements Component {

        private final int number;

        public Leaf(int num) {
            number = num;
        }

        @Override
        public void traverse() {
            System.out.print(number + " ");
        }
    }

    static class Composite implements Component {

        private static char next = 'a';
        private final List children = new ArrayList();
        private final char letter = next++;

        public void add(Component c) {
            children.add(c);
        }

        @Override
        public void traverse() {
            System.out.print(letter + " ");
            for (int i = 0; i < children.size(); i++) {
                ((Component) children.get(i)).traverse();
            }
        }
    }

    public static void main(String[] args) {
        Composite[] containers = new Composite[3];

        for (int i = 0; i < containers.length; i++) {
            containers[i] = new Composite();
            for (int j = 1; j < 4; j++) {
                containers[i].add(new Leaf(i * containers.length + j));
            }
        }

        for (int i = 1; i < containers.length; i++) {
            containers[0].add(containers[i]);
        }

        containers[0].traverse();
        System.out.println();
        
        
        // a 1 2 3 b 4 5 6 c 7 8 9
    }
}
