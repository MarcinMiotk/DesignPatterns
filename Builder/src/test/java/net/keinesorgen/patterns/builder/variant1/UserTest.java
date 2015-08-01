package net.keinesorgen.patterns.builder.variant1;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 */
public class UserTest {

    public UserTest() {
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
     * Test of Builder method, of class User.
     */
    @Test
    public void testBuilder() {

        try {
            User user = User.Builder("Martin", "Miotk").
                    setAddress("Cracow").
                    setAge(300).
                    setPhone("777").
                    build();
            Assert.fail("Exception should be thrown because age is out of range");
        } catch (UserStateException ex) {
            // do nothing
        }
        try {
            User user = User.Builder("Martin", "Miotk").
                    setAddress("Cracow").
                    setAge(30).
                    setPhone("777").
                    build();
            Assert.assertEquals(user.getAge(), 30);
        } catch (UserStateException ex) {
            Assert.fail("This exception should not occur.");
        }
        try {
            User user = User.Builder("Martin", "Miotk").
                    setAddress("Cracow").
                    setAge(30).
                    setPhone("777").
                    setChildrens("Karol", "Agata", "Tom").
                    build();
            Assert.assertEquals(user.getAge(), 30);
            Assert.assertEquals(user.getChildrens().length, 3);
        } catch (UserStateException ex) {
            Assert.fail("This exception should not occur.");
        }
    }

}
