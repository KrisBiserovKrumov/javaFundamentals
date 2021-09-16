package FirstExersice.FunctionalProgramming.SetsAndMaps.ExercisesSetsAndMaps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

public class FixEmail {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String commaned = reader.readLine();
        LinkedHashMap<String,String>nameMail = new LinkedHashMap<>();

        while (!commaned.equals("stop")){
            String mail = reader.readLine();
            String[] view = mail.split("\\.");

            if (!view[1].equals("uk") && !view[1].equals("us") && !view[1].equals("com")){
                nameMail.put(commaned,mail);
            }
            commaned = reader.readLine();
        }
        for (String s : nameMail.keySet()) {
            System.out.printf("%s -> %s\n",s,nameMail.get(s));


        }
    }
}
