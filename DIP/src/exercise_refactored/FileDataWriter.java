package exercise_refactored;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileDataWriter implements DataWriter {
    private String fileName;

    public FileDataWriter(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void write(String data) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        writer.append(data);
        writer.close();
    }
}