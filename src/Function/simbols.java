package Function;

import java.util.Scanner;

public class simbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = "Viki";
        System.out.println(text.length());
        System.out.println(text.charAt(0));
        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
            System.out.println();
        }
    }
}
