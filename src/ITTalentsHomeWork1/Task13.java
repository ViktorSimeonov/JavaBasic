package ITTalentsHomeWork1;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Task13 {
    public static void main (String[] args){
      /*  ������ 13: �� �� ������� ��������, ����� �� ������� ����� �
        �������/����� �� ���������� ����������� t � ������ ������.
                �������������� ��������� ��:
        � ��� -20 - ������ �������;
        � ����� 0 � -20 - �������;
        � ����� 15 � 0 - ������;
        � ����� 25 � 15 - �����;
        � ��� 25 � ������.
        � ������ �����: ���� ����� �� ��������� [-100..100].
        � ������: 12
        � �����: ������*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("���� �������� ���� ����� � ��������� [-100..100]");
        int temp = scanner.nextInt();
        if(temp<-20){
            System.out.println("������ �������");
        } else if (temp<=0) {
            System.out.println("�������");
        } else if (temp<=15) {
            System.out.println("������");
        } else if (temp<=25) {
            System.out.println("�����");
        } else  {
            System.out.println("������");
        }
    }
}
