package FirstExersice.FunctionalProgramming.StacksAndQueuesLab.Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class SimpleTextEdition {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        StringBuilder text = new StringBuilder();
        ArrayDeque<StringBuilder> stack = new ArrayDeque<>();
        while (n-- > 0){
            String[] token = reader.readLine().split(" ");

            String command = token[0];
            switch (command){
                case "1":
                    text.append(token[1]);
                    stack.push(new StringBuilder(text));
                    break;
                case "2":
                    int count = Integer.parseInt(token[1]);
                    int start = text.length() - count;
                    text.delete(start,start + count);
                    stack.push(new StringBuilder(text));

                    break;
                case "3":
                    System.out.println(text.charAt(Integer.parseInt(token[1]) - 1));

                    break;
                case "4":
                    if (stack.size() > 1) {
                        stack.pop();
                        text = stack.peek();
                    }else if (stack.size() == 1){
                        text = new StringBuilder();
                    }
                    break;
            }
        }
    }
}
