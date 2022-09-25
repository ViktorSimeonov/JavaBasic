package FundamentalsArrays;

import java.util.Arrays;
import java.util.Scanner;

public class L06_EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr1 = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int[] arr2 = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(value -> Integer.parseInt(value)).toArray();
        int sum = 0;
        boolean equal = true;
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
            if (arr1[i] != arr2[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                equal = false;
                break;
            }
        }
        if (equal) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
