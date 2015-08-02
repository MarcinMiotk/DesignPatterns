package net.keinesorgen.patterns.visitor.expressions;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 */
public class PrintVisitorTest {

    public PrintVisitorTest() {
    }

    @Test
    public void test() {

        PlusExpr expression = new PlusExpr(
                new PlusExpr(
                        new PlusExpr(new NumberExpr(4), new NumberExpr(1)),
                        new NumberExpr(2)),
                new NumberExpr(5));
        
        PrintVisitor printer = new PrintVisitor();
        printer.visit(expression);
        
        assertEquals("4 + 1 + 2 + 5", printer.getPrinted());
        
    }

}
