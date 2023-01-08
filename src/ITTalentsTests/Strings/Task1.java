package ITTalentsTests.Strings;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*Task 1 : Write a program to find length of a string using loop.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert a String:");
        String input = sc.nextLine();
        int length = 0;
        char[] arrStr = input.toCharArray();
        for (char c : arrStr) {
            length++;
        }
        System.out.printf("The length of the String is:%d%n",length);
    }
}
