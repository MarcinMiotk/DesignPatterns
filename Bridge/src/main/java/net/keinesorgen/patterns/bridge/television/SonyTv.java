package net.keinesorgen.patterns.bridge.television;

/**
 * Concrete Implementor no 1
 */
public class SonyTv implements Tv {

    @Override
    public void on() {
        System.out.println("Sony on");
    }

    @Override
    public void off() {
        System.out.println("Sony off");
    }

    @Override
    public void tuneChannel(int channel) {
        System.out.println("Sony got tune request to channel " + channel);
    }

}
