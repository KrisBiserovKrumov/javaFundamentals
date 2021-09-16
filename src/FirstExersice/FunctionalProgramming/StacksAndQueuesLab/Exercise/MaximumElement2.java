package FirstExersice.FunctionalProgramming.StacksAndQueuesLab.Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class MaximumElement2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());

        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        while (a-- > 0){
            String line = reader.readLine();
            String[] commands = line.split(" ");
            if (commands.length == 2) {
                int number = Integer.parseInt(commands[1]);
                numbers.push(number);


            }else if (line.equals("2")){
                numbers.pop();

            }else {
                int maxNumb = 0;
                for (Integer number : numbers) {
                    if (maxNumb < number){
                        maxNumb = number;
                    }


                }
                System.out.printf("%d%n",maxNumb);
            }
        }
    }
}
