package ITTalentsHomeWork2;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /* ������ 21:
        ������ � �������� ����� �����.
                ��������� �� ������ �� ����� �: 2,3,4,5,6,7,8,9,10, ����, ����,
                ���, ���.
                ��������� �� ���� �� ������� �: ������, ����, ����, ����.
                �� �� ������� ��������, ���� ����� �� ������� N - ����� ��
        ��������� [1..51] � �� �������� ��������� ����� ����� �
        ���������� ��-������ ����� �� �������.
                ������: 47.
        �����: ��� ����, ��� ����, ��� ������, ��� ����, ��� ����, ���
        ����*/
        System.out.println("���� �������� ���� ���������� ����� � ��������� [1..51] ");
        System.out.print("n=");
        int n = scanner.nextInt();
        while (n < 1 || n >= 53) {
            System.out.println("�������� � ����� ����� ���������, ���� �������� ���");
            System.out.print("n=");
            n = scanner.nextInt();
        }

        ///count of the deck with card
       /* int deck = 4;
        int cartInDeckFromSameColour = 13;*/

        int allCard = 52;
        int restCard = 52 - (n - 1);
        //start rest card

        int startColour ;
        if(restCard%4==0){
            startColour = 1;
        }else {
            startColour =5-(restCard % 4);
        }
        int startKart = 0;
        if (restCard % 4 != 0) {
            startKart = 2 + (13 - ((restCard / 4) + 1));
        } else {
            startKart = 2 + (13 - (restCard / 4));

        }

        // �������� �������
        for (int i = startKart; i <= 14; i++) {
            //�������� �����
            //if(restDeck)
            if(startColour!=0){
                for (int j = startColour; j <= 4; j++) {
                    if (i == 11) {
                        System.out.printf("����");
                    } else if (i == 12) {
                        System.out.printf("����");
                    } else if (i == 13) {
                        System.out.printf("���");
                    } else if (i == 14) {
                        System.out.printf("���");
                    } else {
                        System.out.print(i);
                    }
                    if (j == 1) {
                        System.out.printf(" ������,");
                    } else if (j == 2) {
                        System.out.printf(" ����,");

                    } else if (j == 3) {
                        System.out.printf(" ����,");

                    } else {
                        if(i==14){

                            System.out.printf(" ����");
                        }else {

                            System.out.printf(" ����,");
                        }

                    }
                }
            }else {
                for (int j = 1; j <= 4; j++) {
                    if (i == 11) {
                        System.out.printf("����");
                    } else if (i == 12) {
                        System.out.printf("����");
                    } else if (i == 13) {
                        System.out.printf("���");
                    } else if (i == 14) {
                        System.out.printf("���");
                    } else {
                        System.out.print(i);
                    }
                    if (j == 1) {
                        System.out.printf(" ������,");
                    } else if(j == 2) {
                        System.out.printf(" ����,");

                    } else if (j == 3) {
                        System.out.printf(" ����,");

                    } else {
                        System.out.printf(" ����,");

                    }
                }
            }

            startColour=0;

        }

    }
}
