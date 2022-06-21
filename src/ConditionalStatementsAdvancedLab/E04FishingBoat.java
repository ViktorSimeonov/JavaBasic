package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class E04FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double fisher = Double.parseDouble(scanner.nextLine());
        double price = 0;
        switch (season) {
            case "Spring":
                price = 3000;
                break;
            case "Summer":
            case "Autumn":
                price = 4200;
                break;
            case "Winter":
                price = 2600;
                break;
            default:
                break;
        }
        if (fisher <= 6) {
            price *= 0.9;
        } else if (fisher <= 11) {
            price *= 0.85;
        } else if (fisher > 12) {
            price *= 0.75;
        }
        if (fisher % 2 == 0 && !season.equals("Autumn")) {
            price *= 0.95;
        }
        if (budget >= price) {
            System.out.printf("Yes! You have %.2f leva left.", (budget - price));
        } else {
            System.out.printf("Not enough money! You need %.2f leva.",(price-budget));
        }
    }
}

