package FundamentalsBasicSyntaxExercise;

import java.util.Scanner;

public class E03_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfPeople = Integer.parseInt(scanner.nextLine());
        String typeOfPeople = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0;
        switch (day) {
            case "Friday":
                if (typeOfPeople.equals("Students")) {
                    price = 8.45 * countOfPeople;
                    if (countOfPeople >= 30) {
                        price *= 0.85;
                    }
                    //System.out.printf("Total price: %.2f%n", price);
                } else if (typeOfPeople.equals("Business")) {
                    price = 10.90 * countOfPeople;
                    if (countOfPeople >= 100) {
                        price = price - 10.90 * 10;
                    }
                    //System.out.printf("Total price: %.2f%n", price);

                } else if (typeOfPeople.equals("Regular")) {
                    price = 15 * countOfPeople;
                    if (countOfPeople >= 10 && countOfPeople <= 20){
                        price*=0.95;
                    }
                }
                System.out.printf("Total price: %.2f%n", price);
                break;
            case "Saturday":
                if (typeOfPeople.equals("Students")) {
                    price = 9.8 * countOfPeople;
                    if (countOfPeople >= 30) {
                        price *= 0.85;
                    }
                    //System.out.printf("Total price: %.2f%n", price);
                } else if (typeOfPeople.equals("Business")) {
                    price = 15.60 * countOfPeople;
                    if (countOfPeople >= 100) {
                        price = price - 15.60 * 10;
                    }
                    //System.out.printf("Total price: %.2f%n", price);

                } else if (typeOfPeople.equals("Regular")) {
                    price = 20 * countOfPeople;
                    if (countOfPeople >= 10 && countOfPeople <= 20){
                        price*=0.95;
                    }
                }
                System.out.printf("Total price: %.2f%n", price);
                break;
            case "Sunday":
                if (typeOfPeople.equals("Students")) {
                    price = 10.46 * countOfPeople;
                    if (countOfPeople >= 30) {
                        price *= 0.85;
                    }
                    //System.out.printf("Total price: %.2f%n", price);
                } else if (typeOfPeople.equals("Business")) {
                    price = 16 * countOfPeople;
                    if (countOfPeople >= 100) {
                        price = price - 16 * 10;
                    }
                    //System.out.printf("Total price: %.2f%n", price);

                } else if (typeOfPeople.equals("Regular")) {
                    price = 22.50 * countOfPeople;
                    if (countOfPeople >= 10 && countOfPeople <= 20){
                        price*=0.95;
                    }
                }
                System.out.printf("Total price: %.2f%n", price);
                break;

        }
    }
}
