package FirstExersice.FunctionalProgramming.FunctionalProgrammingLAB;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] words = scan.nextLine().split(" ");

        Predicate<String> isStarting = word ->Character.isUpperCase(word.charAt(0));
       List<String> capitalWords =  Arrays.stream(words).filter(isStarting)
               .collect(Collectors.toList());
        System.out.println(capitalWords.size());
        capitalWords.forEach(System.out::println);
    }
}
