package FirstStepInCodingLab;

import java.util.Scanner;

public class YardGreening9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        "The final price is: {крайна цена на услугата} lv."
//· "The discount is: {отстъпка} lv."
        double area = Double.parseDouble(scanner.nextLine());
        System.out.printf("The final price is: %.2f lv.%n",area*7.61-0.18*area*7.61);
        System.out.printf("The discount is: %.2f lv.",0.18*area*7.61);

    }
}
