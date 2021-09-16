package ExamPrep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExcelFunctions {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(reader.readLine());
        String[] command = reader.readLine().split(", ");

        String[][] matrix = new String[size][command.length];

        for (int i = 0; i < size; i++) {

            for (int j = 0; j < command.length; j++) {
                    matrix[i][j] = command[j];
                }
            command = reader.readLine().split(", ");

            }
        String line = reader.readLine();






    }
}
