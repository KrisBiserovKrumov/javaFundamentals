package FirstExersice.FunctionalProgramming.SetsAndMaps.ExercisesSetsAndMaps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Phonebook2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, String> phoneBook = new HashMap<>();
        String line = reader.readLine();
        boolean isExist = false;

        while (!line.equals("search")) {
            String[] namePhone = line.split("-");
            String name = namePhone[0];
            String phone = namePhone[1];
            phoneBook.put(name, phone);
            line = reader.readLine();
        }
        line = reader.readLine();
        while (!line.equals("stop")) {
            if (!phoneBook.containsKey(line)) {
                System.out.printf("Contact %s does not exist.%n", line);
            } else {
                for (String name : phoneBook.keySet()) {
                    if (name.equals(line)) {
                        System.out.printf("%s -> %s%n", name, phoneBook.get(name));

                    }
                }
            }


                line = reader.readLine();
            }
        }
    }
