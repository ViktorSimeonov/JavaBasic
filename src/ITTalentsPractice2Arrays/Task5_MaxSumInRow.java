package ITTalentsPractice2Arrays;

public class Task5_MaxSumInRow {
    public static void main(String[] args) {
        /*5. Напишете програма, която за дадена матрица m x n от числа
        намира реда, в който сумата от елементите е максимална.*/
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
