package by.epam.oop4.reader;

import java.io.File;

public class PathValidator {
    private static String message;

    public static boolean checkFile(File file) {
        if (file == null || !file.exists() || file.isDirectory()) {
            message = "Wrong path " + file.toString();
            return false;
        } else if (file.length() == 0) {
            message = "File " + file + " is empty";
            return false;
        } else return true;
    }

    public String getMessage() {
        return message;
    }


}
