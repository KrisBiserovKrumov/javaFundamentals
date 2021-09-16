package Generics.GenericSwapMethodStrings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        List<Box<String>> boxOfStrings = new ArrayList<>();


        while (a-- > 0){
            String line = reader.readLine();
            Box<String> box = new Box<>(line);
            boxOfStrings.add(box);
        }
        int[] indexes = Arrays.stream(reader.readLine()
                .split(" ")).mapToInt(Integer::parseInt).toArray();

        swapValues(boxOfStrings,indexes[0],indexes[1]);
        for (Box box:boxOfStrings) {
            System.out.println(box.toString());
            }



    }
    public static <T> void swapValues (List<T> list, int firstIndex, int secondIndex){
        T temp = list.get(firstIndex);
        list.set(firstIndex,list.get(secondIndex));
        list.set(secondIndex,temp);

    }
}
