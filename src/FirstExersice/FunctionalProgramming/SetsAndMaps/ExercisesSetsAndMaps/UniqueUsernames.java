package FirstExersice.FunctionalProgramming.SetsAndMaps.ExercisesSetsAndMaps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;

public class UniqueUsernames {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        LinkedHashSet<String> name = new LinkedHashSet<>();
        for (int i = 0; i < n; i++) {
            String names = reader.readLine();
            if (!name.contains(names)){
                name.add(names);
            }
        }
        for (String student : name) {
            System.out.println(student);
        }
    }
}
