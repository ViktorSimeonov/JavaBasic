package ITTalentsHomeWork1;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        /*������ 11: ��������� ��������, ����� �� ������ ���������o
        ����� ��������� ���� ������� �� ���� �� ����� ���� �����.
        ��� ���������� ����� �� ���� ����� 0.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("���� �������� ���� ���������� ����� ��� � ���� �� ��� ����� 0");
        int input = scanner.nextInt();
        int myNumber = input;
        int digitThree = input % 10;
        input = input / 10;
        int digitTwo = input % 10;
        input = input / 10;
        int digitOne = input % 10;
       /* System.out.println(digitOne);
        System.out.println(digitTwo);
        System.out.println(digitThree);
        System.out.println(input % digitOne);*/
      /*  System.out.println(((myNumber % digitOne) % 2 == 0));
        System.out.println(((myNumber % digitTwo) % 2 == 0));
        System.out.println(((myNumber % digitThree) % 2 == 0));*/
        if (((myNumber % digitOne) % 2 == 0) && ((myNumber % digitTwo) % 2 == 0)  && ((myNumber % digitThree) % 2 == 0) ) {
            System.out.println("���� ��!");
        } else {
            System.out.println("�� �� ����");
        }
    }
}
