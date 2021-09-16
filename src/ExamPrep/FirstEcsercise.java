package ExamPrep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class FirstEcsercise {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] leftNumbers = reader.readLine().split(" ");
        String [] rightNumbers = reader.readLine().split(" ");

        ArrayDeque<Integer> left = new ArrayDeque<>();
        ArrayDeque<Integer> right = new ArrayDeque<>();
        ArrayDeque<Integer> total = new ArrayDeque<>();


        for (int i = 0; i < leftNumbers.length; i++) {
            left.push(Integer.parseInt(leftNumbers[i]));
        }
        for (int i = 0; i < rightNumbers.length; i++) {
            right.offer(Integer.parseInt(rightNumbers[i]));
        }

        while (left.size() > 0 && right.size() > 0){
            int numbLeft = left.peek();
            int numbRight = right.peek();
            int result = 0;

            if (numbLeft > numbRight) {
                result = numbLeft + numbRight;
                total.offer(result);
                left.poll();
                right.pop();

            } else if (numbLeft == numbRight) {
                right.poll();
                left.pop();
                int sum = numbLeft + 1;
                left.addFirst(sum);

            } else {
                left.poll();
            }
        }
        int max = 0;
        for (Integer integer : total) {
            if (integer > max){
                max = integer;
            }
        }
        System.out.println(max);
        while (!total.isEmpty()){
            System.out.print(total.pop() + " ");
        }







    }
}
