package by.epam.oop4.entity.employee;

import by.epam.oop4.entity.types.DevLanguage;
import by.epam.oop4.entity.types.Position;


public class Developer extends Employee {
    private DevLanguage devLanguage;
    private Position position;


    public Developer() {
        super();
    }

    public DevLanguage getDevLanguage() {
        return devLanguage;
    }

    public void setDevLanguage(DevLanguage devLanguage) {
        this.devLanguage = devLanguage;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

}
