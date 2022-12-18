package Hacker;

import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        /*Input Format
        The first line contains a single integer, , the number of rows and columns in the square matrix .
        Each of the next  lines describes a row, , and consists of  space-separated integers .

                Constraints

        Output Format

        Return the absolute difference between the sums of the matrix's two diagonals as a single integer.

        Sample Input

        3
        11 2 4
        4 5 6
        10 8 -12*/
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[][] myArray = new int[size][size];
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                myArray[i][j] = sc.nextInt();
            }
        }
        int sumMainDiagonal = 0;
        int sumSecondMainDiagonal = 0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                if (i == j) {
                    sumMainDiagonal += myArray[i][j];
                }
                if ((i + j) == myArray.length - 1) {
                    sumSecondMainDiagonal += myArray[i][j];
                }
            }
        }
        System.out.println(Math.abs(sumMainDiagonal - sumSecondMainDiagonal));
    }
}
