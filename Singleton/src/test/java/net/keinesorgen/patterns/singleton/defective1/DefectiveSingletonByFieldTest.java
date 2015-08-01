package net.keinesorgen.patterns.singleton.defective1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 */
public class DefectiveSingletonByFieldTest {

    public DefectiveSingletonByFieldTest() {
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
     * Test of doSth method, of class DefectiveSingleton.
     */
    @Test
    public void testDoSth() {
        DefectiveSingletonByField instance1 = DefectiveSingletonByField.INSTANCE;
        long first = instance1.doSth();

        DefectiveSingletonByField instance2 = DefectiveSingletonByField.INSTANCE;
        long second = instance2.doSth();

        assertEquals(first, second);

        // attention
        // I hack this singleton...
        try {
            Constructor[] constructors = DefectiveSingletonByField.class.getDeclaredConstructors();
            System.out.println("constructors.length: " + constructors.length);
            for (Constructor candidate : constructors) {
                System.out.println("constructor candidate: " + candidate + ", modifiers " + candidate.getModifiers());
                // constructor is private but I can change accesibility by reflection!
                candidate.setAccessible(true);
                DefectiveSingletonByField hacked = (DefectiveSingletonByField) candidate.newInstance();
                long third = hacked.doSth();
                assertFalse("I've hacked it!", first == third);
            }
        } catch (SecurityException ex) {
            fail(ex.getMessage());
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            fail("Reflect tried to create instance." + ex.getMessage());
        }
    }
}
