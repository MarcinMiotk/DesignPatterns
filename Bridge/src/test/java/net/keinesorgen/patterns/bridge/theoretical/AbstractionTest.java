package net.keinesorgen.patterns.bridge.theoretical;

import net.keinesorgen.patterns.bridge.theoretical.abs1.RefinedAbstraction;
import net.keinesorgen.patterns.bridge.theoretical.imp.a.ConcreteImplementorA;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 */
public class AbstractionTest {

    public AbstractionTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of operation method, of class Abstraction.
     */
    @Test
    public void testOperation() {
        // note that:
        // abstraction and implementation shoud not be bound at compile time
        Abstraction instance = new RefinedAbstraction(new ConcreteImplementorA());        
        instance.operation();
    }
}
