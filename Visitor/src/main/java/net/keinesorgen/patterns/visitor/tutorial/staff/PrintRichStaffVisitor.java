package net.keinesorgen.patterns.visitor.tutorial.staff;

/**
 * @author mmiotk
 * @version 1.0
 * @created 09-sie-2015 13:57:25
 */
public class PrintRichStaffVisitor implements Visitor {

    private final double minimumSalary;

    public PrintRichStaffVisitor(double minimumSalary) {
        this.minimumSalary = minimumSalary;
    }

    private double hourSalary(Visitable visitable) {
        ProductiveHourVisitor calculate = new ProductiveHourVisitor();
        visitable.accept(calculate);
        double hourSalary = calculate.getResult().getAverage();
        return hourSalary;
    }

    /**
     *
     * @param employee
     */
    @Override
    public void visit(Employee employee) {
        if (minimumSalary <= hourSalary(employee)) {
            System.out.println("Employee " + employee.getName() + " is rich");
        }
    }

    /**
     *
     * @param freelancer
     */
    @Override
    public void visit(Freelancer freelancer) {
        if (minimumSalary <= hourSalary(freelancer)) {
            System.out.println("Freelancer " + freelancer.getName() + " is rich");
        }
    }

    /**
     *
     * @param manager
     */
    @Override
    public void visit(Manager manager) {
        if (minimumSalary <= hourSalary(manager)) {
            System.out.println("Manager " + manager.getName() + " is rich");
        }
    }

}
