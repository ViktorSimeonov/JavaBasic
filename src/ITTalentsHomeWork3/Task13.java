package ITTalentsHomeWork3;

import java.util.Scanner;

public class Task13 {
    /*Задача 13:
    Да се състави програма, чрез която се въвежда число и се представя
    като число в двоична бройна система.
    Програмата, чрез масив, да изчислява последователно всички цифри
    на въведеното естествено число в 2-ична бройна система.
    Пример: 99
    Изход: 1100011*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("Моля въведете едно цяло");
            num = sc.nextInt();
        } while (num < 0);
        int[] array = new int[32];
        int result;
        int count = 0;
        if (num == 0) {
            System.out.print("0");
        } else {
            while (num > 0) {
                result = num % 2;
                array[count] = result;
                count++;
                num = (num / 2);
            }
            for (int i = count - 1; i >= 0; i--) {
                System.out.print(array[i]);
            }
            ;
        }
    }
}
