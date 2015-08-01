package net.keinesorgen.patterns.builder.example2gof;

import java.util.EnumMap;

/**
 *
 */
public class Room {

    private final Integer number;

    private final EnumMap<Side, Wall> walls = new EnumMap<>(Side.class);

    protected Room(Integer number) {
        this.number = number;
    }

    protected void setSide(Side side, Wall wall) {
        walls.put(side, wall);
    }

    /**
     * @return the number
     */
    public Integer getNumber() {
        return number;
    }
}
