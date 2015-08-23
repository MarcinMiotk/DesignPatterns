package net.keinesorgen.patterns.iterator.armycivil;

import java.util.Iterator;
import java.util.Stack;

/**
 *
 */
public class CivilAggregate extends Aggregate<Civil> {

    private final Stack<Civil> collection = new Stack<>();

    @Override
    public Iterator<Person> iterator() {
        return new CivilIterator(this);
    }

    @Override
    boolean add(Civil person) {
        this.getCollection().push(person);
        return true;
    }

    /**
     * @return the collection
     */
    protected Stack<Civil> getCollection() {
        return collection;
    }

}
