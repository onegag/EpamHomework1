package by.epam.oop4.creator.validator;

import by.epam.oop4.entity.types.DevLanguage;
import by.epam.oop4.entity.types.Position;


import java.util.List;
import java.util.regex.Pattern;

public class TesterValidator implements DataValidator {

    @Override
    public boolean[] check(List<String> fields) {
        boolean [] correctFields = new boolean[ fields.size()];
        Pattern nameRegex = Pattern.compile("[A-zА-я]+");
        Pattern  salaryRegex = Pattern.compile("\\d+");
        Pattern startWorkRegex = Pattern.compile("\\d{2}[-./]\\d{2}[-./]\\d{2,4}");




        for (int i = 1; i < fields.size() ; i++) {
            switch (i){
                case 1:
                case 2: correctFields[i]=nameRegex.matcher(fields.get(i)).find();
                    break;
                case 3: correctFields[i]=salaryRegex.matcher(fields.get(i)).find();
                    break;
                case 4: correctFields[i]=startWorkRegex.matcher(fields.get(i)).find();
                    break;
                case 5: correctFields[i]= isInEnum(fields.get(i),DevLanguage.class);
                    break;
                case 6: correctFields[i]= isInEnum(fields.get(i), Position.class);
                    break;

            }
            if (!correctFields[i]) correctFields[0]=false;

        }
        return correctFields;

    }

    @Override
    public boolean[] checkWithMassage(List<String> fields) {
        return new boolean[0];
    }

    public <E extends Enum<E>> boolean isInEnum(String value, Class<E> enumClass) {
        for (E e : enumClass.getEnumConstants()) {
            if (e.name().equalsIgnoreCase(value)){
                return true;
            }
        }
        return false;
    }

}


