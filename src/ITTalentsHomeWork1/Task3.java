package ITTalentsHomeWork1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
       /* Задача 3: Въведете 2 различни числа от конзолата и разменете
        стойността им. Разпечатайте новите стойности.
*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Въведете едно цяло число a=");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Въведете едно цяло число b=");
        int b = Integer.parseInt(scanner.nextLine());
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.printf("след размяната a=%d, b=%d", a, b);
    }


}
