package ITTalentsHomeWork2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
       /* ������ 14: �� �� ������� ��������, ����� �� ��������
        ���������� ����� N �� ��������� [10..200] ������� � �������
        ��� ������ �����, ����� �� ������ �� 7 � �� ��-����� �� N.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("���� �������� ���������� ����� � ��������� [10..200] ");
        int n = scanner.nextInt();
        while ( n <10 ||n>200 ){
            System.out.println("�������� � ����� ����� ���������, ���� �������� ���");
            n=scanner.nextInt();
        }
        for (int i = 10; i <= n; i++) {
            if (i % 7 == 0 && i < n){
                System.out.println(i);
            }
        }


    }
}
