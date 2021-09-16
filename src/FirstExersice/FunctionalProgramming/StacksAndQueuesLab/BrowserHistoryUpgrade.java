package FirstExersice.FunctionalProgramming.StacksAndQueuesLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class BrowserHistoryUpgrade {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        String current = "";
        ArrayDeque<String> browser = new ArrayDeque<>();
        ArrayDeque<String> forwards = new ArrayDeque<>();

        while (!line.equals("Home")){
            if (line.equals("back")){
                if (!browser.isEmpty()){
                    forwards.push(current);
                    current = browser.pop();
                }else {
                    System.out.println("no previous URLs");
                    line = reader.readLine();
                    continue;
                }
            }else if (line.equals("forward")){
                if (!forwards.isEmpty()){
                    browser.push(current);
                    current = forwards.pop();

                }else {
                    System.out.println("no next URLs");
                    line = reader.readLine();
                    continue;

                }

            }
                else {
                if (!current.equals("")){
                    browser.push(current);
                    if (!forwards.isEmpty()){
                        forwards.clear();
                    }
                }
                current = line;
            }
            System.out.println(current);
            line = reader.readLine();
        }

    }
}
