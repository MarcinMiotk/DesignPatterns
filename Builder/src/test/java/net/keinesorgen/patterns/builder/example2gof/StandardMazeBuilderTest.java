package net.keinesorgen.patterns.builder.example2gof;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 */
public class StandardMazeBuilderTest {

    public StandardMazeBuilderTest() {
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
     * Test of buildMaze method, of class StandardMazeBuilder.
     */
    @Test
    public void testBuildMaze() {
        StandardMazeBuilder builder = new StandardMazeBuilder();
        builder.buildMaze();
        builder.buildRoom(1);
        builder.buildRoom(2);
        builder.buildRoom(3);
        builder.buildDoor(1, 2);
        builder.buildDoor(2, 3);
        Maze maze = builder.getMaze();
        assertEquals(maze.getRommsCount(), 3);
    }

}
