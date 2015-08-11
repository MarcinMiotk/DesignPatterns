package net.keinesorgen.patterns.visitor.tutorial.staff;

public class Freelancer extends Staff implements Visitable {

    private final int hourlySalary;
    private final int workedHours;

    public Freelancer(int hourlySalary, int workedHours, String name) {
        super(name);
        this.hourlySalary = hourlySalary;
        this.workedHours = workedHours;
    }

    public int getHourlySalary() {
        return hourlySalary;
    }

    public int getWorkedHours() {
        return workedHours;
    }

	/**
	 * 
	 * @param visitor
	 */
	public void accept(Visitor visitor){
            visitor.visit(this);
	}
}
