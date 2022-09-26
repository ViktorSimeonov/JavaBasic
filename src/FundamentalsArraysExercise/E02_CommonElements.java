package FundamentalsArraysExercise;

import java.util.Scanner;

public class E02_CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr1 =scanner.nextLine().split(" ");
        String[] arr2 = scanner.nextLine().split(" ");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if(arr2[i].equals(arr1[j])){
                    System.out.printf("%s ",arr2[i]);
                }
            }
        }
    }
}
