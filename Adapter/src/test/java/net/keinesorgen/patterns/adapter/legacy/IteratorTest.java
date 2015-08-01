package net.keinesorgen.patterns.adapter.legacy;

import net.keinesorgen.patterns.adapter.legacy.old.Enumerator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 */
public class IteratorTest {

    public IteratorTest() {
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
     * Test of next method, of class Iterator.
     *
     *
     * Client participant of Adapter
     */
    @Test
    public void testNext() {
        Iterator instance = new EnumeratorIterator(new Enumerator() {

            @Override
            public boolean hasMoreElements() {
                return true;
            }

            @Override
            public String nextElement() {
                return "Martin's test";
            }
        });
        String expResult = "Martin's test";
        String result = instance.next();
        assertEquals(expResult, result);
    }

}
