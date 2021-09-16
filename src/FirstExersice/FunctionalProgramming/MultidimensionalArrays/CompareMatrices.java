package FirstExersice.FunctionalProgramming.MultidimensionalArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompareMatrices {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = reader.readLine().split(" ");
        int rows = Integer.parseInt(numbers[0]);
        int cols = Integer.parseInt(numbers[1]);

        int[][] firstMatrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            String[] colonDate = reader.readLine().split(" ");
            for (int j = 0; j < cols; j++) {
                firstMatrix[i][j] = Integer.parseInt(colonDate[j]);

            }
        }
           //for (int i = 0; i < rows; i++) {
           //    for (int j = 0; j < cols ; j++) {
           //        System.out.print(firstMatrix[i][j] + " ");
           //    }
           //    System.out.println();
           //}
        String[] numbs = reader.readLine().split(" ");
        int rows2 = Integer.parseInt(numbs[0]);
        int cols2 = Integer.parseInt(numbs[1]);

        int[][] firstMatrix2 = new int[rows2][cols2];

        for (int i = 0; i < rows2; i++) {
            String[] colonDate = reader.readLine().split(" ");
            for (int j = 0; j < cols2; j++) {
                firstMatrix2[i][j] = Integer.parseInt(colonDate[j]);

            }
        }
        if (firstMatrix[0].length != firstMatrix2[0].length ||
                firstMatrix.length != firstMatrix2.length){
            System.out.println("not equal");
            return;
        }
        for (int i = 0; i <firstMatrix.length; i++) {
            for (int j = 0; j <firstMatrix2[0].length ; j++) {
                if (firstMatrix[i][j]  != firstMatrix2[i][j]){
                    System.out.println("not equal");
                    return;
                }
            }
        }
        System.out.println("equal");

    }
}
