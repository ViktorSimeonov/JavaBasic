package ITTalentsTests.Strings;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*Task 2 : Write a program to concatenate two different strings into single string*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert String1:");
        String str1 = sc.nextLine();
        System.out.println("Insert String2:");
        String str2 = sc.nextLine();
        System.out.println("using + ");
        System.out.println("The result of concatenation is: "+str1+" "+str2);
        System.out.println("using concat()");
        System.out.printf("The result of concatenation is:%s ",str1.concat(str2));

    }
}
