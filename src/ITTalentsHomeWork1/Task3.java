package ITTalentsHomeWork1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
       /* ������ 3: �������� 2 �������� ����� �� ��������� � ���������
        ���������� ��. ������������ ������ ���������.
*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("�������� ���� ���� ����� a=");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("�������� ���� ���� ����� b=");
        int b = Integer.parseInt(scanner.nextLine());
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.printf("���� ��������� a=%d, b=%d", a, b);
    }


}
