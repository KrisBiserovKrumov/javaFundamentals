package FirstExersice.FunctionalProgramming.StacksAndQueuesLab.Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class BalancedParentheses {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String parrenteheses = reader.readLine();

        ArrayDeque<Character> brackets = new ArrayDeque<>();
        boolean areBalanced = true;

        for (int i = 0; i < parrenteheses.length() ; i++) {
            char current = parrenteheses.charAt(i);
            if (current == '{' || current == '[' || current == '('){
                brackets.push(current);
            }else {
                if (brackets.isEmpty()){
                    areBalanced = false;
                    break;
                }
                char oppening = brackets.pop();

                if (current == ')' && oppening != '('){
                    areBalanced = false;
                    break;
                } else if (current == ']' && oppening != '['){
                    areBalanced = false;
                    break;
                }else  if (current == '}' && oppening != '{'){
                    areBalanced = false;
                    break;
                }
            }

        }
        if (areBalanced){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }
}
