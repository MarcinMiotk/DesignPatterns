package net.keinesorgen.patterns.adapter.theoretical.foreign;

/**
 * defines an existing interface that needs adapting
 */
public class Adaptee {

    public void specificRequest() {
        System.out.println("called some activity of fixed and foreign system. We cannot affect on that system");
    }
}
