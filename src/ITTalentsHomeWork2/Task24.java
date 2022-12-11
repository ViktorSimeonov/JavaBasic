package ITTalentsHomeWork2;

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        /*Задача 24:
        Едно число X е палиндром, aко се чете еднакво отпред назад и
        отзад напред.
        Да се състави програма, която проверява дали въведено число е
        палиндром.
                Входни данни: N - естествено число от интервала [10 .. 30000].
        Пример: 17571
        Изход: числото е палиндром
        Използвайте цикъл do-while.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Моля въведете едно естествено число в интервала [10 .. 30000] ");
        System.out.print("n=");
        int n = scanner.nextInt();
        while (n < 10 || n >= 30000) {
            System.out.println("Въведено е число извън интервала, моля опитайте пак");
            System.out.print("n=");
            n = scanner.nextInt();
        }
        boolean itIsPalindrome = true;
        while (itIsPalindrome) {
            int number = n;
            int units = n % 10;
            n = n / 10;
            int tens = n % 10;
            n = n / 10;
            int hundred = n % 10;
            n = n / 10;
            int thousand = n % 10;
            n = n / 10;
            int tenThousand = n % 10;

            if (number < 100) {
                if (units == tens) {
                    System.out.println("числото е палиндром");
                    itIsPalindrome = false;

                }

            } else if (number < 1000) {
                if (units == hundred) {
                    System.out.println("числото е палиндром");
                    itIsPalindrome = false;

                }
            } else {
                if (units == tenThousand && tens == thousand) {
                    System.out.println("числото е палиндром");
                    itIsPalindrome = false;
                }

            }
            if(itIsPalindrome){
                System.out.println("числото не е палиндром");
                itIsPalindrome=false;
            }

        }

    }
}
