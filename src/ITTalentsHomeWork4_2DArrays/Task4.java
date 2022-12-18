package ITTalentsHomeWork4_2DArrays;

public class Task4 {
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
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16},
        };
        int[][] newTable = new int[table.length][table.length];

        for (int j = 0; j < table.length; j++) {
            for (int i = table.length-1; i >=0 ; i--) {
                newTable[j][i]=table[i][j];

            }
        }
    }
}
