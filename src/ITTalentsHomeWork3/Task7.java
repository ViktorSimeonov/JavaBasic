package ITTalentsHomeWork3;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        /*������ 7:
        �������� ��������, ����� ����� ���� ����� � ����� ������� ���
        ����� ��� ����� ������ �� ������� �����: ���������� �� �����
        ������� �� ������ ����� �� � ����� �� ����� �� ���������� �
        ���������� ������� �� ���������� ������� �� ������ �����. �������
        � ���������� ������� �� ������ ����� ������ �� �� ������� ����� ��
        ������� � ���������� �� ������� �� ������ �����.
        �� �� ������ ��������� �����.*/
        //����
        //1 2 3 4 5 6
        //�����
        //1 4 6 8 10 5
        Scanner sc = new Scanner(System.in);
        System.out.println("���� �������� ����� � �� 6 ���� �����");

        int[] firstArray = new int[6];
        int[] secondArray=new int[firstArray.length];
        for (int i = 0; i <firstArray.length; i++) {
            firstArray[i] = sc.nextInt();
        }
        System.out.printf("%d ",secondArray[0]=firstArray[0]);
        for (int i = 1; i < secondArray.length-1; i++) {
            secondArray[i] = firstArray[i-1]+firstArray[i+1];
            System.out.print(secondArray[i]+" ");
        }
        System.out.print(secondArray[firstArray.length-1]=firstArray[firstArray.length-1]);
    }
}
