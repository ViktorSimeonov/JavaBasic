package FundamentalsBasicSyntaxExercise;

import java.util.Scanner;

public class E05_Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        String passWord = "";
        for (int i = userName.length() - 1; i >= 0; i--) {
            char reverse = userName.charAt(i);
            passWord += reverse;
        }
        String newInput = scanner.nextLine();
        int count = 0;
        boolean isBlocked = false;
        while (!newInput.equals(passWord)) {
            if (count == 3) {
                System.out.printf("User %s blocked!", userName);
                isBlocked = true;
                break;
            }
            System.out.println("Incorrect password. Try again.");
            count++;
            newInput = scanner.nextLine();
        }
        if (!isBlocked) {

            System.out.printf("User %s logged in.", userName);
        }

    }
}
