package net.keinesorgen.patterns.bridge.television;

/**
 * Implementor
 */
public interface Tv {

    void on();

    void off();

    void tuneChannel(int channel);
}
