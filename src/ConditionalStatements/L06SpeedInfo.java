package ConditionalStatements;

import java.util.Scanner;

public class L06SpeedInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*При скорост до 10 (включително) отпечатайте "slow"

· При скорост над 10 и до 50 (включително) отпечатайте "average"

· При скорост над 50 и до 150 (включително) отпечатайте "fast"

· При скорост над 150 и до 1000 (включително) отпечатайте "ultra fast"

· При по-висока скорост отпечатайте "extremely fast"*/
        double num = Double.parseDouble(scanner.nextLine());
        if (num <= 10) {
            System.out.println("slow");
        } else if (num <= 50) {
            System.out.println("average");
        } else if (num <= 150) {
            System.out.println("fast");
        } else if (num <= 1000) {
            System.out.println("ultra fast");
        }else
            System.out.println("extremely fast");
    }
}
