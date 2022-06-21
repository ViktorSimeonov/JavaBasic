package ForLoop;

import java.util.Scanner;

public class L08NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < num; i++) {
            int x = Integer.parseInt(scanner.nextLine());
            if (x < min) {
                min = x;
            } else if (x > max) {
                max = x;
            }
        }
        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);

    }
}

