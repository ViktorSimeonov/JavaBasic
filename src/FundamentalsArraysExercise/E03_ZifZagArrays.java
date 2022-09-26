package FundamentalsArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class E03_ZifZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int[] arr1 = new int[num];
        int[] arr2 = new int[num];
        for (int i = 0; i < num; i++) {
            int[] nextArr = Arrays.stream(scanner.nextLine().split(" ")).
                    mapToInt(value -> Integer.parseInt(value)).toArray();
            if (i % 2 == 0) {
               arr1[i]=nextArr[0];
               arr2[i]=nextArr[1];
            }else {
                arr2[i]=nextArr[0];
                arr1[i]=nextArr[1];

            }
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("%d ",arr1[i]);
        }
        System.out.printf("%n");
        for (int i = 0; i < arr2.length; i++) {
            System.out.printf("%d ",arr2[i]);
        }
    }
}
