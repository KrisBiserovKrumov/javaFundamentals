package FirstExersice.FunctionalProgramming.StacksAndQueuesLab.Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class ReversNumbersTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = reader.readLine().split(" ");
        ArrayDeque<String> numb = new ArrayDeque<>();

        for (int i = 0; i < numbers.length ; i++) {
            numb.push(numbers[i]);
        }
        while (!numb.isEmpty()){
            System.out.print(numb.pop() + " ");
        }
    }
}
