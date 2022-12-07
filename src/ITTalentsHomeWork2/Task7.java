package ITTalentsHomeWork2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
       /* Задача 7: Започвайки от 3, да се изведат на екрана първите n
        числа които се делят на 3. Числата да са разделени със запетая.*/
        System.out.println("Моля въведете едно цяло число различно от 0");
        int n = scanner.nextInt();
        for (int i = 3; i <= n*3; i=i+3) {
            System.out.print(i);
            if(i<n*3) {
                System.out.print(", ");
            }
        }
      /*  while (n>0){


            n--;
        }*/

    }
}
