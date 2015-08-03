package net.keinesorgen.patterns.visitor.find;

import java.util.Iterator;

/**
 *
 */
class FindVisitor implements MachineVisitor {

    private MachineComponent sought;
    private int soughtId;

    MachineComponent find(MachineComponent machine, int id) {
        sought = null;              // reset it
        soughtId = id;
        machine.accept(this);
        return sought;
    }

    @Override
    public void visit(Machine machine) {
        if(sought==null && machine.getId()==soughtId) {
            sought = machine;
        }
    }

    @Override
    public void visit(MachineComposite composite) {
        if(sought == null && composite.getId()==soughtId) {
            sought = composite;
            return;
        }
        Iterator i = composite.getComponents().iterator();
        while(sought == null && i.hasNext()) {
            ((MachineComponent)i.next()).accept(this);
        }
    }

}
