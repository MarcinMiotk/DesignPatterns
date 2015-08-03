package net.keinesorgen.patterns.visitor.find;

/**
 *
 */
interface MachineVisitor {

    void visit(Machine machine);

    void visit(MachineComposite composite);
}
