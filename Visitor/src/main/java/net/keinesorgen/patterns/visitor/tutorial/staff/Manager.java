package net.keinesorgen.patterns.visitor.tutorial.staff;

public class Manager extends Staff implements Visitable {

    private Project project;

    public Manager(Project project, String name) {
        super(name);
        this.project = project;
    }

    public Project getProject() {
        return this.project;
    }

	/**
	 * 
	 * @param visitor
	 */
	public void accept(Visitor visitor){
            visitor.visit(this);
	}
}
