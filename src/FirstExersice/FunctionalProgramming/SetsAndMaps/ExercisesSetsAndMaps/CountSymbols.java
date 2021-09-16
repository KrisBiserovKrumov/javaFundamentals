package FirstExersice.FunctionalProgramming.SetsAndMaps.ExercisesSetsAndMaps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       String symbols = reader.readLine();
        Map<Character,Integer> total = new TreeMap<>();


        for (int i = 0; i < symbols.length() ; i++) {
            char symbol = symbols.charAt(i);
            if (!total.containsKey(symbol)){
                total.put(symbol,1);
            }else {
                int count = total.get(symbol);
                total.put(symbol,++count);
            }
        }

           //for (Character character : total.keySet()) {
           //    System.out.println(character + ": " + total.get(character) + " time/s");

           //}
        for (Map.Entry<Character, Integer> e : total.entrySet()) {
            System.out.printf("%s: %d time/s\n", e.getKey(), e.getValue());
        }
    }
}
