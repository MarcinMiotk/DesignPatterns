package net.keinesorgen.patterns.adapter.legacy;

/**
 * Target participant of Adapter
 */
public interface Iterator {

    boolean hasNext();

    String next();

    void remove();
}
