package ITTalentsTests.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = "Hello";
        String[] inT = sc.nextLine().split(" ");
        char[] chArr = in.toCharArray();
        char[] rev = new char[chArr.length];
        int j = 0;
        for (int i = chArr.length-1; i>=0 ; i--) {
            rev[j]=chArr[i];
            j++;
        }
        String revString = Arrays.toString(rev);
        String revStr1 = String.valueOf(rev);
        System.out.println(revString);
        System.out.println(revStr1);
    }
}
