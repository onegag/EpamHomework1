package by.epam.oop4.creator.creatorimpl;

import by.epam.oop4.entity.employee.Employee;
import by.epam.oop4.entity.employee.ProjectManager;

import java.util.List;

public class ProjectManagerCreator extends EmployeeCreator {
    @Override

    public Employee create(List<String> fields) {
        ProjectManager projectManager = new ProjectManager();
        setCommonFields(fields, projectManager);
        projectManager.setProjectsCounter(Integer.parseInt(fields.get(6)));
        return projectManager;
    }
}
