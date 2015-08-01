package net.keinesorgen.patterns.builder.example2gof;

/**
 *
 */
public class Door extends Wall {

    private final Room rFrom;
    private final Room rTo;

    protected Door(Room rFrom, Room rTo) {
        this.rFrom = rFrom;
        this.rTo = rTo;
    }
}
