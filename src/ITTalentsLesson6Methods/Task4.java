package ITTalentsLesson6Methods;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        //  read int x and int y and create two dimensional array full with 0 x/y
        // lesson page 128/task4
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[][] table = crateTable(x,y);
        printTable(table);
    }
    static int[][] crateTable(int x, int y){
        int[][] table = new int[x][y];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j]=0;
            }
        }
        return table;
    }
    static void printTable(int[][] table){
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
