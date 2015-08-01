package net.keinesorgen.patterns.bridge.theoretical.abs1;

import net.keinesorgen.patterns.bridge.theoretical.Abstraction;
import net.keinesorgen.patterns.bridge.theoretical.imp.Implementor;

/**
 *
 */
public class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(Implementor bridged) {
        super(bridged);
    }

    @Override
    public void operation() {
        hiddenOperationOne();
        super.operation();
        hiddenOperationTwo();
    }

    private void hiddenOperationOne() {
        System.out.println("Called hidden opeation number one");
    }

    private void hiddenOperationTwo() {
        System.out.println("Called hidden opeation number two");
    }

}
