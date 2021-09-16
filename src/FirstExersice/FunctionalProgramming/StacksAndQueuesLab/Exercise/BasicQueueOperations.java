package FirstExersice.FunctionalProgramming.StacksAndQueuesLab.Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;

public class BasicQueueOperations {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] tokens = Arrays.stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int elementsToPush = tokens[0];
        int elementsToPop = tokens[1];
        int elementsTofind = tokens[2];
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        // Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt)
        //        .limit(elementsToPush).forEach(stack::push);

        int[] numbers = Arrays.stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < elementsToPush; i++) {
            stack.offer(numbers[i]);
        }

        while (elementsToPop-- > 0){
            stack.poll();
        }
        if (stack.contains(elementsTofind)){
            System.out.println("true");
        }else {
            int minNum = Integer.MAX_VALUE;
            if (stack.isEmpty()){
                minNum = 0;
            }
            while (!stack.isEmpty()){
                int current = stack.pop();
                if (current  < minNum){
                    minNum = current;
                }
            }
            System.out.println(minNum);
        }
    }
}
