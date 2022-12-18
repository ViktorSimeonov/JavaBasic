package ITTalentsHomeWork4_2DArrays;

public class Task2 {
    public static void main(String[] args) {
      /*  Задача 2:
        Имате квадратен двумерен масив от естествени числа, чийто стойности
        се въвеждат от конзолата. Да се отпечатат диагоналите на масива.
        Пример:
        1,4,6,3
        5,9,7,2
        4,8,1,9
        2,3,4,5
        Изход:
        1 9 1 5
        3 7 8 2*/
        int[][] table = {
                {1,4,6,3},
                {5,9,7,2},
                { 4,8,1,9},
                { 2,3,4,5},
        };
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if(i==j){
                    System.out.print(table[i][j]+" ");
                }
            }
        }
        System.out.println();
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if(i+j==table.length-1){
                    System.out.print(table[i][j]+" ");
                }
            }
        }
    }
}
