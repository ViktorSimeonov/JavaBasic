package ITTalentsHomeWork2;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*������ 18:
        �� �� ������� ��������, ���� ����� �� ������� ��� ����� ��
        ��������� [1..9].
        ���������� �� ������� ��������� �� ���������.
        ������������ �������� �� ����������� � ���������� �� 2-��
        �����.
                ������: 2 2
        �����:
        1*1= 1;
        1*2= 2;
        2*1= 2;
        2*2= 4;*/
        System.out.println("���� �������� ��� ���������� ����� � ��������� [1..9] ");
        System.out.print("n=");
        int n = scanner.nextInt();
        while (n < 1 || n > 9) {
            System.out.println("�������� � ����� ����� ���������, ���� �������� ���");
            System.out.print("n=");
            n = scanner.nextInt();
        }
        System.out.print("m=");
        int m = scanner.nextInt();
        while ((m < 1 || m > 9)) {
            System.out.println("�������� � ����� ����� ���������, ���� �������� ���");
            System.out.print("m=");
            m = scanner.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m ; j++) {
                System.out.printf("%d*%d=%d%n",i,j,i*j);
            }
        }
    }
}
