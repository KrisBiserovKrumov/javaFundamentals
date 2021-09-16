package FirstExersice.FunctionalProgramming.MultidimensionalArrays.MultidimensionalArraysLAB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompareMatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] numbers = reader.readLine().split(" ");
        int rows = Integer.parseInt(numbers[0]);
        int cols = Integer.parseInt(numbers[1]);

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            String[] numbs = reader.readLine().split(" ");
            for (int j = 0; j < cols ; j++) {
                matrix[i][j] += Integer.parseInt( numbs[j]);
            }
        }
        numbers = reader.readLine().split(" ");
        rows = Integer.parseInt(numbers[0]);
        cols = Integer.parseInt(numbers[1]);

        int[][] secondMatrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            String[] numbs = reader.readLine().split(" ");
            for (int j = 0; j < cols ; j++) {
                secondMatrix[i][j] += Integer.parseInt( numbs[j]);
            }
        }
        if (matrix[0].length != secondMatrix[0].length || matrix.length != secondMatrix.length){
            System.out.println("not equal");
            return;

        }

        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if ( matrix[i][j] != secondMatrix[i][j]){
                    System.out.println("not equal");
                    return;
                }
            }
        }

            System.out.println("equal");


    }
}
