package CarsConstructors;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        while (a-- > 0){
            String[] command = reader.readLine().split(" ");

            if (command.length == 3) {
                Car car = new Car(command[0],command[1],Integer.parseInt(command[2]));

                System.out.printf("The car is: %s %s - %d HP.%n",
                        car.getMark(), car.getModel(), car.getHorsePower());
            }else {
                Car car = new Car(command[0]);
                System.out.printf("The car is: %s %s - %d HP.%n",
                        car.getMark(), car.getModel(), car.getHorsePower());

            }
        }
    }
}
