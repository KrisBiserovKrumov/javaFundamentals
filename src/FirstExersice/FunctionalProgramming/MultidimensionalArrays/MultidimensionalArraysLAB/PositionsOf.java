package FirstExersice.FunctionalProgramming.MultidimensionalArrays.MultidimensionalArraysLAB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PositionsOf {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] rolsCols = reader.readLine().split(" ");
        int rows = Integer.parseInt(rolsCols[0]);
        int cols = Integer.parseInt(rolsCols[1]);

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            int[] rowData = Arrays.stream(reader.readLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();

            matrix[i] = rowData;

        }
        int needle = Integer.parseInt(reader.readLine());
        boolean isFound = false;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == needle){
                    System.out.println(i + " " + j);
                    isFound = true;
                }

            }

        }
        if (!isFound){
            System.out.println("not found");
        }
    }
}
