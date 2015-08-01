package net.keinesorgen.patterns.memento.example2;

import java.awt.Color;
import java.awt.geom.GeneralPath;

/**
 *
 */
public class ColoredPath {

    private final GeneralPath path;
    private final Color color;

    public ColoredPath(GeneralPath path, Color color) {
        this.path = path;
        this.color = color;
    }

    public GeneralPath getGeneralPath() {
        return path;
    }

    public Color getColor() {
        return color;
    }
}
