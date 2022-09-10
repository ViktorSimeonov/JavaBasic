package WhileLoop;

import java.util.Scanner;

public class L01ReadBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String words = scanner.nextLine();
        while (!words.equals("Stop")) {
            System.out.println(words);
            words = scanner.nextLine();
        }
        System.out.println("Someone wrote STOP");
    }
}
