package FirstExersice.FunctionalProgramming.STREAMSFILESANDDIRECTORIES.FilesAndStreamsLAB;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class SortLines {
    public static void main(String[] args) {
        String basePath = "C:\\Users\\Admin\\Desktop\\SOFTUNI\\JavaFundamentals\\" +
                "STREAMS,FILESANDDIRECTORIES\\04. Java-Advanced-Files-and-Streams-Lab-Resources" +
                "\\04. Java-Advanced-Files-and-Streams-Lab-Resources";
        String inputPathName = basePath + "\\6.input.txt";
        String outPathName = basePath + "\\06.SortLinesOutput.txt";
        Path inputPath = Paths.get(inputPathName);
        Path outputPath = Paths.get(outPathName);
        try {
            List<String> allLines = Files.readAllLines(inputPath);
            Collections.sort(allLines);
            Files.write(outputPath,allLines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
