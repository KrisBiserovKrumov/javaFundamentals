package FirstExersice.FunctionalProgramming.MultidimensionalArrays.MultidimensionalArraysExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatrixOfPalindromes {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] imput = reader.readLine().split(" ");

        int rows = Integer.parseInt(imput[0]);
        int cols = Integer.parseInt(imput[1]);

        String[][] matrix = new String[rows][cols];
        for (int row = 0; row < rows ; row++) {
            for (int col = 0; col < cols; col++) {
                String element = "" + (char)('a' + row) + (char)('a' + row + col)
                        + (char)('a' + row);
                matrix[row][col] = element;
            }
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");

            }
            System.out.println();

        }
    }
}
