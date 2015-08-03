package net.keinesorgen.patterns.visitor.find;

import java.util.Arrays;
import java.util.List;

/**
 *
 */
class MachineComposite extends MachineComponent {

    private final List<MachineComponent> components;

    public MachineComposite(int id, MachineComponent... childrens) {
        super(id);
        components = Arrays.asList(childrens);
    }

    @Override
    void accept(MachineVisitor visitor) {
        visitor.visit(this);
    }

    List<MachineComponent> getComponents() {
        return components;
    }
}
