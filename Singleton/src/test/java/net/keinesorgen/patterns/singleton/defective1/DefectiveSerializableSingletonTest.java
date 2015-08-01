package net.keinesorgen.patterns.singleton.defective1;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 */
public class DefectiveSerializableSingletonTest {

    public DefectiveSerializableSingletonTest() {
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
     * Test of doSth method, of class DefectiveSerializableSingleton.
     */
    @Test
    public void testDoSth() throws IOException, ClassNotFoundException {
        DefectiveSerializableSingleton instance1 = DefectiveSerializableSingleton.INSTANCE;

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(instance1);
        byte[] serializedInstance1 = baos.toByteArray();

        System.out.println("serializedInstance1.length: " + serializedInstance1.length);

        // deserialization doesn't use constructor
        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(serializedInstance1));
        DefectiveSerializableSingleton instance2 = (DefectiveSerializableSingleton) ois.readObject();

        assertTrue("The field will be the same", instance1.doSth() == instance2.doSth());

        System.out.println("instance1 " + instance1);
        System.out.println("instance2 " + instance2);
        assertNotSame("But these instances are different ", instance2, instance1);
    }

}
