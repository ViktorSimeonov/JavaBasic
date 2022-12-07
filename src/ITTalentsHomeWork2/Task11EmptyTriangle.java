package ITTalentsHomeWork2;

import java.util.Scanner;

public class Task11EmptyTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      /*  ������ 11: �������� ����� N ���� ��������� � ��������� ����
        �������� ������� ���������� � �������� N:
                 *
                ***
               *****
            .................
        �a�� ������������ ���������� � ����������� �����
        ����������, �� ����������.*/
        System.out.println("����, �������� ���� �����");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) //outer loop for number of rows(n)
        {
            for (int j = n - i; j > 1; j--) //inner loop for spaces
            {
                System.out.print("*"); //print space
            }
            for (int j = 1; j <= 2*i+1; j++) //inner loop for number of columns
            {
                System.out.print(" "); //print star
            }
            for (int j = n - i; j > 1; j--) //inner loop for spaces
            {
                System.out.print("*"); //print space
            }

            System.out.println(); //ending line after each row
        }
    }
}



