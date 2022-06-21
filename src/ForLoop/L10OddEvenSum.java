package ForLoop;

import java.util.Scanner;

public class L10OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int even = 0;
        int odd = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                even += Integer.parseInt(scanner.nextLine());
            } else {
                odd += Integer.parseInt(scanner.nextLine());
            }


        }
        if (even == odd) {
            System.out.printf("Yes%nSum = %d", even);
        } else {
            System.out.printf("No%nDiff = %d%n", Math.abs(even - odd));
        }
    }
}
