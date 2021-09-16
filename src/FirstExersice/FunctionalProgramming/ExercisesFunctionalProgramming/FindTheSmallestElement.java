package FirstExersice.FunctionalProgramming.ExercisesFunctionalProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheSmallestElement {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> numbers = Arrays.stream(reader.readLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toCollection(ArrayList::new));

        Function<ArrayList<Integer>,Integer> findeIndex = (arr -> {
            int min = arr.stream().min(Integer::compareTo).get();
            return arr.lastIndexOf(min);
        });
        System.out.println(findeIndex.apply(numbers));
    }
}
