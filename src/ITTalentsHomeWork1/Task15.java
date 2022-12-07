package ITTalentsHomeWork1;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        /*Задача 15: Да се състави програма, която въвежда естествено
        число от интервала [0..24]. Програмата да изведе съответстващо
        съобщение съобразно въведения час.Периодите са:
        – [18..4] - Добър вечер;
        – [4..9] - Добро утро;
        – [9..18] - Добър ден
        – Пример: 10
        – Изход: Добър ден*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Моля въведете естествено число от интервала [0..24]");
        int hour = scanner.nextInt();
        if (hour > 4 && hour <= 9) {
            System.out.println("Добро утро");
        } else if (hour > 9 && hour <= 18) {
            System.out.println("Добър ден");
        } else if (hour>18&&hour<24||hour>=0&&hour<=4) {
            System.out.println("Добър вечер");

        }
    }
}
