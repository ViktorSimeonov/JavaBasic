package ITTalentsLesson5Arrays;

public class task2 {
    public static void main(String[] args) {
        int[][] table = {
                {1,2,3},
                {5,8,6},
                {4,2,0},
                {0,6,9}
        };
        int products=1;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if(table[i][j]>4){

                    products*=table[i][j];
                }

            }
        }
        System.out.println(products);
    }
}
