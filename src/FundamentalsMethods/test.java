package FundamentalsMethods;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        makeTheSum(first,second);

    }

    private static void makeTheSum(int first, int second) {
        System.out.println(first+second);
    }


}
