package ITTalentsHomeWork3;

import java.util.Scanner;

public class Task2 {
   /* ������ 2:
    ���� �� ������� ����� �� �� ���������� ���, ���� ���������� ��
    �������� �� ����� ���� �� �����������, � ������� �� �� ����
    ��������, �� � ������� ���. ��������, �� �� ������ ����� �����
    �� ������.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] arrNew = new int[arr.length*2];
        for (int i = 0; i < arr.length; i++) {
            arrNew[i]=arr[i];
            arrNew[arr.length+i] =arr[arr.length-1-i];
        } System.out.println("���������� : ");
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("����������: ");
        for (int i = 0; i < arrNew.length; i++) {
            System.out.print(arrNew[i]+" ");
        }
    }

}

