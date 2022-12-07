package ITTalentsHomeWork1;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*Задача 16: Въведено е трицифрено естествено число от вида
        abc.Трябва да се провери дали:
        – ако a = b = c, Изход: цифрите са равни;
        – ако a>b>c, Изход: цифрите са във възходящ ред;
        – ако a<b<c, Изход: цифрите са в низходящ ред;
        – и изход: цифрите са ненаредени, за неописаните случаи.
        Да се състави програма, която извежда резултата от проверката за
        наредба на цифрите в числото.
        – Пример: 345
        – Изход: възходящ ред.*/
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        if (num1 == num2 && num1 == num3) {
            System.out.println("цифрите са равни");
        } else if (num1 > num2 && num2 > num3) {
            System.out.println("цифрите са във възходящ ред");
        } else if (num1 < num2 && num2 < num3) {
            System.out.println("цифрите са в низходящ ред");

        }else {
            System.out.println("цифрите са ненаредени");
        }
    }
}
