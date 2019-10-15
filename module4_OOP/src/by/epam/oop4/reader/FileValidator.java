package by.epam.oop4.reader;

import java.io.File;

public class FileValidator {
    public static boolean checkFile(File file) {
        if (!file.exists() || file.isDirectory()) {
            System.out.println("Wrong path " + file.toString());
            return false;
        } else if (file.length() == 0) {
            System.out.println("File " + file + " is empty");
            return false;
        } else return true;
    }
}
