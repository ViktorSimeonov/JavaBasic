package ITTalentsHomeWork3;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {

       /* ������ 12:
        �� �� ������� ��������, ���� ����� �� ������������� �������� 7
        ����� � ��������� ����� �� �������� ������� �� �������� � �������:
        - 0 � 1 ���� ����� ����������;
        - 2 � 3 ���� ��������;
        - 4 � 5 ���� ���������.
        ������: 1,2,3,4,5,6,7
        ����: 1 2 3 4 5 6 7
        �����: 2,1,4,3,6,5,7*/
        //Scanner sc = Scanner
        int[] array = {1,2,3,4,5,6,7};
        //���� ������� �� �������� � �������:
        int num = 0;
        num = array[1];
        array[1]=array[0];
        array[0]=num;
//        - 2 � 3 ���� ��������;
        array[2]=array[2]+array[3];
        array[3]=array[2]-array[3];
        array[2]=array[2]-array[3];
//        - 4 � 5 ���� ���������.
        array[4]=array[4]*array[5];
        array[5]=array[4]/array[5];
        array[4]=array[4]/array[5];
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }

    }
}
