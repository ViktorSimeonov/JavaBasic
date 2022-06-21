package FirstStepInCodingLab;

import java.util.Scanner;

public class VariableType {
    public static void main(String[] args) {
        System.out.println("Hello how is your name");
        Scanner scanner = new Scanner(System.in);
       String name = scanner.nextLine();
        System.out.println(name);
        System.out.println("please write your family name");
        String family = scanner.nextLine();
        System.out.println(family);
        System.out.println("nice to meet you"+ family);
        System.out.println("insert number");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println("your number is "+number);
        System.out.println("insert double");
        double grade = Double.parseDouble(scanner.nextLine());
        System.out.println(grade);

        //int number = 100;
        //double grade = 4.20;
        //System.out.println(number);
        //grade=number*0.5;
        //System.out.println(grade);
        //String name = "Viki";
        //char building = 'A';
        //System.out.println(building);
        //System.out.println(name);
    }
}
