package ITTalentsHomeWork2;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

      /*  ������ 8: �� �������� ����� n, �� �� ������ �� ������ ������� ��
        ������� �����:*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("���� �������� ���� ���� ����� �� ������ �� 0");
        int n = scanner.nextInt();
        while ( n<=0){
            System.out.println("�������� � ����� ����� ���������, ���� �������� ���");
            n=scanner.nextInt();
        }
        int result=n-1;
        for (int i = result; i <= (2*n+(n-2)); i = i + 2) {

            for (int j = 0; j < n; j++) {
                System.out.print(i);
            }
            System.out.println();
        }


    }
}
