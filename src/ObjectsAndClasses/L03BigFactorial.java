package ObjectsAndClasses;

import java.math.BigInteger;
import java.util.Scanner;

public class L03BigFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        //int result=1;
        BigInteger factorial = new BigInteger(String.valueOf(1));
        for (int i = 1; i <= number; i++) {
            factorial=factorial.multiply( BigInteger.valueOf(i));

        }
        System.out.println(factorial);

    }
}
