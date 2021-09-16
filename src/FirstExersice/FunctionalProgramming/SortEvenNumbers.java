package FirstExersice.FunctionalProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortEvenNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] sTRnumbers = reader.readLine().split(", ");
       List<Integer> evenNumbers = Arrays.stream(sTRnumbers).map(Integer::parseInt)
                .filter(x -> x % 2 == 0)
               .collect(Collectors.toList());
        List<String> numbers = evenNumbers.stream().map(String::valueOf)
                .collect(Collectors.toList());
       String evenNumbs = String.join(", ",numbers);
        System.out.println(evenNumbs);

        evenNumbers.sort(Integer::compare);
        List<String> evensSorted = evenNumbers.stream()
                .map(String::valueOf).collect(Collectors.toList());
        evenNumbs = String.join(", ",evensSorted);
        System.out.println(evenNumbs);
    }
}
