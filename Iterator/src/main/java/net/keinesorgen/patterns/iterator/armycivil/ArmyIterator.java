package net.keinesorgen.patterns.iterator.armycivil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 */
public class ArmyIterator implements Iterator<Person> {

    private final ArmyAggregate army;

    private final List<Army> imported = new ArrayList<>();

    private int index = 0;

    public ArmyIterator(ArmyAggregate army) {
        this.army = army;
        imported.addAll(army.getCollection());

        Collections.sort(imported, (Army t1, Army t2) -> t1.getRank() - t2.getRank());
    }

    @Override
    public boolean hasNext() {
        return index < imported.size();
    }

    @Override
    public Person next() {
        Army civil = imported.get(index);
        index++;
        return civil;
    }

}
