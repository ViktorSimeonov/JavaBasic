package ITTalentsHomeWork2;

import java.util.Scanner;

public class Task8Rec {
    public static void main(String[] args) {

      /*  ������ 8: �� �������� ����� n, �� �� ������ �� ������ ������� ��
        ������� �����:
        input 6
        555555
        777777
        999999
        111111111111
        131313131313
        151515151515

        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("���� �������� ���� ���� ����� �� ������ �� 0");
        int n = scanner.nextInt();
        while (n <= 0) {
            System.out.println("�������� � ����� ����� ���������, ���� �������� ���");
            n = scanner.nextInt();
        }
        int start = n - 1;
        int end = (2 * n + (n - 2));
       /* for (int i = start; i <= (2*n+(n-2)); i+= 2) {

            for (int j = 0; j < n; j++) {
                System.out.print(i);
            }
            System.out.println();
        }*/

        printLikeThis(n, start, end);

    }

    static void printLikeThis(int n, int start, int end) {
        if (start >= end) {
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(start);
        }
        System.out.println();
        printLikeThis(n, start + 2, end);
    }
}
