package FirstExersice.FunctionalProgramming.ExercisesFunctionalProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ReverseAndExclude {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> numbers = Arrays.stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt).boxed().collect(Collectors.toCollection(ArrayList::new));
        int numb = Integer.parseInt(reader.readLine());
        BiFunction<ArrayList<Integer>, Integer, ArrayList<Integer>> reverse =
                ((arr, num) -> {Collections.reverse(arr);
                return arr.stream().filter(e-> e % numb != 0)
                        .collect(Collectors.toCollection(ArrayList::new));} );

        Consumer<ArrayList<Integer>> print = e->e.forEach(n ->System.out.print(n + " ") );
        print.accept(reverse.apply(numbers,numb));





    }
}
