package FundamentalsExerciseDataTypesAndVariables;

import java.util.Scanner;

public class E04_SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());
        int sum=0;
        for (int i = 1; i <= lines; i++) {
            String input = scanner.nextLine();
            char ch = input.charAt(0);
            sum+=(int)ch;
        }
        System.out.printf("The sum equals: %d",sum);
    }
}
