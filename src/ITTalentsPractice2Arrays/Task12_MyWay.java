package ITTalentsPractice2Arrays;

import javax.naming.spi.StateFactory;
import java.util.Scanner;

public class Task12_MyWay {
    public static void main(String[] args) {
       /* Да се напише програма която изисква от потребителя да въведе
        2 числа rows и m. След това да се построи матрица с размер rows x m по
        следният начин (примерите са дадени за въведени rows=4 и m=5):
        1 5 9 13 17
        2 6 10 14 18
        3 7 11 15 19
        4 8 12 16 20*/
        Scanner sc = new Scanner(System.in);
        int rows;
        int col;
        do {
            System.out.println("Please insert the number of rows rows:");
            rows = sc.nextInt();
            System.out.println("Please insert the number of columns m:");
            col = sc.nextInt();
        }while (rows<0&&col<0);
        int[][] table = new int[rows][col];
        int count=10;
        for (int j = 0; j < col; j++) {
            for (int i = 0; i < rows; i++) {
                table[i][j]=count++;
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
