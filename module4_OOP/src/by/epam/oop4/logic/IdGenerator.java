package by.epam.oop4.logic;

public  class IdGenerator {
    private static final int MAX_ID = 3_000_000;
    private static final int MIN_ID = 1;
    private static int counter;

    public static int generateId() {
        if (++counter > MAX_ID) {
            counter = 1;
        }
        return counter;
    }

    public static void setId(int id) {
        //добавить проверку на пидора
        counter = id;
    }

}
