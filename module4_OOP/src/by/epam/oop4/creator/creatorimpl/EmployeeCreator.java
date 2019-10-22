package by.epam.oop4.creator.creatorimpl;

import by.epam.oop4.creator.Creator;
import by.epam.oop4.entity.employee.Employee;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public abstract class EmployeeCreator implements Creator {
    void setCommonFields(List<String> fields, Employee employee) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        employee.setFirstName(fields.get(0));
        employee.setSecondName(fields.get(1));
        employee.setSalary(Integer.parseInt(fields.get(2)));
        employee.setStartWork(LocalDate.parse(fields.get(3), formatter));
    }


}
