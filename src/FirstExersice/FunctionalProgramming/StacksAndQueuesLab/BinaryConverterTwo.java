package FirstExersice.FunctionalProgramming.StacksAndQueuesLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class BinaryConverterTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        ArrayDeque<Integer> binary = new ArrayDeque<>();

if (a == 0){
    System.out.println(0);
}
        while (a != 0){
            binary.push(a % 2);
            a = a / 2;

        }


        while (!binary.isEmpty()) {
            System.out.print(binary.pop());
        }

    }
}
