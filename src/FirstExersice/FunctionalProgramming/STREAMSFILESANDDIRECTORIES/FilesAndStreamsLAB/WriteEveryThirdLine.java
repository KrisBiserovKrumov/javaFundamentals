package FirstExersice.FunctionalProgramming.STREAMSFILESANDDIRECTORIES.FilesAndStreamsLAB;

import java.io.*;

public class WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {
        String basePath = "C:\\Users\\Admin\\Desktop\\SOFTUNI\\JavaFundamentals\\" +
                "STREAMS,FILESANDDIRECTORIES\\04. Java-Advanced-Files-and-Streams-Lab-Resources" +
                "\\04. Java-Advanced-Files-and-Streams-Lab-Resources";
        String inputPath = basePath + "\\input.txt";
        String outPath = basePath + "\\05.WriteEveryThirdLineOutput.txt";
        BufferedReader bufferedReader = null;
        PrintWriter writer = null;
        int row = 1;
        try {
            bufferedReader = new BufferedReader(new FileReader(inputPath));
            writer = new PrintWriter(new FileWriter(outPath));


           String line =  bufferedReader.readLine();
           while (line != null) {

               if (row % 3 == 0) {
                   writer.println(line);
               }
               row++;
               line = bufferedReader.readLine();
           }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            if (bufferedReader != null){
                bufferedReader.close();
            }if (writer != null){
                writer.close();
            }
        }
    }
}
