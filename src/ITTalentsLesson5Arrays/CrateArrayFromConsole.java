package ITTalentsLesson5Arrays;

import java.util.Scanner;

public class CrateArrayFromConsole {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows");
        int row = sc.nextInt();
        System.out.print("Enter columns");
        int col = sc.nextInt();
        int[][] table = new int[row][col];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.printf("Въведете [%d] [%d ]",i,j);
                table[i][j]=sc.nextInt();
            }
        }
    }
}
