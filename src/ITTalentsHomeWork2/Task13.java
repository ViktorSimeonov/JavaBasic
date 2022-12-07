package ITTalentsHomeWork2;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
       /* Задача 13: Да се състави програма, която извежда всички
        естествени трицифрени числа, които имат сбор на цифрите равен
        на дадено число.
                Дадено : sum, където 2>=sum<=27.
        Пример: 26
        Изход: 899, 989, 998.*/
        System.out.println("Моля въведете число по-голямо или равно на 2 и по-малко или равно на 27");
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();

        while ( sum <=2 ||sum>=27 ){
            System.out.println("Въведено е число извън интервала, моля опитайте пак");
            sum=scanner.nextInt();
        }
        int a = 100;
        int b = 1000;
        for (int i = 100; i < 1000; i++) {
            int currentNum = i;
            int units = currentNum % 10;
            currentNum = currentNum / 10;
            int tens = currentNum % 10;
            currentNum = currentNum / 10;
            int hundred = currentNum;
            if ((units + tens +hundred) == sum) {
                System.out.println(i);
            }
        }

    }
}
