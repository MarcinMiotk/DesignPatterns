package net.keinesorgen.patterns.memento.example1;

/**
 *
 */
class Memento {

    private final String state;

    Memento(String stateToSave) {
        state = stateToSave;
    }

    String getSavedState() {
        return state;
    }
}
