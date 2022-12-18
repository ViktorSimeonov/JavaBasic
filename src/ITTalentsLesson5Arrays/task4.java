package ITTalentsLesson5Arrays;

public class task4 {
    public static void main(String[] args) {
        int[][] table = {
                {1, 2, 3},
                {5, 8, 6, 7, 3, 4},
                {4, 2},
                {0, 6, 9}
        };
        int count = 0;
        for (int i = 0; i < table.length; i++) {

            count += table[i].length;

        }
        //System.out.println(count);
        int[] newArray = new int[count];
        int num = 0;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                newArray[num++] = table[i][j];
            }
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i]+" ");
        }
    }
}
