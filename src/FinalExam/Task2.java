package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//02. Encrypting Password
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // String password="";
        int num = Integer.parseInt(scanner.nextLine());
        //([\Wa-zA-z]+)>(?<first>[0-9]{3})\|(?<second>[a-z]{3})\|(?<third>[A-Z]{3})\|(?<fourth>[\WA-za-z]{3})<\1
        // moq ([\Wa-zA-z]+)>(?<first>[0-9]{3})(\|)(?<second>[a-z]{3})\3(?<third>[A-Z]{3})\3(?<fourth>[\WA-za-z]{3})<\1
        String regex = "([\\Wa-zA-z]+)>(?<first>[0-9]{3})(\\|)(?<second>[a-z]{3})\\3(?<third>[A-Z]{3})\\3(?<fourth>[\\WA-za-z]{3})<\\1";
       for (int i = 0; i < num; i++) {
           String password = scanner.nextLine();
            Pattern pattern =Pattern.compile(regex);
            Matcher matcher = pattern.matcher(password);

            if (matcher.find()){
                System.out.println("Password:"+" "+matcher.group("first")+matcher.group("second")
                        +matcher.group("third")+matcher.group("fourth"));

            }else {
                System.out.println("Try another password!");
            }
        }

    }
}
