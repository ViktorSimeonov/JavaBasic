package MethodsExercise;

import java.util.Scanner;

public class E02_VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        vowelsCount(word);
    }


    private static void vowelsCount(String word) {
        int vowelNumber = 0;
        for (int i = 0; i < word.length(); i++) {
            word = word.toLowerCase();
            char current = word.charAt(i);
            switch (current) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowelNumber++;
                    break;
            }
        }
        System.out.println(vowelNumber);
    }
}
