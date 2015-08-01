package net.keinesorgen.patterns.bridge.questions;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 */
public class QuestionFormatTest {

    public QuestionFormatTest() {
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
     * Test of displayAll method, of class QuestionFormat.
     */
    @Test
    public void testDisplayAll() {
        QuestionManager questions = new QuestionFormat("Java Programming Language", new JavaQuestions());
        questions.delete("what is class?");
        questions.display();
        questions.newOne("What is inheritance? ");
        questions.newOne("How many types of inheritance are there in java?");
        questions.displayAll();
    }

}
