package ITTalentsHomeWork2;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*Задача 18:
        Да се състави програма, чрез която се въвежда две числа от
        интервала [1..9].
        Програмата да извежда таблицата за умножение.
        Максималната стойност на множителите е определена от 2-те
        числа.
                Пример: 2 2
        Изход:
        1*1= 1;
        1*2= 2;
        2*1= 2;
        2*2= 4;*/
        System.out.println("Моля въведете две естествени числа в интервала [1..9] ");
        System.out.print("n=");
        int n = scanner.nextInt();
        while (n < 1 || n > 9) {
            System.out.println("Въведено е число извън интервала, моля опитайте пак");
            System.out.print("n=");
            n = scanner.nextInt();
        }
        System.out.print("m=");
        int m = scanner.nextInt();
        while ((m < 1 || m > 9)) {
            System.out.println("Въведено е число извън интервала, моля опитайте пак");
            System.out.print("m=");
            m = scanner.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m ; j++) {
                System.out.printf("%d*%d=%d%n",i,j,i*j);
            }
        }
    }
}
