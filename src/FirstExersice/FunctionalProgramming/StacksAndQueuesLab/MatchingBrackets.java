package FirstExersice.FunctionalProgramming.StacksAndQueuesLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class MatchingBrackets {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String imput = reader.readLine();

        ArrayDeque<Integer> bracketIndexes = new ArrayDeque<>();

        for (int i = 0; i <imput.length() ; i++) {
            if (imput.charAt(i) == '('){
                bracketIndexes.push(i);
            }else if (imput.charAt(i) == ')'){
                int startIndex = bracketIndexes.pop();
                String bracketString = imput.substring(startIndex,i + 1);
                System.out.println(bracketString);
            }

        }

    }
}
