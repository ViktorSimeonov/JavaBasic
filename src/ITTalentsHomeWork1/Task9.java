package ITTalentsHomeWork1;

import java.util.Scanner;

public class Task9 {
    public static void main(String[]args){
        /*Задача 9: Да се състави програма, която чете от конзолата 2
        естествени двуцифрени числа a,b. Програмата да изведе в
        конзолата дали последната цифра от произведението на двете
        числа е четна, както и самата цифра.
        – Входни данни: a,b - естествени числа от интервала [10..99].
        – Пример: 15, 25
        – Изход: 375, 5 нечетна*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Въведете едно естествено число в интервала [10..99] a=");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Въведете второ естествено число в интервала [10..99] b=");
        int b = Integer.parseInt(scanner.nextLine());
        int multiply = a * b;
        int result = multiply % 10;
        if(result % 2 == 0){
            System.out.printf("%d, %d четна ",multiply,result);

        }else {
            System.out.printf("%d, %d нечетна ",multiply,result);

        }

    }
}
