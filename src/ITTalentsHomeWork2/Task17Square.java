package ITTalentsHomeWork2;

import java.util.Scanner;

public class Task17Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
/*        ������ 17:
        �� �� ������� ��������, ����� ������� �������, ����� ������ ��
        �������� ��� ����� *, � ������������ � ��������� ��� �������
        ����.
                ������ ����� b - ������� �� �������� ����� �� ���������
                [3..20], c - ����� ����.
                ���������� �� �������� ����� for.
        ������: 4 +
                �����:
                    ****
                    *++*
                    *++*
                    *****/
        System.out.println("���� �������� ������� �� �������� �� �������� ����� �� ��������� [3..20] ");
        System.out.print("b=");
        int b = scanner.nextInt();

        while (b < 3 || b > 20) {
            System.out.println("�������� � ����� ����� ���������, ���� �������� ���");
            System.out.print("b=");
            b = scanner.nextInt();
        }
        System.out.println("���� �������� ����� ���� �� �������� �� �������� ");

        char symbol = scanner.next().charAt(0);
        for (int i = 0; i < b; i++) {
            if (i == 0 || i == b-1) {
                for (int j = 0; j < b; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
                for (int k = 1; k < b-1; k++) {
                    System.out.print(symbol);
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
