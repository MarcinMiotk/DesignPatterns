package net.keinesorgen.patterns.memento.example2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.geom.GeneralPath;

/**
 *
 */
public class SquareCommand extends AbstractCommand {

    private static final int SIZE = 12;

    public SquareCommand(PathCanvas canvas, Dimension size,
            Color color) {
        super(canvas, size.getWidth(), size.getHeight(), color);
    }

    @Override
    public void transform() {
        canvas.add(new ColoredPath(createSquare(), color));
    }

    private GeneralPath createSquare() {
        GeneralPath path = new GeneralPath();
        double x = random(width);
        double y = random(height);
        path.moveTo(x, y);
        path.lineTo(x + SIZE, y);
        path.lineTo(x + SIZE, y + SIZE);
        path.lineTo(x, y + SIZE);
        path.lineTo(x, y);
        path.closePath();
        return path;
    }

}
