package ITTalentsPractice2Arrays;

public class Task7_UnderMainDiagonal {
    public static void main(String[] args) {
       /* 7. �������� ��������, ����� �� ������ ������� ������
        �������������� �� ���������� ��� ������� ��������.*/
        int[][] table = {
                {1,2,3},
                {3,18,5},
                {4,5,6}
        };
        int product=1;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if(i>j){
                    product=product*table[i][j];
                }
            }
        }
        System.out.println(product);
    }
}
