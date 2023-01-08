package ITTalentsLesson10Algorithms;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cout=0;
        int[] input = {43,88,55,3,1,5,2,8,6,65};
        for (int j = 0; j < input.length; j++) {
            boolean sorted=true;
            for (int i = 0; i < input.length-1-i; i++) {
                cout++;
                int current = 0;
                if(input[i]> input[i+1]){
                    sorted=false;
                    current=input[i];
                    input[i]=input[i+1];
                    input[i+1]=current;
                }
            }
            if (sorted){
                break;
            }
        }

        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i]+" ");
        }
        System.out.println();
        System.out.println(cout);
    }
}
