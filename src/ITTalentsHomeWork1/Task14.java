package ITTalentsHomeWork1;


import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        /*������ 14: �� �� ������� ��������, ����� �� ��������
        ���������� �� 2 ������� �� ���������� ����� ������� �������
        ���� ������������� �� ���� ������� �� �������� � ������� ���
        �������� ����. ���������� ����� � ���������. �������� �� ���
        ������ ����� �� ��������� [1..8].
        � ������: 2 2 3 2
        � �����: ��������� �� � �������� ����*/
        System.out.println("���� �������� 4 ���� ����� ��������� � �������� � ��������� [1..8] ");
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int num11 = Integer.parseInt(input[0]);
        int num12 = Integer.parseInt(input[1]);
        int num21 = Integer.parseInt(input[2]);
        int num22 = Integer.parseInt(input[3]);
        //num1 - ������� �����
        //num2 - ������� �����
        boolean firstIsBlack = false;
        boolean secondIsBlack = false;
        boolean firstIsWhite = false;
        boolean secondIsWithe = false;
        if ((num11 == 1 || num11 == 3 || num11 == 5 || num11 == 7) && (num12 == 1 || num12 == 3 || num12 == 5 || num12 == 7)||(num11==num22)) {
            firstIsBlack = true;
        } else {
            firstIsWhite = true;
        }
        if ((num21 == 1 || num21 == 3 || num21 == 5 || num21 == 7) && (num22 == 1 || num22 == 3 || num22 == 5 || num22 == 7)||(num21==num22)) {
            secondIsBlack = true;
        } else {
            secondIsWithe = true;
        }
        if ((firstIsBlack && secondIsBlack) || (firstIsWhite && secondIsWithe)){
            System.out.println("��������� �� � ������� ����");
        }else {
            System.out.println("��������� �� � �������� ����");
        }
    }


}



