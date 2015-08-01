package net.keinesorgen.patterns.singleton.defective1;

import java.io.Serializable;
import java.util.Random;

/**
 * If singleton is serializable, we should override readResolve
 */
public class DefectiveSerializableSingleton implements Serializable {

    public static final DefectiveSerializableSingleton INSTANCE = new DefectiveSerializableSingleton();

    private final long random;

    /**
     * Note. Private method is defective!
     */
    private DefectiveSerializableSingleton() {
        random = new Random().nextLong();
        System.out.println("Used constructor " + random);
    }

    public long doSth() {
        System.out.println("Do something " + random);
        return random;
    }

//    You should override readResolve method to control deserialization process
//    private Object readResolve() {
//        System.out.println("Executing readResolve " + random);
//        return INSTANCE;
//    }
}
