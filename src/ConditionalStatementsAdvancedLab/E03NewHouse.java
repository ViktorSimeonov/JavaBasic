package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class E03NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowerType = scanner.nextLine();
        int flowersCount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double price = 0;
        switch (flowerType) {
            case "Roses":
                if (flowersCount > 80) {
                    price = flowersCount * 5 * 0.9;
                } else {
                    price = flowersCount * 5;
                }
                break;
            case "Dahlias":
                if (flowersCount > 90) {
                    price = flowersCount * 3.80 * 0.85;
                } else {
                    price = flowersCount * 3.8;
                }
                break;
            case "Tulips":
                if (flowersCount > 80) {
                    price = flowersCount * 2.80 * 0.85;
                } else {
                    price = flowersCount * 2.8;
                }
                break;
            case "Narcissus":
                if (flowersCount < 120) {
                    price = flowersCount * 3 * 1.15;
                } else {
                    price = flowersCount * 3;
                }
                break;
            case "Gladiolus":
                if (flowersCount < 80) {
                    price = flowersCount * 2.5 * 1.2;
                } else {
                    price = flowersCount * 2.5;
                }
                break;
            default:
                break;
        }
        if (budget > price) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowersCount, flowerType, (budget * 1.0 - price));
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", (price - budget * 1.0));
        }
    }
}
