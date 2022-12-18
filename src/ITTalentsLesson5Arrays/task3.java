package ITTalentsLesson5Arrays;

public class task3 {
    public static void main(String[] args) {
        int[][] table = {
                {1,2,3},
                {5,8,6},
                {4,2,0},
                {0,6,9}
        };
        int products = 1;
        for (int i = 0; i < table.length; i+=2) {

            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j]+" ");

            }
            System.out.println();
        }

    }
}
