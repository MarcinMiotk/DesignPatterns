package net.keinesorgen.patterns.visitor.processcycles;

/**
 *
 */
class ProcessAlternation extends ProcessComposite {

    public ProcessAlternation(String name, ProcessComponent... sub) {
        super(name, sub);
    }

    @Override
    void accept(ProcessVisitor visitor) {
        visitor.visit(this);
    }

}
