package ITTalentsHomeWork2;

import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*Задача 22:
        Да се състави програма, която извежда първите 10 най-малки
        числа, които се делят на 2, 3 или на 5 и които са по-големи от
        въведено естествено число.
                Числата се извеждат, заедно с техния пореден номер.
        Входни данни: число от интервала [1..999]
        Пример: 1
        Изход: 1:2; 2:3, 3:4, 4:5, 5:6, 6:8, 7:9, 8:10, 9:12, 10:14
        Използвайте цикъл while.*/
        System.out.println("Моля въведете едно естествено число в интервала [1..999] ");
        System.out.print("n=");
        int n = scanner.nextInt();
        while (n < 1 || n >= 1000) {
            System.out.println("Въведено е число извън интервала, моля опитайте пак");
            System.out.print("n=");
            n = scanner.nextInt();
        }
        int count = 10;
        int counter = 0;
        while (count > 0) {
            n += 1;
            if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0) {
                counter++;
                System.out.printf("%d:%d", counter, n);
                count--;
                if (count == 0) {
                    System.out.print(" ");
                }else {
                    System.out.print(", ");
                }
            }
            if (count == 0) {
                System.out.print(" ");
            }
        }
    }
}
