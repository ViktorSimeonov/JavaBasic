package ITTalentsHomeWork1;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*������ 16: �������� � ���������� ���������� ����� �� ����
        abc.������ �� �� ������� ����:
        � ��� a = b = c, �����: ������� �� �����;
        � ��� a>b>c, �����: ������� �� ��� �������� ���;
        � ��� a<b<c, �����: ������� �� � �������� ���;
        � � �����: ������� �� ����������, �� ����������� ������.
        �� �� ������� ��������, ����� ������� ��������� �� ���������� ��
        ������� �� ������� � �������.
        � ������: 345
        � �����: �������� ���.*/
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        if (num1 == num2 && num1 == num3) {
            System.out.println("������� �� �����");
        } else if (num1 > num2 && num2 > num3) {
            System.out.println("������� �� ��� �������� ���");
        } else if (num1 < num2 && num2 < num3) {
            System.out.println("������� �� � �������� ���");

        }else {
            System.out.println("������� �� ����������");
        }
    }
}
