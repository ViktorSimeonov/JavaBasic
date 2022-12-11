package ITTalentsHomeWork2;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /* Задача 19: Да се състави програма, чрез която по въведено
        естествено число от интервала [10..99] се извежда поредица
        числа, при спазване на следните изисквания:
        1) ако предходното число е четно се извежда 0.5*числото;
        2) ако предходното число е нечетно се извежда 3*числото +1.
        Извеждането продължава докато не се получи стойност 1.
        Пример: 11
        Изход: 34 17 52 26 13 40 20 10 5 16 8 4 2 1.*/
        System.out.println("Моля въведете едно естествено число в интервала [1..9] ");
        System.out.print("n=");
        int n = scanner.nextInt();
        while (n < 10 || n > 99) {
            System.out.println("Въведено е число извън интервала, моля опитайте пак");
            System.out.print("n=");
            n = scanner.nextInt();
        }
        int print;
        while (n > 1) {
            if (n % 2 != 0) {
                n = (3 * n + 1);
                System.out.printf(n+" ");
            } else  {
                n =n/2;
                System.out.print(n+" ");
            }

        }

    }
}
