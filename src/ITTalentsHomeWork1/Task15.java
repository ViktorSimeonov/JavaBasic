package ITTalentsHomeWork1;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        /*������ 15: �� �� ������� ��������, ����� ������� ����������
        ����� �� ��������� [0..24]. ���������� �� ������ �������������
        ��������� ��������� ��������� ���.��������� ��:
        � [18..4] - ����� �����;
        � [4..9] - ����� ����;
        � [9..18] - ����� ���
        � ������: 10
        � �����: ����� ���*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("���� �������� ���������� ����� �� ��������� [0..24]");
        int hour = scanner.nextInt();
        if (hour > 4 && hour <= 9) {
            System.out.println("����� ����");
        } else if (hour > 9 && hour <= 18) {
            System.out.println("����� ���");
        } else if (hour>18&&hour<24||hour>=0&&hour<=4) {
            System.out.println("����� �����");

        }
    }
}
