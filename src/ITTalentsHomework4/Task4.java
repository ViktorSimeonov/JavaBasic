package ITTalentsHomework4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*������ 4:
        �� �� ������� ��������, ���� ����� �� �������� ����� ����� �� �����
        ������ ��������� ��� �������, �� ������� ��� ��� ��� ��-����� ����
        �� ASCII �������� �� ����������� ����� �����.
                ������: Anna Dosewa Asenowa, Iwo Peew Peew
        �����: Anna Dosewa Asenowa*/
        String[] input = sc.nextLine().trim().split(",");
        String[] firstName=input[0].trim().split("\s+");
        String[] secondName=input[1].trim().split("\s+");
        int sumFirstName =0;
        int sumSecondName =0;
        for (int i = 0; i < firstName.length; i++) {
            for (int j = 0; j < firstName[i].length(); j++) {
                sumFirstName+=firstName[i].charAt(j);
            }
        }
        for (int i = 0; i < secondName.length; i++) {
            for (int j = 0; j < secondName[i].length(); j++) {
                sumSecondName+=secondName[i].charAt(j);
            }
        }
        if(sumFirstName>sumSecondName){
            for (int i = 0; i < firstName.length; i++) {
                System.out.print(firstName[i]+" ");
            }
        }else {
            for (int i = 0; i < secondName.length; i++) {
                System.out.print(secondName[i]+" ");
            }
        }
    }
}
