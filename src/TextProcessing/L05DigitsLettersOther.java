package TextProcessing;

import java.util.Scanner;

public class L05DigitsLettersOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder symbol = new StringBuilder();
        for (int i = 0; i < input.length() ; i++) {
            char current = input.charAt(i);
           /* int value = current;
            System.out.println(current);
            System.out.println(value);*/
            if(Character.isDigit(current)){
                digits.append(current);
            } else if (Character.isAlphabetic(current)) {
                letters.append(current);
            } else  {
                symbol.append(current);
            }

        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(symbol);
    }
}
