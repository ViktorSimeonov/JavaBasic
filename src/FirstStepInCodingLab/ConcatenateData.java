package FirstStepInCodingLab;

import java.util.Scanner;

public class ConcatenateData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //"You are <firstName> <lastName>, a <age>-years old person from <town>."
        // You are <firstName> <lastName>, a <age>-years old person from <town>;
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        float age = Float.parseFloat(scanner.nextLine());
        String town = scanner.nextLine();

        //System.out.println("You are " + firstName +" "+ lastName +
              //  ", a " + age + "-years old person from " + town+".");
        System.out.printf("You are %s %s, a %.3f-years old person from %s.", firstName, lastName, age,town);
    }
}
