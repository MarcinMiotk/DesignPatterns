package net.keinesorgen.patterns.memento.example2;

/**
 *
 */
public interface Command {

    void execute();

    void undo();

    void redo();
}
