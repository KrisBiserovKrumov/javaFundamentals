package FirstExersice.FunctionalProgramming.STREAMSFILESANDDIRECTORIES.FilesAndStreamsLAB;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        String path = "C:\\Users\\Admin\\Desktop\\SOFTUNI\\JavaFundamentals" +
                "\\STREAMS,FILESANDDIRECTORIES\\04. Java-Advanced-Files-and-Streams-Lab-Resources" +
                "\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\newoutput.txt";
        try {
            FileOutputStream outputStream = new FileOutputStream(path);
            outputStream.write(65);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
