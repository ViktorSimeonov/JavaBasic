package FundamentalsArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class E06_EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        boolean noEqual = true;
        for (int index = 0; index < nums.length; index++) {
            // take the current number to be checked with all to his left and then right
            int currentNum = nums[index];
            int sumLeft = 0;
            int sumRight = 0;

            //check the sum of numbers in left
            for (int leftNumbers = 0; leftNumbers < index ; leftNumbers++) {
                sumLeft+=nums[leftNumbers];
            }

            for (int rightNumbers = index+1 ; rightNumbers <nums.length ; rightNumbers++) {
                sumRight+=nums[rightNumbers];
            }
            if(sumLeft==sumRight){
                System.out.println(index);
                noEqual=false;
            }
        }
        if (noEqual){
            System.out.println("no");
        }
    }
}
