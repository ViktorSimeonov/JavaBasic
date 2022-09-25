package FundamentalsArrays;

import java.util.Arrays;
import java.util.Scanner;

public class L05_EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(value -> Integer.parseInt(value)).toArray();
        int sumOdd = 0;
        int sumEven = 0;
        for (int num : numbers) {
            if(num%2==0){
                sumEven+=num;
            }else {
                sumOdd+=num;
            }

        }
        System.out.println(sumEven-sumOdd);
    }
}
