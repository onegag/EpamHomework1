package by.epam.oop4.creator.validatorimpl;

import java.util.List;
import java.util.regex.Pattern;

public class ProjectManagerValidator extends EmployeeValidator {
    @Override
    public boolean[] check(List<String> fields) {
        boolean[] correctFields = new boolean[fields.size()];
        Pattern counterRegex = Pattern.compile("\\d+");


        for (int i = 4; i < fields.size(); i++) {
            switch (i) {
                case 4:
                    super.check(fields);
                    break;
                case 5:
                    correctFields[i] = fields.get(5).equalsIgnoreCase("manager");
                    break;
                case 6:
                    correctFields[i] = counterRegex.matcher(fields.get(6)).find();
                    break;

            }
            if (!correctFields[i]) correctFields[4] = false;

        }
        return correctFields;
    }

}
