package FundamentalsExerciseDataTypesAndVariables;

import java.util.Scanner;

public class E07_WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacity = 255;
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            int litersOfWater = Integer.parseInt(scanner.nextLine());
            if(capacity >= litersOfWater){
                capacity-=litersOfWater;
            }else {
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(255-capacity);

    }

}
