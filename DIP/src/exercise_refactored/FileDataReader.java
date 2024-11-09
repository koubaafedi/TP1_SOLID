package exercise_refactored;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileDataReader implements DataReader {
    private String fileName;

    public FileDataReader(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String read() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        StringBuilder inputString = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            inputString.append(line);
        }
        reader.close();
        return inputString.toString();
    }
}
