package net.keinesorgen.patterns.iterator.ea;

/**
 * This class defines an interface for creating an Iterator object.
 *
 * @version 1.0
 * @created 20-sie-2015 21:05:15
 */
abstract class Aggregate {

    protected Aggregate() {

    }

    abstract Iterator CreateIterator();
}
