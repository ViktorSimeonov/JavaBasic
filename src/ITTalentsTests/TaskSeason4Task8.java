package ITTalentsTests;

import java.util.Scanner;

public class TaskSeason4Task8 {
    public static void main(String[] args) {
       /* (100 points) Write a method that takes an
        array of strings and prints them one per
        line in a rectangular frame.
                For example: The list
    {“Hello”, “World”, “in”, “a”, “frame”} gets printed as:
    input: Hello World in a frame
    */
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().trim().split(" ");
        //първо ще определя кой е най дългия за да знам колко ще бъде i
        int col = input[0].length();
        for (int i = 1; i < input.length; i++) {
            if (input[i].length() > col) {
                col = input[i].length();
            }
        }
        //добавям 2 колони за звездичките
        col += 2;
        int row = input.length + 2;
        for (int i = 0; i < row; i++) {
            if (i == 0 || i == row - 1) {
                for (int j = 0; j < col; j++) {
                    System.out.print("*");
                }
            }
            if(i!=0&&i!=row-1) {
                System.out.print("*");
                if (input[i-1].length() == col - 2) {
                    System.out.print(input[i-1]);
                    System.out.print("*");

                } else {
                    System.out.print(input[i-1]);
                    for (int m = 0; m < col - 2 - input[i-1].length(); m++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");

                }

            }
            /*if (i == row - 1) {
                for (int j = 0; j < col; j++) {
                    System.out.print("*");
                }
            }*/

            System.out.println();
        }
    }
}
