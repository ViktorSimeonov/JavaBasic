package ITTalentsHomeWork2;

import java.util.Scanner;

public class Task6Rec {
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

        System.out.println(sumOfAllNumbers(x,0));
    }
    static int sumOfAllNumbers(int num,int sum){
        if(num==0){
            return sum;
        }
        sum+=num;
        return sumOfAllNumbers(num-1,sum);
    }
}
