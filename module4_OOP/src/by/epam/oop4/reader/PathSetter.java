package by.epam.oop4.reader;

import java.io.*;
import java.util.Scanner;

public class PathSetter {
    private boolean access = false;
    private File file;

    public File read(InputStream inputStream) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter path");
            file = new File(scanner.next());
            access = FileValidator.checkFile(file);
        } while (!access);
        return file;
    }


}
