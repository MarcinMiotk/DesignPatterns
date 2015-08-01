package net.keinesorgen.patterns.adapter.theoretical;

import net.keinesorgen.patterns.adapter.theoretical.foreign.Adaptee;

/**
 * adapts the interface of Adaptee to the Target interface.
 */
public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }

}
