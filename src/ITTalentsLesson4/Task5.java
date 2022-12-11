package ITTalentsLesson4;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
//        Task5. Write a program that reads a positive number and writes its binary representation.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Моля въведете цяло число ");
        int n = scanner.nextInt();

        while (n < 0) {
            System.out.println("Въведено е число извън интервала, моля опитайте пак");
            n = scanner.nextInt();
        }
        int result = 0;
        int count = 0;
        int countZero = 0;
        int zero=1;
        //
        while (n > 0) {
            //System.out.print(n % 2);
            if (n % 2 != 0) {
                count++;
                if (count == 1) {
                    result = 1;
                } else {
                    result = (result * 10) + 1;
                }
            } else {
                result = result * 10;
                if (count < 1) {
                    countZero++;
                }
            }

            n = n / 2;

        }
        for (int i = 1; i <= countZero; i++) {
            zero*=10;
        }
        System.out.println(zero);
        System.out.println(result*zero);

    }
}
