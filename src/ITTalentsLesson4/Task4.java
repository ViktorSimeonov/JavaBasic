package ITTalentsLesson4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /*  Task4. Write a program that tells you if a number is prime.//prosto chislo*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Моля въведете цяло число по-голямо от 0");
        int n = scanner.nextInt();
        while (n < 1) {
            System.out.println("Въведено е число извън интервала, моля опитайте пак");
            n = scanner.nextInt();
        }
        // или мога да итереирам от 2 до числото -1, и ако num %i ==0 то не е просто
               int count = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("The number is prime");
        } else {
            System.out.println("The number is not prime");
        }

    }
}
