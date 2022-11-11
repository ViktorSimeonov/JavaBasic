package TextProcessing;

import java.util.Scanner;

public class L02RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        String newOutput = "";
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length(); j++) {
                newOutput=newOutput+input[i];
            }
        }
        System.out.println(newOutput);
    }
}
