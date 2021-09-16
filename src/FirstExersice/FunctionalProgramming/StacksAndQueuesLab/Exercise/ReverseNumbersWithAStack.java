package FirstExersice.FunctionalProgramming.StacksAndQueuesLab.Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class ReverseNumbersWithAStack {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] line = reader.readLine().split(" ");
        ArrayDeque<String> numbers = new ArrayDeque<>();

        for (int i = 0; i < line.length; i++) {
            numbers.push(line[i]);
        }
        while (!numbers.isEmpty()){
            System.out.print(numbers.pop() + " ");
        }
    }
}
