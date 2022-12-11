package ITTalentsHomeWork2;

import java.util.Scanner;

public class Task17Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
/*        Задача 17:
        Да се състави програма, която извежда квадрат, чийто страни са
        оформени със знака *, а вътрешността е запълнена със въведен
        знак.
                Входни данни b - дължина на страната число от интервала
                [3..20], c - желан знак.
                Програмата да използва цикъл for.
        Пример: 4 +
                Изход:
                    ****
                    *++*
                    *++*
                    *****/
        System.out.println("Моля въведете дължина на страната на квадрата число от интервала [3..20] ");
        System.out.print("b=");
        int b = scanner.nextInt();

        while (b < 3 || b > 20) {
            System.out.println("Въведено е число извън интервала, моля опитайте пак");
            System.out.print("b=");
            b = scanner.nextInt();
        }
        System.out.println("моля изберете желан знак за страните на квадрата ");

        char symbol = scanner.next().charAt(0);
        for (int i = 0; i < b; i++) {
            if (i == 0 || i == b-1) {
                for (int j = 0; j < b; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
                for (int k = 1; k < b-1; k++) {
                    System.out.print(symbol);
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
