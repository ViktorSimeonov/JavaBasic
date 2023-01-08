package ITTalentsLesson10Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSortFast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //find min and max at the same time :)

        //int[] input = {43, 88, 55, 3};
        int[] input = {43,88,55,3,1,5,2,8,6,65};
        System.out.println(Arrays.toString(input));
        for (int i = 0; i < input.length; i++) {
            int max = Integer.MIN_VALUE;
            int maxIndex = 0;
            int last = 0;
            int min = Integer.MAX_VALUE;
            int minIndex = 0;
            int first = 0;
            boolean end = true;
            for (int j = i; j <= input.length - 1 - i; j++) {
                if (input[j] > max) {
                    max = input[j];
                    maxIndex = j;
                    end = false;
                }
                if (input[j] < min) {
                    min = input[j];
                    minIndex = j;
                    end = false;
                }
                if (minIndex == input.length - 1) {
                    minIndex = maxIndex;
                    end = false;
                }
                if (end) {
                    break;
                }
            }
            if (!end) {
                last = input[input.length - 1 - i];
                input[input.length - 1 - i] = max;
                input[maxIndex] = last;
                first = input[i];
                input[i] = min;
                input[minIndex] = first;
            }else {
                break;
            }

        }
        System.out.println(Arrays.toString(input));
    }
}

