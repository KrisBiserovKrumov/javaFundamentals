package FirstExersice.FunctionalProgramming.SetsAndMaps.ExercisesSetsAndMaps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetsOfElements {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] firstArr = Arrays.stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int lenghtFirst = firstArr[0];
        int lenghtSecond = firstArr[1];

        Set<Integer> numbersFirst = new LinkedHashSet<>();
        Set<Integer> numbersSecond = new LinkedHashSet<>();

        while (lenghtFirst-- > 0){
            int numb = Integer.parseInt(reader.readLine());
            numbersFirst.add(numb);
        }
        while (lenghtSecond-- > 0){
            int numb = Integer.parseInt(reader.readLine());
            numbersSecond.add(numb);
        }
        numbersFirst.retainAll(numbersSecond);

        numbersFirst.forEach(e -> System.out.print(e + " "));

    }
}
