package net.keinesorgen.patterns.visitor.example1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Building implements VisitableUnit {
    
    private final List<VisitableUnit> sub = new ArrayList<>();
    
    @Override
    public void accept(Visitor visitor) {
        for (VisitableUnit unit : sub) {
            unit.accept(visitor);
        }
        visitor.visitBuilding(this);
    }
    
}
