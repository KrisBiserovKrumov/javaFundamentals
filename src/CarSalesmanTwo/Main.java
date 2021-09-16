package CarSalesmanTwo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int engineCount = Integer.parseInt(reader.readLine());
        Map<String,Engine> engineMap = new HashMap<>();

        while (engineCount-- > 0){
            String[] engineParts = reader.readLine().split(" ");
            Engine newEngine = null;
            if (engineParts.length == 2){
                newEngine = new Engine(engineParts[0],engineParts[1]);
            }else if (engineParts.length == 3){
                newEngine = new Engine(engineParts[0],engineParts[1]);
                try {
                    Integer.parseInt(engineParts[2]);
                    newEngine.setDisplacement(engineParts[2]);

                }catch (NumberFormatException e){
                    newEngine.setEfficiency(engineParts[2]);

                }
            }else {
                newEngine = new Engine(engineParts[0],engineParts[1],engineParts[2],engineParts[3]);
            }
            engineMap.put(newEngine.getModel(),newEngine);
        }
        int carCount = Integer.parseInt(reader.readLine());
        List<Car> cars = new ArrayList<>();

        while (carCount -- > 0){
            String[] carParts = reader.readLine().split(" ");
            Car newCar = null;
            Engine current = engineMap.get(carParts[1]);
            if (carParts.length == 2){
                newCar = new Car(carParts[0],current);
            }else if (carParts.length == 3){
                newCar = new Car(carParts[0],current);
                try {
                    Integer.parseInt(carParts[2]);
                    newCar.setWeight(carParts[2]);

                }catch (NumberFormatException e){
                    newCar.setColor(carParts[2]);

                }

            }else {
                newCar = new Car(carParts[0],current,carParts[2],carParts[3]);
            }
            cars.add(newCar);

        }
        cars.forEach(c-> System.out.println(c.toString()));
    }
}
