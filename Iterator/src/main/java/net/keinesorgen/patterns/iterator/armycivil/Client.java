package net.keinesorgen.patterns.iterator.armycivil;

import java.util.Iterator;
import java.util.function.Consumer;

/**
 *
 */
public class Client {

    public static void main(String[] args) {

        Aggregate army = new ArmyAggregate();
        army.add(new Army(1));
        army.add(new Army(2));
        army.add(new Army(3));
        Aggregate civil = new CivilAggregate();
        civil.add(new Civil(1966));
        civil.add(new Civil(1962));
        civil.add(new Civil(1969));
        
        army.add(new Civil(2000));      // exception cast

        Iterator<Person> ip = army.iterator();
        ip.forEachRemaining(System.out::println);
        Iterator<Person> ic = civil.iterator();
        ic.forEachRemaining(System.out::println);

    }

}
