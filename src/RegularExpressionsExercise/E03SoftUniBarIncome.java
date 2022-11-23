package RegularExpressionsExercise;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E03SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String regex  ="%(?<customer>[A-Z][a-z]*)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<quantity>\\d)[^|$%.]*\\|(?<price>[0-9]+.[0-9]+)\\$";
        String regex    ="%(?<customer>[A-Z][a-z]*)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<quantity>[0-9]+)\\|[^|$%.]*?(?<price>[0-9]+\\.?[0-9]*)\\$";
        Pattern pattern = Pattern.compile(regex);
        String input = scanner.nextLine();
        double incomes = 0;
        while (!input.equals("end of shift")) {
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String customer = matcher.group("customer");
                String product =matcher.group("product");
                int count = Integer.parseInt(matcher.group("quantity"));
                double price = Double.parseDouble(matcher.group("price"));
                double totalPrice = count*price;
                incomes+=totalPrice;
                System.out.printf("%s: %s - %.2f%n",customer,product,totalPrice);

            }
            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f",incomes);

    }
}
