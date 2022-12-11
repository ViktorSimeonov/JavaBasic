package ITTalentsHomeWork2;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {

       /* Задача 16:
        Да се състави програма, чрез която се въвеждат 2 естествени
        числа N, M от интервала [10..5555].
        Програмата, чрез цикъл for, да извежда всички числа от
        интервала, които са кратни на 50 в низходящ ред.
                Пример: 25,249
        Изход: 200,150,100, 50.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Моля въведете две естествени числа в интервала [10..5555] ");
        System.out.print("n=");
        int n = scanner.nextInt();
        while (n < 10 || n > 5555) {
            System.out.println("Въведено е число извън интервала, моля опитайте пак");
            System.out.print("n=");
            n = scanner.nextInt();
        }
        System.out.print("m=");
        int m = scanner.nextInt();
        while ((m < 10 || m > 5555)) {
            System.out.println("Въведено е число извън интервала, моля опитайте пак");
            System.out.print("m=");
            m = scanner.nextInt();
        }
        int max;
        int min;
        if(m>n){
          max=m;
          min=n;
        }else {
            max=n;
            min=m;
        }
        for (int i = max; i >min ; i--) {
            if(i % 50 == 0){
                System.out.println(i);
            }
        }


    }
}
