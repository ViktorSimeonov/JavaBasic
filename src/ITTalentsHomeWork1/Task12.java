package ITTalentsHomeWork1;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*������ 12: ��������� ������ �� ������ ������ ������ �� 4 �
        ���������� ����������, �� ��� �������� ������ �� 400, �.�. 1900
        �� � ���������, �� 1600 � 2000 �� ���������.��������� ��������,
        ����� �� ������ ���, ����� � ������, ��������� ���������� ����.
        � ������ �����: ��� ����� �� ���, �����, ������.
        � ������: 28, 2, 2021
        � �����: 1,3,2021*/
        System.out.println("���� �������� ��� ����� �� ���, �����, ������");
        String[] data = scanner.nextLine().split(", ");
        int day = Integer.parseInt(data[0]);
        int month = Integer.parseInt(data[1]);
        int year = Integer.parseInt(data[2]);

        //1,3,5,7,8,10,12 - 31 ���
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            if (day == 31) {
                day = 1;
                if (month == 12)
                    month = 1;
                year++;
            } else {
                day++;

            }
            //4,6,9,11 - 30 ���
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day == 30) {
                day = 1;
                month++;
            } else {
                day++;
            }
        } else {
            if (((year % 400 == 0) || (year % 100 != 0)) && (year % 4 == 0)) {
                if (day == 28) {
                    day++;
                } else if (day == 29) {
                    day = 1;
                    month++;
                } else {
                    day++;
                }
            }else {
                if(day==28){
                    day=1;
                    month++;
                }else {
                    day++;
                }

            }

        }
        System.out.printf("%d,%d,%d", day, month, year);
        //2-28 ���, ��� �������� � ������ �� 4 �� ��� �������� �� 400 ( ����������)
        /*int year400 = 1600 % 400;//���������
        int year100 = 1600 % 100;//�����������
        int year4 = 1600 % 4;//���������
        if (year400 == 0 && year4 == 0 && (year100!=0)){*/

    }

}

