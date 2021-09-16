package FirstExersice.FunctionalProgramming.StacksAndQueuesLab.Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayDeque;

public class Robotics {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] roboData = reader.readLine().split(";");
        String[] robots = new String[roboData.length];
        int[] workingTime = new int[roboData.length];
        int[] procesTime = new int[roboData.length];

        for (int i = 0; i < roboData.length; i++) {
            robots[i] = roboData[i].split("-")[0];
            workingTime[i] = Integer.parseInt(roboData[i].split("-")[1]);
            
        }
        String[] timeData = reader.readLine().split(":");
        int hours = Integer.parseInt(timeData[0]);
        int minutes = Integer.parseInt(timeData[1]);
        int seconds = Integer.parseInt(timeData[2]);

        int stratTime = hours * 3600 + minutes * 60 + seconds;

        int time = 0;

        ArrayDeque<String>products = new ArrayDeque<>();
        String currentProduct = reader.readLine();

        while (!currentProduct.equals("End")){
            products.offer(currentProduct);
            currentProduct = reader.readLine();
        }

        while (!products.isEmpty()){
            time++;
            String product = products.pollFirst();
            boolean isAssigned = false;

            for (int i = 0; i < robots.length ; i++) {
                if (procesTime[i] == 0 && !isAssigned){
                    procesTime[i] = workingTime[i];
                    printTask(robots[i],stratTime + time,product);
                    isAssigned = true;
                }
                if (procesTime[i] > 0){
                    procesTime[i]--;
                }

            }
            if (!isAssigned){
                products.offer(product);
            }
        }
        System.out.println();


    }

    private static void printTask(String robot, int time,String product) {
        int hours = (time / 3600) % 24;
        int minutes = time % 3600 / 60;
        int seconds = time % 60;
        DecimalFormat format = new DecimalFormat("00");

        System.out.println(String.format("%s - %s [%s:%s:%s]",robot,product,
                format.format(hours),format.format(minutes),format.format(seconds)));

    }
}
