package net.keinesorgen.patterns.facade.theoretical.sub1;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class SubsystemStoring {

    private Map<Person, Person> people = new HashMap<>();

    public void remember(Person person) {
        people.put(person, person);
    }

    public Person get(String login) {
        return people.get(new Person(login));
    }
}
