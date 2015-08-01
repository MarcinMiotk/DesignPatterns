package net.keinesorgen.patterns.singleton.defective1;

import java.util.Random;

/**
 *
 */
public class DefectiveSingletonByField {

    public static final DefectiveSingletonByField INSTANCE = new DefectiveSingletonByField();

    private final long random;

    /**
     * Note. Private method is defective!
     */
    private DefectiveSingletonByField() {
        random = new Random().nextLong();
    }

    public long doSth() {
        System.out.println("Do something " + random);
        return random;
    }
}
