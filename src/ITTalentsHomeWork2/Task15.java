package ITTalentsHomeWork2;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
     /*   ������ 15: �� �� ������� ��������, ����� �� ������� ������ ��
        ������ ����� �� 1 �� �������� ����� N.
        ������: 5
        �����: 15
        ����������� ����� do-while.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("����, �������� ���� ����� ��-������ �� 0");
        int n = scanner.nextInt();
        while ( n<=0){
            System.out.println("�������� � ����� ����� ���������, ���� �������� ���");
            n=scanner.nextInt();
        }
        int sum =0;
        int i=1;
        do {
            sum+=i;
            i++;
            n--;
        }while (n>0);
        System.out.println(sum);
    }
}
