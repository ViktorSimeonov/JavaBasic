package ITTalentsHomeWork1;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
      /*  ������ 10: ������ �� �� ������� �������� � ����. ����� 2 ���� �
        ���������� 2 � 3 ����� � �� �������� ������������. �� ��
        ������� ��������, ����� �� ����� ���� ������� ��� �� ��������
        ��������� � ���� ����, �.�. ��-����� ���� �� �� ����� ����� ��
        ������. ������ �� ����� �� �� ������� � �������� ����������
        ����, �� ����� ���������� �� �� ������� �� ����.
        � ������ �����: ���������� ����� �� ��������� [10..9999].
        ������: 107
        � �����: 21 ���� �� 2 �����, 21 ���� �� 3 �����, ������������
        ���� �� 2 �����
        %d ���� �� %d �����, %d ���� �� %d �����, ������������ ���� �� %d �����
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("�������� ���� ���������� ����� � ��������� [10..99] a=");
        int a = Integer.parseInt(scanner.nextLine());
        int evenBucket = 2;
        int oddBucket = 3;
        int resultEven = (a / (evenBucket + oddBucket));
        int resultOdd = (a / (evenBucket + oddBucket));
        int modularResult = a % (evenBucket + oddBucket);
        int additionalBuckedEven = 0;
        int additionalBuckedOdd = 0;
        switch (modularResult) {
            case 0:
                System.out.printf("%d ���� �� %d �����, %d ���� �� %d �����",
                        resultEven, evenBucket, resultOdd, oddBucket);

                break;
            case 1:
                additionalBuckedEven = -1;
                additionalBuckedOdd = 1;
                resultEven += additionalBuckedEven;
                resultOdd += additionalBuckedOdd;
                System.out.printf("%d ���� �� %d �����, %d ���� �� %d �����, ������������ %d ���a �� %d �����",
                        resultEven, evenBucket, resultOdd, oddBucket, additionalBuckedOdd, oddBucket);
                break;
            case 2:
                additionalBuckedEven = 1;
                resultEven += additionalBuckedEven;
                resultOdd += additionalBuckedOdd;
                System.out.printf("%d ���� �� %d �����, %d ���� �� %d �����, ������������ %d ���a �� %d �����",
                        resultEven, evenBucket, resultOdd, oddBucket, additionalBuckedEven, evenBucket);
                break;
            case 3:
                additionalBuckedOdd = 1;
                resultEven += additionalBuckedEven;
                resultOdd += additionalBuckedOdd;
                System.out.printf("%d ���� �� %d �����, %d ���� �� %d �����, ������������ %d ���a �� %d �����",
                        resultEven, evenBucket, resultOdd, oddBucket, additionalBuckedOdd, oddBucket);
                break;
            case 4:
                additionalBuckedEven = -1;
                additionalBuckedOdd = 2;
                resultEven += additionalBuckedEven;
                resultOdd += additionalBuckedOdd;
                System.out.printf("%d ���� �� %d �����, %d ���� �� %d �����, ������������ %d ���a �� %d �����",
                        resultEven, evenBucket, resultOdd, oddBucket, additionalBuckedOdd, oddBucket);
                break;

        }

    }
}

