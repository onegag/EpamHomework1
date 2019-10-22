package by.epam.oop4.creator;

import by.epam.oop4.entity.employee.Employee;

import java.util.List;

public interface Creator {

    Employee create(List<String> fields);
}
