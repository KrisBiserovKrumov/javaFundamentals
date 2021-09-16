package FirstExersice.FunctionalProgramming.SetsAndMaps.SetsAndMapsLAB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        TreeSet<String>guestList = new TreeSet<>();


        while (!line.equals("PARTY")){
            guestList.add(line);

            line = reader.readLine();
        }
        line = reader.readLine();
        while (!line.equals("END")){
            guestList.remove(line);

            line = reader.readLine();
        }
        System.out.println(guestList.size());
        for (String guest : guestList) {
            System.out.println(guest);

        }
    }
}
