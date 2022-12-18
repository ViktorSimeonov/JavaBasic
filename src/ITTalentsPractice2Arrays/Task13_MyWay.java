package ITTalentsPractice2Arrays;

import java.util.Scanner;

public class Task13_MyWay {
    public static void main(String[] args) {
       /* �� �� ������ �������� ����� ������� �� ����������� �� ������
        2 ����� n � m. ���� ���� �� �� ������� ������� � ������ n x m ��
        �������� ����� (��������� �� ������ �� �������� n=4 � m=5):
        1 8 9 16 17
        2 7 10 15 18
        3 6 11 14 19
        4 5 12 13 20*/
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
        for (int i = 0; i < cols; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < rows; j++) {
                    table[j][i] = count++;
                }
            } else {
                for (int j = rows-1; j >= 0; j--) {
                    table[j][i] = count++;
                }
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
