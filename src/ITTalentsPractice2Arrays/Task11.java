package ITTalentsPractice2Arrays;
public class Task11 {

    public static void main(String[] args) {
     /*   Да се напише програма която изисква от потребителя да въведе
        2 числа n и m. След това да се построи матрица с размер n x m по
        следният начин (примерите са дадени за въведени n=4 и m=5):*/
        int rows = 4;
        int cols = 5;

        int[][] table = new int[rows][cols];

        int number = 10;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                table[i][j] = number++;
            }
        }
        //print
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }

    }
}
