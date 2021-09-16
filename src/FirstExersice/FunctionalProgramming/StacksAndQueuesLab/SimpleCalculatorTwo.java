package FirstExersice.FunctionalProgramming.StacksAndQueuesLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Collections;

public class SimpleCalculatorTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = reader.readLine().split(" ");
        ArrayDeque<String> total = new ArrayDeque<>();
        Collections.addAll(total,numbers);
        while (total.size() > 1){

            int  element = Integer.valueOf(total.pop()) ;
           String operator = total.pop();
           int secondElement = Integer.valueOf(total.pop());
            int result = 0;

           if (operator.equals("+")){
               result = element + secondElement;
           }else {
               result = element - secondElement;
           }
           total .push(String.valueOf(result));
        }
        System.out.println(total.peek());

    }
}
