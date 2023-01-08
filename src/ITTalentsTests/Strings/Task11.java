package ITTalentsTests.Strings;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        //input : I love programming and learn Java.
        Scanner sc = new Scanner(System.in);
        String[] in = sc.nextLine().trim().split("\\s+[A-Za-z]+");
        for (int i = 0; i < in.length/2; i++) {
            String temp = in[i];
            in[i]=in[in.length-1-i];
            in[in.length-1-i]=temp;
        }
        System.out.println(String.join(" ",in));
    }
}
