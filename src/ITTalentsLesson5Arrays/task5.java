package ITTalentsLesson5Arrays;

public class task5 {
    public static void main(String[] args) {
        int[][] table = {
                {1,2,3},
                {5,8,6},
                {4,2,0},
                {0,6,9}
        };
        int indexRow = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if(table[i][j]>max){
                    max=table[i][j];
                    indexRow=i;
                }

            }
        }
        for (int i = 0; i < table[indexRow].length; i++) {
            System.out.print(table[indexRow][i]+" ");
        }
    }
}
