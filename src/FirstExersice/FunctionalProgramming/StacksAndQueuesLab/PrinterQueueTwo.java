package FirstExersice.FunctionalProgramming.StacksAndQueuesLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class PrinterQueueTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        ArrayDeque<String> imput = new ArrayDeque<>();

        while (!line.equals("print")){
            if (line.equals("cancel")){
                if (imput.size() < 1){
                    System.out.println("Printer is on standby");
                }else {
                    System.out.println("Canceled "  + imput.poll());
                }
            }else {
                imput.offer(line);
            }

            line = reader.readLine();
        }
        while (!imput.isEmpty()){
            System.out.println(imput.poll());

        }
    }
}
