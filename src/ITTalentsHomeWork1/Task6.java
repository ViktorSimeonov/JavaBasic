package ITTalentsHomeWork1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
       /* ������ 6: �������� 3 ����� �� ������������ �1, �2 � �3. ��������� ����������� ��
        ����, �� �1 �� ��� ���������� �� �2, �2 �� ��� ���������� �� �3, � �3 �� ��� �������
        �������� �� �1.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("�������� ���� ���� ����� a1=");
        int a1 = Integer.parseInt(scanner.nextLine());
        System.out.println("�������� ����� �������� ���� ����� a2=");
        int a2 = Integer.parseInt(scanner.nextLine());
        System.out.println("�������� ����� �������� ���� ����� a3=");
        int a3 = Integer.parseInt(scanner.nextLine());
        a1 = a1 + a2;
        a2 = a1 - a2;
        a1 = a1 - a2;
        a2 = a2 + a3;
        a3 = a2 - a3;
        a2 = a2 - a3;
        System.out.printf("a1=%d%n",a1);
        System.out.printf("a2=%d%n",a2);
        System.out.printf("a3=%d%n",a3);


    }
}
