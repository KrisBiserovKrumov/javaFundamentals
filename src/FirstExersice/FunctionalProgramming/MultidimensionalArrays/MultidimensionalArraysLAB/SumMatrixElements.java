package FirstExersice.FunctionalProgramming.MultidimensionalArrays.MultidimensionalArraysLAB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SumMatrixElements {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] rolsCols = reader.readLine().split(", ");
        int rows = Integer.parseInt(rolsCols[0]);
        int cols = Integer.parseInt(rolsCols[1]);
        int sum = 0;

        for (int i = 0; i <rows ; i++) {
           sum += Arrays.stream(reader.readLine().split(", ")).mapToInt(Integer::parseInt).sum();
            
        }
        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sum);
    }
}
