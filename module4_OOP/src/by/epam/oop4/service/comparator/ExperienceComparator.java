package by.epam.oop4.service.comparator;

import by.epam.oop4.entity.employee.Employee;

import java.util.Comparator;

public class ExperienceComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return (int) (o1.experience() - o2.experience());
    }
}
