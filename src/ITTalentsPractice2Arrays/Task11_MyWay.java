package ITTalentsPractice2Arrays;

import java.util.Scanner;

public class Task11_MyWay {
    public static void main(String[] args) {
        /*�� �� ������ �������� ����� ������� �� ����������� �� ������
        2 ����� n � m. ���� ���� �� �� ������� ������� � ������ n x m ��
        �������� ����� (��������� �� ������ �� �������� n=4 � m=5):
        1 2 3 4 5
        6 7 8 9 10
        11 12 13 14 15
        16 17 18 19 20*/
        Scanner sc = new Scanner(System.in);
        int n;
        int m;
        do {
            System.out.println("Please insert the number of rows  n:");
            n = sc.nextInt();
            System.out.println("Please insert the number of columns n:");
            m = sc.nextInt();

        }while (n<0&&m<0);
        int[][] table = new int[n][m];
        int count=10;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
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
