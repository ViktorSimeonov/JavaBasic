package WhileLoop;

import java.util.Scanner;

public class L05AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double sum = 0;
        while (!input.equals("NoMoreMoney")) {
            double incomesMoney = Double.parseDouble(input);
            if (incomesMoney >= 0) {
                System.out.printf("Increase: %.2f%n", incomesMoney);
                sum += incomesMoney;
            } else if (incomesMoney<0) {
                System.out.println("Invalid operation!");
                break;
            }
           input = scanner.nextLine();
        }
        System.out.printf("Total: %.2f%n",sum);
    }
}
