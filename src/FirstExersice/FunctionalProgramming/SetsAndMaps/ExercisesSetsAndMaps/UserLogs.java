package FirstExersice.FunctionalProgramming.SetsAndMaps.ExercisesSetsAndMaps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class UserLogs {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String imput = reader.readLine();
        TreeMap<String, LinkedHashMap<String,Integer>> usersLogs = new TreeMap<>();

        while (!imput.equals("end")){
            String userName = imput.substring(imput.lastIndexOf('=') + 1);
            String ip = imput.substring(imput.indexOf('=') + 1 , imput.indexOf(" "));
            if (!usersLogs.containsKey(userName)){
                usersLogs.put(userName,new LinkedHashMap<>(){{put(ip,1);}});
            }else {
                if (!usersLogs.get(userName).containsKey(ip)){
                    usersLogs.get(userName).put(ip,1);
                }else {
                    usersLogs.get(userName).put(ip,usersLogs.get(userName).get(ip) + 1);

                }
            }

            imput = reader.readLine();

        }
        for (String username : usersLogs.keySet()) {
            System.out.println(username + ":");
            int size = usersLogs.get(username).keySet().size() - 1;
            for (String ip : usersLogs.get(username).keySet()) {
                if (size != 0) {
                    System.out.printf("%s => %d, ",ip,usersLogs.get(username).get(ip));
                }else {
                    System.out.printf("%s => %d.%n",ip,usersLogs.get(username).get(ip));

                }
                size--;
                
            }

        }
    }
}
