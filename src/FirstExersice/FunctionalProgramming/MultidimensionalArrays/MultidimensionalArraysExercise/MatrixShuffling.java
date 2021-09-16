package FirstExersice.FunctionalProgramming.MultidimensionalArrays.MultidimensionalArraysExercise;

import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dim = scanner.nextLine().split(" ");

        int rows = Integer.parseInt(dim[0]);
        int cols = Integer.parseInt(dim[1]);

        if(cols+rows < 3){
            System.out.println("Invalid input!");
            return;
        }

        String[][] matrix = new String[rows][cols];

        for (int i = 0; i < rows; i++) {
            String[] row = scanner.nextLine().split("\\s+");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = row[j];
            }
        }

        String[] line = scanner.nextLine().split("\\s+");



        while (!line[0].equals("END")) {

            if (!line[0].equals("swap") || line.length != 5) {
                System.out.println("Invalid input!");
                line = scanner.nextLine().split("\\s+");
                continue;
            }

            if (Integer.parseInt(line[1]) >= rows
                    || Integer.parseInt(line[3]) >= rows
                    || Integer.parseInt(line[2]) >= cols
                    || Integer.parseInt(line[4]) >= cols) {
                System.out.println("Invalid input!");
                line = scanner.nextLine().split("\\s+");
                continue;
            }

            int firstIndexRow = Integer.parseInt(line[1]);
            int firstIndexCol = Integer.parseInt(line[2]);
            int secondIndexRow = Integer.parseInt(line[3]);
            int secondIndexCol = Integer.parseInt(line[4]);


            String curr = matrix[firstIndexRow][firstIndexCol];
            matrix[firstIndexRow][firstIndexCol]=matrix[secondIndexRow][secondIndexCol];
            matrix[secondIndexRow][secondIndexCol]=curr;

            printMatrix(matrix);


            line = scanner.nextLine().split("\\s+");

        }
    }

    private static void printMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%s ",matrix[i][j]);
            }
            System.out.println();
        }
    }
}
