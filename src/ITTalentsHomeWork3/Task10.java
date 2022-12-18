package ITTalentsHomeWork3;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
       /* Задача 10:
        Да се състави програма, чрез която се въвеждат 7 цели числа в
        едномерен масив.
        Програмата да изведе числото, което е най-близко до средната
        стойност на въведените числа.
        Пример: 1,2,3,4,5,6,7
        //1 2 3 4 5 6 7
        Изход: средна стойност 4, най-близка стойност 4*/
        Scanner sc = new Scanner(System.in);
        int[] array = new int[7];
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            sum += array[i];
        }
        double num = Math.round(sum / array.length);
        double minimum = Double.MAX_VALUE;
        int nearestNumber=0;
        for (int i = 0; i < array.length; i++) {
            double currentDifference = Math.abs(num - array[i]);
            if (currentDifference < minimum) {
                minimum=currentDifference;
                nearestNumber=array[i];;

            }
        }
        System.out.printf("Средна стойност %.0f, най-близка стойност %d%n",num,nearestNumber);
    }
}

