package FirstExersice.FunctionalProgramming.MultidimensionalArrays.MultidimensionalArraysLAB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int rows = Integer.parseInt(reader.readLine());
        int cols = Integer.parseInt(reader.readLine());
        char [][] first = new char[rows][cols];
        char [][] second = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            String[] line = reader.readLine().split(" ");
            for (int j = 0; j < cols; j++) {
                first[i][j] = line[j].charAt(0);
            }
        }
        for (int i = 0; i <rows ; i++) {
            String[] line = reader.readLine().split(" ");
            for (int j = 0; j < cols; j++) {
                second[i][j] = line[j].charAt(0);
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <cols ; j++) {
                if (first[i][j] == second[i][j]){
                    System.out.print(first[i][j]);
                }else {
                    System.out.print("*" );
                }
                if (j  != cols - 1){
                    System.out.println(" ");
                }
            }
            System.out.println();
        }
    }
}
