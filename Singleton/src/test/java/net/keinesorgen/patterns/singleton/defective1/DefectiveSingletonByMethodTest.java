package net.keinesorgen.patterns.singleton.defective1;

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
public class DefectiveSingletonByMethodTest {

    public DefectiveSingletonByMethodTest() {
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
     * Test of getInstance method, of class DefectiveSingletonByMethod.
     */
    @Test
    public void testGetInstance() {
        DefectiveSingletonByMethod instance1 = DefectiveSingletonByMethod.getInstance();
        long first = instance1.doSth();

        DefectiveSingletonByMethod instance2 = DefectiveSingletonByMethod.getInstance();
        long second = instance2.doSth();

        assertEquals(first, second);

        // attention
        // I hack this singleton...
        try {
            Constructor[] constructors = DefectiveSingletonByMethod.class.getDeclaredConstructors();
            System.out.println("constructors.length: " + constructors.length);
            for (Constructor candidate : constructors) {
                System.out.println("constructor candidate: " + candidate + ", modifiers " + candidate.getModifiers());
                // constructor is private but I can change accesibility by reflection!
                candidate.setAccessible(true);
                DefectiveSingletonByMethod hacked = (DefectiveSingletonByMethod) candidate.newInstance();
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
