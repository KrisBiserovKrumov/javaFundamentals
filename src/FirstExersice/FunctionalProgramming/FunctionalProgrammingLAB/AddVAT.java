package FirstExersice.FunctionalProgramming.FunctionalProgrammingLAB;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class AddVAT {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] prices = scan.nextLine().split(", ");
        UnaryOperator<Double> addVat = d -> d * 1.2;
        System.out.println("Prices with VAT:");
        Arrays.stream(prices).map(Double::parseDouble).map(addVat)
                .forEach(e-> System.out.printf("%.2f%n",e));
    }
}
