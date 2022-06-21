package ForLoop;

import java.util.Scanner;

public class L09LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sumL = 0;
        int sumR = 0;
        for (int i = 0; i < n; i++) {
            sumL += Integer.parseInt(scanner.nextLine());

        }
        for (int i = 0; i < n; i++) {
            sumR += Integer.parseInt(scanner.nextLine());
        }
        if (sumL == sumR) {
            System.out.printf("Yes, sum = %d",sumL);
        }else {
            System.out.printf("No, diff = %d",Math.abs(sumL-sumR));
        }
    }
}
