package PFMidExam05072020;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inputArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        String[] command = scanner.nextLine().split("\\s");
        while (!command[0].equals("end")) {
            if ("swap".equals(command[0])) {
                int firstIndex = Integer.parseInt(command[1]);
                int secondIndex = Integer.parseInt(command[2]);
                int temp = inputArr[firstIndex];
                inputArr[firstIndex] = inputArr[secondIndex];
                inputArr[secondIndex] = temp;
            } else if ("multiply".equals(command[0])) {
                int firstIndex = Integer.parseInt(command[1]);
               int secondIndex = Integer.parseInt(command[2]);
                int temp;
                temp = inputArr[firstIndex] * inputArr[secondIndex];
                inputArr[firstIndex] = temp;
            } else if ("decrease".equals(command[0])) {
                for (int i = 0; i < inputArr.length; i++) {
                    inputArr[i] -= 1;
                }
            }

            command = scanner.nextLine().split("\\s");
        }
        for (int i = 0; i < inputArr.length; i++) {
            System.out.print(inputArr[i]);
            if (i<inputArr.length-1){
                System.out.print(", ");
            }

        }
    }
}
//    swap {index1} {index2}" takes two elements and swap their places.
//        •	"multiply {index1} {index2}" takes element at the 1st index
//        and multiply it with the element at 2nd index.
//        Save the product at the 1st index.
//        •	"decrease" decreases all elements in the array with 1.
