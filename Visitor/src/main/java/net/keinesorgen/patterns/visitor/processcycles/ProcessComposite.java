package net.keinesorgen.patterns.visitor.processcycles;

import java.util.Arrays;
import java.util.List;

/**
 *
 */
abstract class ProcessComposite extends ProcessComponent {

    private final List<ProcessComponent> subprocesses;

    public ProcessComposite(String name, ProcessComponent... sub) {
        super(name);
        this.subprocesses = Arrays.asList(sub);
    }    

    /**
     * @return the subprocesses
     */
    public List<ProcessComponent> getSubprocesses() {
        return subprocesses;
    }
}
