package ITTalentsHomeWork2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args){
        /*������ 6: �� �� ������� ����� �� ������(���������) � �� ��
        ������ ����� �� ������ ����� ����� 1 � ���������� �����.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("���� �������� ���� ���� ����� �������� �� 0");
        int x = scanner.nextInt();
        int sum=0;
        for(int i = 1 ; i <= x ; i++){
            sum+=i;

        }
        System.out.println(sum);
    }
}
