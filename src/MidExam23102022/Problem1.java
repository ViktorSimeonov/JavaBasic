package MidExam23102022;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        double flourPrice = Double.parseDouble(scanner.nextLine());
        double eggPrice = Double.parseDouble(scanner.nextLine());
        double apronPrice = Double.parseDouble(scanner.nextLine());
        double eggsPriceAll = eggPrice * 10;

        double priceAllFlour = 0;
        for (int j = 1; j <= countOfStudents; j++) {
            if (j % 5 == 0) {
                continue;
            }
            priceAllFlour += flourPrice;
        }
        double priceAllApron =apronPrice *  Math.ceil((countOfStudents) * 1.2);
        double neededMoneyFroAllStudents = eggsPriceAll*countOfStudents + priceAllFlour + priceAllApron;
        if (neededMoneyFroAllStudents <= budget) {
            System.out.printf("Items purchased for %.2f$.", neededMoneyFroAllStudents);
        } else {
            System.out.printf("%.2f$ more needed.", Math.abs(budget - neededMoneyFroAllStudents));
        }
    }
}
