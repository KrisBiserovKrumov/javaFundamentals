package Generics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());

        while (a-- > 0){

            String line = reader.readLine();

            Box<Integer> box = new Box<>(Integer.parseInt(line));
            System.out.println(box.toString());

        }
    }
}
