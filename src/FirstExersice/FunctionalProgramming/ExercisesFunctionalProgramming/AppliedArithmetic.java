package FirstExersice.FunctionalProgramming.ExercisesFunctionalProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class AppliedArithmetic {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = Arrays.stream(reader.readLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();
        String line = reader.readLine();
        Function<int[],int[]> add = arr -> Arrays.stream(arr).map(e -> ++e).toArray();
        UnaryOperator<int[]> sub =arr -> Arrays.stream(arr).map(e -> --e).toArray();
        UnaryOperator<int[]> multy =arr -> Arrays.stream(arr).map(e -> e *= 2).toArray();
        Consumer<int[]> print = arr -> Arrays.stream(arr).forEach(e-> System.out.print(e + " "));

        while (!line.equals("end")){

            switch (line){
                case "add":
                    numbers = add.apply(numbers);
                    break;
                case "subtract":
                    numbers = sub.apply(numbers);
                    break;
                case "multiply":
                    numbers = multy.apply(numbers);
                    break;
                    default:
                        print.accept(numbers);
                        System.out.println();
            }

            line = reader.readLine();
        }
    }
}
