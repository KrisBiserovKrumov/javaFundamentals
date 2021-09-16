package FirstExersice.FunctionalProgramming.StacksAndQueuesLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class BrowserHistory {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        ArrayDeque<String> browserHistory = new ArrayDeque<>();

        while (!line.equals("Home")){

            if (line.equals("back")){
                if (browserHistory.size() <= 1){
                    System.out.println("no previous URLs");
                }else {
                    browserHistory.pop();
                    String current = browserHistory.peek();
                    System.out.println(current);
                }
            }else {
                System.out.println(line);
                browserHistory.push(line);

            }

            line = reader.readLine();
        }
    }
}
