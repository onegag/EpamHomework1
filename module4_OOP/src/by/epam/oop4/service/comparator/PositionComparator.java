package by.epam.oop4.service.comparator;

import by.epam.oop4.entity.employee.Developer;
import by.epam.oop4.entity.employee.Employee;
import by.epam.oop4.entity.employee.ProjectManager;
import by.epam.oop4.entity.employee.Tester;

import java.util.Comparator;

public class PositionComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1 instanceof Developer && o2 instanceof Developer) {
            return ((Developer) o1).getPosition().ordinal() - ((Developer) o2).getPosition().ordinal();
        } else if (o1 instanceof Tester && o2 instanceof Tester) {
            return ((Tester) o1).getPosition().ordinal() - ((Tester) o2).getPosition().ordinal();
        } else if (o1 instanceof ProjectManager && o2 instanceof ProjectManager) {
            return ((ProjectManager) o1).getProjectsCounter() - ((ProjectManager) o2).getProjectsCounter();
        } else {
            return 0;
        }
    }
}
