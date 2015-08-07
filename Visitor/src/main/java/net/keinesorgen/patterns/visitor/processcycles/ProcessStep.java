package net.keinesorgen.patterns.visitor.processcycles;

/**
 *
 */
class ProcessStep extends ProcessComponent {

    public ProcessStep(String name) {
        super(name);
    }

    @Override
    void accept(ProcessVisitor visitor) {
        visitor.visit(this);
    }

}
