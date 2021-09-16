package FirstExersice.FunctionalProgramming.WorkShopTwo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class NestedLoopsToRecursion {
    private static int [] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        arr = new int[n];

        printNestedArray(n,0);
    }

    private static void printNestedArray(int n, int begin) {
        if (begin >= n ){
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }
        for (int i = 1; i <= n ; i++) {
            arr[begin] = i;
            printNestedArray(n, begin + 1);
            
        }
    }
}
