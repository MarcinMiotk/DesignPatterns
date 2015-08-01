package net.keinesorgen.patterns.facade.theoretical;

import net.keinesorgen.patterns.facade.theoretical.sub1.Person;
import net.keinesorgen.patterns.facade.theoretical.sub1.SubsystemStoring;
import net.keinesorgen.patterns.facade.theoretical.sub2.SubsystemMessaging;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 */
public class FacadeTest {

    public FacadeTest() {
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
     * Test of easySend method, of class Facade.
     */
    @Test
    public void testEasySend() {
        SubsystemStoring storing = new SubsystemStoring();
        storing.remember(new Person("mmiotk", "+48666666666", 30));
        
        // easy
        Facade instance = new Facade(storing, new SubsystemMessaging());
        instance.easySend("mmiotk", "Hello", "Hello. Sending of message is easy!");
    }
}
