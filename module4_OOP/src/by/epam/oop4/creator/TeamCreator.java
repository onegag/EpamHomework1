package by.epam.oop4.creator;

import by.epam.oop4.entity.Team;
import by.epam.oop4.exception.*;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;

public class TeamCreator {
    private File file;
    PathValidator pathValid = new PathValidator();
    List<String> lines;


    public File setFile(InputStream inputStream) {


        Scanner scanner = new Scanner(inputStream);
        do {
            System.out.println("Enter path");
            file = new File(scanner.next());

        } while (!pathValid.check(file));
        try {
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }

    public File setFile(String filepath) throws WrongFilePathException {
        file = new File(filepath);
        if (pathValid.check(file)) {
            return file;
        } else {
            throw new WrongFilePathException();
        }
    }

    public List<String> takeLine() throws WrongFileDataException {

        try {
            lines = Files.readAllLines(file.toPath());
            return lines;
        } catch (IOException e) {
            throw new WrongFileDataException();

        }
    }

    public Team collectTeam() {
        EmployeeFactory employeeFactory = new EmployeeFactory();
        Team team = new Team();
        for (String line : lines) {
            try {
                team.addEmployee(employeeFactory.create(line));
            } catch (WrongEmployeeFormatException e) {
                e.printStackTrace();
            }
        }
        return team;
    }


}
