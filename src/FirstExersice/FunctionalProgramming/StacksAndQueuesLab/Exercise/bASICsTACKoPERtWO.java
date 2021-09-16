package FirstExersice.FunctionalProgramming.StacksAndQueuesLab.Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;

public class bASICsTACKoPERtWO {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbs = Arrays.stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        ArrayDeque<Integer> numbers = new ArrayDeque<>();
        int[] secondNumbs = Arrays.stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        boolean isTrue = false;
        int min = Integer.MAX_VALUE;

        int lenght = numbs[0];
        int elementsPOP = numbs[1];
        int elementsFind = numbs[2];

        for (int i = 0; i < lenght; i++) {
            numbers.push(secondNumbs[i]);
        }
        for (int i = 0; i < elementsPOP; i++) {
            numbers.pop();
        }
        while (numbers.size()> 1){
            int last = numbers.pop();
            if (last < min){
                min = last;
            }
            if (last == elementsFind){
                System.out.println("true");
                isTrue = true;
                break;
            }
        }
        if (numbers.isEmpty()){
            System.out.println(0);
        }
        if (isTrue = false){
            System.out.println(min);
        }


    }
}
