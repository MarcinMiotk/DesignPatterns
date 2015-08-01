package net.keinesorgen.patterns.bridge.notifications;

import net.keinesorgen.patterns.bridge.notifications.refined.RefinedAbstraction;
import net.keinesorgen.patterns.bridge.notifications.sending.SendingMessage;
import net.keinesorgen.patterns.bridge.notifications.sending.mms.MmsSendingAbstractFactory;
import net.keinesorgen.patterns.bridge.notifications.storing.StoringRecord;
import net.keinesorgen.patterns.bridge.notifications.storing.database.DatabaseStoringAbstractFactory;
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
     * Test of send method, of class Abstraction.
     */
    @Test
    public void testSend() {
        System.out.println("send");
        
        // should be configured at runtime instead of compile time
        Abstraction instance = new RefinedAbstraction(new MmsSendingAbstractFactory(), new DatabaseStoringAbstractFactory());

        String phone = "Sample message body";
        String message = "Sample message body";
        String expResult = "Database+Mms";
        String result = instance.send(phone, message);
        assertEquals(expResult, result);
    }
    
    

}
