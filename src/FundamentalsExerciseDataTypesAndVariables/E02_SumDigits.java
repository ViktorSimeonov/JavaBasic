package FundamentalsExerciseDataTypesAndVariables;

import java.util.Scanner;

public class E02_SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int sum=0;
        while (num != 0) {
            int digit = num % 10;
            sum+=digit;
            num/=10;
        }
        System.out.println(sum);
    }
}
