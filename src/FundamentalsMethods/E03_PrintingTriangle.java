package FundamentalsMethods;

import java.util.Scanner;

public class E03_PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        upperPartOfPyramid(num);
        downPartOfPyramid(num);
    }

    private static void upperPartOfPyramid(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    private static void downPartOfPyramid(int num) {
        for (int i = num-1; i >0 ; i--) {
            for (int j = i; j >=1 ; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
