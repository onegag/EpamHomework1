package by.epam.oop4.entity.employee;

import by.epam.oop4.entity.types.Position;
import by.epam.oop4.entity.types.TesterType;

public class Tester extends Employee {
    private TesterType testerType;
    private Position position;


    public Tester() {
    }

    public TesterType getTesterType() {
        return testerType;
    }

    public void setTesterType(TesterType testerType) {
        this.testerType = testerType;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Tester{" +

                ", EmployeeId=" + EmployeeId +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", salary=" + salary +
                ", startWork=" + startWork +
                "testerType=" + testerType +
                ", position=" + position +
                '}';
    }
}
