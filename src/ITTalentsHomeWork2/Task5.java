package ITTalentsHomeWork2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
      /*  ������ 5: �� �� ������� �� ����������� 2 �����. � �� ��
        ������� �� ������ ������ ����� �� ��-������� �� ��-��������*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("���� �������� ��� ���� �����");
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        for (int i = firstNum; i <= secondNum; i++) {
            System.out.println(i);
        }
    }
}