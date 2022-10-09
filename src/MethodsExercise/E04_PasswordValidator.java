package MethodsExercise;

import java.util.Locale;
import java.util.Scanner;

public class E04_PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String passwordInput = scanner.nextLine();
//  6 – 10 characters (inclusive)
        int length = passwordInput.length();
//  Have at least 2 digits
        int countDigit = countOfDigits(passwordInput);
//                •	Consists only of letters and digits;
        boolean digitNums = justDigitAndLetters(passwordInput);
//                If a password is valid, print "Password is valid".
        if (digitNums && (countDigit >= 2) && (length > 5 && length <= 10)) {
            System.out.println("Password is valid");
        } else {
            if (length < 6 || length > 11) {
                System.out.println("Password must be between 6 and 10 characters");
            }if (!digitNums){
                System.out.println("Password must consist only of letters and digits");
            }if(countDigit<2){
                System.out.println("Password must have at least 2 digits");
            }
        }

    }

    private static int countOfDigits(String passwordInput) {
        int count = 0;
        for (int i = 0; i < passwordInput.length(); i++) {
            int current = passwordInput.charAt(i);
            if (current > 47 && current <= 57) {
                count++;
            }
        }
        return count;
    }

    private static boolean justDigitAndLetters(String passwordInput) {
        boolean noNumberNoLetter = true;
        for (int i = 0; i < passwordInput.length(); i++) {
            passwordInput = passwordInput.toLowerCase();
            int current = passwordInput.charAt(i);
            if ((current > 47 && current <= 57) || (current > 96 && current <= 122)) {

            } else {
                noNumberNoLetter = false;
            }
        }
        return noNumberNoLetter;
    }


}

