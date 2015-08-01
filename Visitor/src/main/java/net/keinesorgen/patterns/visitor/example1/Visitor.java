package net.keinesorgen.patterns.visitor.example1;

/**
 *
 */
public interface Visitor {

    void visitCompany(Company company);

    void visitDepartment(Department department);

    void visitTeam(Team team);
    
    void visitBuilding(Building building);
}
