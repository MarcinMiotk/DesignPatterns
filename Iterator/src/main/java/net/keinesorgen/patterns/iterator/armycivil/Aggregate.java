package net.keinesorgen.patterns.iterator.armycivil;

/**
 *
 * @param <T>
 */
public abstract class Aggregate<T extends Person> implements Iterable<Person> {

    abstract boolean add(T person);
}
