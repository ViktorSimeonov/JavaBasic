package ITTalentsLesson5Arrays;

public class Arrays2D {
    public static void main(String[] args) {
        //int[][] table = new int[4][3];
        int[][] table = {
                {3,4,5},
                {2,4,6},
                {9,7,5},
                {0,6,9}
        };
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j]+" ");
            }
            System.out.println();
        }
    }
}
