package ConditionalStatements;

import java.util.Scanner;

public class E02BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double poits = Double.parseDouble(scanner.nextLine());
        double result = 0;
        double bonus = 0;
        if (poits <= 100) {
            bonus = 5;
            if (poits % 2 == 0) {
                bonus += 1;
            }
            if (poits % 10 == 5) {
                bonus += 2;
            }
            System.out.println(bonus);
            System.out.println(bonus + poits);
        } else if (poits > 100 && poits <= 1000) {
            bonus = poits * 0.2;
            if (poits % 2 == 0) {
                bonus += 1;
            }
            if (poits % 10 == 5) {
                bonus += 2;
            }
            System.out.println(bonus);
            System.out.println(bonus + poits);
        }else if (poits > 1000) {
            bonus = poits * 0.1;
            if (poits % 2 == 0) {
                bonus += 1;
            }
            if (poits % 10 == 5) {
                bonus += 2;
            }
            System.out.println(bonus);
            System.out.println(bonus + poits);
        }

    }
}
