package FundamentalsMethods;

import java.util.Scanner;

public class E01_SignOfIntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        pintSign(number);
    }

    private static void pintSign(int number) {
        if(number>0){
            System.out.printf("The number %d is positive.",number);
        } else if (number<0) {
            System.out.printf("The number %d is negative.",number);
        }else {
            System.out.printf("The number %d is zero.",number);

        }
    }
}
