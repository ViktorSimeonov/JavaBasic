package ConditionalStatements;

import java.util.Scanner;

public class L07AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();

        if ("square".equals(figure)) {
            double a = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", (a * a));
        } else if ("rectangle".equals(figure)) {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", (a * b));
        } else if ("circle".equals(figure)) {
            double r = Double.parseDouble(scanner.nextLine());
            double s = Math.PI * Math.pow(r, 2);
            System.out.printf("%.3f", s);
        } else if ("triangle".equals(figure)) {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", ((a * b) / 2));
        }
    }
}
