package net.keinesorgen.patterns.iterator.ea;

/**
 * This class (a) implements the Iterator interface and (b) keeps track of the
 * current position in the traversal of the aggregate.
 *
 * @version 1.0
 * @created 20-sie-2015 21:05:15
 */
class ConcreteIterator extends Iterator {

    private ConcreteAggregate aggregate;

    protected ConcreteIterator() {

    }

    /**
     *
     * @param agg
     */
    ConcreteIterator(ConcreteAggregate agg) {
        aggregate = agg;
    }

    Object CurrentItem() {
        return null;
    }

    Object First() {
        return null;
    }

    boolean IsDone() {
        return false;
    }

    Object Next() {
        return null;
    }

}
