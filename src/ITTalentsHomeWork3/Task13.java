package ITTalentsHomeWork3;

import java.util.Scanner;

public class Task13 {
    /*������ 13:
    �� �� ������� ��������, ���� ����� �� ������� ����� � �� ���������
    ���� ����� � ������� ������ �������.
    ����������, ���� �����, �� ��������� �������������� ������ �����
    �� ���������� ���������� ����� � 2-���� ������ �������.
    ������: 99
    �����: 1100011*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("���� �������� ���� ����");
            num = sc.nextInt();
        } while (num < 0);
        int[] array = new int[32];
        int result;
        int count = 0;
        if (num == 0) {
            System.out.print("0");
        } else {
            while (num > 0) {
                result = num % 2;
                array[count] = result;
                count++;
                num = (num / 2);
            }
            for (int i = count - 1; i >= 0; i--) {
                System.out.print(array[i]);
            }
            ;
        }
    }
}
