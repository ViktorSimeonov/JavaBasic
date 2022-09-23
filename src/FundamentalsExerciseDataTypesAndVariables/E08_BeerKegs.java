package FundamentalsExerciseDataTypesAndVariables;

import java.util.Scanner;

public class E08_BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfKegs = Integer.parseInt(scanner.nextLine());
        double maxVolume = Double.MIN_VALUE;
        String maxModel="";
        for (int i = 0; i < countOfKegs; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI* Math.pow(radius,2)*height;
            if (volume>maxVolume){
                maxVolume=volume;
                maxModel=model;
            }
        }
        System.out.println(maxModel);
    }
}
