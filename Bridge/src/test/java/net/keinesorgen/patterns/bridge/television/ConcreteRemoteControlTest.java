package net.keinesorgen.patterns.bridge.television;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 */
public class ConcreteRemoteControlTest {

    public ConcreteRemoteControlTest() {
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
     * Test of nextChannel method, of class ConcreteRemoteControl.
     */
    @Test
    public void testNextChannel() {
        System.out.println("nextChannel");
        ConcreteRemoteControl instance = new ConcreteRemoteControl();
        try {
            instance.nextChannel();
            fail("It shoudn't be reachable");
        } catch (NullPointerException npe) {
            // ignore
        }
        instance.setImplementor(new PhilipsTv());
        instance.nextChannel();
        instance.nextChannel();
        instance.setImplementor(new SonyTv());
        instance.prevChannel();
    }

}
