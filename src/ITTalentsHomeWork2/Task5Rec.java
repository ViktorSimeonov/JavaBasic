package ITTalentsHomeWork2;

import java.util.Scanner;

public class Task5Rec {
    public static void main(String[] args) {
      /*  ������ 5: �� �� ������� �� ����������� 2 �����. � �� ��
        ������� �� ������ ������ ����� �� ��-������� �� ��-��������*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("���� �������� ��� ���� �����");
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
       /* for (int i = firstNum; i <= secondNum; i++) {
            System.out.println(i);
        }*/
        printFromTo(firstNum,secondNum);
    }
    static void printFromTo(int a,int b){
        int min=Math.min(a,b);
        int max=Math.max(a,b);
        if(min==max){
            System.out.println(min);
            return;
        }
        System.out.println(min);
        printFromTo(min+1,max);
    }
}