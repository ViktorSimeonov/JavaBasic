package ITTalentsHomeWork3;

import java.util.Scanner;

public class Task3 {
  /*  ������ 3:
    �� �� ������ �����, ���� ����� �� �� ������� ����� � 10
    �������� �� ������� �����:
    ������� 2 �������� �� ������ �� ���������� �����.
    ����� ������� ������� �� ������ � ����� �� ����� ��
    ���������� 2 �������� � ������.
    ���� ���� �������� ������ .*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("���� �������� ���� ���� ����� �� ������ �� 0");
        int n = scanner.nextInt();
        while ( n<=0){
            System.out.println("�������� � ����� ����� ���������, ���� �������� ���");
            n=scanner.nextInt();
        }
        int[] arr = new int[10];
        arr[0]=n;
        arr[1]=n;
        for (int i = 2; i < arr.length; i++) {
            arr[i]=arr[i-1]+arr[i-2];
        }
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
