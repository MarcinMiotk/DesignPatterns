package net.keinesorgen.patterns.builder.example2gof;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class Maze {

    private final Map<Integer, Room> rooms = new HashMap<>();

    protected void addRoom(Room room) {
        rooms.put(room.getNumber(), room);
    }

    protected Room getRoom(Integer number) {
        return rooms.get(number);
    }
    
    public int getRommsCount() {
        return rooms.size();
    }
}
