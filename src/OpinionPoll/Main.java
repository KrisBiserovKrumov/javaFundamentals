package OpinionPoll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());

        ArrayList<Person> people = new ArrayList<>();

        while (a-- > 0){
            String[] tokens = reader.readLine().split(" ");

            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);

            Person p = new Person(name,age);

            people.add(p);
        }

        people.stream().sorted((f,s) -> f.getName().compareTo(s.getName()))
                .filter(p-> p.getAge() > 30)
                .forEach(p-> System.out.println(p.getName() + " - " + p.getAge()));
    }
}
