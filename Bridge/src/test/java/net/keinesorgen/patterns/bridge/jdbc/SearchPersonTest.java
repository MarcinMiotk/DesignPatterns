package net.keinesorgen.patterns.bridge.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 */
public class SearchPersonTest {

    public SearchPersonTest() {
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
     * Test of mostImportant method, of class SearchPerson.
     */
    @Test
    public void testMostImportant() throws Exception {
        System.out.println("mostImportant");
        DriverManager.registerDriver(new FunnyDriver());
        Connection connection = DriverManager.getConnection("memory://path/");
        SearchPerson instance = new SearchPerson();
        String result = instance.mostImportant(connection);
        connection.close();
        assertEquals(result, "bridge in jdbc");
    }

}
