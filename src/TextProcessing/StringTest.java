package TextProcessing;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = new String(new char[] {'s', 't', 'r'});
        char[] charArr = str.toCharArray();
        //String myString = new String("Petre");
        String greet = "Hello, ";
        String name = "John!";
        String result = greet.concat(name);
        System.out.println(result);
        // String.join("", .....);
        String t = String.join("", "con", "ca", "ten", "ate");
        System.out.println(t);
        String s = "abc";
        String[] myString = new String[3];
        String[] arr = new String[3];
        for  (int i = 0; i < arr.length; i++) { arr[i] = s; }
        String repeated = String.join("", arr); // "abcabcabc"
        System.out.println(repeated);

    }

}
