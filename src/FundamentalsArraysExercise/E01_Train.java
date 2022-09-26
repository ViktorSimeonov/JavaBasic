package FundamentalsArraysExercise;

import java.util.Scanner;

public class E01_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[Integer.parseInt(scanner.nextLine())];
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(scanner.nextLine());
            sum+=arr[i];
            System.out.printf("%d ",arr[i]);
        }
        System.out.printf("%n%d",sum);
    }
}
