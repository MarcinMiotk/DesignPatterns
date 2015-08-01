package net.keinesorgen.patterns.singleton.enumBased;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 */
public class EnumBasedSingletonTest {

    public EnumBasedSingletonTest() {
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
     * Test of doSth method, of class EnumBasedSingleton.
     */
    @Test
    public void testDoSth() {
        long first = EnumBasedSingleton.INSTANCE.doSth();
        long second = EnumBasedSingleton.INSTANCE.doSth();
        assertEquals(second, first);
    }

}
