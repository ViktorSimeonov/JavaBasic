package PFMidExamRetake12August2020;

import java.util.Scanner;

public class ComputerStore01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        double price = 0;
        double priceWithoutTaxes = 0;
        double taxes = 0;
        while (!(command.equals("special") || command.equals("regular"))) {
            double input = Double.parseDouble(command);
            if (input < 0) {
                System.out.println("Invalid price!");
            } else {

                priceWithoutTaxes += input;
            }
            command = scanner.nextLine();
        }if (command.equals("special")) {
                if (priceWithoutTaxes == 0) {
                    System.out.println("Invalid order!");
                    return;
                }
                price = priceWithoutTaxes * 1.2;
                System.out.printf("Congratulations you've just bought a new computer!%n");
                System.out.printf("Price without taxes: %.2f$%n", priceWithoutTaxes);
                System.out.printf("Taxes: %.2f$%n", (price - priceWithoutTaxes));
                System.out.printf("-----------%n");
                System.out.printf("Total price: %.2f$%n", (price * 0.9));
            } else if (command.equals("regular")) {
            if (priceWithoutTaxes == 0) {
                System.out.println("Invalid order!");
                return;
            }
                price = priceWithoutTaxes * 1.2;
                System.out.printf("Congratulations you've just bought a new computer!%n");
                System.out.printf("Price without taxes: %.2f$%n", priceWithoutTaxes);
                System.out.printf("Taxes: %.2f$%n", (price - priceWithoutTaxes));
                System.out.printf("-----------%n");
                System.out.printf("Total price: %.2f$%n", price);
            }
        }
    }

