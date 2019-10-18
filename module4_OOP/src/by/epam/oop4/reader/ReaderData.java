package by.epam.oop4.reader;

import by.epam.oop4.exception.WrongFilePathExeption;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;

public class ReaderData {
    private File file;


    public File setFile(InputStream inputStream) {

        Scanner scanner = new Scanner(inputStream);
        do {
            System.out.println("Enter path");
            file = new File(scanner.next());
        } while (!PathValidator.checkFile(file));
        try {
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }

    public File setFile(String filepath) throws WrongFilePathExeption {
            file = new File(filepath);
            if(PathValidator.checkFile(file)) {
                return file;
            }
            else {
                throw new WrongFilePathExeption();
             }
    }
    public List<String> readFromFile() {

        try {
            return Files.readAllLines(file.toPath());
        } catch (IOException e) {
          e.printStackTrace();
          return null;

        }
    }


}
