package ITTalentsHomeWork1;

import java.util.Scanner;

public class Task9 {
    public static void main(String[]args){
        /*������ 9: �� �� ������� ��������, ����� ���� �� ��������� 2
        ���������� ���������� ����� a,b. ���������� �� ������ �
        ��������� ���� ���������� ����� �� �������������� �� �����
        ����� � �����, ����� � ������ �����.
        � ������ �����: a,b - ���������� ����� �� ��������� [10..99].
        � ������: 15, 25
        � �����: 375, 5 �������*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("�������� ���� ���������� ����� � ��������� [10..99] a=");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("�������� ����� ���������� ����� � ��������� [10..99] b=");
        int b = Integer.parseInt(scanner.nextLine());
        int multiply = a * b;
        int result = multiply % 10;
        if(result % 2 == 0){
            System.out.printf("%d, %d ����� ",multiply,result);

        }else {
            System.out.printf("%d, %d ������� ",multiply,result);

        }

    }
}
