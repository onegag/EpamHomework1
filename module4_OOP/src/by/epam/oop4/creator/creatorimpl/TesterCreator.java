package by.epam.oop4.creator.creatorimpl;

import by.epam.oop4.entity.employee.Employee;
import by.epam.oop4.entity.employee.Tester;
import by.epam.oop4.entity.types.Position;
import by.epam.oop4.entity.types.TesterType;

import java.util.List;

public class TesterCreator extends EmployeeCreator {

    @Override
    public Employee create(List<String> fields) {
        Tester tester = new Tester();
        setCommonFields(fields, tester);
        switch (fields.get(5).toLowerCase()) {
            case "functional":
                tester.setTesterType(TesterType.FUNCTIONAL);
                break;
            case "automation":
                tester.setTesterType(TesterType.AUTOMATION);
                break;
        }
        switch (fields.get(6).toLowerCase()) {
            case "junior":
                tester.setPosition(Position.JUNIOR);
            case "middle":
                tester.setPosition(Position.MIDDLE);
            case "senior":
                tester.setPosition(Position.SENIOR);
            case "lead":
                tester.setPosition(Position.LEAD);
        }
        return tester;
    }
}
