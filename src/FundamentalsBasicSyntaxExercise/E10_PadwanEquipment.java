package FundamentalsBasicSyntaxExercise;

import java.util.Scanner;

public class E10_PadwanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        double priceOfLightsabers = Double.parseDouble(scanner.nextLine());
        double priceOfRobes = Double.parseDouble(scanner.nextLine());
        double priceOfBelt = Double.parseDouble(scanner.nextLine());
        double countOfLightsabers = Math.ceil(countOfStudents * 1.1);
        double discountBelt =0;
        if ( countOfStudents>=6){
            discountBelt = Math.floor(countOfStudents/6.0);
        }
        double sum = priceOfLightsabers * countOfLightsabers + countOfStudents * priceOfRobes + (countOfStudents-discountBelt) * priceOfBelt;
        if (amountOfMoney >= sum) {
            System.out.printf("The money is enough - it would cost %.2flv.%n", sum);
        } else {
            System.out.printf("George Lucas will need %.2flv more.%n", (sum - amountOfMoney));
        }
    }
}
