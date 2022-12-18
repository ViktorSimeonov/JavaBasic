package ITTalentsHomeWork3;

import java.util.Scanner;

public class Task6_1 {
    public static void main(String[] args) {
      /*  Задача 6:
        Напишете програма, която първо чете 2 масива и после извежда
        съобщение дали са еднакви, и дали са с еднакъв размер.*/
        Scanner sc = new Scanner(System.in);
        //int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int size1;
        do {
            System.out.print("Моля въведете размера на пръвия масив (цяло положително число)");
            size1=sc.nextInt();
        }
        while (size1<1);
        int[] firstArray = new int[size1];
        for (int i = 0; i < firstArray.length; i++) {
            System.out.printf("Моля въведете %d елемент на масива",i);
            firstArray[i] = sc.nextInt();
        }
        int size2;
        do {
            System.out.print("Моля въведете размера на пръвия масив (цяло положително число)");
            size2=sc.nextInt();
        }
        while (size2<1);
        int[] secondArray = new int[size1];
        for (int i = 0; i < firstArray.length; i++) {
            System.out.printf("Моля въведете %d елемент на масива",i);
            secondArray[i] = sc.nextInt();
        }

        int count = 0;
        if(firstArray.length!=secondArray.length){
            System.out.println("Масивите са с различен размер");
            System.out.println("Масивите са различни");
        }else {
            for (int i = 0; i < firstArray.length; i++) {
                if(firstArray[i]==secondArray[i]){
                    count++;
                }
            }
            System.out.println("Масивите са с еднакъв размер");
            if(count==firstArray.length){
                System.out.println("Масивите са еднакви");
            }else {
                System.out.println("Масивите са различни");
            }
        }

    }
}
