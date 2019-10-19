package by.epam.oop4.creator.factory;

import by.epam.oop4.entity.employee.Employee;

public interface IEmployeeCreator {
    Employee create(String[] lineWithInfo);
}
