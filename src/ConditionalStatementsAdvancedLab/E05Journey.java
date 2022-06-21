package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class E05Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String location = "";
        String sleepingPlace = "";
        double spend = 0;
        if (budget <= 100) {
            location="Bulgaria";
            switch (season) {
                case "summer":
                    spend = budget * 0.3;
                    sleepingPlace = "Camp";
                    break;
                case "winter":
                    spend = budget * 0.7;
                    sleepingPlace = "Hotel";
                    break;
                default:
                    break;
            }
        } else if (budget <= 1000) {
            location="Balkans";
            switch (season) {
                case "summer":
                    spend = budget * 0.4;
                    sleepingPlace = "Camp";
                    break;
                case "winter":
                    spend = budget * 0.8;
                    sleepingPlace = "Hotel";
                    break;
                default:
                    break;
            }
        } else if (budget > 1000) {
            location="Europe";
            spend = budget * 0.9;
            sleepingPlace = "Hotel";
        }
        System.out.printf("Somewhere in %s%n",location);
        System.out.printf("%s - %.2f",sleepingPlace,spend);
    }
}