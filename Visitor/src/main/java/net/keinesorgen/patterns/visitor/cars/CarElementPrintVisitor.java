package net.keinesorgen.patterns.visitor.cars;

/**
 * This class implements each operation declared by Visitor. Each operation
 * implements a fragment of the algorithm defined for the corresponding class of
 * object in the structure. ConcreteVisitor provides the context for the
 * algorithm and stores its local state. This state often accumulates results
 * during the traversal of the structure.
 *
 * @version 1.0
 * @created 02-sie-2015 09:22:06
 */
public class CarElementPrintVisitor extends CarElementVisitor {

    public CarElementPrintVisitor() {

    }

    public void finalize() throws Throwable {
        super.finalize();
    }

    /**
     *
     * @param carElement
     */
    public void VisitBody(Body carElement) {
        System.out.println("PRINT operation on " + carElement);
    }

    /**
     *
     * @param carElement
     */
    public void VisitEngine(Engine carElement) {
        System.out.println("PRINT operation on " + carElement);
    }

    /**
     *
     * @param carElement
     */
    public void VisitWhell(Whell carElement) {
        System.out.println("PRINT operation on " + carElement);
    }

}
