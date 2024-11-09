package exercise_refactored;

import java.io.IOException;

public class EncodingModuleClient {
    public static void main(String[] args) throws IOException {
        DataReader fileReader = new FileDataReader("DIP/src/com/directi/training/dip/exercise/beforeEncryption.txt");
        DataWriter fileWriter = new FileDataWriter("DIP/src/com/directi/training/dip/exercise/afterEncryption.txt");
        EncodingModule encodingModule = new EncodingModule(fileReader, fileWriter);
        encodingModule.encode();
    }
}
