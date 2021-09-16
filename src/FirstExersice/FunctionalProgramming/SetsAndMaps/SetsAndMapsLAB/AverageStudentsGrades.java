package FirstExersice.FunctionalProgramming.SetsAndMaps.SetsAndMapsLAB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class AverageStudentsGrades {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int gratesCount = Integer.parseInt(reader.readLine());

        Map<String, List<Double>> recor = new TreeMap<>();

        for (int i = 0; i < gratesCount; i++) {
            String[] parts = reader.readLine().split(" ");
            String name = parts[0];
            Double grades = Double.parseDouble(parts[1]);

            List<Double>  currentsGrades = new ArrayList<>();

            if (recor.containsKey(name)){

                currentsGrades = recor.get(name);
            }
            currentsGrades.add(grades);
            recor.put(name,currentsGrades);
        }
        for (String studentName : recor.keySet()) {
            System.out.print(studentName + " -> ");
            double gradeSum = 0d;
            List<Double>StudentGrades = recor.get(studentName);
            for (Double Grade : StudentGrades) {
                gradeSum += Grade;
                System.out.printf("%.2f ",Grade);
            }
            System.out.printf("(avg: %.2f)\n",Math.abs(gradeSum / StudentGrades.size()));

            
        }


    }
}
