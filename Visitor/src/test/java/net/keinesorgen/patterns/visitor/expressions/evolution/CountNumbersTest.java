package net.keinesorgen.patterns.visitor.expressions.evolution;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 */
public class CountNumbersTest {
    
    public CountNumbersTest() {
    }
    
    @Test
    public void test() {
        
        PlusExpr expression = new PlusExpr(
                new NumberExpr(5),
                new PlusExpr(new NumberExpr(5), new MinusExpr(new NumberExpr(7), new NumberExpr(2)))
        );
        
        Print2Visitor printer = new Print2Visitor();
        printer.visit(expression);
      
        assertEquals("5 + 5 + 7 - 2", printer.getPrinted());
        
      
        CountNumbers counter = new CountNumbers();
        counter.visit(expression);
        assertEquals(4, counter.counter);
        
    }
}
