package ITTalentsHomeWork2.Figures.Task4;

import java.util.Scanner;

public class FigureE {

  /* 7
           # # # # # # #
           #           #
           #           #
           #           #
           #           #
           #           #
           # # # # # # #

           */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("���� �������� ���� ���� ����� �� ������ �� 0");
        int n = scanner.nextInt();
        while ( n<=0){
            System.out.println("�������� � ����� ����� ���������, ���� �������� ���");
            n=scanner.nextInt();
        }
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
            if (i==1||i==n){
                System.out.print("# ");
            }
            else {
                if(j==1||j==n){
                    System.out.print("# ");
                }else {
                    System.out.print("  ");
                }
            }
            }
            System.out.println();
        }
    }
}
