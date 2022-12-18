package ITTalentsHomeWork4_2DArrays;

public class Task1 {
    public static void main(String[] args) {
        /*������ 1:
        ����� �������� ����� 6�5 �� ���������� �����, ����� ��������� ��
        �������� �������������.
        �� �� ������� ��������, ���� ����� �� �������� ���������� �� ������
        � ���-������� � ���-�������� ��������.
                ������:
        48,72,13,14,15
        21,22,53,24,75
        31,57,33,34,35
        41,95,43,44,45
        59,52,53,54,55
        61,69,63,64,65
        �����:
        ���-����� 13;
        ���-������ 95*/
        int[][] table = {
                {48, 72, 13, 14, 15},
                {21, 22, 53, 24, 75},
                {31, 57, 33, 34, 35},
                {41, 95, 43, 44, 45},
                {59, 52, 53, 54, 55},
                {61, 69, 63, 64, 65},
        };
        int theBiggest = Integer.MIN_VALUE;
        int theSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (table[i][j] > theBiggest) {
                    theBiggest = table[i][j];
                }
                if (table[i][j]<theSmallest){
                    theSmallest=table[i][j];
                }
            }
        }
        System.out.println("The smallest: "+ theSmallest);
        System.out.println("The biggest: "+ theBiggest);
    }
}
