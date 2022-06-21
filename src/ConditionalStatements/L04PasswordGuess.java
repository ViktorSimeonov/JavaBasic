package ConditionalStatements;

import java.util.Scanner;

public class L04PasswordGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pass = scanner.nextLine();
        String ourPass = "s3cr3t!P@ssw0rd";
        if ( ourPass.equals(pass)){
            System.out.println("Welcome");
        }else
            System.out.println("Wrong password!");
    }
}
