package FirstExersice.FunctionalProgramming.StacksAndQueuesLab.Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class MaximumElements {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        Integer comandCount = Integer.parseInt(reader.readLine());

        while (comandCount-- > 0){
            String[] tokens = reader.readLine().split(" ");

            String command = tokens[0];
            switch (command){
                case "1":
                    int number = Integer.parseInt(tokens[1]);
                    stack.push(number);
                    break;
                case "2":
                    stack.pop();
                    break;
                case "3":
                    int max = stack.stream().max(Integer::compareTo).get();
                    System.out.println(max);
                    break;
            }
        }
    }
}
