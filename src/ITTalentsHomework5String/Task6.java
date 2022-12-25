package ITTalentsHomework5String;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        /*Задача 6:
        Да се състави програма, чрез която се въвежда изречение с отделни
        думи.
                Като резултат на екрана да се извежда същия текст, но всяка отделна
        дума да започва с главна буква, а следващите я букви да са малки.
        Пример: супер яката задача
        Изход: Супер Яката Задача
        input: supper cool task
        output: Supper Cool Task
        */
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().trim().split(" ");
        for (int i = 0; i < input.length; i++) {
            // method for crating just the first letter Upper
            input[i] = toUpper(input[i]);
            //IF I USE JUST toUpper(input[i]) and it is void then it doesn't change the String
            //that i gave as an argument,???
        }
        print(input);
    }

    static String toUpper(String input) {
        String firstLetter = input.substring(0, 1);
        firstLetter = firstLetter.toUpperCase();
        String restLetters = input.substring(1);
        restLetters = restLetters.toLowerCase();
        input = firstLetter + restLetters;
        return input;
        // input.replace(0,1,)


    }

    static void print(String[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
    }
}
