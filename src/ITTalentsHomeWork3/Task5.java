package ITTalentsHomeWork3;

public class Task5 {
    public static void main(String[] args) {
       /* ������ 5:
        �������� ��������, ����� ������� ����� � 10 �������� �
        ������������ ����� �� ���������� ��� ��������, ����� �� ������� ��
        ��������, ������� �� 3.
        �� �� ������� ���������� �� ������.*/
        int[] arr = new int[10];
        System.out.print("[ ");
        for (int i = 0; i < 10; i++) {
            arr[i]=i*3;
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");

    }
}
