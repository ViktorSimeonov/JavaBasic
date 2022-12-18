package ITTalentsLesson5Arrays;

public class SumOfElements {
    public static void main(String[] args) {
        int[][] table = {
                {1,2,3},
                {5,8,6},
                {4,2,0},
                {0,6,9}
        };
        int sum=0;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                sum+=table[i][j];

            }
        }
        System.out.println(sum);
    }
}
