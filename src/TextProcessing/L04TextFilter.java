package TextProcessing;

import java.util.Scanner;

public class L04TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] wordsToBeBanned = scanner.nextLine().split(", ");
        String text = scanner.nextLine();
        for (int i = 0; i < wordsToBeBanned.length; i++) {
            String currentWord = wordsToBeBanned[i];
            String currentReplacement = lengthOfReplacement(currentWord);
            text = text.replace(currentWord, currentReplacement);
        }
        System.out.println(text);
    }

    private static String lengthOfReplacement(String currentWord) {
        StringBuilder asterixLenght= new StringBuilder();
        for (int i  = 0; i < currentWord.length(); i++) {
            //asterixLenght=asterixLenght+"*";
            asterixLenght.append("*");
        }
        return asterixLenght.toString();
    }
}
