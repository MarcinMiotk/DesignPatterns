package net.keinesorgen.patterns.memento.example1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
class Caretaker {

    private final List<Memento> savedStates = new ArrayList<>();

    void addMemento(Memento m) {
        savedStates.add(m);
    }

    Memento getMemento(int index) {
        return savedStates.get(index);
    }
}
