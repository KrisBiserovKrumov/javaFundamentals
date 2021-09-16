package ExamFebruary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ClubParty {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int capasity = Integer.parseInt(reader.readLine());
        String[] token = reader.readLine().split(" ");

        ArrayDeque<String> commands = new ArrayDeque<>();
        ArrayDeque<String> sales = new ArrayDeque<>();
        List<Integer> people = new ArrayList<>();
        LinkedHashMap<String,List<Integer>> end = new LinkedHashMap<>();

        for (int i = 0; i <token.length ; i++) {
            commands.push(token[i]);
        }
        for (String command : commands) {
            if (command.matches("[0-9]+") && sales.size() > 0 && Integer.parseInt(command)<= capasity){
                people.add(Integer.parseInt(command));
            }else if (!command.matches("[0-9]+")){
                sales.offer(command);
            }
        }
        for (String sale : sales) {
            end.putIfAbsent(sale,new ArrayList<>());
            int saleFull = 0;
            ArrayList<Integer> saleForAdd = new ArrayList<>();
            for (Integer person : people) {
                if (saleFull + person <= capasity) {
                    saleFull += person;
                    saleForAdd.add(person);

                }else {
                    int index = people.indexOf(person);
                    people = people.subList(index ,people.size());
                    end.get(sale).addAll(saleForAdd);
                    saleForAdd = new ArrayList<>();
                     saleFull = 0;
                     break;

                }
            }
        }

        for (String chil : end.keySet()) {
            if (!end.get(chil).isEmpty()) {

                System.out.print(chil + " -> ");
                int size = end.keySet().size() - 2;
                List<String> numbers = new ArrayList<>();

                for (Integer integer : end.get(chil)) {
                    String numb = integer + "";
                    numbers.add(numb);
                }
                System.out.print(String.join(", ", numbers));

                System.out.println();
            }

        }

    }

}
