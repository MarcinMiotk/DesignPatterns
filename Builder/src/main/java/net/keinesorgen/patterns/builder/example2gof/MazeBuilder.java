package net.keinesorgen.patterns.builder.example2gof;

/**
 *
 */
abstract class MazeBuilder {

    abstract void buildMaze();

    abstract void buildRoom(int room);

    abstract void buildDoor(int roomFrom, int roomTo);

    protected Maze maze;

    public final Maze getMaze() {
        return maze;
    }
}
