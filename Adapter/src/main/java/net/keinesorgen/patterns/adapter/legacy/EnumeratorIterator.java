package net.keinesorgen.patterns.adapter.legacy;

import net.keinesorgen.patterns.adapter.legacy.old.Enumerator;

/**
 * Adapter participant of Adapter
 */
public class EnumeratorIterator implements Iterator {

    private final Enumerator adaptee;

    public EnumeratorIterator(Enumerator adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public boolean hasNext() {
        return adaptee.hasMoreElements();
    }

    @Override
    public String next() {
        return adaptee.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
