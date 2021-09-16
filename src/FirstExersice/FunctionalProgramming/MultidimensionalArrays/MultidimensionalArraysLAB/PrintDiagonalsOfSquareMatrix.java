package FirstExersice.FunctionalProgramming.MultidimensionalArrays.MultidimensionalArraysLAB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());


        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            int[] rowData = Arrays.stream(reader.readLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();
            matrix[i] = rowData;
        }
        for (int i = 0; i < n ; i++) {
            System.out.print(matrix[i][i] + " ");
            
        }
        System.out.println();
        for (int i = 0; i < n ; i++) {
            System.out.print(matrix[n - 1 - i][i] + " ");

        }
        System.out.println();
    }
}
