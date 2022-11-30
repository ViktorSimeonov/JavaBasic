package ExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E012AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        // това е регекса който в https://regex101.com/ работи прекрасно
       // String regex = "(\\|#)(?<name>[A-Za-z\\s]+)\1(?<date>[0-9]{2}/[0-9]{2}/[0-9]{2})\1(?<calories>[0-9]+)\1";
        //"(\\||#)(?<name>[A-Za-z\\s]+)\1(?<date>[0-9]{2}/[0-9]{2}/[0-9]{2})\1(?<calories>[0-9]+)\1"

        //IntelliJ IDEA 2022.1.2 (Community Edition)
        //Build #IC-221.5787.30, built on May 31, 2022
        //Runtime version: 11.0.15+10-b2043.56 amd64
        //VM: OpenJDK 64-Bit Server VM by JetBrains s.r.o.
        //Windows 10 10.0
        //GC: G1 Young Generation, G1 Old Generation
        //Memory: 1948M
        //Cores: 16
        //Non-Bundled Plugins:
        //    com.vermouthx.idea (1.14.0)
        //
        //Kotlin: 221-1.6.21-release-337-IJ5787.30
        //това е regex на Деси от лекцията, който https://regex101.com/ не ми работи но тук е о.к.
        String regex = "(#|\\|)(?<foodName>[A-Za-z\\s]+)\\1(?<expirationDate>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<calories>[0-9]+)\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        List<String> food = new ArrayList<>();
        StringBuilder foodString = new StringBuilder();
        int allCalories = 0;
        while (matcher.find()) {
            String foodName = matcher.group("foodName");
            String expireDate = matcher.group("expirationDate");
            String calories = matcher.group("calories");
            allCalories+=Integer.parseInt(calories);
            foodString.append("Item: ");
            foodString.append(foodName);
            foodString.append(", Best before: ");
            foodString.append(expireDate);
            foodString.append(", Nutrition: ");
            foodString.append(calories);
            food.add(foodString.toString());
            foodString = new StringBuilder();
        }
        System.out.printf("You have food to last you for: %d days!%n",(allCalories/2000));
        for (String s : food) {
            System.out.println(s);
        }
    }
}
