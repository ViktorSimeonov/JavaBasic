package ITTalentsHomeWork2;

import java.util.Scanner;

public class Task7Rec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /* ������ 7: ���������� �� 3, �� �� ������� �� ������ ������� n
        ����� ����� �� ����� �� 3. ������� �� �� ��������� ��� �������.*/
        System.out.println("���� �������� ���� ���� ����� �������� �� 0");
        int n = scanner.nextInt();
        /*for (int i = 3; i <= n * 3; i = i + 3) {
            System.out.print(i);
            if (i < n * 3) {
                System.out.print(", ");
        }*/
        divideOn3(n,1);
    }


    static void divideOn3(int n,int i) {
        if (n == 0) {
            return;
        }
        if (i % 3 == 0) {
            System.out.print(i);
            n=n-1;
            if(n>0){
                System.out.printf(", ");
            }
        }
            divideOn3(n,i+1);
    }
}
