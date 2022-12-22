package ITTalentsHomeWork4_2DArrays;

public class Task5 {
    public static void main(String[] args) {
       /* ������ 5:
        �� �� ������� ��������, ��� ����� ������������� �� ��������
        ���������� ����� � �������� ����� 4*4 ��������.
                ���������� �� ������� �������� �� ���������� ����� � �������������
        �� ���-�������� ���� �� ������ ������ ���-�������� ���� �� ������.
                ������:
        1,2,3,4
        5,6,7,8
        9,10,11,12
        13,14,15,16

        �����:
        ���-������ ���� �� ������ 58
        ���-������ ���� �� ������ 40
        ������������ ���� �� ������ � > �� ������������ ���� �� ������*/
        int[][] table = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
        };
        int sumRow = 0;
        int maxSumRow = 0;

        int maxSumCol = 0;
        int sumCol = 0;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                sumRow += table[i][j];
            }
            if (maxSumRow < sumRow) {
                maxSumRow = sumRow;
            }
            sumRow = 0;
        }
        for (int j = 0; j < table[table.length - 1].length; j++) {
            for (int i = 0; i < table.length; i++) {
                sumCol += table[i][j];
            }
            if (maxSumCol < sumCol) {
                maxSumCol = sumCol;
            }
            sumCol = 0;

        }
        System.out.println("the biggest sum by row is: "+maxSumRow);
        System.out.println("the biggest sum by col is: "+maxSumCol);
        if(maxSumCol<maxSumRow){
            System.out.println("Max sum by rows is "+">"+" then the max sum by col");
        }else {
            System.out.println("Max sum by rows is "+"<"+" then the max sum by col");

        }
    }
}
