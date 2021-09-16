package FirstExersice.FunctionalProgramming.MultidimensionalArrays.MultidimensionalArraysExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MaximalSum {
    private static int sum = 0;
    private static int[][] tempMatrix = new int[3][3];
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] imput = reader.readLine().split(" ");
        int rows = Integer.parseInt(imput[0]);
        int cols = Integer.parseInt(imput[1]);

        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(reader.readLine().split(" ")).
                    mapToInt(Integer::parseInt).toArray();
        }
        int maxSum = 0;
        int [][] bestMatrix = new int[3][3];
        for (int row = 1; row < rows - 1 ; row++) {
            for (int col = 1; col < cols - 1; col++) {
                calculateMatrixSum (matrix, row,col);
                if (sum > maxSum){
                    maxSum = sum;
                    bestMatrix = tempMatrix;
                }

            }

        }
        System.out.println("Sum = " + maxSum);
        for (int row = 0; row < 3 ; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(bestMatrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void calculateMatrixSum(int[][] matrix, int r, int c) {
        sum = 0;
        tempMatrix = new int[3][3];
        int matrixRow = 0;
        for (int row = r - 1; row <= r + 1 ; row++) {
            int matrixCol = 0;
            for (int col = c - 1; col <= c + 1 ; col++) {
                sum += matrix[row][col];
                tempMatrix[matrixRow][matrixCol++]  = matrix[row][col];
            }
            matrixRow++;
            
        }
    }
}
