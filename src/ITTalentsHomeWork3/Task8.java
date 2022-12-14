package ITTalentsHomeWork3;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
     /*   Задача 8:
        Напишете програма, която намира и извежда най-дългата редица от
        еднакви поредни елементи в даден масив.*/
        Scanner sc = new Scanner(System.in);
        // 1 2 2 3 3 2 2 2 2 4 4 4 1 1 1 1 1 1 1 1
        //1 2 2 3 1 1 1 1 1 1 1 1 3 2 2 2 2 4 4 4
        //20
        //4 4 1 1 1 1
        //
        int[] array = new int[20];
        int longestRow = 1;
        int currentLongestRow = 1;
        int numberOfLongestRow = 1;
        int currentNumber;
        int nextNumber;
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < array.length - 1; i++) {
            currentNumber = array[i];
            nextNumber = array[i + 1];
            if (currentNumber == nextNumber) {
                currentLongestRow++;
                if (i== array.length -2){
                    if (currentLongestRow > longestRow) {
                        longestRow = currentLongestRow;
                        numberOfLongestRow = currentNumber;
                    }

                }

            } else {
                if (currentLongestRow > longestRow) {
                    longestRow = currentLongestRow;
                    numberOfLongestRow = currentNumber;
                }
                currentLongestRow = 1;
            }
        }
        for (int i = 0; i < longestRow; i++) {
            System.out.print(numberOfLongestRow+" ");
        }

    }
}
