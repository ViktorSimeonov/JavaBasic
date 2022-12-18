package ITTalentsHomeWork3;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        /*Задача 9:
        Напишете програма, в която потребителя въвежда масив, след което
        елементите на масива се обръщат в обратен ред (Целта не е масива да
        се отпечата в обратен ред, ами първо да се обърне, след което да се
        отпечата в нормален ред). Пробвайте да решите задачата първо с един
        допълнителен масив и после без да използвате друг масив.*/
        Scanner sc = new Scanner(System.in);
        // 1 2 3 4 5
        int help ;
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i]=sc.nextInt();
        }
        for (int i = 0; i < array.length/2; i++) {
            help=array[array.length-1-i];
            array[array.length-1-i]=array[i];
            array[i]=help;
        }
        for(int i = 0; i<array.length;i++){
            System.out.print(array[i]+" ");
        }


    }
}
