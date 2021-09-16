package FirstExersice.FunctionalProgramming.SetsAndMaps.ExercisesSetsAndMaps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());

        TreeSet<String> words = new TreeSet<>();

        while (a-- > 0) {
            String[] form = reader.readLine().split(" ");
            for (int i = 0; i < form.length; i++) {
                if (!words.contains(form[i])) {
                    words.add(form[i]);
                }
            }
        }
        for (String s : words) {
            System.out.print(s + " ");

        }

    }
}
