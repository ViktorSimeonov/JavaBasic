package FirstStepInCodingLab;

import java.util.Scanner;

public class PetChop8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dogs = Double.parseDouble(scanner.nextLine());
        double cats = Double.parseDouble(scanner.nextLine());
        double result = dogs*2.50+cats*4;
        System.out.printf("%.1f lv.",result);
    }
}
