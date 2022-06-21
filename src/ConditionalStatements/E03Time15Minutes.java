package ConditionalStatements;

import java.util.Scanner;

public class E03Time15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());
        int minPlus = min + 15;
        if (minPlus >= 60) {
            hour += 1;
            minPlus -= 60;
        }
        if (hour == 24) {
            hour = 0;
        }
        if (minPlus < 10) {
            System.out.printf("%d:0%d", hour, minPlus);

        } else
            System.out.printf("%d:%d", hour, minPlus);
    }
}
