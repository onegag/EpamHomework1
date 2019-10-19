package by.epam.oop4.creator.factory;


import by.epam.oop4.entity.employee.Developer;

public class DeveloperCreator implements IEmployeeCreator {

    @Override
    public Developer create(String[] lineWithInfo) {
        return new Developer();
    }
}
