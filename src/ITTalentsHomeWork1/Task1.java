package ITTalentsHomeWork1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*������ 1: �� �� ������� ��������� ��� ����������� � �� ��
        �������� 2 ����� �� ������������ A � B (���� �� �� � �������
        ������� � double). ����� �� �� ������� 3-�� ����� C � �� ��
        ������� ���� �� � �/� A � B. �� �� ������ ��������� ���������
        �� ���� ���� C � ����� A � B.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("game");
        System.out.println("�� ��������");
        System.out.println("�������� �:");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("�������� B:");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("�������� C:");
        double c = Double.parseDouble(scanner.nextLine());
        if (c > a && c < b) {
            System.out.printf("������� %.1f � ����� %.1f � %.1f",c,a,b);
        } else if (c < a && c > b) {
            System.out.printf("������� %.1f � ����� %.1f � %.1f",c,b,a);
        }else {
            System.out.printf("������� %.1f �� � ����� %.1f � %.1f",c,b,a);
        }
    }
}
