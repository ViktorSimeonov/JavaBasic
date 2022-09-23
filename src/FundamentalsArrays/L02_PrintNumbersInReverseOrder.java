package FundamentalsArrays;

import java.sql.Array;
import java.util.Scanner;

public class L02_PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = numbers.length-1; i >=0; i--) {
            System.out.print(numbers[i]+" ");
        }
    }
}
