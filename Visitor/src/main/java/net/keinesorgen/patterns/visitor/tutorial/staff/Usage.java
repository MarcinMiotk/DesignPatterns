package net.keinesorgen.patterns.visitor.tutorial.staff;

import java.util.HashSet;
import java.util.Set;

/**
 *
 */
public class Usage {

    Set<Visitable> fromDatabase() {
        Set<Visitable> result = new HashSet<>();

        result.add(new Employee(1000, 2, 13, 7, "Martin"));
        result.add(new Employee(1500, 0, 3, 18, "Carl"));
        result.add(new Freelancer(25, 160, "Pavel"));
        result.add(new Manager(new Project(1500000, 60), "Sebastian"));

        return result;
    }

    public static void main(String[] args) {
        Usage usage = new Usage();
        Set<Visitable> staff = usage.fromDatabase();

        ProductiveHourVisitor visitor = new ProductiveHourVisitor();
        for (Visitable visited : staff) {
            visited.accept(visitor);
        }

        System.out.println("Stats=" + visitor.getResult());

        PrintRichStaffVisitor richStaffVisitor = new PrintRichStaffVisitor(15);
        for (Visitable visited : staff) {
            visited.accept(richStaffVisitor);
        }        
        
        
    }

}
