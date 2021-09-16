package FirstExersice.FunctionalProgramming.MultidimensionalArrays.MultidimensionalArraysExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class DiagonalDifference {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int siza = Integer.parseInt(reader.readLine());
        int[][] matrix = new int[siza][siza];
        for (int row = 0; row < siza ; row++) {
            matrix[row] = Arrays.stream(reader.readLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();
        }
        int firstFiagonal = calculateFirtDiagonal(matrix);
        int secondFiagonal = calculateSecondDiagonal(matrix);
        System.out.println(Math.abs(firstFiagonal - secondFiagonal));


    }

    private static int calculateSecondDiagonal(int[][] matrix) {
        int sum = 0;
        int row = matrix.length - 1;
        int col = 0;
        while (row >= 0){
            sum += matrix[row--][col ++];
        }
        return sum;
    }

    private static int calculateFirtDiagonal(int[][] matrix) {
        int sum = 0;
        int row = 0;
        int col = 0;
        while (row < matrix.length){
            sum += matrix[row++][col++];
        }
        return sum;
    }
}
