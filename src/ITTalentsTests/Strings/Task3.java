package ITTalentsTests.Strings;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*Task 3 : Write a program to compare two strings using loop character by character*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert String1:");
        String str1 = sc.nextLine();
        System.out.println("Insert String2:");
        String str2 = sc.nextLine();
        boolean stringsAreEqual=true;
        if (str1.length() != str2.length()) {
            System.out.println("The strings are different");
        } else {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) == str2.charAt(i)) {

                } else {
                    System.out.println("The strings are different");
                    stringsAreEqual=false;
                    break;
                }
            }
        }
        if (stringsAreEqual) {
            System.out.print("The Strings are Equal");
        }
    }
}
