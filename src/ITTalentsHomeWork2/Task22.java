package ITTalentsHomeWork2;

import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*������ 22:
        �� �� ������� ��������, ����� ������� ������� 10 ���-�����
        �����, ����� �� ����� �� 2, 3 ��� �� 5 � ����� �� ��-������ ��
        �������� ���������� �����.
                ������� �� ��������, ������ � ������ ������� �����.
        ������ �����: ����� �� ��������� [1..999]
        ������: 1
        �����: 1:2; 2:3, 3:4, 4:5, 5:6, 6:8, 7:9, 8:10, 9:12, 10:14
        ����������� ����� while.*/
        System.out.println("���� �������� ���� ���������� ����� � ��������� [1..999] ");
        System.out.print("n=");
        int n = scanner.nextInt();
        while (n < 1 || n >= 1000) {
            System.out.println("�������� � ����� ����� ���������, ���� �������� ���");
            System.out.print("n=");
            n = scanner.nextInt();
        }
        int count = 10;
        int counter = 0;
        while (count > 0) {
            n += 1;
            if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0) {
                counter++;
                System.out.printf("%d:%d", counter, n);
                count--;
                if (count == 0) {
                    System.out.print(" ");
                }else {
                    System.out.print(", ");
                }
            }
            if (count == 0) {
                System.out.print(" ");
            }
        }
    }
}
