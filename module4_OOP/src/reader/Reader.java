package reader;

import java.io.*;

public class Reader {
    public static File read(String filePath){
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null; //заглушка
    }
}
