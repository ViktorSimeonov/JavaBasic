package ITTalentsHomeWork2;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /* ������ 19: �� �� ������� ��������, ���� ����� �� ��������
        ���������� ����� �� ��������� [10..99] �� ������� ��������
        �����, ��� �������� �� �������� ����������:
        1) ��� ����������� ����� � ����� �� ������� 0.5*�������;
        2) ��� ����������� ����� � ������� �� ������� 3*������� +1.
        ����������� ���������� ������ �� �� ������ �������� 1.
        ������: 11
        �����: 34 17 52 26 13 40 20 10 5 16 8 4 2 1.*/
        System.out.println("���� �������� ���� ���������� ����� � ��������� [1..9] ");
        System.out.print("n=");
        int n = scanner.nextInt();
        while (n < 10 || n > 99) {
            System.out.println("�������� � ����� ����� ���������, ���� �������� ���");
            System.out.print("n=");
            n = scanner.nextInt();
        }
        int print;
        while (n > 1) {
            if (n % 2 != 0) {
                n = (3 * n + 1);
                System.out.printf(n+" ");
            } else  {
                n =n/2;
                System.out.print(n+" ");
            }

        }

    }
}
