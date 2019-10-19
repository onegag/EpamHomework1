package by.epam.oop4.entity.types;

public enum Position {
    JUNIOR("junior"),
    MIDDLE("middle"),
    SENIOR("senior"),
    LEAD("lead");

    private String position;


    Position(String position) {
        this.position=position.toLowerCase();
    }
}
