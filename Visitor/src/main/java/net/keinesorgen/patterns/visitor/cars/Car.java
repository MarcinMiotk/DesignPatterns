package net.keinesorgen.patterns.visitor.cars;

import java.util.*;

/**
 * This class can enumerate its elements, may provide a high-level interface to
 * allow the visitor to visit its elements and may either be a composite or a
 * collection such as a list or a set.
 *
 * @version 1.0
 * @created 02-sie-2015 09:22:06
 */
public class Car {

    private final Vector<CarElement> elements = new Vector<>();

    public Car() {

    }

    public void finalize() throws Throwable {

    }

    /**
     *
     * @param visitor
     */
    public void Accept(CarElementVisitor visitor) {
        for (CarElement e : elements) {
            e.Accept(visitor);
        }
    }

    /**
     *
     * @param element
     */
    public void Attach(CarElement element) {
        elements.addElement(element);
    }

    /**
     *
     * @param element
     */
    public void Detach(CarElement element) {
        elements.removeElement(element);
    }

}
