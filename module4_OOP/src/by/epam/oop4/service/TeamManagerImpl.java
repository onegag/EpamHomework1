package by.epam.oop4.service;

import by.epam.oop4.entity.Team;
import by.epam.oop4.entity.employee.Employee;
import by.epam.oop4.service.comparator.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TeamManagerImpl implements TeamManager {
    ArrayList<Employee> teamMembers;

    @Override
    public double costPerHour(Team team) {
        final double workHoursPerMonth = 160.0;
        double cost = 0;
        teamMembers = team.getAllEmployees();
        for (Employee employee : teamMembers) {
            cost += employee.getSalary() / workHoursPerMonth;
        }
        return cost;
    }

    @Override
    public List<Employee> salaryFilter(Team team, int from, int to) {
        teamMembers = team.getAllEmployees();
        ArrayList<Employee> filtered = new ArrayList<>();
        for (Employee employee : teamMembers) {
            if (employee.getSalary() > from && employee.getSalary() < to) filtered.add(employee);
        }
        return filtered;
    }

    @Override
    public void sortBySalary(Team team) {
        SalaryComparator salaryComparator = new SalaryComparator();
        Collections.sort(team, salaryComparator);
    }

    @Override
    public void sortByName(Team team) {
        Comparator nameComparator = new SecondNameComparator().thenComparing(new FirstNameComparator());
        Collections.sort(team, nameComparator);

    }

    @Override
    public void sortByPositionAndExperience(Team team) {
        Comparator positionAndExperience = new PositionComparator().thenComparing(new ExperienceComparator());
        Collections.sort(team, positionAndExperience);
    }
}
