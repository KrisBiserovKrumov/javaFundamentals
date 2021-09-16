package FirstExersice.FunctionalProgramming.STREAMSFILESANDDIRECTORIES.EXERCISEFilesAndStreams;

import java.io.*;

public class SumLines {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Admin\\Desktop\\SOFTUNI\\JavaFundamentals\\" +
                "STREAMS,FILESANDDIRECTORIES\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        String outPath = "C:\\Users\\Admin\\Desktop\\SOFTUNI\\JavaFundamentals\\" +
                "STREAMS,FILESANDDIRECTORIES\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\2input.txt";
        FileInputStream inputStream = new FileInputStream("input.txt");
        FileWriter writer = new FileWriter(outPath);
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String line = reader.readLine();
        while (line != null){
            int sum = 0;
            for (int i = 0; i < line.length() ; i++) {
                sum += line.charAt(i);
                
            }
            writer.write(sum + System.lineSeparator());


            line = reader.readLine();
        }
        writer.close();
    }
}
