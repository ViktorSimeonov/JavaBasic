package ITTalentsHomeWork2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
       /* ������ 7: ���������� �� 3, �� �� ������� �� ������ ������� n
        ����� ����� �� ����� �� 3. ������� �� �� ��������� ��� �������.*/
        System.out.println("���� �������� ���� ���� ����� �������� �� 0");
        int n = scanner.nextInt();
        for (int i = 3; i <= n*3; i=i+3) {
            System.out.print(i);
            if(i<n*3) {
                System.out.print(", ");
            }
        }
      /*  while (n>0){


            n--;
        }*/

    }
}
