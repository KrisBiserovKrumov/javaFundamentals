package FirstExersice.FunctionalProgramming.ExercisesFunctionalProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CustomMinFunction {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = reader.readLine().split(" ");
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length ; i++) {
            int numb = Integer.parseInt(numbers[i]);
            if (min > numb){
                min = numb;
            }
        }
        System.out.println(min);
    }
}
