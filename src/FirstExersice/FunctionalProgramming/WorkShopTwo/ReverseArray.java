package FirstExersice.FunctionalProgramming.WorkShopTwo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(reader.readLine()
                .split(" ")).mapToInt(Integer::parseInt).toArray();

        printReversetArray(arr, arr.length - 1);
            

    }

    private static void printReversetArray(int[] arr, int index) {
        if (index < 0){
            return;
        }
            System.out.print(arr[index] + " ");
            printReversetArray(arr,index - 1);

    }


}
