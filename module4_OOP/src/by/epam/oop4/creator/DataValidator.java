package by.epam.oop4.creator;

import java.util.List;

public interface DataValidator {
     boolean[] check(List<String> fields);
     boolean[] checkWithMassage(List<String> fields);

}
