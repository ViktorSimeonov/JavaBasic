package ITTalentsHomeWork3;

public class Task16 {
    public static void main(String[] args) {
   /*     ������ 16:
        �� �� ������� ��������, ���� ����� ������������� �������� 10
        ������ ����� �� ��������� �� ���������� �� ������� �����:
        1. ������� �������������� �����.
        2. ������ �������� ��� �������� ��-����� �� -0.231 �� ������� ���
        ������ �� �������� �� �������� �� ����� + ������� 41.25, � ������
        �������� �������� �� ������� � �������������� ����� ����� �������
        � �������� ������� �����. ��������� ����� �� ������� ������� � 1.
        3. �� �� ������� ���������� �� �������� � ��������������� �����.
                ������: -1.12, -2.43, 3.1, 4.2, 0, 6.4, - 7.5, 8.6, 9.1, -4
        �����: 42.25, 45.25, 9.3, 16.8, 0, 38.4, 90.25, 68.8, 81.9,141.25*/
        double[] array = {-1.12, -2.43, 3.1, 4.2, 0, 6.4, - 7.5, 8.6, 9.1, -4};
        double[] newArray = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            if(array[i]<-0.231){
                newArray[i]=(i+1)*(i+1)+41.25;
            }else {
                newArray[i]=(i+1)*array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if(i<array.length-1){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < newArray.length; i++) {
            System.out.printf("%.2f",newArray[i]);
            if(i<newArray.length-1){
                System.out.print(", ");
            }
        }
    }
}
