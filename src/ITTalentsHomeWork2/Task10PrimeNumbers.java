package ITTalentsHomeWork2;

import java.util.Scanner;

public class Task10PrimeNumbers {
    public static void main(String[] args){
       /* ������ 10: �������� ����� �� ������������ � ���������� ���� �
        ������. ������ ����� � ���� ����� �� ���� ���� �� 1 � �� ����
        ��.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("����, �������� ���� ����� ��-������ �� 0");
        int n = scanner.nextInt();
        while ( n<=0){
            System.out.println("�������� � ����� ����� ���������, ���� �������� ���");
            n=scanner.nextInt();
        }
        int count =0;
        for (int i = 1; i <=n ; i++) {
            if(n % i ==0 ){
              count++;
            }
        }
        if(count==2){
            System.out.println("���������� ����� � ������");
        }else {
            System.out.println("���������� ����� �� � ������");
        }
    }
}
