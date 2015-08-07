package net.keinesorgen.patterns.visitor.processcycles;

/**
 *
 */
abstract class ProcessComponent {

    final String name;

    ProcessComponent(String name) {
        this.name = name;
    }

    abstract void accept(ProcessVisitor visitor);
    
    String getName() {
        return name;
    }
}
