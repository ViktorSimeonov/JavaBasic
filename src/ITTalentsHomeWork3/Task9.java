package ITTalentsHomeWork3;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        /*������ 9:
        �������� ��������, � ����� ����������� ������� �����, ���� �����
        ���������� �� ������ �� ������� � ������� ��� (����� �� � ������ ��
        �� �������� � ������� ���, ��� ����� �� �� ������, ���� ����� �� ��
        �������� � �������� ���). ��������� �� ������ �������� ����� � ����
        ������������ ����� � ����� ��� �� ���������� ���� �����.*/
        Scanner sc = new Scanner(System.in);
        // 1 2 3 4 5
        int help ;
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i]=sc.nextInt();
        }
        for (int i = 0; i < array.length/2; i++) {
            help=array[array.length-1-i];
            array[array.length-1-i]=array[i];
            array[i]=help;
        }
        for(int i = 0; i<array.length;i++){
            System.out.print(array[i]+" ");
        }


    }
}
