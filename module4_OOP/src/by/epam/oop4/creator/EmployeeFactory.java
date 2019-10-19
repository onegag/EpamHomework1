package by.epam.oop4.creator;

import by.epam.oop4.creator.factory.*;
import by.epam.oop4.entity.types.*;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;


public class EmployeeFactory implements DataParser{

    public static final String REGEX_DELIMITER = "\\s+";

    IEmployeeCreator employeeCreator;
    private Post post;
    private String firstName;
    private String secondName;
    private int Salary;
    private LocalTime startWork;
    private DevLanguage language;
    private TesterType testerType;
    private Position position;
    private int projectsCounter;


    @Override
    public List<String> parse(String line) {
        line=line.trim();
        List<String> fields = Arrays.asList(line.split(REGEX_DELIMITER));
        return fields;

    }

    public void create(){
        switch (post){
            case DEVELOPER:
                employeeCreator = new DeveloperCreator();
                break;
            case TESTER:
                employeeCreator = new ProjectManagerCreator();
                break;
            case PM:
                employeeCreator= new TesterCreator();
                break;
        }
    }


}
