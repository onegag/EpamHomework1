package by.epam.oop4.entity;

import by.epam.oop4.entity.employee.Employee;

import java.util.ArrayList;

public class Team extends ArrayList {

    private ArrayList<Employee> employees;

    public Team() {
        employees = new ArrayList<>();
    }

    public Team(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee employee) {

    }


}
