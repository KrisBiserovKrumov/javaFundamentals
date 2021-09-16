package FirstExersice.FunctionalProgramming.StacksAndQueuesLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Collections;

public class HotPotato {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String []name = reader.readLine().split(" ");
        int n = Integer.parseInt(reader.readLine());
        ArrayDeque<String> children = new ArrayDeque<>();

        Collections.addAll(children,name);

        while (children.size() > 1){
            for (int i = 0; i < n - 1; i++) {
                String currentChild = children.poll();
                children.offer(currentChild);
            }
            String child = children.poll();
            System.out.println("Removed " + child);

        }
        String lastChild = children.poll();
        System.out.println("Last is " + lastChild);
    }
}
