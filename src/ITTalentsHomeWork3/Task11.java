package ITTalentsHomeWork3;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        /*������ 11:
        �� �� ������� ��������, ����� ������� �� ������������ 7 ���� �����
        � ��������� �����
        ���������� �� ������ ������ ����� ������ �� 5, �� �� ������ �� 5.
        ������: -23, -55, 17, 75, 56, 105, 134
        // -23 -55 17 75 56 105 134
        �����: 75,105 - 2 �����*/
        Scanner sc = new Scanner(System.in);
        int[] array = new int[7];
        int[] newArray = new int[array.length];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            array[i]=sc.nextInt();
            if(array[i] % 5 == 0 && array[i]>5){
                newArray[count]=array[i];
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.print(newArray[i]);
            if(i<count-1){
                System.out.print(", ");
            }
        }
        System.out.printf(" - %d �����",count );

    }
}
