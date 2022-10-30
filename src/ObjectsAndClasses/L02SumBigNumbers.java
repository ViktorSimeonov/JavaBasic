package ObjectsAndClasses;

import java.math.BigInteger;
import java.util.Scanner;

public class L02SumBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger firstNum = new BigInteger(scanner.nextLine());
        BigInteger secondNum = new BigInteger(scanner.nextLine());
        BigInteger sum = secondNum.add(firstNum);
        System.out.println(sum);
    }
}
