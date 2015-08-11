package net.keinesorgen.patterns.visitor.tutorial.staff;

public class Employee extends Staff implements Visitable {

    private final int monthlySalary;
    private final int sickDays;
    private final int vacationDays;
    private final int workedDays;

    public Employee(int monthlySalary, int sickDays, int vacationDays, int workedDays, String name) {
        super(name);
        this.monthlySalary = monthlySalary;
        this.sickDays = sickDays;
        this.vacationDays = vacationDays;
        this.workedDays = workedDays;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public int getSickDays() {
        return sickDays;
    }

    public int getVacationDays() {
        return vacationDays;
    }

    public int getWorkedDays() {
        return workedDays;
    }

	/**
	 * 
	 * @param visitor
	 */
	public void accept(Visitor visitor){
            visitor.visit(this);
	}
}
