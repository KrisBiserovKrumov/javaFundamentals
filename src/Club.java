import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Club {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int capasity = Integer.parseInt(reader.readLine());
        String[] commands = reader.readLine().split(" ");
    }
}
