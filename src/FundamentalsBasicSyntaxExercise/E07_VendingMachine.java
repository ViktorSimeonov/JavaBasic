package FundamentalsBasicSyntaxExercise;

import java.util.Scanner;

public class E07_VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        double sum = 0;
        double coin;
        while (!"Start".equals(input = scanner.nextLine())) {
            coin = Double.parseDouble(input);
            if (coin == 0.1) {
                sum += coin;
            } else if (coin == 0.2) {
                sum += coin;
            } else if (coin == 0.5) {
                sum += coin;
            } else if (coin == 1) {
                sum += coin;
            } else if (coin == 2) {
                sum += coin;
            } else {
                System.out.printf("Cannot accept %.2f%n", coin);
            }
        }
        while (!"End".equals(input = scanner.nextLine())) {
            switch (input) {
                case "Nuts":
                    if(sum <2.0){
                        System.out.println("Sorry, not enough money");
                        break;
                    }
                    sum -= 2.0;
                    System.out.printf("Purchased %s%n",input);
                    break;
                case "Water":
                    if(sum <0.7){
                        System.out.println("Sorry, not enough money");
                        break;
                    }
                    sum -= 0.7;
                    System.out.printf("Purchased %s%n",input);
                    break;
                case "Crisps":
                    if(sum <1.5){
                        System.out.println("Sorry, not enough money");
                        break;
                    }
                    sum -= 1.5;
                    System.out.printf("Purchased %s%n",input);
                    break;
                case "Soda":
                    if(sum <0.8){
                        System.out.println("Sorry, not enough money");
                        break;
                    }
                    sum -= 0.8;
                    System.out.printf("Purchased %s%n",input);
                    break;
                case "Coke":
                    if(sum <1){
                        System.out.println("Sorry, not enough money");
                        break;
                    }
                    sum -= 1.0;
                    System.out.printf("Purchased %s%n",input);
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }

        }

        System.out.printf("Change: %.2f", sum);

    }
}
