package ITTalentsHomeWork1;

public class test {
    public static void main(String[] args) {
         /*������ 12: ��������� ������ �� ������ ������ ������ �� 4 �
        ���������� ����������, �� ��� �������� ������ �� 400, �.�. 1900
        �� � ���������, �� 1600 � 2000 �� ���������.��������� ��������,
        ����� �� ������ ���, ����� � ������, ��������� ���������� ����.
        � ������ �����: ��� ����� �� ���, �����, ������.
        � ������: 28, 2, 2021
        � �����: 1,3,2021*/

        int year400 = 1600 % 400;//���������
        int year100 = 1600 % 100;//�����������
        int year4 = 1600 % 4;//���������
        if (year400 == 0 && year4 == 0 && (year100!=0)){

        }

        System.out.println(year400);
        System.out.println(year100);
        System.out.println(year4);
    }
}
