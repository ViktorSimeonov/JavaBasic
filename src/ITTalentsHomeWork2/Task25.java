package ITTalentsHomeWork2;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        /*������ 25:
        �� �� ������� ��������, ����� �� ������ ����� N, �� ���������
        N!, �.�. 1*2*3*4...*N.
                ������: 5
        �����: 120
        ����������� ����� do-while.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("���� �������� ���� ���������� ����� � ��������� [10 .. 30000] ");
        System.out.print("n=");
        int n = scanner.nextInt();
        while (n < 1) {
            System.out.println("�������� � ����� ����� ���������, ���� �������� ���");
            System.out.print("n=");
            n = scanner.nextInt();
        }
        float result=1f;
        do {
            result*=n;
            n--;
        }while ((n>0));
      /*  while (n>0){
            result*=n;
            n--;
        }*/
        System.out.println(result);
    }
}
