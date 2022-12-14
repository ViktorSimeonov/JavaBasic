package ITTalentsHomeWork3;

import java.util.Scanner;

public class Task2 {
   /* Задача 2:
    Нека по въведен масив да се конструира нов, като половината му
    елементи са точно като на оригиналния, а другите да са тези
    елементи, но в обратен ред. Последно, да се изведе новия масив
    на екрана.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] arrNew = new int[arr.length*2];
        for (int i = 0; i < arr.length; i++) {
            arrNew[i]=arr[i];
            arrNew[arr.length+i] =arr[arr.length-1-i];
        } System.out.println("Оригинален : ");
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Преработен: ");
        for (int i = 0; i < arrNew.length; i++) {
            System.out.print(arrNew[i]+" ");
        }
    }

}

