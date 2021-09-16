package Generics.GenericCountMethodStrings;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Box< E extends Comparable<E>> {
    private E element;

    public Box(E element) {
        this.element = element;
    }
    @Override
    public String toString(){
        return this.element.getClass().getName() + ": " + this.element;
    }



    public int compareTo(Box<E> o) {
        return this.element.compareTo(o.element);
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        List<Box<Double>> listOfStrings = new ArrayList<>();


        while (a-- > 0){
            String line = reader.readLine();
            Box<Double> box = new Box<>(Double.parseDouble(line));
            listOfStrings.add(box);
        }
        String line = reader.readLine();
        Box<Double> comparatorBox = new Box<>(Double.parseDouble(line));
        System.out.println(countGraterValues(listOfStrings,comparatorBox));
    }
    public static <T extends Comparable<T>>
    int countGraterValues (List <Box<T>> list, Box<T> box){
        int counter = 0;
        for (Box<T> tBox : list) {
            if (tBox.compareTo(box) > 0 ){
                counter ++ ;
            }

        }
        return counter;

    }
}
