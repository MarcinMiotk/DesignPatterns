package net.keinesorgen.patterns.iterator.armycivil;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 */
public class ArmyAggregate extends Aggregate<Army> {

    private final List<Army> collection = new ArrayList<>();
    
    @Override
    public Iterator<Person> iterator() {
        return new ArmyIterator(this);
    }

    @Override
    boolean add(Army person) {
        return this.getCollection().add(person);
    }

    /**
     * @return the collection
     */
    protected List<Army> getCollection() {
        return collection;
    }

}
