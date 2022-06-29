package ForLoop;

import java.util.Scanner;

public class E04CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int years = Integer.parseInt(scanner.nextLine());
        double priceWashMachine = Double.parseDouble(scanner.nextLine());
        int priceToy = Integer.parseInt(scanner.nextLine());
        int moneyBirthDay =0;
        int countTaken = 0;
        int toys = 0;
        int count=1;
        double allMoney;
        for (int i = 1; i <= years; i++) {
            if (i % 2 == 0) {
                moneyBirthDay = moneyBirthDay +count*10;
                countTaken++;
                count++;
            } else {
                toys++;
            }
        }
        allMoney = (moneyBirthDay - countTaken) + (toys * priceToy);
        if (allMoney >= priceWashMachine) {
            System.out.printf("Yes! %.2f", (allMoney - priceWashMachine));
        } else {
            System.out.printf("No! %.2f", (priceWashMachine - allMoney));
        }
    }
}
