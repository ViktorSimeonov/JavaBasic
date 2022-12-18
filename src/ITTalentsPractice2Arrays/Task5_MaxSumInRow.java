package ITTalentsPractice2Arrays;

public class Task5_MaxSumInRow {
    public static void main(String[] args) {
        /*5. �������� ��������, ����� �� ������ ������� m x n �� �����
        ������ ����, � ����� ������ �� ���������� � ����������.*/
        int[][] table = {
                {1,2,3},
                {3,18,5},
                {4,5,6}
        };
        int currentSum =0 ;
        int maxSum=0;
        int index = -1;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                currentSum=currentSum+table[i][j];
            }
            if(currentSum>maxSum){
                maxSum=currentSum;
                index=i;
            }
            currentSum=0;
        }
        for (int i = 0; i < table[index].length; i++) {
            System.out.print(table[index][i]+" ");
        }
    }
}
