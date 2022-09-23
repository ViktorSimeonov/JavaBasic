package FundamentalsDataTypesAndVariables;

import java.util.Scanner;

public class L10_SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            int number = i;
            while (number != 0) {
                int num = number % 10;
                sum += num;
                number = number / 10;
            }
            if (sum == 5 || sum == 7 || sum == 11||i == 5 || i == 7 ) {
                System.out.printf("%d -> True%n", i);
            } else {
                System.out.printf("%d -> False%n", i);

            }
        }

    }
}
