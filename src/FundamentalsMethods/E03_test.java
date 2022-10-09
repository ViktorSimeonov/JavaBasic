package FundamentalsMethods;

import java.util.Scanner;

public class E03_test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = Integer.parseInt(scanner.nextLine());
        printPyramid(height);
    }

    private static void printPyramid(int height) {
        printTopHalf(height);
        printButtomHlaf(height);
    }

    private static void printTopHalf(int height) {
        for (int i = 1; i < height; i++) {
            printSingleLine(i);
        }

    }

    private static void printSingleLine(int lenght) {
        for (int i = 1; i <= lenght; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void printButtomHlaf(int height) {
    }
}
