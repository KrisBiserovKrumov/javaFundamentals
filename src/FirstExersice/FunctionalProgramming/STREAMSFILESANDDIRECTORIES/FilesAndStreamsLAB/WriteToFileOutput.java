package FirstExersice.FunctionalProgramming.STREAMSFILESANDDIRECTORIES.FilesAndStreamsLAB;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class WriteToFileOutput {
    public static void main(String[] args) throws IOException {
        String basePath = "C:\\Users\\Admin\\Desktop\\SOFTUNI\\JavaFundamentals\\" +
                "STREAMS,FILESANDDIRECTORIES\\04. Java-Advanced-Files-and-Streams-Lab-Resources" +
                "\\04. Java-Advanced-Files-and-Streams-Lab-Resources";
        String inputPath = basePath + "\\input.txt";
        String outPath = basePath + "\\outPath.txt";

        List<Character> punctuation = Arrays.asList(',','.','?','!');

        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(inputPath);
            outputStream = new FileOutputStream(outPath);

            int byteData = inputStream.read();

            while (byteData >= 0){

                if (!punctuation.contains((char)byteData)) {
                    outputStream.write(byteData);
                }
                byteData = inputStream.read();
            }

        } catch (IOException e) {
            //System.out.println(e.getMessage());
            e.printStackTrace();
        }
        finally {
            if (inputStream != null){
                inputStream.close();
            }if (outputStream != null){
                outputStream.close();
            }
        }
    }
}
