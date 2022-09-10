package WhileLoop;

import java.util.Scanner;

public class L02PassWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*Напишете програма, която първоначално прочита име и парола на потребителски профил. След това чете парола за вход.
•	при въвеждане на грешна парола: потребителя да се подкани да въведе нова парола.
•	при въвеждане на правилна парола: отпечатваме "Welcome {username}!".*/
        String userName = scanner.nextLine();
        String passWord = scanner.nextLine();
        while (!passWord.equals("")){}
    }
}
