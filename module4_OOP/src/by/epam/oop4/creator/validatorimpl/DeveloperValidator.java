package by.epam.oop4.creator.validatorimpl;

import by.epam.oop4.entity.types.DevLanguage;
import by.epam.oop4.entity.types.Position;

import java.util.List;

public class DeveloperValidator extends EmployeeValidator {
    @Override
    public boolean[] check(List<String> fields) {
        boolean[] correctFields = new boolean[fields.size()];


        for (int i = 4; i < fields.size(); i++) {
            switch (i) {
                case 4:
                    super.check(fields);
                    break;
                case 5:
                    correctFields[i] = isInEnum(fields.get(i), DevLanguage.class);
                    break;
                case 6:
                    correctFields[i] = isInEnum(fields.get(i), Position.class);
                    break;

            }
            if (!correctFields[i]) correctFields[4] = false;

        }
        return correctFields;
    }


}
