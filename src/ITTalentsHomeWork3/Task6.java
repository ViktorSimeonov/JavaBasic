package ITTalentsHomeWork3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
      /*  Задача 6:
        Напишете програма, която първо чете 2 масива и после извежда
        съобщение дали са еднакви, и дали са с еднакъв размер.*/
        Scanner sc = new Scanner(System.in);
        //int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Моля въведете първия масив ( цели числа разделени със запетая )");
        String[] arr1 = sc.nextLine().split(",");
        int[] firstArray = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            firstArray[i]=Integer.parseInt(arr1[i]);
        }
        System.out.println("Моля въведете втория масив ( цели числа разделени със запетая)");
        String[] arr2 = sc.nextLine().split(",");
        int[] secondArray = new int[arr2.length];
        for (int i = 0; i < arr2.length; i++) {
            secondArray[i]=Integer.parseInt(arr2[i]);
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
