package ITTalentsHomeWork3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
      /*  ������ 6:
        �������� ��������, ����� ����� ���� 2 ������ � ����� �������
        ��������� ���� �� �������, � ���� �� � ������� ������.*/
        Scanner sc = new Scanner(System.in);
        //int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("���� �������� ������ ����� ( ���� ����� ��������� ��� ������� )");
        String[] arr1 = sc.nextLine().split(",");
        int[] firstArray = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            firstArray[i]=Integer.parseInt(arr1[i]);
        }
        System.out.println("���� �������� ������ ����� ( ���� ����� ��������� ��� �������)");
        String[] arr2 = sc.nextLine().split(",");
        int[] secondArray = new int[arr2.length];
        for (int i = 0; i < arr2.length; i++) {
            secondArray[i]=Integer.parseInt(arr2[i]);
        }
        int count = 0;
        if(firstArray.length!=secondArray.length){
            System.out.println("�������� �� � �������� ������");
            System.out.println("�������� �� ��������");
        }else {
            for (int i = 0; i < firstArray.length; i++) {
                if(firstArray[i]==secondArray[i]){
                    count++;
                }
            }
            System.out.println("�������� �� � ������� ������");
            if(count==firstArray.length){
                System.out.println("�������� �� �������");
            }else {
                System.out.println("�������� �� ��������");
            }
        }

    }
}
