package net.keinesorgen.patterns.visitor.example1;

/**
 *
 */
public class Company implements VisitableUnit {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitCompany(this);
    }

}
