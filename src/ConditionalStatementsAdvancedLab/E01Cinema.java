package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class E01Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeProjection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());
        double price = 0;
        if(typeProjection.equals("Premiere")){
            price=12.00;
        } else if (typeProjection.equals("Normal")) {
            price=7.50;
        } else if (typeProjection.equals("Discount")) {
            price=5.00;
        }
        System.out.printf("%.2f leva",rows*columns*price);

    }
}
