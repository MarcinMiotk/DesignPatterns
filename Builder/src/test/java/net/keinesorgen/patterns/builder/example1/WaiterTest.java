package net.keinesorgen.patterns.builder.example1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 */
public class WaiterTest {

    public WaiterTest() {
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
     * Test of constructPizza method, of class Waiter.
     */
    @Test
    public void testConstructPizza() {

        Waiter director = new Waiter();

        PizzaBuilder spicy = new SpicyPizzaBuilder();
        director.setPizzaBuilder(spicy);
        director.constructPizza();
        Pizza pizza1 = director.getPizza();
        assertEquals(pizza1.getTopping(), "pepperoni+salami");

        PizzaBuilder hawaiian = new HawaiianPizzaBuilder();
        director.setPizzaBuilder(hawaiian);
        director.constructPizza();
        Pizza pizza2 = director.getPizza();
        assertEquals(pizza2.getTopping(), "ham+pineapple");

    }

}
