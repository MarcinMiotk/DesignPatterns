package net.keinesorgen.patterns.memento.example2;

import java.awt.Graphics2D;
import java.awt.geom.Area;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 *
 */
public class PathCanvas extends Observable implements
        MementoOriginator {

    private List<ColoredPath> paths
            = new ArrayList<ColoredPath>();

    public List<ColoredPath> paths() {
        return paths;
    }

    public void add(ColoredPath path) {
        paths.add(path);
        changed();
    }

    public void displayOn(Graphics2D graphics) {
        for (ColoredPath path : paths) {
            Area polygon = new Area(path.getGeneralPath());
            graphics.setColor(path.getColor());
            graphics.fill(polygon);
        }
    }

    public Memento getMemento() {
        List<ColoredPath> pathCopies
                = new ArrayList<ColoredPath>();
        pathCopies.addAll(paths);
        return new Memento(pathCopies);
    }

    @Override
    public void setMemento(Memento memento) {
        paths.clear();
        paths.addAll(memento.getPaths());
        changed();
    }

    private void changed() {
        setChanged();
        notifyObservers();
    }
}
