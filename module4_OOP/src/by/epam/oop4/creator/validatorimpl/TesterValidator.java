package by.epam.oop4.creator.validatorimpl;

import by.epam.oop4.entity.types.Position;
import by.epam.oop4.entity.types.TesterType;

import java.util.List;


public class TesterValidator extends EmployeeValidator {

    @Override
    public boolean[] check(List<String> fields) {
        boolean[] correctFields = new boolean[fields.size()];


        for (int i = 4; i < fields.size(); i++) {
            switch (i) {
                case 4:
                    super.check(fields);
                    break;
                case 5:
                    correctFields[i] = isInEnum(fields.get(i), TesterType.class);
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


