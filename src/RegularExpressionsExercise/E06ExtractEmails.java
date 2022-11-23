package RegularExpressionsExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E06ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String regex="(?<user>[A-Za-z0-9]+[.\\\\_\\\\-]?[A-Za-z0-9]+)[@](?<host>[A-Za-z0-9]+[.][A-Za-z0-9]+[.]?[A-Za-z0-9]+)";

        //String  regex ="[A-Za-z0-9]+[._-]?[A-Za-z0-9]+@[A-Za-z]+-?[A-Za-z]+(\\.[A-Za-z]+-?[A-Za-z]+)+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()){
            System.out.printf("%s@%s%n",matcher.group("user"),matcher.group("host"));
        }


    }
}
