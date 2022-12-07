package ITTalentsHomeWork1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*Задача 1: Да се изведат съобщения към потребителя и да се
        прочетат 2 числа от клавиатурата A и B (може да са с плаваща
        запетая – double). После да се прочете 3-то число C и да се
        провери дали то е м/у A и B. Да се изведе подходящо съобщение
        за това дали C е между A и B.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("game");
        System.out.println("да поиграем");
        System.out.println("Въведете А:");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Въведете B:");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Въведете C:");
        double c = Double.parseDouble(scanner.nextLine());
        if (c > a && c < b) {
            System.out.printf("Числото %.1f е между %.1f и %.1f",c,a,b);
        } else if (c < a && c > b) {
            System.out.printf("Числото %.1f е между %.1f и %.1f",c,b,a);
        }else {
            System.out.printf("Числото %.1f не е между %.1f и %.1f",c,b,a);
        }
    }
}
