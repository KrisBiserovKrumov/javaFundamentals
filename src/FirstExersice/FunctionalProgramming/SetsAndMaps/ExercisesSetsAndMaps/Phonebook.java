package FirstExersice.FunctionalProgramming.SetsAndMaps.ExercisesSetsAndMaps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Phonebook {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String,String> total = new HashMap<>();

        String line = reader.readLine();

        while (!line.equals("search")){
            String[] namePhone = line.split("-");
            String name = namePhone[0];
            String phone = namePhone[1];
            total.put(name,phone);
            line = reader.readLine();
        }
        line = reader.readLine();
        while (!line.equals("stop")){
            if (total.containsKey(line)){
                System.out.printf("%s -> %s\n",line,total.get(line));
            }else {
                System.out.printf("Contact %s does not exist.\n",line);
            }

            line = reader.readLine();
        }


    }
}
