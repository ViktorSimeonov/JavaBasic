package FundamentalsArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class E05_TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(value -> Integer.parseInt(value)).toArray();
        int numRotation = 0;
        if (numbers.length == 1) {
            System.out.println(numbers[0]);
            System.exit(1);
        }
        for (int i = 0; i < numbers.length - 1; i++) {

            if (numbers[i + 1] >= numbers[i]) {
                numbers[i] = numbers[i + 1];
                numRotation++;
                for (int j = i + 1; j < numbers.length - 1; j++) {
                    numbers[j] = numbers[j + 1];
                }

                i = 0;
            }/*else {
                    numbers[i]=numbers[i];
                }*/
        }
        if (numbers[0] < numbers[1]) {
            numbers[0] = numbers[1];
            numRotation++;
        }
        for (int i = 0; i < numbers.length - numRotation; i++) {
            System.out.printf("%d ", numbers[i]);

        }
    }
}
