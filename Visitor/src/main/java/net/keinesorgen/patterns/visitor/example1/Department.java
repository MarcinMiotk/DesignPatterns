package net.keinesorgen.patterns.visitor.example1;

/**
 *
 */
public class Department implements VisitableUnit {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitDepartment(this);
    }

}
