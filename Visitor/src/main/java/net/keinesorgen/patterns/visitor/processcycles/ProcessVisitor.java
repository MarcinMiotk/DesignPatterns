package net.keinesorgen.patterns.visitor.processcycles;

/**
 *
 */
interface ProcessVisitor {

    void visit(ProcessAlternation process);

    void visit(ProcessSequence process);

    void visit(ProcessStep process);
}
