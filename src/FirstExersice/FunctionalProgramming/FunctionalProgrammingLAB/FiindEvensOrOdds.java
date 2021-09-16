package FirstExersice.FunctionalProgramming.FunctionalProgrammingLAB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class FiindEvensOrOdds {
    public static void main(String[] args) throws IOException {
        Predicate<Integer> filterEven = x -> x%2 == 0;
        Predicate<Integer> filterOdd = x -> x%2 != 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] numbers = reader.readLine().split(" ");
        int loler = Integer.parseInt(numbers[0]);
        int upper = Integer.parseInt(numbers[1]);
        String command = reader.readLine();

        Predicate<Integer> byType = filterEven;
        if (command.equals("odd")){

            byType = filterOdd;
        }

     IntStream.rangeClosed(loler,upper)
                .boxed()
                .filter(byType)
                .forEach(e-> System.out.print(e + " "));
    }
}
