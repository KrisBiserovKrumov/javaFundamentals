package ListyIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> data = Arrays.stream(reader.readLine()
                .split(" ")).skip(1).collect(Collectors.toCollection(ArrayList::new));
        ListIterator listIterator = new ListIterator(data);

        String line = reader.readLine();

        while (!line.equalsIgnoreCase("END")){
            switch (line){
                case "Move":
                    System.out.println(listIterator.move());
                    break;
                case "Print":
                    try {
                        System.out.println(listIterator.print());
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case "HasNext":
                    System.out.println(listIterator.hasNext());
                    break;
                case "PrintAll":
                    for (String s : listIterator) {
                        System.out.print(s + " ");
                    }
                    System.out.println();

                    break;

            }
            line = reader.readLine();

        }

    }
}
