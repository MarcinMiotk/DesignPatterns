package net.keinesorgen.patterns.visitor.find;

/**
 *
 */
class Machine extends MachineComponent {

    public Machine(int id) {
        super(id);
    }
    
    @Override
    void accept(MachineVisitor visitor) {
        visitor.visit(this);
    }
    
}
