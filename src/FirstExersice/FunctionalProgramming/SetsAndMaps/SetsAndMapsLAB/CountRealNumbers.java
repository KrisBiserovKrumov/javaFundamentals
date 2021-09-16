package FirstExersice.FunctionalProgramming.SetsAndMaps.SetsAndMapsLAB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountRealNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double[] line = Arrays.stream(reader.readLine().split(" "))
                .mapToDouble(Double::parseDouble).toArray();
        Map<Double,Integer> numbers = new LinkedHashMap<>();

        for (int i = 0; i < line.length ; i++) {
            if (numbers.containsKey(line[i])){
                numbers.put(line[i],numbers.get(line[i]) + 1);
            }else {
                numbers.put(line[i],1);
            }

        }
        for (Double aDouble : numbers.keySet()) {
            System.out.println(String.format("%.1f -> %d",aDouble,numbers.get(aDouble)));

        }
    }
}
