package ITTalentsHomeWork3;

import java.util.Scanner;

public class Task6_1 {
    public static void main(String[] args) {
      /*  ������ 6:
        �������� ��������, ����� ����� ���� 2 ������ � ����� �������
        ��������� ���� �� �������, � ���� �� � ������� ������.*/
        Scanner sc = new Scanner(System.in);
        //int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int size1;
        do {
            System.out.print("���� �������� ������� �� ������ ����� (���� ����������� �����)");
            size1=sc.nextInt();
        }
        while (size1<1);
        int[] firstArray = new int[size1];
        for (int i = 0; i < firstArray.length; i++) {
            System.out.printf("���� �������� %d ������� �� ������",i);
            firstArray[i] = sc.nextInt();
        }
        int size2;
        do {
            System.out.print("���� �������� ������� �� ������ ����� (���� ����������� �����)");
            size2=sc.nextInt();
        }
        while (size2<1);
        int[] secondArray = new int[size1];
        for (int i = 0; i < firstArray.length; i++) {
            System.out.printf("���� �������� %d ������� �� ������",i);
            secondArray[i] = sc.nextInt();
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
