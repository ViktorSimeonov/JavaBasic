package ITTalentsHomeWork2.Figures.Task5;

import java.util.Scanner;

public class Task5C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("���� �������� ���� ���� ����� �� ������ �� 0");
        int n = scanner.nextInt();
        while ( n<=0){
            System.out.println("�������� � ����� ����� ���������, ���� �������� ���");
            n=scanner.nextInt();
        }
        for (int i = n; i>0; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <(2*n+1)-(2*i) ; j++) {
                System.out.print("# ");
            }

            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < (2*n-1)-(2*i) ; j++) {
                System.out.print("# ");
            }

            System.out.println();
        }

    }
}
