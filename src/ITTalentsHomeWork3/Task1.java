package ITTalentsHomeWork3;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        /*Задача; 1:
        Да се прочете масив и да се намери най-малкото число кратно на
        3 от масива.
        10, 3, 5, 8, 6, -3, 7
        Най-малкото число кратно на 3 е -3*/
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[7];//{10, 3, 5, 8, 6, -3, 7};
        //10 3 5 8 6 -3 7
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            arr[i]= scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                if(min>arr[i]){
                    min=arr[i];
                }
            }
        }
        System.out.println(min);
    }
}
