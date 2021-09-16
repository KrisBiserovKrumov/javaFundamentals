package FirstExersice.FunctionalProgramming.STREAMSFILESANDDIRECTORIES.FilesAndStreamsLAB;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ListFiles {
    public static void main(String[] args) {
        String basePath = "C:\\Users\\Admin\\Desktop\\SOFTUNI\\JavaFundamentals\\" +
                "STREAMS,FILESANDDIRECTORIES\\04. Java-Advanced-Files-and-Streams-Lab-Resources" +
                "\\04. Java-Advanced-Files-and-Streams-Lab-Resources";
        String inputFileName = basePath + "\\Files-and-Streams";
        String outFileName = basePath + "\\07.SortLinesOutput.txt";
        File fowderToread = new File(inputFileName);
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new FileWriter(outFileName));
            File[] files = fowderToread.listFiles();

            for (File file : files) {
                if (!file.isDirectory()){
                    writer.printf("%s: [%d]\n",file.getName(),file.length());

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (writer != null){
                writer.close();
            }
        }





    }
}
