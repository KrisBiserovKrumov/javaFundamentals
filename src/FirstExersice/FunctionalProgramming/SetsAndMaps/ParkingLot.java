package FirstExersice.FunctionalProgramming.SetsAndMaps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class ParkingLot {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        HashSet<String> parking = new HashSet<>();

        while (!line.equals("END")){
            String[] parts = line.split(", ");
            if (parts[0].equals("IN")){
                parking.add(parts[1]);
            }else {
                parking.remove(parts[1]);
            }
            line = reader.readLine();
        }
        if (parking.isEmpty()){
            System.out.println("Parking Lot is Empty");
        }else {
            for (String number : parking) {
                System.out.println(number);

            }
        }
    }
}
