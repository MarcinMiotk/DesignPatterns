package net.keinesorgen.patterns.memento.example2;

import java.util.List;

/**
 *
 */
public class Memento {

    private List<ColoredPath> paths;

    public Memento(List<ColoredPath> paths) {
        this.paths = paths;
    }

    public List<ColoredPath> getPaths() {
        return paths;
    }
}
