package FundamentalsBasicSyntaxExercise;

import java.util.Scanner;

public class E09_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double price ;
        double totalPrice = 0;
        for (int i = 0; i < n; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsules = Integer.parseInt(scanner.nextLine());
            price = pricePerCapsule*days*capsules;
            System.out.printf("The price for the coffee is: $%.2f%n",price);
            totalPrice+=price;

        }
        System.out.printf("Total: $%.2f%n",totalPrice);
    }
}
