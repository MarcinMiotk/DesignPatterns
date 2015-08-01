package net.keinesorgen.patterns.memento.example2;

import java.util.LinkedList;

/**
 *
 */
public class CommandStack {

    private LinkedList<Command> commandStack = new LinkedList<>();
    private LinkedList<Command> redoStack = new LinkedList<>();

    public void execute(Command command) {
        command.execute();
        commandStack.addFirst(command);
        redoStack.clear();
    }

    public void undo() {
        if (commandStack.isEmpty()) {
            return;
        }
        Command command = commandStack.removeFirst();
        command.undo();
        redoStack.addFirst(command);
    }

    public void redo() {
        if (redoStack.isEmpty()) {
            return;
        }
        Command command = redoStack.removeFirst();
        command.redo();
        commandStack.addFirst(command);
    }
}
