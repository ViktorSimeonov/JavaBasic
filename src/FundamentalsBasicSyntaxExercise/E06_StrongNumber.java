package FundamentalsBasicSyntaxExercise;

import java.util.Scanner;

public class E06_StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputStart = Integer.parseInt(scanner.nextLine());
        int input = inputStart;
        int inputSum=0;
        while (input != 0) {
            int number = input % 10;
            int sum = 1 ;
            if (number != 0) {
                for (int i = 1; i <= number; i++) {
                    sum *= i;
                }
            }
            inputSum+=sum;

            input = input / 10;
        }
        if(inputSum==inputStart){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
