package by.epam.oop4.creator;

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

    public static int assignId(int id) {
        if (id>MIN_ID&&id<MAX_ID){
            return id;
        }
        else {
            System.out.println("Указанное id некорректно. Присвоено значение по умолчанию");
            return generateId();
        }

    }

}
