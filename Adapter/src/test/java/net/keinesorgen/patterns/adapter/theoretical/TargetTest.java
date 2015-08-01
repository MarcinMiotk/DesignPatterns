package net.keinesorgen.patterns.adapter.theoretical;

import net.keinesorgen.patterns.adapter.theoretical.foreign.Adaptee;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 */
public class TargetTest {

    public TargetTest() {
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
     * Client
     *
     * collaborates with objects conforming to the Target interface.
     */
    @Test
    public void testRequest() {
        Target instance = new Adapter(new Adaptee());
        instance.request();
    }

}
