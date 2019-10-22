package by.epam.oop4.creator;

import by.epam.oop4.creator.creatorimpl.DeveloperCreator;
import by.epam.oop4.creator.creatorimpl.ProjectManagerCreator;
import by.epam.oop4.creator.creatorimpl.TesterCreator;
import by.epam.oop4.creator.validatorimpl.ProjectManagerValidator;
import by.epam.oop4.creator.validatorimpl.TesterValidator;
import by.epam.oop4.entity.employee.Employee;
import by.epam.oop4.exception.WrongEmployeeFormatException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class EmployeeFactory {

    public static final String REGEX_DELIMITER = "\\s+";

    Creator creator;
    List<String> fields = new ArrayList<>();
    DataValidator dataValidator;


    private void parse(String line) {
        line = line.trim();
        fields = Arrays.asList(line.split(REGEX_DELIMITER));

    }

    public Employee create(String line) throws WrongEmployeeFormatException {
        parse(line);
        if (fields.get(4).equalsIgnoreCase("project")) {
            dataValidator = new ProjectManagerValidator();
            creator = new ProjectManagerCreator();

        } else if (fields.get(4).equalsIgnoreCase("tester")) {
            dataValidator = new TesterValidator();
            creator = new TesterCreator();


        } else if (fields.get(4).equalsIgnoreCase("developer")) {
            dataValidator = new ProjectManagerValidator();
            creator = new DeveloperCreator();
        } else {
            throw new WrongEmployeeFormatException();
        }

        if (dataValidator.check(fields)[4]) {
            return creator.create(fields);
        } else throw new WrongEmployeeFormatException();

    }


}
