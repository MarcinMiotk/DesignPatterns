package net.keinesorgen.patterns.visitor.cars;

import org.junit.Test;

/**
 *
 */
public class CarTest {

    public CarTest() {
    }

    @Test
    public void testVisitor() throws Exception {

        // visitable
        Car car = new Car();
        car.Attach(new Whell());
        car.Attach(new Whell());
        car.Attach(new Whell());
        car.Attach(new Whell());
        car.Attach(new Body());
        car.Attach(new Engine());

        // visiting
        car.Accept(new CarElementDoVisitor());
        car.Accept(new CarElementPrintVisitor());
    }

}
