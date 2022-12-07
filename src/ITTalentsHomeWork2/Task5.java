package ITTalentsHomeWork2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
      /*  Задача 5: Да се въведат от потребителя 2 числа. И да се
        изведат на екрана всички числа от по-малкото до по-голямото*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Моля въведете две цели числа");
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        for (int i = firstNum; i <= secondNum; i++) {
            System.out.println(i);
        }
    }
}