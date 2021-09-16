package FirstExersice.FunctionalProgramming.StacksAndQueuesLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class PrinterQueue {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         String line = reader.readLine();

        ArrayDeque<String> printerQueue = new ArrayDeque<>();

        while (!line.equals("print")){
            if (line.equals("cancel")){
                if (printerQueue.isEmpty()){
                    System.out.println("Printer is on standby");
                }else {
                    System.out.println("Canceled " + printerQueue.poll());
                }
            }else {
                printerQueue.offer(line);
            }
            line = reader.readLine();
        }

        while (!printerQueue.isEmpty()){
            System.out.println(printerQueue.poll());
        }


    }
}
