package ITTalentsHomeWork2;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
/*        Задача 9: Да се прочетат 2 числа от клавиатурата А и В.
        Да се изведат всички числа от А до В на степен 2(разделени с
        запетая).Ако някое число е кратно на 3, да се изведе съобщение че
        числото се пропуска „skip 3“.Ако сумата от всички изведени числа (без
        пропуснатите) стане по-голяма от 200, да се прекрати извеждането.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Моля въведете 2 цели числа");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0;
        for (int i = a; i < b; i++) {
            if (i % 3 == 0) {
                System.out.printf("skip %d, ",i);
                continue;
            } else {
                sum += (i * i);
            }
            System.out.print(sum);
            if(sum>200){
                break;
            }
            System.out.print(", ");
        }
        System.out.println();
    }
}
