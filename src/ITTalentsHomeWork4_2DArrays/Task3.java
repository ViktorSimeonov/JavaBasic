package ITTalentsHomeWork4_2DArrays;

public class Task3 {
    public static void main(String[] args) {
        /*������ 3:
        ����� �������� ����� �� �����, ����� ��������� �� ��������
        �������������. �� �� ��������� ������ �� ���������� �� ������,
        ����� � ������������������� �� ���� �����.*/
        int[][] table = {
                {1,4,6,3},
                {5,9,7,2},
                { 4,8,1,9},
                { 2,3,4,5},
        };
        double sum = 0;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                sum+=table[i][j];
            }
        }
        System.out.println("sum is: "+sum);
        System.out.println("average is: "+(sum/ (table.length* table.length)));
    }
}
