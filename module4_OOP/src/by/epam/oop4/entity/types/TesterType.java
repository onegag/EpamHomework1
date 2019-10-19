package by.epam.oop4.entity.types;

public enum TesterType {
    FUNCTIONAL("functional"), AUTOMATION("automation");

    private String type;


    TesterType(String type) {
        this.type=type.toLowerCase();
    }
}
