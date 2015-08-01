package net.keinesorgen.patterns.bridge.theoretical.imp.b;

import net.keinesorgen.patterns.bridge.theoretical.imp.Implementor;

/**
 *
 */
public class ConcreteImplementorB implements Implementor {

    @Override
    public void operationImp() {
        final StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        StackTraceElement element = ste[1];
        System.out.println(ConcreteImplementorB.class.getName() + " does " + element.getMethodName());
    }

}
