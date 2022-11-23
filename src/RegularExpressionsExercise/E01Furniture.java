package RegularExpressionsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E01Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> furnitureList = new ArrayList<>();//мебелите
        double totalSum = 0;// изхарчена сума

        String regex = ">>(?<furniture>[A-Za-z]+)<<(?<price>[0-9]+\\.?[0-9]*)!(?<quantity>[0-9]+)";
        Pattern pattern = Pattern.compile(regex);
        String input = scanner.nextLine();

        while (!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);
            if(matcher.find()){
                String furniture = (matcher.group("furniture"));
                furnitureList.add(furniture);
                totalSum=totalSum+(Double.parseDouble(matcher.group("price"))*Integer.parseInt(matcher.group("quantity")));
            }

            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        for (String s : furnitureList) {
            System.out.println(s);
        }
        System.out.printf("Total money spend: %.2f%n",totalSum);
    }
}
