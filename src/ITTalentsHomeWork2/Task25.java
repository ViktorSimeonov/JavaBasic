package ITTalentsHomeWork2;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        /*Задача 25:
        Да се направи програма, която по дадено число N, да изчислява
        N!, т.е. 1*2*3*4...*N.
                Пример: 5
        Изход: 120
        Използвайте цикъл do-while.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Моля въведете едно естествено число в интервала [10 .. 30000] ");
        System.out.print("n=");
        int n = scanner.nextInt();
        while (n < 1) {
            System.out.println("Въведено е число извън интервала, моля опитайте пак");
            System.out.print("n=");
            n = scanner.nextInt();
        }
        float result=1f;
        do {
            result*=n;
            n--;
        }while ((n>0));
      /*  while (n>0){
            result*=n;
            n--;
        }*/
        System.out.println(result);
    }
}
