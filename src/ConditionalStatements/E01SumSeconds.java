package ConditionalStatements;

import java.util.Scanner;

public class E01SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int time = a + b + c;
        int min = time / 60;
        int sec = time % 60;
        if (sec < 10) {
            System.out.printf("%d:0%d", min, sec);
        } else
            System.out.printf("%d:%d", min, sec);
    }
}
