package ITTalentsHomeWork1;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args){
//    ? ������ 8: �� �� ������� ��������, ����� ���� �� ��������� 4-
//                ������o ���������� ����� �� ��������� [1000.. 9999]. �� ����
//        ����� �� �������� 2 ���� 2-������� �����. ������� ����� ��
//        ������� �� 1-�� � 4-�� ����� �� ���������� �����. ������� �����
//        �� ������� �� 2-�a - 3-�� ����� �� ���������� �����. ����
//        �������� �� �� ������ ���� 1-�� ���� ����� e ��-�����, ����� ���
//        ��-������ �� 2-�� �����.
//        � ������: 3332 �����: ��-����� (32<33)
//        � ������: 1144 �����: ����� (14=14)
//        � ������: 9875 �����: ��-������ (95>87)
        Scanner scanner = new Scanner(System.in);
        System.out.println("�������� ���������� ����� �� ��������� [1000.. 9999]");
        int number = scanner.nextInt();
        //4-�� �����
        int fourthDigit = number%10;
        number=number/10;
        int thirdDigit = number%10;
        number=number/10;
        int secondDigit = number%10;
        number=number/10;
        int firstDigit = number%10;
        int firstNum = (firstDigit*10)+fourthDigit;
        int secondNum = (secondDigit*10)+thirdDigit;
        System.out.print("�����:");
        if(firstNum>secondNum){
            System.out.printf("��-������ (%d>%d)",firstNum,secondNum);
        } else if (firstNum==secondNum) {
            System.out.printf(" ����� (%d=%d)",firstNum,secondNum);

        }else {
            System.out.printf("��-����� (%d<%d)",firstNum,secondNum);

        }

    }
}
