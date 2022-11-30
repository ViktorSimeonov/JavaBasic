package ExamPreparation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E02FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // String regex = "@#+[A-Z]+[a-z0-9A-z]{4,}[A-z]@#+";
        //String regex = "@#+[A-z]+[a-z0-9A-z]{4,}[A-z]@#+";
        String regex = "@#+[A-Z][A-Za-z0-9]{4,}[A-Z]@#+";
        Pattern pattern = Pattern.compile(regex);
        int count = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < count; i++) {
            String barcode = scanner.nextLine();
            Matcher matcher = pattern.matcher(barcode);
            if (matcher.find()) {
                StringBuilder group = new StringBuilder();
                for (int j = 0; j < barcode.length(); j++) {
                    char currentChar = barcode.charAt(j);
                    if (Character.isDigit(currentChar)) {
                        group.append(currentChar);
                    }
                }
                //String toPrint = group.toString();
                if (group.length() == 0) {
                    System.out.printf("Product group: 00%n");
                } else {
                    System.out.printf("Product group: %s%n", group.toString());

                }
            } else {
                System.out.println("Invalid barcode");
            }
        }


    }
}
