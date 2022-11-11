package TextProcessing;

import java.util.Scanner;

public class L03Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String toRemove = scanner.nextLine();
        String input = scanner.nextLine();
        while (input.contains(toRemove)){
           input = removeOccurrence(input,toRemove);
        }
        System.out.println(input);

    }

    private static String removeOccurrence(String input, String toRomove) {
       int beginIndex =input.indexOf(toRomove);
       int endIndex =toRomove.length()+beginIndex;
        String firstPart = input.substring(0,beginIndex);
        String secondPart=input.substring(endIndex);

        return  firstPart+secondPart;
    }
}
