package ITTalentsHomeWork2;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
       /* ������ 13: �� �� ������� ��������, ����� ������� ������
        ���������� ���������� �����, ����� ���� ���� �� ������� �����
        �� ������ �����.
                ������ : sum, ������ 2>=sum<=27.
        ������: 26
        �����: 899, 989, 998.*/
        System.out.println("���� �������� ����� ��-������ ��� ����� �� 2 � ��-����� ��� ����� �� 27");
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();

        while ( sum <=2 ||sum>=27 ){
            System.out.println("�������� � ����� ����� ���������, ���� �������� ���");
            sum=scanner.nextInt();
        }
        int a = 100;
        int b = 1000;
        for (int i = 100; i < 1000; i++) {
            int currentNum = i;
            int units = currentNum % 10;
            currentNum = currentNum / 10;
            int tens = currentNum % 10;
            currentNum = currentNum / 10;
            int hundred = currentNum;
            if ((units + tens +hundred) == sum) {
                System.out.println(i);
            }
        }

    }
}
