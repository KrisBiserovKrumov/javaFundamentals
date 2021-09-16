package DefiningClassesTWO;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int carCount = Integer.parseInt(reader.readLine());
        for (int i = 0; i < carCount ; i++) {
            String[] carsParts = reader.readLine().split(" ");
            Car current = new Car();
            if (carsParts.length == 3){
                current = new Car(carsParts[0],carsParts[1],Integer.parseInt(carsParts[2]));

            }else {
                current = new Car(carsParts[0]);
            }
            System.out.printf("The car is: %s %s - %d HP.%n",
                    current.getMake(),current.getModel(),current.getHorsePower());

        }
    }
}
