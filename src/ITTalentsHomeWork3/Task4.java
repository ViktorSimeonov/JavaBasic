package ITTalentsHomeWork3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
       /* Задача 4:
        Да се прочете масив и да се отпечата дали е огледален.
                Следните масиви са огледални:
        [3 7 7 3]
        [4]
        [1 55 1]
        6 27 -1 5 7 7 5 -1 27 6
        6 27 -1 5 7 5 -1 27 6
        6 27 5 7 5 27 6 */
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        if (arr.length == 1) {
            System.out.print("Огледален");
        } else {
            for (int i = 0; i < arr.length / 2; i++) {
                if (arr[i] == arr[arr.length - 1 - i]) {
                    count++;
                }

            }
            if (count == arr.length / 2) {
                System.out.print("Огледален");
            } else {
                System.out.print("Не е огледален");

            }

        }
    }
}

