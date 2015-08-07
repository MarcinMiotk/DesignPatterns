package net.keinesorgen.patterns.visitor.multimethod;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 */
public class FigureFunctionsImplTest {

    public FigureFunctionsImplTest() {
    }

    /**
     * Test of intersect method, of class FigureFunctionsImpl.
     */
    @Test
    public void testIntersect() {
        FigureFunctionsImpl instance = new FigureFunctionsImpl();
        instance.intersect(new Rectangle(), new Rectangle());
        instance.intersect(new Circle(), new Rectangle());
        instance.intersect(new Rectangle(), new Circle());
        instance.intersect(new Circle(), new Circle());
    }

}
