package ITTalentsHomeWork2;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*Задача 20:
        Да се състави програма, чрез която се извежда квадрат от
        цифри. Сумите от елементите на произволен ред или стълб са
        равни на 45.
        Пример:
        1 2 3 4 5 6 7 8 9 0
        2 3 4 5 6 7 8 9 0 1
        3 4 5 6 7 8 9 0 1 2
        4 5 6 7 8 9 0 1 2 3
        5 6 7 8 9 0 1 2 3 4
        6 7 8 9 0 1 2 3 4 5
        7 8 9 0 1 2 3 4 5 6
        8 9 0 1 2 3 4 5 6 7
        9 0 1 2 3 4 5 6 7 8
        0 1 2 3 4 5 6 7 8 9*/
        for (int i = 1; i <= 10; i++) {
            for (int j = i; j < 10; j++) {
                System.out.print(j);
            }
            for (int k = 0; k < i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }




    }
}
