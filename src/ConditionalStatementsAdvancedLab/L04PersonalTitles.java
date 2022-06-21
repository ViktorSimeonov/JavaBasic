package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class L04PersonalTitles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double old = Double.parseDouble(scanner.nextLine());
        String sex = scanner.nextLine();
        if (sex.equals("m")) {
            if (old >= 16) {
                System.out.println("Mr.");
            } else {
                System.out.println("Master");
            }

        } else if (sex.equals("f")) {
            if (old >= 16) {
                System.out.println("Ms.");
            } else {
                System.out.println("Miss");
            }
        }
    }
}
