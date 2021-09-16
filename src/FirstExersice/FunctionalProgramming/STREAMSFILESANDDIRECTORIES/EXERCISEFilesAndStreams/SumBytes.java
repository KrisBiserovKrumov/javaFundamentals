package FirstExersice.FunctionalProgramming.STREAMSFILESANDDIRECTORIES.EXERCISEFilesAndStreams;

import java.io.*;

public class SumBytes {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("input.txt");
        FileWriter writer = new FileWriter("inputOne.txt");

        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String line = reader.readLine();

        int totalSum = 0;

        while (line != null){
            int sum = 0;
            for (int i = 0; i < line.length() ; i++) {
                sum += line.charAt(i);
            }
            totalSum += sum;
            line = reader.readLine();
        }
        writer.write(totalSum + System.lineSeparator());
        writer.close();
    }
}
