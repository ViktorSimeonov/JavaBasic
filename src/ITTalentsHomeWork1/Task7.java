package ITTalentsHomeWork1;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
  /*      ������ 7:�������� 3 ���������� �� ������������ ����(���������� ���), ���� ����
                (����� � ������� �������), ���� ��� ����� ������ ���.��������� ��������, �����
        ����� ������� �� ������ �� ���� ����� �� ������� �����:
        ���� ��� �����, ���� �� �������
        ���� ��� �����, �� ����� �� ���� � ��������
        ���� ���� ����, �� �� ���� ���������
        ���� ����� ��� ���� ����� � �� ��� ���
        ���� ���� �� - ����� �� 10 ��, �� ����� �� ����.
                ���������� ������� �������� ���� ��������� � ���������.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("�������� ���� ���� ����� int a1=");
        System.out.println("�������� ����� �������� ���� ����� int a2=");
        System.out.println("�������� ����� �������� ���� ����� int a3=");
        System.out.println("�������� ����� ���� ������ ����� double a4=");
        System.out.println("�������� ������ ��������� (True ��� False) boolean=");
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        double money = Double.parseDouble(scanner.nextLine());
        boolean amIHealth = scanner.nextBoolean();
        if (amIHealth) {
            System.out.println("������ �� ���� � ���������");
        } else {
            System.out.println("������� �����, ���� �� �������");
        }
        if (money > 0) {
            System.out.println("�� �� ���� ���������");
        } else {
            System.out.println("�� ���� ���� � �� ��� ���");
        }
        if (money < 10) {
            System.out.println("������ �� ����");
        }

    }
}
