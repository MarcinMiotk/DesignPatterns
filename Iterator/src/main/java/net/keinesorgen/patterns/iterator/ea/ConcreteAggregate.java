package net.keinesorgen.patterns.iterator.ea;

/**
 * This class implements the Iterator creation interface to return an instance
 * of the proper ConcreteIterator.
 *
 * @version 1.0
 * @created 20-sie-2015 21:05:15
 */
class ConcreteAggregate extends Aggregate {

    protected ConcreteAggregate() {

    }

    @Override
    Iterator CreateIterator() {
        return new ConcreteIterator(this);
    }
}
