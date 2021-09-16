package FirstExersice.FunctionalProgramming.SetsAndMaps.SetsAndMapsLAB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.TreeMap;

public class AcademyGraduation {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        TreeMap<String, Double> nameGrade = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String name = reader.readLine();
            Double gradesAve = Arrays.stream(reader.readLine().split(" "))
                    .mapToDouble(Double::parseDouble).average().getAsDouble();
            nameGrade.put(name,gradesAve);
        }
        for (String student : nameGrade.keySet()) {
            System.out.println(student + " is graduated with " + nameGrade.get(student));

        }
    }
}
