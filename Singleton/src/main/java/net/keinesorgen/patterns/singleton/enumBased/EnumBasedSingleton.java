package net.keinesorgen.patterns.singleton.enumBased;

import java.util.Random;

/**
 *
 */
public enum EnumBasedSingleton {

    INSTANCE(new Random().nextLong());

    private final long random;

    private EnumBasedSingleton(long random) {
        this.random = random;
    }

    public long doSth() {
        System.out.println("Do something " + random);
        return random;
    }
}
