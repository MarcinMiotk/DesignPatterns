package net.keinesorgen.patterns.visitor.tutorial.staff;

import java.util.DoubleSummaryStatistics;

/**
 * @author mmiotk
 * @version 1.0
 * @created 09-sie-2015 13:30:20
 */
public class ProductiveHourVisitor implements Visitor {

    public ProductiveHourVisitor() {

    }

    private final DoubleSummaryStatistics stats = new DoubleSummaryStatistics();

    public DoubleSummaryStatistics getResult() {
        return stats;
    }

    /**
     *
     * @param employee
     */
    public void visit(Employee employee) {
        
        int sumDays = employee.getWorkedDays()+employee.getSickDays()+employee.getVacationDays();
        double normalizedDaySalary = employee.getMonthlySalary()/sumDays;
        double sickDaySalary = normalizedDaySalary*0.8;
        
        double realMonthSalary = sickDaySalary*employee.getSickDays()
                + normalizedDaySalary*(sumDays-employee.getSickDays());
        
        
        double hourSalary = realMonthSalary/sumDays/8;
        System.out.println("employee " + employee.getName() + " has " + hourSalary);
        stats.accept(hourSalary);
    }

    /**
     *
     * @param freelancer
     */
    public void visit(Freelancer freelancer) {
        double hourSalary = freelancer.getHourlySalary();
        System.out.println("freelancer " + freelancer.getName() + " has " + hourSalary);
        stats.accept(hourSalary);
    }

    /**
     *
     * @param manager
     */
    public void visit(Manager manager) {
        double hourSalary = manager.getProject().getProfit() * 0.05 / manager.getProject().getDuration() / 8;
        System.out.println("manager " + manager.getName() + " has " + hourSalary);
        stats.accept(hourSalary);
    }

}
