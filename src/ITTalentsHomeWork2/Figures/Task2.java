package ITTalentsHomeWork2.Figures;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*  # # # # # # #
             # # # # # # #
            # # # # # # #
             # # # # # # #
            # # # # # # #
             # # # # # # #
            # # # # # # #
              */
        Scanner scanner = new Scanner(System.in);
        System.out.println("���� �������� ���� ���� ����� �� ������ �� 0");
        int n = scanner.nextInt();
        while ( n<=0){
            System.out.println("�������� � ����� ����� ���������, ���� �������� ���");
            n=scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i%2==0){
                    System.out.print("# ");
                }else {
                    System.out.print(" #");
                }
            }
            System.out.println();
        }
    }
}
