package net.keinesorgen.patterns.visitor.processcycles;

/**
 *
 */
class ProcessSequence extends ProcessComposite {

    public ProcessSequence(String name, ProcessComponent... sub) {
        super(name, sub);
    }

    @Override
    void accept(ProcessVisitor visitor) {
        visitor.visit(this);
    }

}
