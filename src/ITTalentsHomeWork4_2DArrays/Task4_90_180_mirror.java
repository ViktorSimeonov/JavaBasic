package ITTalentsHomeWork4_2DArrays;

public class Task4_90_180_mirror {
    public static void main(String[] args) {
         /* Задача 4:
        Имате предварително въведени стойности на елементи в двумерен
        масив - естествени числа.
                Да се състави програма, чрез която се извеждат стойностите на
        елементите в двумерен масив след обръщането му на +90 градуса.
                Пример:
        1,2,3,4
        5,6,7,8
        9,10,11,12
        13,14,15,16
        Изход
        13,9,5,1
        14,10,6,2
        15,11,7,3
        16,12,8,4*/
        int[][] table = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
        };
        int[][] newTable = new int[table.length][table.length];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println();
        System.out.println("90 degrees");
        for (int i = 0; i < table.length; i++) {
            for (int j = table[i].length - 1; j >= 0; j--) {
                System.out.print(table[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("180 degrees");
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println("mirrored");
        System.out.println();
        for (int i = 0; i < table.length; i++) {
            for (int j = table[i].length - 1; j >= 0; j--) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}
