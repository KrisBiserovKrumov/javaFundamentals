package FirstExersice.FunctionalProgramming.ExercisesFunctionalProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Consumer;

public class ConsumerPrint {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Consumer<String> print = str -> System.out.println(str);
        Arrays.stream(reader.readLine().split(" ")).forEach(print);
    }
}
