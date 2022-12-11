package ITTalentsLesson4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /** Task3. Write a program that prints all numbers from A to B that can be divided by 3. A and B - from
         * operator from console. Numbers must be in ascending order.*/
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Моля въведете две цели числа%n");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int max = 0;
        int min = 0;
        if (a > b) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }
        for (int i = min; i <= max; i++) {
            if (i % 3 == 0){
                System.out.println(i);

            }
        }
    }
}
