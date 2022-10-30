package ObjectsAndClasses;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class L01RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = (scanner.nextLine().split(" "));
        Random rnd = new Random();
        for (int i = 0; i < words.length; i++) {
            int randomWordX = rnd.nextInt(words.length);
            int randomWordY = rnd.nextInt(words.length);
            String oldWord = words[randomWordX];
            words[randomWordX]=words[randomWordY];
            words[randomWordY]=oldWord;
           
        }
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}
