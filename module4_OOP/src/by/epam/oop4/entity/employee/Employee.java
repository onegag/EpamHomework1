package by.epam.oop4.entity.employee;

import java.util.Objects;

public abstract class Employee {

    private double EmployeeId;
    private String firstName;
    private String secondName;

    private int salary;
    private double experience;

    @Override
    public int hashCode() {
        return Objects.hash(EmployeeId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.EmployeeId, EmployeeId) == 0 ;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmployeeId=" + EmployeeId +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", salary=" + salary +
                ", experience=" + experience +
                '}';
    }
//    @Override
//    public String toString() {
//
//        return "Employee "+firstName+" "+secondName+" "+EmployeeId;
//
//    }
}
