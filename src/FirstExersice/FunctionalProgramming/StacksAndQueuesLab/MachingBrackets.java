package FirstExersice.FunctionalProgramming.StacksAndQueuesLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class MachingBrackets {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String calculation = reader.readLine();
        ArrayDeque<Integer> brackets = new ArrayDeque<>();

        for (int i = 0; i <calculation.length() ; i++) {
            char symbol =(calculation.charAt(i));

            if (symbol == '('){
                brackets.push(i);
            }else if(symbol == ')'){
                int start = brackets.pop();
                String current = calculation.substring(start,i + 1);
                System.out.println(current);
            }

        }
    }
}
