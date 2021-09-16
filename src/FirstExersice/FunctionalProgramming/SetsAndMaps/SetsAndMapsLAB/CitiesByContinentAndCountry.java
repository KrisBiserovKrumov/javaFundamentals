package FirstExersice.FunctionalProgramming.SetsAndMaps.SetsAndMapsLAB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class CitiesByContinentAndCountry {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        LinkedHashMap<String,LinkedHashMap<String, List<String>>> total = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] commands = reader.readLine().split(" ");
            String continent = commands[0];
            String countrys = commands[1];
            String towns = commands[2];

            if (total.containsKey(continent)) {
                LinkedHashMap<String,List<String>> countriesTowns  = total.get(continent);
                if (countriesTowns.containsKey(countrys)){
                    List<String> cities = countriesTowns.get(countrys);
                    cities.add(towns);
                    countriesTowns.put(countrys,cities);
                }else {
                List<String> cities = new ArrayList<>();
                cities.add(towns);
                countriesTowns.put(countrys,cities);
                }
                total.put(continent,countriesTowns);
            } else {
                LinkedHashMap<String,List<String>> countriesTowns  = new LinkedHashMap<>();
                List<String> cities = new ArrayList<>();
                cities.add(towns);
                countriesTowns.put(countrys,cities);
                total.put(continent,countriesTowns);
            }
        }
        for (String continent : total.keySet()) {
            System.out.println(continent + ":");
            for (String counties : total.get(continent).keySet()) {
                System.out.print(counties + " -> ");
                System.out.println(String.join(", ",total.get(continent).get(counties)));
                
            }

            

        }
    }
}
