package ExamPreparation;

import java.util.Scanner;

public class E011PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        String input = scanner.nextLine();
        while (!input.equals("Done")) {
            String[] command = input.split(" ");
            String newPassword = "";
            switch (command[0]) {
                case "TakeOdd":
                    // char[] charPassword = password.toCharArray();

                    for (int i = 1; i < password.length(); i = i + 2) {
                        char newPass = password.charAt(i);
                        newPassword += newPass;
                    }
                    password = newPassword;
                    System.out.println(password);
                    break;
                case "Cut":
                    String passWordToCut = password;
                    password =passWordToCut.substring(0,Integer.parseInt(command[1]));
                    password +=passWordToCut.substring((Integer.parseInt(command[1])+Integer.parseInt(command[2])),passWordToCut.length());

                    //password = password.substring(Integer.parseInt(command[1]), Integer.parseInt(command[2]));


                    System.out.println(password);
                    break;
                case "Substitute":
                    int index = password.indexOf(command[1]);
                    boolean toReplace = false;
                    while (index != -1) {
                        password = password.replace(command[1], command[2]);
                        index = password.indexOf(command[1]);
                        toReplace = true;
                    }
                    if (toReplace) {
                        System.out.println(password);
                    } else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.printf("Your password is: %s",password);
    }
}
