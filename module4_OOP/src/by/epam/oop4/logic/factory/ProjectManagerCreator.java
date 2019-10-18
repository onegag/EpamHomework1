package by.epam.oop4.logic.factory;

import by.epam.oop4.entity.employee.ProjectManager;

public class ProjectManagerCreator implements IEmployeeCreator {
    @Override

    public ProjectManager create(String[] lineWithInfo) {
        return new ProjectManager();
    }
}
