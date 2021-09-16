package DefiningClasses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int carCount = Integer.parseInt(reader.readLine());
        for (int i = 0; i < carCount ; i++) {
            String[] carsParts = reader.readLine().split(" ");
            carInfo current = new carInfo();
            current.setMake(carsParts[0]);
            current.setModel(carsParts[1]);
            current.setHorsePower(Integer.parseInt(carsParts[2]));
            System.out.printf("The car is: %s %s - %d HP.%n",
                    current.getMake(),current.getModel(),current.getHorsePower());

        }
    }
}
