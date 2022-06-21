package ConditionalStatements;

import java.util.Scanner;

public class E00ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceVacation = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());
        double allMoney = puzzles * 2.6 + dolls * 3 + bears * 4.10 +
                minions * 8.2 + trucks * 2;
        if (puzzles + dolls + bears + minions
                + trucks >= 50) {
            allMoney = allMoney * 0.75;
        }
        allMoney = allMoney * 0.9;
        if (allMoney >= priceVacation) {
            System.out.printf("Yes! %.2f lv left.", (allMoney - priceVacation));
        } else
            System.out.printf("Not enough money! %.2f lv needed.", priceVacation - allMoney);
    }
}
