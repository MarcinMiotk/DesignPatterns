package net.keinesorgen.patterns.visitor.example1;

/**
 *
 */
public class Team implements VisitableUnit {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTeam(this);
    }

}
