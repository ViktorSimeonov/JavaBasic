package FundamentalsArraysExercise;

import java.util.Scanner;

public class E04_ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");
        int rotation = Integer.parseInt(scanner.nextLine());
        String firstIndex = "";
        rotation = rotation % arr.length;
        for (int i = 0 ; i < rotation; i++) {
            firstIndex = arr[0];
            for (int j = 0; j < arr.length-1; j++) {
                arr[j]=arr[j+1];
            }
            arr[arr.length-1]=firstIndex;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%s ",arr[i]);
        }
    }
}
