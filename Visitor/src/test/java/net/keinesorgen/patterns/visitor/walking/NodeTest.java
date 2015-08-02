package net.keinesorgen.patterns.visitor.walking;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 */
public class NodeTest {

    public NodeTest() {
    }

    @Test
    public void tester() throws Exception {

        Node root = new Node("root", 5,
                new Node("A", 5, null, null),
                new Node("B", 5,
                        new Node("B1", 3, null, null),
                        new Node("B2", 2, null, null))
        );

        root.accept(new PrintNodeVisitor());
        SumNodeVisitor sum = new SumNodeVisitor();
        root.accept(sum);

        Assert.assertEquals(20, sum.getSum());
    }

}
