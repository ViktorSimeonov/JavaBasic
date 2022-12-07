package ITTalentsHomeWork1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
       /* Задача 6: Въведете 3 числа от клавиатурата а1, а2 и а3. Разменете стойностите им
        така, че а1 да има стойността на а2, а2 да има стойността на а3, а а3 да има старата
        стойност на а1.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Въведете едно цяло число a1=");
        int a1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Въведете второ различно цяло число a2=");
        int a2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Въведете трето различно цяло число a3=");
        int a3 = Integer.parseInt(scanner.nextLine());
        a1 = a1 + a2;
        a2 = a1 - a2;
        a1 = a1 - a2;
        a2 = a2 + a3;
        a3 = a2 - a3;
        a2 = a2 - a3;
        System.out.printf("a1=%d%n",a1);
        System.out.printf("a2=%d%n",a2);
        System.out.printf("a3=%d%n",a3);


    }
}
