package ITTalentsLesson4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /*  Task4. Write a program that tells you if a number is prime.//prosto chislo*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("���� �������� ���� ����� ��-������ �� 0");
        int n = scanner.nextInt();
        while (n < 1) {
            System.out.println("�������� � ����� ����� ���������, ���� �������� ���");
            n = scanner.nextInt();
        }
        // ��� ���� �� ��������� �� 2 �� ������� -1, � ��� num %i ==0 �� �� � ������
               int count = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("The number is prime");
        } else {
            System.out.println("The number is not prime");
        }

    }
}
