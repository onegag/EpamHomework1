package by.epam.oop4.creator.factory;

import by.epam.oop4.entity.employee.Tester;

public class TesterCreator implements IEmployeeCreator{

    @Override
    public Tester create(String[] lineWithInfo) {
        return new Tester();
    }
}
