package exercise_refactored;

import java.io.IOException;
import java.util.Base64;

public class EncodingModule {
    private DataReader dataReader;
    private DataWriter dataWriter;

    public EncodingModule(DataReader dataReader, DataWriter dataWriter) {
        this.dataReader = dataReader;
        this.dataWriter = dataWriter;
    }

    public void encode() throws IOException {
        String inputString = dataReader.read();
        String encodedString = Base64.getEncoder().encodeToString(inputString.getBytes());
        dataWriter.write(encodedString);
    }
}