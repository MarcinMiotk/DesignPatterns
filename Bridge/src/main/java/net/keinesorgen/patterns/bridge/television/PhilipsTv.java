package net.keinesorgen.patterns.bridge.television;

/**
 * Concrete Implementor no 2
 */
public class PhilipsTv implements Tv {

    @Override
    public void on() {
        System.out.println("Philips on");
    }

    @Override
    public void off() {
        System.out.println("Philips off");
    }

    @Override
    public void tuneChannel(int channel) {
        System.out.println("Philips got tune request to channel " + channel);
    }

}
