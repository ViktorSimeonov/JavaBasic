package ITTalentsHomeWork3;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        /*Задача 11:
        Да се състави програма, която въвежда от клавиатурата 7 цели числа
        в едномерен масив
        Програмата да изведе всички числа кратни на 5, но по големи от 5.
        Пример: -23, -55, 17, 75, 56, 105, 134
        // -23 -55 17 75 56 105 134
        Изход: 75,105 - 2 числа*/
        Scanner sc = new Scanner(System.in);
        int[] array = new int[7];
        int[] newArray = new int[array.length];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            array[i]=sc.nextInt();
            if(array[i] % 5 == 0 && array[i]>5){
                newArray[count]=array[i];
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.print(newArray[i]);
            if(i<count-1){
                System.out.print(", ");
            }
        }
        System.out.printf(" - %d числа",count );

    }
}
