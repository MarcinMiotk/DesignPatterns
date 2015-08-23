package net.keinesorgen.patterns.iterator.armycivil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 *
 */
public class CivilIterator implements Iterator<Person> {

    private final CivilAggregate aggregate;
    private final List<Civil> imported = new ArrayList<>();

    private int index = 0;

    CivilIterator(CivilAggregate aThis) {
        aggregate = aThis;

        imported.addAll(aThis.getCollection());

        Collections.sort(imported, (Civil t1, Civil t2) -> t2.getBirthYear() - t1.getBirthYear());

    }

    @Override
    public boolean hasNext() {
        return index < imported.size();
    }

    @Override
    public Person next() {
        Civil civil = imported.get(index);
        index++;
        return civil;
    }

}
