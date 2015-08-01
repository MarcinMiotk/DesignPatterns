package net.keinesorgen.patterns.builder.example2gof;

/**
 *
 */
public class StandardMazeBuilder extends MazeBuilder {

    @Override
    void buildMaze() {
        maze = new Maze();
    }

    @Override
    void buildRoom(int number) {
        Room room = new Room(number);
        maze.addRoom(room);
        room.setSide(Side.WEST, new Wall());
        room.setSide(Side.SOUTH, new Wall());
        room.setSide(Side.EAST, new Wall());
        room.setSide(Side.NORTH, new Wall());
    }

    @Override
    void buildDoor(int roomFrom, int roomTo) {
        Room rFrom = maze.getRoom(roomFrom);
        Room rTo = maze.getRoom(roomTo);
        Door door = new Door(rFrom, rTo);
        rFrom.setSide(commonWall(rFrom, rTo), door);
        rTo.setSide(commonWall(rTo, rFrom), door);
    }

    Side commonWall(Room rFrom, Room rTo) {        
        return Side.NORTH;
    }
}
