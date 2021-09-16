package FirstExersice.FunctionalProgramming.StacksAndQueuesLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class hotPatatoTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] line = reader.readLine().split(" ");
        ArrayDeque<String>children = new ArrayDeque<>();
        int number = Integer.parseInt(reader.readLine());

        for (int i = 0; i < line.length; i++) {
            children.offer(line[i]);
        }
        while (children.size() > 1){
            for (int i = 0; i < number - 1; i++) {
               String child = children.poll();
               children.offer(child);
            }
            String removed = children.poll();
            System.out.println("Removed " + removed);
        }
        String lastChild = children.poll();
        System.out.println("Last is " + lastChild);
    }
}
