package ITTalentsHomeWork2.Figures.Task6;

import java.util.Scanner;

public class Task6F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("���� �������� ���� ���� ����� �� ������ �� 0");
        int n = scanner.nextInt();
        while ( n<=0){
            System.out.println("�������� � ����� ����� ���������, ���� �������� ���");
            n=scanner.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
