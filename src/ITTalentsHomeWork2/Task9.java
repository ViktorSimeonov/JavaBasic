package ITTalentsHomeWork2;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
/*        ������ 9: �� �� �������� 2 ����� �� ������������ � � �.
        �� �� ������� ������ ����� �� � �� � �� ������ 2(��������� �
        �������).��� ����� ����� � ������ �� 3, �� �� ������ ��������� ��
        ������� �� �������� �skip 3�.��� ������ �� ������ �������� ����� (���
        ������������) ����� ��-������ �� 200, �� �� �������� �����������.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("���� �������� 2 ���� �����");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0;
        for (int i = a; i < b; i++) {
            if (i % 3 == 0) {
                System.out.printf("skip %d, ",i);
                continue;
            } else {
                sum += (i * i);
            }
            System.out.print(sum);
            if(sum>200){
                break;
            }
            System.out.print(", ");
        }
        System.out.println();
    }
}
