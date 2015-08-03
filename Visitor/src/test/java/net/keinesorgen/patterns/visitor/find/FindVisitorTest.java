package net.keinesorgen.patterns.visitor.find;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 */
public class FindVisitorTest {

    public FindVisitorTest() {
    }

    MachineComponent create() {
        return new MachineComposite(1,
                new MachineComposite(2, new Machine(3)),
                new MachineComposite(4, new Machine(5)),
                new MachineComposite(6, new Machine(7))
        );
    }

    @Test
    public void testFind() {
        MachineComponent base = create();
        int id = 4;
        FindVisitor instance = new FindVisitor();
        MachineComponent result = instance.find(base, id);
        assertEquals(4, result.getId());
        assertTrue(result instanceof MachineComposite);
        assertEquals(1, ((MachineComposite) result).getComponents().size());
    }
}
