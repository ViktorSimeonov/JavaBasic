package ITTalentsHomeWork3;

import java.util.Scanner;

public class Task14 {
    /*Задача 14:
    Имате предварително въведен едномерен масив, съдържащ реални
    числа.
    Да се състави програма, чрез която се избират само елементи от
    масива със стойности от интервала [-2.99..2.99] и се отпечатват в нов
    масив. Новият масив да се извежда на екрана.
            Пример: 7.1,8.5,0.2,3.7,0.99,1.4,-3.5,-110,212,341,1.2
    Изход: 0.2; 0.99; 1.4; 1.2*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] array = {7.1,8.5,0.2,3.7,0.99,1.4,-3.5,-110,212,341,1.2};
        double[] newArray = new double[array.length];
        int count= 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]>=-2.99&&array[i]<=2.99){
                newArray[count]=array[i];
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.print(newArray[i]);
            if(i!=count-1){
                System.out.print("; ");
            }
        }
    }
}
