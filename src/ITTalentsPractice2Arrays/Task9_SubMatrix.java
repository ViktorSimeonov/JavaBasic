package ITTalentsPractice2Arrays;

public class Task9_SubMatrix {
    public static void main(String[] args) {
       /* 9. Дадена е правоъгълна
        матрица с числа. Да се намери в нея
        максималната подматрица
        с размер 2 х 2 и да се отпечата на
        конзолата. Под максимална подматрица се разбира
        подматрица, която има максимална сума на елементите, които я
        съставят.*/
        int[][] table= {
                {8,6,1,3,5},
                {7,1,4,8,1},
                {6,2,3,7,1},
                {5,3,9,8,6}
        };
        int maxI=-1;
        int maxJ=1;
        int maxSum=table[0][0]+table[0][1]+table[1][0]+table[1][1];
        //Iterate all except last row and last column
        for (int i = 0; i < table.length-1; i++) {
            for (int j = 0; j < table[i].length-1; j++) {
                //sum the cell with ints right, bottom, dial
                int sum = table[i][j]+table[i][j+1]
                        +table[i+1][j]+table[i+1][j+1];
                //find max sum
                if(sum>maxSum){
                    maxSum=sum;
                    //save the indexes of the starting cell
                    maxI=i;
                    maxJ=j;
                }
            }
        }
        //dislplay the starting cell with its right, bottom
        System.out.println(table[maxI][maxJ]+" "+table[maxI][maxJ+1]);
        System.out.println(table[maxI+1][maxJ]+" "+table[maxI+1][maxJ+1]);

    }
}
