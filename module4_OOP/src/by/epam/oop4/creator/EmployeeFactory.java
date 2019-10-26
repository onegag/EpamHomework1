package by.epam.oop4.creator;

import by.epam.oop4.creator.creatorimpl.DeveloperCreator;
import by.epam.oop4.creator.creatorimpl.ProjectManagerCreator;
import by.epam.oop4.creator.creatorimpl.TesterCreator;
import by.epam.oop4.creator.validatorimpl.DeveloperValidator;
import by.epam.oop4.creator.validatorimpl.ProjectManagerValidator;
import by.epam.oop4.creator.validatorimpl.TesterValidator;
import by.epam.oop4.entity.employee.Employee;
import by.epam.oop4.exception.WrongEmployeeFormatException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


 class EmployeeFactory {

    public static final String REGEX_DELIMITER = "\\s+";

    Creator creator;
    List<String> fields = new ArrayList<>();
    Validator validator;


    private void parse(String line) {
        line = line.trim();
        fields = Arrays.asList(line.split(REGEX_DELIMITER));

    }

     Employee choose(String line) throws WrongEmployeeFormatException {
        parse(line);
        if (fields.get(4).equalsIgnoreCase("project")) {
            validator = new ProjectManagerValidator();
            creator = new ProjectManagerCreator();

        } else if (fields.get(4).equalsIgnoreCase("tester")) {
            validator = new TesterValidator();
            creator = new TesterCreator();


        } else if (fields.get(4).equalsIgnoreCase("developer")) {
            validator = new DeveloperValidator();
            creator = new DeveloperCreator();
        } else {
            throw new WrongEmployeeFormatException();
        }

        if (validator.check(fields)[4]) {
            return creator.create(fields);
        } else throw new WrongEmployeeFormatException();

    }


}
