package ITTalentsHomeWork2;

import java.util.Scanner;

public class Task11FullTriangle {
    public static void main(String[] args) {

       /* ������ 11: �������� ����� N ���� ��������� � ��������� ����
        �������� ������� ���������� � �������� N:*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("����, ��������  ���� �����");
        int n = scanner.nextInt();
        for (int row = 0; row < n; row++) //outer loop for number of rows(n)
        {
            for (int space = n - row; space > 1; space--) //inner loop for spaces
            {
                System.out.print(" "); //print space
            }
            for (int star = 1; star <= 2*row+1; star++) //inner loop for number of columns
            {
                System.out.print("*"); //print star
            }

            System.out.println(); //ending line after each row
        }


    }
}
