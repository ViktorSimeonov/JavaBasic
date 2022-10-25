package PFMidExam05072020;

import java.util.Arrays;
import java.util.Scanner;

public class Numbers03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inputArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        double sum = 0;

        for (int i = 0; i < inputArr.length; i++) {
            sum += inputArr[i];
        }
        double average = sum / inputArr.length;
        int[] newArr = howManyAreBigger(inputArr, average);
        if (newArr.length > 0) {


            int nums = 0;
            for (int i = newArr.length - 1; i >= 0; i--) {
                System.out.print(newArr[i] + " ");
                nums++;
                if (nums == 5) {
                    break;
                }
            }
        }else {
            System.out.print("No");
        }

        // тук сега трябва да направя нов метод който да ми
    }

    private static int[] howManyAreBigger(int[] inputArr, double average) {
        int count = 0;
        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i] > average) {
                count++;
            }
        }
        int[] newArr = new int[count];
        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i] > average) {
                newArr[count - 1] = inputArr[i];
                count--;
            }
        }
        Arrays.sort(newArr);
        return newArr;
    }
}
