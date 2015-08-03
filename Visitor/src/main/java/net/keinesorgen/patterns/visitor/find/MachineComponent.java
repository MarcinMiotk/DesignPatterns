package net.keinesorgen.patterns.visitor.find;

/**
 *
 */
abstract class MachineComponent {

    private int id;

    public MachineComponent(int id) {
        this.id = id;
    }

    abstract void accept(MachineVisitor visitor);

    int getId() {
        return id;
    }
}
