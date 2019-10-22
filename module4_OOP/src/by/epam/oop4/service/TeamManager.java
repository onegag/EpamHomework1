package by.epam.oop4.service;

import by.epam.oop4.entity.Team;
import by.epam.oop4.entity.employee.Employee;

import java.util.List;

public interface TeamManager {
    double costPerHour(Team team);

    List<Employee> salaryFilter(Team team, int from, int to);

    void sortBySalary(Team team);

    void sortByName(Team team);

    void sortByPositionAndExperience(Team team);


}
