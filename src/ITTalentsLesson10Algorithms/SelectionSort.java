package ITTalentsLesson10Algorithms;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cout=0;
        int[] input = {43,88,55,3,1,5,2,8,6,65};
        System.out.println(Arrays.toString(input));
        for (int i = 0; i < input.length; i++) {
            int max = input[0];
            int maxIndex=0;
            int last =0;
            for (int j = 1; j <= input.length-1-i; j++) {
              if(input[j]>max){
               max=input[j];
               maxIndex=j;
              }
            }
            last=input[input.length-1-i];
            input[input.length-1-i]=max;
            input[maxIndex]=last;
        }
        System.out.println(Arrays.toString(input));
    }
}
