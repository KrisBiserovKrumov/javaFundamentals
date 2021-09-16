package FirstExersice.FunctionalProgramming.SetsAndMaps.SetsAndMapsLAB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Voina {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> firstPlayerCards = Arrays.stream(reader.readLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        LinkedHashSet<Integer> firstPlayer = new LinkedHashSet<>(firstPlayerCards);

        List<Integer> secondPlayerCards = Arrays.stream(reader.readLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        LinkedHashSet<Integer> secondPlayer = new LinkedHashSet<>();
        secondPlayer.addAll(secondPlayerCards);
        for (int round = 0; round < 50; round++) {
            if (firstPlayer.isEmpty()){
                System.out.println("Second player win!");
                return;
            }
            if (secondPlayer.isEmpty()){
                System.out.println("First player win!");
                return;
            }
            Integer firstCard = getTopValue(firstPlayer);
            Integer secondCard = getTopValue(secondPlayer);

            firstPlayer.remove(firstCard);
            secondPlayer.remove(secondCard);

            if (firstCard > secondCard){
                firstPlayer.add(firstCard);
                firstPlayer.add(secondCard);
            }else if (secondCard > firstCard){
                secondPlayer.add(firstCard);
                secondPlayer.add(secondCard);
            }else {
                firstPlayer.add(firstCard);
                secondPlayer.add(secondCard);
            }

        }
        if (firstPlayer.size() > secondPlayer.size()){
            System.out.println("First player win!");

        }else if (secondPlayer.size() > firstPlayer.size()){
            System.out.println("Second player win!");

        }else {
            System.out.println("Draw!");
        }
    }

    private static Integer getTopValue(LinkedHashSet<Integer> set) {
        for (Integer integer : set) {
            return integer;
        }
        return 0;
    }
}
