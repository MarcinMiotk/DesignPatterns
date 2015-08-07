package net.keinesorgen.patterns.visitor.processcycles;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 */
public class PrettyVisitor implements ProcessVisitor {

    private StringBuffer buffer;
    private Set<ProcessComponent> visited;

    public static int INDENT_DEPTH = 4;
    private int depth;

    public StringBuffer getPretty(ProcessComponent process) {
        buffer = new StringBuffer();
        visited = new HashSet<>();
        process.accept(this);
        return buffer;
    }

    @Override
    public void visit(ProcessAlternation process) {
        print("Alternation(" + process.getName() + ")", process);
    }

    @Override
    public void visit(ProcessSequence process) {
        print("Sequence(" + process.getName() + ") ", process);
    }

    @Override
    public void visit(ProcessStep process) {
        print(process.getName());
    }

    private void print(String tag, ProcessComposite process) {
        if (visited.contains(process)) {
            print("[duplication]");
        } else {
            visited.add(process);
            print(tag);
            acceptChildren(process);
        }
    }

    private void print(String name) {
        for (int i = 0; i < depth * INDENT_DEPTH; i++) {
            buffer.append(" ");
        }
        buffer.append(name);
        buffer.append("\n");

    }

    private void acceptChildren(ProcessComposite process) {
        {
            Iterator i = process.getSubprocesses().iterator();
            depth++;
            while (i.hasNext()) {
                ((ProcessComponent) i.next()).accept(this);
            }
            depth--;
        }

    }
}
