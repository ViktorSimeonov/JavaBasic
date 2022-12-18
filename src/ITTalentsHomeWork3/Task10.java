package ITTalentsHomeWork3;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
       /* ������ 10:
        �� �� ������� ��������, ���� ����� �� �������� 7 ���� ����� �
        ��������� �����.
        ���������� �� ������ �������, ����� � ���-������ �� ��������
        �������� �� ���������� �����.
        ������: 1,2,3,4,5,6,7
        //1 2 3 4 5 6 7
        �����: ������ �������� 4, ���-������ �������� 4*/
        Scanner sc = new Scanner(System.in);
        int[] array = new int[7];
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            sum += array[i];
        }
        double num = Math.round(sum / array.length);
        double minimum = Double.MAX_VALUE;
        int nearestNumber=0;
        for (int i = 0; i < array.length; i++) {
            double currentDifference = Math.abs(num - array[i]);
            if (currentDifference < minimum) {
                minimum=currentDifference;
                nearestNumber=array[i];;

            }
        }
        System.out.printf("������ �������� %.0f, ���-������ �������� %d%n",num,nearestNumber);
    }
}

