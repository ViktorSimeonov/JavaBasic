package ITTalentsHomeWork2;

import java.util.Scanner;

public class Task12NaturalNumbersException {
    public static void main(String[] args) {
      /*  Задача 12: Да се състави програма, която извежда всички
        естествени трицифрени числа, които нямат еднакви цифри т.е.
        100,101, 606 и т.н. не се извеждат.*/
            int a = 100;
            int b = 1000;
        for (int i = a; i < b; i++) {
            int currentNum = i;
            int units = currentNum % 10;
            currentNum = currentNum / 10;
            int tens = currentNum % 10;
            currentNum = currentNum / 10;
            int hundred = currentNum;
            if (units != tens &&units!=hundred&&tens!=hundred) {
                System.out.println(i);
            }
        }
    }
}

