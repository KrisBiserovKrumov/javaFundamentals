package FirstExersice.FunctionalProgramming.StacksAndQueuesLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class DecimalToBinaryConverter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        ArrayDeque<Integer> bits = new ArrayDeque<>();

        if (number == 0){
            System.out.println("0");
            return;
        }
        while (number > 0){
            int leftOver = number % 2;
            bits.push(leftOver);
            number = number / 2;
        }
        while (!bits.isEmpty()){
            System.out.print(bits.pop());
        }

    }
}
