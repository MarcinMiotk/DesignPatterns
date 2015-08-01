package net.keinesorgen.patterns.visitor.example2gof;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 */
public class PricingVisitorTest {

    public PricingVisitorTest() {
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

    @Test
    public void testVisit_computer() {
        try {
            System.out.println("visit computer");

            Computer computer = new Computer.ComputerBuilder("PC-5600").
                    bus(new Bus("MotherBoard-2333", 400)).
                    card(new Card("GraphicCardOne", 120)).
                    floppy(new FloppyDisc("FloppyA", 100)).
                    build();

            PricingVisitor totalVisitor = new PricingVisitor();
            computer.accept(totalVisitor);
            assertEquals(100 + 120 + 400, totalVisitor.getTotal().getPrice());

            InventoryVisitor inventory = new InventoryVisitor();
            computer.accept(inventory);
            assertEquals("MotherBoard-2333, GraphicCardOne, FloppyA, PC-5600, ", inventory.toString());

        } catch (Computer.ComputerBuilder.ComputerBuildingException ex) {
            fail("Exception while building computer " + ex);
        }
    }

    @Test
    public void testBuilding() {
        try {
            System.out.println("test building computer");

            Computer computer = new Computer.ComputerBuilder("PC-5600").
                    //bus(new Bus("MotherBoard-2333", 400)).
                    card(new Card("GraphicCardOne", 120)).
                    floppy(new FloppyDisc("FloppyA", 100)).
                    build();

            fail("Exception should be occur");
        } catch (Computer.ComputerBuilder.ComputerBuildingException ex) {
            // ok
        }
    }

}
