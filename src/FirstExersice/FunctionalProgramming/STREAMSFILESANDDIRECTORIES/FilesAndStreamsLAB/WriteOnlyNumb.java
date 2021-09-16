package FirstExersice.FunctionalProgramming.STREAMSFILESANDDIRECTORIES.FilesAndStreamsLAB;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteOnlyNumb {
    public static void main(String[] args) throws IOException {
        String basePath = "C:\\Users\\Admin\\Desktop\\SOFTUNI\\JavaFundamentals\\" +
                "STREAMS,FILESANDDIRECTORIES\\04. Java-Advanced-Files-and-Streams-Lab-Resources" +
                "\\04. Java-Advanced-Files-and-Streams-Lab-Resources";
        String inputPath = basePath + "\\input.txt";
        String outPath = basePath + "\\04.ExtractIntegersOutput.txt";


        Scanner scanner = null;
        FileWriter writer = null;
        try {
            scanner = new Scanner(new FileInputStream(inputPath));
            writer = new FileWriter(outPath);

            while (scanner.hasNext()){
                if (scanner.hasNextInt()){
                    writer.write(String.valueOf(scanner.nextInt()));
                    writer.write('\n');
                }
                scanner.next();
            }


        }catch (IOException e) {
            //System.out.println(e.getMessage());
            e.printStackTrace();
        }
        finally {
            if (scanner != null){
                scanner.close();
            }if (writer != null){
                writer.close();
            }
        }
    }
}
