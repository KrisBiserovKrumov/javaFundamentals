package FirstExersice.FunctionalProgramming.MultidimensionalArrays.MultidimensionalArraysLAB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaximumSum {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] rolsCols = reader.readLine().split(", ");
        int rows = Integer.parseInt(rolsCols[0]);
        int cols = Integer.parseInt(rolsCols[1]);
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows ; i++) {
            String[] line = reader.readLine().split(", ");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Integer.parseInt(line[j]);
            }
        }
        int maxSum = Integer.MIN_VALUE;
        int maxRow = -1, maxCol = -1;
        for (int i = 0; i < rows - 1; i++) {
            for (int j = 0; j <cols - 1 ; j++) {
                int currentSum = sumFromTop(matrix,i,j);
                if (currentSum > maxSum){
                    maxSum = currentSum;
                    maxRow = i;
                    maxCol = j;
                }
            }

        }
        System.out.println(String.format("%d %d\n%d %d\n%d",matrix[maxRow][maxCol],
                matrix[maxRow][maxCol + 1],matrix[maxRow + 1][maxCol]
                ,matrix[maxRow + 1][maxCol + 1],maxSum));

    }
    private  static int sumFromTop(int[][] matrix, int row,int col){
        return matrix[row][col] + matrix[row + 1][col]
                + matrix[row][col + 1] + matrix[row + 1][col + 1];
    }
}
