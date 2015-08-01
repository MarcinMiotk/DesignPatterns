package net.keinesorgen.patterns.singleton.defective1;

import java.util.Random;

/**
 *
 */
public class DefectiveSingletonByMethod {

    // note that it is private
    private static final DefectiveSingletonByMethod INSTANCE = new DefectiveSingletonByMethod();

    private final long random;

    /**
     * Note. Private method is defective!
     */
    private DefectiveSingletonByMethod() {
        random = new Random().nextLong();
    }

    /**
     * Access to this singleton is possible by method. Advantage of this way
     * belongs on that you can fast change type of this class.
     *
     * @return Singleton
     */
    public static DefectiveSingletonByMethod getInstance() {
        return INSTANCE;
    }

    public long doSth() {
        System.out.println("Do something " + random);
        return random;
    }
}
