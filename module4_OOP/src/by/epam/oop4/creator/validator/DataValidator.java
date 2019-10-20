package by.epam.oop4.creator.validator;

import java.util.List;

public interface DataValidator {
     boolean[] check(List<String> fields);
     boolean[] checkWithMassage(List<String> fields);

}
