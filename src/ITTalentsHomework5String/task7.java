package ITTalentsHomework5String;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
       /* ������ 7:
        �� �� ������� ��������, ����� ���� ����� �� ���� ��������� �
        ��������.
                ���� �������� �� �� �������� ���� �� ���������� ����, ����� � ����
        ����� � ���-������� ����.
                ������: asd fg hjkl
        �����: 3 ����, ���-������� � � 4 �������.*/
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().trim().split(" ");
        System.out.print(input.length+" words, ");
        theLonger(input);
    }
    static void theLonger(String[] input){
        int theLongest=input[0].length();
        for (int i = 1; i < input.length; i++) {
            if(input[i].length()>theLongest){
                theLongest=input[i].length();
            }
        }
        System.out.printf(" the longest is with %d symbols",theLongest);
    }
}
