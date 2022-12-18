package ITTalentsLesson5Arrays;

import java.sql.SQLOutput;
import java.util.Scanner;

public class New2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Моля въведете брой колони");
        System.out.print("row:");
        int row = sc.nextInt();
        System.out.println("Моля въведете брой редове");
        System.out.print("col:");
        int col = sc.nextInt();
        int[][] table = new int[row][col];
        for (int i = 0; i < table.length ; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.println("Моля въведете:"+"["+i+"]"+"["+j+"]");
                table[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j]+" ");
            }
            System.out.println();
        }
    }
}
