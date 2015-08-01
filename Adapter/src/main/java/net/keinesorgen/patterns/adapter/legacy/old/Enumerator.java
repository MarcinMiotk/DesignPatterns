package net.keinesorgen.patterns.adapter.legacy.old;

/**
 * Adaptee participant of Adapter
 */
public interface Enumerator {

    boolean hasMoreElements();

    String nextElement();
}
