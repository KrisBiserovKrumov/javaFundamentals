package FirstExersice.FunctionalProgramming.FunctionalProgrammingLAB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SumNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] numbs = reader.readLine().split(", ");
        Function<String,Integer> pars = Integer::parseInt;

       List<Integer> numbers = Arrays.stream(numbs).map(pars).collect(Collectors.toList());
        System.out.println("Count = " + numbers.size());
        int sum = numbers.stream().reduce(0,(a,b) -> a + b);
        System.out.println("Sum = " + sum);
    }
}
