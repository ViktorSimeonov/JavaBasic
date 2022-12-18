package ITTalentsPractice2Arrays;

import java.util.Scanner;

public class Task14_MyWay {
    public static void main(String[] args) {
       /* Да се напише програма която изисква от потребителя да въведе
        2 числа n и m. След това да се построи матрица с размер n x m по
        следният начин (примерите са дадени за въведени n=4 и m=5):
        1 3 6 10 14
        2 5 9 13 17
        4 8 12 16 19
        7 11 15 18 20*/

        Scanner sc = new Scanner(System.in);
        int rows;
        int cols;
        do {
            System.out.println("Please insert rows: ");
            rows = sc.nextInt();
            System.out.println("Please insert cols: ");
            cols = sc.nextInt();
        } while (rows < 0 && cols < 0);
        int table[][] = new int[rows][cols];
        int count = 10;
        int startI = 0;
        int startJ = 0;
        int i = 0;
        int j = 0;
        for (int cell = 0; cell < rows * cols; cell++) {
            table[i][j] = count++;
            i--;
            j++;
            if (i < 0 || j == cols) {
                if(startI<rows-1){
                    startI++;
                }
                else {
                    startJ++;

                }
                i = startI;
                j = startJ;
            }

        }
        for (int k = 0; k < table.length; k++) {
            for (int l = 0; l < table[k].length; l++) {
                System.out.print(table[k][l]+" ");
            }
            System.out.println();
        }
    }
}
