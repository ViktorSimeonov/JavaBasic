package ITTalentsLesson2;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert a word ");
        //how to read first char from input
        char firstChar = scanner.next().charAt(0);
        System.out.println(firstChar);
    }

}
