package by.epam.oop4.entity.types;

public enum DevLanguage {
    JAVA("java"), PYTHON("python"), JAVASCRIPT("javascript");

    private String language;


    DevLanguage(String language) {

        this.language=language.toLowerCase();
    }


}
