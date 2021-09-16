package FirstExersice.FunctionalProgramming.STREAMSFILESANDDIRECTORIES.FilesAndStreamsLAB;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) throws IOException {
        String basePath = "C:\\Users\\Admin\\Desktop\\SOFTUNI\\JavaFundamentals\\" +
                "STREAMS,FILESANDDIRECTORIES\\04. Java-Advanced-Files-and-Streams-Lab-Resources" +
                "\\04. Java-Advanced-Files-and-Streams-Lab-Resources";
        String inputPath = basePath + "\\input.txt";
        String outPath = basePath + "\\outPath.txt";

        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(inputPath);
            outputStream = new FileOutputStream(outPath);

            int byteData = inputStream.read();

            while (byteData >= 0){

                if (byteData == ' ' || byteData == '\n') {


                    outputStream.write(byteData);
                }else {
                    String number = String.valueOf(byteData);
                    for (int i = 0; i < number.length(); i++) {
                        outputStream.write(number.charAt(i));
                    }
                }
                byteData = inputStream.read();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (inputStream != null){
                inputStream.close();
            }if (outputStream != null){
                outputStream.close();
            }
        }
    }
}
