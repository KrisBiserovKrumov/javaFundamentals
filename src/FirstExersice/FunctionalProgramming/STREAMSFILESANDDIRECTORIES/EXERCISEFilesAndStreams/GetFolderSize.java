package FirstExersice.FunctionalProgramming.STREAMSFILESANDDIRECTORIES.EXERCISEFilesAndStreams;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class GetFolderSize {
    public static void main(String[] args) throws IOException {
        File file = new File("Exercises Resources");
        PrintWriter writer = new PrintWriter("folderSize.txt");
       int sum = 0;
       for (File f : file.listFiles()){
           if (f.isFile()){
               sum += file.length();
           }
       }
        writer.println("Folder size: " + String.valueOf(sum));
       writer.close();
    }
}
