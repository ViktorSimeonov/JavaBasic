package ITTalentsHomeWork2;

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        /*������ 24:
        ���� ����� X � ���������, a�� �� ���� ������� ������ ����� �
        ����� ������.
        �� �� ������� ��������, ����� ��������� ���� �������� ����� �
        ���������.
                ������ �����: N - ���������� ����� �� ��������� [10 .. 30000].
        ������: 17571
        �����: ������� � ���������
        ����������� ����� do-while.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("���� �������� ���� ���������� ����� � ��������� [10 .. 30000] ");
        System.out.print("n=");
        int n = scanner.nextInt();
        while (n < 10 || n >= 30000) {
            System.out.println("�������� � ����� ����� ���������, ���� �������� ���");
            System.out.print("n=");
            n = scanner.nextInt();
        }
        boolean itIsPalindrome = true;
        while (itIsPalindrome) {
            int number = n;
            int units = n % 10;
            n = n / 10;
            int tens = n % 10;
            n = n / 10;
            int hundred = n % 10;
            n = n / 10;
            int thousand = n % 10;
            n = n / 10;
            int tenThousand = n % 10;

            if (number < 100) {
                if (units == tens) {
                    System.out.println("������� � ���������");
                    itIsPalindrome = false;

                }

            } else if (number < 1000) {
                if (units == hundred) {
                    System.out.println("������� � ���������");
                    itIsPalindrome = false;

                }
            } else {
                if (units == tenThousand && tens == thousand) {
                    System.out.println("������� � ���������");
                    itIsPalindrome = false;
                }

            }
            if(itIsPalindrome){
                System.out.println("������� �� � ���������");
                itIsPalindrome=false;
            }

        }

    }
}
