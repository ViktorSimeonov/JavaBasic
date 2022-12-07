package ITTalentsHomeWork2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
       /* Задача 14: Да се състави програма, която по въведено
        естествено число N от интервала [10..200] извежда в обратен
        ред всички числа, които са кратни на 7 и са по-малки от N.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Моля въведете естествено число в интервала [10..200] ");
        int n = scanner.nextInt();
        while ( n <10 ||n>200 ){
            System.out.println("Въведено е число извън интервала, моля опитайте пак");
            n=scanner.nextInt();
        }
        for (int i = 10; i <= n; i++) {
            if (i % 7 == 0 && i < n){
                System.out.println(i);
            }
        }


    }
}
