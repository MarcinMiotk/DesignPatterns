package net.keinesorgen.patterns.bridge.theoretical;

import net.keinesorgen.patterns.bridge.theoretical.imp.Implementor;

/**
 *
 */
public abstract class Abstraction {

    private final Implementor bridged;

    protected Abstraction(Implementor bridged) {
        this.bridged = bridged;
    }

    public void operation() {
        bridged.operationImp();
    }
}
