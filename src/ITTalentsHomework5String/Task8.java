package ITTalentsHomework5String;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*������ 8:
        �� �� ������� ��������, ���� ����� �� ������� ��� �� �������
        (������, ���).
        ���������� �� ������ �� ������ ���� ��������� ������ � ���������,
        �.�. ���� ����� ������-������� � �������-������ � ���� � ���.
        ����: �����
        �����: ��.
                ����: ��������
        �����: ��.
        input: kayak
        */
        String input = sc.nextLine();
        boolean isPalindrome=true;
        for (int i = 0; i < input.length()/2; i++) {
            if(!(input.charAt(i)==input.charAt(input.length()-1-i))){
                 isPalindrome=false;
            }
        }
        System.out.println(isPalindrome? "is Palindrome" : "is Not Palindrome");
    }
}
