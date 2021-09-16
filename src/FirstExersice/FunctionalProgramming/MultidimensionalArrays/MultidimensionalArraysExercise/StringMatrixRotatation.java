package FirstExersice.FunctionalProgramming.MultidimensionalArrays.MultidimensionalArraysExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class StringMatrixRotatation {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] rotateData = reader.readLine().split("[()]+");
        int rotataAngle = Integer.parseInt(rotateData[1])% 360;
        ArrayList<String> imputStrings = new ArrayList<>();
        String line = reader.readLine();
        int maxLenght = line.length();

        while (!line.equals("END")){
            imputStrings.add(line);


            line = reader.readLine();
            if (maxLenght < line.length()){
                maxLenght = line.length();
            }
        }
        char[][] matrix = new char[imputStrings.size()][maxLenght];
        for (int r = 0; r < imputStrings.size(); r++) {
            for (int c = 0; c < maxLenght; c++) {
                if (c > imputStrings.get(r).length() - 1){
                    matrix[r][c] = ' ';

                }else {
                    matrix[r][c] = imputStrings.get(r).charAt(c);
                }
                
            }
            
        }
        if (rotataAngle == 90){
            for (int c = 0; c <maxLenght ; c++) {
                for (int r = matrix.length - 1; r >= 0; r--) {
                    System.out.print(matrix[r][c]);
                }
                System.out.println();
            }
        }else if (rotataAngle == 180){
            for (int r = matrix.length - 1; r >= 0 ; r--) {
                for (int c = maxLenght - 1; c >= 0; c--) {
                    System.out.print(matrix[r][c]);
                }
                System.out.println();
            }
        }else if (rotataAngle == 270){
            for (int c = maxLenght - 1; c >= 0 ; c--) {
                for (int r = 0; r < matrix.length  ; r++) {
                    System.out.print(matrix[r][c]);
                }
                System.out.println();
            }
        }else {
            for (int r = 0; r < matrix.length ; r++) {
                for (int c = 0; c < maxLenght ; c++) {
                    System.out.print(matrix[r][c]);

                }
                System.out.println();

            }
        }

    }
}
