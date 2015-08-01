package net.keinesorgen.patterns.memento.example2;

import java.awt.Color;
import java.util.Random;

/**
 *
 */
public abstract class AbstractCommand implements Command {

    private Memento memento;

    private Random random = new Random();
    protected double width;
    protected double height;
    protected PathCanvas canvas;
    protected Color color;

    public AbstractCommand() {
    }

    public AbstractCommand(PathCanvas canvas, double width,
            double height, Color color) {
        this.width = width;
        this.height = height;
        this.canvas = canvas;
        this.color = color;
    }

    public void execute() {
        this.memento = canvas.getMemento();
        transform();
    }

    abstract protected void transform();

    public void undo() {
        Memento redoMemento = canvas.getMemento();
        canvas.setMemento(memento);
        memento = redoMemento;
    }

    public void redo() {
        Memento undoMemento = canvas.getMemento();
        canvas.setMemento(memento);
        memento = undoMemento;
    }

    protected double random(double max) {
        return random.nextDouble() * max;
    }

}
