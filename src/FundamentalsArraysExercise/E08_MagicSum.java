package FundamentalsArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class E08_MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split(" ")).
                mapToInt(Integer::parseInt).toArray();
        int magicNum = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < input.length; i++) {
            int currentNum = input[i];
            for (int j = i; j < input.length; j++) {

                if (magicNum == currentNum + input[j]) {
                    if (i == j) {
                        continue;
                    } else {
                        System.out.printf("%d %d%n", input[i], input[j]);
                    }
                }
            }
        }

    }
}

