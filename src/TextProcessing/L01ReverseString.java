package TextProcessing;

import java.util.Scanner;

public class L01ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String reversedString = "";
            char[] inputChar = input.toCharArray();
            for (int i = inputChar.length - 1; i >= 0; i--) {
               reversedString=reversedString+inputChar[i];

            }
            System.out.printf("%s = %s%n",input,reversedString);
            input=scanner.nextLine();

        }
    }
}