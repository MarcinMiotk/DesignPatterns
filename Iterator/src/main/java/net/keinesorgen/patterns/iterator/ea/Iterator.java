package net.keinesorgen.patterns.iterator.ea;

/**
 * This class defines an interface for accessing and traversing elements.
 *
 * @version 1.0
 * @created 20-sie-2015 21:05:15
 */
abstract class Iterator {

    Iterator() {

    }

    abstract Object CurrentItem();

    abstract Object First();

    abstract boolean IsDone();

    abstract Object Next();

}
