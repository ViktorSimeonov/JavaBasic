package ForLoop;

import java.util.Scanner;

public class E03Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;
        double p1Procent = 0;
        double p2Procent = 0;
        double p3Procent = 0;
        double p4Procent = 0;
        double p5Procent = 0;
        for (int i = 0; i < n; i++) {
            int nextNum = Integer.parseInt(scanner.nextLine());
            if (nextNum < 200) {
                p1++;
            } else if (nextNum < 400) {
                p2++;
            } else if (nextNum < 600) {
                p3++;
            } else if (nextNum < 800) {
                p4++;
            } else {
                p5++;
            }
            p1Procent = p1 * 1.0 / n * 100;
            p2Procent = p2 * 1.0 / n * 100;
            p3Procent = p3 * 1.0 / n * 100;
            p4Procent = p4 * 1.0 / n * 100;
            p5Procent = p5 * 1.0 / n * 100;
        }

        System.out.printf("%.2f%%%n", p1Procent);
        System.out.printf("%.2f%%%n", p2Procent);
        System.out.printf("%.2f%%%n", p3Procent);
        System.out.printf("%.2f%%%n", p4Procent);
        System.out.printf("%.2f%%%n", p5Procent);
    }
}

